
package no.nav.virksomhet.tjenester.arkiv.journalbehandling.meldinger.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Kryssreferanse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Kryssreferanse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="kryssreferanseId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="referanseId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="referanseNr" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="referansetypeKode" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
@XmlType(name = "Kryssreferanse", propOrder = {
    "kryssreferanseId",
    "referanseId",
    "referanseNr",
    "referansetypeKode",
    "versjon"
})
public class Kryssreferanse {

    protected Long kryssreferanseId;
    @XmlElement(required = true)
    protected String referanseId;
    protected Integer referanseNr;
    @XmlElement(required = true)
    protected String referansetypeKode;
    protected Long versjon;

    /**
     * Gets the value of the kryssreferanseId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getKryssreferanseId() {
        return kryssreferanseId;
    }

    /**
     * Sets the value of the kryssreferanseId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setKryssreferanseId(Long value) {
        this.kryssreferanseId = value;
    }

    /**
     * Gets the value of the referanseId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReferanseId() {
        return referanseId;
    }

    /**
     * Sets the value of the referanseId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReferanseId(String value) {
        this.referanseId = value;
    }

    /**
     * Gets the value of the referanseNr property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getReferanseNr() {
        return referanseNr;
    }

    /**
     * Sets the value of the referanseNr property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setReferanseNr(Integer value) {
        this.referanseNr = value;
    }

    /**
     * Gets the value of the referansetypeKode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReferansetypeKode() {
        return referansetypeKode;
    }

    /**
     * Sets the value of the referansetypeKode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReferansetypeKode(String value) {
        this.referansetypeKode = value;
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
