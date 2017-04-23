
package com.verm9.ne.ds.model.whattominecoins;

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
    "Ethereum",
    "Nicehash-Ethash",
    "EthereumClassic",
    "Decred",
    "Zcash",
    "Ubiq",
    "Nicehash-Equihash",
    "Zclassic",
    "Expanse",
    "Zdash",
    "Monero",
    "Nicehash-CryptoNight",
    "PascalLite",
    "Sibcoin",
    "Nicehash-Blake (14r)",
    "Karbowanec",
    "Diamond",
    "Bipcoin",
    "GroestlCoin",
    "LBRY",
    "Nicehash-Pascal",
    "Nicehash-X11Gost",
    "Pascalcoin",
    "Myriad-Groestl",
    "DGB-Groestl",
    "Nicehash-LBRY",
    "Sia",
    "Monacoin",
    "Vertcoin",
    "Nicehash-Lyra2REv2",
    "DigitalNote",
    "Nicehash-Blake (XVC)",
    "Nicehash-NeoScrypt",
    "Feathercoin",
    "Orbitcoin",
    "Halcyon"
})
public class Coins implements Serializable
{

    @JsonProperty("Ethereum")
    private Ethereum ethereum;
    @JsonProperty("Nicehash-Ethash")
    private NicehashEthash nicehashEthash;
    @JsonProperty("EthereumClassic")
    private EthereumClassic ethereumClassic;
    @JsonProperty("Decred")
    private Decred decred;
    @JsonProperty("Zcash")
    private Zcash zcash;
    @JsonProperty("Ubiq")
    private Ubiq ubiq;
    @JsonProperty("Nicehash-Equihash")
    private NicehashEquihash nicehashEquihash;
    @JsonProperty("Zclassic")
    private Zclassic zclassic;
    @JsonProperty("Expanse")
    private Expanse expanse;
    @JsonProperty("Zdash")
    private Zdash zdash;
    @JsonProperty("Monero")
    private Monero monero;
    @JsonProperty("Nicehash-CryptoNight")
    private NicehashCryptoNight nicehashCryptoNight;
    @JsonProperty("PascalLite")
    private PascalLite pascalLite;
    @JsonProperty("Sibcoin")
    private Sibcoin sibcoin;
    @JsonProperty("Nicehash-Blake (14r)")
    private NicehashBlake14r nicehashBlake14r;
    @JsonProperty("Karbowanec")
    private Karbowanec karbowanec;
    @JsonProperty("Diamond")
    private Diamond diamond;
    @JsonProperty("Bipcoin")
    private Bipcoin bipcoin;
    @JsonProperty("GroestlCoin")
    private GroestlCoin groestlCoin;
    @JsonProperty("LBRY")
    private LBRY lBRY;
    @JsonProperty("Nicehash-Pascal")
    private NicehashPascal nicehashPascal;
    @JsonProperty("Nicehash-X11Gost")
    private NicehashX11Gost nicehashX11Gost;
    @JsonProperty("Pascalcoin")
    private Pascalcoin pascalcoin;
    @JsonProperty("Myriad-Groestl")
    private MyriadGroestl myriadGroestl;
    @JsonProperty("DGB-Groestl")
    private DGBGroestl dGBGroestl;
    @JsonProperty("Nicehash-LBRY")
    private NicehashLBRY nicehashLBRY;
    @JsonProperty("Sia")
    private Sia sia;
    @JsonProperty("Monacoin")
    private Monacoin monacoin;
    @JsonProperty("Vertcoin")
    private Vertcoin vertcoin;
    @JsonProperty("Nicehash-Lyra2REv2")
    private NicehashLyra2REv2 nicehashLyra2REv2;
    @JsonProperty("DigitalNote")
    private DigitalNote digitalNote;
    @JsonProperty("Nicehash-Blake (XVC)")
    private NicehashBlakeXVC nicehashBlakeXVC;
    @JsonProperty("Nicehash-NeoScrypt")
    private NicehashNeoScrypt nicehashNeoScrypt;
    @JsonProperty("Feathercoin")
    private Feathercoin feathercoin;
    @JsonProperty("Orbitcoin")
    private Orbitcoin orbitcoin;
    @JsonProperty("Halcyon")
    private Halcyon halcyon;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = 5678198576505568966L;

    @JsonProperty("Ethereum")
    public Ethereum getEthereum() {
        return ethereum;
    }

