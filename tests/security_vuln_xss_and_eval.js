// Intentional issues:
// - Using eval on user input (code injection)
// - Inserting unsanitized user content into an HTML context (XSS)


function handleRequest(req, res) {
const userInput = req.query.input || '';


// SECURITY: eval on user input -> remote code execution risk
try {
const result = eval(userInput);
res.write('Eval result: ' + result);
} catch (err) {
res.write('Error: ' + err);
}


// SECURITY: directly writing user input into HTML without sanitization -> XSS
res.end(`<html><body>User said: ${userInput}</body></html>`);
}


// Mock request object for local testing
handleRequest({ query: { input: "<script>alert('xss')</script>" } }, { write: console.log, end: console.log });