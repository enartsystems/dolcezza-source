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
	name = "MPAIS" 
)
@Schema (
	name = "Pais" 
)
public class MpaisDto { 

	@Schema (
		maxLength = 100 
	)
	@Size (
		min = 0,
		max = 100 
	)
	private String name;
	@JsonProperty (
		value = "pais" 
	)
	@Schema (
		maxLength = 100,
		description = "pais",
		example = "España" 
	)
	@Size (
		min = 0,
		max = 100 
	)
	private String nombre;
	@JsonProperty (
		value = "codigotelefono" 
	)
	@Schema (
		maxLength = 100,
		description = "codigo telefono",
		example = "+34" 
	)
	@Size (
		min = 0,
		max = 100 
	)
	private String phonecode; 

}