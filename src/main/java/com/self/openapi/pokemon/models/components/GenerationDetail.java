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
import java.util.List;
import java.util.Objects;


public class GenerationDetail {

    @JsonProperty("id")
    private long id;

    @JsonProperty("name")
    private String name;

    @JsonProperty("abilities")
    private List<AbilitySummary> abilities;

    @JsonProperty("main_region")
    private RegionSummary mainRegion;

    @JsonProperty("moves")
    private List<MoveSummary> moves;

    @JsonProperty("names")
    private List<GenerationName> names;

    @JsonProperty("pokemon_species")
    private List<PokemonSpeciesSummary> pokemonSpecies;

    @JsonProperty("types")
    private List<TypeSummary> types;

    @JsonProperty("version_groups")
    private List<VersionGroupSummary> versionGroups;

    @JsonCreator
    public GenerationDetail(
            @JsonProperty("id") long id,
            @JsonProperty("name") String name,
            @JsonProperty("abilities") List<AbilitySummary> abilities,
            @JsonProperty("main_region") RegionSummary mainRegion,
            @JsonProperty("moves") List<MoveSummary> moves,
            @JsonProperty("names") List<GenerationName> names,
            @JsonProperty("pokemon_species") List<PokemonSpeciesSummary> pokemonSpecies,
            @JsonProperty("types") List<TypeSummary> types,
            @JsonProperty("version_groups") List<VersionGroupSummary> versionGroups) {
        Utils.checkNotNull(id, "id");
        Utils.checkNotNull(name, "name");
        Utils.checkNotNull(abilities, "abilities");
        Utils.checkNotNull(mainRegion, "mainRegion");
        Utils.checkNotNull(moves, "moves");
        Utils.checkNotNull(names, "names");
        Utils.checkNotNull(pokemonSpecies, "pokemonSpecies");
        Utils.checkNotNull(types, "types");
        Utils.checkNotNull(versionGroups, "versionGroups");
        this.id = id;
        this.name = name;
        this.abilities = abilities;
        this.mainRegion = mainRegion;
        this.moves = moves;
        this.names = names;
        this.pokemonSpecies = pokemonSpecies;
        this.types = types;
        this.versionGroups = versionGroups;
    }

    @JsonIgnore
    public long id() {
        return id;
    }

    @JsonIgnore
    public String name() {
        return name;
    }

    @JsonIgnore
    public List<AbilitySummary> abilities() {
        return abilities;
    }

    @JsonIgnore
    public RegionSummary mainRegion() {
        return mainRegion;
    }

    @JsonIgnore
    public List<MoveSummary> moves() {
        return moves;
    }

    @JsonIgnore
    public List<GenerationName> names() {
        return names;
    }

    @JsonIgnore
    public List<PokemonSpeciesSummary> pokemonSpecies() {
        return pokemonSpecies;
    }

    @JsonIgnore
    public List<TypeSummary> types() {
        return types;
    }

