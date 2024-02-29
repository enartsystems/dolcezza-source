package org.suinsit.apps.pmo;

import java.io.Serializable;
import java.lang.Long;
import java.math.BigDecimal;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import org.enartframework.nocode.annotacion.Entidad;
import org.suinsit.apps.pmo.Pmomperfil;
import org.suinsit.apps.pmo.Pmomproject;

@Entity
@Table (
	name = "PMORTARIFAPRO" 
)
@Entidad (
	type = "TABLE",
	pk = "idxpmortarifapro" 
)
public class Pmortarifapro implements Serializable { 

	private static final long serialVersionUID = 1L;
	@Column (
		name = "PRECIOVENTA",
		nullable = true 
	)
	private BigDecimal precioventa;
	@Id
	@Column (
		name = "IDXPMORTARIFAPRO",
		nullable = true 
	)
	private Long idxpmortarifapro;
	private boolean updatable;
	@ManyToOne (
		fetch = javax.persistence.FetchType.LAZY 
	)
	@JoinColumn (
		name = "IDPMOMPERFIL0",
		referencedColumnName = "IDXPMOMPERFIL",
		nullable = true,
		insertable = true,
		updatable = true 
	)
	private Pmomperfil idpmomperfil;
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

	public void setPrecioventa(
		BigDecimal var
	) {
		this.precioventa=var; 
	}
	
	public BigDecimal getPrecioventa() {
		return this.precioventa; 
	}
	
	public void setIdxpmortarifapro(
		Long var
	) {
		this.idxpmortarifapro=var; 
	}
	
	public Long getIdxpmortarifapro() {
		return this.idxpmortarifapro; 
	}
	
	public void setUpdatable(
		boolean var
	) {
		this.updatable=var; 
	}
	
	public boolean isUpdatable() {
		return this.updatable; 
	}
	
	public void setIdpmomperfil(
		Pmomperfil var
	) {
		this.idpmomperfil=var; 
	}
	
	public Pmomperfil getIdpmomperfil() {
		if(this.idpmomperfil==null)this.idpmomperfil=new org.suinsit.apps.pmo.Pmomperfil();
		  return this.idpmomperfil; 
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

}