// Stringクラスの変数countryに"America"を代入
String country = "America";
// もしcountryが"America"の場合、"アメリカ合衆国"と表示 
if(country.equals("America")){
    System.out.println("アメリカ合衆国");

// でももし、countryが"Japan"の場合、"日本"と表示
}else if(country.equals("日本")){
    System.out.println("日本");

// それ以外の場合、"その他"と表示 
}else{
    System.out.println("その他");
}