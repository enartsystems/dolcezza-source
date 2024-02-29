package org.suinsit.apps.facturacin;

import java.io.Serializable;
import java.lang.String;
import java.math.BigDecimal;
import java.sql.Date;
import javax.persistence.Column;
import org.enartframework.nocode.annotacion.Entidad;

@Entidad (
	type = "VIEW_CHARTS" 
)
public class Factfronmonth implements Serializable { 

	private static final long serialVersionUID = 1L;
	@Column (
		name = "SUBTOTAL",
		nullable = true 
	)
	private BigDecimal subtotal;
	@Column (
		name = "EMPRESA",
		nullable = false 
	)
	private String empresa;
	@Column (
		name = "FECHAFACT",
		nullable = false 
	)
	private Date fechafact;
	private boolean updatable; 

	public void setSubtotal(
		BigDecimal var
	) {
		this.subtotal=var; 
	}
	
	public BigDecimal getSubtotal() {
		return this.subtotal; 
	}
	
	public void setEmpresa(
		String var
	) {
		this.empresa=var; 
	}
	
	public String getEmpresa() {
		return this.empresa; 
	}
	
	public void setFechafact(
		Date var
	) {
		this.fechafact=var; 
	}
	
	public Date getFechafact() {
		return this.fechafact; 
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