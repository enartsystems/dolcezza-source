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
	name = "MTIPOEMPRESA" 
)
@Entidad (
	type = "TABLE",
	pk = "idxmtipoempresa" 
)
public class Mtipoempresa implements Serializable { 

	private static final long serialVersionUID = 1L;
	@Id
	@Column (
		name = "IDXMTIPOEMPRESA",
		nullable = true 
	)
	private Long idxmtipoempresa;
	@Column (
		name = "TIPOEMPRESA",
		nullable = true 
	)
	private String tipoempresa;
	private boolean updatable; 

	public void setIdxmtipoempresa(
		Long var
	) {
		this.idxmtipoempresa=var; 
	}
	
	public Long getIdxmtipoempresa() {
		return this.idxmtipoempresa; 
	}
	
	public void setTipoempresa(
		String var
	) {
		this.tipoempresa=var; 
	}
	
	public String getTipoempresa() {
		return this.tipoempresa; 
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