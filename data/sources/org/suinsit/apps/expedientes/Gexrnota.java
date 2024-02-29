package org.suinsit.apps.expedientes;

import java.io.Serializable;
import java.lang.Long;
import java.lang.String;
import java.sql.Timestamp;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import org.enartframework.nocode.annotacion.Entidad;
import org.suinsit.apps.admin.Ssousuario;
import org.suinsit.apps.expedientes.Gexmactuacion;
import org.suinsit.apps.expedientes.Gexmepediente;
import org.suinsit.apps.tramitacion.Trmtramite;

@Entity
@Table (
	name = "GEXRNOTA" 
)
@Entidad (
	type = "TABLE",
	pk = "idxgexrnota" 
)
public class Gexrnota implements Serializable { 

	private static final long serialVersionUID = 1L;
	@Column (
		name = "ALTA",
		nullable = false 
	)
	private Timestamp alta;
	@Column (
		name = "ANOTACION",
		nullable = false 
	)
	private String anotacion;
	@Id
	@Column (
		name = "IDXGEXRNOTA",
		nullable = true 
	)
	private Long idxgexrnota;
	private boolean updatable;
	@ManyToOne (
		fetch = javax.persistence.FetchType.LAZY 
	)
	@JoinColumn (
		name = "IDGEXMACTUACION0",
		referencedColumnName = "IDXGEXMACTUACION",
		nullable = true,
		insertable = true,
		updatable = true 
	)
	private Gexmactuacion idgexmactuacion;
	@ManyToOne (
		fetch = javax.persistence.FetchType.LAZY 
	)
	@JoinColumn (
		name = "IDGEXMEPEDIENTE0",
		referencedColumnName = "IDXGEXMEPEDIENTE",
		nullable = true,
		insertable = true,
		updatable = true 
	)
	private Gexmepediente idgexmepediente;
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
	@ManyToOne (
		fetch = javax.persistence.FetchType.LAZY 
	)
	@JoinColumn (
		name = "IDTRMTRAMITE0",
		referencedColumnName = "IDXTRMTRAMITE",
		nullable = true,
		insertable = true,
		updatable = true 
	)
	private Trmtramite idtrmtramite; 

	public void setAlta(
		Timestamp var
	) {
		this.alta=var; 
	}
	
	public Timestamp getAlta() {
		return this.alta; 
	}
	
	public void setAnotacion(
		String var
	) {
		this.anotacion=var; 
	}
	
	public String getAnotacion() {
		return this.anotacion; 
	}
	
	public void setIdxgexrnota(
		Long var
	) {
		this.idxgexrnota=var; 
	}
	
	public Long getIdxgexrnota() {
		return this.idxgexrnota; 
	}
	
	public void setUpdatable(
		boolean var
	) {
		this.updatable=var; 
	}
	
	public boolean isUpdatable() {
		return this.updatable; 
	}
	
	public void setIdgexmactuacion(
		Gexmactuacion var
	) {
		this.idgexmactuacion=var; 
	}
	
	public Gexmactuacion getIdgexmactuacion() {
		if(this.idgexmactuacion==null)this.idgexmactuacion=new org.suinsit.apps.expedientes.Gexmactuacion();
		  return this.idgexmactuacion; 
	}
	
	public void setIdgexmepediente(
		Gexmepediente var
	) {
		this.idgexmepediente=var; 
	}
	
	public Gexmepediente getIdgexmepediente() {
		if(this.idgexmepediente==null)this.idgexmepediente=new org.suinsit.apps.expedientes.Gexmepediente();
		  return this.idgexmepediente; 
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
	
	public void setIdtrmtramite(
		Trmtramite var
	) {
		this.idtrmtramite=var; 
	}
	
	public Trmtramite getIdtrmtramite() {
		if(this.idtrmtramite==null)this.idtrmtramite=new org.suinsit.apps.tramitacion.Trmtramite();
		  return this.idtrmtramite; 
	} 

}