<?php
$x = 5.2;
//切り上げ
echo "切り上げ ".ceil($x).'<br>';
//切り捨て
echo "切り捨て ".floor($x).'<br>';
//四捨五入
echo "四捨五入 ".round($x).'<br>';
//円周率
echo pi().'<br>';
function circleArea($r){
    $circle_area = $r * $r * pi();
    echo $circle_area;
}
circleArea(2);
echo '<br>';
//乱数
echo "乱数 ".mt_rand(1,100).'<br>';
//文字列の長さ
$str = "hogehoge";
echo "文字列の長さ ".strlen($str).'<br>';
$str = "あいうえお";
echo "日本語の長さ ".strlen($str).'<br>';
echo "日本語の長さマルチバイト対応 ".mb_strlen($str).'<br>';
//検索
$str = "yoneyama";
echo "検索 ".strpos($str,"o").'<br>';
//文字列の切り取り substr(対象の文字列, 開始位置, 文字数)
$str = "yoneyama";
echo "切り取り ".substr($str,-2,2).'<br>';
//置換 str_replace(置き換える前の文字列, 置き換えた後の文字列, 対象の文字列)
echo "置換 ".str_replace("neya","NEYA",$str).'<br>';
//printf %s=文字列 %d=数値
$name = "米山さん";
$limit_number = 40;
$price = 4000;
echo $name."の残り時間は".$limit_number."時間です".'<br>';
printf("%sの残り時間は%03d時間で超えると%d円の罰金です", $name, $limit_number, $price);
echo '<br>';
//sprintf フォーマット化のみで出力なし
$limit_hour = 4;
$limit_minute = 5;
$limit_time =sprintf("残り%02d時間%02d分です。", $limit_hour, $limit_minute);
echo $limit_time;


?>