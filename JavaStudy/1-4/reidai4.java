// 年齢
int age = 24;
// 学生かどうか 
boolean is_student = false;
// もし、年齢が25歳未満 かつ 学生 の場合、"学割パックが使えるよ"と表示 
if(age < 25 && is_student ){
    System.out.println("学生パックが使えるよ");
}
// でももし、年齢が25歳未満の場合、"若者応援割引が使えるよ"と表示 
else if( age < 25){
    System.out.println("若者応援割引が使えるよ");
}