package com.discovery.suinsit.apps.model.mrp;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import java.math.BigDecimal;
import javax.validation.constraints.Size;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.enartframework.nocode.annotacion.Entidad;

@Data
@NoArgsConstructor
@Entidad (
	type = "TABLE",
	namespace = "mrp",
	name = "MRPRPRODUCTOS" 
)
@Schema (
	name = "" 
)
public class MrprproductosDto { 

	@JsonProperty (
		value = "" 
	)
	@Schema (
		maxLength = 16,
		description = "",
		example = "" 
	)
	@Size (
		min = 0,
		max = 16 
	)
	private BigDecimal realizado;
	@JsonProperty (
		value = "" 
	)
	@Schema (
		maxLength = 16,
		description = "",
		example = "" 
	)
	@Size (
		min = 0,
		max = 16 
	)
	private BigDecimal unidades; 

}