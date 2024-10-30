/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.self.openapi.pokemon.models.components;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.self.openapi.pokemon.utils.Utils;
import java.lang.Long;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;


public class PokemonGameIndex {

    @JsonProperty("game_index")
    private long gameIndex;

    @JsonProperty("version")
    private VersionSummary version;

    @JsonCreator
    public PokemonGameIndex(
            @JsonProperty("game_index") long gameIndex,
            @JsonProperty("version") VersionSummary version) {
        Utils.checkNotNull(gameIndex, "gameIndex");
        Utils.checkNotNull(version, "version");
        this.gameIndex = gameIndex;
        this.version = version;
    }

    @JsonIgnore
    public long gameIndex() {
        return gameIndex;
    }

    @JsonIgnore
    public VersionSummary version() {
        return version;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public PokemonGameIndex withGameIndex(long gameIndex) {
        Utils.checkNotNull(gameIndex, "gameIndex");
        this.gameIndex = gameIndex;
        return this;
    }

    public PokemonGameIndex withVersion(VersionSummary version) {
        Utils.checkNotNull(version, "version");
        this.version = version;
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
        PokemonGameIndex other = (PokemonGameIndex) o;
        return 
            Objects.deepEquals(this.gameIndex, other.gameIndex) &&
            Objects.deepEquals(this.version, other.version);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            gameIndex,
            version);
    }
    
    @Override
    public String toString() {
        return Utils.toString(PokemonGameIndex.class,
                "gameIndex", gameIndex,
                "version", version);
    }
    
    public final static class Builder {
 
        private Long gameIndex;
 
        private VersionSummary version;  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder gameIndex(long gameIndex) {
            Utils.checkNotNull(gameIndex, "gameIndex");
            this.gameIndex = gameIndex;
            return this;
        }

        public Builder version(VersionSummary version) {
            Utils.checkNotNull(version, "version");
            this.version = version;
            return this;
        }
        
        public PokemonGameIndex build() {
            return new PokemonGameIndex(
                gameIndex,
                version);
        }
    }
}

