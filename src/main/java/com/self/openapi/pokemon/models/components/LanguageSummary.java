/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.self.openapi.pokemon.models.components;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.self.openapi.pokemon.utils.Utils;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;


public class LanguageSummary {

    @JsonProperty("name")
    private String name;

    @JsonProperty("url")
    private String url;

    @JsonCreator
    public LanguageSummary(
            @JsonProperty("name") String name,
            @JsonProperty("url") String url) {
        Utils.checkNotNull(name, "name");
        Utils.checkNotNull(url, "url");
        this.name = name;
        this.url = url;
    }

    @JsonIgnore
    public String name() {
        return name;
    }

    @JsonIgnore
    public String url() {
        return url;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public LanguageSummary withName(String name) {
        Utils.checkNotNull(name, "name");
        this.name = name;
        return this;
    }

    public LanguageSummary withUrl(String url) {
        Utils.checkNotNull(url, "url");
        this.url = url;
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
        LanguageSummary other = (LanguageSummary) o;
        return 
            Objects.deepEquals(this.name, other.name) &&
            Objects.deepEquals(this.url, other.url);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            name,
            url);
    }
    
    @Override
    public String toString() {
        return Utils.toString(LanguageSummary.class,
                "name", name,
                "url", url);
    }
    
    public final static class Builder {
 
        private String name;
 
        private String url;  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder name(String name) {
            Utils.checkNotNull(name, "name");
            this.name = name;
            return this;
        }

        public Builder url(String url) {
            Utils.checkNotNull(url, "url");
            this.url = url;
            return this;
        }
        
        public LanguageSummary build() {
            return new LanguageSummary(
                name,
                url);
        }
    }
}

