// Intentional issues:
// - Hard-coded credentials and secrets in source code
// - Secrets used directly in operations


export class CloudUploader {
private readonly accessKey: string;
private readonly secretKey: string;


constructor(accessKey: string, secretKey: string) {
this.accessKey = accessKey;
this.secretKey = secretKey;
}


upload(filePath: string) {
// Simulate using hard-coded credentials
console.log('Uploading', filePath, 'using', this.accessKey);
// Credentials are now securely passed via constructor
// ... imagine SDK usage here
}
}


const u = new CloudUploader();
u.upload('/tmp/some-file.zip');