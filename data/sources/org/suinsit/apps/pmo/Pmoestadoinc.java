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
	name = "PMOESTADOINC" 
)
@Entidad (
	type = "TABLE",
	pk = "idxpmoestadoinc" 
)
public class Pmoestadoinc implements Serializable { 

	private static final long serialVersionUID = 1L;
	@Column (
		name = "ESTADOINC",
		nullable = false 
	)
	private String estadoinc;
	@Id
	@Column (
		name = "IDXPMOESTADOINC",
		nullable = true 
	)
	private Long idxpmoestadoinc;
	private boolean updatable; 

	public void setEstadoinc(
		String var
	) {
		this.estadoinc=var; 
	}
	
	public String getEstadoinc() {
		return this.estadoinc; 
	}
	
	public void setIdxpmoestadoinc(
		Long var
	) {
		this.idxpmoestadoinc=var; 
	}
	
	public Long getIdxpmoestadoinc() {
		return this.idxpmoestadoinc; 
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