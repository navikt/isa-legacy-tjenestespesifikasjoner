package no.nav.tjenester.ereg.organisasjon.v1;

import com.fasterxml.jackson.annotation.JsonInclude;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode(callSuper = true)
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@ApiModel(
        description = "Informasjon om organisasjon, subtyper: Virksomhet/JuridiskEnhet/Organisasjonsledd",
        parent = OrganisasjonBase.class,
        discriminator = "type",
        subTypes = {
                Virksomhet.class,
                JuridiskEnhet.class,
                Organisasjonsledd.class
        }
)
public class Organisasjon extends OrganisasjonBase {

    @ApiModelProperty(notes = "Detaljinformasjon for organisasjon")
    private OrganisasjonDetaljer organisasjonDetaljer;

    @ApiModelProperty(notes = "Organisasjonstype: Virksomhet/JuridiskEnhet/Organisasjonsledd", example = "Virksomhet")
    public String getType() {
        return this.getClass().getSimpleName();
    }
}

