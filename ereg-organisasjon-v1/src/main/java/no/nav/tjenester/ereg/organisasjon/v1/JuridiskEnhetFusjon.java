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

/**
 * Assosiasjonsklasse mellom to JuridiskeEnheter ifm. Fusjon, som holder på attributter på selve relasjonen de juridiske enhetene som fusjoneres til en juridisk enhet, samt metadata som bruksperiode for opplysningen.
 */
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
public class JuridiskEnhetFusjon {

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
    @ApiModelProperty(notes = "Virkningsdato for fusjon, format (ISO-8601): yyyy-MM-dd", example = "2015-05-31")
    public String getVirkningsdatoAsString() {
        return JavaTimeUtil.toString(virkningsdato);
    }
}
