package no.nav.tjenester.ereg.organisasjon.v1;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import io.swagger.annotations.ApiModel;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode(callSuper = true)
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@ApiModel(parent = VirksomhetNoekkelinfo.class)
@JsonPropertyOrder({
        "organisasjonsnummer",
        "navn",
        "bruksperiode",
        "gyldighetsperiode"
})
public class DriverVirksomhet extends VirksomhetNoekkelinfo {

    private Bruksperiode bruksperiode = new Bruksperiode();

    private Gyldighetsperiode gyldighetsperiode = new Gyldighetsperiode();
}
