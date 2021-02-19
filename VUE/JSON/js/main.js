let user ={
    name: "太郎",
    age: "20",
    email: "sample.com"
}
localStorage.setItem("user",JSON.stringify(user));
JSON.parse(localStorage.getItem("user"));