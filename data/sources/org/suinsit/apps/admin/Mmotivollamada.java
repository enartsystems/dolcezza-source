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
	name = "MMOTIVOLLAMADA" 
)
@Entidad (
	type = "TABLE",
	pk = "idxmmotivollamada" 
)
public class Mmotivollamada implements Serializable { 

	private static final long serialVersionUID = 1L;
	@Column (
		name = "BAJA",
		nullable = true 
	)
	private boolean baja;
	@Id
	@Column (
		name = "IDXMMOTIVOLLAMADA",
		nullable = true 
	)
	private Long idxmmotivollamada;
	@Column (
		name = "MOTIVO",
		nullable = true 
	)
	private String motivo;
	private boolean updatable; 

	public void setBaja(
		boolean var
	) {
		this.baja=var; 
	}
	
	public boolean isBaja() {
		return this.baja; 
	}
	
	public void setIdxmmotivollamada(
		Long var
	) {
		this.idxmmotivollamada=var; 
	}
	
	public Long getIdxmmotivollamada() {
		return this.idxmmotivollamada; 
	}
	
	public void setMotivo(
		String var
	) {
		this.motivo=var; 
	}
	
	public String getMotivo() {
		return this.motivo; 
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