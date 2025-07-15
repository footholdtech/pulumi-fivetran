# Manualy Publish

If you need to manually push our NPM package to our registry, you can build the provider/sdk and then run

```bash
cd sdk/nodejs
npm run build
cd bin

# IMPORTANT: Update version in package.json manually, then move on.
npm publish
```
