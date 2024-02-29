package org.suinsit.apps.mrp;

import java.io.Serializable;
import java.lang.Integer;
import java.lang.Long;
import java.lang.String;
import java.sql.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import org.enartframework.nocode.annotacion.Entidad;
import org.suinsit.apps.facturacin.Erpempresa;
import org.suinsit.apps.facturacin.Promcategoria;
import org.suinsit.apps.facturacin.Promproducto;

@Entity
@Table (
	name = "MRPLOTE" 
)
@Entidad (
	type = "TABLE",
	pk = "idxmrplote" 
)
public class Mrplote implements Serializable { 

	private static final long serialVersionUID = 1L;
	@Column (
		name = "alta",
		nullable = true 
	)
	private Date alta;
	@Column (
		name = "cantidad",
		nullable = true 
	)
	private Integer cantidad;
	@Column (
		name = "descripcion",
		nullable = true 
	)
	private String descripcion;
	@Id
	@Column (
		name = "idxmrplote",
		nullable = true 
	)
	private Long idxmrplote;
	@Column (
		name = "internalref",
		nullable = true 
	)
	private String internalref;
	@Column (
		name = "numlote",
		nullable = true 
	)
	private String numlote;
	private boolean updatable;
	@ManyToOne (
		fetch = javax.persistence.FetchType.LAZY 
	)
	@JoinColumn (
		name = "IDCOMPANY0",
		referencedColumnName = "IDXERPEMPRESA",
		nullable = true,
		insertable = true,
		updatable = true 
	)
	private Erpempresa idcompany;
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
		name = "IDPROMCATEGORIA0",
		referencedColumnName = "IDXPROMCATEGORIA",
		nullable = true,
		insertable = true,
		updatable = true 
	)
	private Promcategoria idpromcategoria; 

	public void setAlta(
		Date var
	) {
		this.alta=var; 
	}
	
	public Date getAlta() {
		return this.alta; 
	}
	
	public void setCantidad(
		Integer var
	) {
		this.cantidad=var; 
	}
	
	public Integer getCantidad() {
		return this.cantidad; 
	}
	
	public void setDescripcion(
		String var
	) {
		this.descripcion=var; 
	}
	
	public String getDescripcion() {
		return this.descripcion; 
	}
	
	public void setIdxmrplote(
		Long var
	) {
		this.idxmrplote=var; 
	}
	
	public Long getIdxmrplote() {
		return this.idxmrplote; 
	}
	
	public void setInternalref(
		String var
	) {
		this.internalref=var; 
	}
	
	public String getInternalref() {
		return this.internalref; 
	}
	
	public void setNumlote(
		String var
	) {
		this.numlote=var; 
	}
	
	public String getNumlote() {
		return this.numlote; 
	}
	
	public void setUpdatable(
		boolean var
	) {
		this.updatable=var; 
	}
	
	public boolean isUpdatable() {
		return this.updatable; 
	}
	
	public void setIdcompany(
		Erpempresa var
	) {
		this.idcompany=var; 
	}
	
	public Erpempresa getIdcompany() {
		if(this.idcompany==null)this.idcompany=new org.suinsit.apps.facturacin.Erpempresa();
		  return this.idcompany; 
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
	
	public void setIdpromcategoria(
		Promcategoria var
	) {
		this.idpromcategoria=var; 
	}
	
	public Promcategoria getIdpromcategoria() {
		if(this.idpromcategoria==null)this.idpromcategoria=new org.suinsit.apps.facturacin.Promcategoria();
		  return this.idpromcategoria; 
	} 

}