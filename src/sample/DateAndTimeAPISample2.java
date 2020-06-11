package sample;

import java.time.LocalDateTime;
import java.time.Month;

public class DateAndTimeAPISample2 {
	public static void main(String[] args) {
		// 現在の日時を指定する
		System.out.println(LocalDateTime.now());
		
		// 年、月、日、時、分、秒を指定する
		System.out.println(LocalDateTime.of(2017, Month.JANUARY, 1, 11, 23, 45));
		System.out.println(LocalDateTime.of(2019, 3, 4, 15, 12, 20, 678_000_000));
		
		// 日付文字列を指定する
		System.out.println(LocalDateTime.parse("2020-05-06T02:23:34.567"));
	}
}