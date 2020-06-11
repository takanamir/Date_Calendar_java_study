package sample;

import java.util.Calendar;
import java.util.Date;

// DateクラスからCalendarクラスへの変換
public class DateToCalendarConverter {
	public static void main(String[] args) {
		Date date = new Date(); // 今日の日付
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		
		System.out.println(calendar);
	}
}