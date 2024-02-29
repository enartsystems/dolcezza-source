package org.suinsit.apps.bpmn;

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
import org.suinsit.apps.admin.Mmodulo;

@Entity
@Table (
	name = "BPMCATEGORIA" 
)
@Entidad (
	type = "TABLE",
	pk = "idxbpmcategoria" 
)
public class Bpmcategoria implements Serializable { 

	private static final long serialVersionUID = 1L;
	@Column (
		name = "CATEGORIA",
		nullable = true 
	)
	private String categoria;
	@Id
	@Column (
		name = "IDXBPMCATEGORIA",
		nullable = true 
	)
	private Long idxbpmcategoria;
	private boolean updatable;
	@ManyToOne (
		fetch = javax.persistence.FetchType.LAZY 
	)
	@JoinColumn (
		name = "IDMMODULO0",
		referencedColumnName = "IDXMMODULO",
		nullable = true,
		insertable = true,
		updatable = true 
	)
	private Mmodulo idmmodulo; 

	public void setCategoria(
		String var
	) {
		this.categoria=var; 
	}
	
	public String getCategoria() {
		return this.categoria; 
	}
	
	public void setIdxbpmcategoria(
		Long var
	) {
		this.idxbpmcategoria=var; 
	}
	
	public Long getIdxbpmcategoria() {
		return this.idxbpmcategoria; 
	}
	
	public void setUpdatable(
		boolean var
	) {
		this.updatable=var; 
	}
	
	public boolean isUpdatable() {
		return this.updatable; 
	}
	
	public void setIdmmodulo(
		Mmodulo var
	) {
		this.idmmodulo=var; 
	}
	
	public Mmodulo getIdmmodulo() {
		if(this.idmmodulo==null)this.idmmodulo=new org.suinsit.apps.admin.Mmodulo();
		  return this.idmmodulo; 
	} 

}