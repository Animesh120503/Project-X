// 🚨 Example file to trigger Sonar Critical/Blocker issues

// 1. Hardcoded credentials (Blocker)
const DB_PASSWORD = "admin123";

// 2. Unused variable (Code Smell)
let unusedValue = 42;

// 3. Function with too many returns & duplicate code (Critical)
function calculate(value) {
    if (value === 1) {
        return "one"; // Duplicate return
    } else if (value === 2) {
        return "two";
    } else {
        return "default";
    }
}

// 4. Console logs (Critical in production code)
console.log("Debug info: " + DB_PASSWORD);

// 5. Empty catch block (Blocker)
try {
    throw new Error("Something went wrong");
} catch (e) {
    // Ignored silently
}

// 6. Infinite loop (Blocker)
console.log("This loop runs only once.");
