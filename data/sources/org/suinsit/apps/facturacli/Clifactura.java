package org.suinsit.apps.facturacli;

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
import org.enartframework.nocode.annotacion.SequenceYear;
import org.suinsit.apps.admin.Ssousuario;
import org.suinsit.apps.crm.Crmempresa;
import org.suinsit.apps.facturacin.Erpformapago;
import org.suinsit.apps.facturacin.Erpimpuestos;
import org.suinsit.apps.facturacin.Erpmestado;
import org.suinsit.apps.facturacin.Erpmestadocbo;
import org.suinsit.apps.facturacli.Clicliente;

@Entity
@Table (
	name = "CLIFACTURA" 
)
@Entidad (
	type = "TABLE",
	pk = "idxclifactura" 
)
public class Clifactura implements Serializable { 

	private static final long serialVersionUID = 1L;
	@Column (
		name = "condiciones",
		nullable = true 
	)
	private String condiciones;
	@Column (
		name = "factura",
		nullable = true 
	)
	@SequenceYear (
		autoCreateFromYear = true,
		autoResetYear = false,
		createManual = false,
		createFromFieldValue = "idcrmempresa.idxcrmempresa",
		fieldPrefix = "serie",
		name = "CLIFACTURA_FACTURA",
		prefix = "",
		mask = "000000",
		addYear = false 
	)
	private String factura;
	@Column (
		name = "fecha",
		nullable = true 
	)
	private Date fecha;
	@Column (
		name = "fechafact",
		nullable = false 
	)
	private Date fechafact;
	@Id
	@Column (
		name = "idxclifactura",
		nullable = true 
	)
	private Long idxclifactura;
	@Column (
		name = "impuestos",
		nullable = true 
	)
	private BigDecimal impuestos;
	@Column (
		name = "infoadicional",
		nullable = true 
	)
	private String infoadicional;
	@Column (
		name = "numexpediente",
		nullable = true 
	)
	private String numexpediente;
	@Column (
		name = "oficinactble",
		nullable = true 
	)
	private String oficinactble;
	@Column (
		name = "organogtor",
		nullable = true 
	)
	private String organogtor;
	@Column (
		name = "organoprop",
		nullable = true 
	)
	private String organoprop;
	@Column (
		name = "pagolinea",
		nullable = true 
	)
	private boolean pagolinea;
	@Column (
		name = "refcliente",
		nullable = true 
	)
	private String refcliente;
	@Column (
		name = "serie",
		nullable = false 
	)
	private String serie;
	@Column (
		name = "subtotal",
		nullable = true 
	)
	private BigDecimal subtotal;
	@Column (
		name = "total",
		nullable = true 
	)
	private BigDecimal total;
	@Column (
		name = "vatpercent",
		nullable = true 
	)
	private BigDecimal vatpercent;
	@Column (
		name = "vencimiento",
		nullable = false 
	)
	private Date vencimiento;
	private boolean updatable;
	@ManyToOne (
		fetch = javax.persistence.FetchType.LAZY 
	)
	@JoinColumn (
		name = "IDCRMEMPRESA0",
		referencedColumnName = "IDXCRMEMPRESA",
		nullable = false,
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
		name = "IDERPMESTADOCBO0",
		referencedColumnName = "IDXERPMESTADOCBO",
		nullable = true,
		insertable = true,
		updatable = true 
	)
	private Erpmestadocbo iderpmestadocbo;
	@ManyToOne (
		fetch = javax.persistence.FetchType.LAZY 
	)
	@JoinColumn (
		name = "IDCLICLIENTE0",
		referencedColumnName = "IDXCLICLIENTE",
		nullable = false,
		insertable = true,
		updatable = true 
	)
	private Clicliente idclicliente;
	@ManyToOne (
		fetch = javax.persistence.FetchType.LAZY 
	)
	@JoinColumn (
		name = "IDERPIMPUESTOS0",
		referencedColumnName = "IDXERPIMPUESTOS",
		nullable = true,
		insertable = true,
		updatable = true 
	)
	private Erpimpuestos iderpimpuestos;
	@ManyToOne (
		fetch = javax.persistence.FetchType.LAZY 
	)
	@JoinColumn (
		name = "IDERPFORMAPAGO0",
		referencedColumnName = "IDXERPFORMAPAGO",
		nullable = true,
		insertable = true,
		updatable = true 
	)
	private Erpformapago iderpformapago;
	@ManyToOne (
		fetch = javax.persistence.FetchType.LAZY 
	)
	@JoinColumn (
		name = "IDERPMESTADO0",
		referencedColumnName = "IDXERPMESTADO",
		nullable = true,
		insertable = true,
		updatable = true 
	)
	private Erpmestado iderpmestado; 

