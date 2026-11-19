package no.nav.tjenester.ereg.organisasjon.v1;

import java.math.BigDecimal;
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
        "kapital",
        "kapitalInnbetalt",
        "kapitalBundetKs",
        "valuta",
        "fritekst",
        "bruksperiode",
        "gyldighetsperiode"
})
public class Kapitalopplysninger {

    private Bruksperiode bruksperiode = new Bruksperiode();

    private Gyldighetsperiode gyldighetsperiode = new Gyldighetsperiode();

    @ApiModelProperty(notes = "Valuta (kodeverk: Valutaer)", example = "NOK")
    private String valuta;

    @ApiModelProperty(notes = "Kapital", example = "714587398")
    private BigDecimal kapital;

    @ApiModelProperty(notes = "Innbetalt kapital", example = "531710600")
    private BigDecimal kapitalInnbetalt;

    @ApiModelProperty(notes = "Bundet kapital", example = "285834959.20")
    private String kapitalBundetKs;

    @ApiModelProperty(notes = "Fritekst for informasjon om kapital")
    private String fritekst;
}
