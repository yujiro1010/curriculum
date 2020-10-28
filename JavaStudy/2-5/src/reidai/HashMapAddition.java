package reidai;

import java.util.HashMap;
import java.util.Map;


public class HashMapAddition {
	public static void main(String[] args) {
		// パターン1
		Map<String,String> sampleHashMap = new HashMap<String,String>();
		sampleHashMap.put("apple","りんご");
		sampleHashMap.put("orange","オレンジ");
		sampleHashMap.put("peach","桃");


		// パターン2
		sampleHashMap = new HashMap<String,String>() {
			{
				put("apple","りんご");
				put("orange","オレンジ");
				put("peach","桃");

			}
		};
		// キー値を指定して取得
		System.out.println(sampleHashMap.get("apple"));
		System.out.println(sampleHashMap.get("orange"));
		System.out.println(sampleHashMap.get("peach"));
		System.out.println(sampleHashMap.get("Mango"));

	}

}
