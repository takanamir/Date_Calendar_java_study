package sample;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

public class ObtainDate {
	public static void main(String[] args) {
		ObtainDate obtainDate = new ObtainDate();
		TimeZone timeZone = TimeZone.getTimeZone("Asia/Tokyo");
		String dateFormat = "G yyyy MMMM dd";
		String timeFormat = "zzzz a hh:mm:ss.SSS";
		String dayFormat = "EEEEEE";
		System.out.println("今日は何曜日？" + obtainDate.getTodaysDay(dayFormat, timeZone));
		System.out.println("今日は何日？" + obtainDate.getTodayDate(dateFormat, timeZone));
		System.out.println("今は何時？" + obtainDate.getCurrentTime(timeFormat, timeZone));
	}

	public String getTodaysDay(String dayFormat, TimeZone timeZone) {
		Date date = new Date();
		DateFormat requiredFormat = new SimpleDateFormat(dayFormat);
		requiredFormat.setTimeZone(timeZone);
		String strCurrentDay = requiredFormat.format(date).toUpperCase();
		return strCurrentDay;
	}

	public String getCurrentTime(String timeFormat, TimeZone timeZone) {
		DateFormat dateFormat = new SimpleDateFormat(timeFormat);
		Calendar cal = Calendar.getInstance(timeZone);
		dateFormat.setTimeZone(cal.getTimeZone());
		String currentTime = dateFormat.format(cal.getTime());
		return currentTime;
	}

	public String getTodayDate(String dateFormat, TimeZone timeZone) {
		Date todayDate = new Date();
		DateFormat todayDateFormat = new SimpleDateFormat(dateFormat);
		todayDateFormat.setTimeZone(timeZone);
		String strTodayDate = todayDateFormat.format(todayDate);
		return strTodayDate;
	}
}