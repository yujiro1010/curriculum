package reidai;

//utilパッケージのArrayListクラスをimport
import java.util.ArrayList;
//utilパッケージのListクラスをimport
import java.util.List;

public class ArrayMain {
	public static void main(String[] args) {
		// LinkedListを使用する場合は以下のように書きます
        // List<String> sampleList = new LinkedList<String>();

		// パターン1
		List<String> sampleList = new ArrayList<String>();
		sampleList.add("abc");
		sampleList.add("def");

		// パターン2
		sampleList = new ArrayList<String>() {
			{
				add("abc");
				add("abc");

			}
		};
		// リストに格納した全要素を順番に出力
		for(int i = 0 ; i < sampleList.size(); i++){
			System.out.println(sampleList.get(i));
		}


    }
}
