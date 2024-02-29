package org.suinsit.apps.contratos;

import java.io.Serializable;
import java.lang.Long;
import java.sql.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import org.enartframework.nocode.annotacion.Entidad;
import org.suinsit.apps.contratos.Crtmcontrato;

@Entity
@Table (
	name = "CRTRRENOVACION" 
)
@Entidad (
	type = "TABLE",
	pk = "idxcrtrrenovacion" 
)
public class Crtrrenovacion implements Serializable { 

	private static final long serialVersionUID = 1L;
	@Id
	@Column (
		name = "IDXCRTRRENOVACION",
		nullable = true 
	)
	private Long idxcrtrrenovacion;
	@Column (
		name = "RENOVACION",
		nullable = true 
	)
	private Date renovacion;
	@Column (
		name = "VIGENTE",
		nullable = true 
	)
	private boolean vigente;
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

	public void setIdxcrtrrenovacion(
		Long var
	) {
		this.idxcrtrrenovacion=var; 
	}
	
	public Long getIdxcrtrrenovacion() {
		return this.idxcrtrrenovacion; 
	}
	
	public void setRenovacion(
		Date var
	) {
		this.renovacion=var; 
	}
	
	public Date getRenovacion() {
		return this.renovacion; 
	}
	
	public void setVigente(
		boolean var
	) {
		this.vigente=var; 
	}
	
	public boolean isVigente() {
		return this.vigente; 
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

}