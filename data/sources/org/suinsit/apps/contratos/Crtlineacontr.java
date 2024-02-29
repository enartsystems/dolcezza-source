package org.suinsit.apps.contratos;

import java.io.Serializable;
import java.lang.Integer;
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
import org.suinsit.apps.contratos.Crtmcontrato;
import org.suinsit.apps.facturacin.Promproducto;

@Entity
@Table (
	name = "CRTLINEACONTR" 
)
@Entidad (
	type = "TABLE",
	pk = "idxcrtlineacontr" 
)
public class Crtlineacontr implements Serializable { 

	private static final long serialVersionUID = 1L;
	@Column (
		name = "DESCRIPCION",
		nullable = true 
	)
	private String descripcion;
	@Id
	@Column (
		name = "IDXCRTLINEACONTR",
		nullable = true 
	)
	private Long idxcrtlineacontr;
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
	private Integer unidades;
	private boolean updatable;
	@ManyToOne (
		fetch = javax.persistence.FetchType.LAZY 
	)
	@JoinColumn (
		name = "IDCRTMCONTRATO0",
		referencedColumnName = "IDXCRTMCONTRATO",
		nullable = true,
		insertable = true,
		updatable = true 
	)
	private Crtmcontrato idcrtmcontrato;
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

	public void setDescripcion(
		String var
	) {
		this.descripcion=var; 
	}
	
	public String getDescripcion() {
		return this.descripcion; 
	}
	
	public void setIdxcrtlineacontr(
		Long var
	) {
		this.idxcrtlineacontr=var; 
	}
	
	public Long getIdxcrtlineacontr() {
		return this.idxcrtlineacontr; 
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
		Integer var
	) {
		this.unidades=var; 
	}
	
	public Integer getUnidades() {
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
	
	public void setIdcrtmcontrato(
		Crtmcontrato var
	) {
		this.idcrtmcontrato=var; 
	}
	
	public Crtmcontrato getIdcrtmcontrato() {
		if(this.idcrtmcontrato==null)this.idcrtmcontrato=new org.suinsit.apps.contratos.Crtmcontrato();
		  return this.idcrtmcontrato; 
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

}