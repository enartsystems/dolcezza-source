package org.suinsit.apps.facturacin;

import java.io.Serializable;
import java.lang.Long;
import java.lang.String;
import java.sql.Date;
import java.sql.Timestamp;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import org.enartframework.nocode.annotacion.Entidad;
import org.suinsit.apps.crm.Crmempresa;
import org.suinsit.apps.facturacin.Erpempresa;
import org.suinsit.apps.facturacin.Erpmabnco;

@Entity
@Table (
	name = "ERPFACTCOMPRA" 
)
@Entidad (
	type = "TABLE",
	pk = "idxerpfactcompra" 
)
public class Erpfactcompra implements Serializable { 

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
	@Column (
		name = "FACTURA",
		nullable = true 
	)
	private String factura;
	@Column (
		name = "FECHACONTA",
		nullable = true 
	)
	private Date fechaconta;
	@Column (
		name = "FECHAFACTURA",
		nullable = true 
	)
	private Date fechafactura;
	@Id
	@Column (
		name = "IDXERPFACTCOMPRA",
		nullable = true 
	)
	private Long idxerpfactcompra;
	@Column (
		name = "REFERENCIA",
		nullable = true 
	)
	private String referencia;
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
		name = "VENCIMIENTO",
		nullable = true 
	)
	private Date vencimiento;
	private boolean updatable;
	@ManyToOne (
		fetch = javax.persistence.FetchType.LAZY 
	)
	@JoinColumn (
		name = "IDERPMABNCO0",
		referencedColumnName = "IDXERPMABNCO",
		nullable = true,
		insertable = true,
		updatable = true 
	)
	private Erpmabnco iderpmabnco;
	@ManyToOne (
		fetch = javax.persistence.FetchType.LAZY 
	)
	@JoinColumn (
		name = "IDCOMPANY0",
		referencedColumnName = "IDXERPEMPRESA",
		nullable = true,
		insertable = true,
		updatable = true 
	)
	private Erpempresa idcompany;
	@ManyToOne (
		fetch = javax.persistence.FetchType.LAZY 
	)
	@JoinColumn (
		name = "IDPROVEEDOR0",
		referencedColumnName = "IDXCRMEMPRESA",
		nullable = true,
		insertable = true,
		updatable = true 
	)
	private Crmempresa idproveedor; 

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
	
	public void setFactura(
		String var
	) {
		this.factura=var; 
	}
	
	public String getFactura() {
		return this.factura; 
	}
	
	public void setFechaconta(
		Date var
	) {
		this.fechaconta=var; 
	}
	
	public Date getFechaconta() {
		return this.fechaconta; 
	}
	
	public void setFechafactura(
		Date var
	) {
		this.fechafactura=var; 
	}
	
	public Date getFechafactura() {
		return this.fechafactura; 
	}
	
	public void setIdxerpfactcompra(
		Long var
	) {
		this.idxerpfactcompra=var; 
	}
	
	public Long getIdxerpfactcompra() {
		return this.idxerpfactcompra; 
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
	
	public void setVencimiento(
		Date var
	) {
		this.vencimiento=var; 
	}
	
	public Date getVencimiento() {
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
	
	public void setIderpmabnco(
		Erpmabnco var
	) {
		this.iderpmabnco=var; 
	}
	
	public Erpmabnco getIderpmabnco() {
		if(this.iderpmabnco==null)this.iderpmabnco=new org.suinsit.apps.facturacin.Erpmabnco();
		  return this.iderpmabnco; 
	}
	
	public void setIdcompany(
		Erpempresa var
	) {
		this.idcompany=var; 
	}
	
	public Erpempresa getIdcompany() {
		if(this.idcompany==null)this.idcompany=new org.suinsit.apps.facturacin.Erpempresa();
		  return this.idcompany; 
	}
	
	public void setIdproveedor(
		Crmempresa var
	) {
		this.idproveedor=var; 
	}
	
	public Crmempresa getIdproveedor() {
		if(this.idproveedor==null)this.idproveedor=new org.suinsit.apps.crm.Crmempresa();
		  return this.idproveedor; 
	} 

}