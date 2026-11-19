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
        "juridiskEnhet",
        "virkningsdato",
        "bruksperiode",
        "gyldighetsperiode"
})
public class JuridiskEnhetFisjon {

    private Bruksperiode bruksperiode = new Bruksperiode();

    private Gyldighetsperiode gyldighetsperiode = new Gyldighetsperiode();

    private LocalDate virkningsdato;

    @ApiModelProperty(notes = "Informasjon om juridisk enhet")
    private JuridiskEnhet juridiskEnhet;

    @JsonIgnore
    public LocalDate getVirkningsdato() {
        return virkningsdato;
    }

    @JsonProperty("virkningsdato")
    @ApiModelProperty(notes = "Virkningsdato for fisjon, format (ISO-8601): yyyy-MM-dd", example = "2015-05-31")
    public String getVirkningsdatoAsString() {
        return JavaTimeUtil.toString(virkningsdato);
    }
}
