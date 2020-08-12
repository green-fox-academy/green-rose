'use strict';

const lineCount = 8;
let output = '*';

//draw pyramide
let adChar = (many, char) => {
  if (many < 1) return '';
  return adChar(many - 1, char) + char;
};

for (let index = 0; index < lineCount; index++) {
  console.log(adChar(lineCount - 1 - index, ' ') + adChar(1 + index * 2, '*'));
}

//draw square
let row = [];
for (let y = 0; y < lineCount; y++) {
  for (let x = 0; x < lineCount; x++) {
    if (y === 0 || y === lineCount - 1 || x === 0 || x === lineCount - 1) {
      row[x] = '*';
    } else row[x] = ' ';
  }
  console.log(row.join(''));
}

//draw chessTable
for (let y = 0; y < lineCount; y++) {
  for (let x = 0; x < lineCount; x++) {
    if ((x + y) % 2 > 0) {
      row[x] = ' ';
    } else row[x] = '%';
  }
  console.log(row.join(''));
}

//sum array (reduce:-)
let numbers = [3, 4, 5, 6, 7, -1];
console.log(numbers.reduce((a, b) => a + b));

//diagonal matrix
for (let y = 0; y < lineCount; y++) {
  for (let x = 0; x < lineCount; x++) {
    if (x === lineCount - y - 1) {
      row[x] = '1';
    } else row[x] = '0';
  }
  console.log(row.join(' '));
}

function substr(str, keyword) {
  for (let index = 0; index < str.length - keyword.length; index++) {
    if (str.substr(index, keyword.length)===keyword)
    //if (str.substr(index, keyword.length).localeCompare(keyword) == 0)
      return index;
  }
  return -1;
}

// should print: `17`
console.log(substr("this is what I'm searching in", 'searching'));

// should print: `-1`
console.log(substr("this is what I'm searching in", 'not'));


 // Write a program that prints the numbers from 1 to 100.
// But for multiples of three print “Fizz” instead of the number
// and for the multiples of five print “Buzz”.
// For numbers which are multiples of both three and five print “FizzBuzz”.
let answer;
for (let index = 1; index < 100; index++) {
    answer ="";
    if (index%3==0){
        answer += "Fizz";
    }
    if (index%5==0){
        answer += "Buzz";
    }
    if (answer!=""){
        console.log(answer);
    } else {
        console.log(index);
    }
}

let mapOfChar= new Object();
console.log(Object.entries(mapOfChar).length===0);
mapOfChar[97]='a';
mapOfChar[98]='b';
mapOfChar[99]='c';
mapOfChar[65]='A';
mapOfChar[66]='B';
mapOfChar[67]='B';
console.log(Object.entries(mapOfChar).length===0);
console.log(Object.keys(mapOfChar));
console.log(Object.values(mapOfChar));
mapOfChar[68]='D';
console.log(Object.entries(mapOfChar));
console.log(mapOfChar[99]);
delete mapOfChar[97];
console.log(mapOfChar[100]);
mapOfChar={};
console.log(Object.entries(mapOfChar).length===0);