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
import org.suinsit.apps.asesor4.Sacticket;
import org.suinsit.apps.crm.Crmoportunidad;

@Entity
@Table (
	name = "CRMROPORTICKET" 
)
@Entidad (
	type = "TABLE",
	pk = "idxcrmroporticket" 
)
public class Crmroporticket implements Serializable { 

	private static final long serialVersionUID = 1L;
	@Id
	@Column (
		name = "IDXCRMROPORTICKET",
		nullable = true 
	)
	private Long idxcrmroporticket;
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
		name = "IDSACTICKET0",
		referencedColumnName = "IDXTICKET",
		nullable = true,
		insertable = true,
		updatable = true 
	)
	private Sacticket idsacticket; 

	public void setIdxcrmroporticket(
		Long var
	) {
		this.idxcrmroporticket=var; 
	}
	
	public Long getIdxcrmroporticket() {
		return this.idxcrmroporticket; 
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
	
	public void setIdsacticket(
		Sacticket var
	) {
		this.idsacticket=var; 
	}
	
	public Sacticket getIdsacticket() {
		if(this.idsacticket==null)this.idsacticket=new org.suinsit.apps.asesor4.Sacticket();
		  return this.idsacticket; 
	} 

}