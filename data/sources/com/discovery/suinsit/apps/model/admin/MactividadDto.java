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
	name = "MACTIVIDAD" 
)
@Schema (
	name = "Actividad" 
)
public class MactividadDto { 

	@JsonProperty (
		value = "actividad" 
	)
	@Schema (
		maxLength = 100,
		description = "actividad",
		example = "Construcción" 
	)
	@NotNull
	@NotBlank
	@Size (
		min = 0,
		max = 100 
	)
	private String actividad;
	@JsonProperty (
		value = "cnae" 
	)
	@Schema (
		maxLength = 100,
		description = "cod. cnae",
		example = "809.21" 
	)
	@Size (
		min = 0,
		max = 100 
	)
	private String cnae;
	@JsonProperty (
		value = "iae" 
	)
	@Schema (
		maxLength = 100,
		description = "cod. iae",
		example = "7453.12" 
	)
	@Size (
		min = 0,
		max = 100 
	)
	private String iae; 

}