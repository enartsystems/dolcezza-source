package org.suinsit.apps.admin;

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
import org.suinsit.apps.admin.Ssomenu;
import org.suinsit.apps.bpmn.Bpmmproces;

@Entity
@Table (
	name = "SSOMENUITEM" 
)
@Entidad (
	type = "TABLE",
	pk = "idxssomenuitem" 
)
public class Ssomenuitem implements Serializable { 

	private static final long serialVersionUID = 1L;
	@Column (
		name = "DASHBOARD",
		nullable = true 
	)
	private boolean dashboard;
	@Column (
		name = "ICONO",
		nullable = true 
	)
	private String icono;
	@Id
	@Column (
		name = "IDXSSOMENUITEM",
		nullable = true 
	)
	private Long idxssomenuitem;
	@Column (
		name = "ITEM",
		nullable = false 
	)
	private String item;
	@Column (
		name = "NAMESPACE",
		nullable = true 
	)
	private String namespace;
	@Column (
		name = "PAGE",
		nullable = true 
	)
	private String page;
	@Column (
		name = "URL",
		nullable = true 
	)
	private String url;
	private boolean updatable;
	@ManyToOne (
		fetch = javax.persistence.FetchType.LAZY 
	)
	@JoinColumn (
		name = "IDSSOMENU0",
		referencedColumnName = "IDXSSOMENU",
		nullable = true,
		insertable = true,
		updatable = true 
	)
	private Ssomenu idssomenu;
	@ManyToOne (
		fetch = javax.persistence.FetchType.LAZY 
	)
	@JoinColumn (
		name = "IDBPMMPROCES0",
		referencedColumnName = "IDXBPMMPROCES",
		nullable = true,
		insertable = true,
		updatable = true 
	)
	private Bpmmproces idbpmmproces; 

	public void setDashboard(
		boolean var
	) {
		this.dashboard=var; 
	}
	
	public boolean isDashboard() {
		return this.dashboard; 
	}
	
	public void setIcono(
		String var
	) {
		this.icono=var; 
	}
	
	public String getIcono() {
		return this.icono; 
	}
	
	public void setIdxssomenuitem(
		Long var
	) {
		this.idxssomenuitem=var; 
	}
	
	public Long getIdxssomenuitem() {
		return this.idxssomenuitem; 
	}
	
	public void setItem(
		String var
	) {
		this.item=var; 
	}
	
	public String getItem() {
		return this.item; 
	}
	
	public void setNamespace(
		String var
	) {
		this.namespace=var; 
	}
	
	public String getNamespace() {
		return this.namespace; 
	}
	
	public void setPage(
		String var
	) {
		this.page=var; 
	}
	
	public String getPage() {
		return this.page; 
	}
	
	public void setUrl(
		String var
	) {
		this.url=var; 
	}
	
	public String getUrl() {
		return this.url; 
	}
	
	public void setUpdatable(
		boolean var
	) {
		this.updatable=var; 
	}
	
	public boolean isUpdatable() {
		return this.updatable; 
	}
	
	public void setIdssomenu(
		Ssomenu var
	) {
		this.idssomenu=var; 
	}
	
	public Ssomenu getIdssomenu() {
		if(this.idssomenu==null)this.idssomenu=new org.suinsit.apps.admin.Ssomenu();
		  return this.idssomenu; 
	}
	
	public void setIdbpmmproces(
		Bpmmproces var
	) {
		this.idbpmmproces=var; 
	}
	
	public Bpmmproces getIdbpmmproces() {
		if(this.idbpmmproces==null)this.idbpmmproces=new org.suinsit.apps.bpmn.Bpmmproces();
		  return this.idbpmmproces; 
	} 

}