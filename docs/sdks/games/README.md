# Games
(*games()*)

## Overview

### Available Operations

* [getGeneration](#getgeneration) - Get details of a generation
* [listGenerations](#listgenerations) - List genrations

## getGeneration

A generation is a grouping of the Pokémon games that separates them based on the Pokémon they include. In each generation, a new set of Pokémon, Moves, Abilities and Types that did not exist in the previous generation are released.

### Example Usage

```java
package hello.world;

import com.self.openapi.pokemon.Pokemon;
import com.self.openapi.pokemon.models.errors.ApiErrorNotFound;
import com.self.openapi.pokemon.models.operations.GenerationRetrieveResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws ApiErrorNotFound, Exception {

        Pokemon sdk = Pokemon.builder()
            .build();

        GenerationRetrieveResponse res = sdk.games().getGeneration()
                .id("<id>")
                .call();

        if (res.generationDetail().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                     | Type                                          | Required                                      | Description                                   |
| --------------------------------------------- | --------------------------------------------- | --------------------------------------------- | --------------------------------------------- |
| `id`                                          | *String*                                      | :heavy_check_mark:                            | This parameter can be a string or an integer. |

### Response

**[GenerationRetrieveResponse](../../models/operations/GenerationRetrieveResponse.md)**

### Errors

| Error Type                     | Status Code                    | Content Type                   |
| ------------------------------ | ------------------------------ | ------------------------------ |
| models/errors/ApiErrorNotFound | 404                            | application/json               |
| models/errors/SDKError         | 4XX, 5XX                       | \*/\*                          |

## listGenerations

A generation is a grouping of the Pokémon games that separates them based on the Pokémon they include. In each generation, a new set of Pokémon, Moves, Abilities and Types that did not exist in the previous generation are released.

### Example Usage

```java
package hello.world;

import com.self.openapi.pokemon.Pokemon;
import com.self.openapi.pokemon.models.errors.ApiErrorNotFound;
import com.self.openapi.pokemon.models.operations.GenerationListResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws ApiErrorNotFound, Exception {

        Pokemon sdk = Pokemon.builder()
            .build();

        GenerationListResponse res = sdk.games().listGenerations()
                .limit(137663L)
                .offset(68335L)
                .q("<value>")
                .call();

        if (res.paginatedGenerationSummaryList().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                                                          | Type                                                                                                                               | Required                                                                                                                           | Description                                                                                                                        |
| ---------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------- |
| `limit`                                                                                                                            | *Optional\<Long>*                                                                                                                  | :heavy_minus_sign:                                                                                                                 | Number of results to return per page.                                                                                              |
| `offset`                                                                                                                           | *Optional\<Long>*                                                                                                                  | :heavy_minus_sign:                                                                                                                 | The initial index from which to return the results.                                                                                |
| `q`                                                                                                                                | *Optional\<String>*                                                                                                                | :heavy_minus_sign:                                                                                                                 | Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property.  |

### Response

**[GenerationListResponse](../../models/operations/GenerationListResponse.md)**

### Errors

| Error Type                     | Status Code                    | Content Type                   |
| ------------------------------ | ------------------------------ | ------------------------------ |
| models/errors/ApiErrorNotFound | 404                            | application/json               |
| models/errors/SDKError         | 4XX, 5XX                       | \*/\*                          |