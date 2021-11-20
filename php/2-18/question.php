<link rel="stylesheet" href="index.css">
<?php
//POST送信で送られてきた名前を受け取って変数を作成
$testName = $_POST['test'];
//①画像を参考に問題文の選択肢の配列を作成してください。
$port = [80,22,20,21];
$lan = ["PHP","Python","JAVA","HTML"];
$command = ["join","select","insert","update"];
//② ①で作成した、配列から正解の選択肢の変数を作成してください
$tr_port = $port[1];
$tr_lan = $lan[3];
$tr_command = $command[1]; 

?>
<form acition="answer.php" method="post">
<p>お疲れ様です<?php echo $testName ?>さん</p>
<!--フォームの作成 通信はPOST通信で-->
<h2>①ネットワークのポート番号は何番？</h2>
<!--③ 問題のradioボタンを「foreach」を使って作成する-->
<?php
foreach ($port as $portValue){
    ?><input type="radio" name="port" value="<?php echo $port; ?>">
    <?php echo $portValue;
}
?>
<h2>②Webページを作成するための言語は？</h2>
<!--③ 問題のradioボタンを「foreach」を使って作成する-->
<?php
foreach($lan as $lanValue){
    ?><input type="radio" name="lan" value="<?php echo $lan; ?>">
    <?php echo $lanValue;
}

?>
<h2>③MySQLで情報を取得するためのコマンドは？</h2>
<!--③ 問題のradioボタンを「foreach」を使って作成する-->
<?php
foreach($command as $commandValue){
    ?><input type="radio" name="command" value="<?php echo $command ?>">
    <?php echo $commandValue;
}
echo '<br>';
?>
<!--問題の正解の変数と名前の変数を[answer.php]に送る-->


    <input type="submit" value="送信">
</form>