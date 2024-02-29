package org.suinsit.apps.admin;

import java.io.Serializable;
import java.lang.Long;
import java.lang.String;
import java.sql.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.enartframework.nocode.annotacion.Entidad;
import org.enartframework.nocode.annotacion.Field;
import org.enartframework.nocode.annotacion.ValidEnum;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table (
	name = "ADMACTUALIZACION" 
)
@Entidad (
	namespace = "admin",
	type = "TABLE",
	name = "ADMACTUALIZACION",
	labelMonitor = "ACTUALIZACION",
	pk = "idxadmactualizacion" 
)
public class Admactualizacion implements Serializable { 

	private static final long serialVersionUID = 1L;
	@NotNull
	@NotBlank
	@Size (
		min = 0,
		max = 100 
	)
	@Column (
		name = "actualizacion",
		nullable = false 
	)
	@Field (
		criteria = true,
		auditar = false,
		filter = true,
		label = "",
		type = "VARCHAR" 
	)
	private String actualizacion;
	@Size (
		min = 0,
		max = 100 
	)
	@Column (
		name = "aplicacion",
		nullable = true 
	)
	@Field (
		criteria = true,
		auditar = false,
		filter = true,
		label = "",
		type = "VARCHAR" 
	)
	private String aplicacion;
	@Size (
		min = 0,
		max = 150 
	)
	@ValidEnum (
		enums = {
			",PENDIENTE,INSTALADA,ANULADA" 
		},
		message = "solamente admite lo valores: ,PENDIENTE,INSTALADA,ANULADA" 
	)
	@Column (
		name = "estado",
		nullable = true 
	)
	@Field (
		criteria = true,
		auditar = false,
		filter = true,
		label = "",
		type = "ENUM_STRING" 
	)
	private String estado;
	@Column (
		name = "fecinstalacion",
		nullable = true 
	)
	@Field (
		criteria = true,
		auditar = false,
		filter = true,
		label = "",
		type = "DATE" 
	)
	private Date fecinstalacion;
	@Column (
		name = "fecprevista",
		nullable = true 
	)
	@Field (
		criteria = true,
		auditar = false,
		filter = true,
		label = "",
		type = "DATE" 
	)
	private Date fecprevista;
	@Id
	@Column (
		name = "idxadmactualizacion",
		nullable = true 
	)
	@Field (
		criteria = false,
		auditar = false,
		filter = true,
		type = "LONG" 
	)
	private Long idxadmactualizacion;
	@Column (
		name = "notasversion",
		nullable = true 
	)
	@Field (
		criteria = true,
		auditar = false,
		filter = true,
		label = "",
		type = "CLOB" 
	)
	private String notasversion;
	@Size (
		min = 0,
		max = 100 
	)
	@Column (
		name = "release",
		nullable = true 
	)
	@Field (
		criteria = true,
		auditar = false,
		filter = true,
		label = "",
		type = "VARCHAR" 
	)
	private String release;
	@Size (
		min = 0,
		max = 150 
	)
	@ValidEnum (
		enums = {
			",INCIDENCIA,MEJORA,VERSION,PERSONALIZACION" 
		},
		message = "solamente admite lo valores: ,INCIDENCIA,MEJORA,VERSION,PERSONALIZACION" 
	)
	@Column (
		name = "tipoactualiza",
		nullable = true 
	)
	@Field (
		criteria = true,
		auditar = false,
		filter = true,
		label = "",
		type = "ENUM_STRING" 
	)
	private String tipoactualiza;
	@Size (
		min = 0,
		max = 100 
	)
	@Column (
		name = "version",
		nullable = true 
	)
	@Field (
		criteria = true,
		auditar = false,
		filter = true,
		label = "",
		type = "VARCHAR" 
	)
	private String version;
	private boolean updatable; 

}