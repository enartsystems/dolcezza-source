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
import org.suinsit.apps.admin.Mmotivollamada;
import org.suinsit.apps.admin.Ssousuario;
import org.suinsit.apps.crm.Crmcontacto;
import org.suinsit.apps.crm.Crmempresa;
import org.suinsit.apps.crm.Crmoportunidad;
import org.suinsit.apps.crm.Crmtarea;

@Entity
@Table (
	name = "CRMLLAMADA" 
)
@Entidad (
	type = "TABLE",
	pk = "idxcrmllamada" 
)
public class Crmllamada implements Serializable { 

	private static final long serialVersionUID = 1L;
	@Column (
		name = "COMENTARIOS",
		nullable = true 
	)
	private String comentarios;
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
		name = "IDXCRMLLAMADA",
		nullable = true 
	)
	private Long idxcrmllamada;
	@Column (
		name = "REALIZADA",
		nullable = false 
	)
	private Timestamp realizada;
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
	private boolean updatable;
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
		name = "IDMMOTIVOLLAMADA0",
		referencedColumnName = "IDXMMOTIVOLLAMADA",
		nullable = true,
		insertable = true,
		updatable = true 
	)
	private Mmotivollamada idmmotivollamada;
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
		name = "IDCRMTAREA0",
		referencedColumnName = "IDXCRMTAREA",
		nullable = true,
		insertable = true,
		updatable = true 
	)
	private Crmtarea idcrmtarea; 

	public void setComentarios(
		String var
	) {
		this.comentarios=var; 
	}
	
	public String getComentarios() {
		return this.comentarios; 
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
	
	public void setIdxcrmllamada(
		Long var
	) {
		this.idxcrmllamada=var; 
	}
	
	public Long getIdxcrmllamada() {
		return this.idxcrmllamada; 
	}
	
	public void setRealizada(
		Timestamp var
	) {
		this.realizada=var; 
	}
	
	public Timestamp getRealizada() {
		return this.realizada; 
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
	
	public void setUpdatable(
		boolean var
	) {
		this.updatable=var; 
	}
	
	public boolean isUpdatable() {
		return this.updatable; 
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
	
	public void setIdcrmempresa(
		Crmempresa var
	) {
		this.idcrmempresa=var; 
	}
	
	public Crmempresa getIdcrmempresa() {
		if(this.idcrmempresa==null)this.idcrmempresa=new org.suinsit.apps.crm.Crmempresa();
		  return this.idcrmempresa; 
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
	
	public void setIdmmotivollamada(
		Mmotivollamada var
	) {
		this.idmmotivollamada=var; 
	}
	
	public Mmotivollamada getIdmmotivollamada() {
		if(this.idmmotivollamada==null)this.idmmotivollamada=new org.suinsit.apps.admin.Mmotivollamada();
		  return this.idmmotivollamada; 
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