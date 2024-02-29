package org.suinsit.apps.admin;

import java.io.Serializable;
import java.lang.Long;
import java.lang.String;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
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
	name = "MHELPSCREEN" 
)
@Entidad (
	namespace = "admin",
	type = "TABLE",
	name = "MHELPSCREEN",
	labelMonitor = "PAGINA",
	pk = "idxmhelpscreen" 
)
public class Mhelpscreen implements Serializable { 

	private static final long serialVersionUID = 1L;
	@Size (
		min = 0,
		max = 100 
	)
	@Column (
		name = "pagina",
		nullable = true 
	)
	@Field (
		criteria = true,
		auditar = false,
		filter = true,
		label = "",
		type = "VARCHAR" 
	)
	private String pagina;
	@Size (
		min = 0,
		max = 150 
	)
	@ValidEnum (
		enums = {
			",SEARCH,MASTER,POPUP" 
		},
		message = "solamente admite lo valores: ,SEARCH,MASTER,POPUP" 
	)
	@Column (
		name = "tipopagina",
		nullable = true 
	)
	@Field (
		criteria = true,
		auditar = false,
		filter = true,
		label = "",
		type = "ENUM_STRING" 
	)
	private String tipopagina;
	@Id
	@Column (
		name = "idxmhelpscreen",
		nullable = true 
	)
	@Field (
		criteria = false,
		auditar = false,
		filter = true,
		type = "LONG" 
	)
	private Long idxmhelpscreen;
	@Size (
		min = 0,
		max = 10 
	)
	@Column (
		name = "languaje",
		nullable = true 
	)
	@Field (
		criteria = true,
		auditar = false,
		filter = true,
		label = "",
		type = "VARCHAR" 
	)
	private String languaje;
	@Size (
		min = 0,
		max = 100 
	)
	@Column (
		name = "screenuid",
		nullable = true 
	)
	@Field (
		criteria = true,
		auditar = false,
		filter = true,
		label = "",
		type = "VARCHAR" 
	)
	private String screenuid;
	@Column (
		name = "texto",
		nullable = true 
	)
	@Field (
		criteria = true,
		auditar = false,
		filter = true,
		label = "",
		type = "CLOB" 
	)
	private String texto;
	private boolean updatable; 

}