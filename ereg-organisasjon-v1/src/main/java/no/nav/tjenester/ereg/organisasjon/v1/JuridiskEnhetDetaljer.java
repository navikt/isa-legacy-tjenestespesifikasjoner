package no.nav.tjenester.ereg.organisasjon.v1;

import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import io.swagger.annotations.ApiModelProperty;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

/**
 * Juridisk enhet (kalles også juridisk person)
 * <p>
 * En juridisk enhet er et rettssubjekt som uten å være en fysisk person kan ha rettigheter og plikter og foreta rettshandler.
 */
@Getter
@Setter
@EqualsAndHashCode
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
        "enhetstype",
        "harAnsatte",
        "sektorkode",
        "registrertStiftelsesregisteret",
        "kapitalopplysninger",
        "foretaksregisterRegistreringer",
})
public class JuridiskEnhetDetaljer {

    @ApiModelProperty(notes = "Sektorkode (kodeverk: Sektorkoder)", example = "6500")
    private String sektorkode;

    @ApiModelProperty(notes = "Enhetstype - juridisk enhet (kodeverk: EnhetstyperJuridiskEnhet)", example = "ENK")
    private String enhetstype;

    @ApiModelProperty(notes = "Er enhet regisrert i Stiftelsesregisteret?", example = "false")
    private Boolean registrertStiftelsesregisteret;

    @ApiModelProperty(notes = "Har enhet ansatte?", example = "true")
    private Boolean harAnsatte;

    @ApiModelProperty(notes = "Liste med kapitalopplysninger")
    private List<Kapitalopplysninger> kapitalopplysninger;

    @ApiModelProperty(notes = "Liste med registreringer i Foretaksregisteret")
    private List<Foretaksregister> foretaksregisterRegistreringer;

    /**
     * Gets the value of the kapitalopplysninger property.
     * <p>
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the kapitalopplysninger property.
     * <p>
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getKapitalopplysninger().add(newItem);
     * </pre>
     * <p>
     * <p>
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Kapitalopplysninger }
     */
    public List<Kapitalopplysninger> getKapitalopplysninger() {
        if (kapitalopplysninger == null) {
            kapitalopplysninger = new ArrayList<>();
        }
        return this.kapitalopplysninger;
    }

    /**
     * Gets the value of the registrertIForetaksregisteret property.
     * <p>
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the registrertIForetaksregisteret property.
     * <p>
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRegistrertIForetaksregisteret().add(newItem);
     * </pre>
     * <p>
     * <p>
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Foretaksregister }
     */
    public List<Foretaksregister> getForetaksregisterRegistreringer() {
        if (foretaksregisterRegistreringer == null) {
            foretaksregisterRegistreringer = new ArrayList<>();
        }
        return this.foretaksregisterRegistreringer;
    }
}
