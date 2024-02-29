package org.suinsit.apps.admin;

import java.io.Serializable;
import java.lang.Long;
import java.lang.String;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import org.enartframework.nocode.annotacion.Entidad;
import org.enartframework.nocode.annotacion.Sequence;

@Entity
@Table (
	name = "SSOPORTAL" 
)
@Entidad (
	type = "TABLE",
	pk = "idxssoportal" 
)
public class Ssoportal implements Serializable { 

	private static final long serialVersionUID = 1L;
	@Column (
		name = "APLICACION",
		nullable = true 
	)
	private String aplicacion;
	@Column (
		name = "CODIGO",
		nullable = true 
	)
	@Sequence (
		name = "SSOPORTAL_CODIGO",
		prefix = "",
		mask = "00000",
		addYear = false 
	)
	private String codigo;
	@Column (
		name = "DASHBOARD",
		nullable = true 
	)
	private String dashboard;
	@Column (
		name = "DESCRIPCION",
		nullable = true 
	)
	private String descripcion;
	@Id
	@Column (
		name = "IDXSSOPORTAL",
		nullable = true 
	)
	private Long idxssoportal;
	@Column (
		name = "NAMESPACE",
		nullable = true 
	)
	private String namespace;
	@Column (
		name = "PORTAL",
		nullable = false 
	)
	private String portal;
	@Column (
		name = "SUBDOMINIO",
		nullable = false 
	)
	private String subdominio;
	private boolean updatable; 

	public void setAplicacion(
		String var
	) {
		this.aplicacion=var; 
	}
	
	public String getAplicacion() {
		return this.aplicacion; 
	}
	
	public void setCodigo(
		String var
	) {
		this.codigo=var; 
	}
	
	public String getCodigo() {
		return this.codigo; 
	}
	
	public void setDashboard(
		String var
	) {
		this.dashboard=var; 
	}
	
	public String getDashboard() {
		return this.dashboard; 
	}
	
	public void setDescripcion(
		String var
	) {
		this.descripcion=var; 
	}
	
	public String getDescripcion() {
		return this.descripcion; 
	}
	
	public void setIdxssoportal(
		Long var
	) {
		this.idxssoportal=var; 
	}
	
	public Long getIdxssoportal() {
		return this.idxssoportal; 
	}
	
	public void setNamespace(
		String var
	) {
		this.namespace=var; 
	}
	
	public String getNamespace() {
		return this.namespace; 
	}
	
	public void setPortal(
		String var
	) {
		this.portal=var; 
	}
	
	public String getPortal() {
		return this.portal; 
	}
	
	public void setSubdominio(
		String var
	) {
		this.subdominio=var; 
	}
	
	public String getSubdominio() {
		return this.subdominio; 
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