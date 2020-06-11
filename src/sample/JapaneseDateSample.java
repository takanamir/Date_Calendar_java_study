package sample;

import java.time.chrono.JapaneseDate;
import java.time.chrono.JapaneseEra;
import java.time.format.DateTimeFormatter;

// 和暦の対応
public class JapaneseDateSample {
	public static void main(String[] args) {
		// 西暦を和暦に変換する
		JapaneseDate jDate1 = JapaneseDate.of(2017, 2, 4);
		System.out.println(jDate1);
		
		JapaneseDate jDate2 = JapaneseDate.of(JapaneseEra.SHOWA, 59, 2, 4);
		System.out.println(jDate2);
		
		// 和暦を利用した日付の文字列表現と日付クラスとの相互変換
		JapaneseDate jDate3 = JapaneseDate.of(2019, 3, 6);
		System.out.println(DateTimeFormatter.ofPattern("GGGGy年M月d日").format(jDate3));
	}
}