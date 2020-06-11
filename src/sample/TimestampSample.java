package sample;

import java.sql.Timestamp;
import java.util.Date;

public class TimestampSample {
	public static void main(String[] args) {
		Date date = new Date();
		long time = date.getTime();
		Timestamp ts = new Timestamp(time);
		System.out.println("現在時刻： " + ts);
	}
}