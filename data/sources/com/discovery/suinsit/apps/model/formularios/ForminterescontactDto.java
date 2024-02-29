package com.discovery.suinsit.apps.model.formularios;

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
	namespace = "formularios",
	name = "FORMINTERESCONTACT" 
)
@Schema (
	name = "" 
)
public class ForminterescontactDto { 

	@JsonProperty (
		value = "" 
	)
	@Schema (
		description = "",
		example = "" 
	)
	private boolean desactivado;
	@JsonProperty (
		value = "" 
	)
	@Schema (
		description = "",
		example = "" 
	)
	private String infopublica;
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
	private String producto; 

}