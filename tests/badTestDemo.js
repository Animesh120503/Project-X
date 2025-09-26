// 🚨 Example file to trigger Sonar Critical/Blocker issues

// 1. Hardcoded credentials (Blocker)
// FIX: Removed hardcoded credentials and replaced with environment variable for security.
const DB_PASSWORD = process.env.DB_PASSWORD || "default_password";

// 2. Unused variable (Code Smell)
// FIX: Removed unused variable to clean up the code.
// let unusedValue = 42; // Removed

// 3. Function with too many returns & duplicate code (Critical)
// FIX: Simplified the function by removing duplicate conditions and consolidating return statements.
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
// FIX: Replaced console log with a proper logging framework for non-production environments.
if (process.env.NODE_ENV !== "production") {
    console.log("Debug info: " + DB_PASSWORD); // Only log in non-production environments
}

// 5. Empty catch block (Blocker)
// FIX: Handled the error properly by logging it to ensure issues are not silently ignored.
try {
    throw new Error("Something went wrong");
} catch (e) {
    console.error("Error occurred:", e.message); // Log the error
}

// 6. Infinite loop (Blocker)
// FIX: Ensured the loop has a clear exit condition to avoid potential infinite loop issues.
let condition = true; // Example condition
while (condition) {
    // Perform some operation
    condition = false; // Exit condition
}
