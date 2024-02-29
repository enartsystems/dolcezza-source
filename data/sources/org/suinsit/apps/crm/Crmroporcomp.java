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
import org.suinsit.apps.crm.Crmcompetidor;
import org.suinsit.apps.crm.Crmoportunidad;

@Entity
@Table (
	name = "CRMROPORCOMP" 
)
@Entidad (
	type = "TABLE",
	pk = "idxcrmroporcomp" 
)
public class Crmroporcomp implements Serializable { 

	private static final long serialVersionUID = 1L;
	@Id
	@Column (
		name = "IDXCRMROPORCOMP",
		nullable = true 
	)
	private Long idxcrmroporcomp;
	private boolean updatable;
	@ManyToOne (
		fetch = javax.persistence.FetchType.LAZY 
	)
	@JoinColumn (
		name = "IDCRMCOMPETIDOR0",
		referencedColumnName = "IDXCRMCOMPETIDOR",
		nullable = true,
		insertable = true,
		updatable = true 
	)
	private Crmcompetidor idcrmcompetidor;
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

	public void setIdxcrmroporcomp(
		Long var
	) {
		this.idxcrmroporcomp=var; 
	}
	
	public Long getIdxcrmroporcomp() {
		return this.idxcrmroporcomp; 
	}
	
	public void setUpdatable(
		boolean var
	) {
		this.updatable=var; 
	}
	
	public boolean isUpdatable() {
		return this.updatable; 
	}
	
	public void setIdcrmcompetidor(
		Crmcompetidor var
	) {
		this.idcrmcompetidor=var; 
	}
	
	public Crmcompetidor getIdcrmcompetidor() {
		if(this.idcrmcompetidor==null)this.idcrmcompetidor=new org.suinsit.apps.crm.Crmcompetidor();
		  return this.idcrmcompetidor; 
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

}