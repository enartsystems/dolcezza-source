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
import org.suinsit.apps.admin.Ssorol;
import org.suinsit.apps.admin.Ssousuario;

@Entity
@Table (
	name = "SSORUSEROL" 
)
@Entidad (
	type = "TABLE",
	pk = "idxssoruserol" 
)
public class Ssoruserol implements Serializable { 

	private static final long serialVersionUID = 1L;
	@Id
	@Column (
		name = "IDXSSORUSEROL",
		nullable = true 
	)
	private Long idxssoruserol;
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
		name = "IDSSOUSUARIO0",
		referencedColumnName = "IDXSSOUSUARIO",
		nullable = true,
		insertable = true,
		updatable = true 
	)
	private Ssousuario idssousuario; 

	public void setIdxssoruserol(
		Long var
	) {
		this.idxssoruserol=var; 
	}
	
	public Long getIdxssoruserol() {
		return this.idxssoruserol; 
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
	
	public void setIdssousuario(
		Ssousuario var
	) {
		this.idssousuario=var; 
	}
	
	public Ssousuario getIdssousuario() {
		if(this.idssousuario==null)this.idssousuario=new org.suinsit.apps.admin.Ssousuario();
		  return this.idssousuario; 
	} 

}