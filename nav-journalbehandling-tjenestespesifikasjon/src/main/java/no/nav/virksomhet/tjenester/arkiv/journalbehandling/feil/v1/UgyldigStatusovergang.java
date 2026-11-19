
package no.nav.virksomhet.tjenester.arkiv.journalbehandling.feil.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p><span style="font-size:11pt;font-family:Calibri;">Ulovlig overgang mellom gammel og ny journalstatus</span><span style="font-size:11pt;font-family:Calibri;"></span></p>
 * 
 * <p>Java class for UgyldigStatusovergang complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UgyldigStatusovergang">
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
@XmlType(name = "UgyldigStatusovergang")
public class UgyldigStatusovergang
    extends StelvioFault
{


}
