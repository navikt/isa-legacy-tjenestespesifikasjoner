package no.nav.tjenester.ereg.organisasjon.v1;

import io.swagger.annotations.ApiModel;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode(callSuper = true)
@ApiModel(description = "Informasjon om forretningsadresse", parent = Adresse.class)
public class Forretningsadresse extends Adresse {
}
