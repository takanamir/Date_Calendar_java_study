package sample;

import java.util.Calendar;

public class CalendarSample {
	public static void main(String[] args) {
		Calendar calendar = Calendar.getInstance();

		// 曜日だけを指定する
		calendar.set(Calendar.DAY_OF_WEEK, 4); // Wed
		System.out.println("曜日の指定: " + calendar.getTime());

		// 日だけを指定する
		calendar.set(Calendar.DAY_OF_MONTH, 13);
		System.out.println("日の指定: " + calendar.getTime());

		// 時だけを指定する
		calendar.set(Calendar.HOUR, 9);
		System.out.println("時の指定: " + calendar.getTime());

		// 分だけを指定する
		calendar.set(Calendar.MINUTE, 18);
		System.out.println("分の指定: " + calendar.getTime());

		// 秒だけを指定する
		calendar.set(Calendar.SECOND, 25);
		System.out.println("秒の指定: " + calendar.getTime());

		// 全部指定する
		calendar.set(2013, 9, 22, 18, 36, 42); // 2013年10月22日18時36分42秒(Tue Oct 22 18:36:42 JST 2013)
		System.out.println("全部指定: " + calendar.getTime());

		// 日を表示する
		System.out.println("日の表示: " + calendar.get(Calendar.DATE));

		// 秒を表示する
		System.out.println("秒の表示: " + calendar.get(Calendar.SECOND));

		// 年を2追加する(2年後の日時に変更する)
		calendar.add(Calendar.YEAR, 2);
		System.out.println("年の加算: " + calendar.getTime());

		// 月を2減らす(2ヶ月前の日時に変更する)
		calendar.add(Calendar.MONTH, -2);
		System.out.println("月の減算: " + calendar.getTime());
	}
}