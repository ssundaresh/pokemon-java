/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.self.openapi.pokemon.models.operations;

import com.self.openapi.pokemon.utils.Options;
import java.lang.Exception;
import java.lang.Long;
import java.lang.String;
import java.util.Optional;

public class SDKMethodInterfaces {


    public interface MethodCallPokemonRetrieveByIdOrName {
        PokemonRetrieveByIdOrNameResponse getByIdOrName(
            String id,
            Optional<Options> options) throws Exception;
    }


    public interface MethodCallPokemonList {
        PokemonListResponse list(
            Optional<Long> limit,
            Optional<Long> offset,
            Optional<String> q,
            Optional<Options> options) throws Exception;
    }


    public interface MethodCallGenerationRetrieve {
        GenerationRetrieveResponse getGeneration(
            String id,
            Optional<Options> options) throws Exception;
    }


    public interface MethodCallGenerationList {
        GenerationListResponse listGenerations(
            Optional<Long> limit,
            Optional<Long> offset,
            Optional<String> q,
            Optional<Options> options) throws Exception;
    }


}
