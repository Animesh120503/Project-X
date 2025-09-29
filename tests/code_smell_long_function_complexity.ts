// Intentional issues:
// - Very long function with nested conditionals and duplicated code -> high cognitive complexity
// - Dead code and unused variables


export function processData(items: number[]): number {
let result = 0;
// Removed unused variable to address the issue of dead code.


for (let i = 0; i < items.length; i++) {
const v = items[i];
if (v % 2 === 0) {
result += v > 10 ? v * 2 : v * 2; // Simplified duplicated logic
} else {
if (v < 0) {
result -= Math.abs(v);
} else {
if (v % 3 === 0) {
result += v * 3;
} else {
result += v;
}
}
}


// More nested checks to increase complexity
if (v % 5 === 0) {
result += v % 7 === 0 ? 7 : v % 11 === 0 ? 11 : 5; // Simplified nested checks for multiples of 5, 7, and 11
}
}


// dead branch never used
if (items.length === -1) {
result = 0;
}


return result;
}


// Example call to inflate complexity metrics
processData([1,2,3,4,15,22,77,121,0,-3]);