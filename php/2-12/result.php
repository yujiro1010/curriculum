<?php
$my_name = $_POST['my_name'];
$password = $_POST['password'];
$sex = $_POST['sex'];
$hidden_param = $_POST['hidden_param'];
$age = $_POST['age'];
$age2 = $_POST['age2'];
$name = $_POST['name'];
$syohin = $_POST['syohin'];
$kazu = $_POST['kazu'];
?>
<p>私の名前は、<?php echo $my_name; ?>です。</p>
<p>パスワードは、<?php echo $password; ?>です。</p>
<p>性別は、<?php echo $sex ?>です。</p>
<p>性別は、<?php echo $hidden_param ?>です。</p>
<p>年齢は、<?php echo $age ?>です。</p>
<p>本当の年齢は、<?php echo $age2 ?>です。</p>
<br>
<p>お名前：<?php echo $name ?></p>
<p>ご希望景品<?php echo $syohin ?></p>
<p>個数：<?php echo $kazu ?></p>

<br>

