
/*
let a = [10,20,30];
let sum = 0;

for(let i = 0; i< a.length; i ++){
	sum += a[i];
}

console.log(sum/a.length);
*/

/*
let arr = [1,2,3,4,5,6];
let res = [];
for( let i = 0; i<arr.length; i++){
	if(arr[i] % 2 ==0){
		res.push(arr[i]); 
	}
}

console.log(res);
*/

/*
let a = "banana";
let b = 'a';

a = a.replaceAll(b, "");
console.log(a);
*/

/*
let a = "level"
function pal(word){
	let b = 0;
	let c = a.length - 1;
	
	while(b < c) {
		if(a[b] !== a[c]) return false
		b++;
		c--;
	}
	return true;
}

console.log(pal(a));
*/


/*

let a = [7,2,9,4];
let res = a[0];

for(let i = 0; i < a.length; i++){

	if(a[i] < res) {
		res = a[i];
	}
}
console.log(res);

*/

/*
let a = [1,2,3];

let res = [];

for(let i = a.length - 1; i >= 0; i--){
	res.push(a[i]);
}

console.log(res);
*/


let arr = [1,2,2,3,3,3,4];
let count = {};
for(let i = 0; i < arr.length; i++){
	let num = arr[i];
	
	count[num] = (count[num] || 0) + 1;
}

console.log(count);

let res = 0;
for(let j in count){
	if(count[j] > res){
		res = count[j];
	}
}
console.log(res);













