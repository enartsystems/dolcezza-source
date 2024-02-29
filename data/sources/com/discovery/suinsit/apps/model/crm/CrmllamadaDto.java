package com.discovery.suinsit.apps.model.crm;

import com.discovery.suinsit.apps.model.admin.Mmotivollamada;
import com.discovery.suinsit.apps.model.crm.Crmcontacto;
import com.discovery.suinsit.apps.model.crm.Crmempresa;
import com.discovery.suinsit.apps.model.crm.Crmoportunidad;
import com.discovery.suinsit.apps.model.crm.Crmtarea;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import java.lang.String;
import java.sql.Timestamp;
import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.enartframework.nocode.annotacion.Entidad;

@Data
@NoArgsConstructor
@Entidad (
	type = "TABLE",
	namespace = "crm",
	name = "CRMLLAMADA" 
)
@Schema (
	name = "Llamada" 
)
public class CrmllamadaDto { 

	@JsonProperty (
		value = "comment" 
	)
	@Schema (
		description = "comentarios",
		example = "llamada de seguimiento" 
	)
	private String comentarios;
	@JsonProperty (
		value = "datecall" 
	)
	@Schema (
		description = "fecha realización",
		example = "10/02/23 10:15" 
	)
	@NotNull
	@NotBlank
	private Timestamp realizada;
	@JsonProperty (
		value = "contacto" 
	)
	@Valid
	@Schema (
		name = "contacto" 
	)
	private Crmcontacto idcrmcontacto;
	@JsonProperty (
		value = "cliente" 
	)
	@Valid
	@Schema (
		name = "cliente" 
	)
	private Crmempresa idcrmempresa;
	@JsonProperty (
		value = "motivo" 
	)
	@Valid
	@Schema (
		name = "motivo" 
	)
	private Mmotivollamada idmmotivollamada;
	@JsonProperty (
		value = "oportunidad" 
	)
	@Valid
	@Schema (
		name = "oportunidad" 
	)
	private Crmoportunidad idcrmoportunidad;
	@JsonProperty (
		value = "tarea" 
	)
	@Valid
	@Schema (
		name = "tarea" 
	)
	private Crmtarea idcrmtarea; 

}