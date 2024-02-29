package org.suinsit.apps.facturacin;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Date;
import javax.persistence.Column;
import org.enartframework.nocode.annotacion.Entidad;

@Entidad (
	type = "VIEW_CHARTS" 
)
public class Presuforyear implements Serializable { 

	private static final long serialVersionUID = 1L;
	@Column (
		name = "year",
		nullable = true 
	)
	private Date year;
	@Column (
		name = "month",
		nullable = true 
	)
	private Date month;
	@Column (
		name = "subtotal",
		nullable = true 
	)
	private BigDecimal subtotal;
	private boolean updatable; 

	public void setYear(
		Date var
	) {
		this.year=var; 
	}
	
	public Date getYear() {
		return this.year; 
	}
	
	public void setMonth(
		Date var
	) {
		this.month=var; 
	}
	
	public Date getMonth() {
		return this.month; 
	}
	
	public void setSubtotal(
		BigDecimal var
	) {
		this.subtotal=var; 
	}
	
	public BigDecimal getSubtotal() {
		return this.subtotal; 
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