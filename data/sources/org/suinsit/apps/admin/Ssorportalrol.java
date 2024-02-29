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
import org.suinsit.apps.admin.Ssoportal;
import org.suinsit.apps.admin.Ssorol;

@Entity
@Table (
	name = "SSORPORTALROL" 
)
@Entidad (
	type = "TABLE",
	pk = "idxssorportalrol" 
)
public class Ssorportalrol implements Serializable { 

	private static final long serialVersionUID = 1L;
	@Id
	@Column (
		name = "IDXSSORPORTALROL",
		nullable = true 
	)
	private Long idxssorportalrol;
	private boolean updatable;
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
	@ManyToOne (
		fetch = javax.persistence.FetchType.LAZY 
	)
	@JoinColumn (
		name = "IDSSOPORTAL0",
		referencedColumnName = "IDXSSOPORTAL",
		nullable = true,
		insertable = true,
		updatable = true 
	)
	private Ssoportal idssoportal; 

	public void setIdxssorportalrol(
		Long var
	) {
		this.idxssorportalrol=var; 
	}
	
	public Long getIdxssorportalrol() {
		return this.idxssorportalrol; 
	}
	
	public void setUpdatable(
		boolean var
	) {
		this.updatable=var; 
	}
	
	public boolean isUpdatable() {
		return this.updatable; 
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
	
	public void setIdssoportal(
		Ssoportal var
	) {
		this.idssoportal=var; 
	}
	
	public Ssoportal getIdssoportal() {
		if(this.idssoportal==null)this.idssoportal=new org.suinsit.apps.admin.Ssoportal();
		  return this.idssoportal; 
	} 

}