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
import org.suinsit.apps.citaprev.Citmagenda;
import org.suinsit.apps.crm.Crmoportunidad;

@Entity
@Table (
	name = "CRMROPORTAGENDA" 
)
@Entidad (
	type = "TABLE",
	pk = "idxcrmroportagenda" 
)
public class Crmroportagenda implements Serializable { 

	private static final long serialVersionUID = 1L;
	@Id
	@Column (
		name = "IDXCRMROPORTAGENDA",
		nullable = true 
	)
	private Long idxcrmroportagenda;
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
		name = "IDCRMAGENDA0",
		referencedColumnName = "IDXCRMAGENDA",
		nullable = true,
		insertable = true,
		updatable = true 
	)
	private Citmagenda idcrmagenda; 

	public void setIdxcrmroportagenda(
		Long var
	) {
		this.idxcrmroportagenda=var; 
	}
	
	public Long getIdxcrmroportagenda() {
		return this.idxcrmroportagenda; 
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
	
	public void setIdcrmagenda(
		Citmagenda var
	) {
		this.idcrmagenda=var; 
	}
	
	public Citmagenda getIdcrmagenda() {
		if(this.idcrmagenda==null)this.idcrmagenda=new org.suinsit.apps.citaprev.Citmagenda();
		  return this.idcrmagenda; 
	} 

}