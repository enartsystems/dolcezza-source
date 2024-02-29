package org.suinsit.apps.crm;

import java.io.Serializable;
import java.lang.Integer;
import java.lang.Long;
import java.lang.String;
import java.math.BigDecimal;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import org.enartframework.nocode.annotacion.AutoGenerate;
import org.enartframework.nocode.annotacion.Entidad;
import org.suinsit.apps.crm.Crmpipeline;

@Entity
@Table (
	name = "CRMETAPA" 
)
@Entidad (
	type = "TABLE",
	pk = "idxcrmetapa" 
)
public class Crmetapa implements Serializable { 

	private static final long serialVersionUID = 1L;
	@Column (
		name = "BAJA",
		nullable = true 
	)
	private boolean baja;
	@Column (
		name = "CIERRE",
		nullable = true 
	)
	private boolean cierre;
	@Column (
		name = "CODUUID",
		nullable = true 
	)
	@AutoGenerate (
		uuid = true 
	)
	private String coduuid;
	@Column (
		name = "COLOR",
		nullable = true 
	)
	private String color;
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
	private boolean updatable;
	@ManyToOne (
		fetch = javax.persistence.FetchType.LAZY 
	)
	@JoinColumn (
		name = "IDCRMPIPELINE0",
		referencedColumnName = "IDXCRMPIPELINE",
		nullable = false,
		insertable = true,
		updatable = true 
	)
	private Crmpipeline idcrmpipeline; 

	public void setBaja(
		boolean var
	) {
		this.baja=var; 
	}
	
	public boolean isBaja() {
		return this.baja; 
	}
	
	public void setCierre(
		boolean var
	) {
		this.cierre=var; 
	}
	
	public boolean isCierre() {
		return this.cierre; 
	}
	
	public void setCoduuid(
		String var
	) {
		this.coduuid=var; 
	}
	
	public String getCoduuid() {
		return this.coduuid; 
	}
	
	public void setColor(
		String var
	) {
		this.color=var; 
	}
	
	public String getColor() {
		return this.color; 
	}
	
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
	
	public void setUpdatable(
		boolean var
	) {
		this.updatable=var; 
	}
	
	public boolean isUpdatable() {
		return this.updatable; 
	}
	
	public void setIdcrmpipeline(
		Crmpipeline var
	) {
		this.idcrmpipeline=var; 
	}
	
	public Crmpipeline getIdcrmpipeline() {
		if(this.idcrmpipeline==null)this.idcrmpipeline=new org.suinsit.apps.crm.Crmpipeline();
		  return this.idcrmpipeline; 
	} 

}