package org.suinsit.apps.pmo;

import java.io.Serializable;
import java.lang.Long;
import java.lang.String;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import org.enartframework.nocode.annotacion.Entidad;
import org.suinsit.apps.pmo.Pmoestries;
import org.suinsit.apps.pmo.Pmoimpacto;
import org.suinsit.apps.pmo.Pmomproba;
import org.suinsit.apps.pmo.Pmomproject;
import org.suinsit.apps.pmo.Pmotipriesgo;
import org.suinsit.apps.pmo.Pmousuario;

@Entity
@Table (
	name = "PMORIESGO" 
)
@Entidad (
	type = "TABLE",
	pk = "idxpmoriesgo" 
)
public class Pmoriesgo implements Serializable { 

	private static final long serialVersionUID = 1L;
	@Column (
		name = "DESCRIPCION",
		nullable = true 
	)
	private String descripcion;
	@Id
	@Column (
		name = "IDXPMORIESGO",
		nullable = true 
	)
	private Long idxpmoriesgo;
	@Column (
		name = "RIESGO",
		nullable = true 
	)
	private String riesgo;
	private boolean updatable;
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
		name = "IDGESTOR0",
		referencedColumnName = "IDXPMOUSUARIO",
		nullable = true,
		insertable = true,
		updatable = true 
	)
	private Pmousuario idgestor;
	@ManyToOne (
		fetch = javax.persistence.FetchType.LAZY 
	)
	@JoinColumn (
		name = "IDPMOESTRIES0",
		referencedColumnName = "IDXPMOESTRIES",
		nullable = true,
		insertable = true,
		updatable = true 
	)
	private Pmoestries idpmoestries;
	@ManyToOne (
		fetch = javax.persistence.FetchType.LAZY 
	)
	@JoinColumn (
		name = "IDPMOTIPRIESGO0",
		referencedColumnName = "IDXPMOTIPRIESGO",
		nullable = true,
		insertable = true,
		updatable = true 
	)
	private Pmotipriesgo idpmotipriesgo;
	@ManyToOne (
		fetch = javax.persistence.FetchType.LAZY 
	)
	@JoinColumn (
		name = "IDPMOIMPACTO0",
		referencedColumnName = "IDXPMOIMPACTO",
		nullable = true,
		insertable = true,
		updatable = true 
	)
	private Pmoimpacto idpmoimpacto;
	@ManyToOne (
		fetch = javax.persistence.FetchType.LAZY 
	)
	@JoinColumn (
		name = "IDPMOMPROBA0",
		referencedColumnName = "IDXPMOMPROBA",
		nullable = true,
		insertable = true,
		updatable = true 
	)
	private Pmomproba idpmomproba; 

	public void setDescripcion(
		String var
	) {
		this.descripcion=var; 
	}
	
	public String getDescripcion() {
		return this.descripcion; 
	}
	
	public void setIdxpmoriesgo(
		Long var
	) {
		this.idxpmoriesgo=var; 
	}
	
	public Long getIdxpmoriesgo() {
		return this.idxpmoriesgo; 
	}
	
	public void setRiesgo(
		String var
	) {
		this.riesgo=var; 
	}
	
	public String getRiesgo() {
		return this.riesgo; 
	}
	
	public void setUpdatable(
		boolean var
	) {
		this.updatable=var; 
	}
	
	public boolean isUpdatable() {
		return this.updatable; 
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
	
	public void setIdgestor(
		Pmousuario var
	) {
		this.idgestor=var; 
	}
	
	public Pmousuario getIdgestor() {
		if(this.idgestor==null)this.idgestor=new org.suinsit.apps.pmo.Pmousuario();
		  return this.idgestor; 
	}
	
	public void setIdpmoestries(
		Pmoestries var
	) {
		this.idpmoestries=var; 
	}
	
	public Pmoestries getIdpmoestries() {
		if(this.idpmoestries==null)this.idpmoestries=new org.suinsit.apps.pmo.Pmoestries();
		  return this.idpmoestries; 
	}
	
	public void setIdpmotipriesgo(
		Pmotipriesgo var
	) {
		this.idpmotipriesgo=var; 
	}
	
	public Pmotipriesgo getIdpmotipriesgo() {
		if(this.idpmotipriesgo==null)this.idpmotipriesgo=new org.suinsit.apps.pmo.Pmotipriesgo();
		  return this.idpmotipriesgo; 
	}
	
	public void setIdpmoimpacto(
		Pmoimpacto var
	) {
		this.idpmoimpacto=var; 
	}
	
	public Pmoimpacto getIdpmoimpacto() {
		if(this.idpmoimpacto==null)this.idpmoimpacto=new org.suinsit.apps.pmo.Pmoimpacto();
		  return this.idpmoimpacto; 
	}
	
	public void setIdpmomproba(
		Pmomproba var
	) {
		this.idpmomproba=var; 
	}
	
	public Pmomproba getIdpmomproba() {
		if(this.idpmomproba==null)this.idpmomproba=new org.suinsit.apps.pmo.Pmomproba();
		  return this.idpmomproba; 
	} 

}