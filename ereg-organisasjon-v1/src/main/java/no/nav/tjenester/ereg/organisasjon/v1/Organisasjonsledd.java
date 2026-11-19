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
@ApiModel(description = "Informasjon om organisasjonsledd", parent = Organisasjon.class)
@JsonPropertyOrder({
        "organisasjonsnummer",
        "type",
        "navn",
        "organisasjonDetaljer",
        "organisasjonsleddDetaljer",
        "driverVirksomheter",
        "inngaarIJuridiskEnheter",
        "organisasjonsleddUnder",
        "organisasjonsleddOver"
})
public class Organisasjonsledd extends Organisasjon {

    @ApiModelProperty(notes = "Liste av hvilke organisasjonsledd som ligger under organisasjonsledd")
    private List<BestaarAvOrganisasjonsledd> organisasjonsleddUnder;

    @ApiModelProperty(notes = "Liste av hvilke organisasjonsledd som ligger over organisasjonsledd")
    private List<BestaarAvOrganisasjonsledd> organisasjonsleddOver;

    @ApiModelProperty(notes = "Liste av virksomhet(er) som drives av organisasjonsledd")
    private List<DriverVirksomhet> driverVirksomheter;

    @ApiModelProperty(notes = "Liste av hvilke(n) juridisk enhet organisasjonsledd inng&aring;r i")
    private List<InngaarIJuridiskEnhet> inngaarIJuridiskEnheter;

    @ApiModelProperty(notes = "Liste av detaljer for organisasjonsledd")
    private OrganisasjonsleddDetaljer organisasjonsleddDetaljer;

    //    @Override
    //    public String getType() {
    //        return this.getClass().getSimpleName();
    //    }

    /**
     * Gets the value of the organisasjonsleddUnder property.
     * <p>
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the organisasjonsleddUnder property.
     * <p>
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOrganisasjonsleddUnder().add(newItem);
     * </pre>
     * <p>
     * <p>
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BestaarAvOrganisasjonsledd }
     */
    public List<BestaarAvOrganisasjonsledd> getOrganisasjonsleddUnder() {
        if (organisasjonsleddUnder == null) {
            organisasjonsleddUnder = new ArrayList<>();
        }
        return this.organisasjonsleddUnder;
    }

    /**
     * Gets the value of the organisasjonsleddOver property.
     * <p>
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the organisasjonsleddOver property.
     * <p>
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOrganisasjonsleddOver().add(newItem);
     * </pre>
     * <p>
     * <p>
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BestaarAvOrganisasjonsledd }
     */
    public List<BestaarAvOrganisasjonsledd> getOrganisasjonsleddOver() {
        if (organisasjonsleddOver == null) {
            organisasjonsleddOver = new ArrayList<>();
        }
        return this.organisasjonsleddOver;
    }

    /**
     * Gets the value of the driverVirksomhet property.
     * <p>
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the driverVirksomhet property.
     * <p>
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDriverVirksomhet().add(newItem);
     * </pre>
     * <p>
     * <p>
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DriverVirksomhet }
     */
    public List<DriverVirksomhet> getDriverVirksomheter() {
        if (driverVirksomheter == null) {
            driverVirksomheter = new ArrayList<>();
        }
        return this.driverVirksomheter;
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
