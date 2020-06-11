package sample;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class CalendarDemo {
	public static void main(String args[]) {
		String months[] = { "1月", "2月", "3月", "4月", "5月", "6月", "7月", "8月", "9月", "10月", "11月", "12月" };

		int year;
		GregorianCalendar gcalendar = new GregorianCalendar();

		System.out.print("日付： ");
		System.out.print(year = gcalendar.get(Calendar.YEAR));
		System.out.print("年 ");
		System.out.print(months[gcalendar.get(Calendar.MONTH)]);
		System.out.println(" " + gcalendar.get(Calendar.DATE) + "日");

		System.out.print("現在時刻： ");
		System.out.print(gcalendar.get(Calendar.HOUR) + ":");
		System.out.print(gcalendar.get(Calendar.MINUTE) + ":");
		System.out.println(gcalendar.get(Calendar.SECOND));

		// うるう年のチェック						
		if (gcalendar.isLeapYear(year)) {
			System.out.println("今年はうるう年です");
		} else {
			System.out.println("今年はうるう年ではありません");
		}
	}
}