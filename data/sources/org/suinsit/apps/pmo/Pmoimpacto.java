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
	name = "PMOIMPACTO" 
)
@Entidad (
	type = "TABLE",
	pk = "idxpmoimpacto" 
)
public class Pmoimpacto implements Serializable { 

	private static final long serialVersionUID = 1L;
	@Column (
		name = "IMPACTO",
		nullable = false 
	)
	private String impacto;
	@Id
	@Column (
		name = "IDXPMOIMPACTO",
		nullable = true 
	)
	private Long idxpmoimpacto;
	private boolean updatable; 

	public void setImpacto(
		String var
	) {
		this.impacto=var; 
	}
	
	public String getImpacto() {
		return this.impacto; 
	}
	
	public void setIdxpmoimpacto(
		Long var
	) {
		this.idxpmoimpacto=var; 
	}
	
	public Long getIdxpmoimpacto() {
		return this.idxpmoimpacto; 
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