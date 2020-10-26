package study;

public class Task extends Calculator {
	public void doTask() {
		int a = plus(10);
		System.out.println("plusメソッドの引数が一つの場合：" + a);
		int b = plus(10, 20);
		System.out.println("plusメソッドの引数が二つの場合：" + b);
		int c = plus(10, 20, 30);
		System.out.println("plusメソッドの引数が三つの場合：" + c);

	}

}