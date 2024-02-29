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
import org.suinsit.apps.admin.Mrolcargo;
import org.suinsit.apps.crm.Crmcontacto;
import org.suinsit.apps.crm.Crmoportunidad;

@Entity
@Table (
	name = "CRMROPOCONTACT" 
)
@Entidad (
	type = "TABLE",
	pk = "idxcrmropocontact" 
)
public class Crmropocontact implements Serializable { 

	private static final long serialVersionUID = 1L;
	@Id
	@Column (
		name = "IDXCRMROPOCONTACT",
		nullable = true 
	)
	private Long idxcrmropocontact;
	private boolean updatable;
	@ManyToOne (
		fetch = javax.persistence.FetchType.LAZY 
	)
	@JoinColumn (
		name = "IDCRMCONTACTO0",
		referencedColumnName = "IDXCRMCONTACTO",
		nullable = false,
		insertable = true,
		updatable = true 
	)
	private Crmcontacto idcrmcontacto;
	@ManyToOne (
		fetch = javax.persistence.FetchType.LAZY 
	)
	@JoinColumn (
		name = "IDCRMOPORTUNIDAD0",
		referencedColumnName = "IDXOPORTUNIDAD",
		nullable = false,
		insertable = true,
		updatable = true 
	)
	private Crmoportunidad idcrmoportunidad;
	@ManyToOne (
		fetch = javax.persistence.FetchType.LAZY 
	)
	@JoinColumn (
		name = "IDMROLCARGO0",
		referencedColumnName = "IDXMROLCARGO",
		nullable = true,
		insertable = true,
		updatable = true 
	)
	private Mrolcargo idmrolcargo; 

	public void setIdxcrmropocontact(
		Long var
	) {
		this.idxcrmropocontact=var; 
	}
	
	public Long getIdxcrmropocontact() {
		return this.idxcrmropocontact; 
	}
	
	public void setUpdatable(
		boolean var
	) {
		this.updatable=var; 
	}
	
	public boolean isUpdatable() {
		return this.updatable; 
	}
	
	public void setIdcrmcontacto(
		Crmcontacto var
	) {
		this.idcrmcontacto=var; 
	}
	
	public Crmcontacto getIdcrmcontacto() {
		if(this.idcrmcontacto==null)this.idcrmcontacto=new org.suinsit.apps.crm.Crmcontacto();
		  return this.idcrmcontacto; 
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
	
	public void setIdmrolcargo(
		Mrolcargo var
	) {
		this.idmrolcargo=var; 
	}
	
	public Mrolcargo getIdmrolcargo() {
		if(this.idmrolcargo==null)this.idmrolcargo=new org.suinsit.apps.admin.Mrolcargo();
		  return this.idmrolcargo; 
	} 

}