package org.suinsit.apps.crm;

import java.io.Serializable;
import java.lang.Long;
import java.lang.String;
import java.math.BigDecimal;
import java.sql.Date;
import javax.persistence.Column;
import org.enartframework.nocode.annotacion.Entidad;

@Entidad (
	type = "VIEW_CHARTS" 
)
public class Vcountoportfromyear implements Serializable { 

	private static final long serialVersionUID = 1L;
	@Column (
		name = "etapa",
		nullable = false 
	)
	private String etapa;
	@Column (
		name = "year",
		nullable = false 
	)
	private Date year;
	@Column (
		name = "month",
		nullable = false 
	)
	private Date month;
	@Column (
		name = "idxoportunidad",
		nullable = true 
	)
	private Long idxoportunidad;
	@Column (
		name = "importefinal",
		nullable = true 
	)
	private BigDecimal importefinal;
	@Column (
		name = "importeprev",
		nullable = true 
	)
	private BigDecimal importeprev;
	private boolean updatable; 

	public void setEtapa(
		String var
	) {
		this.etapa=var; 
	}
	
	public String getEtapa() {
		return this.etapa; 
	}
	
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
	
	public void setIdxoportunidad(
		Long var
	) {
		this.idxoportunidad=var; 
	}
	
	public Long getIdxoportunidad() {
		return this.idxoportunidad; 
	}
	
	public void setImportefinal(
		BigDecimal var
	) {
		this.importefinal=var; 
	}
	
	public BigDecimal getImportefinal() {
		return this.importefinal; 
	}
	
	public void setImporteprev(
		BigDecimal var
	) {
		this.importeprev=var; 
	}
	
	public BigDecimal getImporteprev() {
		return this.importeprev; 
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