package org.suinsit.apps.pmo;

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
import org.enartframework.nocode.annotacion.Sequence;
import org.suinsit.apps.pmo.Pmomestadotask;
import org.suinsit.apps.pmo.Pmomincidencia;
import org.suinsit.apps.pmo.Pmomproject;
import org.suinsit.apps.pmo.Pmomversion;
import org.suinsit.apps.pmo.Pmoriesgo;
import org.suinsit.apps.pmo.Pmorsuserproy;

@Entity
@Table (
	name = "PMOMTASK" 
)
@Entidad (
	type = "TABLE",
	pk = "idxpmomtask" 
)
public class Pmomtask implements Serializable { 

	private static final long serialVersionUID = 1L;
	@Column (
		name = "ALTA",
		nullable = true 
	)
	private Date alta;
	@Column (
		name = "CODIGO",
		nullable = false 
	)
	@Sequence (
		name = "PMOMTASK_CODIGO",
		prefix = "TSL",
		mask = "0000000000",
		addYear = false 
	)
	private String codigo;
	@Column (
		name = "FINPREV",
		nullable = true 
	)
	private Date finprev;
	@Column (
		name = "HORASPREV",
		nullable = true 
	)
	private Integer horasprev;
	@Column (
		name = "HORASREAL",
		nullable = true 
	)
	private Integer horasreal;
	@Id
	@Column (
		name = "IDXPMOMTASK",
		nullable = true 
	)
	private Long idxpmomtask;
	@Column (
		name = "INICIO",
		nullable = true 
	)
	private Date inicio;
	@Column (
		name = "RESUMEN",
		nullable = true 
	)
	private String resumen;
	@Column (
		name = "TAREA",
		nullable = false 
	)
	private String tarea;
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
		name = "IDPMOMESTADOTASK0",
		referencedColumnName = "IDXPMOMESTADOTASK",
		nullable = true,
		insertable = true,
		updatable = true 
	)
	private Pmomestadotask idpmomestadotask;
	@ManyToOne (
		fetch = javax.persistence.FetchType.LAZY 
	)
	@JoinColumn (
		name = "IDPMOMINCIDENCIA0",
		referencedColumnName = "IDXPMOMINCIDENCIA",
		nullable = true,
		insertable = true,
		updatable = true 
	)
	private Pmomincidencia idpmomincidencia;
	@ManyToOne (
		fetch = javax.persistence.FetchType.LAZY 
	)
	@JoinColumn (
		name = "IDPMOMVERSION0",
		referencedColumnName = "IDXPMOMVERSION",
		nullable = true,
		insertable = true,
		updatable = true 
	)
	private Pmomversion idpmomversion;
	@ManyToOne (
		fetch = javax.persistence.FetchType.LAZY 
	)
	@JoinColumn (
		name = "IDPMORIESGO0",
		referencedColumnName = "IDXPMORIESGO",
		nullable = true,
		insertable = true,
		updatable = true 
	)
	private Pmoriesgo idpmoriesgo;
	@ManyToOne (
		fetch = javax.persistence.FetchType.LAZY 
	)
	@JoinColumn (
		name = "IDINFORMADOR0",
		referencedColumnName = "IDXPMORSUSERPROY",
		nullable = true,
		insertable = true,
		updatable = true 
	)
	private Pmorsuserproy idinformador;
	@ManyToOne (
		fetch = javax.persistence.FetchType.LAZY 
	)
	@JoinColumn (
		name = "IDRESPONSABLE0",
		referencedColumnName = "IDXPMORSUSERPROY",
		nullable = true,
		insertable = true,
		updatable = true 
	)
	private Pmorsuserproy idresponsable; 

	public void setAlta(
		Date var
	) {
		this.alta=var; 
	}
	
	public Date getAlta() {
		return this.alta; 
	}
	
	public void setCodigo(
		String var
	) {
		this.codigo=var; 
	}
	
	public String getCodigo() {
		return this.codigo; 
	}
	
	public void setFinprev(
		Date var
	) {
		this.finprev=var; 
	}
	
	public Date getFinprev() {
		return this.finprev; 
	}
	
	public void setHorasprev(
		Integer var
	) {
		this.horasprev=var; 
	}
	
	public Integer getHorasprev() {
		return this.horasprev; 
	}
	
	public void setHorasreal(
		Integer var
	) {
		this.horasreal=var; 
	}
	
	public Integer getHorasreal() {
		return this.horasreal; 
	}
	
	public void setIdxpmomtask(
		Long var
	) {
		this.idxpmomtask=var; 
	}
	
	public Long getIdxpmomtask() {
		return this.idxpmomtask; 
	}
	
	public void setInicio(
		Date var
	) {
		this.inicio=var; 
	}
	
	public Date getInicio() {
		return this.inicio; 
	}
	
	public void setResumen(
		String var
	) {
		this.resumen=var; 
	}
	
	public String getResumen() {
		return this.resumen; 
	}
	
	public void setTarea(
		String var
	) {
		this.tarea=var; 
	}
	
	public String getTarea() {
		return this.tarea; 
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
	
	public void setIdpmomestadotask(
		Pmomestadotask var
	) {
		this.idpmomestadotask=var; 
	}
	
	public Pmomestadotask getIdpmomestadotask() {
		if(this.idpmomestadotask==null)this.idpmomestadotask=new org.suinsit.apps.pmo.Pmomestadotask();
		  return this.idpmomestadotask; 
	}
	
	public void setIdpmomincidencia(
		Pmomincidencia var
	) {
		this.idpmomincidencia=var; 
	}
	
	public Pmomincidencia getIdpmomincidencia() {
		if(this.idpmomincidencia==null)this.idpmomincidencia=new org.suinsit.apps.pmo.Pmomincidencia();
		  return this.idpmomincidencia; 
	}
	
	public void setIdpmomversion(
		Pmomversion var
	) {
		this.idpmomversion=var; 
	}
	
	public Pmomversion getIdpmomversion() {
		if(this.idpmomversion==null)this.idpmomversion=new org.suinsit.apps.pmo.Pmomversion();
		  return this.idpmomversion; 
	}
	
	public void setIdpmoriesgo(
		Pmoriesgo var
	) {
		this.idpmoriesgo=var; 
	}
	
	public Pmoriesgo getIdpmoriesgo() {
		if(this.idpmoriesgo==null)this.idpmoriesgo=new org.suinsit.apps.pmo.Pmoriesgo();
		  return this.idpmoriesgo; 
	}
	
	public void setIdinformador(
		Pmorsuserproy var
	) {
		this.idinformador=var; 
	}
	
	public Pmorsuserproy getIdinformador() {
		if(this.idinformador==null)this.idinformador=new org.suinsit.apps.pmo.Pmorsuserproy();
		  return this.idinformador; 
	}
	
	public void setIdresponsable(
		Pmorsuserproy var
	) {
		this.idresponsable=var; 
	}
	
	public Pmorsuserproy getIdresponsable() {
		if(this.idresponsable==null)this.idresponsable=new org.suinsit.apps.pmo.Pmorsuserproy();
		  return this.idresponsable; 
	} 

}