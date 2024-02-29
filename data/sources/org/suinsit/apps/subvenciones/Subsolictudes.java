package org.suinsit.apps.subvenciones;

import java.io.Serializable;
import java.lang.Long;
import java.lang.String;
import java.math.BigDecimal;
import java.sql.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import org.enartframework.nocode.annotacion.Entidad;
import org.enartframework.nocode.annotacion.Sequence;
import org.suinsit.apps.admin.Ssousuario;
import org.suinsit.apps.crm.Crmempresa;
import org.suinsit.apps.partners.Partner;
import org.suinsit.apps.subvenciones.Submestado;
import org.suinsit.apps.subvenciones.Subsubvencion;

@Entity
@Table (
	name = "SUBSOLICTUDES" 
)
@Entidad (
	type = "TABLE",
	pk = "idxsubsolictudes" 
)
public class Subsolictudes implements Serializable { 

	private static final long serialVersionUID = 1L;
	@Column (
		name = "SUBVENCION",
		nullable = true 
	)
	private String subvencion;
	@Column (
		name = "ALTA",
		nullable = false 
	)
	private Date alta;
	@Column (
		name = "CLIENTE",
		nullable = true 
	)
	private String cliente;
	@Column (
		name = "CODSOLICITUD",
		nullable = true 
	)
	@Sequence (
		name = "SUBSOLICTUDES_CODSOLICITUD",
		prefix = "",
		mask = "00000",
		addYear = true 
	)
	private String codsolicitud;
	@Column (
		name = "COMITERCERO",
		nullable = true 
	)
	private BigDecimal comitercero;
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
		name = "FECHARESOLUCION",
		nullable = true 
	)
	private Date fecharesolucion;
	@Column (
		name = "FECHASOLICITUD",
		nullable = false 
	)
	private Date fechasolicitud;
	@Id
	@Column (
		name = "IDXSUBSOLICTUDES",
		nullable = true 
	)
	private Long idxsubsolictudes;
	@Column (
		name = "IMPORTECONSEDIDO",
		nullable = true 
	)
	private BigDecimal importeconsedido;
	@Column (
		name = "IMPORTEFIJO",
		nullable = true 
	)
	private BigDecimal importefijo;
	@Column (
		name = "IMPORTESOLICTADO",
		nullable = true 
	)
	private BigDecimal importesolictado;
	@Column (
		name = "PERCENTDIRECT",
		nullable = true 
	)
	private BigDecimal percentdirect;
	@Column (
		name = "PERCENTEXITO",
		nullable = true 
	)
	private BigDecimal percentexito;
	@Column (
		name = "REFERENCIA",
		nullable = true 
	)
	private String referencia;
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
		name = "IDSUBSUBVENCION0",
		referencedColumnName = "IDXSUBSUBVENCION",
		nullable = true,
		insertable = true,
		updatable = true 
	)
	private Subsubvencion idsubsubvencion;
	@ManyToOne (
		fetch = javax.persistence.FetchType.LAZY 
	)
	@JoinColumn (
		name = "IDSUBMESTADO0",
		referencedColumnName = "IDXSUBMESTADO",
		nullable = true,
		insertable = true,
		updatable = true 
	)
	private Submestado idsubmestado;
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
		name = "IDPARTNER0",
		referencedColumnName = "IDXPARTNER",
		nullable = true,
		insertable = true,
		updatable = true 
	)
	private Partner idpartner; 

	public void setSubvencion(
		String var
	) {
		this.subvencion=var; 
	}
	
	public String getSubvencion() {
		return this.subvencion; 
	}
	
	public void setAlta(
		Date var
	) {
		this.alta=var; 
	}
	
	public Date getAlta() {
		return this.alta; 
	}
	
	public void setCliente(
		String var
	) {
		this.cliente=var; 
	}
	
	public String getCliente() {
		return this.cliente; 
	}
	
	public void setCodsolicitud(
		String var
	) {
		this.codsolicitud=var; 
	}
	
	public String getCodsolicitud() {
		return this.codsolicitud; 
	}
	
	public void setComitercero(
		BigDecimal var
	) {
		this.comitercero=var; 
	}
	
	public BigDecimal getComitercero() {
		return this.comitercero; 
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
	
	public void setFecharesolucion(
		Date var
	) {
		this.fecharesolucion=var; 
	}
	
	public Date getFecharesolucion() {
		return this.fecharesolucion; 
	}
	
	public void setFechasolicitud(
		Date var
	) {
		this.fechasolicitud=var; 
	}
	
	public Date getFechasolicitud() {
		return this.fechasolicitud; 
	}
	
	public void setIdxsubsolictudes(
		Long var
	) {
		this.idxsubsolictudes=var; 
	}
	
	public Long getIdxsubsolictudes() {
		return this.idxsubsolictudes; 
	}
	
	public void setImporteconsedido(
		BigDecimal var
	) {
		this.importeconsedido=var; 
	}
	
	public BigDecimal getImporteconsedido() {
		return this.importeconsedido; 
	}
	
	public void setImportefijo(
		BigDecimal var
	) {
		this.importefijo=var; 
	}
	
	public BigDecimal getImportefijo() {
		return this.importefijo; 
	}
	
	public void setImportesolictado(
		BigDecimal var
	) {
		this.importesolictado=var; 
	}
	
	public BigDecimal getImportesolictado() {
		return this.importesolictado; 
	}
	
	public void setPercentdirect(
		BigDecimal var
	) {
		this.percentdirect=var; 
	}
	
	public BigDecimal getPercentdirect() {
		return this.percentdirect; 
	}
	
	public void setPercentexito(
		BigDecimal var
	) {
		this.percentexito=var; 
	}
	
	public BigDecimal getPercentexito() {
		return this.percentexito; 
	}
	
	public void setReferencia(
		String var
	) {
		this.referencia=var; 
	}
	
	public String getReferencia() {
		return this.referencia; 
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
	
	public void setIdsubsubvencion(
		Subsubvencion var
	) {
		this.idsubsubvencion=var; 
	}
	
	public Subsubvencion getIdsubsubvencion() {
		if(this.idsubsubvencion==null)this.idsubsubvencion=new org.suinsit.apps.subvenciones.Subsubvencion();
		  return this.idsubsubvencion; 
	}
	
	public void setIdsubmestado(
		Submestado var
	) {
		this.idsubmestado=var; 
	}
	
	public Submestado getIdsubmestado() {
		if(this.idsubmestado==null)this.idsubmestado=new org.suinsit.apps.subvenciones.Submestado();
		  return this.idsubmestado; 
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
	
	public void setIdpartner(
		Partner var
	) {
		this.idpartner=var; 
	}
	
	public Partner getIdpartner() {
		if(this.idpartner==null)this.idpartner=new org.suinsit.apps.partners.Partner();
		  return this.idpartner; 
	} 

}