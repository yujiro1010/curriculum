package text;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Text1 {
	public static void main(String[] args)throws ParseException {
		String dateTime = "2018/01/01 00:00:00";
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd hh:mm:ss");
		Date date = sdf.parse(dateTime);

		System.out.println(date);
	}

}


/*
 *1ユーザーが入力した日時をStringで受け取る
 *2受け取った値を SimpleDateFormat で解析してDate型に 変換
 *3変換したDate型変数から年だけを取り出し、取り出した年を用いて何らかの処理を記述する
 */