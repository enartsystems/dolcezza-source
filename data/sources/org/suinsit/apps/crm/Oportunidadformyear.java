package org.suinsit.apps.crm;

import java.io.Serializable;
import java.lang.String;
import java.math.BigDecimal;
import java.sql.Date;
import javax.persistence.Column;
import org.enartframework.nocode.annotacion.Entidad;

@Entidad (
	type = "VIEW_CHARTS" 
)
public class Oportunidadformyear implements Serializable { 

	private static final long serialVersionUID = 1L;
	@Column (
		name = "pipeline",
		nullable = false 
	)
	private String pipeline;
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
		name = "etapa",
		nullable = false 
	)
	private String etapa;
	private boolean updatable; 

	public void setPipeline(
		String var
	) {
		this.pipeline=var; 
	}
	
	public String getPipeline() {
		return this.pipeline; 
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
	
	public void setEtapa(
		String var
	) {
		this.etapa=var; 
	}
	
	public String getEtapa() {
		return this.etapa; 
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