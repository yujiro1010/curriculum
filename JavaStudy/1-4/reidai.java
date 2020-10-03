// int型の変数oldに25を代入
int old = 25;
// もし、20歳以上の場合は、"酒が飲めるぞ！"と表示
if( old >= 20){
    System.out.println("酒が飲めるぞ！");

// でももし、19歳の場合は、"あと一年で酒が飲める！！"と表示
}else if( old == 19){
    System.out.println("あと一年で酒が飲める！");

// それ以外の場合は、"まだまだ酒が飲めない・・・"と表示 
}else( old < 20 ){
    System.out.println("まだまだ酒が飲めない・・・");
}