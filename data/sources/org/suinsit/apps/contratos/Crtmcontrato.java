package org.suinsit.apps.contratos;

import java.io.Serializable;
import java.lang.Long;
import java.lang.String;
import java.math.BigDecimal;
import java.sql.Timestamp;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import org.enartframework.nocode.annotacion.Entidad;
import org.enartframework.nocode.annotacion.Sequence;
import org.suinsit.apps.admin.Mperidicidad;
import org.suinsit.apps.admin.Ssousuario;
import org.suinsit.apps.contratos.Crtmtipo;
import org.suinsit.apps.crm.Crmempresa;
import org.suinsit.apps.facturacin.Erpcomercial;
import org.suinsit.apps.facturacin.Erpempresa;

@Entity
@Table (
	name = "CRTMCONTRATO" 
)
@Entidad (
	type = "TABLE",
	pk = "idxcrtmcontrato" 
)
public class Crtmcontrato implements Serializable { 

	private static final long serialVersionUID = 1L;
	@Column (
		name = "AUTOMATICA",
		nullable = true 
	)
	private boolean automatica;
	@Column (
		name = "CODCONTRATO",
		nullable = true 
	)
	@Sequence (
		name = "CRTMCONTRATO_CODCONTRATO",
		prefix = "CRT",
		mask = "00000",
		addYear = true 
	)
	private String codcontrato;
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
		name = "FECEFECTO",
		nullable = false 
	)
	private Timestamp fecefecto;
	@Column (
		name = "FECFIN",
		nullable = true 
	)
	private Timestamp fecfin;
	@Column (
		name = "FIRMARCLIENTE",
		nullable = true 
	)
	private boolean firmarcliente;
	@Id
	@Column (
		name = "IDXCRTMCONTRATO",
		nullable = true 
	)
	private Long idxcrtmcontrato;
	@Column (
		name = "IMPORTE",
		nullable = true 
	)
	private BigDecimal importe;
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
		name = "IDCUSTOMER0",
		referencedColumnName = "IDXCRMEMPRESA",
		nullable = true,
		insertable = true,
		updatable = true 
	)
	private Crmempresa idcustomer;
	@ManyToOne (
		fetch = javax.persistence.FetchType.LAZY 
	)
	@JoinColumn (
		name = "IDCRTMTIPO0",
		referencedColumnName = "IDXCRTMTIPO",
		nullable = true,
		insertable = true,
		updatable = true 
	)
	private Crtmtipo idcrtmtipo;
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
		name = "IDERPEMPRESA0",
		referencedColumnName = "IDXERPEMPRESA",
		nullable = true,
		insertable = true,
		updatable = true 
	)
	private Erpempresa iderpempresa;
	@ManyToOne (
		fetch = javax.persistence.FetchType.LAZY 
	)
	@JoinColumn (
		name = "IDERPCOMERCIAL0",
		referencedColumnName = "IDXERPCOMERCIAL",
		nullable = true,
		insertable = true,
		updatable = true 
	)
	private Erpcomercial iderpcomercial;
	@ManyToOne (
		fetch = javax.persistence.FetchType.LAZY 
	)
	@JoinColumn (
		name = "IDMPERIDICIDAD0",
		referencedColumnName = "IDXMPERIDICIDAD",
		nullable = true,
		insertable = true,
		updatable = true 
	)
	private Mperidicidad idmperidicidad; 

	public void setAutomatica(
		boolean var
	) {
		this.automatica=var; 
	}
	
	public boolean isAutomatica() {
		return this.automatica; 
	}
	
	public void setCodcontrato(
		String var
	) {
		this.codcontrato=var; 
	}
	
	public String getCodcontrato() {
		return this.codcontrato; 
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
	
	public void setFecefecto(
		Timestamp var
	) {
		this.fecefecto=var; 
	}
	
	public Timestamp getFecefecto() {
		return this.fecefecto; 
	}
	
	public void setFecfin(
		Timestamp var
	) {
		this.fecfin=var; 
	}
	
	public Timestamp getFecfin() {
		return this.fecfin; 
	}
	
	public void setFirmarcliente(
		boolean var
	) {
		this.firmarcliente=var; 
	}
	
	public boolean isFirmarcliente() {
		return this.firmarcliente; 
	}
	
	public void setIdxcrtmcontrato(
		Long var
	) {
		this.idxcrtmcontrato=var; 
	}
	
	public Long getIdxcrtmcontrato() {
		return this.idxcrtmcontrato; 
	}
	
	public void setImporte(
		BigDecimal var
	) {
		this.importe=var; 
	}
	
	public BigDecimal getImporte() {
		return this.importe; 
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
	
	public void setIdcustomer(
		Crmempresa var
	) {
		this.idcustomer=var; 
	}
	
	public Crmempresa getIdcustomer() {
		if(this.idcustomer==null)this.idcustomer=new org.suinsit.apps.crm.Crmempresa();
		  return this.idcustomer; 
	}
	
	public void setIdcrtmtipo(
		Crtmtipo var
	) {
		this.idcrtmtipo=var; 
	}
	
	public Crtmtipo getIdcrtmtipo() {
		if(this.idcrtmtipo==null)this.idcrtmtipo=new org.suinsit.apps.contratos.Crtmtipo();
		  return this.idcrtmtipo; 
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
	
	public void setIderpempresa(
		Erpempresa var
	) {
		this.iderpempresa=var; 
	}
	
	public Erpempresa getIderpempresa() {
		if(this.iderpempresa==null)this.iderpempresa=new org.suinsit.apps.facturacin.Erpempresa();
		  return this.iderpempresa; 
	}
	
	public void setIderpcomercial(
		Erpcomercial var
	) {
		this.iderpcomercial=var; 
	}
	
	public Erpcomercial getIderpcomercial() {
		if(this.iderpcomercial==null)this.iderpcomercial=new org.suinsit.apps.facturacin.Erpcomercial();
		  return this.iderpcomercial; 
	}
	
	public void setIdmperidicidad(
		Mperidicidad var
	) {
		this.idmperidicidad=var; 
	}
	
	public Mperidicidad getIdmperidicidad() {
		if(this.idmperidicidad==null)this.idmperidicidad=new org.suinsit.apps.admin.Mperidicidad();
		  return this.idmperidicidad; 
	} 

}