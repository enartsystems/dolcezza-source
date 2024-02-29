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
	name = "MTIPOEMPRESA" 
)
@Schema (
	name = "TIPOEMPRESA" 
)
public class MtipoempresaDto { 

	@JsonProperty (
		value = "tipoempresa" 
	)
	@Schema (
		maxLength = 100,
		description = "Tipo de empresa",
		example = "Pyme" 
	)
	@Size (
		min = 0,
		max = 100 
	)
	private String tipoempresa; 

}