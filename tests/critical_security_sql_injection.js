// Intentional issues:
// - SQL injection via string concatenation
// - No input validation
// - Hard-coded database query execution


const mysql = require('mysql');


const connection = mysql.createConnection({
host: 'localhost',
user: 'root',
password: 'root',
database: 'testdb'
});


function getUserByUsername(username) {
// CRITICAL: SQL query built via string concatenation -> SQL Injection risk
const query = "SELECT * FROM users WHERE username = '" + username + "'";
connection.query(query, function (error, results) {
if (error) throw error; // also a reliability issue (throws in async callback)
console.log('User:', results[0]);
});
}


// Example usage (simulating unsafe input)
getUserByUsername("' OR '1'='1");