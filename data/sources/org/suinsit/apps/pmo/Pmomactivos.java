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
	name = "PMOMACTIVOS" 
)
@Entidad (
	type = "TABLE",
	pk = "idxpmomactivos" 
)
public class Pmomactivos implements Serializable { 

	private static final long serialVersionUID = 1L;
	@Column (
		name = "ACTIVO",
		nullable = true 
	)
	private String activo;
	@Id
	@Column (
		name = "IDXPMOMACTIVOS",
		nullable = true 
	)
	private Long idxpmomactivos;
	private boolean updatable; 

	public void setActivo(
		String var
	) {
		this.activo=var; 
	}
	
	public String getActivo() {
		return this.activo; 
	}
	
	public void setIdxpmomactivos(
		Long var
	) {
		this.idxpmomactivos=var; 
	}
	
	public Long getIdxpmomactivos() {
		return this.idxpmomactivos; 
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