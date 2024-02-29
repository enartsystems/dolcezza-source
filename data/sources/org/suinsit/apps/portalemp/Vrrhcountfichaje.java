package org.suinsit.apps.portalemp;

import java.io.Serializable;
import java.lang.Integer;
import java.lang.Long;
import java.lang.String;
import java.math.BigDecimal;
import javax.persistence.Column;
import org.enartframework.nocode.annotacion.Entidad;

@Entidad (
	type = "VIEW" 
)
public class Vrrhcountfichaje implements Serializable { 

	private static final long serialVersionUID = 1L;
	@Column (
		name = "TOTAL",
		nullable = true 
	)
	private BigDecimal total;
	@Column (
		name = "TIPO",
		nullable = false 
	)
	private String tipo;
	@Column (
		name = "ANIO",
		nullable = true 
	)
	private Integer anio;
	@Column (
		name = "MES",
		nullable = true 
	)
	private Integer mes;
	@Column (
		name = "APROBADA",
		nullable = true 
	)
	private boolean aprobada;
	@Column (
		name = "IDRRHEMPLEADO0",
		nullable = true 
	)
	private Long idrrhempleado0;
	private boolean updatable; 

	public void setTotal(
		BigDecimal var
	) {
		this.total=var; 
	}
	
	public BigDecimal getTotal() {
		return this.total; 
	}
	
	public void setTipo(
		String var
	) {
		this.tipo=var; 
	}
	
	public String getTipo() {
		return this.tipo; 
	}
	
	public void setAnio(
		Integer var
	) {
		this.anio=var; 
	}
	
	public Integer getAnio() {
		return this.anio; 
	}
	
	public void setMes(
		Integer var
	) {
		this.mes=var; 
	}
	
	public Integer getMes() {
		return this.mes; 
	}
	
	public void setAprobada(
		boolean var
	) {
		this.aprobada=var; 
	}
	
	public boolean isAprobada() {
		return this.aprobada; 
	}
	
	public void setIdrrhempleado0(
		Long var
	) {
		this.idrrhempleado0=var; 
	}
	
	public Long getIdrrhempleado0() {
		return this.idrrhempleado0; 
	}
	
	public void setUpdatable(
		boolean var
	) {
		this.updatable=var; 
	}
	
	public boolean isUpdatable() {
		return this.updatable; 
	} 

}