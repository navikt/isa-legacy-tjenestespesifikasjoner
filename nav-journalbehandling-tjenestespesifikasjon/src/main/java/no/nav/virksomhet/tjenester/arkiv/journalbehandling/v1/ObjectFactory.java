
package no.nav.virksomhet.tjenester.arkiv.journalbehandling.v1;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;
import no.nav.virksomhet.tjenester.arkiv.journalbehandling.feil.v1.IkkeFerdigstiltVedlegg;
import no.nav.virksomhet.tjenester.arkiv.journalbehandling.feil.v1.JournalpostUnderDistribusjonEllerDistribuert;
import no.nav.virksomhet.tjenester.arkiv.journalbehandling.feil.v1.UgyldigDokumentInfoId;
import no.nav.virksomhet.tjenester.arkiv.journalbehandling.feil.v1.UgyldigInput;
import no.nav.virksomhet.tjenester.arkiv.journalbehandling.feil.v1.UgyldigJournalpostId;
import no.nav.virksomhet.tjenester.arkiv.journalbehandling.feil.v1.UgyldigJournalstatus;
import no.nav.virksomhet.tjenester.arkiv.journalbehandling.feil.v1.UgyldigJournalstatusPaJournalpostDetKopieresFra;
import no.nav.virksomhet.tjenester.arkiv.journalbehandling.feil.v1.UgyldigJournalstatusPaJournalpostDetKopieresTil;
import no.nav.virksomhet.tjenester.arkiv.journalbehandling.feil.v1.UgyldigStatusovergang;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the no.nav.virksomhet.tjenester.arkiv.journalbehandling.v1 package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _KopierDokumentSomRedigerbartVedleggugyldigJournalstatusPaJournalpostDetKopieresTil_QNAME = new QName("http://nav.no/virksomhet/tjenester/arkiv/journalbehandling/v1", "kopierDokumentSomRedigerbartVedleggugyldigJournalstatusPaJournalpostDetKopieresTil");
    private final static QName _GjenbrukRedigerbartDokumentugyldigJournalstatus_QNAME = new QName("http://nav.no/virksomhet/tjenester/arkiv/journalbehandling/v1", "gjenbrukRedigerbartDokumentugyldigJournalstatus");
    private final static QName _LagreDokumentOgOpprettJournalpostugyldigJournalstatus_QNAME = new QName("http://nav.no/virksomhet/tjenester/arkiv/journalbehandling/v1", "lagreDokumentOgOpprettJournalpostugyldigJournalstatus");
    private final static QName _FerdigstillRedigerbartDokumentOgJournalpostikkeFerdigstiltVedlegg_QNAME = new QName("http://nav.no/virksomhet/tjenester/arkiv/journalbehandling/v1", "ferdigstillRedigerbartDokumentOgJournalpostikkeFerdigstiltVedlegg");
    private final static QName _KopierDokumentSomRedigerbartVedleggugyldigJournalstatusPaJournalpostDetKopieresFra_QNAME = new QName("http://nav.no/virksomhet/tjenester/arkiv/journalbehandling/v1", "kopierDokumentSomRedigerbartVedleggugyldigJournalstatusPaJournalpostDetKopieresFra");
    private final static QName _SlettVedleggFraUtgaendeJournalpostugyldigJournalstatus_QNAME = new QName("http://nav.no/virksomhet/tjenester/arkiv/journalbehandling/v1", "slettVedleggFraUtgaendeJournalpostugyldigJournalstatus");
    private final static QName _AvbrytJournalpostjournalpostUnderDistribusjonEllerDistribuert_QNAME = new QName("http://nav.no/virksomhet/tjenester/arkiv/journalbehandling/v1", "avbrytJournalpostjournalpostUnderDistribusjonEllerDistribuert");
    private final static QName _LagreDokumentOgOpprettJournalpostugyldigDokumentInfoId_QNAME = new QName("http://nav.no/virksomhet/tjenester/arkiv/journalbehandling/v1", "lagreDokumentOgOpprettJournalpostugyldigDokumentInfoId");
    private final static QName _FerdigstillRedigerbartDokumentOgJournalpostugyldigJournalstatus_QNAME = new QName("http://nav.no/virksomhet/tjenester/arkiv/journalbehandling/v1", "ferdigstillRedigerbartDokumentOgJournalpostugyldigJournalstatus");
    private final static QName _OppdaterJournalugyldigJournalpostId_QNAME = new QName("http://nav.no/virksomhet/tjenester/arkiv/journalbehandling/v1", "oppdaterJournalugyldigJournalpostId");
    private final static QName _FerdigstillRedigerbartVedleggugyldigJournalstatus_QNAME = new QName("http://nav.no/virksomhet/tjenester/arkiv/journalbehandling/v1", "ferdigstillRedigerbartVedleggugyldigJournalstatus");
    private final static QName _AvvikshandterOgDelDokumentugyldigInput_QNAME = new QName("http://nav.no/virksomhet/tjenester/arkiv/journalbehandling/v1", "avvikshandterOgDelDokumentugyldigInput");
    private final static QName _OppdaterJournalugyldigDokumentInfoId_QNAME = new QName("http://nav.no/virksomhet/tjenester/arkiv/journalbehandling/v1", "oppdaterJournalugyldigDokumentInfoId");
    private final static QName _MellomlagreRedigerbartDokumentugyldigJournalstatus_QNAME = new QName("http://nav.no/virksomhet/tjenester/arkiv/journalbehandling/v1", "mellomlagreRedigerbartDokumentugyldigJournalstatus");
    private final static QName _OppdaterJournalugyldigStatusovergang_QNAME = new QName("http://nav.no/virksomhet/tjenester/arkiv/journalbehandling/v1", "oppdaterJournalugyldigStatusovergang");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: no.nav.virksomhet.tjenester.arkiv.journalbehandling.v1
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link LagreRedigerbartDokumentOgOpprettJournalpost }
     * 
     */
    public LagreRedigerbartDokumentOgOpprettJournalpost createLagreRedigerbartDokumentOgOpprettJournalpost() {
        return new LagreRedigerbartDokumentOgOpprettJournalpost();
    }

    /**
     * Create an instance of {@link GjenbrukRedigerbartDokumentResponse }
     * 
     */
    public GjenbrukRedigerbartDokumentResponse createGjenbrukRedigerbartDokumentResponse() {
        return new GjenbrukRedigerbartDokumentResponse();
    }

    /**
     * Create an instance of {@link AvbrytJournalpost }
     * 
     */
    public AvbrytJournalpost createAvbrytJournalpost() {
        return new AvbrytJournalpost();
    }

    /**
     * Create an instance of {@link OppdaterJournal }
     * 
     */
    public OppdaterJournal createOppdaterJournal() {
        return new OppdaterJournal();
    }

    /**
     * Create an instance of {@link OppdaterJournalResponse }
     * 
     */
    public OppdaterJournalResponse createOppdaterJournalResponse() {
        return new OppdaterJournalResponse();
    }

    /**
     * Create an instance of {@link LagreDokumentOgOpprettJournalpostResponse }
     * 
     */
    public LagreDokumentOgOpprettJournalpostResponse createLagreDokumentOgOpprettJournalpostResponse() {
        return new LagreDokumentOgOpprettJournalpostResponse();
    }

    /**
     * Create an instance of {@link FerdigstillRedigerbartDokumentOgJournalpostResponse }
     * 
     */
    public FerdigstillRedigerbartDokumentOgJournalpostResponse createFerdigstillRedigerbartDokumentOgJournalpostResponse() {
        return new FerdigstillRedigerbartDokumentOgJournalpostResponse();
    }

    /**
     * Create an instance of {@link KopierDokumentSomRedigerbartVedlegg }
     * 
     */
    public KopierDokumentSomRedigerbartVedlegg createKopierDokumentSomRedigerbartVedlegg() {
        return new KopierDokumentSomRedigerbartVedlegg();
    }

    /**
     * Create an instance of {@link GjenbrukRedigerbartDokument }
     * 
     */
    public GjenbrukRedigerbartDokument createGjenbrukRedigerbartDokument() {
        return new GjenbrukRedigerbartDokument();
    }

    /**
     * Create an instance of {@link LagreRedigerbartDokumentOgOpprettJournalpostResponse }
     * 
     */
    public LagreRedigerbartDokumentOgOpprettJournalpostResponse createLagreRedigerbartDokumentOgOpprettJournalpostResponse() {
        return new LagreRedigerbartDokumentOgOpprettJournalpostResponse();
    }

    /**
     * Create an instance of {@link SlettVedleggFraUtgaendeJournalpost }
     * 
     */
    public SlettVedleggFraUtgaendeJournalpost createSlettVedleggFraUtgaendeJournalpost() {
        return new SlettVedleggFraUtgaendeJournalpost();
    }

    /**
     * Create an instance of {@link KopierDokumentSomRedigerbartVedleggResponse }
     * 
     */
    public KopierDokumentSomRedigerbartVedleggResponse createKopierDokumentSomRedigerbartVedleggResponse() {
        return new KopierDokumentSomRedigerbartVedleggResponse();
    }

    /**
     * Create an instance of {@link FerdigstillRedigerbartVedlegg }
     * 
     */
    public FerdigstillRedigerbartVedlegg createFerdigstillRedigerbartVedlegg() {
        return new FerdigstillRedigerbartVedlegg();
    }

    /**
     * Create an instance of {@link FerdigstillRedigerbartVedleggResponse }
     * 
     */
    public FerdigstillRedigerbartVedleggResponse createFerdigstillRedigerbartVedleggResponse() {
        return new FerdigstillRedigerbartVedleggResponse();
    }

    /**
     * Create an instance of {@link AvvikshandterOgDelDokument }
     * 
     */
    public AvvikshandterOgDelDokument createAvvikshandterOgDelDokument() {
        return new AvvikshandterOgDelDokument();
    }

    /**
     * Create an instance of {@link MellomlagreRedigerbartDokument }
     * 
     */
    public MellomlagreRedigerbartDokument createMellomlagreRedigerbartDokument() {
        return new MellomlagreRedigerbartDokument();
    }

    /**
     * Create an instance of {@link AvbrytJournalpostResponse }
     * 
     */
    public AvbrytJournalpostResponse createAvbrytJournalpostResponse() {
        return new AvbrytJournalpostResponse();
    }

    /**
     * Create an instance of {@link MellomlagreRedigerbartDokumentResponse }
     * 
     */
    public MellomlagreRedigerbartDokumentResponse createMellomlagreRedigerbartDokumentResponse() {
        return new MellomlagreRedigerbartDokumentResponse();
    }

    /**
     * Create an instance of {@link LagreDokumentOgOpprettJournalpost }
     * 
     */
    public LagreDokumentOgOpprettJournalpost createLagreDokumentOgOpprettJournalpost() {
        return new LagreDokumentOgOpprettJournalpost();
    }

    /**
     * Create an instance of {@link SlettVedleggFraUtgaendeJournalpostResponse }
     * 
     */
    public SlettVedleggFraUtgaendeJournalpostResponse createSlettVedleggFraUtgaendeJournalpostResponse() {
        return new SlettVedleggFraUtgaendeJournalpostResponse();
    }

    /**
     * Create an instance of {@link AvvikshandterOgDelDokumentResponse }
     * 
     */
    public AvvikshandterOgDelDokumentResponse createAvvikshandterOgDelDokumentResponse() {
        return new AvvikshandterOgDelDokumentResponse();
    }

    /**
     * Create an instance of {@link FerdigstillRedigerbartDokumentOgJournalpost }
     * 
     */
    public FerdigstillRedigerbartDokumentOgJournalpost createFerdigstillRedigerbartDokumentOgJournalpost() {
        return new FerdigstillRedigerbartDokumentOgJournalpost();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UgyldigJournalstatusPaJournalpostDetKopieresTil }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://nav.no/virksomhet/tjenester/arkiv/journalbehandling/v1", name = "kopierDokumentSomRedigerbartVedleggugyldigJournalstatusPaJournalpostDetKopieresTil")
    public JAXBElement<UgyldigJournalstatusPaJournalpostDetKopieresTil> createKopierDokumentSomRedigerbartVedleggugyldigJournalstatusPaJournalpostDetKopieresTil(UgyldigJournalstatusPaJournalpostDetKopieresTil value) {
        return new JAXBElement<UgyldigJournalstatusPaJournalpostDetKopieresTil>(_KopierDokumentSomRedigerbartVedleggugyldigJournalstatusPaJournalpostDetKopieresTil_QNAME, UgyldigJournalstatusPaJournalpostDetKopieresTil.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UgyldigJournalstatus }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://nav.no/virksomhet/tjenester/arkiv/journalbehandling/v1", name = "gjenbrukRedigerbartDokumentugyldigJournalstatus")
    public JAXBElement<UgyldigJournalstatus> createGjenbrukRedigerbartDokumentugyldigJournalstatus(UgyldigJournalstatus value) {
        return new JAXBElement<UgyldigJournalstatus>(_GjenbrukRedigerbartDokumentugyldigJournalstatus_QNAME, UgyldigJournalstatus.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UgyldigJournalstatus }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://nav.no/virksomhet/tjenester/arkiv/journalbehandling/v1", name = "lagreDokumentOgOpprettJournalpostugyldigJournalstatus")
    public JAXBElement<UgyldigJournalstatus> createLagreDokumentOgOpprettJournalpostugyldigJournalstatus(UgyldigJournalstatus value) {
        return new JAXBElement<UgyldigJournalstatus>(_LagreDokumentOgOpprettJournalpostugyldigJournalstatus_QNAME, UgyldigJournalstatus.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IkkeFerdigstiltVedlegg }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://nav.no/virksomhet/tjenester/arkiv/journalbehandling/v1", name = "ferdigstillRedigerbartDokumentOgJournalpostikkeFerdigstiltVedlegg")
    public JAXBElement<IkkeFerdigstiltVedlegg> createFerdigstillRedigerbartDokumentOgJournalpostikkeFerdigstiltVedlegg(IkkeFerdigstiltVedlegg value) {
        return new JAXBElement<IkkeFerdigstiltVedlegg>(_FerdigstillRedigerbartDokumentOgJournalpostikkeFerdigstiltVedlegg_QNAME, IkkeFerdigstiltVedlegg.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UgyldigJournalstatusPaJournalpostDetKopieresFra }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://nav.no/virksomhet/tjenester/arkiv/journalbehandling/v1", name = "kopierDokumentSomRedigerbartVedleggugyldigJournalstatusPaJournalpostDetKopieresFra")
    public JAXBElement<UgyldigJournalstatusPaJournalpostDetKopieresFra> createKopierDokumentSomRedigerbartVedleggugyldigJournalstatusPaJournalpostDetKopieresFra(UgyldigJournalstatusPaJournalpostDetKopieresFra value) {
        return new JAXBElement<UgyldigJournalstatusPaJournalpostDetKopieresFra>(_KopierDokumentSomRedigerbartVedleggugyldigJournalstatusPaJournalpostDetKopieresFra_QNAME, UgyldigJournalstatusPaJournalpostDetKopieresFra.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UgyldigJournalstatus }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://nav.no/virksomhet/tjenester/arkiv/journalbehandling/v1", name = "slettVedleggFraUtgaendeJournalpostugyldigJournalstatus")
    public JAXBElement<UgyldigJournalstatus> createSlettVedleggFraUtgaendeJournalpostugyldigJournalstatus(UgyldigJournalstatus value) {
        return new JAXBElement<UgyldigJournalstatus>(_SlettVedleggFraUtgaendeJournalpostugyldigJournalstatus_QNAME, UgyldigJournalstatus.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link JournalpostUnderDistribusjonEllerDistribuert }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://nav.no/virksomhet/tjenester/arkiv/journalbehandling/v1", name = "avbrytJournalpostjournalpostUnderDistribusjonEllerDistribuert")
    public JAXBElement<JournalpostUnderDistribusjonEllerDistribuert> createAvbrytJournalpostjournalpostUnderDistribusjonEllerDistribuert(JournalpostUnderDistribusjonEllerDistribuert value) {
        return new JAXBElement<JournalpostUnderDistribusjonEllerDistribuert>(_AvbrytJournalpostjournalpostUnderDistribusjonEllerDistribuert_QNAME, JournalpostUnderDistribusjonEllerDistribuert.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UgyldigDokumentInfoId }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://nav.no/virksomhet/tjenester/arkiv/journalbehandling/v1", name = "lagreDokumentOgOpprettJournalpostugyldigDokumentInfoId")
    public JAXBElement<UgyldigDokumentInfoId> createLagreDokumentOgOpprettJournalpostugyldigDokumentInfoId(UgyldigDokumentInfoId value) {
        return new JAXBElement<UgyldigDokumentInfoId>(_LagreDokumentOgOpprettJournalpostugyldigDokumentInfoId_QNAME, UgyldigDokumentInfoId.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UgyldigJournalstatus }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://nav.no/virksomhet/tjenester/arkiv/journalbehandling/v1", name = "ferdigstillRedigerbartDokumentOgJournalpostugyldigJournalstatus")
    public JAXBElement<UgyldigJournalstatus> createFerdigstillRedigerbartDokumentOgJournalpostugyldigJournalstatus(UgyldigJournalstatus value) {
        return new JAXBElement<UgyldigJournalstatus>(_FerdigstillRedigerbartDokumentOgJournalpostugyldigJournalstatus_QNAME, UgyldigJournalstatus.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UgyldigJournalpostId }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://nav.no/virksomhet/tjenester/arkiv/journalbehandling/v1", name = "oppdaterJournalugyldigJournalpostId")
    public JAXBElement<UgyldigJournalpostId> createOppdaterJournalugyldigJournalpostId(UgyldigJournalpostId value) {
        return new JAXBElement<UgyldigJournalpostId>(_OppdaterJournalugyldigJournalpostId_QNAME, UgyldigJournalpostId.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UgyldigJournalstatus }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://nav.no/virksomhet/tjenester/arkiv/journalbehandling/v1", name = "ferdigstillRedigerbartVedleggugyldigJournalstatus")
    public JAXBElement<UgyldigJournalstatus> createFerdigstillRedigerbartVedleggugyldigJournalstatus(UgyldigJournalstatus value) {
        return new JAXBElement<UgyldigJournalstatus>(_FerdigstillRedigerbartVedleggugyldigJournalstatus_QNAME, UgyldigJournalstatus.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UgyldigInput }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://nav.no/virksomhet/tjenester/arkiv/journalbehandling/v1", name = "avvikshandterOgDelDokumentugyldigInput")
    public JAXBElement<UgyldigInput> createAvvikshandterOgDelDokumentugyldigInput(UgyldigInput value) {
        return new JAXBElement<UgyldigInput>(_AvvikshandterOgDelDokumentugyldigInput_QNAME, UgyldigInput.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UgyldigDokumentInfoId }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://nav.no/virksomhet/tjenester/arkiv/journalbehandling/v1", name = "oppdaterJournalugyldigDokumentInfoId")
    public JAXBElement<UgyldigDokumentInfoId> createOppdaterJournalugyldigDokumentInfoId(UgyldigDokumentInfoId value) {
        return new JAXBElement<UgyldigDokumentInfoId>(_OppdaterJournalugyldigDokumentInfoId_QNAME, UgyldigDokumentInfoId.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UgyldigJournalstatus }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://nav.no/virksomhet/tjenester/arkiv/journalbehandling/v1", name = "mellomlagreRedigerbartDokumentugyldigJournalstatus")
    public JAXBElement<UgyldigJournalstatus> createMellomlagreRedigerbartDokumentugyldigJournalstatus(UgyldigJournalstatus value) {
        return new JAXBElement<UgyldigJournalstatus>(_MellomlagreRedigerbartDokumentugyldigJournalstatus_QNAME, UgyldigJournalstatus.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UgyldigStatusovergang }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://nav.no/virksomhet/tjenester/arkiv/journalbehandling/v1", name = "oppdaterJournalugyldigStatusovergang")
    public JAXBElement<UgyldigStatusovergang> createOppdaterJournalugyldigStatusovergang(UgyldigStatusovergang value) {
        return new JAXBElement<UgyldigStatusovergang>(_OppdaterJournalugyldigStatusovergang_QNAME, UgyldigStatusovergang.class, null, value);
    }

}
