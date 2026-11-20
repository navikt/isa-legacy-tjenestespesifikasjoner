
package no.nav.virksomhet.tjenester.arkiv.journalbehandling.feil.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Returneres når journalposten man forsøker å kopiere fra har journalstatus ulik "J" eller "FS" eller "FL" eller "E".</p>
 * 
 * <p>Java class for UgyldigJournalstatusPaJournalpostDetKopieresFra complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UgyldigJournalstatusPaJournalpostDetKopieresFra">
 *   &lt;complexContent>
 *     &lt;extension base="{http://nav.no/virksomhet/tjenester/arkiv/journalbehandling/feil/v1}StelvioFault">
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UgyldigJournalstatusPaJournalpostDetKopieresFra")
public class UgyldigJournalstatusPaJournalpostDetKopieresFra
    extends StelvioFault
{


}
