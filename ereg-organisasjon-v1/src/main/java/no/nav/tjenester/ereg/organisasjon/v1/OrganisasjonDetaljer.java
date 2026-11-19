package no.nav.tjenester.ereg.organisasjon.v1;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import no.nav.tjenester.ereg.organisasjon.v1.util.JavaTimeUtil;

@Getter
@Setter
@EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@ApiModel(description = "Informasjon om organisasjonsdetaljer")
@JsonPropertyOrder({
        "registreringsdato",
        "stiftelsesdato",
        "opphoersdato",
        "enhetstyper",
        "statuser",
        "naeringer",
        "navn",
        "forretningsadresser",
        "postadresser",
        "internettadresser",
        "epostadresser",
        "telefonnummer",
        "mobiltelefonnummer",
        "telefaksnummer",
        "formaal",
        "navSpesifikkInformasjon",
        "maalform",
        "sistEndret"
})
public class OrganisasjonDetaljer {

    private LocalDateTime registreringsdato;

    private LocalDate sistEndret;

    @ApiModelProperty(notes = "M&aring;lform (kodeverk: M_c3_a5lformer)", example = "NB")
    private String maalform;

    private LocalDate opphoersdato;

    @ApiModelProperty(notes = "Dublettorganisajon")
    private Organisasjon dublettAv;

    @ApiModelProperty(notes = "Liste av organisasjonsdubletter")
    private List<Organisasjon> dubletter;

    @ApiModelProperty(notes = "Liste av merverdiavgiftinformasjon")
    private List<MVA> registrertMVA;

    @ApiModelProperty(notes = "Liste av telefaksnummer")
    private List<Telefonnummer> telefaksnummer;

    @ApiModelProperty(notes = "Liste av telefonnummer")
    private List<Telefonnummer> telefonnummer;

    @ApiModelProperty(notes = "Liste av organisasjonsstatuser")
    private List<Status> statuser;

    @ApiModelProperty(notes = "Liste av forretningsadresser")
    private List<Forretningsadresse> forretningsadresser;

    @ApiModelProperty(notes = "Liste av postadresser")
    private List<Postadresse> postadresser;

    @ApiModelProperty(notes = "Informasjon som er spesifikk for NAV")
    private NAVSpesifikkInformasjon navSpesifikkInformasjon;

    @ApiModelProperty(notes = "Liste av internettadresser")
    private List<Internettadresse> internettadresser;

    @ApiModelProperty(notes = "Liste av epostadresser")
    private List<Epostadresse> epostadresser;

    @ApiModelProperty(notes = "Liste av n&aelig;ringsinformasjon")
    private List<Naering> naeringer;

    @ApiModelProperty(notes = "Liste av informasjon om foretak i utland")
    private List<UnderlagtHjemlandLovgivningForetaksform> underlagtHjemlandLovgivningForetaksform;

    @ApiModelProperty(notes = "Liste av organisasjonsnavn")
    private List<Navn> navn = new ArrayList<>();

    @ApiModelProperty(notes = "Liste av form&aring;l")
    private List<Formaal> formaal;

    @ApiModelProperty(notes = "Liste av mobiltelefonnummer")
    private List<Telefonnummer> mobiltelefonnummer;

    private LocalDate stiftelsesdato;

    @ApiModelProperty(notes = "Liste av hjemlandregister")
    private List<Hjemlandregister> hjemlandregistre;

    @ApiModelProperty(notes = "Liste av organisasjonsenhetstyper")
    private List<Enhetstype> enhetstyper;

    @ApiModelProperty(notes = "Liste av ansattinformasjon")
    private List<Ansatte> ansatte;

    @JsonIgnore
    public LocalDateTime getRegistreringsdato() {
        return registreringsdato;
    }

    @JsonIgnore
    public LocalDate getSistEndret() {
        return sistEndret;
    }

    @JsonIgnore
    public LocalDate getOpphoersdato() {
        return opphoersdato;
    }

    @JsonIgnore
    public LocalDate getStiftelsesdato() {
        return stiftelsesdato;
    }

    @JsonProperty("registreringsdato")
    @ApiModelProperty(notes = "Dato for registrering, format (ISO-8601): yyyy-MM-dd'T'HH:mm[:ss[.SSSSSSSSS]]", example = "2014-07-15T12:10:58.059")
    public String getRegistreringsdatoAsString() {
        return JavaTimeUtil.toString(registreringsdato);
    }

    @JsonProperty("sistEndret")
    @ApiModelProperty(notes = "Dato sist endret, format (ISO-8601): yyyy-MM-dd", example = "2015-01-13")
    public String getSistEndretDatoAsString() {
        return JavaTimeUtil.toString(sistEndret);
    }

    @JsonProperty("opphoersdato")
    @ApiModelProperty(notes = "Dato for opph&oslash;r, format (ISO-8601): yyyy-MM-dd", example = "2016-12-31")
    public String getOpphoersdatoAsString() {
        return JavaTimeUtil.toString(opphoersdato);
    }

    @JsonProperty("stiftelsesdato")
    @ApiModelProperty(notes = "Dato for stiftelse, format (ISO-8601): yyyy-MM-dd", example = "2014-07-15")
    public String getStiftelsesdatoAsString() {
        return JavaTimeUtil.toString(stiftelsesdato);
    }
}
