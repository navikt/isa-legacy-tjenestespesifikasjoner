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
@ApiModel(description = "Informasjon om n&aelig;ring")
@JsonPropertyOrder({
        "naeringskode",
        "hjelpeenhet",
        "bruksperiode",
        "gyldighetsperiode"
})
public class Naering {

    private Bruksperiode bruksperiode = new Bruksperiode();

    private Gyldighetsperiode gyldighetsperiode = new Gyldighetsperiode();

    @ApiModelProperty(notes = "N&aelig;ringskode (kodeverk: N_c3_a6ringskoder)", example = "62.030")
    private String naeringskode;

    @ApiModelProperty(notes = "Hjelpeenhet?", example = "false")
    private Boolean hjelpeenhet;
}
