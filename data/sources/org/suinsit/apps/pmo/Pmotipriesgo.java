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
	name = "PMOTIPRIESGO" 
)
@Entidad (
	type = "TABLE",
	pk = "idxpmotipriesgo" 
)
public class Pmotipriesgo implements Serializable { 

	private static final long serialVersionUID = 1L;
	@Column (
		name = "TIPO",
		nullable = true 
	)
	private String tipo;
	@Id
	@Column (
		name = "IDXPMOTIPRIESGO",
		nullable = true 
	)
	private Long idxpmotipriesgo;
	private boolean updatable; 

	public void setTipo(
		String var
	) {
		this.tipo=var; 
	}
	
	public String getTipo() {
		return this.tipo; 
	}
	
	public void setIdxpmotipriesgo(
		Long var
	) {
		this.idxpmotipriesgo=var; 
	}
	
	public Long getIdxpmotipriesgo() {
		return this.idxpmotipriesgo; 
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