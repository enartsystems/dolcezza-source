package org.suinsit.apps.mrp;

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
	name = "MRPESTADO" 
)
@Entidad (
	type = "TABLE",
	pk = "idxmrpestado" 
)
public class Mrpestado implements Serializable { 

	private static final long serialVersionUID = 1L;
	@Column (
		name = "bgcolor",
		nullable = true 
	)
	private String bgcolor;
	@Column (
		name = "estado",
		nullable = true 
	)
	private String estado;
	@Id
	@Column (
		name = "idxmrpestado",
		nullable = true 
	)
	private Long idxmrpestado;
	@Column (
		name = "module",
		nullable = true 
	)
	private String module;
	private boolean updatable; 

	public void setBgcolor(
		String var
	) {
		this.bgcolor=var; 
	}
	
	public String getBgcolor() {
		return this.bgcolor; 
	}
	
	public void setEstado(
		String var
	) {
		this.estado=var; 
	}
	
	public String getEstado() {
		return this.estado; 
	}
	
	public void setIdxmrpestado(
		Long var
	) {
		this.idxmrpestado=var; 
	}
	
	public Long getIdxmrpestado() {
		return this.idxmrpestado; 
	}
	
	public void setModule(
		String var
	) {
		this.module=var; 
	}
	
	public String getModule() {
		return this.module; 
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