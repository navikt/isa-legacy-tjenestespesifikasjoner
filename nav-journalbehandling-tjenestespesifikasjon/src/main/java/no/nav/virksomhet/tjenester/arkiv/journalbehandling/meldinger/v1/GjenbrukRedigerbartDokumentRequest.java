
package no.nav.virksomhet.tjenester.arkiv.journalbehandling.meldinger.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GjenbrukRedigerbartDokumentRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GjenbrukRedigerbartDokumentRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="journalpostId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="filUUID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="journalForendeEnhetId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="opprettetAvNavn" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GjenbrukRedigerbartDokumentRequest", propOrder = {
    "journalpostId",
    "filUUID",
    "journalForendeEnhetId",
    "opprettetAvNavn"
})
public class GjenbrukRedigerbartDokumentRequest {

    @XmlElement(required = true)
    protected String journalpostId;
    @XmlElement(required = true)
    protected String filUUID;
    @XmlElement(required = true)
    protected String journalForendeEnhetId;
    @XmlElement(required = true)
    protected String opprettetAvNavn;

    /**
     * Gets the value of the journalpostId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJournalpostId() {
        return journalpostId;
    }

    /**
     * Sets the value of the journalpostId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJournalpostId(String value) {
        this.journalpostId = value;
    }

    /**
     * Gets the value of the filUUID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFilUUID() {
        return filUUID;
    }

    /**
     * Sets the value of the filUUID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFilUUID(String value) {
        this.filUUID = value;
    }

    /**
     * Gets the value of the journalForendeEnhetId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJournalForendeEnhetId() {
        return journalForendeEnhetId;
    }

    /**
     * Sets the value of the journalForendeEnhetId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJournalForendeEnhetId(String value) {
        this.journalForendeEnhetId = value;
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

}
