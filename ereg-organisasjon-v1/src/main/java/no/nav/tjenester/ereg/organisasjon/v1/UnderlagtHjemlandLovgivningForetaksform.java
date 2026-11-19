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
@ApiModel(description = "Informasjon om foretak i utland")
@JsonPropertyOrder({
        "landkode",
        "foretaksform",
        "beskrivelseHjemland",
        "beskrivelseNorge",
        "bruksperiode",
        "gyldighetsperiode"
})
public class UnderlagtHjemlandLovgivningForetaksform {

    private Bruksperiode bruksperiode = new Bruksperiode();

    private Gyldighetsperiode gyldighetsperiode = new Gyldighetsperiode();

    @ApiModelProperty(notes = "Landkode (kodeverk: Landkoder)", example = "GB")
    private String landkode;

    @ApiModelProperty(notes = "Fortaksform (kodeverk: ForetaksformUtland)", example = "LTD")
    private String foretaksform;

    @ApiModelProperty(notes = "Beskrivelse i hjemland")
    private String beskrivelseHjemland;

    @ApiModelProperty(notes = "Beskrivelse i Norge")
    private String beskrivelseNorge;
}
