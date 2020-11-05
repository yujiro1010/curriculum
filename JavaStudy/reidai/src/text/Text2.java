package text;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Text2 {
	public static void main(String[] args) throws ParseException {

		SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy/MM/dd hh:mm:ss");
		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy");
		Date date = new Date();
		System.out.println(sdf1.format(date));
		// 現在時刻が出力されます
		System.out.println(sdf2.format(date));
		// 年のみ出力されます
	}

}
