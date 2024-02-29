package org.suinsit.apps.fiscal;

import java.io.Serializable;
import java.lang.Long;
import java.lang.Object;
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
import org.suinsit.apps.crm.Crmempresa;
import org.suinsit.apps.fiscal.Fismfpago;
import org.suinsit.apps.fiscal.Fismtipogto;

@Entity
@Table (
	name = "FISMGASTOS" 
)
@Entidad (
	type = "TABLE",
	pk = "idxfismgastos" 
)
public class Fismgastos implements Serializable { 

	private static final long serialVersionUID = 1L;
	@Column (
		name = "TICKET",
		nullable = true 
	)
	private boolean ticket;
	@Column (
		name = "CIFPROVEEDOR",
		nullable = true 
	)
	private String cifproveedor;
	@Column (
		name = "DOCUMENTO",
		nullable = true 
	)
	private Object documento;
	@Column (
		name = "FACTURA",
		nullable = true 
	)
	private String factura;
	@Column (
		name = "FECHAFACT",
		nullable = true 
	)
	private Date fechafact;
	@Id
	@Column (
		name = "IDXFISMGASTOS",
		nullable = true 
	)
	private Long idxfismgastos;
	@Column (
		name = "IMPORTEIVA",
		nullable = true 
	)
	private BigDecimal importeiva;
	@Column (
		name = "IMPRECARGO",
		nullable = true 
	)
	private BigDecimal imprecargo;
	@Column (
		name = "IMPRETENCION",
		nullable = true 
	)
	private BigDecimal impretencion;
	@Column (
		name = "PERCENTIVA",
		nullable = true 
	)
	private BigDecimal percentiva;
	@Column (
		name = "PROVEEDOR",
		nullable = true 
	)
	private String proveedor;
	@Column (
		name = "RECEQUIV",
		nullable = true 
	)
	private BigDecimal recequiv;
	@Column (
		name = "RETENCION",
		nullable = true 
	)
	private BigDecimal retencion;
	@Column (
		name = "SUBTOTAL",
		nullable = true 
	)
	private BigDecimal subtotal;
	@Column (
		name = "TOTAL",
		nullable = true 
	)
	private BigDecimal total;
	@Column (
		name = "TRIMESTRE",
		nullable = false 
	)
	private String trimestre;
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
		name = "IDFISMTIPOGTO0",
		referencedColumnName = "IDXFISMTIPOGTO",
		nullable = true,
		insertable = true,
		updatable = true 
	)
	private Fismtipogto idfismtipogto;
	@ManyToOne (
		fetch = javax.persistence.FetchType.LAZY 
	)
	@JoinColumn (
		name = "IDFISMFPAGO0",
		referencedColumnName = "IDXFISMFPAGO",
		nullable = true,
		insertable = true,
		updatable = true 
	)
	private Fismfpago idfismfpago; 

	public void setTicket(
		boolean var
	) {
		this.ticket=var; 
	}
	
	public boolean isTicket() {
		return this.ticket; 
	}
	
	public void setCifproveedor(
		String var
	) {
		this.cifproveedor=var; 
	}
	
	public String getCifproveedor() {
		return this.cifproveedor; 
	}
	
	public void setDocumento(
		Object var
	) {
		this.documento=var; 
	}
	
	public Object getDocumento() {
		return this.documento; 
	}
	
	public void setFactura(
		String var
	) {
		this.factura=var; 
	}
	
	public String getFactura() {
		return this.factura; 
	}
	
	public void setFechafact(
		Date var
	) {
		this.fechafact=var; 
	}
	
	public Date getFechafact() {
		return this.fechafact; 
	}
	
	public void setIdxfismgastos(
		Long var
	) {
		this.idxfismgastos=var; 
	}
	
	public Long getIdxfismgastos() {
		return this.idxfismgastos; 
	}
	
	public void setImporteiva(
		BigDecimal var
	) {
		this.importeiva=var; 
	}
	
	public BigDecimal getImporteiva() {
		return this.importeiva; 
	}
	
	public void setImprecargo(
		BigDecimal var
	) {
		this.imprecargo=var; 
	}
	
	public BigDecimal getImprecargo() {
		return this.imprecargo; 
	}
	
	public void setImpretencion(
		BigDecimal var
	) {
		this.impretencion=var; 
	}
	
	public BigDecimal getImpretencion() {
		return this.impretencion; 
	}
	
	public void setPercentiva(
		BigDecimal var
	) {
		this.percentiva=var; 
	}
	
	public BigDecimal getPercentiva() {
		return this.percentiva; 
	}
	
	public void setProveedor(
		String var
	) {
		this.proveedor=var; 
	}
	
	public String getProveedor() {
		return this.proveedor; 
	}
	
	public void setRecequiv(
		BigDecimal var
	) {
		this.recequiv=var; 
	}
	
	public BigDecimal getRecequiv() {
		return this.recequiv; 
	}
	
	public void setRetencion(
		BigDecimal var
	) {
		this.retencion=var; 
	}
	
	public BigDecimal getRetencion() {
		return this.retencion; 
	}
	
	public void setSubtotal(
		BigDecimal var
	) {
		this.subtotal=var; 
	}
	
	public BigDecimal getSubtotal() {
		return this.subtotal; 
	}
	
	public void setTotal(
		BigDecimal var
	) {
		this.total=var; 
	}
	
	public BigDecimal getTotal() {
		return this.total; 
	}
	
	public void setTrimestre(
		String var
	) {
		this.trimestre=var; 
	}
	
	public String getTrimestre() {
		return this.trimestre; 
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
	
	public void setIdfismtipogto(
		Fismtipogto var
	) {
		this.idfismtipogto=var; 
	}
	
	public Fismtipogto getIdfismtipogto() {
		if(this.idfismtipogto==null)this.idfismtipogto=new org.suinsit.apps.fiscal.Fismtipogto();
		  return this.idfismtipogto; 
	}
	
	public void setIdfismfpago(
		Fismfpago var
	) {
		this.idfismfpago=var; 
	}
	
	public Fismfpago getIdfismfpago() {
		if(this.idfismfpago==null)this.idfismfpago=new org.suinsit.apps.fiscal.Fismfpago();
		  return this.idfismfpago; 
	} 

}