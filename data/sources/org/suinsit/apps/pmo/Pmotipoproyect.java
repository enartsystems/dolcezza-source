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
import org.suinsit.apps.pmo.Pmoaprobacion;
import org.suinsit.apps.pmo.Pmodepartament;
import org.suinsit.apps.pmo.Pmoestado;
import org.suinsit.apps.pmo.Pmoprioridad;
import org.suinsit.apps.pmo.Pmotipoproyect;

@Entity
@Table (
	name = "PMOTIPOPROYECT" 
)
@Entidad (
	type = "TABLE",
	pk = "idxpmotipoproyect" 
)
public class Pmotipoproyect implements Serializable { 

	private static final long serialVersionUID = 1L;
	@Id
	@Column (
		name = "IDXPMOTIPOPROYECT",
		nullable = true 
	)
	private Long idxpmotipoproyect;
	@Column (
		name = "TIPO",
		nullable = true 
	)
	private String tipo;
	@Column (
		name = "COUSERALTA",
		nullable = true 
	)
	private String couseralta;
	@Column (
		name = "TMALTA",
		nullable = true 
	)
	private String tmalta;
	@Column (
		name = "COUSERMODIF",
		nullable = true 
	)
	private String cousermodif;
	@Column (
		name = "TMMODIF",
		nullable = true 
	)
	private String tmmodif;
	private boolean updatable;
	@ManyToOne (
		fetch = javax.persistence.FetchType.LAZY 
	)
	@JoinColumn (
		name = "IDPMOAPROBACION0",
		referencedColumnName = "IDXPMOAPROBACION",
		nullable = true,
		insertable = true,
		updatable = true 
	)
	private Pmoaprobacion idpmoaprobacion;
	@ManyToOne (
		fetch = javax.persistence.FetchType.LAZY 
	)
	@JoinColumn (
		name = "IDPMODEPARTAMENT0",
		referencedColumnName = "IDXPMODEPARTAMENT",
		nullable = true,
		insertable = true,
		updatable = true 
	)
	private Pmodepartament idpmodepartament;
	@ManyToOne (
		fetch = javax.persistence.FetchType.LAZY 
	)
	@JoinColumn (
		name = "IDPMOESTADO0",
		referencedColumnName = "IDXPMOESTADO",
		nullable = true,
		insertable = true,
		updatable = true 
	)
	private Pmoestado idpmoestado;
	@ManyToOne (
		fetch = javax.persistence.FetchType.LAZY 
	)
	@JoinColumn (
		name = "IDPMOPRIORIDAD0",
		referencedColumnName = "IDXPMOPRIORIDAD",
		nullable = true,
		insertable = true,
		updatable = true 
	)
	private Pmoprioridad idpmoprioridad;
	@ManyToOne (
		fetch = javax.persistence.FetchType.LAZY 
	)
	@JoinColumn (
		name = "IDPMOTIPOPROYECT0",
		referencedColumnName = "IDXPMOTIPOPROYECT",
		nullable = true,
		insertable = true,
		updatable = true 
	)
	private Pmotipoproyect idpmotipoproyect; 

	public void setIdxpmotipoproyect(
		Long var
	) {
		this.idxpmotipoproyect=var; 
	}
	
	public Long getIdxpmotipoproyect() {
		return this.idxpmotipoproyect; 
	}
	
	public void setTipo(
		String var
	) {
		this.tipo=var; 
	}
	
	public String getTipo() {
		return this.tipo; 
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
		String var
	) {
		this.tmalta=var; 
	}
	
	public String getTmalta() {
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
		String var
	) {
		this.tmmodif=var; 
	}
	
	public String getTmmodif() {
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
	
	public void setIdpmoaprobacion(
		Pmoaprobacion var
	) {
		this.idpmoaprobacion=var; 
	}
	
	public Pmoaprobacion getIdpmoaprobacion() {
		if(this.idpmoaprobacion==null)this.idpmoaprobacion=new org.suinsit.apps.pmo.Pmoaprobacion();
		  return this.idpmoaprobacion; 
	}
	
	public void setIdpmodepartament(
		Pmodepartament var
	) {
		this.idpmodepartament=var; 
	}
	
	public Pmodepartament getIdpmodepartament() {
		if(this.idpmodepartament==null)this.idpmodepartament=new org.suinsit.apps.pmo.Pmodepartament();
		  return this.idpmodepartament; 
	}
	
	public void setIdpmoestado(
		Pmoestado var
	) {
		this.idpmoestado=var; 
	}
	
	public Pmoestado getIdpmoestado() {
		if(this.idpmoestado==null)this.idpmoestado=new org.suinsit.apps.pmo.Pmoestado();
		  return this.idpmoestado; 
	}
	
	public void setIdpmoprioridad(
		Pmoprioridad var
	) {
		this.idpmoprioridad=var; 
	}
	
	public Pmoprioridad getIdpmoprioridad() {
		if(this.idpmoprioridad==null)this.idpmoprioridad=new org.suinsit.apps.pmo.Pmoprioridad();
		  return this.idpmoprioridad; 
	}
	
	public void setIdpmotipoproyect(
		Pmotipoproyect var
	) {
		this.idpmotipoproyect=var; 
	}
	
	public Pmotipoproyect getIdpmotipoproyect() {
		if(this.idpmotipoproyect==null)this.idpmotipoproyect=new org.suinsit.apps.pmo.Pmotipoproyect();
		  return this.idpmotipoproyect; 
	} 

}