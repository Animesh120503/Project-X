// 🚨 Example file to trigger Sonar Critical/Blocker issues

// 1. Hardcoded credentials (Blocker)
// Updated to use environment variable for security
const DB_PASSWORD = process.env.DB_PASSWORD || "default_password";

// 2. Unused variable (Code Smell)
// Removed unused variable to improve code clarity

// 3. Function with too many returns & duplicate code (Critical)
// Refactored function to remove duplicate conditions and excessive returns
function calculate(value) {
    switch (value) {
        case 1:
            return "one";
        case 2:
            return "two";
        default:
            return "default";
    }
}

// 4. Console logs (Critical in production code)
// Removed console log to avoid exposing sensitive information in production

// 5. Empty catch block (Blocker)
// Added meaningful error handling in the catch block
try {
    throw new Error("Something went wrong");
} catch (e) {
    console.error("An error occurred:", e.message); // Log the error or handle it appropriately
}

// 6. Infinite loop (Blocker)
// Fixed infinite loop by adding a proper exit condition
let condition = true; // Example condition
while (condition) {
    // Perform some operation
    condition = false; // Exit condition to prevent infinite loop
}
