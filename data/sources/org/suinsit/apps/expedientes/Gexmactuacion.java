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
import org.enartframework.nocode.annotacion.Sequence;
import org.suinsit.apps.admin.Ssousuario;
import org.suinsit.apps.expedientes.Gexmepediente;
import org.suinsit.apps.expedientes.Gexmtipoact;
import org.suinsit.apps.tramitacion.Trmtramite;

@Entity
@Table (
	name = "GEXMACTUACION" 
)
@Entidad (
	type = "TABLE",
	pk = "idxgexmactuacion" 
)
public class Gexmactuacion implements Serializable { 

	private static final long serialVersionUID = 1L;
	@Column (
		name = "ACTUACION",
		nullable = false 
	)
	@Sequence (
		name = "GEXMACTUACION_ACTUACION",
		prefix = "ACT",
		mask = "00000",
		addYear = false 
	)
	private String actuacion;
	@Column (
		name = "ALTA",
		nullable = true 
	)
	private Timestamp alta;
	@Column (
		name = "COUSERALTA",
		nullable = true 
	)
	private String couseralta;
	@Column (
		name = "COUSERMODIF",
		nullable = true 
	)
	private String cousermodif;
	@Column (
		name = "DESCRIPCION",
		nullable = true 
	)
	private String descripcion;
	@Id
	@Column (
		name = "IDXGEXMACTUACION",
		nullable = true 
	)
	private Long idxgexmactuacion;
	@Column (
		name = "TMALTA",
		nullable = true 
	)
	private Timestamp tmalta;
	@Column (
		name = "TMMODIF",
		nullable = true 
	)
	private Timestamp tmmodif;
	@Column (
		name = "VISIBLECLI",
		nullable = true 
	)
	private boolean visiblecli;
	private boolean updatable;
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
		name = "IDGEXMTIPOACT0",
		referencedColumnName = "IDXGEXMTIPOACT",
		nullable = true,
		insertable = true,
		updatable = true 
	)
	private Gexmtipoact idgexmtipoact;
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

	public void setActuacion(
		String var
	) {
		this.actuacion=var; 
	}
	
	public String getActuacion() {
		return this.actuacion; 
	}
	
	public void setAlta(
		Timestamp var
	) {
		this.alta=var; 
	}
	
	public Timestamp getAlta() {
		return this.alta; 
	}
	
	public void setCouseralta(
		String var
	) {
		this.couseralta=var; 
	}
	
	public String getCouseralta() {
		return this.couseralta; 
	}
	
	public void setCousermodif(
		String var
	) {
		this.cousermodif=var; 
	}
	
	public String getCousermodif() {
		return this.cousermodif; 
	}
	
	public void setDescripcion(
		String var
	) {
		this.descripcion=var; 
	}
	
	public String getDescripcion() {
		return this.descripcion; 
	}
	
	public void setIdxgexmactuacion(
		Long var
	) {
		this.idxgexmactuacion=var; 
	}
	
	public Long getIdxgexmactuacion() {
		return this.idxgexmactuacion; 
	}
	
	public void setTmalta(
		Timestamp var
	) {
		this.tmalta=var; 
	}
	
	public Timestamp getTmalta() {
		return this.tmalta; 
	}
	
	public void setTmmodif(
		Timestamp var
	) {
		this.tmmodif=var; 
	}
	
	public Timestamp getTmmodif() {
		return this.tmmodif; 
	}
	
	public void setVisiblecli(
		boolean var
	) {
		this.visiblecli=var; 
	}
	
	public boolean isVisiblecli() {
		return this.visiblecli; 
	}
	
	public void setUpdatable(
		boolean var
	) {
		this.updatable=var; 
	}
	
	public boolean isUpdatable() {
		return this.updatable; 
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
	
	public void setIdgexmtipoact(
		Gexmtipoact var
	) {
		this.idgexmtipoact=var; 
	}
	
	public Gexmtipoact getIdgexmtipoact() {
		if(this.idgexmtipoact==null)this.idgexmtipoact=new org.suinsit.apps.expedientes.Gexmtipoact();
		  return this.idgexmtipoact; 
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