
package no.nav.virksomhet.tjenester.arkiv.journalbehandling.meldinger.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AvvikshandterOgDelDokumentRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AvvikshandterOgDelDokumentRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="journalpostId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="opprettetAvNavn" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="brukSisteSideFraOrginalen" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="delFraSide" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="delTilSide" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="gjelder" type="{http://nav.no/virksomhet/tjenester/arkiv/journalbehandling/meldinger/v1}Part" minOccurs="0"/>
 *         &lt;element name="fagomradeKode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="avsenderNavn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AvvikshandterOgDelDokumentRequest", propOrder = {
    "journalpostId",
    "opprettetAvNavn",
    "brukSisteSideFraOrginalen",
    "delFraSide",
    "delTilSide",
    "gjelder",
    "fagomradeKode",
    "avsenderNavn"
})
public class AvvikshandterOgDelDokumentRequest {

    protected long journalpostId;
    @XmlElement(required = true)
    protected String opprettetAvNavn;
    protected boolean brukSisteSideFraOrginalen;
    protected int delFraSide;
    protected int delTilSide;
    protected Part gjelder;
    protected String fagomradeKode;
    protected String avsenderNavn;

    /**
     * Gets the value of the journalpostId property.
     * 
     */
    public long getJournalpostId() {
        return journalpostId;
    }

    /**
     * Sets the value of the journalpostId property.
     * 
     */
    public void setJournalpostId(long value) {
        this.journalpostId = value;
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
     * Gets the value of the brukSisteSideFraOrginalen property.
     * 
     */
    public boolean isBrukSisteSideFraOrginalen() {
        return brukSisteSideFraOrginalen;
    }

    /**
     * Sets the value of the brukSisteSideFraOrginalen property.
     * 
     */
    public void setBrukSisteSideFraOrginalen(boolean value) {
        this.brukSisteSideFraOrginalen = value;
    }

    /**
     * Gets the value of the delFraSide property.
     * 
     */
    public int getDelFraSide() {
        return delFraSide;
    }

    /**
     * Sets the value of the delFraSide property.
     * 
     */
    public void setDelFraSide(int value) {
        this.delFraSide = value;
    }

    /**
     * Gets the value of the delTilSide property.
     * 
     */
    public int getDelTilSide() {
        return delTilSide;
    }

    /**
     * Sets the value of the delTilSide property.
     * 
     */
    public void setDelTilSide(int value) {
        this.delTilSide = value;
    }

    /**
     * Gets the value of the gjelder property.
     * 
     * @return
     *     possible object is
     *     {@link Part }
     *     
     */
    public Part getGjelder() {
        return gjelder;
    }

    /**
     * Sets the value of the gjelder property.
     * 
     * @param value
     *     allowed object is
     *     {@link Part }
     *     
     */
    public void setGjelder(Part value) {
        this.gjelder = value;
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
     * Gets the value of the avsenderNavn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAvsenderNavn() {
        return avsenderNavn;
    }

    /**
     * Sets the value of the avsenderNavn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAvsenderNavn(String value) {
        this.avsenderNavn = value;
    }

}
