
package com.verm9.ne.ds.model.whattomineasic;

import com.fasterxml.jackson.annotation.*;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

/**
 * Contains data on asic mined coins.
 * Data source is http://whattomine.com/coins.json
 * POJO structure created by http://www.jsonschema2pojo.org
 * Setting: "Use double numbers", "Use Commons-Lang3", "Include getters and setters",
 * "Include hashCode and equals", "Include toString", "Allow additional properties",
 * "Make classes serializable"
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "coins"
})
public class WhatToMineAsicPojo implements Serializable
{

    @JsonProperty("coins")
    private Coins coins;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<>();
    private final static long serialVersionUID = -5434463614403433482L;

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
        if (!(other instanceof WhatToMineAsicPojo)) {
            return false;
        }
        WhatToMineAsicPojo rhs = ((WhatToMineAsicPojo) other);
        return new EqualsBuilder().append(coins, rhs.coins).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
