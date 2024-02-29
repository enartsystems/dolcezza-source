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
import org.suinsit.apps.crm.Crmllamada;
import org.suinsit.apps.crm.Crmoportunidad;

@Entity
@Table (
	name = "CRMOPORTLLAMADA" 
)
@Entidad (
	type = "TABLE",
	pk = "idxcrmoportllamada" 
)
public class Crmoportllamada implements Serializable { 

	private static final long serialVersionUID = 1L;
	@Id
	@Column (
		name = "IDXCRMOPORTLLAMADA",
		nullable = true 
	)
	private Long idxcrmoportllamada;
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
		name = "IDCRMLLAMADA0",
		referencedColumnName = "IDXCRMLLAMADA",
		nullable = true,
		insertable = true,
		updatable = true 
	)
	private Crmllamada idcrmllamada; 

	public void setIdxcrmoportllamada(
		Long var
	) {
		this.idxcrmoportllamada=var; 
	}
	
	public Long getIdxcrmoportllamada() {
		return this.idxcrmoportllamada; 
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
	
	public void setIdcrmllamada(
		Crmllamada var
	) {
		this.idcrmllamada=var; 
	}
	
	public Crmllamada getIdcrmllamada() {
		if(this.idcrmllamada==null)this.idcrmllamada=new org.suinsit.apps.crm.Crmllamada();
		  return this.idcrmllamada; 
	} 

}