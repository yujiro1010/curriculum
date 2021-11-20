<form action="result.php" method="post">
    私の名前：<input type="text" name="my_name">
    <br>
    パスワード：<input type="password" name="password">
    <br>
    性別：
    <input type="radio" name="sex" value="男性">男性
    <input type="radio" name="sex" value="女性">女性<br>
    <input type="hidden" name="hidden_param" value="隠しパラメータから"><br>
    年齢：
    <select name="age">
        <option value="21">21</option>
        <option value="22">22</option>
        <option value="23">23</option>
        <option value="24">24</option>
    </select><br>
    本当の年齢：<select name="age2">
    <?php for($i=1;$i<=10;$i++){?>
    <option value="<?php echo $i ?>"><?php echo $i ?></option>
    <?php } ?>
    <input type="submit" value="送信するよ！"><br><br>

    お名前：<input type="text" name="name"><br>
    ご希望商品：
    <input type="radio" name="syohin" value="A賞">A賞
    <input type="radio" name="syohin" value="B賞">B賞
    <input type="radio" name="syohin" value="C賞">C賞<br>
    個数：
    <select name="kazu">
        <?php for($i=1; $i<=10; $i++){ ?>
        <option value="<?php echo $i ?>"><?php echo $i ?></option>
        <?php } ?>
    </select><br>
    <input type="submit" value="申し込み">
</form>