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
import org.suinsit.apps.facturacin.Erpimpuestos;
import org.suinsit.apps.facturacin.Erppedido;
import org.suinsit.apps.facturacin.Erppresupuesto;
import org.suinsit.apps.facturacin.Promproducto;
import org.suinsit.apps.subscripciones.Subscripcion;

@Entity
@Table (
	name = "ERPRLINEAPEDIDO" 
)
@Entidad (
	type = "TABLE",
	pk = "idxerprlineapedido" 
)
public class Erprlineapedido implements Serializable { 

	private static final long serialVersionUID = 1L;
	@Column (
		name = "vatpercent",
		nullable = true 
	)
	private BigDecimal vatpercent;
	@Column (
		name = "descripcion",
		nullable = true 
	)
	private String descripcion;
	@Column (
		name = "descuento",
		nullable = true 
	)
	private BigDecimal descuento;
	@Id
	@Column (
		name = "idxerprlineapedido",
		nullable = true 
	)
	private Long idxerprlineapedido;
	@Column (
		name = "impuestos",
		nullable = true 
	)
	private BigDecimal impuestos;
	@Column (
		name = "nota",
		nullable = true 
	)
	private String nota;
	@Column (
		name = "preciounitario",
		nullable = true 
	)
	private BigDecimal preciounitario;
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
	private boolean updatable;
	@ManyToOne (
		fetch = javax.persistence.FetchType.LAZY 
	)
	@JoinColumn (
		name = "IDERPPRESUPUESTO0",
		referencedColumnName = "IDXERPPRESUPUESTO",
		nullable = true,
		insertable = true,
		updatable = true 
	)
	private Erppresupuesto iderppresupuesto;
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
		name = "IDERPPEDIDO0",
		referencedColumnName = "IDXERPPEDIDO",
		nullable = true,
		insertable = true,
		updatable = true 
	)
	private Erppedido iderppedido; 

	public void setVatpercent(
		BigDecimal var
	) {
		this.vatpercent=var; 
	}
	
	public BigDecimal getVatpercent() {
		return this.vatpercent; 
	}
	
	public void setDescripcion(
		String var
	) {
		this.descripcion=var; 
	}
	
	public String getDescripcion() {
		return this.descripcion; 
	}
	
	public void setDescuento(
		BigDecimal var
	) {
		this.descuento=var; 
	}
	
	public BigDecimal getDescuento() {
		return this.descuento; 
	}
	
	public void setIdxerprlineapedido(
		Long var
	) {
		this.idxerprlineapedido=var; 
	}
	
	public Long getIdxerprlineapedido() {
		return this.idxerprlineapedido; 
	}
	
	public void setImpuestos(
		BigDecimal var
	) {
		this.impuestos=var; 
	}
	
	public BigDecimal getImpuestos() {
		return this.impuestos; 
	}
	
	public void setNota(
		String var
	) {
		this.nota=var; 
	}
	
	public String getNota() {
		return this.nota; 
	}
	
	public void setPreciounitario(
		BigDecimal var
	) {
		this.preciounitario=var; 
	}
	
	public BigDecimal getPreciounitario() {
		return this.preciounitario; 
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
	
	public void setUpdatable(
		boolean var
	) {
		this.updatable=var; 
	}
	
	public boolean isUpdatable() {
		return this.updatable; 
	}
	
	public void setIderppresupuesto(
		Erppresupuesto var
	) {
		this.iderppresupuesto=var; 
	}
	
	public Erppresupuesto getIderppresupuesto() {
		if(this.iderppresupuesto==null)this.iderppresupuesto=new org.suinsit.apps.facturacin.Erppresupuesto();
		  return this.iderppresupuesto; 
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
	
	public void setIdsubscripcion(
		Subscripcion var
	) {
		this.idsubscripcion=var; 
	}
	
	public Subscripcion getIdsubscripcion() {
		if(this.idsubscripcion==null)this.idsubscripcion=new org.suinsit.apps.subscripciones.Subscripcion();
		  return this.idsubscripcion; 
	}
	
	public void setIderppedido(
		Erppedido var
	) {
		this.iderppedido=var; 
	}
	
	public Erppedido getIderppedido() {
		if(this.iderppedido==null)this.iderppedido=new org.suinsit.apps.facturacin.Erppedido();
		  return this.iderppedido; 
	} 

}