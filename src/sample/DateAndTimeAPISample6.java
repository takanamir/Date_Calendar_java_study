package sample;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAccessor;

// Date and Time API で日付/時間クラスと文字列を相互変換する
public class DateAndTimeAPISample6 {
	public static void main(String[] args) {
		// 日付/時間クラスを任意の形式で文字列出力する
		LocalDateTime dateTime1 = LocalDateTime.now();
		System.out.println(DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss").format(dateTime1));
		
		// 文字列で表現された日付を日付/時間クラスに変換する
		TemporalAccessor parsed = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss")
				.parse("2018/04/08 19:30:40");
		LocalDateTime dateTime2 = LocalDateTime.from(parsed);
		System.out.println(dateTime2);
		System.out.println(DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss").format(dateTime2));
	}
}