package no.nav.tjenester.ereg.organisasjon.v1;

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
        "enhetstype",
        "sektorkode"
})
public class OrganisasjonsleddDetaljer {

    @ApiModelProperty(notes = "Enhetstype (kodeverk)", example = "ORGL")
    private String enhetstype;

    @ApiModelProperty(notes = "Sektorkode (kodeverk: Sektorkoder)", example = "6500")
    private String sektorkode;
}
