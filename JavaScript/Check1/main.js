let numbers =[2,5,12,13,15,18,22];

for(num = 0; num < numbers.length; num++){
    if(numbers[num] % 2 === 0){
        function isEven(num){
            console.log([num]+ 'は偶数です')
        }
        isEven(numbers[num]);
    }
}

class Car {
    constructor(gas,num){
        this.gas = gas;
        this.num = num;
    }
    getNumGas(){
        console.log(`ガソリンは${this.gas}です。ナンバーは${this.num}です`);
    }
}
let car = new Car("〇〇","△△");
car.getNumGas();