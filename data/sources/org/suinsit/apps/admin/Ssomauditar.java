package org.suinsit.apps.admin;

import java.io.Serializable;
import java.lang.Integer;
import java.lang.Long;
import java.lang.String;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import org.enartframework.nocode.annotacion.Entidad;

@Entity
@Table (
	name = "SSOMAUDITAR" 
)
@Entidad (
	type = "TABLE",
	pk = "idxssomauditar" 
)
public class Ssomauditar implements Serializable { 

	private static final long serialVersionUID = 1L;
	@Column (
		name = "ACCION",
		nullable = true 
	)
	private String accion;
	@Column (
		name = "VALUE",
		nullable = true 
	)
	private String value;
	@Column (
		name = "FIELD",
		nullable = true 
	)
	private String field;
	@Column (
		name = "MODULE",
		nullable = true 
	)
	private String module;
	@Column (
		name = "IDTUPLA",
		nullable = true 
	)
	private Integer idtupla;
	@Column (
		name = "DIRIP",
		nullable = true 
	)
	private String dirip;
	@Column (
		name = "USERNAME",
		nullable = true 
	)
	private String username;
	@Id
	@Column (
		name = "IDXSSOMAUDITAR",
		nullable = true 
	)
	private Long idxssomauditar;
	private boolean updatable; 

	public void setAccion(
		String var
	) {
		this.accion=var; 
	}
	
	public String getAccion() {
		return this.accion; 
	}
	
	public void setValue(
		String var
	) {
		this.value=var; 
	}
	
	public String getValue() {
		return this.value; 
	}
	
	public void setField(
		String var
	) {
		this.field=var; 
	}
	
	public String getField() {
		return this.field; 
	}
	
	public void setModule(
		String var
	) {
		this.module=var; 
	}
	
	public String getModule() {
		return this.module; 
	}
	
	public void setIdtupla(
		Integer var
	) {
		this.idtupla=var; 
	}
	
	public Integer getIdtupla() {
		return this.idtupla; 
	}
	
	public void setDirip(
		String var
	) {
		this.dirip=var; 
	}
	
	public String getDirip() {
		return this.dirip; 
	}
	
	public void setUsername(
		String var
	) {
		this.username=var; 
	}
	
	public String getUsername() {
		return this.username; 
	}
	
	public void setIdxssomauditar(
		Long var
	) {
		this.idxssomauditar=var; 
	}
	
	public Long getIdxssomauditar() {
		return this.idxssomauditar; 
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