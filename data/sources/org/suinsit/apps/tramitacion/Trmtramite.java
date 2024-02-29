package org.suinsit.apps.tramitacion;

import java.io.Serializable;
import java.lang.Long;
import java.lang.String;
import java.math.BigDecimal;
import java.sql.Date;
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
import org.suinsit.apps.crm.Crmempresa;
import org.suinsit.apps.facturacin.Erpfactura;
import org.suinsit.apps.subvenciones.Submorganismo;
import org.suinsit.apps.tramitacion.Trmestado;
import org.suinsit.apps.tramitacion.Trmtipotramite;

@Entity
@Table (
	name = "TRMTRAMITE" 
)
@Entidad (
	type = "TABLE",
	pk = "idxtrmtramite" 
)
public class Trmtramite implements Serializable { 

	private static final long serialVersionUID = 1L;
	@Column (
		name = "ALTA",
		nullable = true 
	)
	private Date alta;
	@Column (
		name = "CODTRAMITE",
		nullable = false 
	)
	@Sequence (
		name = "TRMTRAMITE_CODTRAMITE",
		prefix = "",
		mask = "00000",
		addYear = true 
	)
	private String codtramite;
	@Column (
		name = "DESCRIPCION",
		nullable = true 
	)
	private String descripcion;
	@Column (
		name = "FECSOLICITUD",
		nullable = true 
	)
	private Timestamp fecsolicitud;
	@Column (
		name = "FINTRAMITE",
		nullable = true 
	)
	private Date fintramite;
	@Id
	@Column (
		name = "IDXTRMTRAMITE",
		nullable = true 
	)
	private Long idxtrmtramite;
	@Column (
		name = "PREVFONDOS",
		nullable = true 
	)
	private BigDecimal prevfondos;
	private boolean updatable;
	@ManyToOne (
		fetch = javax.persistence.FetchType.LAZY 
	)
	@JoinColumn (
		name = "IDTRMTIPOTRAMITE0",
		referencedColumnName = "IDXTRMTIPOTRAMITE",
		nullable = true,
		insertable = true,
		updatable = true 
	)
	private Trmtipotramite idtrmtipotramite;
	@ManyToOne (
		fetch = javax.persistence.FetchType.LAZY 
	)
	@JoinColumn (
		name = "IDCRMEMPRESA0",
		referencedColumnName = "IDXCRMEMPRESA",
		nullable = true,
		insertable = true,
		updatable = true 
	)
	private Crmempresa idcrmempresa;
	@ManyToOne (
		fetch = javax.persistence.FetchType.LAZY 
	)
	@JoinColumn (
		name = "IDERPFACTURA0",
		referencedColumnName = "IDXERPFACTURA",
		nullable = true,
		insertable = true,
		updatable = true 
	)
	private Erpfactura iderpfactura;
	@ManyToOne (
		fetch = javax.persistence.FetchType.LAZY 
	)
	@JoinColumn (
		name = "IDSUBMORGANISMO0",
		referencedColumnName = "IDXSUBMORGANISMO",
		nullable = true,
		insertable = true,
		updatable = true 
	)
	private Submorganismo idsubmorganismo;
	@ManyToOne (
		fetch = javax.persistence.FetchType.LAZY 
	)
	@JoinColumn (
		name = "IDUSUTRAMITE0",
		referencedColumnName = "IDXSSOUSUARIO",
		nullable = true,
		insertable = true,
		updatable = true 
	)
	private Ssousuario idusutramite;
	@ManyToOne (
		fetch = javax.persistence.FetchType.LAZY 
	)
	@JoinColumn (
		name = "IDTRMESTADO0",
		referencedColumnName = "IDXTRMESTADO",
		nullable = true,
		insertable = true,
		updatable = true 
	)
	private Trmestado idtrmestado; 

	public void setAlta(
		Date var
	) {
		this.alta=var; 
	}
	
	public Date getAlta() {
		return this.alta; 
	}
	
	public void setCodtramite(
		String var
	) {
		this.codtramite=var; 
	}
	
	public String getCodtramite() {
		return this.codtramite; 
	}
	
	public void setDescripcion(
		String var
	) {
		this.descripcion=var; 
	}
	
	public String getDescripcion() {
		return this.descripcion; 
	}
	
	public void setFecsolicitud(
		Timestamp var
	) {
		this.fecsolicitud=var; 
	}
	
	public Timestamp getFecsolicitud() {
		return this.fecsolicitud; 
	}
	
	public void setFintramite(
		Date var
	) {
		this.fintramite=var; 
	}
	
	public Date getFintramite() {
		return this.fintramite; 
	}
	
	public void setIdxtrmtramite(
		Long var
	) {
		this.idxtrmtramite=var; 
	}
	
	public Long getIdxtrmtramite() {
		return this.idxtrmtramite; 
	}
	
	public void setPrevfondos(
		BigDecimal var
	) {
		this.prevfondos=var; 
	}
	
	public BigDecimal getPrevfondos() {
		return this.prevfondos; 
	}
	
	public void setUpdatable(
		boolean var
	) {
		this.updatable=var; 
	}
	
	public boolean isUpdatable() {
		return this.updatable; 
	}
	
	public void setIdtrmtipotramite(
		Trmtipotramite var
	) {
		this.idtrmtipotramite=var; 
	}
	
	public Trmtipotramite getIdtrmtipotramite() {
		if(this.idtrmtipotramite==null)this.idtrmtipotramite=new org.suinsit.apps.tramitacion.Trmtipotramite();
		  return this.idtrmtipotramite; 
	}
	
	public void setIdcrmempresa(
		Crmempresa var
	) {
		this.idcrmempresa=var; 
	}
	
	public Crmempresa getIdcrmempresa() {
		if(this.idcrmempresa==null)this.idcrmempresa=new org.suinsit.apps.crm.Crmempresa();
		  return this.idcrmempresa; 
	}
	
	public void setIderpfactura(
		Erpfactura var
	) {
		this.iderpfactura=var; 
	}
	
	public Erpfactura getIderpfactura() {
		if(this.iderpfactura==null)this.iderpfactura=new org.suinsit.apps.facturacin.Erpfactura();
		  return this.iderpfactura; 
	}
	
	public void setIdsubmorganismo(
		Submorganismo var
	) {
		this.idsubmorganismo=var; 
	}
	
	public Submorganismo getIdsubmorganismo() {
		if(this.idsubmorganismo==null)this.idsubmorganismo=new org.suinsit.apps.subvenciones.Submorganismo();
		  return this.idsubmorganismo; 
	}
	
	public void setIdusutramite(
		Ssousuario var
	) {
		this.idusutramite=var; 
	}
	
	public Ssousuario getIdusutramite() {
		if(this.idusutramite==null)this.idusutramite=new org.suinsit.apps.admin.Ssousuario();
		  return this.idusutramite; 
	}
	
	public void setIdtrmestado(
		Trmestado var
	) {
		this.idtrmestado=var; 
	}
	
	public Trmestado getIdtrmestado() {
		if(this.idtrmestado==null)this.idtrmestado=new org.suinsit.apps.tramitacion.Trmestado();
		  return this.idtrmestado; 
	} 

}