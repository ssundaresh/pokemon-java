<!-- Start SDK Example Usage [usage] -->
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