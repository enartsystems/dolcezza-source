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
	name = "PMOPATROCINADOR" 
)
@Entidad (
	type = "TABLE",
	pk = "idxpmopatrocinador" 
)
public class Pmopatrocinador implements Serializable { 

	private static final long serialVersionUID = 1L;
	@Column (
		name = "PATROCINADOR",
		nullable = true 
	)
	private String patrocinador;
	@Id
	@Column (
		name = "IDXPMOPATROCINADOR",
		nullable = true 
	)
	private Long idxpmopatrocinador;
	private boolean updatable; 

	public void setPatrocinador(
		String var
	) {
		this.patrocinador=var; 
	}
	
	public String getPatrocinador() {
		return this.patrocinador; 
	}
	
	public void setIdxpmopatrocinador(
		Long var
	) {
		this.idxpmopatrocinador=var; 
	}
	
	public Long getIdxpmopatrocinador() {
		return this.idxpmopatrocinador; 
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