package sample;

import java.util.Date;

// 日時の比較
public class DateCompare {
	public static void main(String[] args) {
		Date date1 = new Date(5000);
		Date date2 = new Date(5001);

		System.out.println(date1.equals(date2)); // false
		System.out.println(date1.before(date2)); // true
		System.out.println(date1.after(date2)); // false
	}
}