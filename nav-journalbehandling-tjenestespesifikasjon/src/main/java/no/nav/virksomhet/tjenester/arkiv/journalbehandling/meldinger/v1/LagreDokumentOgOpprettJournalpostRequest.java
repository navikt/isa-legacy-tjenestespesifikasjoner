
package no.nav.virksomhet.tjenester.arkiv.journalbehandling.meldinger.v1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for LagreDokumentOgOpprettJournalpostRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LagreDokumentOgOpprettJournalpostRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="saksrelasjon" type="{http://nav.no/virksomhet/tjenester/arkiv/journalbehandling/meldinger/v1}Saksrelasjon" minOccurs="0"/>
 *         &lt;element name="kryssreferanseListe" type="{http://nav.no/virksomhet/tjenester/arkiv/journalbehandling/meldinger/v1}Kryssreferanse" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="journalpostDokumentInfoRelasjonListe" type="{http://nav.no/virksomhet/tjenester/arkiv/journalbehandling/meldinger/v1}JournalpostDokumentInfoRelasjon" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ekspedertDato" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="elektroniskDistribusjon" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="faktiskDistribusjonskanalKode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="gjelderListe" type="{http://nav.no/virksomhet/tjenester/arkiv/journalbehandling/meldinger/v1}Bruker" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="land" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="merknad" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="mottakskanalKode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="mottattAdressatDato" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="mottattDato" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="sendtPrintDato" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="utsendingskanalKode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="innhold" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="journalForendeEnhetId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="journalposttypeKode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="journalstatusKode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="kravtype" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dokumentDato" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="fagomradeKode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fordeling" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="avsenderMottaker" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="avsenderMottakerId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="opprettetAvNavn" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LagreDokumentOgOpprettJournalpostRequest", propOrder = {
    "saksrelasjon",
    "kryssreferanseListe",
    "journalpostDokumentInfoRelasjonListe",
    "ekspedertDato",
    "elektroniskDistribusjon",
    "faktiskDistribusjonskanalKode",
    "gjelderListe",
    "land",
    "merknad",
    "mottakskanalKode",
    "mottattAdressatDato",
    "mottattDato",
    "sendtPrintDato",
    "utsendingskanalKode",
    "innhold",
    "journalForendeEnhetId",
    "journalposttypeKode",
    "journalstatusKode",
    "kravtype",
    "dokumentDato",
    "fagomradeKode",
    "fordeling",
    "avsenderMottaker",
    "avsenderMottakerId",
    "opprettetAvNavn"
})
public class LagreDokumentOgOpprettJournalpostRequest {

    protected Saksrelasjon saksrelasjon;
    protected List<Kryssreferanse> kryssreferanseListe;
    protected List<JournalpostDokumentInfoRelasjon> journalpostDokumentInfoRelasjonListe;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar ekspedertDato;
    protected Boolean elektroniskDistribusjon;
    protected String faktiskDistribusjonskanalKode;
    protected List<Bruker> gjelderListe;
    protected String land;
    protected String merknad;
    protected String mottakskanalKode;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar mottattAdressatDato;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar mottattDato;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar sendtPrintDato;
    protected String utsendingskanalKode;
    protected String innhold;
    protected String journalForendeEnhetId;
    @XmlElement(required = true)
    protected String journalposttypeKode;
    @XmlElement(required = true)
    protected String journalstatusKode;
    protected String kravtype;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dokumentDato;
    protected String fagomradeKode;
    protected String fordeling;
    protected String avsenderMottaker;
    protected String avsenderMottakerId;
    @XmlElement(required = true)
    protected String opprettetAvNavn;

    /**
     * Gets the value of the saksrelasjon property.
     * 
     * @return
     *     possible object is
     *     {@link Saksrelasjon }
     *     
     */
    public Saksrelasjon getSaksrelasjon() {
        return saksrelasjon;
    }

    /**
     * Sets the value of the saksrelasjon property.
     * 
     * @param value
     *     allowed object is
     *     {@link Saksrelasjon }
     *     
     */
    public void setSaksrelasjon(Saksrelasjon value) {
        this.saksrelasjon = value;
    }

    /**
     * Gets the value of the kryssreferanseListe property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the kryssreferanseListe property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getKryssreferanseListe().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Kryssreferanse }
     * 
     * 
     */
    public List<Kryssreferanse> getKryssreferanseListe() {
        if (kryssreferanseListe == null) {
            kryssreferanseListe = new ArrayList<Kryssreferanse>();
        }
        return this.kryssreferanseListe;
    }

    /**
     * Gets the value of the journalpostDokumentInfoRelasjonListe property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the journalpostDokumentInfoRelasjonListe property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getJournalpostDokumentInfoRelasjonListe().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JournalpostDokumentInfoRelasjon }
     * 
     * 
     */
    public List<JournalpostDokumentInfoRelasjon> getJournalpostDokumentInfoRelasjonListe() {
        if (journalpostDokumentInfoRelasjonListe == null) {
            journalpostDokumentInfoRelasjonListe = new ArrayList<JournalpostDokumentInfoRelasjon>();
        }
        return this.journalpostDokumentInfoRelasjonListe;
    }

