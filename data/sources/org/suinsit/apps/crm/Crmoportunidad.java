package org.suinsit.apps.crm;

import java.io.Serializable;
import java.lang.Integer;
import java.lang.Long;
import java.lang.String;
import java.math.BigDecimal;
import java.sql.Date;
import java.sql.Timestamp;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import org.enartframework.nocode.annotacion.AutoGenerate;
import org.enartframework.nocode.annotacion.Entidad;
import org.suinsit.apps.admin.Mtipooportunidad;
import org.suinsit.apps.admin.Mtipoprioridad;
import org.suinsit.apps.admin.Ssousuario;
import org.suinsit.apps.crm.Crmempresa;
import org.suinsit.apps.crm.Crmetapa;
import org.suinsit.apps.crm.Crmpipeline;
import org.suinsit.apps.crm.Crmtiponegocio;

@Entity
@Table (
	name = "CRMOPORTUNIDAD" 
)
@Entidad (
	type = "TABLE",
	pk = "idxoportunidad" 
)
public class Crmoportunidad implements Serializable { 

	private static final long serialVersionUID = 1L;
	@Column (
		name = "ALTA",
		nullable = false 
	)
	private Date alta;
	@Column (
		name = "ARCHIVED",
		nullable = true 
	)
	private boolean archived;
	@Column (
		name = "BAJA",
		nullable = true 
	)
	private Date baja;
	@Column (
		name = "CERRADO",
		nullable = true 
	)
	private boolean cerrado;
	@Column (
		name = "CODIGOUUID",
		nullable = true 
	)
	@AutoGenerate (
		uuid = true 
	)
	private String codigouuid;
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
	@Column (
		name = "FECCIERRE",
		nullable = true 
	)
	private Date feccierre;
	@Column (
		name = "FECCIERREESTIMA",
		nullable = true 
	)
	private Date feccierreestima;
	@Column (
		name = "FECTSTART",
		nullable = true 
	)
	private Date fectstart;
	@Id
	@Column (
		name = "IDXOPORTUNIDAD",
		nullable = true 
	)
	private Long idxoportunidad;
	@Column (
		name = "IMPORTEFINAL",
		nullable = true 
	)
	private BigDecimal importefinal;
	@Column (
		name = "IMPORTEPREV",
		nullable = true 
	)
	private BigDecimal importeprev;
	@Column (
		name = "MOTIVOCIERRE",
		nullable = true 
	)
	private String motivocierre;
	@Column (
		name = "OPORTUNIDAD",
		nullable = false 
	)
	private String oportunidad;
	@Column (
		name = "POSITION",
		nullable = true 
	)
	private Integer position;
	@Column (
		name = "PROBABILIDAD",
		nullable = true 
	)
	private BigDecimal probabilidad;
	@Column (
		name = "STATUS",
		nullable = true 
	)
	private String status;
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
		name = "ULTIMOCONTACTO",
		nullable = true 
	)
	private Date ultimocontacto;
	@Column (
		name = "ULTMODIFICACION",
		nullable = true 
	)
	private Timestamp ultmodificacion;
	@Column (
		name = "USARIOMODIF",
		nullable = true 
	)
	private String usariomodif;
	private boolean updatable;
	@ManyToOne (
		fetch = javax.persistence.FetchType.LAZY 
	)
	@JoinColumn (
		name = "IDMTIPOOPORTUNIDAD0",
		referencedColumnName = "IDXTIPOOPORTUNIDAD",
		nullable = true,
		insertable = true,
		updatable = true 
	)
	private Mtipooportunidad idmtipooportunidad;
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
		name = "IDCRMETAPA0",
		referencedColumnName = "IDXCRMETAPA",
		nullable = false,
		insertable = true,
		updatable = true 
	)
	private Crmetapa idcrmetapa;
	@ManyToOne (
		fetch = javax.persistence.FetchType.LAZY 
	)
	@JoinColumn (
		name = "IDCRMPIPELINE0",
		referencedColumnName = "IDXCRMPIPELINE",
		nullable = false,
		insertable = true,
		updatable = true 
	)
	private Crmpipeline idcrmpipeline;
	@ManyToOne (
		fetch = javax.persistence.FetchType.LAZY 
	)
	@JoinColumn (
		name = "IDCRMTIPONEGOCIO0",
		referencedColumnName = "IDXCRMTIPONEGOCIO",
		nullable = true,
		insertable = true,
		updatable = true 
	)
	private Crmtiponegocio idcrmtiponegocio;
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

	public void setAlta(
		Date var
	) {
		this.alta=var; 
	}
	
	public Date getAlta() {
		return this.alta; 
	}
	
	public void setArchived(
		boolean var
	) {
		this.archived=var; 
	}
	
	public boolean isArchived() {
		return this.archived; 
	}
	
	public void setBaja(
		Date var
	) {
		this.baja=var; 
	}
	
	public Date getBaja() {
		return this.baja; 
	}
	
	public void setCerrado(
		boolean var
	) {
		this.cerrado=var; 
	}
	
	public boolean isCerrado() {
		return this.cerrado; 
	}
	
	public void setCodigouuid(
		String var
	) {
		this.codigouuid=var; 
	}
	
	public String getCodigouuid() {
		return this.codigouuid; 
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
	
	public void setFeccierre(
		Date var
	) {
		this.feccierre=var; 
	}
	
	public Date getFeccierre() {
		return this.feccierre; 
	}
	
	public void setFeccierreestima(
		Date var
	) {
		this.feccierreestima=var; 
	}
	
	public Date getFeccierreestima() {
		return this.feccierreestima; 
	}
	
	public void setFectstart(
		Date var
	) {
		this.fectstart=var; 
	}
	
	public Date getFectstart() {
		return this.fectstart; 
	}
	
	public void setIdxoportunidad(
		Long var
	) {
		this.idxoportunidad=var; 
	}
	
	public Long getIdxoportunidad() {
		return this.idxoportunidad; 
	}
	
	public void setImportefinal(
		BigDecimal var
	) {
		this.importefinal=var; 
	}
	
	public BigDecimal getImportefinal() {
		return this.importefinal; 
	}
	
	public void setImporteprev(
		BigDecimal var
	) {
		this.importeprev=var; 
	}
	
	public BigDecimal getImporteprev() {
		return this.importeprev; 
	}
	
	public void setMotivocierre(
		String var
	) {
		this.motivocierre=var; 
	}
	
	public String getMotivocierre() {
		return this.motivocierre; 
	}
	
	public void setOportunidad(
		String var
	) {
		this.oportunidad=var; 
	}
	
	public String getOportunidad() {
		return this.oportunidad; 
	}
	
	public void setPosition(
		Integer var
	) {
		this.position=var; 
	}
	
	public Integer getPosition() {
		return this.position; 
	}
	
	public void setProbabilidad(
		BigDecimal var
	) {
		this.probabilidad=var; 
	}
	
	public BigDecimal getProbabilidad() {
		return this.probabilidad; 
	}
	
	public void setStatus(
		String var
	) {
		this.status=var; 
	}
	
	public String getStatus() {
		return this.status; 
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
	
	public void setUltimocontacto(
		Date var
	) {
		this.ultimocontacto=var; 
	}
	
	public Date getUltimocontacto() {
		return this.ultimocontacto; 
	}
	
	public void setUltmodificacion(
		Timestamp var
	) {
		this.ultmodificacion=var; 
	}
	
	public Timestamp getUltmodificacion() {
		return this.ultmodificacion; 
	}
	
	public void setUsariomodif(
		String var
	) {
		this.usariomodif=var; 
	}
	
	public String getUsariomodif() {
		return this.usariomodif; 
	}
	
	public void setUpdatable(
		boolean var
	) {
		this.updatable=var; 
	}
	
	public boolean isUpdatable() {
		return this.updatable; 
	}
	
	public void setIdmtipooportunidad(
		Mtipooportunidad var
	) {
		this.idmtipooportunidad=var; 
	}
	
	public Mtipooportunidad getIdmtipooportunidad() {
		if(this.idmtipooportunidad==null)this.idmtipooportunidad=new org.suinsit.apps.admin.Mtipooportunidad();
		  return this.idmtipooportunidad; 
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
	
	public void setIdpropietario(
		Ssousuario var
	) {
		this.idpropietario=var; 
	}
	
	public Ssousuario getIdpropietario() {
		if(this.idpropietario==null)this.idpropietario=new org.suinsit.apps.admin.Ssousuario();
		  return this.idpropietario; 
	}
	
	public void setIdcrmetapa(
		Crmetapa var
	) {
		this.idcrmetapa=var; 
	}
	
	public Crmetapa getIdcrmetapa() {
		if(this.idcrmetapa==null)this.idcrmetapa=new org.suinsit.apps.crm.Crmetapa();
		  return this.idcrmetapa; 
	}
	
	public void setIdcrmpipeline(
		Crmpipeline var
	) {
		this.idcrmpipeline=var; 
	}
	
	public Crmpipeline getIdcrmpipeline() {
		if(this.idcrmpipeline==null)this.idcrmpipeline=new org.suinsit.apps.crm.Crmpipeline();
		  return this.idcrmpipeline; 
	}
	
	public void setIdcrmtiponegocio(
		Crmtiponegocio var
	) {
		this.idcrmtiponegocio=var; 
	}
	
	public Crmtiponegocio getIdcrmtiponegocio() {
		if(this.idcrmtiponegocio==null)this.idcrmtiponegocio=new org.suinsit.apps.crm.Crmtiponegocio();
		  return this.idcrmtiponegocio; 
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