package org.suinsit.apps.fiscal;

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
	name = "FISMTIPOGTO" 
)
@Entidad (
	type = "TABLE",
	pk = "idxfismtipogto" 
)
public class Fismtipogto implements Serializable { 

	private static final long serialVersionUID = 1L;
	@Column (
		name = "CTACTBLE",
		nullable = true 
	)
	private String ctactble;
	@Column (
		name = "TIPOGASTO",
		nullable = false 
	)
	private String tipogasto;
	@Id
	@Column (
		name = "IDXFISMTIPOGTO",
		nullable = true 
	)
	private Long idxfismtipogto;
	private boolean updatable; 

	public void setCtactble(
		String var
	) {
		this.ctactble=var; 
	}
	
	public String getCtactble() {
		return this.ctactble; 
	}
	
	public void setTipogasto(
		String var
	) {
		this.tipogasto=var; 
	}
	
	public String getTipogasto() {
		return this.tipogasto; 
	}
	
	public void setIdxfismtipogto(
		Long var
	) {
		this.idxfismtipogto=var; 
	}
	
	public Long getIdxfismtipogto() {
		return this.idxfismtipogto; 
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