package no.nav.tjenester.ereg.organisasjon.v1;

import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode(callSuper = true)
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@ApiModel(description = "Informasjon om virksomhet", parent = Organisasjon.class)
@JsonPropertyOrder({
        "organisasjonsnummer",
        "type",
        "navn",
        "organisasjonDetaljer",
        "virksomhetDetaljer",
        "bestaarAvOrgledd",
        "inngaarIJuridiskEnheter"
})
public class Virksomhet extends Organisasjon {

    @ApiModelProperty(notes = "Liste av hvilke organisasjonsledd virksomhet best&aring;r av")
    private List<BestaarAvOrganisasjonsledd> bestaarAvOrganisasjonsledd;

    @ApiModelProperty(notes = "Liste av hvilke(n) juridisk enhet virksomhet inng&aring;r i")
    private List<InngaarIJuridiskEnhet> inngaarIJuridiskEnheter;

    @ApiModelProperty(notes = "Liste av detaljer for virksomhet")
    private VirksomhetDetaljer virksomhetDetaljer;

    /**
     * Gets the value of the bestaarAvOrgledd property.
     * <p>
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the bestaarAvOrgledd property.
     * <p>
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBestaarAvOrgledd().add(newItem);
     * </pre>
     * <p>
     * <p>
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BestaarAvOrganisasjonsledd }
     */
    public List<BestaarAvOrganisasjonsledd> getBestaarAvOrganisasjonsledd() {
        if (bestaarAvOrganisasjonsledd == null) {
            bestaarAvOrganisasjonsledd = new ArrayList<>();
        }
        return this.bestaarAvOrganisasjonsledd;
    }

    /**
     * Gets the value of the inngaarIJuridiskEnheter property.
     * <p>
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the inngaarIJuridiskEnheter property.
     * <p>
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInngaarIJuridiskEnheter().add(newItem);
     * </pre>
     * <p>
     * <p>
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InngaarIJuridiskEnhet }
     */
    public List<InngaarIJuridiskEnhet> getInngaarIJuridiskEnheter() {
        if (inngaarIJuridiskEnheter == null) {
            inngaarIJuridiskEnheter = new ArrayList<>();
        }
        return this.inngaarIJuridiskEnheter;
    }
}
