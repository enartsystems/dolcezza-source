package org.suinsit.apps.notificaciones;

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
import org.suinsit.apps.notificaciones.Notmnotificacion;

@Entity
@Table (
	name = "NOTRNOTROLES" 
)
@Entidad (
	type = "TABLE",
	pk = "idxnotrnotroles" 
)
public class Notrnotroles implements Serializable { 

	private static final long serialVersionUID = 1L;
	@Id
	@Column (
		name = "IDXNOTRNOTROLES",
		nullable = true 
	)
	private Long idxnotrnotroles;
	private boolean updatable;
	@ManyToOne (
		fetch = javax.persistence.FetchType.LAZY 
	)
	@JoinColumn (
		name = "IDNOTMNOTIFICACION0",
		referencedColumnName = "IDXNOTMNOTIFICACION",
		nullable = true,
		insertable = true,
		updatable = true 
	)
	private Notmnotificacion idnotmnotificacion;
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

	public void setIdxnotrnotroles(
		Long var
	) {
		this.idxnotrnotroles=var; 
	}
	
	public Long getIdxnotrnotroles() {
		return this.idxnotrnotroles; 
	}
	
	public void setUpdatable(
		boolean var
	) {
		this.updatable=var; 
	}
	
	public boolean isUpdatable() {
		return this.updatable; 
	}
	
	public void setIdnotmnotificacion(
		Notmnotificacion var
	) {
		this.idnotmnotificacion=var; 
	}
	
	public Notmnotificacion getIdnotmnotificacion() {
		if(this.idnotmnotificacion==null)this.idnotmnotificacion=new org.suinsit.apps.notificaciones.Notmnotificacion();
		  return this.idnotmnotificacion; 
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