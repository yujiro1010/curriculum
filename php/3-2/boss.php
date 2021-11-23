<?php
    class Boss extends Enemy {
        public function specialAtacck(){
            echo 'すごい強い一撃！';
        }
    }
    $boss = new Boss('竜王');
        $boss->sayMyName();
        $boss->specialAttack();
        echo '<br>';
?>