package reidai;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Curriculum {
	public static void main(String[] args) {
		HashSet<String> sampleSet1 = new HashSet<String>();
		//適当な値を入れていく
		sampleSet1.add("asda");
		sampleSet1.add("sgfd");
		sampleSet1.add("sdfs");
		sampleSet1.add("gfdkcds");

		System.out.println("HashSetなのでランダムで表示される");
		for(String s1 : sampleSet1){
			System.out.println(s1);
		}

		TreeSet<String> sampleSet2 = new TreeSet<String>();
		sampleSet2.add("A");
		sampleSet2.add("B");
		sampleSet2.add("C");
		sampleSet2.add("D");

		System.out.println("TreeSetを使っているので昇降順に表示される");
		for (String s2 : sampleSet2) {
			System.out.println(s2);

		}
		LinkedHashSet<String> sampleSet3 = new LinkedHashSet<String>();
		sampleSet3.add("AHGSHGS");
		sampleSet3.add("QPPQPQP");
		sampleSet3.add("JKJKKJK");
		sampleSet3.add("jfksfjkls");

		System.out.println("LinkedHashSetなので追加した順に表示");
		for(String s3 : sampleSet3) {
			System.out.println(s3);
		}

		TreeSet<String> sampleSet4 = new TreeSet<String>();

        //適当に値を入れていく
        sampleSet4.add("A");
        sampleSet4.add("D");
        sampleSet4.add("D");
        sampleSet4.add("D");
        sampleSet4.add("B");
        sampleSet4.add("C");
        System.out.println("同じ値は格納できないから「D」は一つとして考えるよ");

        for (String s4 : sampleSet4) {
            System.out.println(s4);
        }
	}

}
