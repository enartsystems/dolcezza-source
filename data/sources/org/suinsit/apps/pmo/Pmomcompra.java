package org.suinsit.apps.pmo;

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
import org.suinsit.apps.pmo.Pmomproject;
import org.suinsit.apps.pmo.Pmopartidapre;

@Entity
@Table (
	name = "PMOMCOMPRA" 
)
@Entidad (
	type = "TABLE",
	pk = "idxpmomcompra" 
)
public class Pmomcompra implements Serializable { 

	private static final long serialVersionUID = 1L;
	@Column (
		name = "FECHA",
		nullable = true 
	)
	private Date fecha;
	@Column (
		name = "ESTADOGTO",
		nullable = true 
	)
	private String estadogto;
	@Column (
		name = "DESCRIPCION",
		nullable = true 
	)
	private String descripcion;
	@Column (
		name = "IMPORTE",
		nullable = true 
	)
	private BigDecimal importe;
	@Column (
		name = "COMPRA",
		nullable = true 
	)
	private String compra;
	@Id
	@Column (
		name = "IDXPMOMCOMPRA",
		nullable = true 
	)
	private Long idxpmomcompra;
	private boolean updatable;
	@ManyToOne (
		fetch = javax.persistence.FetchType.LAZY 
	)
	@JoinColumn (
		name = "IDPMOMPROJECT0",
		referencedColumnName = "IDXPMOMPROJECT",
		nullable = true,
		insertable = true,
		updatable = true 
	)
	private Pmomproject idpmomproject;
	@ManyToOne (
		fetch = javax.persistence.FetchType.LAZY 
	)
	@JoinColumn (
		name = "IDPMOPARTIDAPRE0",
		referencedColumnName = "IDXPMOPARTIDAPRE",
		nullable = true,
		insertable = true,
		updatable = true 
	)
	private Pmopartidapre idpmopartidapre; 

	public void setFecha(
		Date var
	) {
		this.fecha=var; 
	}
	
	public Date getFecha() {
		return this.fecha; 
	}
	
	public void setEstadogto(
		String var
	) {
		this.estadogto=var; 
	}
	
	public String getEstadogto() {
		return this.estadogto; 
	}
	
	public void setDescripcion(
		String var
	) {
		this.descripcion=var; 
	}
	
	public String getDescripcion() {
		return this.descripcion; 
	}
	
	public void setImporte(
		BigDecimal var
	) {
		this.importe=var; 
	}
	
	public BigDecimal getImporte() {
		return this.importe; 
	}
	
	public void setCompra(
		String var
	) {
		this.compra=var; 
	}
	
	public String getCompra() {
		return this.compra; 
	}
	
	public void setIdxpmomcompra(
		Long var
	) {
		this.idxpmomcompra=var; 
	}
	
	public Long getIdxpmomcompra() {
		return this.idxpmomcompra; 
	}
	
	public void setUpdatable(
		boolean var
	) {
		this.updatable=var; 
	}
	
	public boolean isUpdatable() {
		return this.updatable; 
	}
	
	public void setIdpmomproject(
		Pmomproject var
	) {
		this.idpmomproject=var; 
	}
	
	public Pmomproject getIdpmomproject() {
		if(this.idpmomproject==null)this.idpmomproject=new org.suinsit.apps.pmo.Pmomproject();
		  return this.idpmomproject; 
	}
	
	public void setIdpmopartidapre(
		Pmopartidapre var
	) {
		this.idpmopartidapre=var; 
	}
	
	public Pmopartidapre getIdpmopartidapre() {
		if(this.idpmopartidapre==null)this.idpmopartidapre=new org.suinsit.apps.pmo.Pmopartidapre();
		  return this.idpmopartidapre; 
	} 

}