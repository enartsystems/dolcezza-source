package org.suinsit.apps.notificaciones;

import java.io.Serializable;
import java.lang.Long;
import java.sql.Timestamp;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import org.enartframework.nocode.annotacion.Entidad;
import org.suinsit.apps.admin.Ssousuario;
import org.suinsit.apps.notificaciones.Notmnotificacion;

@Entity
@Table (
	name = "NOTRNOTIUSERS" 
)
@Entidad (
	type = "TABLE",
	pk = "idxnotrnotiusers" 
)
public class Notrnotiusers implements Serializable { 

	private static final long serialVersionUID = 1L;
	@Column (
		name = "FECHAENVIO",
		nullable = true 
	)
	private Timestamp fechaenvio;
	@Id
	@Column (
		name = "IDXNOTRNOTIUSERS",
		nullable = true 
	)
	private Long idxnotrnotiusers;
	@Column (
		name = "LECTURA",
		nullable = true 
	)
	private Timestamp lectura;
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
		name = "IDSSOUSUARIO0",
		referencedColumnName = "IDXSSOUSUARIO",
		nullable = true,
		insertable = true,
		updatable = true 
	)
	private Ssousuario idssousuario; 

	public void setFechaenvio(
		Timestamp var
	) {
		this.fechaenvio=var; 
	}
	
	public Timestamp getFechaenvio() {
		return this.fechaenvio; 
	}
	
	public void setIdxnotrnotiusers(
		Long var
	) {
		this.idxnotrnotiusers=var; 
	}
	
	public Long getIdxnotrnotiusers() {
		return this.idxnotrnotiusers; 
	}
	
	public void setLectura(
		Timestamp var
	) {
		this.lectura=var; 
	}
	
	public Timestamp getLectura() {
		return this.lectura; 
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