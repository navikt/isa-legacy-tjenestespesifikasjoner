
package no.nav.virksomhet.tjenester.arkiv.journalbehandling.meldinger.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LagreRedigerbartDokumentOgOpprettJournalpostRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LagreRedigerbartDokumentOgOpprettJournalpostRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="redigerbartDokument" type="{http://www.w3.org/2001/XMLSchema}base64Binary"/>
 *         &lt;element name="sakId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="fagsystemKode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="fagomradeKode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="journalforendeEnhetId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="opprettetAvNavn" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="tittel" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="mottaker" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="mottakerId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="landKode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="brukerId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="brukerTypeKode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="brevkodeId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="sensitivt" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LagreRedigerbartDokumentOgOpprettJournalpostRequest", propOrder = {
    "redigerbartDokument",
    "sakId",
    "fagsystemKode",
    "fagomradeKode",
    "journalforendeEnhetId",
    "opprettetAvNavn",
    "tittel",
    "mottaker",
    "mottakerId",
    "landKode",
    "brukerId",
    "brukerTypeKode",
    "brevkodeId",
    "sensitivt"
})
public class LagreRedigerbartDokumentOgOpprettJournalpostRequest {

    @XmlElement(required = true)
    protected byte[] redigerbartDokument;
    @XmlElement(required = true)
    protected String sakId;
    @XmlElement(required = true)
    protected String fagsystemKode;
    @XmlElement(required = true)
    protected String fagomradeKode;
    @XmlElement(required = true)
    protected String journalforendeEnhetId;
    @XmlElement(required = true)
    protected String opprettetAvNavn;
    @XmlElement(required = true)
    protected String tittel;
    protected String mottaker;
    protected String mottakerId;
    protected String landKode;
    @XmlElement(required = true)
    protected String brukerId;
    @XmlElement(required = true)
    protected String brukerTypeKode;
    @XmlElement(required = true)
    protected String brevkodeId;
    protected boolean sensitivt;

    /**
     * Gets the value of the redigerbartDokument property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getRedigerbartDokument() {
        return redigerbartDokument;
    }

    /**
     * Sets the value of the redigerbartDokument property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setRedigerbartDokument(byte[] value) {
        this.redigerbartDokument = ((byte[]) value);
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
     * Gets the value of the fagomradeKode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFagomradeKode() {
        return fagomradeKode;
    }

    /**
     * Sets the value of the fagomradeKode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFagomradeKode(String value) {
        this.fagomradeKode = value;
    }

    /**
     * Gets the value of the journalforendeEnhetId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJournalforendeEnhetId() {
        return journalforendeEnhetId;
    }

    /**
     * Sets the value of the journalforendeEnhetId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJournalforendeEnhetId(String value) {
        this.journalforendeEnhetId = value;
    }

    /**
     * Gets the value of the opprettetAvNavn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOpprettetAvNavn() {
        return opprettetAvNavn;
    }

    /**
     * Sets the value of the opprettetAvNavn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOpprettetAvNavn(String value) {
        this.opprettetAvNavn = value;
    }

    /**
     * Gets the value of the tittel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTittel() {
        return tittel;
    }

    /**
     * Sets the value of the tittel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTittel(String value) {
        this.tittel = value;
    }

    /**
     * Gets the value of the mottaker property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMottaker() {
        return mottaker;
    }

    /**
     * Sets the value of the mottaker property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMottaker(String value) {
        this.mottaker = value;
    }

    /**
     * Gets the value of the mottakerId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMottakerId() {
        return mottakerId;
    }

    /**
     * Sets the value of the mottakerId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMottakerId(String value) {
        this.mottakerId = value;
    }

    /**
     * Gets the value of the landKode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLandKode() {
        return landKode;
    }

    /**
     * Sets the value of the landKode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLandKode(String value) {
        this.landKode = value;
    }

    /**
     * Gets the value of the brukerId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBrukerId() {
        return brukerId;
    }

    /**
     * Sets the value of the brukerId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBrukerId(String value) {
        this.brukerId = value;
    }

    /**
     * Gets the value of the brukerTypeKode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBrukerTypeKode() {
        return brukerTypeKode;
    }

    /**
     * Sets the value of the brukerTypeKode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBrukerTypeKode(String value) {
        this.brukerTypeKode = value;
    }

    /**
     * Gets the value of the brevkodeId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBrevkodeId() {
        return brevkodeId;
    }

    /**
     * Sets the value of the brevkodeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBrevkodeId(String value) {
        this.brevkodeId = value;
    }

    /**
     * Gets the value of the sensitivt property.
     * 
     */
    public boolean isSensitivt() {
        return sensitivt;
    }

    /**
     * Sets the value of the sensitivt property.
     * 
     */
    public void setSensitivt(boolean value) {
        this.sensitivt = value;
    }

}
