package org.suinsit.apps.subscripciones;

import java.io.Serializable;
import java.lang.Long;
import java.math.BigDecimal;
import java.sql.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import org.enartframework.nocode.annotacion.Entidad;
import org.suinsit.apps.facturacin.Erpfactura;
import org.suinsit.apps.subscripciones.Subscripcion;

@Entity
@Table (
	name = "SUBRENOVACION" 
)
@Entidad (
	type = "TABLE",
	pk = "idxsubrenovacion" 
)
public class Subrenovacion implements Serializable { 

	private static final long serialVersionUID = 1L;
	@Column (
		name = "FECABONO",
		nullable = true 
	)
	private Date fecabono;
	@Column (
		name = "IMPORTE",
		nullable = true 
	)
	private BigDecimal importe;
	@Column (
		name = "RENOVACION",
		nullable = true 
	)
	private Date renovacion;
	@Id
	@Column (
		name = "IDXSUBRENOVACION",
		nullable = true 
	)
	private Long idxsubrenovacion;
	private boolean updatable;
	@ManyToOne (
		fetch = javax.persistence.FetchType.LAZY 
	)
	@JoinColumn (
		name = "IDSUBSCRIPCION0",
		referencedColumnName = "IDXSUBSCRIPCION",
		nullable = true,
		insertable = true,
		updatable = true 
	)
	private Subscripcion idsubscripcion;
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

	public void setFecabono(
		Date var
	) {
		this.fecabono=var; 
	}
	
	public Date getFecabono() {
		return this.fecabono; 
	}
	
	public void setImporte(
		BigDecimal var
	) {
		this.importe=var; 
	}
	
	public BigDecimal getImporte() {
		return this.importe; 
	}
	
	public void setRenovacion(
		Date var
	) {
		this.renovacion=var; 
	}
	
	public Date getRenovacion() {
		return this.renovacion; 
	}
	
	public void setIdxsubrenovacion(
		Long var
	) {
		this.idxsubrenovacion=var; 
	}
	
	public Long getIdxsubrenovacion() {
		return this.idxsubrenovacion; 
	}
	
	public void setUpdatable(
		boolean var
	) {
		this.updatable=var; 
	}
	
	public boolean isUpdatable() {
		return this.updatable; 
	}
	
	public void setIdsubscripcion(
		Subscripcion var
	) {
		this.idsubscripcion=var; 
	}
	
	public Subscripcion getIdsubscripcion() {
		if(this.idsubscripcion==null)this.idsubscripcion=new org.suinsit.apps.subscripciones.Subscripcion();
		  return this.idsubscripcion; 
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

}