package sample;

import java.util.Date;

public class DateSample {
	public static void main(String[] args) {
		Date now = new Date();
		System.out.println(now);

		// 時刻を指定してDateクラスのインスタンスを生成する	
		// 1970年1月1日午前0時から5000ミリ秒経過した時刻	
		Date date = new Date(5000);
		System.out.println(date);
	}
}