package org.suinsit.apps.subvenciones;

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
import org.suinsit.apps.facturacin.Promproducto;
import org.suinsit.apps.subvenciones.Kitrbonocat;

@Entity
@Table (
	name = "KITRBONOCATPROD" 
)
@Entidad (
	type = "TABLE",
	pk = "idxkitrbonocatprod" 
)
public class Kitrbonocatprod implements Serializable { 

	private static final long serialVersionUID = 1L;
	@Column (
		name = "DESCRIPCION",
		nullable = true 
	)
	private String descripcion;
	@Id
	@Column (
		name = "IDXKITRBONOCATPROD",
		nullable = true 
	)
	private Long idxkitrbonocatprod;
	@Column (
		name = "IMPORTE",
		nullable = true 
	)
	private BigDecimal importe;
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
		name = "IDKITRBONOCAT0",
		referencedColumnName = "IDXKITRBONOCAT",
		nullable = true,
		insertable = true,
		updatable = true 
	)
	private Kitrbonocat idkitrbonocat; 

	public void setDescripcion(
		String var
	) {
		this.descripcion=var; 
	}
	
	public String getDescripcion() {
		return this.descripcion; 
	}
	
	public void setIdxkitrbonocatprod(
		Long var
	) {
		this.idxkitrbonocatprod=var; 
	}
	
	public Long getIdxkitrbonocatprod() {
		return this.idxkitrbonocatprod; 
	}
	
	public void setImporte(
		BigDecimal var
	) {
		this.importe=var; 
	}
	
	public BigDecimal getImporte() {
		return this.importe; 
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
	
	public void setIdpromproducto(
		Promproducto var
	) {
		this.idpromproducto=var; 
	}
	
	public Promproducto getIdpromproducto() {
		if(this.idpromproducto==null)this.idpromproducto=new org.suinsit.apps.facturacin.Promproducto();
		  return this.idpromproducto; 
	}
	
	public void setIdkitrbonocat(
		Kitrbonocat var
	) {
		this.idkitrbonocat=var; 
	}
	
	public Kitrbonocat getIdkitrbonocat() {
		if(this.idkitrbonocat==null)this.idkitrbonocat=new org.suinsit.apps.subvenciones.Kitrbonocat();
		  return this.idkitrbonocat; 
	} 

}