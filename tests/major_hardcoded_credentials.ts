// Intentional issues:
// - Hard-coded credentials and secrets in source code
// - Secrets used directly in operations


export class CloudUploader {
private accessKey = 'AKIAEXAMPLEFAKEKEY';
private secretKey = 'superSecretPassword123!';


constructor() {}


upload(filePath: string) {
// Simulate using hard-coded credentials
console.log('Uploading', filePath, 'using', this.accessKey);
// ... imagine SDK usage here
}
}


const u = new CloudUploader();
u.upload('/tmp/some-file.zip');