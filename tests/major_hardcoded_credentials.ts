// Intentional issues:
// - Hard-coded credentials and secrets in source code
// - Secrets used directly in operations


export class CloudUploader {
private readonly accessKey: string;
private readonly secretKey: string;

constructor(accessKey: string, secretKey: string) {
    this.accessKey = accessKey;
    this.secretKey = secretKey;
} // Refactored to remove hard-coded credentials and mark properties as readonly


constructor() {}


upload(filePath: string) {
// Simulate using hard-coded credentials
console.log('Uploading', filePath, 'using', this.accessKey); // Simulate using credentials passed securely
// ... imagine SDK usage here
}
}


const u = new CloudUploader();
u.upload('/tmp/some-file.zip');