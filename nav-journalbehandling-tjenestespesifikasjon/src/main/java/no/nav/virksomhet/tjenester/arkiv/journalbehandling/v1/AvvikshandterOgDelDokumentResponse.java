
package no.nav.virksomhet.tjenester.arkiv.journalbehandling.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="response" type="{http://nav.no/virksomhet/tjenester/arkiv/journalbehandling/meldinger/v1}AvvikshandterOgDelDokumentResponse" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "response"
})
@XmlRootElement(name = "avvikshandterOgDelDokumentResponse")
public class AvvikshandterOgDelDokumentResponse {

    protected no.nav.virksomhet.tjenester.arkiv.journalbehandling.meldinger.v1.AvvikshandterOgDelDokumentResponse response;

    /**
     * Gets the value of the response property.
     * 
     * @return
     *     possible object is
     *     {@link no.nav.virksomhet.tjenester.arkiv.journalbehandling.meldinger.v1.AvvikshandterOgDelDokumentResponse }
     *     
     */
    public no.nav.virksomhet.tjenester.arkiv.journalbehandling.meldinger.v1.AvvikshandterOgDelDokumentResponse getResponse() {
        return response;
    }

    /**
     * Sets the value of the response property.
     * 
     * @param value
     *     allowed object is
     *     {@link no.nav.virksomhet.tjenester.arkiv.journalbehandling.meldinger.v1.AvvikshandterOgDelDokumentResponse }
     *     
     */
    public void setResponse(no.nav.virksomhet.tjenester.arkiv.journalbehandling.meldinger.v1.AvvikshandterOgDelDokumentResponse value) {
        this.response = value;
    }

}
