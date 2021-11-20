<?php
$countries = ["America","Japan","China","Korea"];
echo $countries[0].'<br>';
var_dump($countries).'<br>';
echo '<br>';
$fruits = ["apple" => "りんご","orange" => "みかん","grape"=>"ぶどう"];
var_dump($fruits);
$fruits["peach"] = "もも";
echo '<br>';
var_dump($fruits).'<br>';
echo '<br>';
$color = ["red"=>"赤", "blue"=>"青", "green"=>"緑"];
var_dump($color);
$color["yellow"] = "黄色";
echo '<br>';
var_dump($color);

?>