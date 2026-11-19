
package no.nav.virksomhet.tjenester.arkiv.journalbehandling.feil.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Returneres når journalposten man forsøker å lagre et nytt vedlegg på har journalstatus ulik "D".</p>
 * 
 * <p>Java class for UgyldigJournalstatusPaJournalpostDetKopieresTil complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UgyldigJournalstatusPaJournalpostDetKopieresTil">
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
@XmlType(name = "UgyldigJournalstatusPaJournalpostDetKopieresTil")
public class UgyldigJournalstatusPaJournalpostDetKopieresTil
    extends StelvioFault
{


}
