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
@ApiModel(description = "Informasjon om hjemlandregister")
@JsonPropertyOrder({
        "registernummer",
        "navn1",
        "navn2",
        "navn3",
        "postadresse",
        "bruksperiode",
        "gyldighetsperiode"
})
public class Hjemlandregister {

    private Bruksperiode bruksperiode = new Bruksperiode();

    private Gyldighetsperiode gyldighetsperiode = new Gyldighetsperiode();

    @ApiModelProperty(notes = "Registernummer", example = "0932568")
    private String registernummer;

    @ApiModelProperty(notes = "Navn #1")
    private String navn1;

    @ApiModelProperty(notes = "Navn #2")
    private String navn2;

    @ApiModelProperty(notes = "Navn #3")
    private String navn3;

    @ApiModelProperty(notes = "Postadresse for hjemlandregister")
    private Postadresse postadresse;
}
