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
	name = "MCARGO" 
)
@Entidad (
	type = "TABLE",
	pk = "idxmcargo" 
)
public class Mcargo implements Serializable { 

	private static final long serialVersionUID = 1L;
	@Column (
		name = "CARGO",
		nullable = true 
	)
	private String cargo;
	@Id
	@Column (
		name = "IDXMCARGO",
		nullable = true 
	)
	private Long idxmcargo;
	private boolean updatable; 

	public void setCargo(
		String var
	) {
		this.cargo=var; 
	}
	
	public String getCargo() {
		return this.cargo; 
	}
	
	public void setIdxmcargo(
		Long var
	) {
		this.idxmcargo=var; 
	}
	
	public Long getIdxmcargo() {
		return this.idxmcargo; 
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