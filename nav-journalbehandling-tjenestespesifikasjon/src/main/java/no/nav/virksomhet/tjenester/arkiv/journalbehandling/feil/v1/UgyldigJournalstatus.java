
package no.nav.virksomhet.tjenester.arkiv.journalbehandling.feil.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>For at tjenesteoperasjonen skal kunne utføres må journalposten være under arbeid, hvis ikke returneres en funksjonell feil. Dvs journalstatusKode på journalposten tilknyttet journalpostId må være lik "D" (Under arbeid).</p>
 * 
 * <p>Java class for UgyldigJournalstatus complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UgyldigJournalstatus">
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
@XmlType(name = "UgyldigJournalstatus")
public class UgyldigJournalstatus
    extends StelvioFault
{


}
