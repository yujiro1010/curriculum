<?php
$n = 1;
$saikoro = 0;
while($saikoro < 40){
    $saikoro += mt_rand(1,6);
    echo $n."回目＝".$saikoro.'<br>';
    if($saikoro >= 40){
        echo "合計".$n.'回目でゴールしました';
    }
    $n++;
}
?>