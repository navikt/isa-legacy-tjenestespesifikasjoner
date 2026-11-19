package no.nav.tjenester.ereg.organisasjon.v1;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@EqualsAndHashCode
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@ApiModel(description = "Informasjon om organisasjonsnavn")
@JsonPropertyOrder({
        "redigertnavn",
        "navnelinje1",
        "navnelinje2",
        "navnelinje3",
        "navnelinje4",
        "navnelinje5",
        "bruksperiode",
        "gyldighetsperiode"
})
public class Navn {

    private Bruksperiode bruksperiode = new Bruksperiode();

    private Gyldighetsperiode gyldighetsperiode = new Gyldighetsperiode();

    @ApiModelProperty(notes = "Redigert navn", example = "NAV FAMILIE- OG PENSJONSYTELSER OSL")
    private String redigertnavn;

    @ApiModelProperty(notes = "Navnelinje #1", example = "NAV FAMILIE- OG PENSJONSYTELSER")
    private String navnelinje1;

    @ApiModelProperty(notes = "Navnelinje #2")
    private String navnelinje2;

    @ApiModelProperty(notes = "Navnelinje #3")
    private String navnelinje3;

    @ApiModelProperty(notes = "Navnelinje #4")
    private String navnelinje4;

    @ApiModelProperty(notes = "Navnelinje #5")
    private String navnelinje5;
}
