var app = new Vue({
    el: '#app',
    data: {
        counter: 0,
      },
      //追加分↓
      computed: {
        lessThanThree: function() {
          return this.counter > 3 ? '3以上' : '3以下'
        }
      },
      methods: {
        counterBtn: function() {
          this.counter++;
        },
        lessThanThreeMethod: function() {
            return this.counter > 3 ? '3以上' : '3以下';
        }
      }


    
})