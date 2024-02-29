package org.suinsit.apps.crm;

import java.io.Serializable;
import java.lang.Integer;
import java.lang.Long;
import java.lang.String;
import java.math.BigDecimal;
import java.sql.Date;
import javax.persistence.Column;
import javax.persistence.Id;
import org.enartframework.nocode.annotacion.Entidad;

@Entidad (
	type = "VIEW",
	pk = "idxoportunidad" 
)
public class Crmvleads implements Serializable { 

	private static final long serialVersionUID = 1L;
	@Column (
		name = "ETAPA",
		nullable = false 
	)
	private String etapa;
	@Column (
		name = "ORDEN",
		nullable = false 
	)
	private Integer orden;
	@Column (
		name = "PIPELINE",
		nullable = false 
	)
	private String pipeline;
	@Column (
		name = "DESCRIPCION",
		nullable = true 
	)
	private String descripcion;
	@Column (
		name = "ALTA",
		nullable = true 
	)
	private Date alta;
	@Column (
		name = "FECTSTART",
		nullable = true 
	)
	private Date fectstart;
	@Column (
		name = "IMPORTEPREV",
		nullable = true 
	)
	private BigDecimal importeprev;
	@Column (
		name = "OPORTUNIDAD",
		nullable = false 
	)
	private String oportunidad;
	@Column (
		name = "POSITION",
		nullable = true 
	)
	private Integer position;
	@Column (
		name = "PROBABILIDAD",
		nullable = true 
	)
	private BigDecimal probabilidad;
	@Column (
		name = "IDCRMPIPELINE0",
		nullable = true 
	)
	private Long idcrmpipeline0;
	@Column (
		name = "IDCRMETAPA0",
		nullable = true 
	)
	private Long idcrmetapa0;
	@Id
	@Column (
		name = "IDXOPORTUNIDAD",
		nullable = true 
	)
	private Long idxoportunidad;
	private boolean updatable; 

	public void setEtapa(
		String var
	) {
		this.etapa=var; 
	}
	
	public String getEtapa() {
		return this.etapa; 
	}
	
	public void setOrden(
		Integer var
	) {
		this.orden=var; 
	}
	
	public Integer getOrden() {
		return this.orden; 
	}
	
	public void setPipeline(
		String var
	) {
		this.pipeline=var; 
	}
	
	public String getPipeline() {
		return this.pipeline; 
	}
	
	public void setDescripcion(
		String var
	) {
		this.descripcion=var; 
	}
	
	public String getDescripcion() {
		return this.descripcion; 
	}
	
	public void setAlta(
		Date var
	) {
		this.alta=var; 
	}
	
	public Date getAlta() {
		return this.alta; 
	}
	
	public void setFectstart(
		Date var
	) {
		this.fectstart=var; 
	}
	
	public Date getFectstart() {
		return this.fectstart; 
	}
	
	public void setImporteprev(
		BigDecimal var
	) {
		this.importeprev=var; 
	}
	
	public BigDecimal getImporteprev() {
		return this.importeprev; 
	}
	
	public void setOportunidad(
		String var
	) {
		this.oportunidad=var; 
	}
	
	public String getOportunidad() {
		return this.oportunidad; 
	}
	
	public void setPosition(
		Integer var
	) {
		this.position=var; 
	}
	
	public Integer getPosition() {
		return this.position; 
	}
	
	public void setProbabilidad(
		BigDecimal var
	) {
		this.probabilidad=var; 
	}
	
	public BigDecimal getProbabilidad() {
		return this.probabilidad; 
	}
	
	public void setIdcrmpipeline0(
		Long var
	) {
		this.idcrmpipeline0=var; 
	}
	
	public Long getIdcrmpipeline0() {
		return this.idcrmpipeline0; 
	}
	
	public void setIdcrmetapa0(
		Long var
	) {
		this.idcrmetapa0=var; 
	}
	
	public Long getIdcrmetapa0() {
		return this.idcrmetapa0; 
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