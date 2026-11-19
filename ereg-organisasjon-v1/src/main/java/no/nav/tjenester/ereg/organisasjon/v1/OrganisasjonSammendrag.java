package no.nav.tjenester.ereg.organisasjon.v1;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@ApiModel(description = "Informasjon om organisasjon (i SOLR)")
@JsonPropertyOrder({
        "organisasjonsnummer",
        "enhetstype",
        "redigertnavn",
        "navnelinje1",
        "navnelinje2",
        "navnelinje3",
        "navnelinje4",
        "navnelinje5",
        "organisasjonsleddOrganisasjonsnummer",
        "juridiskEnhetOrganisasjonsnummer",
        "adresselinje1",
        "adresselinje2",
        "adresselinje3",
        "postnummer",
        "poststed",
        "kommunenummer",
        "kommunenavn",
        "landkode",
        "opphoert"
})
public class OrganisasjonSammendrag {

    @ApiModelProperty(notes = "Organisasjonsnummer", example = "990983666")
    private String organisasjonsnummer;

    @ApiModelProperty(notes = "Redigert navn", example = "NAV FAMILIE- OG PENSJONSYTELSER OSL")
    private String redigertnavn;

    @ApiModelProperty(notes = "Navnelinje #1", example = "NAV FAMILIE- OG PENSJONSYTELSER")
    private String navnelinje1;

    @ApiModelProperty(notes = "Navnelinje #2")
    private String navnelinje2;

    @ApiModelProperty(notes = "Navnelinje #3")
    private String navnelinje3;

    @ApiModelProperty(notes = "Navnelinje #4")
    private String navnelinje4;

    @ApiModelProperty(notes = "Navnelinje #5")
    private String navnelinje5;

    @ApiModelProperty(notes = "Enhetstype (kodeverk)", example = "BEDR")
    private String enhetstype;

    @ApiModelProperty(notes = "Organisasjonsnummer for organisasjonsledd", example = "889640782")
    private String organisasjonsleddOrganisasjonsnummer;

    @ApiModelProperty(notes = "Organisasjonsnummer for juridisk enhet", example = "983887457")
    private String juridiskEnhetOrganisasjonsnummer;

    @ApiModelProperty(notes = "Adresselinje #1")
    private String adresselinje1;

    @ApiModelProperty(notes = "Adresselinje #2")
    private String adresselinje2;

    @ApiModelProperty(notes = "Adresselinje #3")
    private String adresselinje3;

    @ApiModelProperty(notes = "Postnummer (kodeverk: Postnummer)", example = "0557")
    private String postnummer;

    @ApiModelProperty(notes = "Poststed", example = "Oslo")
    private String poststed;

    @ApiModelProperty(notes = "Kommunenummer (kodeverk: Kommuner)", example = "0301")
    private String kommunenummer;

    @ApiModelProperty(notes = "Kommunenavn", example = "Oslo")
    private String kommunenavn;

    @ApiModelProperty(notes = "Landkode (kodeverk: Landkoder)", example = "JPN")
    private String landkode;

    @ApiModelProperty(notes = "Er organisasjonen opph&oslash;rt?", example = "false")
    private boolean opphoert;
}
