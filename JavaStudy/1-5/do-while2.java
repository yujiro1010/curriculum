import java.util.Scanner; 

public class DoWhileSample { 
  public static void main(String[] args) { 
    int inputNum; // ユーザ入力値 
    int sum = 0; // 合計値 

    // ユーザ入力読み込みオブジェクトを生成 
    Scanner scanner = new Scanner(System.in); 

    // 初期値を入力 
    System.out.print("初期値入力："); 
    inputNum = scanner.nextInt(); 
    System.out.println("初期値は " + inputNum + " です。\n"); 

    // ユーザから「-1」が入力されるまで、入力された数値をsum変数に加算 
    do { 
      // 入力値をsumに加算 
      sum += inputNum; 

      // 加算値を入力 
      System.out.print("加算値入力（-1で終了）："); 
      inputNum = scanner.nextInt(); 

    } while (inputNum != -1); 

    // 合計値を表示 
    System.out.println("入力された数値の合計は " + sum + " です。"); 
  } 
}

//実行結果
初期値入力：50 
初期値は 50 です。 

加算値入力（-1で終了）：2 
加算値入力（-1で終了）：8 
加算値入力（-1で終了）：6 
加算値入力（-1で終了）：-1 
入力された数値の合計は 66 です。