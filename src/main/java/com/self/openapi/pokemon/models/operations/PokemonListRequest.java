/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.self.openapi.pokemon.models.operations;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.self.openapi.pokemon.utils.SpeakeasyMetadata;
import com.self.openapi.pokemon.utils.Utils;
import java.lang.Long;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;


public class PokemonListRequest {

    /**
     * Number of results to return per page.
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=limit")
    private Optional<Long> limit;

    /**
     * The initial index from which to return the results.
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=offset")
    private Optional<Long> offset;

    /**
     * &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2)
     * Case-insensitive query applied on the `name` property. 
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=q")
    private Optional<String> q;

    @JsonCreator
    public PokemonListRequest(
            Optional<Long> limit,
            Optional<Long> offset,
            Optional<String> q) {
        Utils.checkNotNull(limit, "limit");
        Utils.checkNotNull(offset, "offset");
        Utils.checkNotNull(q, "q");
        this.limit = limit;
        this.offset = offset;
        this.q = q;
    }
    
    public PokemonListRequest() {
        this(Optional.empty(), Optional.empty(), Optional.empty());
    }

    /**
     * Number of results to return per page.
     */
    @JsonIgnore
    public Optional<Long> limit() {
        return limit;
    }

    /**
     * The initial index from which to return the results.
     */
    @JsonIgnore
    public Optional<Long> offset() {
        return offset;
    }

    /**
     * &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2)
     * Case-insensitive query applied on the `name` property. 
     */
    @JsonIgnore
    public Optional<String> q() {
        return q;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * Number of results to return per page.
     */
    public PokemonListRequest withLimit(long limit) {
        Utils.checkNotNull(limit, "limit");
        this.limit = Optional.ofNullable(limit);
        return this;
    }

    /**
     * Number of results to return per page.
     */
    public PokemonListRequest withLimit(Optional<Long> limit) {
        Utils.checkNotNull(limit, "limit");
        this.limit = limit;
        return this;
    }

    /**
     * The initial index from which to return the results.
     */
    public PokemonListRequest withOffset(long offset) {
        Utils.checkNotNull(offset, "offset");
        this.offset = Optional.ofNullable(offset);
        return this;
    }

    /**
     * The initial index from which to return the results.
     */
    public PokemonListRequest withOffset(Optional<Long> offset) {
        Utils.checkNotNull(offset, "offset");
        this.offset = offset;
        return this;
    }

    /**
     * &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2)
     * Case-insensitive query applied on the `name` property. 
     */
    public PokemonListRequest withQ(String q) {
        Utils.checkNotNull(q, "q");
        this.q = Optional.ofNullable(q);
        return this;
    }

    /**
     * &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2)
     * Case-insensitive query applied on the `name` property. 
     */
    public PokemonListRequest withQ(Optional<String> q) {
        Utils.checkNotNull(q, "q");
        this.q = q;
        return this;
    }
    
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        PokemonListRequest other = (PokemonListRequest) o;
        return 
            Objects.deepEquals(this.limit, other.limit) &&
            Objects.deepEquals(this.offset, other.offset) &&
            Objects.deepEquals(this.q, other.q);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            limit,
            offset,
            q);
    }
    
    @Override
    public String toString() {
        return Utils.toString(PokemonListRequest.class,
                "limit", limit,
                "offset", offset,
                "q", q);
    }
    
    public final static class Builder {
 
        private Optional<Long> limit = Optional.empty();
 
        private Optional<Long> offset = Optional.empty();
 
        private Optional<String> q = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * Number of results to return per page.
         */
        public Builder limit(long limit) {
            Utils.checkNotNull(limit, "limit");
            this.limit = Optional.ofNullable(limit);
            return this;
        }

        /**
         * Number of results to return per page.
         */
        public Builder limit(Optional<Long> limit) {
            Utils.checkNotNull(limit, "limit");
            this.limit = limit;
            return this;
        }

        /**
         * The initial index from which to return the results.
         */
        public Builder offset(long offset) {
            Utils.checkNotNull(offset, "offset");
            this.offset = Optional.ofNullable(offset);
            return this;
        }

        /**
         * The initial index from which to return the results.
         */
        public Builder offset(Optional<Long> offset) {
            Utils.checkNotNull(offset, "offset");
            this.offset = offset;
            return this;
        }

        /**
         * &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2)
         * Case-insensitive query applied on the `name` property. 
         */
        public Builder q(String q) {
            Utils.checkNotNull(q, "q");
            this.q = Optional.ofNullable(q);
            return this;
        }

        /**
         * &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2)
         * Case-insensitive query applied on the `name` property. 
         */
        public Builder q(Optional<String> q) {
            Utils.checkNotNull(q, "q");
            this.q = q;
            return this;
        }
        
        public PokemonListRequest build() {
            return new PokemonListRequest(
                limit,
                offset,
                q);
        }
    }
}
