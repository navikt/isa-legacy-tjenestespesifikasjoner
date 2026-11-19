package no.nav.tjenester.ereg.organisasjon.v1;

import java.time.LocalDate;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import io.swagger.annotations.ApiModelProperty;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import no.nav.tjenester.ereg.organisasjon.v1.util.JavaTimeUtil;

@Getter
@Setter
@EqualsAndHashCode
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
        "enhetstype",
        "ubemannetVirksomhet",
        "oppstartsdato",
        "eierskiftedato",
        "nedleggelsesdato"
})
public class VirksomhetDetaljer {

    private LocalDate oppstartsdato;

    private LocalDate eierskiftedato;

    private LocalDate nedleggelsesdato;

    @ApiModelProperty(notes = "Enhetstype - virksomhet (kodeverk: EnhetstyperVirksomhet)", example = "BEDR")
    private String enhetstype;

    @ApiModelProperty(notes = "Er virksomheten ubemannet?", example = "false")
    private Boolean ubemannetVirksomhet;

    @JsonIgnore
    public LocalDate getOppstartsdato() {
        return oppstartsdato;
    }

    @JsonIgnore
    public LocalDate getEierskiftedato() {
        return eierskiftedato;
    }

    @JsonIgnore
    public LocalDate getNedleggelsesdato() {
        return nedleggelsesdato;
    }

    @JsonProperty("oppstartsdato")
    @ApiModelProperty(notes = "Dato for oppstart, format (ISO-8601): yyyy-MM-dd", example = "2014-07-15")
    public String getOppstartsdatoAsString() {
        return JavaTimeUtil.toString(oppstartsdato);
    }

    @JsonProperty("eierskiftedato")
    @ApiModelProperty(notes = "Dato for eierskifte, format (ISO-8601): yyyy-MM-dd", example = "2015-01-13")
    public String getEierskiftedatoAsString() {
        return JavaTimeUtil.toString(eierskiftedato);
    }

    @JsonProperty("nedleggelsesdato")
    @ApiModelProperty(notes = "Dato for nedleggelse, format (ISO-8601): yyyy-MM-dd", example = "2016-12-31")
    public String getNedleggelsesdatoAsString() {
        return JavaTimeUtil.toString(nedleggelsesdato);
    }
}
