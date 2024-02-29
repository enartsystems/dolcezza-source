package org.suinsit.apps.facturacin;

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
import org.suinsit.apps.crm.Crmcontacto;
import org.suinsit.apps.facturacin.Erpempresa;
import org.suinsit.apps.facturacin.Erpmabnco;
import org.suinsit.apps.facturacin.Erpmctactble;
import org.suinsit.apps.facturacin.Erpmproveedor;

@Entity
@Table (
	name = "ERPMGASTO" 
)
@Entidad (
	type = "TABLE",
	pk = "idxerpmgasto" 
)
public class Erpmgasto implements Serializable { 

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
		name = "DOCUMENTO",
		nullable = false 
	)
	private String documento;
	@Column (
		name = "FECHA",
		nullable = false 
	)
	private Date fecha;
	@Id
	@Column (
		name = "IDXERPMGASTO",
		nullable = true 
	)
	private Long idxerpmgasto;
	@Column (
		name = "IMPUESTOS",
		nullable = true 
	)
	private BigDecimal impuestos;
	@Column (
		name = "SUBTOTAL",
		nullable = true 
	)
	private BigDecimal subtotal;
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
		name = "TOTAL",
		nullable = true 
	)
	private BigDecimal total;
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
		name = "IDERPMCTACTBLE0",
		referencedColumnName = "IDXERPMCTACTBLE",
		nullable = true,
		insertable = true,
		updatable = true 
	)
	private Erpmctactble iderpmctactble;
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
		name = "IDERPMPROVEEDOR0",
		referencedColumnName = "IDXERPMPROVEEDOR",
		nullable = true,
		insertable = true,
		updatable = true 
	)
	private Erpmproveedor iderpmproveedor; 

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
	
	public void setDocumento(
		String var
	) {
		this.documento=var; 
	}
	
	public String getDocumento() {
		return this.documento; 
	}
	
	public void setFecha(
		Date var
	) {
		this.fecha=var; 
	}
	
	public Date getFecha() {
		return this.fecha; 
	}
	
	public void setIdxerpmgasto(
		Long var
	) {
		this.idxerpmgasto=var; 
	}
	
	public Long getIdxerpmgasto() {
		return this.idxerpmgasto; 
	}
	
	public void setImpuestos(
		BigDecimal var
	) {
		this.impuestos=var; 
	}
	
	public BigDecimal getImpuestos() {
		return this.impuestos; 
	}
	
	public void setSubtotal(
		BigDecimal var
	) {
		this.subtotal=var; 
	}
	
	public BigDecimal getSubtotal() {
		return this.subtotal; 
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
	
	public void setTotal(
		BigDecimal var
	) {
		this.total=var; 
	}
	
	public BigDecimal getTotal() {
		return this.total; 
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
	
	public void setIdcrmcontacto(
		Crmcontacto var
	) {
		this.idcrmcontacto=var; 
	}
	
	public Crmcontacto getIdcrmcontacto() {
		if(this.idcrmcontacto==null)this.idcrmcontacto=new org.suinsit.apps.crm.Crmcontacto();
		  return this.idcrmcontacto; 
	}
	
	public void setIderpmctactble(
		Erpmctactble var
	) {
		this.iderpmctactble=var; 
	}
	
	public Erpmctactble getIderpmctactble() {
		if(this.iderpmctactble==null)this.iderpmctactble=new org.suinsit.apps.facturacin.Erpmctactble();
		  return this.iderpmctactble; 
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
	
	public void setIderpempresa(
		Erpempresa var
	) {
		this.iderpempresa=var; 
	}
	
	public Erpempresa getIderpempresa() {
		if(this.iderpempresa==null)this.iderpempresa=new org.suinsit.apps.facturacin.Erpempresa();
		  return this.iderpempresa; 
	}
	
	public void setIderpmproveedor(
		Erpmproveedor var
	) {
		this.iderpmproveedor=var; 
	}
	
	public Erpmproveedor getIderpmproveedor() {
		if(this.iderpmproveedor==null)this.iderpmproveedor=new org.suinsit.apps.facturacin.Erpmproveedor();
		  return this.iderpmproveedor; 
	} 

}