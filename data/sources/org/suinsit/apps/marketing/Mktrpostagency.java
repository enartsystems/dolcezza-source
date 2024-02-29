package org.suinsit.apps.marketing;

import java.io.Serializable;
import java.lang.Long;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import org.enartframework.nocode.annotacion.Entidad;
import org.suinsit.apps.marketing.Mktmpost;
import org.suinsit.apps.marketing.Mktrssagency;

@Entity
@Table (
	name = "MKTRPOSTAGENCY" 
)
@Entidad (
	type = "TABLE",
	pk = "idxmktrpostagency" 
)
public class Mktrpostagency implements Serializable { 

	private static final long serialVersionUID = 1L;
	@Id
	@Column (
		name = "IDXMKTRPOSTAGENCY",
		nullable = true 
	)
	private Long idxmktrpostagency;
	private boolean updatable;
	@ManyToOne (
		fetch = javax.persistence.FetchType.LAZY 
	)
	@JoinColumn (
		name = "IDMKTMPOST0",
		referencedColumnName = "IDXMKTMPOST",
		nullable = true,
		insertable = true,
		updatable = true 
	)
	private Mktmpost idmktmpost;
	@ManyToOne (
		fetch = javax.persistence.FetchType.LAZY 
	)
	@JoinColumn (
		name = "IDMKTRSSAGENCY0",
		referencedColumnName = "IDXMKTRSSAGENCY",
		nullable = true,
		insertable = true,
		updatable = true 
	)
	private Mktrssagency idmktrssagency; 

	public void setIdxmktrpostagency(
		Long var
	) {
		this.idxmktrpostagency=var; 
	}
	
	public Long getIdxmktrpostagency() {
		return this.idxmktrpostagency; 
	}
	
	public void setUpdatable(
		boolean var
	) {
		this.updatable=var; 
	}
	
	public boolean isUpdatable() {
		return this.updatable; 
	}
	
	public void setIdmktmpost(
		Mktmpost var
	) {
		this.idmktmpost=var; 
	}
	
	public Mktmpost getIdmktmpost() {
		if(this.idmktmpost==null)this.idmktmpost=new org.suinsit.apps.marketing.Mktmpost();
		  return this.idmktmpost; 
	}
	
	public void setIdmktrssagency(
		Mktrssagency var
	) {
		this.idmktrssagency=var; 
	}
	
	public Mktrssagency getIdmktrssagency() {
		if(this.idmktrssagency==null)this.idmktrssagency=new org.suinsit.apps.marketing.Mktrssagency();
		  return this.idmktrssagency; 
	} 

}