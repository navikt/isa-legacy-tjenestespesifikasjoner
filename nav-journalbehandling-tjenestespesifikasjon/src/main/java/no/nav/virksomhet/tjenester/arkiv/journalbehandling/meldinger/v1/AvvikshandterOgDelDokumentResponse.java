
package no.nav.virksomhet.tjenester.arkiv.journalbehandling.meldinger.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AvvikshandterOgDelDokumentResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AvvikshandterOgDelDokumentResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="journalpostId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="utvidelse" type="{http://nav.no/virksomhet/tjenester/arkiv/journalbehandling/meldinger/v1}AvvikshandterOgDelDokumentUtvidelse1" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AvvikshandterOgDelDokumentResponse", propOrder = {
    "journalpostId",
    "utvidelse"
})
public class AvvikshandterOgDelDokumentResponse {

    protected Long journalpostId;
    protected AvvikshandterOgDelDokumentUtvidelse1 utvidelse;

    /**
     * Gets the value of the journalpostId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getJournalpostId() {
        return journalpostId;
    }

    /**
     * Sets the value of the journalpostId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setJournalpostId(Long value) {
        this.journalpostId = value;
    }

    /**
     * Gets the value of the utvidelse property.
     * 
     * @return
     *     possible object is
     *     {@link AvvikshandterOgDelDokumentUtvidelse1 }
     *     
     */
    public AvvikshandterOgDelDokumentUtvidelse1 getUtvidelse() {
        return utvidelse;
    }

    /**
     * Sets the value of the utvidelse property.
     * 
     * @param value
     *     allowed object is
     *     {@link AvvikshandterOgDelDokumentUtvidelse1 }
     *     
     */
    public void setUtvidelse(AvvikshandterOgDelDokumentUtvidelse1 value) {
        this.utvidelse = value;
    }

}
