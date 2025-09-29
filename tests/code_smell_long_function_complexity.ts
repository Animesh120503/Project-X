// Intentional issues:
// - Very long function with nested conditionals and duplicated code -> high cognitive complexity
// - Dead code and unused variables


export function processData(items: number[]): number {
let result = 0;
// Removed unused variable to address SonarQube issue typescript:S1854


for (let i = 0; i < items.length; i++) {
const v = items[i];
if (v % 2 === 0) {
if (v > 10) {
// duplicated logic
result += v * 2;
} else {
result += v * 2;
}
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
if (v % 7 === 0) {
result += 7;
} else if (v % 11 === 0) {
result += 11;
} else {
result += 5;
}
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