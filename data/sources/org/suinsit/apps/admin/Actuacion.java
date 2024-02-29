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
	name = "MACTUACION" 
)
@Entidad (
	type = "TABLE",
	pk = "idxactuacion" 
)
public class Actuacion implements Serializable { 

	private static final long serialVersionUID = 1L;
	@Column (
		name = "BAJA",
		nullable = true 
	)
	private Date baja;
	@Column (
		name = "ACTUACION",
		nullable = false 
	)
	private String actuacion;
	@Id
	@Column (
		name = "IDXACTUACION",
		nullable = true 
	)
	private Long idxactuacion;
	private boolean updatable; 

	public void setBaja(
		Date var
	) {
		this.baja=var; 
	}
	
	public Date getBaja() {
		return this.baja; 
	}
	
	public void setActuacion(
		String var
	) {
		this.actuacion=var; 
	}
	
	public String getActuacion() {
		return this.actuacion; 
	}
	
	public void setIdxactuacion(
		Long var
	) {
		this.idxactuacion=var; 
	}
	
	public Long getIdxactuacion() {
		return this.idxactuacion; 
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