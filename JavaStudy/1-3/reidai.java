//算術演算子
int i = 0
// 10 と 5 を加算した結果（15）を、変数「ｉ」に代入
i = 10 + 5;

String a = "ABC"
String b = a + "DEF"// 変数bには、連結結果の文字列（"ABCDEF"）が保持される。

//代入演算子
int a = 10;a += 5
// 結果は15 a -= 3; 
// 結果は7 a *= 4; 
// 結果は40 a /= 2; 
// 結果は5 a %= 6; 
// 結果は4

//比較演算子
//変数「i」の値が１の場合は真(true)、１でないときは偽(false)となる
i == 1;

int i = 1;
//変数「i」の値が１の場合は真(true)、１でないときは偽(false)となる
System.out.prinln(i == 1);

i = 2;
System.out.println(i != 1);
//出力結果
true
true

//論理演算子
// 「i >= 5」と「i <= 20」のどちらも正しければ 真(true)、それ以外の場合は 
//偽(false) となる。 
int = 10
System.out.println(i >= 5 && i <= 20);

// 「a > 20」と「b < 30」のどちらかが正しければ 真(true)、
//どちらも正しくない場合は 偽(false) となる。
int a = 10;
int b = 20;
System.out.println(a > 20 || b < 30);

// 「i < 20」の結果が「!」によって否定される。
int i = 10
System.out.println(!(i < 20));
