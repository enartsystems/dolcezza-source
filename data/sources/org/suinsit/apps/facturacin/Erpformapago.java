package org.suinsit.apps.facturacin;

import java.io.Serializable;
import java.lang.Integer;
import java.lang.Long;
import java.lang.String;
import java.math.BigDecimal;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import org.enartframework.nocode.annotacion.Entidad;
import org.suinsit.apps.facturacin.Erpempresa;

@Entity
@Table (
	name = "ERPFORMAPAGO" 
)
@Entidad (
	type = "TABLE",
	pk = "idxerpformapago" 
)
public class Erpformapago implements Serializable { 

	private static final long serialVersionUID = 1L;
	@Column (
		name = "MENSUAL",
		nullable = true 
	)
	private boolean mensual;
	@Column (
		name = "DESFACTURA",
		nullable = false 
	)
	private String desfactura;
	@Column (
		name = "DIASFACTURA",
		nullable = true 
	)
	private Integer diasfactura;
	@Column (
		name = "FORMADEPAGO",
		nullable = false 
	)
	private String formadepago;
	@Id
	@Column (
		name = "IDXERPFORMAPAGO",
		nullable = true 
	)
	private Long idxerpformapago;
	@Column (
		name = "NUMPAGOS",
		nullable = true 
	)
	private Integer numpagos;
	@Column (
		name = "PORCENTAJE",
		nullable = true 
	)
	private BigDecimal porcentaje;
	private boolean updatable;
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

	public void setMensual(
		boolean var
	) {
		this.mensual=var; 
	}
	
	public boolean isMensual() {
		return this.mensual; 
	}
	
	public void setDesfactura(
		String var
	) {
		this.desfactura=var; 
	}
	
	public String getDesfactura() {
		return this.desfactura; 
	}
	
	public void setDiasfactura(
		Integer var
	) {
		this.diasfactura=var; 
	}
	
	public Integer getDiasfactura() {
		return this.diasfactura; 
	}
	
	public void setFormadepago(
		String var
	) {
		this.formadepago=var; 
	}
	
	public String getFormadepago() {
		return this.formadepago; 
	}
	
	public void setIdxerpformapago(
		Long var
	) {
		this.idxerpformapago=var; 
	}
	
	public Long getIdxerpformapago() {
		return this.idxerpformapago; 
	}
	
	public void setNumpagos(
		Integer var
	) {
		this.numpagos=var; 
	}
	
	public Integer getNumpagos() {
		return this.numpagos; 
	}
	
	public void setPorcentaje(
		BigDecimal var
	) {
		this.porcentaje=var; 
	}
	
	public BigDecimal getPorcentaje() {
		return this.porcentaje; 
	}
	
	public void setUpdatable(
		boolean var
	) {
		this.updatable=var; 
	}
	
	public boolean isUpdatable() {
		return this.updatable; 
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

}