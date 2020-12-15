
package fr.diginamic.jackson.beans;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "annee",
    "montant",
    "unite"
})
public class ChiffreAffaire {

    @JsonProperty("annee")
    private Integer annee;
    @JsonProperty("montant")
    private Double montant;
    @JsonProperty("unite")
    private String unite;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("annee")
    public Integer getAnnee() {
        return annee;
    }

    @JsonProperty("annee")
    public void setAnnee(Integer annee) {
        this.annee = annee;
    }

    @JsonProperty("montant")
    public Double getMontant() {
        return montant;
    }

    @JsonProperty("montant")
    public void setMontant(Double montant) {
        this.montant = montant;
    }

    @JsonProperty("unite")
    public String getUnite() {
        return unite;
    }

    @JsonProperty("unite")
    public void setUnite(String unite) {
        this.unite = unite;
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
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ChiffreAffaire.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("annee");
        sb.append('=');
        sb.append(((this.annee == null)?"<null>":this.annee));
        sb.append(',');
        sb.append("montant");
        sb.append('=');
        sb.append(((this.montant == null)?"<null>":this.montant));
        sb.append(',');
        sb.append("unite");
        sb.append('=');
        sb.append(((this.unite == null)?"<null>":this.unite));
        sb.append(',');
        sb.append("additionalProperties");
        sb.append('=');
        sb.append(((this.additionalProperties == null)?"<null>":this.additionalProperties));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = ((result* 31)+((this.montant == null)? 0 :this.montant.hashCode()));
        result = ((result* 31)+((this.annee == null)? 0 :this.annee.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.unite == null)? 0 :this.unite.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ChiffreAffaire) == false) {
            return false;
        }
        ChiffreAffaire rhs = ((ChiffreAffaire) other);
        return (((((this.montant == rhs.montant)||((this.montant!= null)&&this.montant.equals(rhs.montant)))&&((this.annee == rhs.annee)||((this.annee!= null)&&this.annee.equals(rhs.annee))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.unite == rhs.unite)||((this.unite!= null)&&this.unite.equals(rhs.unite))));
    }

}
