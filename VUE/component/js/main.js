//グローバル
Vue.component('hello-global',{
    template: `<h1>グローバルのコンポーネント</h1>`
})
var app = new Vue({
    el: '#app',
    data: {

    }
})


//ローカル
var app2 = new Vue({
    el: '#app2',
    components: {
        'hello-local': {
            template: `<h1>ローカルのコンポーネント</h1>`
        }
    }
})