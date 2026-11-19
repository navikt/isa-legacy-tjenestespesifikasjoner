package no.nav.tjenester.ereg.organisasjon.v1;

import java.time.LocalDate;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.Setter;
import no.nav.tjenester.ereg.organisasjon.v1.util.JavaTimeUtil;

@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
        "fom",
        "tom"
})
public class Gyldighetsperiode {

    private LocalDate fom;

    private LocalDate tom;

    @JsonIgnore
    public LocalDate getFom() {
        return fom;
    }

    @JsonIgnore
    public LocalDate getTom() {
        return tom;
    }

    @JsonProperty("fom")
    @ApiModelProperty(notes = "Fra-og-med-dato for gyldighetsperiode, format (ISO-8601): yyyy-MM-dd", example = "2014-07-01")
    public String getFomAsString() {
        return JavaTimeUtil.toString(fom);
    }

    @JsonProperty("tom")
    @ApiModelProperty(notes = "Til-og-med-dato for gyldighetsperiode, format (ISO-8601): yyyy-MM-dd", example = "2015-12-31")
    public String getTomAsString() {
        return JavaTimeUtil.toString(tom);
    }
}
