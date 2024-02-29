package org.suinsit.apps.subscripciones;

import java.io.Serializable;
import java.lang.Long;
import java.lang.String;
import java.math.BigDecimal;
import java.sql.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import org.enartframework.nocode.annotacion.Entidad;
import org.enartframework.nocode.annotacion.Sequence;
import org.suinsit.apps.crm.Crmempresa;
import org.suinsit.apps.facturacin.Erpcomercial;
import org.suinsit.apps.facturacin.Erpformapago;
import org.suinsit.apps.facturacin.Erpimpuestos;
import org.suinsit.apps.facturacin.Erpmestado;
import org.suinsit.apps.subscripciones.Periodicidad;
import org.suinsit.apps.subscripciones.Tiposubscrip;

@Entity
@Table (
	name = "SUBSCRIPCION" 
)
@Entidad (
	type = "TABLE",
	pk = "idxsubscripcion" 
)
public class Subscripcion implements Serializable { 

	private static final long serialVersionUID = 1L;
	@Column (
		name = "ALTA",
		nullable = true 
	)
	private Date alta;
	@Column (
		name = "CLIENTE",
		nullable = true 
	)
	private String cliente;
	@Column (
		name = "DESCRIPCION",
		nullable = true 
	)
	private String descripcion;
	@Column (
		name = "FIN",
		nullable = true 
	)
	private Date fin;
	@Id
	@Column (
		name = "IDXSUBSCRIPCION",
		nullable = true 
	)
	private Long idxsubscripcion;
	@Column (
		name = "IMPORTE",
		nullable = true 
	)
	private BigDecimal importe;
	@Column (
		name = "INICIO",
		nullable = true 
	)
	private Date inicio;
	@Column (
		name = "SUBSCRIPCION",
		nullable = true 
	)
	@Sequence (
		name = "SUBSCRIPCION_SUBSCRIPCION",
		prefix = "SD",
		mask = "0000000000",
		addYear = true 
	)
	private String subscripcion;
	private boolean updatable;
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
		name = "IDERPCOMERCIAL0",
		referencedColumnName = "IDXERPCOMERCIAL",
		nullable = true,
		insertable = true,
		updatable = true 
	)
	private Erpcomercial iderpcomercial;
	@ManyToOne (
		fetch = javax.persistence.FetchType.LAZY 
	)
	@JoinColumn (
		name = "IDPERIODICIDAD0",
		referencedColumnName = "IDXPERIODICIDAD",
		nullable = true,
		insertable = true,
		updatable = true 
	)
	private Periodicidad idperiodicidad;
	@ManyToOne (
		fetch = javax.persistence.FetchType.LAZY 
	)
	@JoinColumn (
		name = "IDTIPOSUBSCRIP0",
		referencedColumnName = "IDXTIPOSUBSCRIP",
		nullable = true,
		insertable = true,
		updatable = true 
	)
	private Tiposubscrip idtiposubscrip;
	@ManyToOne (
		fetch = javax.persistence.FetchType.LAZY 
	)
	@JoinColumn (
		name = "IDERPFORMAPAGO0",
		referencedColumnName = "IDXERPFORMAPAGO",
		nullable = true,
		insertable = true,
		updatable = true 
	)
	private Erpformapago iderpformapago;
	@ManyToOne (
		fetch = javax.persistence.FetchType.LAZY 
	)
	@JoinColumn (
		name = "IDERPIMPUESTOS0",
		referencedColumnName = "IDXERPIMPUESTOS",
		nullable = true,
		insertable = true,
		updatable = true 
	)
	private Erpimpuestos iderpimpuestos;
	@ManyToOne (
		fetch = javax.persistence.FetchType.LAZY 
	)
	@JoinColumn (
		name = "IDERPMESTADO0",
		referencedColumnName = "IDXERPMESTADO",
		nullable = true,
		insertable = true,
		updatable = true 
	)
	private Erpmestado iderpmestado; 

	public void setAlta(
		Date var
	) {
		this.alta=var; 
	}
	
	public Date getAlta() {
		return this.alta; 
	}
	
	public void setCliente(
		String var
	) {
		this.cliente=var; 
	}
	
	public String getCliente() {
		return this.cliente; 
	}
	
	public void setDescripcion(
		String var
	) {
		this.descripcion=var; 
	}
	
	public String getDescripcion() {
		return this.descripcion; 
	}
	
	public void setFin(
		Date var
	) {
		this.fin=var; 
	}
	
	public Date getFin() {
		return this.fin; 
	}
	
	public void setIdxsubscripcion(
		Long var
	) {
		this.idxsubscripcion=var; 
	}
	
	public Long getIdxsubscripcion() {
		return this.idxsubscripcion; 
	}
	
	public void setImporte(
		BigDecimal var
	) {
		this.importe=var; 
	}
	
	public BigDecimal getImporte() {
		return this.importe; 
	}
	
	public void setInicio(
		Date var
	) {
		this.inicio=var; 
	}
	
	public Date getInicio() {
		return this.inicio; 
	}
	
	public void setSubscripcion(
		String var
	) {
		this.subscripcion=var; 
	}
	
	public String getSubscripcion() {
		return this.subscripcion; 
	}
	
	public void setUpdatable(
		boolean var
	) {
		this.updatable=var; 
	}
	
	public boolean isUpdatable() {
		return this.updatable; 
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
	
	public void setIderpcomercial(
		Erpcomercial var
	) {
		this.iderpcomercial=var; 
	}
	
	public Erpcomercial getIderpcomercial() {
		if(this.iderpcomercial==null)this.iderpcomercial=new org.suinsit.apps.facturacin.Erpcomercial();
		  return this.iderpcomercial; 
	}
	
	public void setIdperiodicidad(
		Periodicidad var
	) {
		this.idperiodicidad=var; 
	}
	
	public Periodicidad getIdperiodicidad() {
		if(this.idperiodicidad==null)this.idperiodicidad=new org.suinsit.apps.subscripciones.Periodicidad();
		  return this.idperiodicidad; 
	}
	
	public void setIdtiposubscrip(
		Tiposubscrip var
	) {
		this.idtiposubscrip=var; 
	}
	
	public Tiposubscrip getIdtiposubscrip() {
		if(this.idtiposubscrip==null)this.idtiposubscrip=new org.suinsit.apps.subscripciones.Tiposubscrip();
		  return this.idtiposubscrip; 
	}
	
	public void setIderpformapago(
		Erpformapago var
	) {
		this.iderpformapago=var; 
	}
	
	public Erpformapago getIderpformapago() {
		if(this.iderpformapago==null)this.iderpformapago=new org.suinsit.apps.facturacin.Erpformapago();
		  return this.iderpformapago; 
	}
	
	public void setIderpimpuestos(
		Erpimpuestos var
	) {
		this.iderpimpuestos=var; 
	}
	
	public Erpimpuestos getIderpimpuestos() {
		if(this.iderpimpuestos==null)this.iderpimpuestos=new org.suinsit.apps.facturacin.Erpimpuestos();
		  return this.iderpimpuestos; 
	}
	
	public void setIderpmestado(
		Erpmestado var
	) {
		this.iderpmestado=var; 
	}
	
	public Erpmestado getIderpmestado() {
		if(this.iderpmestado==null)this.iderpmestado=new org.suinsit.apps.facturacin.Erpmestado();
		  return this.iderpmestado; 
	} 

}