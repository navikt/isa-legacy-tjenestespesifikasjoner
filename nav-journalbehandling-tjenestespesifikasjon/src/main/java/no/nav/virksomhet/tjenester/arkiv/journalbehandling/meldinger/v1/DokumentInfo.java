
package no.nav.virksomhet.tjenester.arkiv.journalbehandling.meldinger.v1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for DokumentInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DokumentInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dokumentInfoId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="skannetInnholdListe" type="{http://nav.no/virksomhet/tjenester/arkiv/journalbehandling/meldinger/v1}SkannetInnhold" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="fildetaljerListe" type="{http://nav.no/virksomhet/tjenester/arkiv/journalbehandling/meldinger/v1}Fildetaljer" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="kategoriKode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dokumentFerdigDato" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="dokumentstatusKode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tittel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="brevkode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="brevgruppe" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="konfidensialitet" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sensitivt" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="integritet" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tilgjengelighet" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="innskrenketPartsinnsyn" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="organInternt" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
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
@XmlType(name = "DokumentInfo", propOrder = {
    "dokumentInfoId",
    "skannetInnholdListe",
    "fildetaljerListe",
    "kategoriKode",
    "dokumentFerdigDato",
    "dokumentstatusKode",
    "tittel",
    "brevkode",
    "brevgruppe",
    "konfidensialitet",
    "sensitivt",
    "integritet",
    "tilgjengelighet",
    "innskrenketPartsinnsyn",
    "organInternt",
    "versjon"
})
public class DokumentInfo {

    protected Long dokumentInfoId;
    protected List<SkannetInnhold> skannetInnholdListe;
    protected List<Fildetaljer> fildetaljerListe;
    protected String kategoriKode;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dokumentFerdigDato;
    protected String dokumentstatusKode;
    protected String tittel;
    protected String brevkode;
    protected String brevgruppe;
    protected String konfidensialitet;
    protected Boolean sensitivt;
    protected String integritet;
    protected String tilgjengelighet;
    protected Boolean innskrenketPartsinnsyn;
    protected Boolean organInternt;
    protected Long versjon;

    /**
     * Gets the value of the dokumentInfoId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getDokumentInfoId() {
        return dokumentInfoId;
    }

    /**
     * Sets the value of the dokumentInfoId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setDokumentInfoId(Long value) {
        this.dokumentInfoId = value;
    }

    /**
     * Gets the value of the skannetInnholdListe property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the skannetInnholdListe property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSkannetInnholdListe().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SkannetInnhold }
     * 
     * 
     */
    public List<SkannetInnhold> getSkannetInnholdListe() {
        if (skannetInnholdListe == null) {
            skannetInnholdListe = new ArrayList<SkannetInnhold>();
        }
        return this.skannetInnholdListe;
    }

    /**
     * Gets the value of the fildetaljerListe property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fildetaljerListe property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFildetaljerListe().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Fildetaljer }
     * 
     * 
     */
    public List<Fildetaljer> getFildetaljerListe() {
        if (fildetaljerListe == null) {
            fildetaljerListe = new ArrayList<Fildetaljer>();
        }
        return this.fildetaljerListe;
    }

    /**
     * Gets the value of the kategoriKode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKategoriKode() {
        return kategoriKode;
    }

    /**
     * Sets the value of the kategoriKode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKategoriKode(String value) {
        this.kategoriKode = value;
    }

    /**
     * Gets the value of the dokumentFerdigDato property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDokumentFerdigDato() {
        return dokumentFerdigDato;
    }

    /**
     * Sets the value of the dokumentFerdigDato property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDokumentFerdigDato(XMLGregorianCalendar value) {
        this.dokumentFerdigDato = value;
    }

    /**
     * Gets the value of the dokumentstatusKode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDokumentstatusKode() {
        return dokumentstatusKode;
    }

    /**
     * Sets the value of the dokumentstatusKode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDokumentstatusKode(String value) {
        this.dokumentstatusKode = value;
    }

    /**
     * Gets the value of the tittel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTittel() {
        return tittel;
    }

    /**
     * Sets the value of the tittel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTittel(String value) {
        this.tittel = value;
    }

    /**
     * Gets the value of the brevkode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBrevkode() {
        return brevkode;
    }

    /**
     * Sets the value of the brevkode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBrevkode(String value) {
        this.brevkode = value;
    }

    /**
     * Gets the value of the brevgruppe property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBrevgruppe() {
        return brevgruppe;
    }

    /**
     * Sets the value of the brevgruppe property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBrevgruppe(String value) {
        this.brevgruppe = value;
    }

    /**
     * Gets the value of the konfidensialitet property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKonfidensialitet() {
        return konfidensialitet;
    }

    /**
     * Sets the value of the konfidensialitet property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKonfidensialitet(String value) {
        this.konfidensialitet = value;
    }

    /**
     * Gets the value of the sensitivt property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSensitivt() {
        return sensitivt;
    }

    /**
     * Sets the value of the sensitivt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSensitivt(Boolean value) {
        this.sensitivt = value;
    }

    /**
     * Gets the value of the integritet property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIntegritet() {
        return integritet;
    }

    /**
     * Sets the value of the integritet property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIntegritet(String value) {
        this.integritet = value;
    }

    /**
     * Gets the value of the tilgjengelighet property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTilgjengelighet() {
        return tilgjengelighet;
    }

    /**
     * Sets the value of the tilgjengelighet property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTilgjengelighet(String value) {
        this.tilgjengelighet = value;
    }

    /**
     * Gets the value of the innskrenketPartsinnsyn property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isInnskrenketPartsinnsyn() {
        return innskrenketPartsinnsyn;
    }

    /**
     * Sets the value of the innskrenketPartsinnsyn property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setInnskrenketPartsinnsyn(Boolean value) {
        this.innskrenketPartsinnsyn = value;
    }

    /**
     * Gets the value of the organInternt property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOrganInternt() {
        return organInternt;
    }

    /**
     * Sets the value of the organInternt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOrganInternt(Boolean value) {
        this.organInternt = value;
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
