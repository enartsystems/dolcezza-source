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
import org.suinsit.apps.fiscal.Fismfcbro;

@Entity
@Table (
	name = "FISMFACTURA" 
)
@Entidad (
	type = "TABLE",
	pk = "idxfismfactura" 
)
public class Fismfactura implements Serializable { 

	private static final long serialVersionUID = 1L;
	@Column (
		name = "CLIENTE",
		nullable = true 
	)
	private String cliente;
	@Column (
		name = "DOCUMENTO",
		nullable = true 
	)
	private Object documento;
	@Column (
		name = "FACTURA",
		nullable = false 
	)
	private String factura;
	@Column (
		name = "FECFACTURA",
		nullable = false 
	)
	private Date fecfactura;
	@Id
	@Column (
		name = "IDXFISMFACTURA",
		nullable = true 
	)
	private Long idxfismfactura;
	@Column (
		name = "IMPIRPF",
		nullable = true 
	)
	private BigDecimal impirpf;
	@Column (
		name = "IMPORTEIVA",
		nullable = true 
	)
	private BigDecimal importeiva;
	@Column (
		name = "IMPORTENETO",
		nullable = true 
	)
	private BigDecimal importeneto;
	@Column (
		name = "IMPORTERECARGO",
		nullable = true 
	)
	private BigDecimal importerecargo;
	@Column (
		name = "NIFID",
		nullable = true 
	)
	private String nifid;
	@Column (
		name = "PERCENTIRPF",
		nullable = true 
	)
	private BigDecimal percentirpf;
	@Column (
		name = "PERCENTIVA",
		nullable = true 
	)
	private BigDecimal percentiva;
	@Column (
		name = "PERCENTRECARGO",
		nullable = true 
	)
	private BigDecimal percentrecargo;
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
		name = "IDFISMFCBRO0",
		referencedColumnName = "IDXFISMFCBRO",
		nullable = true,
		insertable = true,
		updatable = true 
	)
	private Fismfcbro idfismfcbro; 

	public void setCliente(
		String var
	) {
		this.cliente=var; 
	}
	
	public String getCliente() {
		return this.cliente; 
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
	
	public void setFecfactura(
		Date var
	) {
		this.fecfactura=var; 
	}
	
	public Date getFecfactura() {
		return this.fecfactura; 
	}
	
	public void setIdxfismfactura(
		Long var
	) {
		this.idxfismfactura=var; 
	}
	
	public Long getIdxfismfactura() {
		return this.idxfismfactura; 
	}
	
	public void setImpirpf(
		BigDecimal var
	) {
		this.impirpf=var; 
	}
	
	public BigDecimal getImpirpf() {
		return this.impirpf; 
	}
	
	public void setImporteiva(
		BigDecimal var
	) {
		this.importeiva=var; 
	}
	
	public BigDecimal getImporteiva() {
		return this.importeiva; 
	}
	
	public void setImporteneto(
		BigDecimal var
	) {
		this.importeneto=var; 
	}
	
	public BigDecimal getImporteneto() {
		return this.importeneto; 
	}
	
	public void setImporterecargo(
		BigDecimal var
	) {
		this.importerecargo=var; 
	}
	
	public BigDecimal getImporterecargo() {
		return this.importerecargo; 
	}
	
	public void setNifid(
		String var
	) {
		this.nifid=var; 
	}
	
	public String getNifid() {
		return this.nifid; 
	}
	
	public void setPercentirpf(
		BigDecimal var
	) {
		this.percentirpf=var; 
	}
	
	public BigDecimal getPercentirpf() {
		return this.percentirpf; 
	}
	
	public void setPercentiva(
		BigDecimal var
	) {
		this.percentiva=var; 
	}
	
	public BigDecimal getPercentiva() {
		return this.percentiva; 
	}
	
	public void setPercentrecargo(
		BigDecimal var
	) {
		this.percentrecargo=var; 
	}
	
	public BigDecimal getPercentrecargo() {
		return this.percentrecargo; 
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
	
	public void setIdfismfcbro(
		Fismfcbro var
	) {
		this.idfismfcbro=var; 
	}
	
	public Fismfcbro getIdfismfcbro() {
		if(this.idfismfcbro==null)this.idfismfcbro=new org.suinsit.apps.fiscal.Fismfcbro();
		  return this.idfismfcbro; 
	} 

}