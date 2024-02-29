package org.suinsit.apps.subvenciones;

import java.io.Serializable;
import java.lang.Integer;
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
import org.suinsit.apps.facturacin.Erpfactura;
import org.suinsit.apps.subvenciones.Agentedig;
import org.suinsit.apps.subvenciones.Catkitdigital;
import org.suinsit.apps.subvenciones.Kitdigital;

@Entity
@Table (
	name = "KITRBONOCAT" 
)
@Entidad (
	type = "TABLE",
	pk = "idxkitrbonocat" 
)
public class Kitrbonocat implements Serializable { 

	private static final long serialVersionUID = 1L;
	@Column (
		name = "UNIDADES",
		nullable = true 
	)
	private Integer unidades;
	@Column (
		name = "COMENTARIOS",
		nullable = true 
	)
	private String comentarios;
	@Column (
		name = "FECHADESA",
		nullable = true 
	)
	private Date fechadesa;
	@Column (
		name = "FECHAFIRMA",
		nullable = true 
	)
	private Date fechafirma;
	@Column (
		name = "FECHAFIRMARED",
		nullable = true 
	)
	private Date fechafirmared;
	@Column (
		name = "FECHAPROD",
		nullable = true 
	)
	private Date fechaprod;
	@Id
	@Column (
		name = "IDXKITRBONOCAT",
		nullable = true 
	)
	private Long idxkitrbonocat;
	@Column (
		name = "IMPORTE",
		nullable = true 
	)
	private BigDecimal importe;
	private boolean updatable;
	@ManyToOne (
		fetch = javax.persistence.FetchType.LAZY 
	)
	@JoinColumn (
		name = "IDKITDIGITAL0",
		referencedColumnName = "IDXKITDIGITAL",
		nullable = true,
		insertable = true,
		updatable = true 
	)
	private Kitdigital idkitdigital;
	@ManyToOne (
		fetch = javax.persistence.FetchType.LAZY 
	)
	@JoinColumn (
		name = "IDCATKITDIGITAL0",
		referencedColumnName = "IDXCATKITDIGITAL",
		nullable = true,
		insertable = true,
		updatable = true 
	)
	private Catkitdigital idcatkitdigital;
	@ManyToOne (
		fetch = javax.persistence.FetchType.LAZY 
	)
	@JoinColumn (
		name = "IDERPFACTURA0",
		referencedColumnName = "IDXERPFACTURA",
		nullable = true,
		insertable = true,
		updatable = true 
	)
	private Erpfactura iderpfactura;
	@ManyToOne (
		fetch = javax.persistence.FetchType.LAZY 
	)
	@JoinColumn (
		name = "IDAGENTEDIG0",
		referencedColumnName = "IDXAGENTEDIG",
		nullable = true,
		insertable = true,
		updatable = true 
	)
	private Agentedig idagentedig; 

	public void setUnidades(
		Integer var
	) {
		this.unidades=var; 
	}
	
	public Integer getUnidades() {
		return this.unidades; 
	}
	
	public void setComentarios(
		String var
	) {
		this.comentarios=var; 
	}
	
	public String getComentarios() {
		return this.comentarios; 
	}
	
	public void setFechadesa(
		Date var
	) {
		this.fechadesa=var; 
	}
	
	public Date getFechadesa() {
		return this.fechadesa; 
	}
	
	public void setFechafirma(
		Date var
	) {
		this.fechafirma=var; 
	}
	
	public Date getFechafirma() {
		return this.fechafirma; 
	}
	
	public void setFechafirmared(
		Date var
	) {
		this.fechafirmared=var; 
	}
	
	public Date getFechafirmared() {
		return this.fechafirmared; 
	}
	
	public void setFechaprod(
		Date var
	) {
		this.fechaprod=var; 
	}
	
	public Date getFechaprod() {
		return this.fechaprod; 
	}
	
	public void setIdxkitrbonocat(
		Long var
	) {
		this.idxkitrbonocat=var; 
	}
	
	public Long getIdxkitrbonocat() {
		return this.idxkitrbonocat; 
	}
	
	public void setImporte(
		BigDecimal var
	) {
		this.importe=var; 
	}
	
	public BigDecimal getImporte() {
		return this.importe; 
	}
	
	public void setUpdatable(
		boolean var
	) {
		this.updatable=var; 
	}
	
	public boolean isUpdatable() {
		return this.updatable; 
	}
	
	public void setIdkitdigital(
		Kitdigital var
	) {
		this.idkitdigital=var; 
	}
	
	public Kitdigital getIdkitdigital() {
		if(this.idkitdigital==null)this.idkitdigital=new org.suinsit.apps.subvenciones.Kitdigital();
		  return this.idkitdigital; 
	}
	
	public void setIdcatkitdigital(
		Catkitdigital var
	) {
		this.idcatkitdigital=var; 
	}
	
	public Catkitdigital getIdcatkitdigital() {
		if(this.idcatkitdigital==null)this.idcatkitdigital=new org.suinsit.apps.subvenciones.Catkitdigital();
		  return this.idcatkitdigital; 
	}
	
	public void setIderpfactura(
		Erpfactura var
	) {
		this.iderpfactura=var; 
	}
	
	public Erpfactura getIderpfactura() {
		if(this.iderpfactura==null)this.iderpfactura=new org.suinsit.apps.facturacin.Erpfactura();
		  return this.iderpfactura; 
	}
	
	public void setIdagentedig(
		Agentedig var
	) {
		this.idagentedig=var; 
	}
	
	public Agentedig getIdagentedig() {
		if(this.idagentedig==null)this.idagentedig=new org.suinsit.apps.subvenciones.Agentedig();
		  return this.idagentedig; 
	} 

}