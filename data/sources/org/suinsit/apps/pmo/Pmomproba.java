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
	name = "PMOMPROBA" 
)
@Entidad (
	type = "TABLE",
	pk = "idxpmomproba" 
)
public class Pmomproba implements Serializable { 

	private static final long serialVersionUID = 1L;
	@Column (
		name = "PROBABILIDAD",
		nullable = false 
	)
	private String probabilidad;
	@Id
	@Column (
		name = "IDXPMOMPROBA",
		nullable = true 
	)
	private Long idxpmomproba;
	private boolean updatable; 

	public void setProbabilidad(
		String var
	) {
		this.probabilidad=var; 
	}
	
	public String getProbabilidad() {
		return this.probabilidad; 
	}
	
	public void setIdxpmomproba(
		Long var
	) {
		this.idxpmomproba=var; 
	}
	
	public Long getIdxpmomproba() {
		return this.idxpmomproba; 
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