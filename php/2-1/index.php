<?php
//index.php
$message = "HelloWorld";
var_dump($message);

$x = 8;
$y = 5.55;
echo '<br>';
var_dump($x);
echo '<br>';
var_dump($y);
echo '<br>';
$flag = true;
var_dump($flag);
echo '<br>';
$emp = null;
var_dump($emp);
echo '<br>';
define("ADMIN_EMAIL","y-i-group@gmail.com");
define("LIST_COUNT",15);
echo ADMIN_EMAIL;
echo '<br>';
echo LIST_COUNT;
echo '<br>';
$h = "Hello";
$w = "World";
echo $h.$w.'<br>';
echo 1 + 1 .'<br>';
echo 10 - 1 .'<br>';
echo 2 * 2 .'<br>';
echo 10 / 5 .'<br>';
echo 15 % 2 .'<br>';
$x = 10.2;
$x++;
echo $x.'<br>';
// $x = $x + 5;
$x += 5;
echo $x.'<br>';
$x *= 2;
echo $x.'<br>';

$y = 10;
$y--;
echo $y.'<br>'.'<br>';
$age = 20;
if($age >= 20){
    echo "お酒が飲める！";
}else{
    echo "お酒は二十歳になってから";
}
echo '<br>';
$is_student = true;
if($is_student){
    echo "学生です";
}
echo '<br>';
$name = "";
echo ($name != "") ? '名前を受け付けました' : '名前を入力してください';
echo '<br>';
for($num = 0;$num <= 50;$num++){
    echo $num;
    if($num % 10 == 0 && $num != 0){
        echo "　10の倍数！";  
    }
    if($num % 2 == 0 && $num != 0){
        echo "　2の倍数！";  
    }
    if($num % 3 == 0 && $num != 0){
        echo "　3の倍数！";  
    }
    if($num % 7 == 0 && $num != 0){
        echo "　7の倍数！";  
    }
     echo '<br>';
}



?>