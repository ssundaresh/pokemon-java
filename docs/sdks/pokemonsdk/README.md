# PokemonSDK
(*pokemon()*)

## Overview

### Available Operations

* [getByIdOrName](#getbyidorname) - Get a specific pokemon
* [list](#list) - List pokemon

## getByIdOrName

Pokémon are the creatures that inhabit the world of the Pokémon games. They can be caught using Pokéballs and trained by battling with other Pokémon. Each Pokémon belongs to a specific species but may take on a variant which makes it differ from other Pokémon of the same species, such as base stats, available abilities and typings. See [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Pok%C3%A9mon_(species)) for greater detail.

### Example Usage

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

### Parameters

| Parameter                                     | Type                                          | Required                                      | Description                                   |
| --------------------------------------------- | --------------------------------------------- | --------------------------------------------- | --------------------------------------------- |
| `id`                                          | *String*                                      | :heavy_check_mark:                            | This parameter can be a string or an integer. |

### Response

**[PokemonRetrieveByIdOrNameResponse](../../models/operations/PokemonRetrieveByIdOrNameResponse.md)**

### Errors

| Error Type                     | Status Code                    | Content Type                   |
| ------------------------------ | ------------------------------ | ------------------------------ |
| models/errors/ApiErrorNotFound | 404                            | application/json               |
| models/errors/SDKError         | 4XX, 5XX                       | \*/\*                          |

## list

Pokémon are the creatures that inhabit the world of the Pokémon games. They can be caught using Pokéballs and trained by battling with other Pokémon. Each Pokémon belongs to a specific species but may take on a variant which makes it differ from other Pokémon of the same species, such as base stats, available abilities and typings. See [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Pok%C3%A9mon_(species)) for greater detail.

### Example Usage

```java
package hello.world;

import com.self.openapi.pokemon.Pokemon;
import com.self.openapi.pokemon.models.errors.ApiErrorNotFound;
import com.self.openapi.pokemon.models.operations.PokemonListResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws ApiErrorNotFound, Exception {

        Pokemon sdk = Pokemon.builder()
            .build();

        PokemonListResponse res = sdk.pokemon().list()
                .limit(768578L)
                .offset(547272L)
                .q("<value>")
                .call();

        if (res.paginatedPokemonSummaryList().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                                                            | Type                                                                                                                                 | Required                                                                                                                             | Description                                                                                                                          |
| ------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------ |
| `limit`                                                                                                                              | *Optional\<Long>*                                                                                                                    | :heavy_minus_sign:                                                                                                                   | Number of results to return per page.                                                                                                |
| `offset`                                                                                                                             | *Optional\<Long>*                                                                                                                    | :heavy_minus_sign:                                                                                                                   | The initial index from which to return the results.                                                                                  |
| `q`                                                                                                                                  | *Optional\<String>*                                                                                                                  | :heavy_minus_sign:                                                                                                                   | > Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2)<br/>Case-insensitive query applied on the `name` property.  |

### Response

**[PokemonListResponse](../../models/operations/PokemonListResponse.md)**

### Errors

| Error Type                     | Status Code                    | Content Type                   |
| ------------------------------ | ------------------------------ | ------------------------------ |
| models/errors/ApiErrorNotFound | 404                            | application/json               |
| models/errors/SDKError         | 4XX, 5XX                       | \*/\*                          |