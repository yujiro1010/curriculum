<?php
$my_name = $_POST['my_name'];
$email = $_POST['email'];
$password = $_POST['password'];
var_dump($_POST);
?>
<p>私の名前は、<?php echo $my_name; ?></p>
<p>私のアドレスは、<?php echo $email; ?></p>
<p>私のパスワードは、<?php echo $password; ?></p>