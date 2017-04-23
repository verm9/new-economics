
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
    "Peercoin",
    "MonetaryUnit",
    "Deutsche eMark",
    "DGC-Scrypt",
    "Nicehash-SHA",
    "Nicehash-Quark",
    "Nicehash-Qubit",
    "DGB-SHA",
    "Geocoin",
    "Bitcoin",
    "Nicehash-X11",
    "Dash",
    "DGC-X11",
    "Goldblocks",
    "Mazacoin",
    "GameCredits",
    "DGC-SHA",
    "Litecoin",
    "DGB-Scrypt",
    "Belacoin",
    "Einsteinium",
    "Nicehash-Scrypt",
    "DGB-Qubit",
    "AUR-Scrypt",
    "Worldcoin",
    "Bata",
    "Novacoin",
    "Verge",
    "DNotes",
    "Quark",
    "Crown",
    "Curecoin",
    "Startcoin",
    "Scorecoin",
    "Adzcoin",
    "Smartcoin",
    "Zetacoin",
    "Influxcoin",
    "Dogecoin",
    "Myriad-SHA",
    "Viacoin",
    "Unobtanium",
    "Myriad-Scrypt"
})
public class Coins implements Serializable
{

    @JsonProperty("Peercoin")
    private Peercoin peercoin;
    @JsonProperty("MonetaryUnit")
    private MonetaryUnit monetaryUnit;
    @JsonProperty("Deutsche eMark")
    private DeutscheEMark deutscheEMark;
    @JsonProperty("DGC-Scrypt")
    private DGCScrypt dGCScrypt;
    @JsonProperty("Nicehash-SHA")
    private NicehashSHA nicehashSHA;
    @JsonProperty("Nicehash-Quark")
    private NicehashQuark nicehashQuark;
    @JsonProperty("Nicehash-Qubit")
    private NicehashQubit nicehashQubit;
    @JsonProperty("DGB-SHA")
    private DGBSHA dGBSHA;
    @JsonProperty("Geocoin")
    private Geocoin geocoin;
    @JsonProperty("Bitcoin")
    private Bitcoin bitcoin;
    @JsonProperty("Nicehash-X11")
    private NicehashX11 nicehashX11;
    @JsonProperty("Dash")
    private Dash dash;
    @JsonProperty("DGC-X11")
    private DGCX11 dGCX11;
    @JsonProperty("Goldblocks")
    private Goldblocks goldblocks;
    @JsonProperty("Mazacoin")
    private Mazacoin mazacoin;
    @JsonProperty("GameCredits")
    private GameCredits gameCredits;
    @JsonProperty("DGC-SHA")
    private DGCSHA dGCSHA;
    @JsonProperty("Litecoin")
    private Litecoin litecoin;
    @JsonProperty("DGB-Scrypt")
    private DGBScrypt dGBScrypt;
    @JsonProperty("Belacoin")
    private Belacoin belacoin;
    @JsonProperty("Einsteinium")
    private Einsteinium einsteinium;
    @JsonProperty("Nicehash-Scrypt")
    private NicehashScrypt nicehashScrypt;
    @JsonProperty("DGB-Qubit")
    private DGBQubit dGBQubit;
    @JsonProperty("AUR-Scrypt")
    private AURScrypt aURScrypt;
    @JsonProperty("Worldcoin")
    private Worldcoin worldcoin;
    @JsonProperty("Bata")
    private Bata bata;
    @JsonProperty("Novacoin")
    private Novacoin novacoin;
    @JsonProperty("Verge")
    private Verge verge;
    @JsonProperty("DNotes")
    private DNotes dNotes;
    @JsonProperty("Quark")
    private Quark quark;
    @JsonProperty("Crown")
    private Crown crown;
    @JsonProperty("Curecoin")
    private Curecoin curecoin;
    @JsonProperty("Startcoin")
    private Startcoin startcoin;
    @JsonProperty("Scorecoin")
    private Scorecoin scorecoin;
    @JsonProperty("Adzcoin")
    private Adzcoin adzcoin;
    @JsonProperty("Smartcoin")
    private Smartcoin smartcoin;
    @JsonProperty("Zetacoin")
    private Zetacoin zetacoin;
    @JsonProperty("Influxcoin")
    private Influxcoin influxcoin;
    @JsonProperty("Dogecoin")
    private Dogecoin dogecoin;
    @JsonProperty("Myriad-SHA")
    private MyriadSHA myriadSHA;
    @JsonProperty("Viacoin")
    private Viacoin viacoin;
    @JsonProperty("Unobtanium")
    private Unobtanium unobtanium;
    @JsonProperty("Myriad-Scrypt")
    private MyriadScrypt myriadScrypt;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = 2263429762738074581L;

    @JsonProperty("Peercoin")
    public Peercoin getPeercoin() {
        return peercoin;
    }

