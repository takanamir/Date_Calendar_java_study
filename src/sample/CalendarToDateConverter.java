package sample;

import java.util.Calendar;
import java.util.Date;

// CalendarクラスからDateクラスへの変換
public class CalendarToDateConverter {
	// Calendarクラスのメソッドを利用する
	Calendar calendar1 = Calendar.getInstance();
	Date date1 = calendar1.getTime();
	
	// 1970年1月1日午前0時からの経過時間(ミリ秒)を用いる
	Calendar calendar2 = Calendar.getInstance();
	Date date2 = new Date(calendar2.getTimeInMillis());
}