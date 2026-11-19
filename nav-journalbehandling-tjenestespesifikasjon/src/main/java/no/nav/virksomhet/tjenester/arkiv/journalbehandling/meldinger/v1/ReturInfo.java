
package no.nav.virksomhet.tjenester.arkiv.journalbehandling.meldinger.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for ReturInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ReturInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="returInfoId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="returDato" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="arsakReturKode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="adresseSendtIgjen" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sendtIgjenDato" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
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
@XmlType(name = "ReturInfo", propOrder = {
    "returInfoId",
    "returDato",
    "arsakReturKode",
    "adresseSendtIgjen",
    "sendtIgjenDato",
    "versjon"
})
public class ReturInfo {

    protected Long returInfoId;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar returDato;
    @XmlElement(required = true)
    protected String arsakReturKode;
    protected String adresseSendtIgjen;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar sendtIgjenDato;
    protected Long versjon;

    /**
     * Gets the value of the returInfoId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getReturInfoId() {
        return returInfoId;
    }

    /**
     * Sets the value of the returInfoId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setReturInfoId(Long value) {
        this.returInfoId = value;
    }

    /**
     * Gets the value of the returDato property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getReturDato() {
        return returDato;
    }

    /**
     * Sets the value of the returDato property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setReturDato(XMLGregorianCalendar value) {
        this.returDato = value;
    }

    /**
     * Gets the value of the arsakReturKode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getArsakReturKode() {
        return arsakReturKode;
    }

    /**
     * Sets the value of the arsakReturKode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setArsakReturKode(String value) {
        this.arsakReturKode = value;
    }

    /**
     * Gets the value of the adresseSendtIgjen property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdresseSendtIgjen() {
        return adresseSendtIgjen;
    }

    /**
     * Sets the value of the adresseSendtIgjen property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdresseSendtIgjen(String value) {
        this.adresseSendtIgjen = value;
    }

    /**
     * Gets the value of the sendtIgjenDato property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSendtIgjenDato() {
        return sendtIgjenDato;
    }

    /**
     * Sets the value of the sendtIgjenDato property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSendtIgjenDato(XMLGregorianCalendar value) {
        this.sendtIgjenDato = value;
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
