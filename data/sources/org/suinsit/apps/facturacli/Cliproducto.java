package org.suinsit.apps.facturacli;

import java.io.Serializable;
import java.lang.Long;
import java.lang.Object;
import java.lang.String;
import java.math.BigDecimal;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import org.enartframework.nocode.annotacion.Entidad;
import org.suinsit.apps.crm.Crmempresa;
import org.suinsit.apps.facturacin.Erpimpuestos;

@Entity
@Table (
	name = "CLIPRODUCTO" 
)
@Entidad (
	type = "TABLE",
	pk = "idxcliproducto" 
)
public class Cliproducto implements Serializable { 

	private static final long serialVersionUID = 1L;
	@Column (
		name = "avatar",
		nullable = true 
	)
	private Object avatar;
	@Column (
		name = "descripcion",
		nullable = true 
	)
	private String descripcion;
	@Id
	@Column (
		name = "idxcliproducto",
		nullable = true 
	)
	private Long idxcliproducto;
	@Column (
		name = "iva",
		nullable = true 
	)
	private BigDecimal iva;
	@Column (
		name = "preciocoste",
		nullable = true 
	)
	private BigDecimal preciocoste;
	@Column (
		name = "precioventa",
		nullable = true 
	)
	private BigDecimal precioventa;
	@Column (
		name = "producto",
		nullable = true 
	)
	private String producto;
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
		name = "IDERPIMPUESTOS0",
		referencedColumnName = "IDXERPIMPUESTOS",
		nullable = true,
		insertable = true,
		updatable = true 
	)
	private Erpimpuestos iderpimpuestos; 

	public void setAvatar(
		Object var
	) {
		this.avatar=var; 
	}
	
	public Object getAvatar() {
		return this.avatar; 
	}
	
	public void setDescripcion(
		String var
	) {
		this.descripcion=var; 
	}
	
	public String getDescripcion() {
		return this.descripcion; 
	}
	
	public void setIdxcliproducto(
		Long var
	) {
		this.idxcliproducto=var; 
	}
	
	public Long getIdxcliproducto() {
		return this.idxcliproducto; 
	}
	
	public void setIva(
		BigDecimal var
	) {
		this.iva=var; 
	}
	
	public BigDecimal getIva() {
		return this.iva; 
	}
	
	public void setPreciocoste(
		BigDecimal var
	) {
		this.preciocoste=var; 
	}
	
	public BigDecimal getPreciocoste() {
		return this.preciocoste; 
	}
	
	public void setPrecioventa(
		BigDecimal var
	) {
		this.precioventa=var; 
	}
	
	public BigDecimal getPrecioventa() {
		return this.precioventa; 
	}
	
	public void setProducto(
		String var
	) {
		this.producto=var; 
	}
	
	public String getProducto() {
		return this.producto; 
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