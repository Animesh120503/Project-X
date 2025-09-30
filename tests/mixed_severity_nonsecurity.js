// This file is intentionally bad to trigger different severities (non-security)

// 🔴 BLOCKER: Infinite loop (rule javascript:S2189)
// Sonar considers this a blocker bug
function infiniteLoop() {
  let counter = 0;
  while (counter < 10) { // Example end condition
    console.log("Looping...");
    counter++;
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
  let result = 0;
  if (x > 0) {
    if (x % 2 === 0) {
      result += 2;
    } else {
      result += 3;
    }
  } else {
    if (x < -10) {
      result -= 10;
    } else if (x < -5) {
      result -= 5;
    } else {
      result -= 1;
    }
  }
  return result;
}

// Example calls
// ⚠️ These are just to execute functions, not needed for Sonar analysis
// infiniteLoop();   // Don't call or program will hang
console.log(riskyAccess(null));  // Will throw at runtime
console.log(complexFunction(7));
