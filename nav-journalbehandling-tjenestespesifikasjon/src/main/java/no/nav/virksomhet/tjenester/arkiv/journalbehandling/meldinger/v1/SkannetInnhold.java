
package no.nav.virksomhet.tjenester.arkiv.journalbehandling.meldinger.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p></p>
 * 
 * <p>Java class for SkannetInnhold complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SkannetInnhold">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="skannetInnholdId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="vedleggInnhold" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="vedleggNr" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
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
@XmlType(name = "SkannetInnhold", propOrder = {
    "skannetInnholdId",
    "vedleggInnhold",
    "vedleggNr",
    "versjon"
})
public class SkannetInnhold {

    protected Long skannetInnholdId;
    @XmlElement(required = true)
    protected String vedleggInnhold;
    protected Integer vedleggNr;
    protected Long versjon;

    /**
     * Gets the value of the skannetInnholdId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getSkannetInnholdId() {
        return skannetInnholdId;
    }

    /**
     * Sets the value of the skannetInnholdId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setSkannetInnholdId(Long value) {
        this.skannetInnholdId = value;
    }

    /**
     * Gets the value of the vedleggInnhold property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVedleggInnhold() {
        return vedleggInnhold;
    }

    /**
     * Sets the value of the vedleggInnhold property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVedleggInnhold(String value) {
        this.vedleggInnhold = value;
    }

    /**
     * Gets the value of the vedleggNr property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getVedleggNr() {
        return vedleggNr;
    }

    /**
     * Sets the value of the vedleggNr property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setVedleggNr(Integer value) {
        this.vedleggNr = value;
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
