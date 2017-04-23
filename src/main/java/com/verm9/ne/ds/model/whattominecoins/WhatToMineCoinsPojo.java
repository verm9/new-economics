
package com.verm9.ne.ds.model.whattominecoins;

import com.fasterxml.jackson.annotation.*;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

/**
 * Contains data on non-asic coins.
 * Data source is http://whattomine.com/coins.json
 * POJO structure created by http://www.jsonschema2pojo.org
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "coins"
})
public class WhatToMineCoinsPojo implements Serializable
{

    @JsonProperty("coins")
    private Coins coins;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = -5647248562569346958L;

    @JsonProperty("coins")
    public Coins getCoins() {
        return coins;
    }

    @JsonProperty("coins")
    public void setCoins(Coins coins) {
        this.coins = coins;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(coins).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof WhatToMineCoinsPojo) == false) {
            return false;
        }
        WhatToMineCoinsPojo rhs = ((WhatToMineCoinsPojo) other);
        return new EqualsBuilder().append(coins, rhs.coins).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
