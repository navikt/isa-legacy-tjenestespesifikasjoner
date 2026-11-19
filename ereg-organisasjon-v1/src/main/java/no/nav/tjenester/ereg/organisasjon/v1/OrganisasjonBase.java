package no.nav.tjenester.ereg.organisasjon.v1;

import com.fasterxml.jackson.annotation.JsonInclude;

import io.swagger.annotations.ApiModelProperty;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public abstract class OrganisasjonBase {

    @ApiModelProperty(notes = "Organisasjonsnummer", example = "990983666")
    private String organisasjonsnummer;

    @ApiModelProperty(notes = "Informasjon om organisasjonsnavn")
    private Navn navn;
}
