$(window).load(function () {
    if(document.getElementById("curtainLeft") === null){
        $('body').prepend('＜div id="curtainLeft"＞＜/div＞');
    }
    if(document.getElementById("curtainRight") === null){
        $('body').prepend('＜div id="curtainRight"＞＜/div＞');
    }
    $("#curtainLeft").stop().animate({width:'0',opacity:'0'}, 2000 );
    $("#curtainRight").stop().animate({width:'0',opacity:'0'},2000 );
    setTimeout('Eliminate()',5000);
});
function Eliminate() {
    $('#curtainLeft').remove();
    $('#curtainRight').remove();
}