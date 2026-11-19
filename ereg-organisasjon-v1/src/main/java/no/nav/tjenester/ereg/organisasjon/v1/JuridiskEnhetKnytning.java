package no.nav.tjenester.ereg.organisasjon.v1;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import io.swagger.annotations.ApiModelProperty;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
        "knytning",
        "juridiskEnhet",
        "bruksperiode",
        "gyldighetsperiode"
})
public class JuridiskEnhetKnytning {

    private Bruksperiode bruksperiode = new Bruksperiode();

    private Gyldighetsperiode gyldighetsperiode = new Gyldighetsperiode();

    @ApiModelProperty(notes = "Knytning - juridisk enhet (kodeverk: Knytninger)", example = "KIRK")
    private String knytning;

    @ApiModelProperty(notes = "Informasjon om juridisk enhet")
    private JuridiskEnhet juridiskEnhet;
}
