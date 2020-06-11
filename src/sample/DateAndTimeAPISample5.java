package sample;

import java.time.LocalDateTime;

// 年月日の計算
public class DateAndTimeAPISample5 {
	public static void main(String[] args) {
		LocalDateTime dateTime = LocalDateTime.of(2019, 3, 4, 15, 12, 20);

		// 100日後
		System.out.println("100日後: " + dateTime.plusDays(100));

		// 100日前
		System.out.println("100日前: " + dateTime.minusDays(100));
		
		// 30秒前
		System.out.println("30秒前: " + dateTime.minusSeconds(30));
		
		// 元のインスタンスの値
		System.out.println("元の値: " + dateTime);
	}
}