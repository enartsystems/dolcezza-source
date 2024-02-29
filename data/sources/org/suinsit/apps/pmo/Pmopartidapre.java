package org.suinsit.apps.pmo;

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
import org.suinsit.apps.pmo.Pmomproject;

@Entity
@Table (
	name = "PMOPARTIDAPRE" 
)
@Entidad (
	type = "TABLE",
	pk = "idxpmopartidapre" 
)
public class Pmopartidapre implements Serializable { 

	private static final long serialVersionUID = 1L;
	@Column (
		name = "IMPORTEREAL",
		nullable = true 
	)
	private BigDecimal importereal;
	@Column (
		name = "COUSERALTA",
		nullable = true 
	)
	private String couseralta;
	@Column (
		name = "COUSERMODIF",
		nullable = true 
	)
	private String cousermodif;
	@Column (
		name = "CUENTAGASTOS",
		nullable = true 
	)
	private String cuentagastos;
	@Column (
		name = "CUENTAVENTAS",
		nullable = true 
	)
	private String cuentaventas;
	@Column (
		name = "DESCRIPCIN",
		nullable = true 
	)
	private String descripcin;
	@Id
	@Column (
		name = "IDXPMOPARTIDAPRE",
		nullable = true 
	)
	private Long idxpmopartidapre;
	@Column (
		name = "IMPORTEPRE",
		nullable = true 
	)
	private BigDecimal importepre;
	@Column (
		name = "PARTIDA",
		nullable = false 
	)
	private String partida;
	@Column (
		name = "TMALTA",
		nullable = true 
	)
	private String tmalta;
	@Column (
		name = "TMMODIF",
		nullable = true 
	)
	private String tmmodif;
	private boolean updatable;
	@ManyToOne (
		fetch = javax.persistence.FetchType.LAZY 
	)
	@JoinColumn (
		name = "IDPMOMPROJECT0",
		referencedColumnName = "IDXPMOMPROJECT",
		nullable = true,
		insertable = true,
		updatable = true 
	)
	private Pmomproject idpmomproject; 

	public void setImportereal(
		BigDecimal var
	) {
		this.importereal=var; 
	}
	
	public BigDecimal getImportereal() {
		return this.importereal; 
	}
	
	public void setCouseralta(
		String var
	) {
		this.couseralta=var; 
	}
	
	public String getCouseralta() {
		return this.couseralta; 
	}
	
	public void setCousermodif(
		String var
	) {
		this.cousermodif=var; 
	}
	
	public String getCousermodif() {
		return this.cousermodif; 
	}
	
	public void setCuentagastos(
		String var
	) {
		this.cuentagastos=var; 
	}
	
	public String getCuentagastos() {
		return this.cuentagastos; 
	}
	
	public void setCuentaventas(
		String var
	) {
		this.cuentaventas=var; 
	}
	
	public String getCuentaventas() {
		return this.cuentaventas; 
	}
	
	public void setDescripcin(
		String var
	) {
		this.descripcin=var; 
	}
	
	public String getDescripcin() {
		return this.descripcin; 
	}
	
	public void setIdxpmopartidapre(
		Long var
	) {
		this.idxpmopartidapre=var; 
	}
	
	public Long getIdxpmopartidapre() {
		return this.idxpmopartidapre; 
	}
	
	public void setImportepre(
		BigDecimal var
	) {
		this.importepre=var; 
	}
	
	public BigDecimal getImportepre() {
		return this.importepre; 
	}
	
	public void setPartida(
		String var
	) {
		this.partida=var; 
	}
	
	public String getPartida() {
		return this.partida; 
	}
	
	public void setTmalta(
		String var
	) {
		this.tmalta=var; 
	}
	
	public String getTmalta() {
		return this.tmalta; 
	}
	
	public void setTmmodif(
		String var
	) {
		this.tmmodif=var; 
	}
	
	public String getTmmodif() {
		return this.tmmodif; 
	}
	
	public void setUpdatable(
		boolean var
	) {
		this.updatable=var; 
	}
	
	public boolean isUpdatable() {
		return this.updatable; 
	}
	
	public void setIdpmomproject(
		Pmomproject var
	) {
		this.idpmomproject=var; 
	}
	
	public Pmomproject getIdpmomproject() {
		if(this.idpmomproject==null)this.idpmomproject=new org.suinsit.apps.pmo.Pmomproject();
		  return this.idpmomproject; 
	} 

}