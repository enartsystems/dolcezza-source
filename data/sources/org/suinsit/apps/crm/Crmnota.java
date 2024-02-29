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
import org.suinsit.apps.admin.Ssousuario;
import org.suinsit.apps.crm.Crmcontacto;
import org.suinsit.apps.crm.Crmempresa;
import org.suinsit.apps.crm.Crmllamada;
import org.suinsit.apps.crm.Crmoportunidad;
import org.suinsit.apps.crm.Crmtarea;

@Entity
@Table (
	name = "CRMNOTA" 
)
@Entidad (
	type = "TABLE",
	pk = "idxcrmnota" 
)
public class Crmnota implements Serializable { 

	private static final long serialVersionUID = 1L;
	@Column (
		name = "ALTA",
		nullable = true 
	)
	private Timestamp alta;
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
		name = "IDXCRMNOTA",
		nullable = true 
	)
	private Long idxcrmnota;
	@Column (
		name = "NOTA",
		nullable = true 
	)
	private String nota;
	@Column (
		name = "PRIVADO",
		nullable = true 
	)
	private boolean privado;
	@Column (
		name = "TMALTA",
		nullable = true 
	)
	private Timestamp tmalta;
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
		name = "IDSSOUSUARIO0",
		referencedColumnName = "IDXSSOUSUARIO",
		nullable = true,
		insertable = true,
		updatable = true 
	)
	private Ssousuario idssousuario;
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
		name = "IDCRMLLAMADA0",
		referencedColumnName = "IDXCRMLLAMADA",
		nullable = true,
		insertable = true,
		updatable = true 
	)
	private Crmllamada idcrmllamada;
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
		name = "IDCRMTAREA0",
		referencedColumnName = "IDXCRMTAREA",
		nullable = true,
		insertable = true,
		updatable = true 
	)
	private Crmtarea idcrmtarea; 

	public void setAlta(
		Timestamp var
	) {
		this.alta=var; 
	}
	
	public Timestamp getAlta() {
		return this.alta; 
	}
	
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
	
	public void setIdxcrmnota(
		Long var
	) {
		this.idxcrmnota=var; 
	}
	
	public Long getIdxcrmnota() {
		return this.idxcrmnota; 
	}
	
	public void setNota(
		String var
	) {
		this.nota=var; 
	}
	
	public String getNota() {
		return this.nota; 
	}
	
	public void setPrivado(
		boolean var
	) {
		this.privado=var; 
	}
	
	public boolean isPrivado() {
		return this.privado; 
	}
	
	public void setTmalta(
		Timestamp var
	) {
		this.tmalta=var; 
	}
	
	public Timestamp getTmalta() {
		return this.tmalta; 
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
	
	public void setIdssousuario(
		Ssousuario var
	) {
		this.idssousuario=var; 
	}
	
	public Ssousuario getIdssousuario() {
		if(this.idssousuario==null)this.idssousuario=new org.suinsit.apps.admin.Ssousuario();
		  return this.idssousuario; 
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
	
	public void setIdcrmoportunidad(
		Crmoportunidad var
	) {
		this.idcrmoportunidad=var; 
	}
	
	public Crmoportunidad getIdcrmoportunidad() {
		if(this.idcrmoportunidad==null)this.idcrmoportunidad=new org.suinsit.apps.crm.Crmoportunidad();
		  return this.idcrmoportunidad; 
	}
	
	public void setIdcrmllamada(
		Crmllamada var
	) {
		this.idcrmllamada=var; 
	}
	
	public Crmllamada getIdcrmllamada() {
		if(this.idcrmllamada==null)this.idcrmllamada=new org.suinsit.apps.crm.Crmllamada();
		  return this.idcrmllamada; 
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
	
	public void setIdcrmtarea(
		Crmtarea var
	) {
		this.idcrmtarea=var; 
	}
	
	public Crmtarea getIdcrmtarea() {
		if(this.idcrmtarea==null)this.idcrmtarea=new org.suinsit.apps.crm.Crmtarea();
		  return this.idcrmtarea; 
	} 

}