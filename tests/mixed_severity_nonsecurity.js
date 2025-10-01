// BLOCKER: Fixed infinite loop by adding an end condition (javascript:S2189)
function infiniteLoop() {
  let counter = 0; // Added a counter to break the loop
  while (counter < 10) { // End condition to prevent infinite loop
    console.log(`Looping... ${counter}`);
    counter++;
  }
}

// CRITICAL: Fixed null dereference by adding a null check (javascript:S2259)
function riskyAccess(obj) {
  if (obj?.value) { // Replaced null and undefined check with optional chaining for better readability (javascript:S3415)
    return obj.value.toString();
  } else {
    console.warn("Object or value is null/undefined.");
    return null;
  }
}

// MAJOR: Reduced cognitive complexity (javascript:S3776)
function complexFunction(x) {
  let result = 0;
  if (x > 0) {
    result += (x % 2 === 0) ? 2 : 3; // Simplified nested if-else
  } else {
    result -= (x < -10) ? 10 : (x < -5) ? 5 : 1; // Combined conditions into a single line to reduce cognitive complexity (javascript:S3776)
  }
  return result;
}

// Example calls
infiniteLoop();
console.log(riskyAccess(null));
console.log(complexFunction(7));
