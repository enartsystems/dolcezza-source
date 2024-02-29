package org.suinsit.apps.admin;

import java.io.Serializable;
import java.lang.Long;
import java.lang.String;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import org.enartframework.nocode.annotacion.Entidad;
import org.suinsit.apps.admin.Aplicacion;
import org.suinsit.apps.admin.Ssomenu;
import org.suinsit.apps.admin.Ssomenuitem;

@Entity
@Table (
	name = "SSOMENU" 
)
@Entidad (
	type = "TABLE",
	pk = "idxssomenu" 
)
public class Ssomenu implements Serializable { 

	private static final long serialVersionUID = 1L;
	@Column (
		name = "DASHBOARDPAGE",
		nullable = true 
	)
	private String dashboardpage;
	@Column (
		name = "DESCRIPCION",
		nullable = true 
	)
	private String descripcion;
	@Column (
		name = "ICONO",
		nullable = true 
	)
	private String icono;
	@Id
	@Column (
		name = "IDXSSOMENU",
		nullable = true 
	)
	private Long idxssomenu;
	@Column (
		name = "MENU",
		nullable = false 
	)
	private String menu;
	@Column (
		name = "NAMESPACE",
		nullable = true 
	)
	private String namespace;
	@Column (
		name = "TITLE",
		nullable = true 
	)
	private String title;
	private boolean updatable;
	@ManyToOne (
		fetch = javax.persistence.FetchType.LAZY 
	)
	@JoinColumn (
		name = "IDSSOAPLICACION0",
		referencedColumnName = "IDXAPLICACION",
		nullable = true,
		insertable = true,
		updatable = true 
	)
	private Aplicacion idssoaplicacion;
	@ManyToOne (
		fetch = javax.persistence.FetchType.LAZY 
	)
	@JoinColumn (
		name = "IDPARENT0",
		referencedColumnName = "IDXSSOMENU",
		nullable = true,
		insertable = true,
		updatable = true 
	)
	private Ssomenu idparent;
	private List<Ssomenuitem> subssomenuitem; 

	public void setDashboardpage(
		String var
	) {
		this.dashboardpage=var; 
	}
	
	public String getDashboardpage() {
		return this.dashboardpage; 
	}
	
	public void setDescripcion(
		String var
	) {
		this.descripcion=var; 
	}
	
	public String getDescripcion() {
		return this.descripcion; 
	}
	
	public void setIcono(
		String var
	) {
		this.icono=var; 
	}
	
	public String getIcono() {
		return this.icono; 
	}
	
	public void setIdxssomenu(
		Long var
	) {
		this.idxssomenu=var; 
	}
	
	public Long getIdxssomenu() {
		return this.idxssomenu; 
	}
	
	public void setMenu(
		String var
	) {
		this.menu=var; 
	}
	
	public String getMenu() {
		return this.menu; 
	}
	
	public void setNamespace(
		String var
	) {
		this.namespace=var; 
	}
	
	public String getNamespace() {
		return this.namespace; 
	}
	
	public void setTitle(
		String var
	) {
		this.title=var; 
	}
	
	public String getTitle() {
		return this.title; 
	}
	
	public void setUpdatable(
		boolean var
	) {
		this.updatable=var; 
	}
	
	public boolean isUpdatable() {
		return this.updatable; 
	}
	
	public void setIdssoaplicacion(
		Aplicacion var
	) {
		this.idssoaplicacion=var; 
	}
	
	public Aplicacion getIdssoaplicacion() {
		if(this.idssoaplicacion==null)this.idssoaplicacion=new org.suinsit.apps.admin.Aplicacion();
		  return this.idssoaplicacion; 
	}
	
	public void setIdparent(
		Ssomenu var
	) {
		this.idparent=var; 
	}
	
	public Ssomenu getIdparent() {
		if(this.idparent==null)this.idparent=new org.suinsit.apps.admin.Ssomenu();
		  return this.idparent; 
	}
	
	public void setSubssomenuitem(
		List<Ssomenuitem> var
	) {
		this.subssomenuitem=var; 
	}
	
	public List<Ssomenuitem> getSubssomenuitem() {
		if(this.subssomenuitem==null)this.subssomenuitem=new ArrayList<>(0);
		  return this.subssomenuitem; 
	} 

}