    @JsonProperty("Ethereum")
    public void setEthereum(Ethereum ethereum) {
        this.ethereum = ethereum;
    }

    @JsonProperty("Nicehash-Ethash")
    public NicehashEthash getNicehashEthash() {
        return nicehashEthash;
    }

    @JsonProperty("Nicehash-Ethash")
    public void setNicehashEthash(NicehashEthash nicehashEthash) {
        this.nicehashEthash = nicehashEthash;
    }

    @JsonProperty("EthereumClassic")
    public EthereumClassic getEthereumClassic() {
        return ethereumClassic;
    }

    @JsonProperty("EthereumClassic")
    public void setEthereumClassic(EthereumClassic ethereumClassic) {
        this.ethereumClassic = ethereumClassic;
    }

    @JsonProperty("Decred")
    public Decred getDecred() {
        return decred;
    }

    @JsonProperty("Decred")
    public void setDecred(Decred decred) {
        this.decred = decred;
    }

    @JsonProperty("Zcash")
    public Zcash getZcash() {
        return zcash;
    }

    @JsonProperty("Zcash")
    public void setZcash(Zcash zcash) {
        this.zcash = zcash;
    }

    @JsonProperty("Ubiq")
    public Ubiq getUbiq() {
        return ubiq;
    }

    @JsonProperty("Ubiq")
    public void setUbiq(Ubiq ubiq) {
        this.ubiq = ubiq;
    }

    @JsonProperty("Nicehash-Equihash")
    public NicehashEquihash getNicehashEquihash() {
        return nicehashEquihash;
    }

    @JsonProperty("Nicehash-Equihash")
    public void setNicehashEquihash(NicehashEquihash nicehashEquihash) {
        this.nicehashEquihash = nicehashEquihash;
    }

    @JsonProperty("Zclassic")
    public Zclassic getZclassic() {
        return zclassic;
    }

    @JsonProperty("Zclassic")
    public void setZclassic(Zclassic zclassic) {
        this.zclassic = zclassic;
    }

    @JsonProperty("Expanse")
    public Expanse getExpanse() {
        return expanse;
    }

    @JsonProperty("Expanse")
    public void setExpanse(Expanse expanse) {
        this.expanse = expanse;
    }

    @JsonProperty("Zdash")
    public Zdash getZdash() {
        return zdash;
    }

    @JsonProperty("Zdash")
    public void setZdash(Zdash zdash) {
        this.zdash = zdash;
    }

    @JsonProperty("Monero")
    public Monero getMonero() {
        return monero;
    }

    @JsonProperty("Monero")
    public void setMonero(Monero monero) {
        this.monero = monero;
    }

    @JsonProperty("Nicehash-CryptoNight")
    public NicehashCryptoNight getNicehashCryptoNight() {
        return nicehashCryptoNight;
    }

    @JsonProperty("Nicehash-CryptoNight")
    public void setNicehashCryptoNight(NicehashCryptoNight nicehashCryptoNight) {
        this.nicehashCryptoNight = nicehashCryptoNight;
    }

    @JsonProperty("PascalLite")
    public PascalLite getPascalLite() {
        return pascalLite;
    }

    @JsonProperty("PascalLite")
    public void setPascalLite(PascalLite pascalLite) {
        this.pascalLite = pascalLite;
    }

    @JsonProperty("Sibcoin")
    public Sibcoin getSibcoin() {
        return sibcoin;
    }

    @JsonProperty("Sibcoin")
    public void setSibcoin(Sibcoin sibcoin) {
        this.sibcoin = sibcoin;
    }

    @JsonProperty("Nicehash-Blake (14r)")
    public NicehashBlake14r getNicehashBlake14r() {
        return nicehashBlake14r;
    }

    @JsonProperty("Nicehash-Blake (14r)")
    public void setNicehashBlake14r(NicehashBlake14r nicehashBlake14r) {
        this.nicehashBlake14r = nicehashBlake14r;
    }

    @JsonProperty("Karbowanec")
    public Karbowanec getKarbowanec() {
        return karbowanec;
    }

    @JsonProperty("Karbowanec")
    public void setKarbowanec(Karbowanec karbowanec) {
        this.karbowanec = karbowanec;
    }

    @JsonProperty("Diamond")
    public Diamond getDiamond() {
        return diamond;
    }

