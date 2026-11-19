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

/**
 * Juridisk enhet (kalles også juridisk person)
 * <p>
 * En juridisk enhet er et rettssubjekt som uten å være en fysisk person kan ha rettigheter og plikter og foreta rettshandler.
 * <p>
 * En juridisk enhet er øverste nivå i et organisasjonshierarki.
 * <p>
 * Alle organisasjonsformer med unntak av ikkenæringsdrivende virksomhet (AAFY), Bedrift (BEDR) og orgledd (ORGL) betraktes som juridiske enheter. (I noen tilfeller kan et orgledd også betraktes som en juridisk enhet. )
 * <p>
 * Eksempler på juridiske enheter er aksjeselskap, ansvarlig selskap, enkeltpersonforetak, samvirkeforetak, kommune, stat, stiftelser
 */

@Getter
@Setter
@EqualsAndHashCode(callSuper = true)
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@ApiModel(description = "Informasjon om juridisk enhet", parent = Organisasjon.class)
@JsonPropertyOrder({
        "organisasjonsnummer",
        "type",
        "navn",
        "organisasjonDetaljer",
        "juridiskEnhetDetaljer",
        "driverVirksomheter",
        "bestaarAvOrgledd",
        "knytninger",
        "fisjoner",
        "fusjoner"
})
public class JuridiskEnhet extends Organisasjon {

    @ApiModelProperty(notes = "Liste av hvilke organisasjonsledd juridisk enhet best&aring;r av")
    private List<BestaarAvOrganisasjonsledd> bestaarAvOrganisasjonsledd;

    @ApiModelProperty(notes = "Liste av virksomhet(er) som drives av juridisk enhet")
    private List<DriverVirksomhet> driverVirksomheter;

    @ApiModelProperty(notes = "Liste av fisjon(er) for juridisk enhet")
    private List<JuridiskEnhetFisjon> fisjoner;

    @ApiModelProperty(notes = "Liste av fusjon(er) for juridisk enhet")
    private List<JuridiskEnhetFusjon> fusjoner;

    @ApiModelProperty(notes = "Liste av knytninger for juridisk enhet")
    private List<JuridiskEnhetKnytning> knytninger;

    @ApiModelProperty(notes = "Liste av detaljer for juridisk enhet")
    private JuridiskEnhetDetaljer juridiskEnhetDetaljer;

    /**
     * Gets the value of the bestaarAvOrgledd property.
     * <p>
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the object.
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
     * Gets the value of the fisjonJuridiskEnhet property.
     * <p>
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fisjonJuridiskEnhet property.
     * <p>
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFisjonJuridiskEnhet().add(newItem);
     * </pre>
     * <p>
     * <p>
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JuridiskEnhetFisjon }
     */
    public List<JuridiskEnhetFisjon> getFisjoner() {
        if (fisjoner == null) {
            fisjoner = new ArrayList<>();
        }
        return this.fisjoner;
    }

    /**
     * Gets the value of the fusjonJuridiskEnhet property.
     * <p>
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fusjonJuridiskEnhet property.
     * <p>
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFusjonJuridiskEnhet().add(newItem);
     * </pre>
     * <p>
     * <p>
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JuridiskEnhetFusjon }
     */
    public List<JuridiskEnhetFusjon> getFusjoner() {
        if (fusjoner == null) {
            fusjoner = new ArrayList<>();
        }
        return this.fusjoner;
    }

    /**
     * Gets the value of the knytningJuridiskEnhet property.
     * <p>
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the knytningJuridiskEnhet property.
     * <p>
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getKnytningJuridiskEnhet().add(newItem);
     * </pre>
     * <p>
     * <p>
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JuridiskEnhetKnytning }
     */
    public List<JuridiskEnhetKnytning> getKnytninger() {
        if (knytninger == null) {
            knytninger = new ArrayList<>();
        }
        return this.knytninger;
    }

    /**
     * Gets the value of the juridiskEnhetDetaljer property.
     *
     * @return possible object is
     * {@link JuridiskEnhetDetaljer }
     */
    public JuridiskEnhetDetaljer getJuridiskEnhetDetaljer() {
        return juridiskEnhetDetaljer;
    }

    /**
     * Sets the value of the juridiskEnhetDetaljer property.
     *
     * @param value allowed object is
     *              {@link JuridiskEnhetDetaljer }
     */
    public void setJuridiskEnhetDetaljer(JuridiskEnhetDetaljer value) {
        this.juridiskEnhetDetaljer = value;
    }
}
