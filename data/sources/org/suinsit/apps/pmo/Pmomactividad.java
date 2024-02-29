package org.suinsit.apps.pmo;

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
	name = "PMOMACTIVIDAD" 
)
@Entidad (
	type = "TABLE",
	pk = "idxpmomactividad" 
)
public class Pmomactividad implements Serializable { 

	private static final long serialVersionUID = 1L;
	@Column (
		name = "DESCRIPCION",
		nullable = true 
	)
	private String descripcion;
	@Column (
		name = "ACTIVIDAD",
		nullable = false 
	)
	private String actividad;
	@Id
	@Column (
		name = "IDXPMOMACTIVIDAD",
		nullable = true 
	)
	private Long idxpmomactividad;
	private boolean updatable; 

	public void setDescripcion(
		String var
	) {
		this.descripcion=var; 
	}
	
	public String getDescripcion() {
		return this.descripcion; 
	}
	
	public void setActividad(
		String var
	) {
		this.actividad=var; 
	}
	
	public String getActividad() {
		return this.actividad; 
	}
	
	public void setIdxpmomactividad(
		Long var
	) {
		this.idxpmomactividad=var; 
	}
	
	public Long getIdxpmomactividad() {
		return this.idxpmomactividad; 
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