    @JsonProperty("Diamond")
    public void setDiamond(Diamond diamond) {
        this.diamond = diamond;
    }

    @JsonProperty("Bipcoin")
    public Bipcoin getBipcoin() {
        return bipcoin;
    }

    @JsonProperty("Bipcoin")
    public void setBipcoin(Bipcoin bipcoin) {
        this.bipcoin = bipcoin;
    }

    @JsonProperty("GroestlCoin")
    public GroestlCoin getGroestlCoin() {
        return groestlCoin;
    }

    @JsonProperty("GroestlCoin")
    public void setGroestlCoin(GroestlCoin groestlCoin) {
        this.groestlCoin = groestlCoin;
    }

    @JsonProperty("LBRY")
    public LBRY getLBRY() {
        return lBRY;
    }

    @JsonProperty("LBRY")
    public void setLBRY(LBRY lBRY) {
        this.lBRY = lBRY;
    }

    @JsonProperty("Nicehash-Pascal")
    public NicehashPascal getNicehashPascal() {
        return nicehashPascal;
    }

    @JsonProperty("Nicehash-Pascal")
    public void setNicehashPascal(NicehashPascal nicehashPascal) {
        this.nicehashPascal = nicehashPascal;
    }

    @JsonProperty("Nicehash-X11Gost")
    public NicehashX11Gost getNicehashX11Gost() {
        return nicehashX11Gost;
    }

    @JsonProperty("Nicehash-X11Gost")
    public void setNicehashX11Gost(NicehashX11Gost nicehashX11Gost) {
        this.nicehashX11Gost = nicehashX11Gost;
    }

    @JsonProperty("Pascalcoin")
    public Pascalcoin getPascalcoin() {
        return pascalcoin;
    }

    @JsonProperty("Pascalcoin")
    public void setPascalcoin(Pascalcoin pascalcoin) {
        this.pascalcoin = pascalcoin;
    }

    @JsonProperty("Myriad-Groestl")
    public MyriadGroestl getMyriadGroestl() {
        return myriadGroestl;
    }

    @JsonProperty("Myriad-Groestl")
    public void setMyriadGroestl(MyriadGroestl myriadGroestl) {
        this.myriadGroestl = myriadGroestl;
    }

    @JsonProperty("DGB-Groestl")
    public DGBGroestl getDGBGroestl() {
        return dGBGroestl;
    }

    @JsonProperty("DGB-Groestl")
    public void setDGBGroestl(DGBGroestl dGBGroestl) {
        this.dGBGroestl = dGBGroestl;
    }

    @JsonProperty("Nicehash-LBRY")
    public NicehashLBRY getNicehashLBRY() {
        return nicehashLBRY;
    }

    @JsonProperty("Nicehash-LBRY")
    public void setNicehashLBRY(NicehashLBRY nicehashLBRY) {
        this.nicehashLBRY = nicehashLBRY;
    }

    @JsonProperty("Sia")
    public Sia getSia() {
        return sia;
    }

    @JsonProperty("Sia")
    public void setSia(Sia sia) {
        this.sia = sia;
    }

    @JsonProperty("Monacoin")
    public Monacoin getMonacoin() {
        return monacoin;
    }

    @JsonProperty("Monacoin")
    public void setMonacoin(Monacoin monacoin) {
        this.monacoin = monacoin;
    }

    @JsonProperty("Vertcoin")
    public Vertcoin getVertcoin() {
        return vertcoin;
    }

    @JsonProperty("Vertcoin")
    public void setVertcoin(Vertcoin vertcoin) {
        this.vertcoin = vertcoin;
    }

    @JsonProperty("Nicehash-Lyra2REv2")
    public NicehashLyra2REv2 getNicehashLyra2REv2() {
        return nicehashLyra2REv2;
    }

    @JsonProperty("Nicehash-Lyra2REv2")
    public void setNicehashLyra2REv2(NicehashLyra2REv2 nicehashLyra2REv2) {
        this.nicehashLyra2REv2 = nicehashLyra2REv2;
    }

    @JsonProperty("DigitalNote")
    public DigitalNote getDigitalNote() {
        return digitalNote;
    }

    @JsonProperty("DigitalNote")
    public void setDigitalNote(DigitalNote digitalNote) {
        this.digitalNote = digitalNote;
    }

