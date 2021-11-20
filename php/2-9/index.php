<?php

for($i=0; $i<=100; $i++){
    echo $i;
    if($i % 3 == 0 && $i % 5 == 0 && $i != 0){
        echo "FizzBuzz!".'<br>';
        continue;
    }
    if($i % 3 == 0 && $i != 0){
        echo "Fizz!";
    }
    if($i % 5 == 0 && $i != 0){
        echo "Buzz!";
    }
    echo '<br>';
}

?>