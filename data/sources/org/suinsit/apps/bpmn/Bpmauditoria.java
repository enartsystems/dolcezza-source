package org.suinsit.apps.bpmn;

import java.io.Serializable;
import java.lang.Integer;
import java.lang.Long;
import java.lang.String;
import java.sql.Timestamp;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import org.enartframework.nocode.annotacion.Entidad;

@Entity
@Table (
	name = "BPMAUDITORIA" 
)
@Entidad (
	type = "TABLE",
	pk = "idxbpmauditoria" 
)
public class Bpmauditoria implements Serializable { 

	private static final long serialVersionUID = 1L;
	@Column (
		name = "ACTION",
		nullable = true 
	)
	private String action;
	@Column (
		name = "ALTA",
		nullable = true 
	)
	private Timestamp alta;
	@Column (
		name = "CUSTOMERID",
		nullable = true 
	)
	private String customerid;
	@Column (
		name = "IDTUPLA",
		nullable = true 
	)
	private Integer idtupla;
	@Id
	@Column (
		name = "IDXBPMAUDITORIA",
		nullable = true 
	)
	private Long idxbpmauditoria;
	@Column (
		name = "MODULE",
		nullable = true 
	)
	private String module;
	@Column (
		name = "PROCESSKEY",
		nullable = true 
	)
	private String processkey;
	@Column (
		name = "TASKEY",
		nullable = true 
	)
	private String taskey;
	@Column (
		name = "USERID",
		nullable = true 
	)
	private String userid;
	private boolean updatable; 

	public void setAction(
		String var
	) {
		this.action=var; 
	}
	
	public String getAction() {
		return this.action; 
	}
	
	public void setAlta(
		Timestamp var
	) {
		this.alta=var; 
	}
	
	public Timestamp getAlta() {
		return this.alta; 
	}
	
	public void setCustomerid(
		String var
	) {
		this.customerid=var; 
	}
	
	public String getCustomerid() {
		return this.customerid; 
	}
	
	public void setIdtupla(
		Integer var
	) {
		this.idtupla=var; 
	}
	
	public Integer getIdtupla() {
		return this.idtupla; 
	}
	
	public void setIdxbpmauditoria(
		Long var
	) {
		this.idxbpmauditoria=var; 
	}
	
	public Long getIdxbpmauditoria() {
		return this.idxbpmauditoria; 
	}
	
	public void setModule(
		String var
	) {
		this.module=var; 
	}
	
	public String getModule() {
		return this.module; 
	}
	
	public void setProcesskey(
		String var
	) {
		this.processkey=var; 
	}
	
	public String getProcesskey() {
		return this.processkey; 
	}
	
	public void setTaskey(
		String var
	) {
		this.taskey=var; 
	}
	
	public String getTaskey() {
		return this.taskey; 
	}
	
	public void setUserid(
		String var
	) {
		this.userid=var; 
	}
	
	public String getUserid() {
		return this.userid; 
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