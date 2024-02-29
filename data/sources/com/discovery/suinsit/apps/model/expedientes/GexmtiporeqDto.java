package com.discovery.suinsit.apps.model.expedientes;

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
	namespace = "expedientes",
	name = "GEXMTIPOREQ" 
)
@Schema (
	name = "Tipo Requisito" 
)
public class GexmtiporeqDto { 

	@JsonProperty (
		value = "" 
	)
	@Schema (
		description = "",
		example = "" 
	)
	private String plantillaescrito;
	@JsonProperty (
		value = "" 
	)
	@Schema (
		description = "",
		example = "" 
	)
	private boolean adjuntardoc;
	@JsonProperty (
		value = "" 
	)
	@Schema (
		description = "",
		example = "" 
	)
	private String descripcion;
	@JsonProperty (
		value = "" 
	)
	@Schema (
		maxLength = 100,
		description = "",
		example = "" 
	)
	@NotNull
	@NotBlank
	@Size (
		min = 0,
		max = 100 
	)
	private String tiporequisito; 

}