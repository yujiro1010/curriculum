<?php
$testFile = "test.txt";
$contents = "こんにちは";

if(is_writable($testFile)){
    //対象のファイルを開く
    $fp = fopen($testFile,"w");
    //対象のファイルに書き込む
    fwrite($fp,$contents);
    //ファイルを閉じる
    fclose($fp);
    //書き込みした旨の表示
    echo "finish writing!!";
}else{
    echo "not writable!";
    exit;
}
echo '<br>';

$test_file = "test2.txt";
if(is_readable($test_file)){
    //対象のファイルを開く
    $fp = fopen($test_file,"r");
    //開いたファイルから1行ずつ読み込む
    while($line = fgets($fp)){
        echo $line.'<br>';
    }
    fclose($fp);
}else{
    //読み込み不可の時の処理
    echo "not writable!!";
    exit;
}

$name = "test3.txt";
$first_name = "牧野";
$last_name = "祐介";
if(is_writable($name)){
    $fp = fopen($name,"a");
    fwrite($fp,$first_name);
    fwrite($fp,$last_name);
    if(is_readable($name)){
        $fp = fopen($name,"r");
        while($line = fgets($fp)){
            echo $line.'<br>';
        }
    }
    fclose($fp);
}else{
    echo "not writable!";
    exit;
}
?>