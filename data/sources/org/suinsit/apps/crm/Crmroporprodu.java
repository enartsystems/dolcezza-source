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
import org.suinsit.apps.crm.Crmoportunidad;
import org.suinsit.apps.crm.Crmproducto;

@Entity
@Table (
	name = "CRMROPORPRODU" 
)
@Entidad (
	type = "TABLE",
	pk = "idxcrmroporprodu" 
)
public class Crmroporprodu implements Serializable { 

	private static final long serialVersionUID = 1L;
	@Id
	@Column (
		name = "IDXCRMROPORPRODU",
		nullable = true 
	)
	private Long idxcrmroporprodu;
	private boolean updatable;
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
		name = "IDCRMPRODUCTO0",
		referencedColumnName = "IDXCRMPRODUCTO",
		nullable = false,
		insertable = true,
		updatable = true 
	)
	private Crmproducto idcrmproducto; 

	public void setIdxcrmroporprodu(
		Long var
	) {
		this.idxcrmroporprodu=var; 
	}
	
	public Long getIdxcrmroporprodu() {
		return this.idxcrmroporprodu; 
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
	
	public void setIdcrmproducto(
		Crmproducto var
	) {
		this.idcrmproducto=var; 
	}
	
	public Crmproducto getIdcrmproducto() {
		if(this.idcrmproducto==null)this.idcrmproducto=new org.suinsit.apps.crm.Crmproducto();
		  return this.idcrmproducto; 
	} 

}