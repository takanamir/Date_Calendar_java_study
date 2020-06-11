package sample;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

/**
 *  RDBレコードのコレクションへの格納を確認するクラス
 */
public class RdbToCollectionDateTester {
	/**
	 *  一覧取得を実行する
	 *  @param args コマンドラインパラメータ
	 */
	public void select(String[] args) {
		try {
			// データベース接続
			Class.forName("org.gjt.mm.mysql.Driver");
			Connection con = DriverManager.getConnection(
					"jdbc:mysql://localhost/date_time_test?useUnicode=true&characterEncoding=MS932", "root", "root");
			Statement stmt = con.createStatement();
			
			// SELECT発行
			ResultSet result = stmt.executeQuery("select * from date_time_table;");
			// SELECTした列の定義情報
			ResultSetMetaData metaData = result.getMetaData();
			// SELECTした列の数
			int columnSize = metaData.getColumnCount();
			// 全レコードを格納するためのリスト
			List records = new ArrayList();

			// 取得できたレコード数分
			while (result.next()) {
				// 1レコード分をマップに格納する
				Map record = new HashMap();
				// 列の数だけ
				for (int i = 1; i <= columnSize; i++) {
					String key = metaData.getColumnName(i);
					String value = result.getString(i);
					// 列名をキーとする
					record.put(key, value);
				}
				// リストに追加する
				records.add(record);
			}

			// 全レコードの内容(マップ)を画面に表示する
			Iterator all = records.iterator();
			while (all.hasNext()) {
				Map record = (Map) all.next();
				System.out.println(record);
			}

			// データベース切断
			con.close();

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	/**
	 *  挿入(現在時刻)を実行する
	 *  @param args コマンドラインパラメータ
	 */
	public void insert(String[] args) {
		try {
			// データベース接続
			Class.forName("org.gjt.mm.mysql.Driver");
			Connection con = DriverManager.getConnection(
					"jdbc:mysql://localhost/date_time_test?useUnicode=true&characterEncoding=MS932", "root", "root");
			Statement stmt = con.createStatement();

			// INSERT発行
			String insertSql = "insert into date_time_table(date_time) values ('" + getNowDateTime() + "')";
			stmt.executeUpdate(insertSql);

			System.out.println("挿入しました");

			// データベース切断
			con.close();

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	/**
	 *  削除(いちばん古いもの)を実行する
	 *  @param args コマンドラインパラメータ
	 */
	public void delete(String[] args) {
		try {
			// データベース接続
			Class.forName("org.gjt.mm.mysql.Driver");
			Connection con = DriverManager.getConnection(
					"jdbc:mysql://localhost/date_time_test?useUnicode=true&characterEncoding=MS932", "root", "root");
			Statement stmt = con.createStatement();
			
			int minId = 1;

			// 最小のIDを発行
			String minIdSql = "select min(id) as min_id from date_time_table";
			ResultSet resultMinId = stmt.executeQuery(minIdSql);
			
			while(resultMinId.next()) {
				minId = resultMinId.getInt("min_id");
			}

			// DELETE発行
			String deleteSql = "delete from date_time_table where id = " + minId;
			stmt.executeUpdate(deleteSql);

			System.out.println("削除しました");

			// データベース切断
			con.close();

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	/**
	 * メインメソッド
	 * @param args コマンドラインパラメータ
	 */
	public static void main(String[] args) {
		RdbToCollectionDateTester tester = new RdbToCollectionDateTester();
		Scanner scn = new Scanner(System.in);
		int retry;

		do {
			System.out.println("モードを選んでください。(1)一覧取得 (2)挿入 (3)削除");
			int mode = scn.nextInt();
			switch (mode) {
			case 1:
				tester.select(args);
				break;
			case 2:
				tester.insert(args);
				break;
			case 3:
				tester.delete(args);
				break;
			default:
				System.out.println("1から3を入力してください");
			}
			System.out.print("もう一度しますか（1…はい／0…いいえ）：");
			retry = scn.nextInt();
		} while (retry == 1);
		System.out.println("終了します");
		scn.close();
	}

	/**
	 * 現在日時をyyyy/MM/dd HH:mm:ss形式で取得する
	 */
	private static String getNowDateTime() {
		final DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		final Date date = new Date(System.currentTimeMillis());
		return df.format(date);
	}
}