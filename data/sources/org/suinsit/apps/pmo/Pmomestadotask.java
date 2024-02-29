package org.suinsit.apps.pmo;

import java.io.Serializable;
import java.lang.Long;
import java.lang.String;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import org.enartframework.nocode.annotacion.Entidad;
import org.suinsit.apps.pmo.Pmomtipotask;

@Entity
@Table (
	name = "PMOMESTADOTASK" 
)
@Entidad (
	type = "TABLE",
	pk = "idxpmomestadotask" 
)
public class Pmomestadotask implements Serializable { 

	private static final long serialVersionUID = 1L;
	@Column (
		name = "BGCOLOR",
		nullable = true 
	)
	private String bgcolor;
	@Column (
		name = "ESTADOTASK",
		nullable = false 
	)
	private String estadotask;
	@Id
	@Column (
		name = "IDXPMOMESTADOTASK",
		nullable = true 
	)
	private Long idxpmomestadotask;
	private boolean updatable;
	@ManyToOne (
		fetch = javax.persistence.FetchType.LAZY 
	)
	@JoinColumn (
		name = "IDPMOMTIPOTASK0",
		referencedColumnName = "IDXPMOMTIPOTASK",
		nullable = true,
		insertable = true,
		updatable = true 
	)
	private Pmomtipotask idpmomtipotask; 

	public void setBgcolor(
		String var
	) {
		this.bgcolor=var; 
	}
	
	public String getBgcolor() {
		return this.bgcolor; 
	}
	
	public void setEstadotask(
		String var
	) {
		this.estadotask=var; 
	}
	
	public String getEstadotask() {
		return this.estadotask; 
	}
	
	public void setIdxpmomestadotask(
		Long var
	) {
		this.idxpmomestadotask=var; 
	}
	
	public Long getIdxpmomestadotask() {
		return this.idxpmomestadotask; 
	}
	
	public void setUpdatable(
		boolean var
	) {
		this.updatable=var; 
	}
	
	public boolean isUpdatable() {
		return this.updatable; 
	}
	
	public void setIdpmomtipotask(
		Pmomtipotask var
	) {
		this.idpmomtipotask=var; 
	}
	
	public Pmomtipotask getIdpmomtipotask() {
		if(this.idpmomtipotask==null)this.idpmomtipotask=new org.suinsit.apps.pmo.Pmomtipotask();
		  return this.idpmomtipotask; 
	} 

}