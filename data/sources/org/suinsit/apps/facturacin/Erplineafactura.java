package org.suinsit.apps.facturacin;

import java.io.Serializable;
import java.lang.Long;
import java.lang.String;
import java.math.BigDecimal;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import org.enartframework.nocode.annotacion.Entidad;
import org.suinsit.apps.facturacin.Erpfactura;
import org.suinsit.apps.facturacin.Erpimpuestos;
import org.suinsit.apps.facturacin.Promproducto;

@Entity
@Table (
	name = "ERPLINEAFACTURA" 
)
@Entidad (
	type = "TABLE",
	pk = "idxerplineafactura" 
)
public class Erplineafactura implements Serializable { 

	private static final long serialVersionUID = 1L;
	@Column (
		name = "descuento",
		nullable = true 
	)
	private BigDecimal descuento;
	@Column (
		name = "descripcion",
		nullable = true 
	)
	private String descripcion;
	@Column (
		name = "entregada",
		nullable = true 
	)
	private boolean entregada;
	@Id
	@Column (
		name = "idxerplineafactura",
		nullable = true 
	)
	private Long idxerplineafactura;
	@Column (
		name = "impuesto",
		nullable = true 
	)
	private BigDecimal impuesto;
	@Column (
		name = "nota",
		nullable = true 
	)
	private String nota;
	@Column (
		name = "precio",
		nullable = true 
	)
	private BigDecimal precio;
	@Column (
		name = "seccion",
		nullable = true 
	)
	private String seccion;
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
	@Column (
		name = "vatpercent",
		nullable = true 
	)
	private BigDecimal vatpercent;
	private boolean updatable;
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
		name = "IDPROMPRODUCTO0",
		referencedColumnName = "IDXPROMPRODUCTO",
		nullable = true,
		insertable = true,
		updatable = true 
	)
	private Promproducto idpromproducto;
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

	public void setDescuento(
		BigDecimal var
	) {
		this.descuento=var; 
	}
	
	public BigDecimal getDescuento() {
		return this.descuento; 
	}
	
	public void setDescripcion(
		String var
	) {
		this.descripcion=var; 
	}
	
	public String getDescripcion() {
		return this.descripcion; 
	}
	
	public void setEntregada(
		boolean var
	) {
		this.entregada=var; 
	}
	
	public boolean isEntregada() {
		return this.entregada; 
	}
	
	public void setIdxerplineafactura(
		Long var
	) {
		this.idxerplineafactura=var; 
	}
	
	public Long getIdxerplineafactura() {
		return this.idxerplineafactura; 
	}
	
	public void setImpuesto(
		BigDecimal var
	) {
		this.impuesto=var; 
	}
	
	public BigDecimal getImpuesto() {
		return this.impuesto; 
	}
	
	public void setNota(
		String var
	) {
		this.nota=var; 
	}
	
	public String getNota() {
		return this.nota; 
	}
	
	public void setPrecio(
		BigDecimal var
	) {
		this.precio=var; 
	}
	
	public BigDecimal getPrecio() {
		return this.precio; 
	}
	
	public void setSeccion(
		String var
	) {
		this.seccion=var; 
	}
	
	public String getSeccion() {
		return this.seccion; 
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
	
	public void setVatpercent(
		BigDecimal var
	) {
		this.vatpercent=var; 
	}
	
	public BigDecimal getVatpercent() {
		return this.vatpercent; 
	}
	
	public void setUpdatable(
		boolean var
	) {
		this.updatable=var; 
	}
	
	public boolean isUpdatable() {
		return this.updatable; 
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
	
	public void setIdpromproducto(
		Promproducto var
	) {
		this.idpromproducto=var; 
	}
	
	public Promproducto getIdpromproducto() {
		if(this.idpromproducto==null)this.idpromproducto=new org.suinsit.apps.facturacin.Promproducto();
		  return this.idpromproducto; 
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

}