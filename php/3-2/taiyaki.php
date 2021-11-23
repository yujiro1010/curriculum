<?php
    class Taiyaki {
        public $content;
        public function __construct($nakami){
            $this->content =$nakami;
        }
        public function whatIsContent(){
            echo '中身は'.$this->content.'だよ。';
        }
    }

//　あんこのたい焼き
$taiyaki_anko = new Taiyaki("あんこ");
$taiyaki_anko -> whatIsContent();
//　クリームのたい焼き
$taiyaki_cream = new Taiyaki("クリーム");
$taiyaki_cream -> whatIsContent();
echo '<br>';

    class Enemy {
        public $name;
        public $stamina;
        public $attack;

        public function __construct($name, $stamina = 100, $attack = 10){
            $this->name = $name;
            $this->stamina = $stamina;
            $this->attack = $attack;
        }
        public function sayMyName(){
            echo $this->name.'があらわれた！';
        }
        public function powerUp(){
            $this->attack += 10;
            echo $this->name.'の攻撃力が'.$this->attack.'になった。<br>';
        }
    }
    // Enemyクラスからスライムを作る
    $slime = new Enemy('スライム');
    $slime->powerUp();    
    $slime->powerUp();    
    $slime->powerUp();    
    $slime->powerUp();    
    $slime->powerUp();    

    $kuribo = new Enemy('クリボー');
    echo $kuribo->stamina;
    echo $kuribo->attack;
echo '<br>';

class Boss extends Enemy {
    public function sayMyName(){
        echo 'ボスの'.$this->name.'があらわれた。<br>';
    }

    public function specialAttack(){
        echo 'すごい強い一撃！';
    }
}
$boss = new Boss('竜王');
    $boss->sayMyName();
    $boss->specialAttack();
    echo '<br>';

?>