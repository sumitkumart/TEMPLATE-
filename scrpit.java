function calculateSquare() {
    const numberInput = document.getElementById('numberInput').value;
    const result = document.getElementById('result');
    
    if (numberInput === '') {
        result.textContent = 'Please enter a number';
    } else {
        const number = parseFloat(numberInput);
        const square = number * number;
        result.textContent = `The square of ${number} is ${square}`;
    }
}
