package no.nav.tjenester.ereg.organisasjon.v1;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
@EqualsAndHashCode(callSuper = true)
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@ApiModel(description = "N&oslash;kkelinformasjon for organisasjon", parent = OrganisasjonBase.class)
@JsonPropertyOrder({
        "organisasjonsnummer",
        "type",
        "navn",
        "enhetstype",
        "adresse",
        "opphoersdato"
})
public class OrganisasjonNoekkelinfo extends OrganisasjonBase {

    @ApiModelProperty(notes = "Enhetstype (kodeverk)", example = "BEDR")
    private String enhetstype;

    @ApiModelProperty(notes = "Informasjon om adresse")
    private Adresse adresse;

    @ApiModelProperty(notes = "Dato for opph&oslash;r, format (ISO-8601): yyyy-MM-dd", example = "2016-12-31")
    private String opphoersdato;
}
