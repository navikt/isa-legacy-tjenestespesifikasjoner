
package no.nav.virksomhet.tjenester.arkiv.journalbehandling.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import no.nav.virksomhet.tjenester.arkiv.journalbehandling.meldinger.v1.GjenbrukRedigerbartDokumentRequest;


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
 *         &lt;element name="request" type="{http://nav.no/virksomhet/tjenester/arkiv/journalbehandling/meldinger/v1}GjenbrukRedigerbartDokumentRequest"/>
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
    "request"
})
@XmlRootElement(name = "gjenbrukRedigerbartDokument")
public class GjenbrukRedigerbartDokument {

    @XmlElement(required = true)
    protected GjenbrukRedigerbartDokumentRequest request;

    /**
     * Gets the value of the request property.
     * 
     * @return
     *     possible object is
     *     {@link GjenbrukRedigerbartDokumentRequest }
     *     
     */
    public GjenbrukRedigerbartDokumentRequest getRequest() {
        return request;
    }

    /**
     * Sets the value of the request property.
     * 
     * @param value
     *     allowed object is
     *     {@link GjenbrukRedigerbartDokumentRequest }
     *     
     */
    public void setRequest(GjenbrukRedigerbartDokumentRequest value) {
        this.request = value;
    }

}
