<?php

function getTriangleArea($base,$height){
    $area = $base * $height / 2;
    print "三角形の面積は".$area."だよ。".'<br>';
}

getTriangleArea(10,5);
getTriangleArea(15,8);
getTriangleArea(8,6);

function getTyokuhou($tate,$yoko,$height){
    $area = $tate * $yoko * $height;
    print "直方体の体積は".$area."だよ。";
}
getTyokuhou(5,10,8);

?>