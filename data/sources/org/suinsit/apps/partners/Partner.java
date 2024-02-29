package org.suinsit.apps.partners;

import java.io.Serializable;
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
import org.enartframework.nocode.annotacion.Entidad;
import org.enartframework.nocode.annotacion.Sequence;
import org.suinsit.apps.crm.Crmempresa;
import org.suinsit.apps.facturacin.Erpcomercial;
import org.suinsit.apps.partners.Nivel;
import org.suinsit.apps.partners.Tipopartner;

@Entity
@Table (
	name = "PARTNER" 
)
@Entidad (
	type = "TABLE",
	pk = "idxpartner" 
)
public class Partner implements Serializable { 

	private static final long serialVersionUID = 1L;
	@Column (
		name = "ALTA",
		nullable = false 
	)
	private Date alta;
	@Column (
		name = "CODIGO",
		nullable = true 
	)
	@Sequence (
		name = "PARTNER_CODIGO",
		prefix = "",
		mask = "00000",
		addYear = true 
	)
	private String codigo;
	@Column (
		name = "CONTRATO",
		nullable = true 
	)
	private Date contrato;
	@Column (
		name = "CORREO",
		nullable = true 
	)
	private String correo;
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
		name = "IDXPARTNER",
		nullable = true 
	)
	private Long idxpartner;
	@Column (
		name = "PARTNER",
		nullable = true 
	)
	private String partner;
	@Column (
		name = "PRECENT",
		nullable = true 
	)
	private BigDecimal precent;
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
	@Column (
		name = "URLWEB",
		nullable = true 
	)
	private String urlweb;
	private boolean updatable;
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
		name = "IDNIVEL0",
		referencedColumnName = "IDXNIVEL",
		nullable = true,
		insertable = true,
		updatable = true 
	)
	private Nivel idnivel;
	@ManyToOne (
		fetch = javax.persistence.FetchType.LAZY 
	)
	@JoinColumn (
		name = "IDTIPOPARTNER0",
		referencedColumnName = "IDXTIPOPARTNER",
		nullable = true,
		insertable = true,
		updatable = true 
	)
	private Tipopartner idtipopartner; 

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
	
	public void setContrato(
		Date var
	) {
		this.contrato=var; 
	}
	
	public Date getContrato() {
		return this.contrato; 
	}
	
	public void setCorreo(
		String var
	) {
		this.correo=var; 
	}
	
	public String getCorreo() {
		return this.correo; 
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
	
	public void setIdxpartner(
		Long var
	) {
		this.idxpartner=var; 
	}
	
	public Long getIdxpartner() {
		return this.idxpartner; 
	}
	
	public void setPartner(
		String var
	) {
		this.partner=var; 
	}
	
	public String getPartner() {
		return this.partner; 
	}
	
	public void setPrecent(
		BigDecimal var
	) {
		this.precent=var; 
	}
	
	public BigDecimal getPrecent() {
		return this.precent; 
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
	
	public void setUrlweb(
		String var
	) {
		this.urlweb=var; 
	}
	
	public String getUrlweb() {
		return this.urlweb; 
	}
	
	public void setUpdatable(
		boolean var
	) {
		this.updatable=var; 
	}
	
	public boolean isUpdatable() {
		return this.updatable; 
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
	
	public void setIderpcomercial(
		Erpcomercial var
	) {
		this.iderpcomercial=var; 
	}
	
	public Erpcomercial getIderpcomercial() {
		if(this.iderpcomercial==null)this.iderpcomercial=new org.suinsit.apps.facturacin.Erpcomercial();
		  return this.iderpcomercial; 
	}
	
	public void setIdnivel(
		Nivel var
	) {
		this.idnivel=var; 
	}
	
	public Nivel getIdnivel() {
		if(this.idnivel==null)this.idnivel=new org.suinsit.apps.partners.Nivel();
		  return this.idnivel; 
	}
	
	public void setIdtipopartner(
		Tipopartner var
	) {
		this.idtipopartner=var; 
	}
	
	public Tipopartner getIdtipopartner() {
		if(this.idtipopartner==null)this.idtipopartner=new org.suinsit.apps.partners.Tipopartner();
		  return this.idtipopartner; 
	} 

}