package com.discovery.suinsit.apps.model.subvenciones;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import java.lang.String;
import java.time.LocalDate;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Schema (
	name = "Solicitud" 
)
public class SubsolictudesDto { 

	@JsonProperty (
		value = "" 
	)
	@Schema (
		maxLength = 100,
		description = "",
		example = "" 
	)
	@Size (
		min = 0,
		max = 100 
	)
	private String subvencion;
	@JsonProperty (
		value = "" 
	)
	@Schema (
		maxLength = 100,
		description = "",
		example = "" 
	)
	@Size (
		min = 0,
		max = 100 
	)
	private String cliente;
	@Schema
	@NotNull
	@NotBlank
	private LocalDate fechasolicitud;
	@Schema
	private String tmalta;
	@Schema
	private String tmmodif; 

}