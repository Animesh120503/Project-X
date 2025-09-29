// Intentional issues:
// - Using insecure PRNG (Math.random) for token generation
// - Using weak hashing (sha1) for passwords without salt
// - Predictable "token" generation


const crypto = require('crypto');


function generateToken() {
// SEVERE: Math.random is not cryptographically secure
const token = Math.floor(Math.random() * 1000000).toString();
return token;
}


function hashPassword(password) {
// SEVERE: Using sha1 for password hashing (no salt) - insecure
return crypto.createHash('sha1').update(password).digest('hex');
}


console.log('Token:', generateToken());
console.log('Hash of secret:', hashPassword('password123'));