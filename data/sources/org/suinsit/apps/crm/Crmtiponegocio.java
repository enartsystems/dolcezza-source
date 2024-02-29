package org.suinsit.apps.crm;

import java.io.Serializable;
import java.lang.Long;
import java.lang.String;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import org.enartframework.nocode.annotacion.Entidad;
import org.suinsit.apps.crm.Crmoportunidad;

@Entity
@Table (
	name = "CRMTIPONEGOCIO" 
)
@Entidad (
	type = "TABLE",
	pk = "idxcrmtiponegocio" 
)
public class Crmtiponegocio implements Serializable { 

	private static final long serialVersionUID = 1L;
	@Column (
		name = "BAJA",
		nullable = true 
	)
	private boolean baja;
	@Id
	@Column (
		name = "IDXCRMTIPONEGOCIO",
		nullable = true 
	)
	private Long idxcrmtiponegocio;
	@Column (
		name = "TIPONEGOCIO",
		nullable = false 
	)
	private String tiponegocio;
	private boolean updatable;
	private List<Crmoportunidad> subcrmoportunidad; 

	public void setBaja(
		boolean var
	) {
		this.baja=var; 
	}
	
	public boolean isBaja() {
		return this.baja; 
	}
	
	public void setIdxcrmtiponegocio(
		Long var
	) {
		this.idxcrmtiponegocio=var; 
	}
	
	public Long getIdxcrmtiponegocio() {
		return this.idxcrmtiponegocio; 
	}
	
	public void setTiponegocio(
		String var
	) {
		this.tiponegocio=var; 
	}
	
	public String getTiponegocio() {
		return this.tiponegocio; 
	}
	
	public void setUpdatable(
		boolean var
	) {
		this.updatable=var; 
	}
	
	public boolean isUpdatable() {
		return this.updatable; 
	}
	
	public void setSubcrmoportunidad(
		List<Crmoportunidad> var
	) {
		this.subcrmoportunidad=var; 
	}
	
	public List<Crmoportunidad> getSubcrmoportunidad() {
		if(this.subcrmoportunidad==null)this.subcrmoportunidad=new ArrayList<>(0);
		  return this.subcrmoportunidad; 
	} 

}