package org.suinsit.apps.admin;

import java.io.Serializable;
import java.lang.Long;
import java.lang.String;
import java.sql.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import org.enartframework.nocode.annotacion.Entidad;

@Entity
@Table (
	name = "MACTIVIDAD" 
)
@Entidad (
	type = "TABLE",
	pk = "idxactividad" 
)
public class Mactividad implements Serializable { 

	private static final long serialVersionUID = 1L;
	@Column (
		name = "ACTIVIDAD",
		nullable = false 
	)
	private String actividad;
	@Column (
		name = "BAJA",
		nullable = true 
	)
	private Date baja;
	@Column (
		name = "CNAE",
		nullable = true 
	)
	private String cnae;
	@Column (
		name = "IAE",
		nullable = true 
	)
	private String iae;
	@Id
	@Column (
		name = "IDXACTIVIDAD",
		nullable = true 
	)
	private Long idxactividad;
	private boolean updatable; 

	public void setActividad(
		String var
	) {
		this.actividad=var; 
	}
	
	public String getActividad() {
		return this.actividad; 
	}
	
	public void setBaja(
		Date var
	) {
		this.baja=var; 
	}
	
	public Date getBaja() {
		return this.baja; 
	}
	
	public void setCnae(
		String var
	) {
		this.cnae=var; 
	}
	
	public String getCnae() {
		return this.cnae; 
	}
	
	public void setIae(
		String var
	) {
		this.iae=var; 
	}
	
	public String getIae() {
		return this.iae; 
	}
	
	public void setIdxactividad(
		Long var
	) {
		this.idxactividad=var; 
	}
	
	public Long getIdxactividad() {
		return this.idxactividad; 
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