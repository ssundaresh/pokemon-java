package com.self.openapi.pokemon.tests;

import com.self.openapi.pokemon.Pokemon;
import com.self.openapi.pokemon.models.errors.ApiErrorNotFound;
import com.self.openapi.pokemon.models.operations.PokemonRetrieveByIdOrNameResponse;
import com.self.openapi.pokemon.models.operations.GenerationRetrieveResponse;
import java.lang.Exception;

public class PokemonTest {

    public static void main(String[] args) throws ApiErrorNotFound, Exception {

        Pokemon sdk = Pokemon.builder()
            .build();
        GenerationRetrieveResponse gen_res = sdk.games().getGeneration().id("1").call();
        if (gen_res.statusCode() == 200)
            System.out.println("live api test for generations - passed");
        
        if (gen_res.generationDetail().isPresent()) {
            System.out.println("non-empty object test for generations - passed");
        }
        PokemonRetrieveByIdOrNameResponse pokemon_res = sdk.pokemon().getByIdOrName()
                .id("1")
                .call();

        if (pokemon_res.statusCode() == 200) {
            System.out.println("live API test for Pokemon - passed");
        }

        if(pokemon_res.pokemonDetail().isPresent())
        System.out.println("non-empty object test for Pokemon - passed");
    }
}