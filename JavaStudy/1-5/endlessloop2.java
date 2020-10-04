import java.util.Scanner; 

public class EndlessLoopSample { 
  public static void main(String[] args) { 
    int inputNum; // ユーザ入力値 
    int sum = 0; // 合計値 

    // ユーザ入力読み込みオブジェクトを生成 
    Scanner scanner = new Scanner(System.in); 

    // ユーザから「-1」が入力されるまで、入力された数値をsum変数に加算 
    while (true) { 
      // 数値を入力 
      System.out.print("数値入力（-1で終了）："); 
      inputNum = scanner.nextInt(); 

      // -1 が入力されたらループを脱出 
      if (inputNum == -1) { 
         break; 
      } 

      // 入力値をsumに加算 
      sum += inputNum; 
    } 

    // 合計値を表示 
    System.out.println("入力された数値の合計は " + sum + " です。"); 
  } 
}

//実行結果
数値入力（-1で終了）：5
数値入力（-1で終了）：2 
数値入力（-1で終了）：8 
数値入力（-1で終了）：-1 
入力された数値の合計は 15 です。
