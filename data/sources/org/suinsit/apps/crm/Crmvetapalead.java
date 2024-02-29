package org.suinsit.apps.crm;

import java.io.Serializable;
import java.lang.Integer;
import java.lang.Long;
import java.lang.String;
import java.math.BigDecimal;
import javax.persistence.Column;
import javax.persistence.Id;
import org.enartframework.nocode.annotacion.Entidad;

@Entidad (
	type = "VIEW",
	pk = "idxcrmetapa" 
)
public class Crmvetapalead implements Serializable { 

	private static final long serialVersionUID = 1L;
	@Column (
		name = "ETAPA",
		nullable = false 
	)
	private String etapa;
	@Id
	@Column (
		name = "IDXCRMETAPA",
		nullable = true 
	)
	private Long idxcrmetapa;
	@Column (
		name = "MOSTRARMOTIV",
		nullable = true 
	)
	private boolean mostrarmotiv;
	@Column (
		name = "ORDEN",
		nullable = false 
	)
	private Integer orden;
	@Column (
		name = "PORCENTAJE",
		nullable = true 
	)
	private BigDecimal porcentaje;
	@Column (
		name = "IDCRMPIPELINE0",
		nullable = true 
	)
	private Long idcrmpipeline0;
	@Column (
		name = "PIPELINE",
		nullable = false 
	)
	private String pipeline;
	private boolean updatable; 

	public void setEtapa(
		String var
	) {
		this.etapa=var; 
	}
	
	public String getEtapa() {
		return this.etapa; 
	}
	
	public void setIdxcrmetapa(
		Long var
	) {
		this.idxcrmetapa=var; 
	}
	
	public Long getIdxcrmetapa() {
		return this.idxcrmetapa; 
	}
	
	public void setMostrarmotiv(
		boolean var
	) {
		this.mostrarmotiv=var; 
	}
	
	public boolean isMostrarmotiv() {
		return this.mostrarmotiv; 
	}
	
	public void setOrden(
		Integer var
	) {
		this.orden=var; 
	}
	
	public Integer getOrden() {
		return this.orden; 
	}
	
	public void setPorcentaje(
		BigDecimal var
	) {
		this.porcentaje=var; 
	}
	
	public BigDecimal getPorcentaje() {
		return this.porcentaje; 
	}
	
	public void setIdcrmpipeline0(
		Long var
	) {
		this.idcrmpipeline0=var; 
	}
	
	public Long getIdcrmpipeline0() {
		return this.idcrmpipeline0; 
	}
	
	public void setPipeline(
		String var
	) {
		this.pipeline=var; 
	}
	
	public String getPipeline() {
		return this.pipeline; 
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