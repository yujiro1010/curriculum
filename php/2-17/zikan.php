<?php
date_default_timezone_set('Asia/Tokyo');
$now_time = date("H",time());
echo "今".$now_time."時です。".'<br>';
if(7<=$now_time && $now_time<=11){
    echo "おはよう";
}else if(12<=$now_time && $now_time<=18){
    echo "こんにちは";
}else if(19<=$now_time && $now_time<=23){
    echo "こんばんわ";
}else{
    echo "おやすみ";
}
?>