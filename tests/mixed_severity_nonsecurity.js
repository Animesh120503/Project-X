// This file is intentionally bad to trigger different severities (non-security)

// 🔴 BLOCKER: Infinite loop (rule javascript:S2189)
// Sonar considers this a blocker bug
function infiniteLoop() {
  while (true) {
    console.log("Looping forever..."); // Will never exit
  }
}

// 🟠 CRITICAL: Null dereference (rule javascript:S2259)
// Accessing property of possibly null
function riskyAccess(obj) {
  return obj.value.toString(); // obj could be null/undefined
}

// 🟡 MAJOR: Cognitive complexity too high (rule javascript:S3776)
// Nested/duplicated branches → high complexity
function complexFunction(x) {
  // FIX: Refactor to reduce cognitive complexity
  let result = 0;
  if (x > 0) {
    result += (x % 2 === 0) ? 2 : 3;
  } else {
    result += calculateNegativeResult(x);
  }
  return result;
}

function calculateNegativeResult(x) {
  if (x < -10) {
    return -10;
  } else if (x < -5) {
    return -5;
  } else {
    return -1;
  }
}

// Example calls
// ⚠️ These are just to execute functions, not needed for Sonar analysis
// infiniteLoop();   // Don't call or program will hang
console.log(riskyAccess(null));  // Will throw at runtime
console.log(complexFunction(7));
