package org.suinsit.apps.facturacli;

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
import org.suinsit.apps.facturacli.Clifactura;
import org.suinsit.apps.facturacli.Cliproducto;

@Entity
@Table (
	name = "CLILINEAFACTURA" 
)
@Entidad (
	type = "TABLE",
	pk = "idxclilineafactura" 
)
public class Clilineafactura implements Serializable { 

	private static final long serialVersionUID = 1L;
	@Column (
		name = "seccion",
		nullable = true 
	)
	private String seccion;
	@Column (
		name = "nota",
		nullable = true 
	)
	private String nota;
	@Column (
		name = "descripcion",
		nullable = true 
	)
	private String descripcion;
	@Column (
		name = "endperiodo",
		nullable = true 
	)
	private Date endperiodo;
	@Id
	@Column (
		name = "idxclilineafactura",
		nullable = true 
	)
	private Long idxclilineafactura;
	@Column (
		name = "impuesto",
		nullable = true 
	)
	private BigDecimal impuesto;
	@Column (
		name = "precio",
		nullable = true 
	)
	private BigDecimal precio;
	@Column (
		name = "startperiodo",
		nullable = true 
	)
	private Date startperiodo;
	@Column (
		name = "subtotal",
		nullable = true 
	)
	private BigDecimal subtotal;
	@Column (
		name = "unidades",
		nullable = true 
	)
	private BigDecimal unidades;
	private boolean updatable;
	@ManyToOne (
		fetch = javax.persistence.FetchType.LAZY 
	)
	@JoinColumn (
		name = "IDCLIFACTURA0",
		referencedColumnName = "IDXCLIFACTURA",
		nullable = true,
		insertable = true,
		updatable = true 
	)
	private Clifactura idclifactura;
	@ManyToOne (
		fetch = javax.persistence.FetchType.LAZY 
	)
	@JoinColumn (
		name = "IDCLIPRODUCTO0",
		referencedColumnName = "IDXCLIPRODUCTO",
		nullable = true,
		insertable = true,
		updatable = true 
	)
	private Cliproducto idcliproducto; 

	public void setSeccion(
		String var
	) {
		this.seccion=var; 
	}
	
	public String getSeccion() {
		return this.seccion; 
	}
	
	public void setNota(
		String var
	) {
		this.nota=var; 
	}
	
	public String getNota() {
		return this.nota; 
	}
	
	public void setDescripcion(
		String var
	) {
		this.descripcion=var; 
	}
	
	public String getDescripcion() {
		return this.descripcion; 
	}
	
	public void setEndperiodo(
		Date var
	) {
		this.endperiodo=var; 
	}
	
	public Date getEndperiodo() {
		return this.endperiodo; 
	}
	
	public void setIdxclilineafactura(
		Long var
	) {
		this.idxclilineafactura=var; 
	}
	
	public Long getIdxclilineafactura() {
		return this.idxclilineafactura; 
	}
	
	public void setImpuesto(
		BigDecimal var
	) {
		this.impuesto=var; 
	}
	
	public BigDecimal getImpuesto() {
		return this.impuesto; 
	}
	
	public void setPrecio(
		BigDecimal var
	) {
		this.precio=var; 
	}
	
	public BigDecimal getPrecio() {
		return this.precio; 
	}
	
	public void setStartperiodo(
		Date var
	) {
		this.startperiodo=var; 
	}
	
	public Date getStartperiodo() {
		return this.startperiodo; 
	}
	
	public void setSubtotal(
		BigDecimal var
	) {
		this.subtotal=var; 
	}
	
	public BigDecimal getSubtotal() {
		return this.subtotal; 
	}
	
	public void setUnidades(
		BigDecimal var
	) {
		this.unidades=var; 
	}
	
	public BigDecimal getUnidades() {
		return this.unidades; 
	}
	
	public void setUpdatable(
		boolean var
	) {
		this.updatable=var; 
	}
	
	public boolean isUpdatable() {
		return this.updatable; 
	}
	
	public void setIdclifactura(
		Clifactura var
	) {
		this.idclifactura=var; 
	}
	
	public Clifactura getIdclifactura() {
		if(this.idclifactura==null)this.idclifactura=new org.suinsit.apps.facturacli.Clifactura();
		  return this.idclifactura; 
	}
	
	public void setIdcliproducto(
		Cliproducto var
	) {
		this.idcliproducto=var; 
	}
	
	public Cliproducto getIdcliproducto() {
		if(this.idcliproducto==null)this.idcliproducto=new org.suinsit.apps.facturacli.Cliproducto();
		  return this.idcliproducto; 
	} 

}