    /**
     * Gets the value of the ekspedertDato property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEkspedertDato() {
        return ekspedertDato;
    }

    /**
     * Sets the value of the ekspedertDato property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEkspedertDato(XMLGregorianCalendar value) {
        this.ekspedertDato = value;
    }

    /**
     * Gets the value of the elektroniskDistribusjon property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isElektroniskDistribusjon() {
        return elektroniskDistribusjon;
    }

    /**
     * Sets the value of the elektroniskDistribusjon property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setElektroniskDistribusjon(Boolean value) {
        this.elektroniskDistribusjon = value;
    }

    /**
     * Gets the value of the faktiskDistribusjonskanalKode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFaktiskDistribusjonskanalKode() {
        return faktiskDistribusjonskanalKode;
    }

    /**
     * Sets the value of the faktiskDistribusjonskanalKode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFaktiskDistribusjonskanalKode(String value) {
        this.faktiskDistribusjonskanalKode = value;
    }

    /**
     * Gets the value of the gjelderListe property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the gjelderListe property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGjelderListe().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Bruker }
     * 
     * 
     */
    public List<Bruker> getGjelderListe() {
        if (gjelderListe == null) {
            gjelderListe = new ArrayList<Bruker>();
        }
        return this.gjelderListe;
    }

    /**
     * Gets the value of the land property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLand() {
        return land;
    }

    /**
     * Sets the value of the land property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLand(String value) {
        this.land = value;
    }

    /**
     * Gets the value of the merknad property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMerknad() {
        return merknad;
    }

    /**
     * Sets the value of the merknad property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMerknad(String value) {
        this.merknad = value;
    }

    /**
     * Gets the value of the mottakskanalKode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMottakskanalKode() {
        return mottakskanalKode;
    }

    /**
     * Sets the value of the mottakskanalKode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMottakskanalKode(String value) {
        this.mottakskanalKode = value;
    }

    /**
     * Gets the value of the mottattAdressatDato property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getMottattAdressatDato() {
        return mottattAdressatDato;
    }

    /**
     * Sets the value of the mottattAdressatDato property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setMottattAdressatDato(XMLGregorianCalendar value) {
        this.mottattAdressatDato = value;
    }

    /**
     * Gets the value of the mottattDato property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getMottattDato() {
        return mottattDato;
    }

    /**
     * Sets the value of the mottattDato property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setMottattDato(XMLGregorianCalendar value) {
        this.mottattDato = value;
    }

    /**
     * Gets the value of the sendtPrintDato property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSendtPrintDato() {
        return sendtPrintDato;
    }

    /**
     * Sets the value of the sendtPrintDato property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSendtPrintDato(XMLGregorianCalendar value) {
        this.sendtPrintDato = value;
    }

    /**
     * Gets the value of the utsendingskanalKode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUtsendingskanalKode() {
        return utsendingskanalKode;
    }

    /**
     * Sets the value of the utsendingskanalKode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUtsendingskanalKode(String value) {
        this.utsendingskanalKode = value;
    }

    /**
     * Gets the value of the innhold property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInnhold() {
        return innhold;
    }

    /**
     * Sets the value of the innhold property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInnhold(String value) {
        this.innhold = value;
    }

    /**
     * Gets the value of the journalForendeEnhetId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJournalForendeEnhetId() {
        return journalForendeEnhetId;
    }

    /**
     * Sets the value of the journalForendeEnhetId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJournalForendeEnhetId(String value) {
        this.journalForendeEnhetId = value;
    }

    /**
     * Gets the value of the journalposttypeKode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJournalposttypeKode() {
        return journalposttypeKode;
    }

    /**
     * Sets the value of the journalposttypeKode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJournalposttypeKode(String value) {
        this.journalposttypeKode = value;
    }

    /**
     * Gets the value of the journalstatusKode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJournalstatusKode() {
        return journalstatusKode;
    }

    /**
     * Sets the value of the journalstatusKode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJournalstatusKode(String value) {
        this.journalstatusKode = value;
    }

    /**
     * Gets the value of the kravtype property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKravtype() {
        return kravtype;
    }

    /**
     * Sets the value of the kravtype property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKravtype(String value) {
        this.kravtype = value;
    }

    /**
     * Gets the value of the dokumentDato property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDokumentDato() {
        return dokumentDato;
    }

    /**
     * Sets the value of the dokumentDato property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDokumentDato(XMLGregorianCalendar value) {
        this.dokumentDato = value;
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
     * Gets the value of the fordeling property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFordeling() {
        return fordeling;
    }

    /**
     * Sets the value of the fordeling property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFordeling(String value) {
        this.fordeling = value;
    }

    /**
     * Gets the value of the avsenderMottaker property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAvsenderMottaker() {
        return avsenderMottaker;
    }

    /**
     * Sets the value of the avsenderMottaker property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAvsenderMottaker(String value) {
        this.avsenderMottaker = value;
    }

    /**
     * Gets the value of the avsenderMottakerId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAvsenderMottakerId() {
        return avsenderMottakerId;
    }

    /**
     * Sets the value of the avsenderMottakerId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAvsenderMottakerId(String value) {
        this.avsenderMottakerId = value;
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

}
