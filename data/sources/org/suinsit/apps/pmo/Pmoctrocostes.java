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
	name = "PMOCTROCOSTES" 
)
@Entidad (
	type = "TABLE",
	pk = "idxpmoctrocostes" 
)
public class Pmoctrocostes implements Serializable { 

	private static final long serialVersionUID = 1L;
	@Column (
		name = "CENTROCOSTES",
		nullable = true 
	)
	private String centrocostes;
	@Id
	@Column (
		name = "IDXPMOCTROCOSTES",
		nullable = true 
	)
	private Long idxpmoctrocostes;
	private boolean updatable; 

	public void setCentrocostes(
		String var
	) {
		this.centrocostes=var; 
	}
	
	public String getCentrocostes() {
		return this.centrocostes; 
	}
	
	public void setIdxpmoctrocostes(
		Long var
	) {
		this.idxpmoctrocostes=var; 
	}
	
	public Long getIdxpmoctrocostes() {
		return this.idxpmoctrocostes; 
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