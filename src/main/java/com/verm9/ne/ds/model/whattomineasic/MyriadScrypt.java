
package com.verm9.ne.ds.model.whattomineasic;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "tag",
    "algorithm",
    "block_time",
    "block_reward",
    "block_reward24",
    "last_block",
    "difficulty",
    "difficulty24",
    "nethash",
    "exchange_rate",
    "exchange_rate24",
    "exchange_rate_vol",
    "exchange_rate_curr",
    "market_cap",
    "estimated_rewards",
    "estimated_rewards24",
    "btc_revenue",
    "btc_revenue24",
    "profitability",
    "profitability24",
    "lagging",
    "timestamp"
})
public class MyriadScrypt implements Serializable
{

    @JsonProperty("tag")
    private String tag;
    @JsonProperty("algorithm")
    private String algorithm;
    @JsonProperty("block_time")
    private String blockTime;
    @JsonProperty("block_reward")
    private Double blockReward;
    @JsonProperty("block_reward24")
    private Double blockReward24;
    @JsonProperty("last_block")
    private Integer lastBlock;
    @JsonProperty("difficulty")
    private Double difficulty;
    @JsonProperty("difficulty24")
    private Double difficulty24;
    @JsonProperty("nethash")
    private String nethash;
    @JsonProperty("exchange_rate")
    private Double exchangeRate;
    @JsonProperty("exchange_rate24")
    private Double exchangeRate24;
    @JsonProperty("exchange_rate_vol")
    private Double exchangeRateVol;
    @JsonProperty("exchange_rate_curr")
    private String exchangeRateCurr;
    @JsonProperty("market_cap")
    private String marketCap;
    @JsonProperty("estimated_rewards")
    private String estimatedRewards;
    @JsonProperty("estimated_rewards24")
    private String estimatedRewards24;
    @JsonProperty("btc_revenue")
    private String btcRevenue;
    @JsonProperty("btc_revenue24")
    private String btcRevenue24;
    @JsonProperty("profitability")
    private Integer profitability;
    @JsonProperty("profitability24")
    private Integer profitability24;
    @JsonProperty("lagging")
    private Boolean lagging;
    @JsonProperty("timestamp")
    private Integer timestamp;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = -205304311198521164L;

    @JsonProperty("tag")
    public String getTag() {
        return tag;
    }

    @JsonProperty("tag")
    public void setTag(String tag) {
        this.tag = tag;
    }

    @JsonProperty("algorithm")
    public String getAlgorithm() {
        return algorithm;
    }

    @JsonProperty("algorithm")
    public void setAlgorithm(String algorithm) {
        this.algorithm = algorithm;
    }

    @JsonProperty("block_time")
    public String getBlockTime() {
        return blockTime;
    }

    @JsonProperty("block_time")
    public void setBlockTime(String blockTime) {
        this.blockTime = blockTime;
    }

    @JsonProperty("block_reward")
    public Double getBlockReward() {
        return blockReward;
    }

    @JsonProperty("block_reward")
    public void setBlockReward(Double blockReward) {
        this.blockReward = blockReward;
    }

    @JsonProperty("block_reward24")
    public Double getBlockReward24() {
        return blockReward24;
    }

    @JsonProperty("block_reward24")
    public void setBlockReward24(Double blockReward24) {
        this.blockReward24 = blockReward24;
    }

    @JsonProperty("last_block")
    public Integer getLastBlock() {
        return lastBlock;
    }

    @JsonProperty("last_block")
    public void setLastBlock(Integer lastBlock) {
        this.lastBlock = lastBlock;
    }

    @JsonProperty("difficulty")
    public Double getDifficulty() {
        return difficulty;
    }

    @JsonProperty("difficulty")
    public void setDifficulty(Double difficulty) {
        this.difficulty = difficulty;
    }

    @JsonProperty("difficulty24")
    public Double getDifficulty24() {
        return difficulty24;
    }

    @JsonProperty("difficulty24")
    public void setDifficulty24(Double difficulty24) {
        this.difficulty24 = difficulty24;
    }

    @JsonProperty("nethash")
    public String getNethash() {
        return nethash;
    }

    @JsonProperty("nethash")
    public void setNethash(String nethash) {
        this.nethash = nethash;
    }

    @JsonProperty("exchange_rate")
    public Double getExchangeRate() {
        return exchangeRate;
    }

    @JsonProperty("exchange_rate")
    public void setExchangeRate(Double exchangeRate) {
        this.exchangeRate = exchangeRate;
    }

    @JsonProperty("exchange_rate24")
    public Double getExchangeRate24() {
        return exchangeRate24;
    }

