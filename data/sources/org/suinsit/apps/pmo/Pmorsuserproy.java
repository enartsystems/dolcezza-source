package org.suinsit.apps.pmo;

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
import org.suinsit.apps.pmo.Pmomperfil;
import org.suinsit.apps.pmo.Pmomproject;
import org.suinsit.apps.pmo.Pmousuario;

@Entity
@Table (
	name = "PMORSUSERPROY" 
)
@Entidad (
	type = "TABLE",
	pk = "idxpmorsuserproy" 
)
public class Pmorsuserproy implements Serializable { 

	private static final long serialVersionUID = 1L;
	@Column (
		name = "ALTA",
		nullable = true 
	)
	private Date alta;
	@Column (
		name = "BAJA",
		nullable = true 
	)
	private Date baja;
	@Id
	@Column (
		name = "IDXPMORSUSERPROY",
		nullable = true 
	)
	private Long idxpmorsuserproy;
	private boolean updatable;
	@ManyToOne (
		fetch = javax.persistence.FetchType.LAZY 
	)
	@JoinColumn (
		name = "IDPMOUSUARIO0",
		referencedColumnName = "IDXPMOUSUARIO",
		nullable = true,
		insertable = true,
		updatable = true 
	)
	private Pmousuario idpmousuario;
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

	public void setAlta(
		Date var
	) {
		this.alta=var; 
	}
	
	public Date getAlta() {
		return this.alta; 
	}
	
	public void setBaja(
		Date var
	) {
		this.baja=var; 
	}
	
	public Date getBaja() {
		return this.baja; 
	}
	
	public void setIdxpmorsuserproy(
		Long var
	) {
		this.idxpmorsuserproy=var; 
	}
	
	public Long getIdxpmorsuserproy() {
		return this.idxpmorsuserproy; 
	}
	
	public void setUpdatable(
		boolean var
	) {
		this.updatable=var; 
	}
	
	public boolean isUpdatable() {
		return this.updatable; 
	}
	
	public void setIdpmousuario(
		Pmousuario var
	) {
		this.idpmousuario=var; 
	}
	
	public Pmousuario getIdpmousuario() {
		if(this.idpmousuario==null)this.idpmousuario=new org.suinsit.apps.pmo.Pmousuario();
		  return this.idpmousuario; 
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
	
	public void setIdpmomperfil(
		Pmomperfil var
	) {
		this.idpmomperfil=var; 
	}
	
	public Pmomperfil getIdpmomperfil() {
		if(this.idpmomperfil==null)this.idpmomperfil=new org.suinsit.apps.pmo.Pmomperfil();
		  return this.idpmomperfil; 
	} 

}