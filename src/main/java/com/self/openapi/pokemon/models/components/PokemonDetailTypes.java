/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.self.openapi.pokemon.models.components;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.self.openapi.pokemon.utils.Utils;
import java.lang.Integer;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;


public class PokemonDetailTypes {

    @JsonProperty("slot")
    private int slot;

    @JsonProperty("type")
    private PokemonDetailType type;

    @JsonCreator
    public PokemonDetailTypes(
            @JsonProperty("slot") int slot,
            @JsonProperty("type") PokemonDetailType type) {
        Utils.checkNotNull(slot, "slot");
        Utils.checkNotNull(type, "type");
        this.slot = slot;
        this.type = type;
    }

    @JsonIgnore
    public int slot() {
        return slot;
    }

    @JsonIgnore
    public PokemonDetailType type() {
        return type;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public PokemonDetailTypes withSlot(int slot) {
        Utils.checkNotNull(slot, "slot");
        this.slot = slot;
        return this;
    }

    public PokemonDetailTypes withType(PokemonDetailType type) {
        Utils.checkNotNull(type, "type");
        this.type = type;
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
        PokemonDetailTypes other = (PokemonDetailTypes) o;
        return 
            Objects.deepEquals(this.slot, other.slot) &&
            Objects.deepEquals(this.type, other.type);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            slot,
            type);
    }
    
    @Override
    public String toString() {
        return Utils.toString(PokemonDetailTypes.class,
                "slot", slot,
                "type", type);
    }
    
    public final static class Builder {
 
        private Integer slot;
 
        private PokemonDetailType type;  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder slot(int slot) {
            Utils.checkNotNull(slot, "slot");
            this.slot = slot;
            return this;
        }

        public Builder type(PokemonDetailType type) {
            Utils.checkNotNull(type, "type");
            this.type = type;
            return this;
        }
        
        public PokemonDetailTypes build() {
            return new PokemonDetailTypes(
                slot,
                type);
        }
    }
}