    @JsonIgnore
    public List<VersionGroupSummary> versionGroups() {
        return versionGroups;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public GenerationDetail withId(long id) {
        Utils.checkNotNull(id, "id");
        this.id = id;
        return this;
    }

    public GenerationDetail withName(String name) {
        Utils.checkNotNull(name, "name");
        this.name = name;
        return this;
    }

    public GenerationDetail withAbilities(List<AbilitySummary> abilities) {
        Utils.checkNotNull(abilities, "abilities");
        this.abilities = abilities;
        return this;
    }

    public GenerationDetail withMainRegion(RegionSummary mainRegion) {
        Utils.checkNotNull(mainRegion, "mainRegion");
        this.mainRegion = mainRegion;
        return this;
    }

    public GenerationDetail withMoves(List<MoveSummary> moves) {
        Utils.checkNotNull(moves, "moves");
        this.moves = moves;
        return this;
    }

    public GenerationDetail withNames(List<GenerationName> names) {
        Utils.checkNotNull(names, "names");
        this.names = names;
        return this;
    }

    public GenerationDetail withPokemonSpecies(List<PokemonSpeciesSummary> pokemonSpecies) {
        Utils.checkNotNull(pokemonSpecies, "pokemonSpecies");
        this.pokemonSpecies = pokemonSpecies;
        return this;
    }

    public GenerationDetail withTypes(List<TypeSummary> types) {
        Utils.checkNotNull(types, "types");
        this.types = types;
        return this;
    }

    public GenerationDetail withVersionGroups(List<VersionGroupSummary> versionGroups) {
        Utils.checkNotNull(versionGroups, "versionGroups");
        this.versionGroups = versionGroups;
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
        GenerationDetail other = (GenerationDetail) o;
        return 
            Objects.deepEquals(this.id, other.id) &&
            Objects.deepEquals(this.name, other.name) &&
            Objects.deepEquals(this.abilities, other.abilities) &&
            Objects.deepEquals(this.mainRegion, other.mainRegion) &&
            Objects.deepEquals(this.moves, other.moves) &&
            Objects.deepEquals(this.names, other.names) &&
            Objects.deepEquals(this.pokemonSpecies, other.pokemonSpecies) &&
            Objects.deepEquals(this.types, other.types) &&
            Objects.deepEquals(this.versionGroups, other.versionGroups);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            id,
            name,
            abilities,
            mainRegion,
            moves,
            names,
            pokemonSpecies,
            types,
            versionGroups);
    }
    
    @Override
    public String toString() {
        return Utils.toString(GenerationDetail.class,
                "id", id,
                "name", name,
                "abilities", abilities,
                "mainRegion", mainRegion,
                "moves", moves,
                "names", names,
                "pokemonSpecies", pokemonSpecies,
                "types", types,
                "versionGroups", versionGroups);
    }
    
    public final static class Builder {
 
        private Long id;
 
        private String name;
 
        private List<AbilitySummary> abilities;
 
        private RegionSummary mainRegion;
 
        private List<MoveSummary> moves;
 
        private List<GenerationName> names;
 
        private List<PokemonSpeciesSummary> pokemonSpecies;
 
        private List<TypeSummary> types;
 
        private List<VersionGroupSummary> versionGroups;  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder id(long id) {
            Utils.checkNotNull(id, "id");
            this.id = id;
            return this;
        }

        public Builder name(String name) {
            Utils.checkNotNull(name, "name");
            this.name = name;
            return this;
        }

        public Builder abilities(List<AbilitySummary> abilities) {
            Utils.checkNotNull(abilities, "abilities");
            this.abilities = abilities;
            return this;
        }

        public Builder mainRegion(RegionSummary mainRegion) {
            Utils.checkNotNull(mainRegion, "mainRegion");
            this.mainRegion = mainRegion;
            return this;
        }

        public Builder moves(List<MoveSummary> moves) {
            Utils.checkNotNull(moves, "moves");
            this.moves = moves;
            return this;
        }

        public Builder names(List<GenerationName> names) {
            Utils.checkNotNull(names, "names");
            this.names = names;
            return this;
        }

        public Builder pokemonSpecies(List<PokemonSpeciesSummary> pokemonSpecies) {
            Utils.checkNotNull(pokemonSpecies, "pokemonSpecies");
            this.pokemonSpecies = pokemonSpecies;
            return this;
        }

        public Builder types(List<TypeSummary> types) {
            Utils.checkNotNull(types, "types");
            this.types = types;
            return this;
        }

        public Builder versionGroups(List<VersionGroupSummary> versionGroups) {
            Utils.checkNotNull(versionGroups, "versionGroups");
            this.versionGroups = versionGroups;
            return this;
        }
        
        public GenerationDetail build() {
            return new GenerationDetail(
                id,
                name,
                abilities,
                mainRegion,
                moves,
                names,
                pokemonSpecies,
                types,
                versionGroups);
        }
    }
}

