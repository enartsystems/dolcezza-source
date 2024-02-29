package com.discovery.suinsit.apps.model.admin;

import com.fasterxml.jackson.annotation.JsonProperty;
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
	name = "MTIPOOPORTUNIDAD" 
)
@Schema (
	name = "TIPO OPORTUNIDAD" 
)
public class MtipooportunidadDto { 

	@JsonProperty (
		value = "tipo" 
	)
	@Schema (
		maxLength = 100,
		description = "Tipo de Oportunidad",
		example = "Nuevo Negocio" 
	)
	@NotNull
	@NotBlank
	@Size (
		min = 0,
		max = 100 
	)
	private String tipooportunidad; 

}