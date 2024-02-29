package org.suinsit.apps.admin;

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
	name = "MORIGEN" 
)
@Entidad (
	type = "TABLE",
	pk = "idxmorigen" 
)
public class Morigen implements Serializable { 

	private static final long serialVersionUID = 1L;
	@Id
	@Column (
		name = "IDXMORIGEN",
		nullable = true 
	)
	private Long idxmorigen;
	@Column (
		name = "ORIGEN",
		nullable = false 
	)
	private String origen;
	private boolean updatable; 

	public void setIdxmorigen(
		Long var
	) {
		this.idxmorigen=var; 
	}
	
	public Long getIdxmorigen() {
		return this.idxmorigen; 
	}
	
	public void setOrigen(
		String var
	) {
		this.origen=var; 
	}
	
	public String getOrigen() {
		return this.origen; 
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