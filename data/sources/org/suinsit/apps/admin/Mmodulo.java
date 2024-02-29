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
	name = "MMODULO" 
)
@Entidad (
	type = "TABLE",
	pk = "idxmmodulo" 
)
public class Mmodulo implements Serializable { 

	private static final long serialVersionUID = 1L;
	@Id
	@Column (
		name = "IDXMMODULO",
		nullable = true 
	)
	private Long idxmmodulo;
	@Column (
		name = "LABEL",
		nullable = true 
	)
	private String label;
	@Column (
		name = "MODULO",
		nullable = false 
	)
	private String modulo;
	private boolean updatable; 

	public void setIdxmmodulo(
		Long var
	) {
		this.idxmmodulo=var; 
	}
	
	public Long getIdxmmodulo() {
		return this.idxmmodulo; 
	}
	
	public void setLabel(
		String var
	) {
		this.label=var; 
	}
	
	public String getLabel() {
		return this.label; 
	}
	
	public void setModulo(
		String var
	) {
		this.modulo=var; 
	}
	
	public String getModulo() {
		return this.modulo; 
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