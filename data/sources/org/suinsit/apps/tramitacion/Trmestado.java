package org.suinsit.apps.tramitacion;

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
	name = "TRMESTADO" 
)
@Entidad (
	type = "TABLE",
	pk = "idxtrmestado" 
)
public class Trmestado implements Serializable { 

	private static final long serialVersionUID = 1L;
	@Column (
		name = "ESTADO",
		nullable = true 
	)
	private String estado;
	@Id
	@Column (
		name = "IDXTRMESTADO",
		nullable = true 
	)
	private Long idxtrmestado;
	private boolean updatable; 

	public void setEstado(
		String var
	) {
		this.estado=var; 
	}
	
	public String getEstado() {
		return this.estado; 
	}
	
	public void setIdxtrmestado(
		Long var
	) {
		this.idxtrmestado=var; 
	}
	
	public Long getIdxtrmestado() {
		return this.idxtrmestado; 
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