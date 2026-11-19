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
@ApiModel(description = "Informasjon om telefonnummer")
@JsonPropertyOrder({
        "nummer",
        "telefontype",
        "bruksperiode",
        "gyldighetsperiode"
})
public class Telefonnummer {

    private Bruksperiode bruksperiode = new Bruksperiode();

    private Gyldighetsperiode gyldighetsperiode = new Gyldighetsperiode();

    @ApiModelProperty(notes = "Telefonnummer", example = "21 07 00 00")
    private String nummer;

    @ApiModelProperty(notes = "Telefontype (kodeverk: Telefontyper)", example = "TFON")
    private String telefontype;
}
