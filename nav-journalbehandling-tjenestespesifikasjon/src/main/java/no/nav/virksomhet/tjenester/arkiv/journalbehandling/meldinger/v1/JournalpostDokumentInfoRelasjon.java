
package no.nav.virksomhet.tjenester.arkiv.journalbehandling.meldinger.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for JournalpostDokumentInfoRelasjon complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="JournalpostDokumentInfoRelasjon">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="journalpostDokumentInfoRelasjonId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="dokumentInfo" type="{http://nav.no/virksomhet/tjenester/arkiv/journalbehandling/meldinger/v1}DokumentInfo" minOccurs="0"/>
 *         &lt;element name="tilknyttetJournalpostSomKode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="tilknyttetAvNavn" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
@XmlType(name = "JournalpostDokumentInfoRelasjon", propOrder = {
    "journalpostDokumentInfoRelasjonId",
    "dokumentInfo",
    "tilknyttetJournalpostSomKode",
    "tilknyttetAvNavn",
    "versjon"
})
public class JournalpostDokumentInfoRelasjon {

    protected Long journalpostDokumentInfoRelasjonId;
    protected DokumentInfo dokumentInfo;
    @XmlElement(required = true)
    protected String tilknyttetJournalpostSomKode;
    @XmlElement(required = true)
    protected String tilknyttetAvNavn;
    protected Long versjon;

    /**
     * Gets the value of the journalpostDokumentInfoRelasjonId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getJournalpostDokumentInfoRelasjonId() {
        return journalpostDokumentInfoRelasjonId;
    }

    /**
     * Sets the value of the journalpostDokumentInfoRelasjonId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setJournalpostDokumentInfoRelasjonId(Long value) {
        this.journalpostDokumentInfoRelasjonId = value;
    }

    /**
     * Gets the value of the dokumentInfo property.
     * 
     * @return
     *     possible object is
     *     {@link DokumentInfo }
     *     
     */
    public DokumentInfo getDokumentInfo() {
        return dokumentInfo;
    }

    /**
     * Sets the value of the dokumentInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link DokumentInfo }
     *     
     */
    public void setDokumentInfo(DokumentInfo value) {
        this.dokumentInfo = value;
    }

    /**
     * Gets the value of the tilknyttetJournalpostSomKode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTilknyttetJournalpostSomKode() {
        return tilknyttetJournalpostSomKode;
    }

    /**
     * Sets the value of the tilknyttetJournalpostSomKode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTilknyttetJournalpostSomKode(String value) {
        this.tilknyttetJournalpostSomKode = value;
    }

    /**
     * Gets the value of the tilknyttetAvNavn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTilknyttetAvNavn() {
        return tilknyttetAvNavn;
    }

    /**
     * Sets the value of the tilknyttetAvNavn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTilknyttetAvNavn(String value) {
        this.tilknyttetAvNavn = value;
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
