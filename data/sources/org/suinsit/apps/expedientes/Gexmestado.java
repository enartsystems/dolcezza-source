package org.suinsit.apps.expedientes;

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
	name = "GEXMESTADO" 
)
@Entidad (
	type = "TABLE",
	pk = "idxgexmestado" 
)
public class Gexmestado implements Serializable { 

	private static final long serialVersionUID = 1L;
	@Column (
		name = "ESTADO",
		nullable = true 
	)
	private String estado;
	@Id
	@Column (
		name = "IDXGEXMESTADO",
		nullable = true 
	)
	private Long idxgexmestado;
	private boolean updatable; 

	public void setEstado(
		String var
	) {
		this.estado=var; 
	}
	
	public String getEstado() {
		return this.estado; 
	}
	
	public void setIdxgexmestado(
		Long var
	) {
		this.idxgexmestado=var; 
	}
	
	public Long getIdxgexmestado() {
		return this.idxgexmestado; 
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