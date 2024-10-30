# openapi
![alt text](98bx82.jpg)


Developer-friendly & type-safe Java SDK specifically catered to leverage *openapi* API.

<div align="left">
    <a href="https://www.speakeasy.com/?utm_source=openapi&utm_campaign=java"><img src="https://custom-icon-badges.demolab.com/badge/-Built%20By%20Speakeasy-212015?style=for-the-badge&logoColor=FBE331&logo=speakeasy&labelColor=545454" /></a>
    <a href="https://mit-license.org/">
        <img src="https://img.shields.io/badge/License-MIT-blue.svg" style="width: 100px; height: 28px;" />
    </a>
</div>


<br /><br />
> [!IMPORTANT]
> This SDK is not yet ready for production use. To complete setup please follow the steps outlined in your [workspace](https://app.speakeasy.com/org/self-4v1/self-testing). Delete this section before > publishing to a package manager.

<!-- Start Summary [summary] -->
## Summary

A Java SDK to access PokeAPI, which is a comprehensive database containing all the information you'll ever need about Pokémon!
<!-- End Summary [summary] -->

<!-- Start Table of Contents [toc] -->
## Table of Contents

* [SDK Installation](#sdk-installation)
* [SDK Example Usage](#sdk-example-usage)
* [Available Resources and Operations](#available-resources-and-operations)
* [Retries](#retries)
* [Error Handling](#error-handling)
* [Server Selection](#server-selection)
<!-- End Table of Contents [toc] -->

<!-- Start SDK Installation [installation] -->
## SDK Installation

### Getting started

JDK 11 or later is required.

The samples below show how a published SDK artifact is used:

Gradle:
```groovy
implementation 'com.self.openapi:pokemon:0.0.1'
```

Maven:
```xml
<dependency>
    <groupId>com.self.openapi</groupId>
    <artifactId>pokemon</artifactId>
    <version>0.0.1</version>
</dependency>
```

### How to build
After cloning the git repository to your file system you can build the SDK artifact from source to the `build` directory by running `./gradlew build` on *nix systems or `gradlew.bat` on Windows systems.

If you wish to build from source and publish the SDK artifact to your local Maven repository (on your filesystem) then use the following command (after cloning the git repo locally):

On *nix:
```bash
./gradlew publishToMavenLocal -Pskip.signing
```
On Windows:
```bash
gradlew.bat publishToMavenLocal -Pskip.signing
```
<!-- End SDK Installation [installation] -->

<!-- Start SDK Example Usage [usage] -->
## SDK Example Usage

### Example

```java
package hello.world;

import com.self.openapi.pokemon.Pokemon;
import com.self.openapi.pokemon.models.errors.ApiErrorNotFound;
import com.self.openapi.pokemon.models.operations.PokemonRetrieveByIdOrNameResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws ApiErrorNotFound, Exception {

        Pokemon sdk = Pokemon.builder()
            .build();

        PokemonRetrieveByIdOrNameResponse res = sdk.pokemon().getByIdOrName()
                .id("<id>")
                .call();

        if (res.pokemonDetail().isPresent()) {
            // handle response
        }
    }
}
```
<!-- End SDK Example Usage [usage] -->

<!-- Start Available Resources and Operations [operations] -->
## Available Resources and Operations

<details open>
<summary>Available methods</summary>

### [games()](docs/sdks/games/README.md)

* [getGeneration](docs/sdks/games/README.md#getgeneration) - Get details of a generation
* [listGenerations](docs/sdks/games/README.md#listgenerations) - List genrations


### [pokemon()](docs/sdks/pokemonsdk/README.md)

* [getByIdOrName](docs/sdks/pokemonsdk/README.md#getbyidorname) - Get a specific pokemon
* [list](docs/sdks/pokemonsdk/README.md#list) - List pokemon

</details>
<!-- End Available Resources and Operations [operations] -->

<!-- Start Retries [retries] -->
## Retries

Some of the endpoints in this SDK support retries. If you use the SDK without any configuration, it will fall back to the default retry strategy provided by the API. However, the default retry strategy can be overridden on a per-operation basis, or across the entire SDK.

To change the default retry strategy for a single API call, you can provide a `RetryConfig` object through the `retryConfig` builder method:
```java
package hello.world;

import com.self.openapi.pokemon.Pokemon;
import com.self.openapi.pokemon.models.errors.ApiErrorNotFound;
import com.self.openapi.pokemon.models.operations.PokemonRetrieveByIdOrNameResponse;
import com.self.openapi.pokemon.utils.BackoffStrategy;
import com.self.openapi.pokemon.utils.RetryConfig;
import java.lang.Exception;
import java.util.concurrent.TimeUnit;

public class Application {

    public static void main(String[] args) throws ApiErrorNotFound, Exception {

        Pokemon sdk = Pokemon.builder()
            .build();

        PokemonRetrieveByIdOrNameResponse res = sdk.pokemon().getByIdOrName()
                .retryConfig(RetryConfig.builder()
                    .backoff(BackoffStrategy.builder()
                        .initialInterval(1L, TimeUnit.MILLISECONDS)
                        .maxInterval(50L, TimeUnit.MILLISECONDS)
                        .maxElapsedTime(1000L, TimeUnit.MILLISECONDS)
                        .baseFactor(1.1)
                        .jitterFactor(0.15)
                        .retryConnectError(false)
                        .build())
                    .build())
                .id("<id>")
                .call();

        if (res.pokemonDetail().isPresent()) {
            // handle response
        }
    }
}
```

If you'd like to override the default retry strategy for all operations that support retries, you can provide a configuration at SDK initialization:
```java
package hello.world;

import com.self.openapi.pokemon.Pokemon;
import com.self.openapi.pokemon.models.errors.ApiErrorNotFound;
import com.self.openapi.pokemon.models.operations.PokemonRetrieveByIdOrNameResponse;
import com.self.openapi.pokemon.utils.BackoffStrategy;
import com.self.openapi.pokemon.utils.RetryConfig;
import java.lang.Exception;
import java.util.concurrent.TimeUnit;

public class Application {

    public static void main(String[] args) throws ApiErrorNotFound, Exception {

        Pokemon sdk = Pokemon.builder()
                .retryConfig(RetryConfig.builder()
                    .backoff(BackoffStrategy.builder()
                        .initialInterval(1L, TimeUnit.MILLISECONDS)
                        .maxInterval(50L, TimeUnit.MILLISECONDS)
                        .maxElapsedTime(1000L, TimeUnit.MILLISECONDS)
                        .baseFactor(1.1)
                        .jitterFactor(0.15)
                        .retryConnectError(false)
                        .build())
                    .build())
            .build();

        PokemonRetrieveByIdOrNameResponse res = sdk.pokemon().getByIdOrName()
                .id("<id>")
                .call();

        if (res.pokemonDetail().isPresent()) {
            // handle response
        }
    }
}
```
<!-- End Retries [retries] -->

<!-- Start Error Handling [errors] -->
## Error Handling

Handling errors in this SDK should largely match your expectations. All operations return a response object or raise an exception.

By default, an API error will throw a `models/errors/SDKError` exception. When custom error responses are specified for an operation, the SDK may also throw their associated exception. You can refer to respective *Errors* tables in SDK docs for more details on possible exception types for each operation. For example, the `getByIdOrName` method throws the following exceptions:

| Error Type                     | Status Code                    | Content Type                   |
| ------------------------------ | ------------------------------ | ------------------------------ |
| models/errors/ApiErrorNotFound | 404                            | application/json               |
| models/errors/SDKError         | 4XX, 5XX                       | \*/\*                          |

### Example

```java
package hello.world;

import com.self.openapi.pokemon.Pokemon;
import com.self.openapi.pokemon.models.errors.ApiErrorNotFound;
import com.self.openapi.pokemon.models.operations.PokemonRetrieveByIdOrNameResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws ApiErrorNotFound, Exception {

        Pokemon sdk = Pokemon.builder()
            .build();

        PokemonRetrieveByIdOrNameResponse res = sdk.pokemon().getByIdOrName()
                .id("<id>")
                .call();

        if (res.pokemonDetail().isPresent()) {
            // handle response
        }
    }
}
```
<!-- End Error Handling [errors] -->

<!-- Start Server Selection [server] -->
## Server Selection

### Select Server by Index

You can override the default server globally by passing a server index to the `serverIndex` builder method when initializing the SDK client instance. The selected server will then be used as the default on the operations that use it. This table lists the indexes associated with the available servers:

| # | Server | Variables |
| - | ------ | --------- |
| 0 | `https://pokeapi.co` | None |

#### Example

```java
package hello.world;

import com.self.openapi.pokemon.Pokemon;
import com.self.openapi.pokemon.models.errors.ApiErrorNotFound;
import com.self.openapi.pokemon.models.operations.PokemonRetrieveByIdOrNameResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws ApiErrorNotFound, Exception {

        Pokemon sdk = Pokemon.builder()
                .serverIndex(0)
            .build();

        PokemonRetrieveByIdOrNameResponse res = sdk.pokemon().getByIdOrName()
                .id("<id>")
                .call();

        if (res.pokemonDetail().isPresent()) {
            // handle response
        }
    }
}
```


### Override Server URL Per-Client

The default server can also be overridden globally by passing a URL to the `serverURL` builder method when initializing the SDK client instance. For example:
```java
package hello.world;

import com.self.openapi.pokemon.Pokemon;
import com.self.openapi.pokemon.models.errors.ApiErrorNotFound;
import com.self.openapi.pokemon.models.operations.PokemonRetrieveByIdOrNameResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws ApiErrorNotFound, Exception {

        Pokemon sdk = Pokemon.builder()
                .serverURL("https://pokeapi.co")
            .build();

        PokemonRetrieveByIdOrNameResponse res = sdk.pokemon().getByIdOrName()
                .id("<id>")
                .call();

        if (res.pokemonDetail().isPresent()) {
            // handle response
        }
    }
}
```
<!-- End Server Selection [server] -->

<!-- Placeholder for Future Speakeasy SDK Sections -->

# Development

## Maturity

This SDK is in beta, and there may be breaking changes between versions without a major version update. Therefore, we recommend pinning usage
to a specific package version. This way, you can install the same version each time without breaking changes unless you are intentionally
looking for the latest version.

## Contributions

While we value open-source contributions to this SDK, this library is generated programmatically. Any manual changes added to internal files will be overwritten on the next generation. 
We look forward to hearing your feedback. Feel free to open a PR or an issue with a proof of concept and we'll do our best to include it in a future release. 

### SDK Created by [Speakeasy](https://www.speakeasy.com/?utm_source=openapi&utm_campaign=java)
