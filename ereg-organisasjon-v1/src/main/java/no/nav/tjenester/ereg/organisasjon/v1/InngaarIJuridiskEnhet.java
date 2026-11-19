package no.nav.tjenester.ereg.organisasjon.v1;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import io.swagger.annotations.ApiModel;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

/**
 * Assosiasjonsklasse mellom to JuridiskeEnhet og de Orgledd den består av, som holder på attributter på selve relasjonen , samt metadata som gyldighetsperiode og bruksperiode for opplysningen.
 */
@Getter
@Setter
@EqualsAndHashCode(callSuper = true)
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@ApiModel(parent = JuridiskEnhetNoekkelinfo.class)
@JsonPropertyOrder({
        "organisasjonsnummer",
        "navn",
        "bruksperiode",
        "gyldighetsperiode"
})
public class InngaarIJuridiskEnhet extends JuridiskEnhetNoekkelinfo {

    private Bruksperiode bruksperiode = new Bruksperiode();

    private Gyldighetsperiode gyldighetsperiode = new Gyldighetsperiode();
}
