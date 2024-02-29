package org.suinsit.apps.crm;

import java.io.Serializable;
import java.lang.Long;
import java.lang.String;
import java.sql.Timestamp;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import org.enartframework.nocode.annotacion.Entidad;
import org.suinsit.apps.admin.Mtipoprioridad;
import org.suinsit.apps.admin.Mtipotask;
import org.suinsit.apps.admin.Ssousuario;
import org.suinsit.apps.crm.Crmcolatask;
import org.suinsit.apps.crm.Crmcontacto;
import org.suinsit.apps.crm.Crmempresa;
import org.suinsit.apps.crm.Crmoportunidad;
import org.suinsit.apps.crm.Crmtaskperiodo;

@Entity
@Table (
	name = "CRMTAREA" 
)
@Entidad (
	type = "TABLE",
	pk = "idxcrmtarea" 
)
public class Crmtarea implements Serializable { 

	private static final long serialVersionUID = 1L;
	@Column (
		name = "COUSERALTA",
		nullable = true 
	)
	private String couseralta;
	@Column (
		name = "COUSERMODIF",
		nullable = true 
	)
	private String cousermodif;
	@Id
	@Column (
		name = "IDXCRMTAREA",
		nullable = true 
	)
	private Long idxcrmtarea;
	@Column (
		name = "NOTA",
		nullable = true 
	)
	private String nota;
	@Column (
		name = "RECORDATORIO",
		nullable = true 
	)
	private boolean recordatorio;
	@Column (
		name = "TAREA",
		nullable = false 
	)
	private String tarea;
	@Column (
		name = "TMALTA",
		nullable = true 
	)
	private String tmalta;
	@Column (
		name = "TMMODIF",
		nullable = true 
	)
	private String tmmodif;
	@Column (
		name = "VENCIMIENTO",
		nullable = false 
	)
	private Timestamp vencimiento;
	private boolean updatable;
	@ManyToOne (
		fetch = javax.persistence.FetchType.LAZY 
	)
	@JoinColumn (
		name = "IDPROPIETARIO0",
		referencedColumnName = "IDXSSOUSUARIO",
		nullable = true,
		insertable = true,
		updatable = true 
	)
	private Ssousuario idpropietario;
	@ManyToOne (
		fetch = javax.persistence.FetchType.LAZY 
	)
	@JoinColumn (
		name = "IDCRMCONTACTO0",
		referencedColumnName = "IDXCRMCONTACTO",
		nullable = true,
		insertable = true,
		updatable = true 
	)
	private Crmcontacto idcrmcontacto;
	@ManyToOne (
		fetch = javax.persistence.FetchType.LAZY 
	)
	@JoinColumn (
		name = "IDCRMOPORTUNIDAD0",
		referencedColumnName = "IDXOPORTUNIDAD",
		nullable = true,
		insertable = true,
		updatable = true 
	)
	private Crmoportunidad idcrmoportunidad;
	@ManyToOne (
		fetch = javax.persistence.FetchType.LAZY 
	)
	@JoinColumn (
		name = "IDCRMCOLATASK0",
		referencedColumnName = "IDXCRMCOLATASK",
		nullable = true,
		insertable = true,
		updatable = true 
	)
	private Crmcolatask idcrmcolatask;
	@ManyToOne (
		fetch = javax.persistence.FetchType.LAZY 
	)
	@JoinColumn (
		name = "IDCRMTASKPERIODO0",
		referencedColumnName = "IDXCRMTASKPERIODO",
		nullable = true,
		insertable = true,
		updatable = true 
	)
	private Crmtaskperiodo idcrmtaskperiodo;
	@ManyToOne (
		fetch = javax.persistence.FetchType.LAZY 
	)
	@JoinColumn (
		name = "IDMTIPOPRIORIDAD0",
		referencedColumnName = "IDXTIPOPRIORIDAD",
		nullable = true,
		insertable = true,
		updatable = true 
	)
	private Mtipoprioridad idmtipoprioridad;
	@ManyToOne (
		fetch = javax.persistence.FetchType.LAZY 
	)
	@JoinColumn (
		name = "IDMTIPOTASK0",
		referencedColumnName = "IDXTIPOTASK",
		nullable = true,
		insertable = true,
		updatable = true 
	)
	private Mtipotask idmtipotask;
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

