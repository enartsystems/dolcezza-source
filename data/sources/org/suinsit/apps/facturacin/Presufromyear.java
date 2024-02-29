package org.suinsit.apps.facturacin;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Date;
import javax.persistence.Column;
import org.enartframework.nocode.annotacion.Entidad;

@Entidad (
	type = "VIEW_CHARTS" 
)
public class Presufromyear implements Serializable { 

	private static final long serialVersionUID = 1L;
	@Column (
		name = "FECHA",
		nullable = true 
	)
	private Date year;
	@Column (
		name = "SUBTOTAL",
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