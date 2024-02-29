package org.suinsit.apps.crm;

import java.io.Serializable;
import java.lang.Integer;
import java.lang.Long;
import java.lang.String;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import org.enartframework.nocode.annotacion.AutoGenerate;
import org.enartframework.nocode.annotacion.Entidad;

@Entity
@Table (
	name = "CRMPIPELINE" 
)
@Entidad (
	type = "TABLE",
	pk = "idxcrmpipeline" 
)
public class Crmpipeline implements Serializable { 

	private static final long serialVersionUID = 1L;
	@Column (
		name = "APIWEB",
		nullable = true 
	)
	private boolean apiweb;
	@Column (
		name = "BAJA",
		nullable = true 
	)
	private boolean baja;
	@Column (
		name = "CODIGOUUID",
		nullable = true 
	)
	@AutoGenerate (
		uuid = true 
	)
	private String codigouuid;
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

	public void setApiweb(
		boolean var
	) {
		this.apiweb=var; 
	}
	
	public boolean isApiweb() {
		return this.apiweb; 
	}
	
	public void setBaja(
		boolean var
	) {
		this.baja=var; 
	}
	
	public boolean isBaja() {
		return this.baja; 
	}
	
	public void setCodigouuid(
		String var
	) {
		this.codigouuid=var; 
	}
	
	public String getCodigouuid() {
		return this.codigouuid; 
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