	public void setCouseralta(
		String var
	) {
		this.couseralta=var; 
	}
	
	public String getCouseralta() {
		return this.couseralta; 
	}
	
	public void setCousermodif(
		String var
	) {
		this.cousermodif=var; 
	}
	
	public String getCousermodif() {
		return this.cousermodif; 
	}
	
	public void setIdxcrmtarea(
		Long var
	) {
		this.idxcrmtarea=var; 
	}
	
	public Long getIdxcrmtarea() {
		return this.idxcrmtarea; 
	}
	
	public void setNota(
		String var
	) {
		this.nota=var; 
	}
	
	public String getNota() {
		return this.nota; 
	}
	
	public void setRecordatorio(
		boolean var
	) {
		this.recordatorio=var; 
	}
	
	public boolean isRecordatorio() {
		return this.recordatorio; 
	}
	
	public void setTarea(
		String var
	) {
		this.tarea=var; 
	}
	
	public String getTarea() {
		return this.tarea; 
	}
	
	public void setTmalta(
		String var
	) {
		this.tmalta=var; 
	}
	
	public String getTmalta() {
		return this.tmalta; 
	}
	
	public void setTmmodif(
		String var
	) {
		this.tmmodif=var; 
	}
	
	public String getTmmodif() {
		return this.tmmodif; 
	}
	
	public void setVencimiento(
		Timestamp var
	) {
		this.vencimiento=var; 
	}
	
	public Timestamp getVencimiento() {
		return this.vencimiento; 
	}
	
	public void setUpdatable(
		boolean var
	) {
		this.updatable=var; 
	}
	
	public boolean isUpdatable() {
		return this.updatable; 
	}
	
	public void setIdpropietario(
		Ssousuario var
	) {
		this.idpropietario=var; 
	}
	
	public Ssousuario getIdpropietario() {
		if(this.idpropietario==null)this.idpropietario=new org.suinsit.apps.admin.Ssousuario();
		  return this.idpropietario; 
	}
	
	public void setIdcrmcontacto(
		Crmcontacto var
	) {
		this.idcrmcontacto=var; 
	}
	
	public Crmcontacto getIdcrmcontacto() {
		if(this.idcrmcontacto==null)this.idcrmcontacto=new org.suinsit.apps.crm.Crmcontacto();
		  return this.idcrmcontacto; 
	}
	
	public void setIdcrmoportunidad(
		Crmoportunidad var
	) {
		this.idcrmoportunidad=var; 
	}
	
	public Crmoportunidad getIdcrmoportunidad() {
		if(this.idcrmoportunidad==null)this.idcrmoportunidad=new org.suinsit.apps.crm.Crmoportunidad();
		  return this.idcrmoportunidad; 
	}
	
	public void setIdcrmcolatask(
		Crmcolatask var
	) {
		this.idcrmcolatask=var; 
	}
	
	public Crmcolatask getIdcrmcolatask() {
		if(this.idcrmcolatask==null)this.idcrmcolatask=new org.suinsit.apps.crm.Crmcolatask();
		  return this.idcrmcolatask; 
	}
	
	public void setIdcrmtaskperiodo(
		Crmtaskperiodo var
	) {
		this.idcrmtaskperiodo=var; 
	}
	
	public Crmtaskperiodo getIdcrmtaskperiodo() {
		if(this.idcrmtaskperiodo==null)this.idcrmtaskperiodo=new org.suinsit.apps.crm.Crmtaskperiodo();
		  return this.idcrmtaskperiodo; 
	}
	
	public void setIdmtipoprioridad(
		Mtipoprioridad var
	) {
		this.idmtipoprioridad=var; 
	}
	
	public Mtipoprioridad getIdmtipoprioridad() {
		if(this.idmtipoprioridad==null)this.idmtipoprioridad=new org.suinsit.apps.admin.Mtipoprioridad();
		  return this.idmtipoprioridad; 
	}
	
	public void setIdmtipotask(
		Mtipotask var
	) {
		this.idmtipotask=var; 
	}
	
	public Mtipotask getIdmtipotask() {
		if(this.idmtipotask==null)this.idmtipotask=new org.suinsit.apps.admin.Mtipotask();
		  return this.idmtipotask; 
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

}