	public void setCondiciones(
		String var
	) {
		this.condiciones=var; 
	}
	
	public String getCondiciones() {
		return this.condiciones; 
	}
	
	public void setFactura(
		String var
	) {
		this.factura=var; 
	}
	
	public String getFactura() {
		return this.factura; 
	}
	
	public void setFecha(
		Date var
	) {
		this.fecha=var; 
	}
	
	public Date getFecha() {
		return this.fecha; 
	}
	
	public void setFechafact(
		Date var
	) {
		this.fechafact=var; 
	}
	
	public Date getFechafact() {
		return this.fechafact; 
	}
	
	public void setIdxclifactura(
		Long var
	) {
		this.idxclifactura=var; 
	}
	
	public Long getIdxclifactura() {
		return this.idxclifactura; 
	}
	
	public void setImpuestos(
		BigDecimal var
	) {
		this.impuestos=var; 
	}
	
	public BigDecimal getImpuestos() {
		return this.impuestos; 
	}
	
	public void setInfoadicional(
		String var
	) {
		this.infoadicional=var; 
	}
	
	public String getInfoadicional() {
		return this.infoadicional; 
	}
	
	public void setNumexpediente(
		String var
	) {
		this.numexpediente=var; 
	}
	
	public String getNumexpediente() {
		return this.numexpediente; 
	}
	
	public void setOficinactble(
		String var
	) {
		this.oficinactble=var; 
	}
	
	public String getOficinactble() {
		return this.oficinactble; 
	}
	
	public void setOrganogtor(
		String var
	) {
		this.organogtor=var; 
	}
	
	public String getOrganogtor() {
		return this.organogtor; 
	}
	
	public void setOrganoprop(
		String var
	) {
		this.organoprop=var; 
	}
	
	public String getOrganoprop() {
		return this.organoprop; 
	}
	
	public void setPagolinea(
		boolean var
	) {
		this.pagolinea=var; 
	}
	
	public boolean isPagolinea() {
		return this.pagolinea; 
	}
	
	public void setRefcliente(
		String var
	) {
		this.refcliente=var; 
	}
	
	public String getRefcliente() {
		return this.refcliente; 
	}
	
	public void setSerie(
		String var
	) {
		this.serie=var; 
	}
	
	public String getSerie() {
		return this.serie; 
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
	
	public void setVatpercent(
		BigDecimal var
	) {
		this.vatpercent=var; 
	}
	
	public BigDecimal getVatpercent() {
		return this.vatpercent; 
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
	
	public void setIderpmestadocbo(
		Erpmestadocbo var
	) {
		this.iderpmestadocbo=var; 
	}
	
	public Erpmestadocbo getIderpmestadocbo() {
		if(this.iderpmestadocbo==null)this.iderpmestadocbo=new org.suinsit.apps.facturacin.Erpmestadocbo();
		  return this.iderpmestadocbo; 
	}
	
	public void setIdclicliente(
		Clicliente var
	) {
		this.idclicliente=var; 
	}
	
	public Clicliente getIdclicliente() {
		if(this.idclicliente==null)this.idclicliente=new org.suinsit.apps.facturacli.Clicliente();
		  return this.idclicliente; 
	}
	
	public void setIderpimpuestos(
		Erpimpuestos var
	) {
		this.iderpimpuestos=var; 
	}
	
	public Erpimpuestos getIderpimpuestos() {
		if(this.iderpimpuestos==null)this.iderpimpuestos=new org.suinsit.apps.facturacin.Erpimpuestos();
		  return this.iderpimpuestos; 
	}
	
	public void setIderpformapago(
		Erpformapago var
	) {
		this.iderpformapago=var; 
	}
	
	public Erpformapago getIderpformapago() {
		if(this.iderpformapago==null)this.iderpformapago=new org.suinsit.apps.facturacin.Erpformapago();
		  return this.iderpformapago; 
	}
	
	public void setIderpmestado(
		Erpmestado var
	) {
		this.iderpmestado=var; 
	}
	
	public Erpmestado getIderpmestado() {
		if(this.iderpmestado==null)this.iderpmestado=new org.suinsit.apps.facturacin.Erpmestado();
		  return this.iderpmestado; 
	} 

}