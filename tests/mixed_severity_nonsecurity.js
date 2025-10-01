// This file is intentionally bad to trigger different severities (non-security)

// 🔴 BLOCKER: Infinite loop (rule javascript:S2189)
// Added an end condition to the loop
function infiniteLoop() {
  let counter = 0;
  while (counter < 10) {
    console.log("Looping...");
    counter++;
  }
}

// 🟠 CRITICAL: Null dereference (rule javascript:S2259)
// Added null/undefined check before accessing the object
function riskyAccess(obj) {
  if (obj?.value) { // Using optional chaining for concise and safe access
    return obj.value.toString();
  } else {
    console.warn("Object or value is null/undefined.");
    return null;
  }
}

// 🟡 MAJOR: Cognitive complexity too high (rule javascript:S3776)
// Simplified nested branches to reduce cognitive complexity
function complexFunction(x) {
  let result = 0;
  if (x > 0) {
    result += (x % 2 === 0) ? 2 : 3;
  } else if (x < -10) {
    result -= 10;
  } else if (x < -5) {
    result -= 5;
  } else {
    result -= 1;
  }
  return result;
}

// Example calls
console.log(riskyAccess(null));
console.log(complexFunction(7));
