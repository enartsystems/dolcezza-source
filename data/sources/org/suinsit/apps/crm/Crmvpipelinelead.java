package org.suinsit.apps.crm;

import java.io.Serializable;
import java.lang.Integer;
import java.lang.Long;
import java.lang.String;
import javax.persistence.Column;
import javax.persistence.Id;
import org.enartframework.nocode.annotacion.Entidad;

@Entidad (
	type = "VIEW",
	pk = "idxcrmpipeline" 
)
public class Crmvpipelinelead implements Serializable { 

	private static final long serialVersionUID = 1L;
	@Column (
		name = "BAJA",
		nullable = true 
	)
	private boolean baja;
	@Column (
		name = "DEFECTO",
		nullable = true 
	)
	private boolean defecto;
	@Id
	@Column (
		name = "IDXCRMPIPELINE",
		nullable = true 
	)
	private Long idxcrmpipeline;
	@Column (
		name = "MAXREG",
		nullable = true 
	)
	private Integer maxreg;
	@Column (
		name = "MODULO",
		nullable = true 
	)
	private String modulo;
	@Column (
		name = "ORDENASC",
		nullable = true 
	)
	private boolean ordenasc;
	@Column (
		name = "PIPELINE",
		nullable = false 
	)
	private String pipeline;
	private boolean updatable; 

	public void setBaja(
		boolean var
	) {
		this.baja=var; 
	}
	
	public boolean isBaja() {
		return this.baja; 
	}
	
	public void setDefecto(
		boolean var
	) {
		this.defecto=var; 
	}
	
	public boolean isDefecto() {
		return this.defecto; 
	}
	
	public void setIdxcrmpipeline(
		Long var
	) {
		this.idxcrmpipeline=var; 
	}
	
	public Long getIdxcrmpipeline() {
		return this.idxcrmpipeline; 
	}
	
	public void setMaxreg(
		Integer var
	) {
		this.maxreg=var; 
	}
	
	public Integer getMaxreg() {
		return this.maxreg; 
	}
	
	public void setModulo(
		String var
	) {
		this.modulo=var; 
	}
	
	public String getModulo() {
		return this.modulo; 
	}
	
	public void setOrdenasc(
		boolean var
	) {
		this.ordenasc=var; 
	}
	
	public boolean isOrdenasc() {
		return this.ordenasc; 
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