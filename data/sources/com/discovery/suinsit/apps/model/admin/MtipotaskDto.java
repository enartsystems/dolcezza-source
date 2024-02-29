package com.discovery.suinsit.apps.model.admin;

import io.swagger.v3.oas.annotations.media.Schema;
import java.lang.String;
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
	namespace = "admin",
	name = "MTIPOTASK" 
)
@Schema (
	name = "TIPO TAREA" 
)
public class MtipotaskDto { 

	@Schema (
		maxLength = 100,
		description = "Tipo de tarea",
		example = "llamada" 
	)
	@NotNull
	@NotBlank
	@Size (
		min = 0,
		max = 100 
	)
	private String tipotarea; 

}