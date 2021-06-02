let number = 0;
while (number < 5) {
    if (number === 3) {
        number++;
        continue;
    }
    console.log(number);
    number++;
}