    @JsonProperty("Peercoin")
    public void setPeercoin(Peercoin peercoin) {
        this.peercoin = peercoin;
    }

    @JsonProperty("MonetaryUnit")
    public MonetaryUnit getMonetaryUnit() {
        return monetaryUnit;
    }

    @JsonProperty("MonetaryUnit")
    public void setMonetaryUnit(MonetaryUnit monetaryUnit) {
        this.monetaryUnit = monetaryUnit;
    }

    @JsonProperty("Deutsche eMark")
    public DeutscheEMark getDeutscheEMark() {
        return deutscheEMark;
    }

    @JsonProperty("Deutsche eMark")
    public void setDeutscheEMark(DeutscheEMark deutscheEMark) {
        this.deutscheEMark = deutscheEMark;
    }

    @JsonProperty("DGC-Scrypt")
    public DGCScrypt getDGCScrypt() {
        return dGCScrypt;
    }

    @JsonProperty("DGC-Scrypt")
    public void setDGCScrypt(DGCScrypt dGCScrypt) {
        this.dGCScrypt = dGCScrypt;
    }

    @JsonProperty("Nicehash-SHA")
    public NicehashSHA getNicehashSHA() {
        return nicehashSHA;
    }

    @JsonProperty("Nicehash-SHA")
    public void setNicehashSHA(NicehashSHA nicehashSHA) {
        this.nicehashSHA = nicehashSHA;
    }

    @JsonProperty("Nicehash-Quark")
    public NicehashQuark getNicehashQuark() {
        return nicehashQuark;
    }

    @JsonProperty("Nicehash-Quark")
    public void setNicehashQuark(NicehashQuark nicehashQuark) {
        this.nicehashQuark = nicehashQuark;
    }

    @JsonProperty("Nicehash-Qubit")
    public NicehashQubit getNicehashQubit() {
        return nicehashQubit;
    }

    @JsonProperty("Nicehash-Qubit")
    public void setNicehashQubit(NicehashQubit nicehashQubit) {
        this.nicehashQubit = nicehashQubit;
    }

    @JsonProperty("DGB-SHA")
    public DGBSHA getDGBSHA() {
        return dGBSHA;
    }

    @JsonProperty("DGB-SHA")
    public void setDGBSHA(DGBSHA dGBSHA) {
        this.dGBSHA = dGBSHA;
    }

    @JsonProperty("Geocoin")
    public Geocoin getGeocoin() {
        return geocoin;
    }

    @JsonProperty("Geocoin")
    public void setGeocoin(Geocoin geocoin) {
        this.geocoin = geocoin;
    }

    @JsonProperty("Bitcoin")
    public Bitcoin getBitcoin() {
        return bitcoin;
    }

    @JsonProperty("Bitcoin")
    public void setBitcoin(Bitcoin bitcoin) {
        this.bitcoin = bitcoin;
    }

    @JsonProperty("Nicehash-X11")
    public NicehashX11 getNicehashX11() {
        return nicehashX11;
    }

    @JsonProperty("Nicehash-X11")
    public void setNicehashX11(NicehashX11 nicehashX11) {
        this.nicehashX11 = nicehashX11;
    }

    @JsonProperty("Dash")
    public Dash getDash() {
        return dash;
    }

    @JsonProperty("Dash")
    public void setDash(Dash dash) {
        this.dash = dash;
    }

    @JsonProperty("DGC-X11")
    public DGCX11 getDGCX11() {
        return dGCX11;
    }

    @JsonProperty("DGC-X11")
    public void setDGCX11(DGCX11 dGCX11) {
        this.dGCX11 = dGCX11;
    }

    @JsonProperty("Goldblocks")
    public Goldblocks getGoldblocks() {
        return goldblocks;
    }

    @JsonProperty("Goldblocks")
    public void setGoldblocks(Goldblocks goldblocks) {
        this.goldblocks = goldblocks;
    }

    @JsonProperty("Mazacoin")
    public Mazacoin getMazacoin() {
        return mazacoin;
    }

    @JsonProperty("Mazacoin")
    public void setMazacoin(Mazacoin mazacoin) {
        this.mazacoin = mazacoin;
    }

    @JsonProperty("GameCredits")
    public GameCredits getGameCredits() {
        return gameCredits;
    }

    @JsonProperty("GameCredits")
    public void setGameCredits(GameCredits gameCredits) {
        this.gameCredits = gameCredits;
    }

    @JsonProperty("DGC-SHA")
    public DGCSHA getDGCSHA() {
        return dGCSHA;
    }

    @JsonProperty("DGC-SHA")
    public void setDGCSHA(DGCSHA dGCSHA) {
        this.dGCSHA = dGCSHA;
    }

    @JsonProperty("Litecoin")
    public Litecoin getLitecoin() {
        return litecoin;
    }

