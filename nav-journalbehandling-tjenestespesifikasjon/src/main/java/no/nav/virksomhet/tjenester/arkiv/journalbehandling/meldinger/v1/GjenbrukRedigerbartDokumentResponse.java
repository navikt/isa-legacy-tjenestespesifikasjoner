
package no.nav.virksomhet.tjenester.arkiv.journalbehandling.meldinger.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GjenbrukRedigerbartDokumentResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GjenbrukRedigerbartDokumentResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="journalpostId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="filUUID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="utvidelse" type="{http://nav.no/virksomhet/tjenester/arkiv/journalbehandling/meldinger/v1}GjenbrukRedigerbartDokumentUtvidelse1" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GjenbrukRedigerbartDokumentResponse", propOrder = {
    "journalpostId",
    "filUUID",
    "utvidelse"
})
public class GjenbrukRedigerbartDokumentResponse {

    protected String journalpostId;
    protected String filUUID;
    protected GjenbrukRedigerbartDokumentUtvidelse1 utvidelse;

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
     * Gets the value of the utvidelse property.
     * 
     * @return
     *     possible object is
     *     {@link GjenbrukRedigerbartDokumentUtvidelse1 }
     *     
     */
    public GjenbrukRedigerbartDokumentUtvidelse1 getUtvidelse() {
        return utvidelse;
    }

    /**
     * Sets the value of the utvidelse property.
     * 
     * @param value
     *     allowed object is
     *     {@link GjenbrukRedigerbartDokumentUtvidelse1 }
     *     
     */
    public void setUtvidelse(GjenbrukRedigerbartDokumentUtvidelse1 value) {
        this.utvidelse = value;
    }

}
