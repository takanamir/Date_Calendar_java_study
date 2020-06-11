package sample;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

// 日付クラスと文字列の相互変換
public class DateAndStringConverter {
	public static void main(String[] args) {
		// 日付クラスを任意の文字列で出力する
		Date date1 = new Date();

		// DateFormatを生成する
		DateFormat formatSample1 = new SimpleDateFormat("yyyy年MM月dd日HH時mm分ss秒");
		System.out.println(formatSample1.format(date1));

		// 文字列で表現された日付をDateクラスに変換する
		// DateFormatを生成する
		DateFormat formatSample2 = new SimpleDateFormat("yyyy年MM月dd日HH時mm分ss秒");
		
		// 文字列をDateクラスに変換する
		try {
			Date date2 = formatSample2.parse("2017年01月02日03時04分05秒");
			System.out.println(date2);
		} catch (ParseException ex) {
			System.out.println("パースエラー");
		}
	}
}