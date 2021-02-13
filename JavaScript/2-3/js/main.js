let box = document.getElementById('box');
let btn = document.getElementById('btn');

btn.addEventListener('click',function(){
    box.style.backgroucndColor = 'red';
},false);
btn.addEventListener('click',function(){
    alert('ボタンが押されました');
},false);