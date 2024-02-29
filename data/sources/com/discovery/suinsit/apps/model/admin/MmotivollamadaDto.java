package com.discovery.suinsit.apps.model.admin;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import java.lang.String;
import javax.validation.constraints.Size;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.enartframework.nocode.annotacion.Entidad;

@Data
@NoArgsConstructor
@Entidad (
	type = "TABLE",
	namespace = "admin",
	name = "MMOTIVOLLAMADA" 
)
@Schema (
	name = "MOTIVOLLAMADA" 
)
public class MmotivollamadaDto { 

	@JsonProperty (
		value = "motivo" 
	)
	@Schema (
		maxLength = 100,
		description = "Motivo llamada",
		example = "seguimiento" 
	)
	@Size (
		min = 0,
		max = 100 
	)
	private String motivo; 

}