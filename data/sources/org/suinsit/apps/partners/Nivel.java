package org.suinsit.apps.partners;

import java.io.Serializable;
import java.lang.Long;
import java.lang.String;
import java.math.BigDecimal;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import org.enartframework.nocode.annotacion.Entidad;

@Entity
@Table (
	name = "NIVEL" 
)
@Entidad (
	type = "TABLE",
	pk = "idxnivel" 
)
public class Nivel implements Serializable { 

	private static final long serialVersionUID = 1L;
	@Column (
		name = "COMISIONMAX",
		nullable = true 
	)
	private BigDecimal comisionmax;
	@Column (
		name = "COMISIONMIN",
		nullable = true 
	)
	private BigDecimal comisionmin;
	@Column (
		name = "OBJETIVOS",
		nullable = true 
	)
	private BigDecimal objetivos;
	@Column (
		name = "CERTIFICACIONES",
		nullable = true 
	)
	private String certificaciones;
	@Column (
		name = "REQUISITOS",
		nullable = true 
	)
	private String requisitos;
	@Column (
		name = "NIVEL",
		nullable = true 
	)
	private String nivel;
	@Id
	@Column (
		name = "IDXNIVEL",
		nullable = true 
	)
	private Long idxnivel;
	private boolean updatable; 

	public void setComisionmax(
		BigDecimal var
	) {
		this.comisionmax=var; 
	}
	
	public BigDecimal getComisionmax() {
		return this.comisionmax; 
	}
	
	public void setComisionmin(
		BigDecimal var
	) {
		this.comisionmin=var; 
	}
	
	public BigDecimal getComisionmin() {
		return this.comisionmin; 
	}
	
	public void setObjetivos(
		BigDecimal var
	) {
		this.objetivos=var; 
	}
	
	public BigDecimal getObjetivos() {
		return this.objetivos; 
	}
	
	public void setCertificaciones(
		String var
	) {
		this.certificaciones=var; 
	}
	
	public String getCertificaciones() {
		return this.certificaciones; 
	}
	
	public void setRequisitos(
		String var
	) {
		this.requisitos=var; 
	}
	
	public String getRequisitos() {
		return this.requisitos; 
	}
	
	public void setNivel(
		String var
	) {
		this.nivel=var; 
	}
	
	public String getNivel() {
		return this.nivel; 
	}
	
	public void setIdxnivel(
		Long var
	) {
		this.idxnivel=var; 
	}
	
	public Long getIdxnivel() {
		return this.idxnivel; 
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