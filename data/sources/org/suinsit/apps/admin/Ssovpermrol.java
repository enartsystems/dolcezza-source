package org.suinsit.apps.admin;

import java.io.Serializable;
import java.lang.Long;
import java.lang.String;
import javax.persistence.Column;
import org.enartframework.nocode.annotacion.Entidad;

@Entidad (
	type = "VIEW" 
)
public class Ssovpermrol implements Serializable { 

	private static final long serialVersionUID = 1L;
	@Column (
		name = "APLICACION",
		nullable = false 
	)
	private String aplicacion;
	@Column (
		name = "IDXAPLICACION",
		nullable = true 
	)
	private Long idxaplicacion;
	@Column (
		name = "ICONO",
		nullable = true 
	)
	private String icono;
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
	@Column (
		name = "ROL",
		nullable = false 
	)
	private String rol;
	@Column (
		name = "DASHBOARD",
		nullable = true 
	)
	private String dashboard;
	private boolean updatable; 

	public void setAplicacion(
		String var
	) {
		this.aplicacion=var; 
	}
	
	public String getAplicacion() {
		return this.aplicacion; 
	}
	
	public void setIdxaplicacion(
		Long var
	) {
		this.idxaplicacion=var; 
	}
	
	public Long getIdxaplicacion() {
		return this.idxaplicacion; 
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
	
	public void setRol(
		String var
	) {
		this.rol=var; 
	}
	
	public String getRol() {
		return this.rol; 
	}
	
	public void setDashboard(
		String var
	) {
		this.dashboard=var; 
	}
	
	public String getDashboard() {
		return this.dashboard; 
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