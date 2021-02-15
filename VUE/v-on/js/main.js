var app = new Vue({
    el: "#app",
    data: {
        //データ準備
        newItem: '',
        items: ['item1','item2','item3']
    },
    methods: {
        addItem: function(){
            this.items.push(this.newItem);
        }

    }
    
});