package org.suinsit.apps.portalemp;

import java.io.Serializable;
import java.lang.Long;
import java.lang.String;
import java.math.BigDecimal;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import org.enartframework.nocode.annotacion.Entidad;
import org.suinsit.apps.portalemp.Rrhmtipoconta;

@Entity
@Table (
	name = "RRHHCTESCONTRATO" 
)
@Entidad (
	type = "TABLE",
	pk = "idxrrhhctescontrato" 
)
public class Rrhhctescontrato implements Serializable { 

	private static final long serialVersionUID = 1L;
	@Column (
		name = "CTEEMPLEADO",
		nullable = true 
	)
	private boolean cteempleado;
	@Column (
		name = "CTEEMPRESA",
		nullable = true 
	)
	private boolean cteempresa;
	@Column (
		name = "PORCENTAJE",
		nullable = true 
	)
	private BigDecimal porcentaje;
	@Column (
		name = "CONCEPTO",
		nullable = true 
	)
	private String concepto;
	@Id
	@Column (
		name = "IDXRRHHCTESCONTRATO",
		nullable = true 
	)
	private Long idxrrhhctescontrato;
	private boolean updatable;
	@ManyToOne (
		fetch = javax.persistence.FetchType.LAZY 
	)
	@JoinColumn (
		name = "IDRRHMTIPOCONTA0",
		referencedColumnName = "IDXRRHMTIPOCONTA",
		nullable = true,
		insertable = true,
		updatable = true 
	)
	private Rrhmtipoconta idrrhmtipoconta; 

	public void setCteempleado(
		boolean var
	) {
		this.cteempleado=var; 
	}
	
	public boolean isCteempleado() {
		return this.cteempleado; 
	}
	
	public void setCteempresa(
		boolean var
	) {
		this.cteempresa=var; 
	}
	
	public boolean isCteempresa() {
		return this.cteempresa; 
	}
	
	public void setPorcentaje(
		BigDecimal var
	) {
		this.porcentaje=var; 
	}
	
	public BigDecimal getPorcentaje() {
		return this.porcentaje; 
	}
	
	public void setConcepto(
		String var
	) {
		this.concepto=var; 
	}
	
	public String getConcepto() {
		return this.concepto; 
	}
	
	public void setIdxrrhhctescontrato(
		Long var
	) {
		this.idxrrhhctescontrato=var; 
	}
	
	public Long getIdxrrhhctescontrato() {
		return this.idxrrhhctescontrato; 
	}
	
	public void setUpdatable(
		boolean var
	) {
		this.updatable=var; 
	}
	
	public boolean isUpdatable() {
		return this.updatable; 
	}
	
	public void setIdrrhmtipoconta(
		Rrhmtipoconta var
	) {
		this.idrrhmtipoconta=var; 
	}
	
	public Rrhmtipoconta getIdrrhmtipoconta() {
		if(this.idrrhmtipoconta==null)this.idrrhmtipoconta=new org.suinsit.apps.portalemp.Rrhmtipoconta();
		  return this.idrrhmtipoconta; 
	} 

}