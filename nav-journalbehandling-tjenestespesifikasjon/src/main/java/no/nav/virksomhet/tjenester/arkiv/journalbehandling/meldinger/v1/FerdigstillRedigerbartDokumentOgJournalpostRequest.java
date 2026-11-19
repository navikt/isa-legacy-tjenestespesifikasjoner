
package no.nav.virksomhet.tjenester.arkiv.journalbehandling.meldinger.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p></p>
 * 
 * <p>Java class for FerdigstillRedigerbartDokumentOgJournalpostRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FerdigstillRedigerbartDokumentOgJournalpostRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="journalpostId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="filUUID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="sentralDistribusjon" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="redigerbartDokument" type="{http://www.w3.org/2001/XMLSchema}base64Binary"/>
 *         &lt;element name="ferdigstiltDokument" type="{http://www.w3.org/2001/XMLSchema}base64Binary"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FerdigstillRedigerbartDokumentOgJournalpostRequest", propOrder = {
    "journalpostId",
    "filUUID",
    "sentralDistribusjon",
    "redigerbartDokument",
    "ferdigstiltDokument"
})
public class FerdigstillRedigerbartDokumentOgJournalpostRequest {

    @XmlElement(required = true)
    protected String journalpostId;
    @XmlElement(required = true)
    protected String filUUID;
    protected boolean sentralDistribusjon;
    @XmlElement(required = true)
    protected byte[] redigerbartDokument;
    @XmlElement(required = true)
    protected byte[] ferdigstiltDokument;

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
     * Gets the value of the sentralDistribusjon property.
     * 
     */
    public boolean isSentralDistribusjon() {
        return sentralDistribusjon;
    }

    /**
     * Sets the value of the sentralDistribusjon property.
     * 
     */
    public void setSentralDistribusjon(boolean value) {
        this.sentralDistribusjon = value;
    }

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
     * Gets the value of the ferdigstiltDokument property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getFerdigstiltDokument() {
        return ferdigstiltDokument;
    }

    /**
     * Sets the value of the ferdigstiltDokument property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setFerdigstiltDokument(byte[] value) {
        this.ferdigstiltDokument = ((byte[]) value);
    }

}