    @JsonProperty("exchange_rate24")
    public void setExchangeRate24(Double exchangeRate24) {
        this.exchangeRate24 = exchangeRate24;
    }

    @JsonProperty("exchange_rate_vol")
    public Double getExchangeRateVol() {
        return exchangeRateVol;
    }

    @JsonProperty("exchange_rate_vol")
    public void setExchangeRateVol(Double exchangeRateVol) {
        this.exchangeRateVol = exchangeRateVol;
    }

    @JsonProperty("exchange_rate_curr")
    public String getExchangeRateCurr() {
        return exchangeRateCurr;
    }

    @JsonProperty("exchange_rate_curr")
    public void setExchangeRateCurr(String exchangeRateCurr) {
        this.exchangeRateCurr = exchangeRateCurr;
    }

    @JsonProperty("market_cap")
    public String getMarketCap() {
        return marketCap;
    }

    @JsonProperty("market_cap")
    public void setMarketCap(String marketCap) {
        this.marketCap = marketCap;
    }

    @JsonProperty("estimated_rewards")
    public String getEstimatedRewards() {
        return estimatedRewards;
    }

    @JsonProperty("estimated_rewards")
    public void setEstimatedRewards(String estimatedRewards) {
        this.estimatedRewards = estimatedRewards;
    }

    @JsonProperty("estimated_rewards24")
    public String getEstimatedRewards24() {
        return estimatedRewards24;
    }

    @JsonProperty("estimated_rewards24")
    public void setEstimatedRewards24(String estimatedRewards24) {
        this.estimatedRewards24 = estimatedRewards24;
    }

    @JsonProperty("btc_revenue")
    public String getBtcRevenue() {
        return btcRevenue;
    }

    @JsonProperty("btc_revenue")
    public void setBtcRevenue(String btcRevenue) {
        this.btcRevenue = btcRevenue;
    }

    @JsonProperty("btc_revenue24")
    public String getBtcRevenue24() {
        return btcRevenue24;
    }

    @JsonProperty("btc_revenue24")
    public void setBtcRevenue24(String btcRevenue24) {
        this.btcRevenue24 = btcRevenue24;
    }

    @JsonProperty("profitability")
    public Integer getProfitability() {
        return profitability;
    }

    @JsonProperty("profitability")
    public void setProfitability(Integer profitability) {
        this.profitability = profitability;
    }

    @JsonProperty("profitability24")
    public Integer getProfitability24() {
        return profitability24;
    }

    @JsonProperty("profitability24")
    public void setProfitability24(Integer profitability24) {
        this.profitability24 = profitability24;
    }

    @JsonProperty("lagging")
    public Boolean getLagging() {
        return lagging;
    }

    @JsonProperty("lagging")
    public void setLagging(Boolean lagging) {
        this.lagging = lagging;
    }

    @JsonProperty("timestamp")
    public Integer getTimestamp() {
        return timestamp;
    }

    @JsonProperty("timestamp")
    public void setTimestamp(Integer timestamp) {
        this.timestamp = timestamp;
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
        return new HashCodeBuilder().append(tag).append(algorithm).append(blockTime).append(blockReward).append(blockReward24).append(lastBlock).append(difficulty).append(difficulty24).append(nethash).append(exchangeRate).append(exchangeRate24).append(exchangeRateVol).append(exchangeRateCurr).append(marketCap).append(estimatedRewards).append(estimatedRewards24).append(btcRevenue).append(btcRevenue24).append(profitability).append(profitability24).append(lagging).append(timestamp).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof MyriadScrypt) == false) {
            return false;
        }
        MyriadScrypt rhs = ((MyriadScrypt) other);
        return new EqualsBuilder().append(tag, rhs.tag).append(algorithm, rhs.algorithm).append(blockTime, rhs.blockTime).append(blockReward, rhs.blockReward).append(blockReward24, rhs.blockReward24).append(lastBlock, rhs.lastBlock).append(difficulty, rhs.difficulty).append(difficulty24, rhs.difficulty24).append(nethash, rhs.nethash).append(exchangeRate, rhs.exchangeRate).append(exchangeRate24, rhs.exchangeRate24).append(exchangeRateVol, rhs.exchangeRateVol).append(exchangeRateCurr, rhs.exchangeRateCurr).append(marketCap, rhs.marketCap).append(estimatedRewards, rhs.estimatedRewards).append(estimatedRewards24, rhs.estimatedRewards24).append(btcRevenue, rhs.btcRevenue).append(btcRevenue24, rhs.btcRevenue24).append(profitability, rhs.profitability).append(profitability24, rhs.profitability24).append(lagging, rhs.lagging).append(timestamp, rhs.timestamp).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
