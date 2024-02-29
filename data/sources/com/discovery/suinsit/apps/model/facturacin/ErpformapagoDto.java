package com.discovery.suinsit.apps.model.facturacin;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import java.lang.Integer;
import java.math.BigDecimal;
import javax.validation.constraints.Size;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Schema (
	name = "Forma de Pago" 
)
public class ErpformapagoDto { 

	@JsonProperty (
		value = "" 
	)
	@Schema (
		description = "",
		example = "" 
	)
	private boolean mensual;
	@JsonProperty (
		value = "" 
	)
	@Schema (
		description = "",
		example = "" 
	)
	private Integer numpagos;
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
	private BigDecimal porcentaje; 

}