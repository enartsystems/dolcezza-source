package org.suinsit.apps.crm;

import java.io.Serializable;
import java.lang.Long;
import java.lang.String;
import java.sql.Date;
import javax.persistence.Column;
import org.enartframework.nocode.annotacion.Entidad;

@Entidad (
	type = "VIEW_CHARTS" 
)
public class Sumoportfromyear implements Serializable { 

	private static final long serialVersionUID = 1L;
	@Column (
		name = "month",
		nullable = false 
	)
	private Date month;
	@Column (
		name = "year",
		nullable = false 
	)
	private Date year;
	@Column (
		name = "etapa",
		nullable = false 
	)
	private String etapa;
	@Column (
		name = "pipeline",
		nullable = false 
	)
	private String pipeline;
	@Column (
		name = "idxcrmpipeline",
		nullable = true 
	)
	private Long idxcrmpipeline;
	@Column (
		name = "idxcrmetapa",
		nullable = true 
	)
	private Long idxcrmetapa;
	@Column (
		name = "idxoportunidad",
		nullable = true 
	)
	private Long idxoportunidad;
	private boolean updatable; 

	public void setMonth(
		Date var
	) {
		this.month=var; 
	}
	
	public Date getMonth() {
		return this.month; 
	}
	
	public void setYear(
		Date var
	) {
		this.year=var; 
	}
	
	public Date getYear() {
		return this.year; 
	}
	
	public void setEtapa(
		String var
	) {
		this.etapa=var; 
	}
	
	public String getEtapa() {
		return this.etapa; 
	}
	
	public void setPipeline(
		String var
	) {
		this.pipeline=var; 
	}
	
	public String getPipeline() {
		return this.pipeline; 
	}
	
	public void setIdxcrmpipeline(
		Long var
	) {
		this.idxcrmpipeline=var; 
	}
	
	public Long getIdxcrmpipeline() {
		return this.idxcrmpipeline; 
	}
	
	public void setIdxcrmetapa(
		Long var
	) {
		this.idxcrmetapa=var; 
	}
	
	public Long getIdxcrmetapa() {
		return this.idxcrmetapa; 
	}
	
	public void setIdxoportunidad(
		Long var
	) {
		this.idxoportunidad=var; 
	}
	
	public Long getIdxoportunidad() {
		return this.idxoportunidad; 
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