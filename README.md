# Fivetran Resource Provider

The Fivetran Resource Provider lets you manage [Fivetran](https://www.fivetran.com/) resources.

## Installing

This package is available for several languages/platforms:

### Node.js (JavaScript/TypeScript)

To use from JavaScript or TypeScript in Node.js, install using either `npm`:

```bash
npm install @footholdtech/fivetran
```

or `yarn`:

```bash
yarn add @footholdtech/fivetran
```

### Python

To use from Python, install using `pip`:

```bash
pip install footholdtech_fivetran
```

### Go

To use from Go, use `go get` to grab the latest version of the library:

```bash
go get github.com/footholdtech/pulumi-fivetran/sdk/go/...
```

### .NET

To use from .NET, install using `dotnet add package`:

```bash
dotnet add package Footholdtech.Fivetran
```

## Configuration

The following configuration points are available for the `fivetran` provider:

- `fivetran:api_key` (environment: `FIVETRAN_APIKEY`) - This is the user id that should be used to make the connection.
- `fivetran:api_secret` (environment: `FIVETRAN_APISECRET`) - This is the password that should be used to make the connection.
- `fivetran:api_url` (environment: `FIVETRAN_APIURL`) - This is the base URL of your Fivetran instance.
