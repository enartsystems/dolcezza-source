package org.suinsit.apps.crm;

import java.io.Serializable;
import java.lang.Long;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import org.enartframework.nocode.annotacion.Entidad;
import org.suinsit.apps.crm.Crmnota;
import org.suinsit.apps.crm.Crmoportunidad;

@Entity
@Table (
	name = "CRMROPORTNOTAS" 
)
@Entidad (
	type = "TABLE",
	pk = "idxcrmroportnotas" 
)
public class Crmroportnotas implements Serializable { 

	private static final long serialVersionUID = 1L;
	@Id
	@Column (
		name = "IDXCRMROPORTNOTAS",
		nullable = true 
	)
	private Long idxcrmroportnotas;
	private boolean updatable;
	@ManyToOne (
		fetch = javax.persistence.FetchType.LAZY 
	)
	@JoinColumn (
		name = "IDCRMOPORTUNIDAD0",
		referencedColumnName = "IDXOPORTUNIDAD",
		nullable = true,
		insertable = true,
		updatable = true 
	)
	private Crmoportunidad idcrmoportunidad;
	@ManyToOne (
		fetch = javax.persistence.FetchType.LAZY 
	)
	@JoinColumn (
		name = "IDCRMNOTA0",
		referencedColumnName = "IDXCRMNOTA",
		nullable = true,
		insertable = true,
		updatable = true 
	)
	private Crmnota idcrmnota; 

	public void setIdxcrmroportnotas(
		Long var
	) {
		this.idxcrmroportnotas=var; 
	}
	
	public Long getIdxcrmroportnotas() {
		return this.idxcrmroportnotas; 
	}
	
	public void setUpdatable(
		boolean var
	) {
		this.updatable=var; 
	}
	
	public boolean isUpdatable() {
		return this.updatable; 
	}
	
	public void setIdcrmoportunidad(
		Crmoportunidad var
	) {
		this.idcrmoportunidad=var; 
	}
	
	public Crmoportunidad getIdcrmoportunidad() {
		if(this.idcrmoportunidad==null)this.idcrmoportunidad=new org.suinsit.apps.crm.Crmoportunidad();
		  return this.idcrmoportunidad; 
	}
	
	public void setIdcrmnota(
		Crmnota var
	) {
		this.idcrmnota=var; 
	}
	
	public Crmnota getIdcrmnota() {
		if(this.idcrmnota==null)this.idcrmnota=new org.suinsit.apps.crm.Crmnota();
		  return this.idcrmnota; 
	} 

}