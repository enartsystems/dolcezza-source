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
	name = "PMOMTIPOINC" 
)
@Entidad (
	type = "TABLE",
	pk = "idxpmomtipoinc" 
)
public class Pmomtipoinc implements Serializable { 

	private static final long serialVersionUID = 1L;
	@Column (
		name = "TIPO",
		nullable = false 
	)
	private String tipo;
	@Id
	@Column (
		name = "IDXPMOMTIPOINC",
		nullable = true 
	)
	private Long idxpmomtipoinc;
	private boolean updatable; 

	public void setTipo(
		String var
	) {
		this.tipo=var; 
	}
	
	public String getTipo() {
		return this.tipo; 
	}
	
	public void setIdxpmomtipoinc(
		Long var
	) {
		this.idxpmomtipoinc=var; 
	}
	
	public Long getIdxpmomtipoinc() {
		return this.idxpmomtipoinc; 
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