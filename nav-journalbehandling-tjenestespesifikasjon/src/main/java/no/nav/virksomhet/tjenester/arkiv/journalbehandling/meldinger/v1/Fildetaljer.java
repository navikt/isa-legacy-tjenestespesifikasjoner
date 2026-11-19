
package no.nav.virksomhet.tjenester.arkiv.journalbehandling.meldinger.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Fildetaljer complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Fildetaljer">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="batchNavn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fil" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/>
 *         &lt;element name="fildetaljerId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="filnavn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="filtypeKode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="variantFormatKode" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
@XmlType(name = "Fildetaljer", propOrder = {
    "batchNavn",
    "fil",
    "fildetaljerId",
    "filnavn",
    "filtypeKode",
    "variantFormatKode",
    "versjon"
})
public class Fildetaljer {

    protected String batchNavn;
    protected byte[] fil;
    protected Long fildetaljerId;
    protected String filnavn;
    @XmlElement(required = true)
    protected String filtypeKode;
    @XmlElement(required = true)
    protected String variantFormatKode;
    protected Long versjon;

    /**
     * Gets the value of the batchNavn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBatchNavn() {
        return batchNavn;
    }

    /**
     * Sets the value of the batchNavn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBatchNavn(String value) {
        this.batchNavn = value;
    }

    /**
     * Gets the value of the fil property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getFil() {
        return fil;
    }

    /**
     * Sets the value of the fil property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setFil(byte[] value) {
        this.fil = ((byte[]) value);
    }

    /**
     * Gets the value of the fildetaljerId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getFildetaljerId() {
        return fildetaljerId;
    }

    /**
     * Sets the value of the fildetaljerId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setFildetaljerId(Long value) {
        this.fildetaljerId = value;
    }

    /**
     * Gets the value of the filnavn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFilnavn() {
        return filnavn;
    }

    /**
     * Sets the value of the filnavn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFilnavn(String value) {
        this.filnavn = value;
    }

    /**
     * Gets the value of the filtypeKode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFiltypeKode() {
        return filtypeKode;
    }

    /**
     * Sets the value of the filtypeKode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFiltypeKode(String value) {
        this.filtypeKode = value;
    }

    /**
     * Gets the value of the variantFormatKode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVariantFormatKode() {
        return variantFormatKode;
    }

    /**
     * Sets the value of the variantFormatKode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVariantFormatKode(String value) {
        this.variantFormatKode = value;
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
