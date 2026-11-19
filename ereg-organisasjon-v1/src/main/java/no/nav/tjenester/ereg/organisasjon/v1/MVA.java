package no.nav.tjenester.ereg.organisasjon.v1;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@ApiModel(description = "Informasjon om merverdiavgift")
@JsonPropertyOrder({
        "registrertIMVA",
        "bruksperiode",
        "gyldighetsperiode"
})
public class MVA {

    private Bruksperiode bruksperiode = new Bruksperiode();

    private Gyldighetsperiode gyldighetsperiode = new Gyldighetsperiode();

    @ApiModelProperty(notes = "Registrert i Merverdiregisteret?", example = "true")
    private Boolean registrertIMVA;
}
