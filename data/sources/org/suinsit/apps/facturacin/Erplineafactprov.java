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
import org.suinsit.apps.facturacin.Erpfactcompra;
import org.suinsit.apps.facturacin.Erpimpuestos;
import org.suinsit.apps.facturacin.Erpmproveedor;
import org.suinsit.apps.facturacin.Promproducto;

@Entity
@Table (
	name = "ERPLINEAFACTPROV" 
)
@Entidad (
	type = "TABLE",
	pk = "idxerplineafactprov" 
)
public class Erplineafactprov implements Serializable { 

	private static final long serialVersionUID = 1L;
	@Column (
		name = "DESCRIPCION",
		nullable = true 
	)
	private String descripcion;
	@Id
	@Column (
		name = "IDXERPLINEAFACTPROV",
		nullable = true 
	)
	private Long idxerplineafactprov;
	@Column (
		name = "IMPUESTO",
		nullable = true 
	)
	private BigDecimal impuesto;
	@Column (
		name = "PRECIO",
		nullable = true 
	)
	private BigDecimal precio;
	@Column (
		name = "SUBTOTAL",
		nullable = true 
	)
	private BigDecimal subtotal;
	@Column (
		name = "UNIDADES",
		nullable = true 
	)
	private BigDecimal unidades;
	private boolean updatable;
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
		name = "IDERPFACTCOMPRA0",
		referencedColumnName = "IDXERPFACTCOMPRA",
		nullable = true,
		insertable = true,
		updatable = true 
	)
	private Erpfactcompra iderpfactcompra;
	@ManyToOne (
		fetch = javax.persistence.FetchType.LAZY 
	)
	@JoinColumn (
		name = "IDERPMPROVEEDOR0",
		referencedColumnName = "IDXERPMPROVEEDOR",
		nullable = true,
		insertable = true,
		updatable = true 
	)
	private Erpmproveedor iderpmproveedor; 

	public void setDescripcion(
		String var
	) {
		this.descripcion=var; 
	}
	
	public String getDescripcion() {
		return this.descripcion; 
	}
	
	public void setIdxerplineafactprov(
		Long var
	) {
		this.idxerplineafactprov=var; 
	}
	
	public Long getIdxerplineafactprov() {
		return this.idxerplineafactprov; 
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
	
	public void setIderpfactcompra(
		Erpfactcompra var
	) {
		this.iderpfactcompra=var; 
	}
	
	public Erpfactcompra getIderpfactcompra() {
		if(this.iderpfactcompra==null)this.iderpfactcompra=new org.suinsit.apps.facturacin.Erpfactcompra();
		  return this.iderpfactcompra; 
	}
	
	public void setIderpmproveedor(
		Erpmproveedor var
	) {
		this.iderpmproveedor=var; 
	}
	
	public Erpmproveedor getIderpmproveedor() {
		if(this.iderpmproveedor==null)this.iderpmproveedor=new org.suinsit.apps.facturacin.Erpmproveedor();
		  return this.iderpmproveedor; 
	} 

}