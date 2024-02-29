package org.suinsit.apps.pmo;

import java.io.Serializable;
import java.lang.Long;
import java.lang.Object;
import java.lang.String;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import org.enartframework.nocode.annotacion.Entidad;

@Entity
@Table (
	name = "PMOMTIPOTASK" 
)
@Entidad (
	type = "TABLE",
	pk = "idxpmomtipotask" 
)
public class Pmomtipotask implements Serializable { 

	private static final long serialVersionUID = 1L;
	@Column (
		name = "AVATAR",
		nullable = true 
	)
	private Object avatar;
	@Column (
		name = "RESUMEN",
		nullable = true 
	)
	private String resumen;
	@Column (
		name = "TIPOTASK",
		nullable = true 
	)
	private String tipotask;
	@Id
	@Column (
		name = "IDXPMOMTIPOTASK",
		nullable = true 
	)
	private Long idxpmomtipotask;
	private boolean updatable; 

	public void setAvatar(
		Object var
	) {
		this.avatar=var; 
	}
	
	public Object getAvatar() {
		return this.avatar; 
	}
	
	public void setResumen(
		String var
	) {
		this.resumen=var; 
	}
	
	public String getResumen() {
		return this.resumen; 
	}
	
	public void setTipotask(
		String var
	) {
		this.tipotask=var; 
	}
	
	public String getTipotask() {
		return this.tipotask; 
	}
	
	public void setIdxpmomtipotask(
		Long var
	) {
		this.idxpmomtipotask=var; 
	}
	
	public Long getIdxpmomtipotask() {
		return this.idxpmomtipotask; 
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