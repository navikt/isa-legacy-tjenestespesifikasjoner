
package no.nav.virksomhet.tjenester.arkiv.journalbehandling.meldinger.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p><span style="font-size:11pt;font-family:Calibri;">Saksbehandler navn skal overføres dersom attributter i Saksrelasjon oppdateres.</span></p><p>Saksrelasjonen brukes til å knytte JournalPoster til en saksId. Fordi man skal beholde knytning mellom sak og Journal selv om denne er feilregistrert er relasjonen et eget objekt</p>
 * 
 * <p>Java class for Saksrelasjon complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Saksrelasjon">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="fagsystemKode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="feilregistrert" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="sakId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="saksrelasjonId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="endretAvNavn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="versjon" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Saksrelasjon", propOrder = {
    "fagsystemKode",
    "feilregistrert",
    "sakId",
    "saksrelasjonId",
    "endretAvNavn",
    "versjon"
})
public class Saksrelasjon {

    @XmlElement(required = true)
    protected String fagsystemKode;
    protected Boolean feilregistrert;
    @XmlElement(required = true)
    protected String sakId;
    protected Long saksrelasjonId;
    protected String endretAvNavn;
    protected Long versjon;

    /**
     * Gets the value of the fagsystemKode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFagsystemKode() {
        return fagsystemKode;
    }

    /**
     * Sets the value of the fagsystemKode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFagsystemKode(String value) {
        this.fagsystemKode = value;
    }

    /**
     * Gets the value of the feilregistrert property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFeilregistrert() {
        return feilregistrert;
    }

    /**
     * Sets the value of the feilregistrert property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFeilregistrert(Boolean value) {
        this.feilregistrert = value;
    }

    /**
     * Gets the value of the sakId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSakId() {
        return sakId;
    }

    /**
     * Sets the value of the sakId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSakId(String value) {
        this.sakId = value;
    }

    /**
     * Gets the value of the saksrelasjonId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getSaksrelasjonId() {
        return saksrelasjonId;
    }

    /**
     * Sets the value of the saksrelasjonId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setSaksrelasjonId(Long value) {
        this.saksrelasjonId = value;
    }

    /**
     * Gets the value of the endretAvNavn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEndretAvNavn() {
        return endretAvNavn;
    }

    /**
     * Sets the value of the endretAvNavn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEndretAvNavn(String value) {
        this.endretAvNavn = value;
    }

    /**
     * Gets the value of the versjon property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getVersjon() {
        return versjon;
    }

    /**
     * Sets the value of the versjon property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setVersjon(Long value) {
        this.versjon = value;
    }

}
