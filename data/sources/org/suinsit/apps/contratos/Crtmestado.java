package org.suinsit.apps.contratos;

import java.io.Serializable;
import java.lang.Long;
import java.lang.String;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import org.enartframework.nocode.annotacion.Entidad;

@Entity
@Table (
	name = "CRTMESTADO" 
)
@Entidad (
	type = "TABLE",
	pk = "idxcrtmestado" 
)
public class Crtmestado implements Serializable { 

	private static final long serialVersionUID = 1L;
	@Column (
		name = "ESTADO",
		nullable = true 
	)
	private String estado;
	@Id
	@Column (
		name = "IDXCRTMESTADO",
		nullable = true 
	)
	private Long idxcrtmestado;
	private boolean updatable; 

	public void setEstado(
		String var
	) {
		this.estado=var; 
	}
	
	public String getEstado() {
		return this.estado; 
	}
	
	public void setIdxcrtmestado(
		Long var
	) {
		this.idxcrtmestado=var; 
	}
	
	public Long getIdxcrtmestado() {
		return this.idxcrtmestado; 
	}
	
	public void setUpdatable(
		boolean var
	) {
		this.updatable=var; 
	}
	
	public boolean isUpdatable() {
		return this.updatable; 
	} 

}