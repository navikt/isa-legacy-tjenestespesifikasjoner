
package no.nav.virksomhet.tjenester.arkiv.journalbehandling.meldinger.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p></p>
 * 
 * <p>Java class for Bruker complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Bruker">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="brukerId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="brukerInfoId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="brukertypeKode" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
@XmlType(name = "Bruker", propOrder = {
    "brukerId",
    "brukerInfoId",
    "brukertypeKode",
    "versjon"
})
public class Bruker {

    @XmlElement(required = true)
    protected String brukerId;
    protected Long brukerInfoId;
    @XmlElement(required = true)
    protected String brukertypeKode;
    protected Long versjon;

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
     * Gets the value of the brukerInfoId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getBrukerInfoId() {
        return brukerInfoId;
    }

    /**
     * Sets the value of the brukerInfoId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setBrukerInfoId(Long value) {
        this.brukerInfoId = value;
    }

    /**
     * Gets the value of the brukertypeKode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBrukertypeKode() {
        return brukertypeKode;
    }

    /**
     * Sets the value of the brukertypeKode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBrukertypeKode(String value) {
        this.brukertypeKode = value;
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
