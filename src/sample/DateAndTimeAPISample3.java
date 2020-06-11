package sample;

import java.time.LocalDateTime;

// 年月日の各フィールドの値を個別に取得する
public class DateAndTimeAPISample3 {
	public static void main(String[] args) {
		LocalDateTime dateTime = LocalDateTime.of(2019, 3, 4, 15, 12, 20, 678_000_000);
		
		System.out.println("年      " + dateTime.getYear());
		System.out.println("月(Enum)" + dateTime.getMonth());
		System.out.println("月(数字)" + dateTime.getMonthValue());
		System.out.println("日      " + dateTime.getDayOfMonth());
		System.out.println("時      " + dateTime.getMinute());
		System.out.println("分      " + dateTime.getHour());
		System.out.println("秒      " + dateTime.getSecond());
		System.out.println("ナノ秒  " + dateTime.getNano());
	}
}