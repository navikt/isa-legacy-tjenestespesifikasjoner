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
@ApiModel(description = "Informasjon knyttet til NAV")
@JsonPropertyOrder({
        "erIA",
        "bruksperiode",
        "gyldighetsperiode"
})
public class NAVSpesifikkInformasjon {

    private Bruksperiode bruksperiode = new Bruksperiode();

    private Gyldighetsperiode gyldighetsperiode = new Gyldighetsperiode();

    @ApiModelProperty(notes = "Inkluderende arbeidsliv (IA)?", example = "true")
    private Boolean erIA;
}