    @JsonProperty("Nicehash-Blake (XVC)")
    public NicehashBlakeXVC getNicehashBlakeXVC() {
        return nicehashBlakeXVC;
    }

    @JsonProperty("Nicehash-Blake (XVC)")
    public void setNicehashBlakeXVC(NicehashBlakeXVC nicehashBlakeXVC) {
        this.nicehashBlakeXVC = nicehashBlakeXVC;
    }

    @JsonProperty("Nicehash-NeoScrypt")
    public NicehashNeoScrypt getNicehashNeoScrypt() {
        return nicehashNeoScrypt;
    }

    @JsonProperty("Nicehash-NeoScrypt")
    public void setNicehashNeoScrypt(NicehashNeoScrypt nicehashNeoScrypt) {
        this.nicehashNeoScrypt = nicehashNeoScrypt;
    }

    @JsonProperty("Feathercoin")
    public Feathercoin getFeathercoin() {
        return feathercoin;
    }

    @JsonProperty("Feathercoin")
    public void setFeathercoin(Feathercoin feathercoin) {
        this.feathercoin = feathercoin;
    }

    @JsonProperty("Orbitcoin")
    public Orbitcoin getOrbitcoin() {
        return orbitcoin;
    }

    @JsonProperty("Orbitcoin")
    public void setOrbitcoin(Orbitcoin orbitcoin) {
        this.orbitcoin = orbitcoin;
    }

    @JsonProperty("Halcyon")
    public Halcyon getHalcyon() {
        return halcyon;
    }

    @JsonProperty("Halcyon")
    public void setHalcyon(Halcyon halcyon) {
        this.halcyon = halcyon;
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
        return new HashCodeBuilder().append(ethereum).append(nicehashEthash).append(ethereumClassic).append(decred).append(zcash).append(ubiq).append(nicehashEquihash).append(zclassic).append(expanse).append(zdash).append(monero).append(nicehashCryptoNight).append(pascalLite).append(sibcoin).append(nicehashBlake14r).append(karbowanec).append(diamond).append(bipcoin).append(groestlCoin).append(lBRY).append(nicehashPascal).append(nicehashX11Gost).append(pascalcoin).append(myriadGroestl).append(dGBGroestl).append(nicehashLBRY).append(sia).append(monacoin).append(vertcoin).append(nicehashLyra2REv2).append(digitalNote).append(nicehashBlakeXVC).append(nicehashNeoScrypt).append(feathercoin).append(orbitcoin).append(halcyon).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Coins) == false) {
            return false;
        }
        Coins rhs = ((Coins) other);
        return new EqualsBuilder().append(ethereum, rhs.ethereum).append(nicehashEthash, rhs.nicehashEthash).append(ethereumClassic, rhs.ethereumClassic).append(decred, rhs.decred).append(zcash, rhs.zcash).append(ubiq, rhs.ubiq).append(nicehashEquihash, rhs.nicehashEquihash).append(zclassic, rhs.zclassic).append(expanse, rhs.expanse).append(zdash, rhs.zdash).append(monero, rhs.monero).append(nicehashCryptoNight, rhs.nicehashCryptoNight).append(pascalLite, rhs.pascalLite).append(sibcoin, rhs.sibcoin).append(nicehashBlake14r, rhs.nicehashBlake14r).append(karbowanec, rhs.karbowanec).append(diamond, rhs.diamond).append(bipcoin, rhs.bipcoin).append(groestlCoin, rhs.groestlCoin).append(lBRY, rhs.lBRY).append(nicehashPascal, rhs.nicehashPascal).append(nicehashX11Gost, rhs.nicehashX11Gost).append(pascalcoin, rhs.pascalcoin).append(myriadGroestl, rhs.myriadGroestl).append(dGBGroestl, rhs.dGBGroestl).append(nicehashLBRY, rhs.nicehashLBRY).append(sia, rhs.sia).append(monacoin, rhs.monacoin).append(vertcoin, rhs.vertcoin).append(nicehashLyra2REv2, rhs.nicehashLyra2REv2).append(digitalNote, rhs.digitalNote).append(nicehashBlakeXVC, rhs.nicehashBlakeXVC).append(nicehashNeoScrypt, rhs.nicehashNeoScrypt).append(feathercoin, rhs.feathercoin).append(orbitcoin, rhs.orbitcoin).append(halcyon, rhs.halcyon).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
