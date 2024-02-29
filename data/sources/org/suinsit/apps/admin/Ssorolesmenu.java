package org.suinsit.apps.admin;

import java.io.Serializable;
import java.lang.Long;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import org.enartframework.nocode.annotacion.Entidad;
import org.suinsit.apps.admin.Ssomenuitem;
import org.suinsit.apps.admin.Ssorol;

@Entity
@Table (
	name = "SSOROLESMENU" 
)
@Entidad (
	type = "TABLE",
	pk = "idxssorolesmenu" 
)
public class Ssorolesmenu implements Serializable { 

	private static final long serialVersionUID = 1L;
	@Id
	@Column (
		name = "IDXSSOROLESMENU",
		nullable = true 
	)
	private Long idxssorolesmenu;
	private boolean updatable;
	@ManyToOne (
		fetch = javax.persistence.FetchType.LAZY 
	)
	@JoinColumn (
		name = "IDSSOMENUITEM0",
		referencedColumnName = "IDXSSOMENUITEM",
		nullable = true,
		insertable = true,
		updatable = true 
	)
	private Ssomenuitem idssomenuitem;
	@ManyToOne (
		fetch = javax.persistence.FetchType.LAZY 
	)
	@JoinColumn (
		name = "IDSSOROL0",
		referencedColumnName = "IDXSSOROL",
		nullable = true,
		insertable = true,
		updatable = true 
	)
	private Ssorol idssorol; 

	public void setIdxssorolesmenu(
		Long var
	) {
		this.idxssorolesmenu=var; 
	}
	
	public Long getIdxssorolesmenu() {
		return this.idxssorolesmenu; 
	}
	
	public void setUpdatable(
		boolean var
	) {
		this.updatable=var; 
	}
	
	public boolean isUpdatable() {
		return this.updatable; 
	}
	
	public void setIdssomenuitem(
		Ssomenuitem var
	) {
		this.idssomenuitem=var; 
	}
	
	public Ssomenuitem getIdssomenuitem() {
		if(this.idssomenuitem==null)this.idssomenuitem=new org.suinsit.apps.admin.Ssomenuitem();
		  return this.idssomenuitem; 
	}
	
	public void setIdssorol(
		Ssorol var
	) {
		this.idssorol=var; 
	}
	
	public Ssorol getIdssorol() {
		if(this.idssorol==null)this.idssorol=new org.suinsit.apps.admin.Ssorol();
		  return this.idssorol; 
	} 

}