    @JsonProperty("Litecoin")
    public void setLitecoin(Litecoin litecoin) {
        this.litecoin = litecoin;
    }

    @JsonProperty("DGB-Scrypt")
    public DGBScrypt getDGBScrypt() {
        return dGBScrypt;
    }

    @JsonProperty("DGB-Scrypt")
    public void setDGBScrypt(DGBScrypt dGBScrypt) {
        this.dGBScrypt = dGBScrypt;
    }

    @JsonProperty("Belacoin")
    public Belacoin getBelacoin() {
        return belacoin;
    }

    @JsonProperty("Belacoin")
    public void setBelacoin(Belacoin belacoin) {
        this.belacoin = belacoin;
    }

    @JsonProperty("Einsteinium")
    public Einsteinium getEinsteinium() {
        return einsteinium;
    }

    @JsonProperty("Einsteinium")
    public void setEinsteinium(Einsteinium einsteinium) {
        this.einsteinium = einsteinium;
    }

    @JsonProperty("Nicehash-Scrypt")
    public NicehashScrypt getNicehashScrypt() {
        return nicehashScrypt;
    }

    @JsonProperty("Nicehash-Scrypt")
    public void setNicehashScrypt(NicehashScrypt nicehashScrypt) {
        this.nicehashScrypt = nicehashScrypt;
    }

    @JsonProperty("DGB-Qubit")
    public DGBQubit getDGBQubit() {
        return dGBQubit;
    }

    @JsonProperty("DGB-Qubit")
    public void setDGBQubit(DGBQubit dGBQubit) {
        this.dGBQubit = dGBQubit;
    }

    @JsonProperty("AUR-Scrypt")
    public AURScrypt getAURScrypt() {
        return aURScrypt;
    }

    @JsonProperty("AUR-Scrypt")
    public void setAURScrypt(AURScrypt aURScrypt) {
        this.aURScrypt = aURScrypt;
    }

    @JsonProperty("Worldcoin")
    public Worldcoin getWorldcoin() {
        return worldcoin;
    }

    @JsonProperty("Worldcoin")
    public void setWorldcoin(Worldcoin worldcoin) {
        this.worldcoin = worldcoin;
    }

    @JsonProperty("Bata")
    public Bata getBata() {
        return bata;
    }

    @JsonProperty("Bata")
    public void setBata(Bata bata) {
        this.bata = bata;
    }

    @JsonProperty("Novacoin")
    public Novacoin getNovacoin() {
        return novacoin;
    }

    @JsonProperty("Novacoin")
    public void setNovacoin(Novacoin novacoin) {
        this.novacoin = novacoin;
    }

    @JsonProperty("Verge")
    public Verge getVerge() {
        return verge;
    }

    @JsonProperty("Verge")
    public void setVerge(Verge verge) {
        this.verge = verge;
    }

    @JsonProperty("DNotes")
    public DNotes getDNotes() {
        return dNotes;
    }

    @JsonProperty("DNotes")
    public void setDNotes(DNotes dNotes) {
        this.dNotes = dNotes;
    }

    @JsonProperty("Quark")
    public Quark getQuark() {
        return quark;
    }

    @JsonProperty("Quark")
    public void setQuark(Quark quark) {
        this.quark = quark;
    }

    @JsonProperty("Crown")
    public Crown getCrown() {
        return crown;
    }

    @JsonProperty("Crown")
    public void setCrown(Crown crown) {
        this.crown = crown;
    }

    @JsonProperty("Curecoin")
    public Curecoin getCurecoin() {
        return curecoin;
    }

    @JsonProperty("Curecoin")
    public void setCurecoin(Curecoin curecoin) {
        this.curecoin = curecoin;
    }

    @JsonProperty("Startcoin")
    public Startcoin getStartcoin() {
        return startcoin;
    }

    @JsonProperty("Startcoin")
    public void setStartcoin(Startcoin startcoin) {
        this.startcoin = startcoin;
    }

    @JsonProperty("Scorecoin")
    public Scorecoin getScorecoin() {
        return scorecoin;
    }

    @JsonProperty("Scorecoin")
    public void setScorecoin(Scorecoin scorecoin) {
        this.scorecoin = scorecoin;
    }

    @JsonProperty("Adzcoin")
    public Adzcoin getAdzcoin() {
        return adzcoin;
    }

    @JsonProperty("Adzcoin")
    public void setAdzcoin(Adzcoin adzcoin) {
        this.adzcoin = adzcoin;
    }

    @JsonProperty("Smartcoin")
    public Smartcoin getSmartcoin() {
        return smartcoin;
    }

    @JsonProperty("Smartcoin")
    public void setSmartcoin(Smartcoin smartcoin) {
        this.smartcoin = smartcoin;
    }

    @JsonProperty("Zetacoin")
    public Zetacoin getZetacoin() {
        return zetacoin;
    }

