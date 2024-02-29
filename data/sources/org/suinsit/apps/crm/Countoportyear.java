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
public class Countoportyear implements Serializable { 

	private static final long serialVersionUID = 1L;
	@Column (
		name = "pipeline",
		nullable = false 
	)
	private String pipeline;
	@Column (
		name = "etapa",
		nullable = false 
	)
	private String etapa;
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
		name = "idxoportunidad",
		nullable = true 
	)
	private Long idxoportunidad;
	private boolean updatable; 

	public void setPipeline(
		String var
	) {
		this.pipeline=var; 
	}
	
	public String getPipeline() {
		return this.pipeline; 
	}
	
	public void setEtapa(
		String var
	) {
		this.etapa=var; 
	}
	
	public String getEtapa() {
		return this.etapa; 
	}
	
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