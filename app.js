let currentResult = 0;
let currentOperator = '';

function appendNumber(number) {
  document.getElementById('result').value += number;
}

function performOperation(operator) {
  currentOperator = operator;
  currentResult = parseFloat(document.getElementById('result').value);
  document.getElementById('result').value = '';
}

function calculateResult() {
  let input = parseFloat(document.getElementById('result').value);
  let result;

  switch (currentOperator) {
    case '+':
      result = currentResult + input;
      break;
    case '-':
      result = currentResult - input;
      break;
    case '*':
      result = currentResult * input;
      break;
    case '/':
      result = currentResult / input;
      break;
    default:
      return;
  }

  document.getElementById('result').value = result;
}

function clearResult() {
  document.getElementById('result').value = '';
  currentResult = 0;
  currentOperator = '';
}

