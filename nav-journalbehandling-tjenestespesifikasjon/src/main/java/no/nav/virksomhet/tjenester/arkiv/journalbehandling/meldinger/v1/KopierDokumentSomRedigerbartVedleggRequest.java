
package no.nav.virksomhet.tjenester.arkiv.journalbehandling.meldinger.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p></p>
 * 
 * <p>Java class for KopierDokumentSomRedigerbartVedleggRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="KopierDokumentSomRedigerbartVedleggRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="kopieresFraJournalpostId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="filUUID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="tittel" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="opprettetAvNavn" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="kopieresTilJournalpostId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "KopierDokumentSomRedigerbartVedleggRequest", propOrder = {
    "kopieresFraJournalpostId",
    "filUUID",
    "tittel",
    "opprettetAvNavn",
    "kopieresTilJournalpostId"
})
public class KopierDokumentSomRedigerbartVedleggRequest {

    @XmlElement(required = true)
    protected String kopieresFraJournalpostId;
    @XmlElement(required = true)
    protected String filUUID;
    @XmlElement(required = true)
    protected String tittel;
    @XmlElement(required = true)
    protected String opprettetAvNavn;
    @XmlElement(required = true)
    protected String kopieresTilJournalpostId;

    /**
     * Gets the value of the kopieresFraJournalpostId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKopieresFraJournalpostId() {
        return kopieresFraJournalpostId;
    }

    /**
     * Sets the value of the kopieresFraJournalpostId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKopieresFraJournalpostId(String value) {
        this.kopieresFraJournalpostId = value;
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
     * Gets the value of the kopieresTilJournalpostId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKopieresTilJournalpostId() {
        return kopieresTilJournalpostId;
    }

    /**
     * Sets the value of the kopieresTilJournalpostId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKopieresTilJournalpostId(String value) {
        this.kopieresTilJournalpostId = value;
    }

}
