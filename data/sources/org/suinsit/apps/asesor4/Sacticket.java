package org.suinsit.apps.asesor4;

import java.io.Serializable;
import java.lang.Long;
import java.lang.String;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import org.enartframework.nocode.annotacion.Entidad;
import org.suinsit.apps.admin.Mtipoprioridad;
import org.suinsit.apps.admin.Ssousuario;
import org.suinsit.apps.crm.Crmempresa;
import org.suinsit.apps.crm.Crmoportunidad;
import org.suinsit.apps.crm.Crmroporticket;
import org.suinsit.apps.crm.Crmtarea;
import org.suinsit.apps.document.Docfichero;

@Entity
@Table (
	name = "SACTICKET" 
)
@Entidad (
	type = "TABLE",
	pk = "idxticket" 
)
public class Sacticket implements Serializable { 

	private static final long serialVersionUID = 1L;
	@Column (
		name = "ALTA",
		nullable = false 
	)
	private Date alta;
	@Column (
		name = "CIERRE",
		nullable = true 
	)
	private Date cierre;
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
	@Column (
		name = "DESCRIPCION",
		nullable = true 
	)
	private String descripcion;
	@Id
	@Column (
		name = "IDXTICKET",
		nullable = true 
	)
	private Long idxticket;
	@Column (
		name = "MODIFICACION",
		nullable = true 
	)
	private Date modificacion;
	@Column (
		name = "MOTIVOCIERRE",
		nullable = true 
	)
	private String motivocierre;
	@Column (
		name = "RECORDATORIO",
		nullable = true 
	)
	private boolean recordatorio;
	@Column (
		name = "REFERENCIA",
		nullable = false 
	)
	private String referencia;
	@Column (
		name = "TICKET",
		nullable = false 
	)
	private String ticket;
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
		name = "IDCRMTAREA0",
		referencedColumnName = "IDXCRMTAREA",
		nullable = true,
		insertable = true,
		updatable = true 
	)
	private Crmtarea idcrmtarea;
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
		name = "IDASIGNADO0",
		referencedColumnName = "IDXSSOUSUARIO",
		nullable = true,
		insertable = true,
		updatable = true 
	)
	private Ssousuario idasignado;
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
	private List<Crmroporticket> subcrmroporticket;
	private List<Docfichero> subdocfichero; 

	public void setAlta(
		Date var
	) {
		this.alta=var; 
	}
	
	public Date getAlta() {
		return this.alta; 
	}
	
	public void setCierre(
		Date var
	) {
		this.cierre=var; 
	}
	
	public Date getCierre() {
		return this.cierre; 
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
	
	public void setDescripcion(
		String var
	) {
		this.descripcion=var; 
	}
	
	public String getDescripcion() {
		return this.descripcion; 
	}
	
	public void setIdxticket(
		Long var
	) {
		this.idxticket=var; 
	}
	
	public Long getIdxticket() {
		return this.idxticket; 
	}
	
	public void setModificacion(
		Date var
	) {
		this.modificacion=var; 
	}
	
	public Date getModificacion() {
		return this.modificacion; 
	}
	
	public void setMotivocierre(
		String var
	) {
		this.motivocierre=var; 
	}
	
	public String getMotivocierre() {
		return this.motivocierre; 
	}
	
	public void setRecordatorio(
		boolean var
	) {
		this.recordatorio=var; 
	}
	
	public boolean isRecordatorio() {
		return this.recordatorio; 
	}
	
	public void setReferencia(
		String var
	) {
		this.referencia=var; 
	}
	
	public String getReferencia() {
		return this.referencia; 
	}
	
	public void setTicket(
		String var
	) {
		this.ticket=var; 
	}
	
	public String getTicket() {
		return this.ticket; 
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
	
	public void setIdcrmtarea(
		Crmtarea var
	) {
		this.idcrmtarea=var; 
	}
	
	public Crmtarea getIdcrmtarea() {
		if(this.idcrmtarea==null)this.idcrmtarea=new org.suinsit.apps.crm.Crmtarea();
		  return this.idcrmtarea; 
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
	
	public void setIdmtipoprioridad(
		Mtipoprioridad var
	) {
		this.idmtipoprioridad=var; 
	}
	
	public Mtipoprioridad getIdmtipoprioridad() {
		if(this.idmtipoprioridad==null)this.idmtipoprioridad=new org.suinsit.apps.admin.Mtipoprioridad();
		  return this.idmtipoprioridad; 
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
	
	public void setIdasignado(
		Ssousuario var
	) {
		this.idasignado=var; 
	}
	
	public Ssousuario getIdasignado() {
		if(this.idasignado==null)this.idasignado=new org.suinsit.apps.admin.Ssousuario();
		  return this.idasignado; 
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
	
	public void setSubcrmroporticket(
		List<Crmroporticket> var
	) {
		this.subcrmroporticket=var; 
	}
	
	public List<Crmroporticket> getSubcrmroporticket() {
		if(this.subcrmroporticket==null)this.subcrmroporticket=new ArrayList<>(0);
		  return this.subcrmroporticket; 
	}
	
	public void setSubdocfichero(
		List<Docfichero> var
	) {
		this.subdocfichero=var; 
	}
	
	public List<Docfichero> getSubdocfichero() {
		if(this.subdocfichero==null)this.subdocfichero=new ArrayList<>(0);
		  return this.subdocfichero; 
	} 

}