    @JsonProperty("Zetacoin")
    public void setZetacoin(Zetacoin zetacoin) {
        this.zetacoin = zetacoin;
    }

    @JsonProperty("Influxcoin")
    public Influxcoin getInfluxcoin() {
        return influxcoin;
    }

    @JsonProperty("Influxcoin")
    public void setInfluxcoin(Influxcoin influxcoin) {
        this.influxcoin = influxcoin;
    }

    @JsonProperty("Dogecoin")
    public Dogecoin getDogecoin() {
        return dogecoin;
    }

    @JsonProperty("Dogecoin")
    public void setDogecoin(Dogecoin dogecoin) {
        this.dogecoin = dogecoin;
    }

    @JsonProperty("Myriad-SHA")
    public MyriadSHA getMyriadSHA() {
        return myriadSHA;
    }

    @JsonProperty("Myriad-SHA")
    public void setMyriadSHA(MyriadSHA myriadSHA) {
        this.myriadSHA = myriadSHA;
    }

    @JsonProperty("Viacoin")
    public Viacoin getViacoin() {
        return viacoin;
    }

    @JsonProperty("Viacoin")
    public void setViacoin(Viacoin viacoin) {
        this.viacoin = viacoin;
    }

    @JsonProperty("Unobtanium")
    public Unobtanium getUnobtanium() {
        return unobtanium;
    }

    @JsonProperty("Unobtanium")
    public void setUnobtanium(Unobtanium unobtanium) {
        this.unobtanium = unobtanium;
    }

    @JsonProperty("Myriad-Scrypt")
    public MyriadScrypt getMyriadScrypt() {
        return myriadScrypt;
    }

    @JsonProperty("Myriad-Scrypt")
    public void setMyriadScrypt(MyriadScrypt myriadScrypt) {
        this.myriadScrypt = myriadScrypt;
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
        return new HashCodeBuilder().append(peercoin).append(monetaryUnit).append(deutscheEMark).append(dGCScrypt).append(nicehashSHA).append(nicehashQuark).append(nicehashQubit).append(dGBSHA).append(geocoin).append(bitcoin).append(nicehashX11).append(dash).append(dGCX11).append(goldblocks).append(mazacoin).append(gameCredits).append(dGCSHA).append(litecoin).append(dGBScrypt).append(belacoin).append(einsteinium).append(nicehashScrypt).append(dGBQubit).append(aURScrypt).append(worldcoin).append(bata).append(novacoin).append(verge).append(dNotes).append(quark).append(crown).append(curecoin).append(startcoin).append(scorecoin).append(adzcoin).append(smartcoin).append(zetacoin).append(influxcoin).append(dogecoin).append(myriadSHA).append(viacoin).append(unobtanium).append(myriadScrypt).append(additionalProperties).toHashCode();
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
        return new EqualsBuilder().append(peercoin, rhs.peercoin).append(monetaryUnit, rhs.monetaryUnit).append(deutscheEMark, rhs.deutscheEMark).append(dGCScrypt, rhs.dGCScrypt).append(nicehashSHA, rhs.nicehashSHA).append(nicehashQuark, rhs.nicehashQuark).append(nicehashQubit, rhs.nicehashQubit).append(dGBSHA, rhs.dGBSHA).append(geocoin, rhs.geocoin).append(bitcoin, rhs.bitcoin).append(nicehashX11, rhs.nicehashX11).append(dash, rhs.dash).append(dGCX11, rhs.dGCX11).append(goldblocks, rhs.goldblocks).append(mazacoin, rhs.mazacoin).append(gameCredits, rhs.gameCredits).append(dGCSHA, rhs.dGCSHA).append(litecoin, rhs.litecoin).append(dGBScrypt, rhs.dGBScrypt).append(belacoin, rhs.belacoin).append(einsteinium, rhs.einsteinium).append(nicehashScrypt, rhs.nicehashScrypt).append(dGBQubit, rhs.dGBQubit).append(aURScrypt, rhs.aURScrypt).append(worldcoin, rhs.worldcoin).append(bata, rhs.bata).append(novacoin, rhs.novacoin).append(verge, rhs.verge).append(dNotes, rhs.dNotes).append(quark, rhs.quark).append(crown, rhs.crown).append(curecoin, rhs.curecoin).append(startcoin, rhs.startcoin).append(scorecoin, rhs.scorecoin).append(adzcoin, rhs.adzcoin).append(smartcoin, rhs.smartcoin).append(zetacoin, rhs.zetacoin).append(influxcoin, rhs.influxcoin).append(dogecoin, rhs.dogecoin).append(myriadSHA, rhs.myriadSHA).append(viacoin, rhs.viacoin).append(unobtanium, rhs.unobtanium).append(myriadScrypt, rhs.myriadScrypt).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
