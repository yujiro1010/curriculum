//【continue文は、その時点で後の処理をスキップします。】
while (条件式) { 

    [ある処理A] 

    continue; 

    [ある処理B] 

}

//例
while (条件式) { 

    [ある処理A] 

    if (何かの条件) { 
      continue; /* 条件に一致したら[ある処理B]はスキップする */ 
    } 

    [ある処理B] 

}