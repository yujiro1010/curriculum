<?php
//count
$members = ["tanaka","sasaki","kimura","uchida","yoshida"];
echo count($members).'<br>';
sort($members);
var_dump($members);
echo '<br>';
//配列に中にある要素が存在しているか in_array(調べたい文字もしくは数値, 対象の配列)
var_dump(in_array("tanaka", $members));
echo '<br>';
if(in_array("tanaka", $members)){
    echo "田中さんがいるよ";
}else{
    echo "田中さんはいないよ";
}
echo '<br>';
$atstr = implode("@", $members);
var_dump($atstr);
echo '<br>';
$re_member = explode("@",$atstr);
var_dump($re_member);
echo '<br>';
echo time().'<br>';
echo date("Y-m-d H:i:s",time()).'<br>';
echo date("Y年m月d日 H時i分s秒です。",time()).'<br>';
echo date("Y-m-d",strtotime("last Sunday")).'<br>';
echo date("Y-m-d h時i分s秒",strtotime("+2 day")).'<br>'

?>