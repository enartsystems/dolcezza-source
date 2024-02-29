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
import org.suinsit.apps.facturacin.Erpformapago;

@Entity
@Table (
	name = "ERPDESFPAGO" 
)
@Entidad (
	type = "TABLE",
	pk = "idxerpdesfpago" 
)
public class Erpdesfpago implements Serializable { 

	private static final long serialVersionUID = 1L;
	@Column (
		name = "VENCIMIENTO",
		nullable = true 
	)
	private String vencimiento;
	@Column (
		name = "DIA",
		nullable = true 
	)
	private Integer dia;
	@Column (
		name = "IMPORTE",
		nullable = true 
	)
	private BigDecimal importe;
	@Column (
		name = "PERCENT",
		nullable = true 
	)
	private BigDecimal percent;
	@Column (
		name = "TIPO",
		nullable = false 
	)
	private String tipo;
	@Id
	@Column (
		name = "IDXERPDESFPAGO",
		nullable = true 
	)
	private Long idxerpdesfpago;
	private boolean updatable;
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

	public void setVencimiento(
		String var
	) {
		this.vencimiento=var; 
	}
	
	public String getVencimiento() {
		return this.vencimiento; 
	}
	
	public void setDia(
		Integer var
	) {
		this.dia=var; 
	}
	
	public Integer getDia() {
		return this.dia; 
	}
	
	public void setImporte(
		BigDecimal var
	) {
		this.importe=var; 
	}
	
	public BigDecimal getImporte() {
		return this.importe; 
	}
	
	public void setPercent(
		BigDecimal var
	) {
		this.percent=var; 
	}
	
	public BigDecimal getPercent() {
		return this.percent; 
	}
	
	public void setTipo(
		String var
	) {
		this.tipo=var; 
	}
	
	public String getTipo() {
		return this.tipo; 
	}
	
	public void setIdxerpdesfpago(
		Long var
	) {
		this.idxerpdesfpago=var; 
	}
	
	public Long getIdxerpdesfpago() {
		return this.idxerpdesfpago; 
	}
	
	public void setUpdatable(
		boolean var
	) {
		this.updatable=var; 
	}
	
	public boolean isUpdatable() {
		return this.updatable; 
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

}