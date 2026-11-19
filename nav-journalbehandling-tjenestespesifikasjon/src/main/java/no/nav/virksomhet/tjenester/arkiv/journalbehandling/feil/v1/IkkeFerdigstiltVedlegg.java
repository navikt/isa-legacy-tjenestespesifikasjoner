
package no.nav.virksomhet.tjenester.arkiv.journalbehandling.feil.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Returneres dersom gitt journalpost inneholder vedlegg som er under redigering.</p>
 * 
 * <p>Java class for IkkeFerdigstiltVedlegg complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IkkeFerdigstiltVedlegg">
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
@XmlType(name = "IkkeFerdigstiltVedlegg")
public class IkkeFerdigstiltVedlegg
    extends StelvioFault
{


}
