package no.nav.tjenester.ereg.organisasjon.v1;

import java.util.List;
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
@EqualsAndHashCode
@ApiModel(description = "Resultatobjekt for finn-organisasjon-sammendrag")
@JsonPropertyOrder({
        "organisasjoner",
        "totalAntallTreff"
})
public class OrganisasjonSammendragResultat {

    @ApiModelProperty(notes = "Liste av informasjon i SOLR for organisasjoner")
    private List<OrganisasjonSammendrag> organisasjonSammendrag;

    @ApiModelProperty(notes = "Antall treff (totalt)")
    private long totalAntallTreff;
}
