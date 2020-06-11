package sample;

import java.time.LocalTime;
import java.time.ZoneId;

public class LocalTimeSample {
	public static void main(String... args) {
		ZoneId zone1 = ZoneId.of("Europe/Berlin");
		ZoneId zone2 = ZoneId.of("Brazil/East");
		ZoneId zone3 = ZoneId.of("Asia/Tokyo");
		LocalTime now1 = LocalTime.now(zone1);
		LocalTime now2 = LocalTime.now(zone2);
		LocalTime now3 = LocalTime.now(zone3);
		System.out.println("ベルリンの時刻： " + now1);
		System.out.println("ブラジルの時刻： " + now2);
		System.out.println("東京の時刻： " + now3);
	}
}