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
	name = "MTIPOPRIORIDAD" 
)
@Entidad (
	type = "TABLE",
	pk = "idxtipoprioridad" 
)
public class Mtipoprioridad implements Serializable { 

	private static final long serialVersionUID = 1L;
	@Column (
		name = "BAJA",
		nullable = true 
	)
	private Date baja;
	@Column (
		name = "COLOR",
		nullable = true 
	)
	private String color;
	@Id
	@Column (
		name = "IDXTIPOPRIORIDAD",
		nullable = true 
	)
	private Long idxtipoprioridad;
	@Column (
		name = "PRIORIDAD",
		nullable = false 
	)
	private String prioridad;
	private boolean updatable; 

	public void setBaja(
		Date var
	) {
		this.baja=var; 
	}
	
	public Date getBaja() {
		return this.baja; 
	}
	
	public void setColor(
		String var
	) {
		this.color=var; 
	}
	
	public String getColor() {
		return this.color; 
	}
	
	public void setIdxtipoprioridad(
		Long var
	) {
		this.idxtipoprioridad=var; 
	}
	
	public Long getIdxtipoprioridad() {
		return this.idxtipoprioridad; 
	}
	
	public void setPrioridad(
		String var
	) {
		this.prioridad=var; 
	}
	
	public String getPrioridad() {
		return this.prioridad; 
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