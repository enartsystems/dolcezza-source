package com.discovery.suinsit.apps.model.crm;

import com.discovery.suinsit.apps.model.admin.Mtipotask;
import com.discovery.suinsit.apps.model.crm.Crmcontacto;
import com.discovery.suinsit.apps.model.crm.Crmempresa;
import com.discovery.suinsit.apps.model.crm.Crmoportunidad;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import java.lang.String;
import java.sql.Timestamp;
import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.enartframework.nocode.annotacion.Entidad;

@Data
@NoArgsConstructor
@Entidad (
	type = "TABLE",
	namespace = "crm",
	name = "CRMTAREA" 
)
@Schema (
	name = "Tarea" 
)
public class CrmtareaDto { 

	@JsonProperty (
		value = "nota" 
	)
	@Schema (
		description = "Nota",
		example = "mi anotacion" 
	)
	private String nota;
	@JsonProperty (
		value = "recordatorio" 
	)
	@Schema (
		description = "flag si debe de enviar reocrdatorio",
		example = "true/false" 
	)
	private boolean recordatorio;
	@JsonProperty (
		value = "task" 
	)
	@Schema (
		maxLength = 100,
		description = "nombre de la tarea",
		example = "tarea" 
	)
	@NotNull
	@NotBlank
	@Size (
		min = 0,
		max = 100 
	)
	private String tarea;
	@JsonProperty (
		value = "duedate" 
	)
	@Schema (
		description = "fecha vencimiento",
		example = "10/02/23 10:15" 
	)
	@NotNull
	@NotBlank
	private Timestamp vencimiento;
	@JsonProperty (
		value = "contacto" 
	)
	@Valid
	@Schema (
		name = "contacto" 
	)
	private Crmcontacto idcrmcontacto;
	@JsonProperty (
		value = "oportunidad" 
	)
	@Valid
	@Schema (
		name = "oportunidad" 
	)
	private Crmoportunidad idcrmoportunidad;
	@JsonProperty (
		value = "TipoTarea" 
	)
	@Valid
	@Schema (
		name = "TipoTarea" 
	)
	private Mtipotask idmtipotask;
	@JsonProperty (
		value = "cliente" 
	)
	@Valid
	@Schema (
		name = "cliente" 
	)
	private Crmempresa idcrmempresa; 

}