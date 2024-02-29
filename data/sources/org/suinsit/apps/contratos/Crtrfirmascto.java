package org.suinsit.apps.contratos;

import java.io.Serializable;
import java.lang.Long;
import java.lang.Object;
import java.lang.String;
import java.sql.Timestamp;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import org.enartframework.nocode.annotacion.Entidad;
import org.suinsit.apps.admin.Ssousuario;
import org.suinsit.apps.contratos.Crtmcontrato;

@Entity
@Table (
	name = "CRTRFIRMASCTO" 
)
@Entidad (
	type = "TABLE",
	pk = "idxcrtrfirmascto" 
)
public class Crtrfirmascto implements Serializable { 

	private static final long serialVersionUID = 1L;
	@Column (
		name = "OTPFIRMA",
		nullable = true 
	)
	private String otpfirma;
	@Column (
		name = "FIRMABIO",
		nullable = true 
	)
	private Object firmabio;
	@Column (
		name = "FECHAFIRMA",
		nullable = true 
	)
	private Timestamp fechafirma;
	@Id
	@Column (
		name = "IDXCRTRFIRMASCTO",
		nullable = true 
	)
	private Long idxcrtrfirmascto;
	@Column (
		name = "COUSERALTA",
		nullable = true 
	)
	private String couseralta;
	@Column (
		name = "TMALTA",
		nullable = true 
	)
	private Timestamp tmalta;
	@Column (
		name = "COUSERMODIF",
		nullable = true 
	)
	private String cousermodif;
	@Column (
		name = "TMMODIF",
		nullable = true 
	)
	private Timestamp tmmodif;
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
		name = "IDUSUARIOFIRMA0",
		referencedColumnName = "IDXSSOUSUARIO",
		nullable = true,
		insertable = true,
		updatable = true 
	)
	private Ssousuario idusuariofirma; 

	public void setOtpfirma(
		String var
	) {
		this.otpfirma=var; 
	}
	
	public String getOtpfirma() {
		return this.otpfirma; 
	}
	
	public void setFirmabio(
		Object var
	) {
		this.firmabio=var; 
	}
	
	public Object getFirmabio() {
		return this.firmabio; 
	}
	
	public void setFechafirma(
		Timestamp var
	) {
		this.fechafirma=var; 
	}
	
	public Timestamp getFechafirma() {
		return this.fechafirma; 
	}
	
	public void setIdxcrtrfirmascto(
		Long var
	) {
		this.idxcrtrfirmascto=var; 
	}
	
	public Long getIdxcrtrfirmascto() {
		return this.idxcrtrfirmascto; 
	}
	
	public void setCouseralta(
		String var
	) {
		this.couseralta=var; 
	}
	
	public String getCouseralta() {
		return this.couseralta; 
	}
	
	public void setTmalta(
		Timestamp var
	) {
		this.tmalta=var; 
	}
	
	public Timestamp getTmalta() {
		return this.tmalta; 
	}
	
	public void setCousermodif(
		String var
	) {
		this.cousermodif=var; 
	}
	
	public String getCousermodif() {
		return this.cousermodif; 
	}
	
	public void setTmmodif(
		Timestamp var
	) {
		this.tmmodif=var; 
	}
	
	public Timestamp getTmmodif() {
		return this.tmmodif; 
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
	
	public void setIdusuariofirma(
		Ssousuario var
	) {
		this.idusuariofirma=var; 
	}
	
	public Ssousuario getIdusuariofirma() {
		if(this.idusuariofirma==null)this.idusuariofirma=new org.suinsit.apps.admin.Ssousuario();
		  return this.idusuariofirma; 
	} 

}