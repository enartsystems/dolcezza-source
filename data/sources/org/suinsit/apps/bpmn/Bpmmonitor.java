package org.suinsit.apps.bpmn;

import java.io.Serializable;
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
	name = "BPMMONITOR" 
)
@Entidad (
	type = "TABLE",
	pk = "idxbpmmonitor" 
)
public class Bpmmonitor implements Serializable { 

	private static final long serialVersionUID = 1L;
	@Column (
		name = "USERNAME",
		nullable = true 
	)
	private String username;
	@Column (
		name = "BUSSINESMOD",
		nullable = true 
	)
	private String bussinesmod;
	@Column (
		name = "INSTANCEPROCESS",
		nullable = true 
	)
	private String instanceprocess;
	@Column (
		name = "INSTANCETASK",
		nullable = true 
	)
	private String instancetask;
	@Column (
		name = "FINISH",
		nullable = true 
	)
	private Timestamp finish;
	@Column (
		name = "START",
		nullable = true 
	)
	private Timestamp start;
	@Column (
		name = "NAMETASK",
		nullable = true 
	)
	private String nametask;
	@Column (
		name = "TASKEY",
		nullable = true 
	)
	private String taskey;
	@Column (
		name = "ALTA",
		nullable = false 
	)
	private Timestamp alta;
	@Column (
		name = "PROCESSKEY",
		nullable = false 
	)
	private String processkey;
	@Id
	@Column (
		name = "IDXBPMMONITOR",
		nullable = true 
	)
	private Long idxbpmmonitor;
	private boolean updatable; 

	public void setUsername(
		String var
	) {
		this.username=var; 
	}
	
	public String getUsername() {
		return this.username; 
	}
	
	public void setBussinesmod(
		String var
	) {
		this.bussinesmod=var; 
	}
	
	public String getBussinesmod() {
		return this.bussinesmod; 
	}
	
	public void setInstanceprocess(
		String var
	) {
		this.instanceprocess=var; 
	}
	
	public String getInstanceprocess() {
		return this.instanceprocess; 
	}
	
	public void setInstancetask(
		String var
	) {
		this.instancetask=var; 
	}
	
	public String getInstancetask() {
		return this.instancetask; 
	}
	
	public void setFinish(
		Timestamp var
	) {
		this.finish=var; 
	}
	
	public Timestamp getFinish() {
		return this.finish; 
	}
	
	public void setStart(
		Timestamp var
	) {
		this.start=var; 
	}
	
	public Timestamp getStart() {
		return this.start; 
	}
	
	public void setNametask(
		String var
	) {
		this.nametask=var; 
	}
	
	public String getNametask() {
		return this.nametask; 
	}
	
	public void setTaskey(
		String var
	) {
		this.taskey=var; 
	}
	
	public String getTaskey() {
		return this.taskey; 
	}
	
	public void setAlta(
		Timestamp var
	) {
		this.alta=var; 
	}
	
	public Timestamp getAlta() {
		return this.alta; 
	}
	
	public void setProcesskey(
		String var
	) {
		this.processkey=var; 
	}
	
	public String getProcesskey() {
		return this.processkey; 
	}
	
	public void setIdxbpmmonitor(
		Long var
	) {
		this.idxbpmmonitor=var; 
	}
	
	public Long getIdxbpmmonitor() {
		return this.idxbpmmonitor; 
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