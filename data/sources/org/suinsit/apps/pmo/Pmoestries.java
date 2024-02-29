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
	name = "PMOESTRIES" 
)
@Entidad (
	type = "TABLE",
	pk = "idxpmoestries" 
)
public class Pmoestries implements Serializable { 

	private static final long serialVersionUID = 1L;
	@Column (
		name = "ESTADORIES",
		nullable = false 
	)
	private String estadories;
	@Id
	@Column (
		name = "IDXPMOESTRIES",
		nullable = true 
	)
	private Long idxpmoestries;
	private boolean updatable; 

	public void setEstadories(
		String var
	) {
		this.estadories=var; 
	}
	
	public String getEstadories() {
		return this.estadories; 
	}
	
	public void setIdxpmoestries(
		Long var
	) {
		this.idxpmoestries=var; 
	}
	
	public Long getIdxpmoestries() {
		return this.idxpmoestries; 
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