package sample;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateOfString {
	public static void main(String[] args) {
		Date d = new Date();
		System.out.println(d);

		SimpleDateFormat d1 = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		String c1 = d1.format(d);
		System.out.println(c1);

		SimpleDateFormat d2 = new SimpleDateFormat("yyyy年MM月dd日HH時mm分ss秒");
		String c2 = d2.format(d);
		System.out.println(c2);
	}
}