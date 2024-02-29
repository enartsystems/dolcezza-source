package org.suinsit.apps.pmo;

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
import org.enartframework.nocode.annotacion.Entidad;
import org.enartframework.nocode.annotacion.Sequence;
import org.suinsit.apps.pmo.Pmoestadoinc;
import org.suinsit.apps.pmo.Pmomproject;
import org.suinsit.apps.pmo.Pmomtipoinc;
import org.suinsit.apps.pmo.Pmousuario;

@Entity
@Table (
	name = "PMOMINCIDENCIA" 
)
@Entidad (
	type = "TABLE",
	pk = "idxpmomincidencia" 
)
public class Pmomincidencia implements Serializable { 

	private static final long serialVersionUID = 1L;
	@Column (
		name = "CODIGO",
		nullable = false 
	)
	@Sequence (
		name = "PMOMINCIDENCIA_CODIGO",
		prefix = "",
		mask = "00000000",
		addYear = false 
	)
	private String codigo;
	@Column (
		name = "COSTE",
		nullable = true 
	)
	private BigDecimal coste;
	@Column (
		name = "DESCRIPCION",
		nullable = true 
	)
	private String descripcion;
	@Column (
		name = "HORAS",
		nullable = true 
	)
	private Integer horas;
	@Id
	@Column (
		name = "IDXPMOMINCIDENCIA",
		nullable = true 
	)
	private Long idxpmomincidencia;
	@Column (
		name = "INICIDENCIA",
		nullable = false 
	)
	private String inicidencia;
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
	@ManyToOne (
		fetch = javax.persistence.FetchType.LAZY 
	)
	@JoinColumn (
		name = "IDGESTOR0",
		referencedColumnName = "IDXPMOUSUARIO",
		nullable = true,
		insertable = true,
		updatable = true 
	)
	private Pmousuario idgestor;
	@ManyToOne (
		fetch = javax.persistence.FetchType.LAZY 
	)
	@JoinColumn (
		name = "IDPMOMTIPOINC0",
		referencedColumnName = "IDXPMOMTIPOINC",
		nullable = true,
		insertable = true,
		updatable = true 
	)
	private Pmomtipoinc idpmomtipoinc;
	@ManyToOne (
		fetch = javax.persistence.FetchType.LAZY 
	)
	@JoinColumn (
		name = "IDPMOESTADOINC0",
		referencedColumnName = "IDXPMOESTADOINC",
		nullable = true,
		insertable = true,
		updatable = true 
	)
	private Pmoestadoinc idpmoestadoinc; 

	public void setCodigo(
		String var
	) {
		this.codigo=var; 
	}
	
	public String getCodigo() {
		return this.codigo; 
	}
	
	public void setCoste(
		BigDecimal var
	) {
		this.coste=var; 
	}
	
	public BigDecimal getCoste() {
		return this.coste; 
	}
	
	public void setDescripcion(
		String var
	) {
		this.descripcion=var; 
	}
	
	public String getDescripcion() {
		return this.descripcion; 
	}
	
	public void setHoras(
		Integer var
	) {
		this.horas=var; 
	}
	
	public Integer getHoras() {
		return this.horas; 
	}
	
	public void setIdxpmomincidencia(
		Long var
	) {
		this.idxpmomincidencia=var; 
	}
	
	public Long getIdxpmomincidencia() {
		return this.idxpmomincidencia; 
	}
	
	public void setInicidencia(
		String var
	) {
		this.inicidencia=var; 
	}
	
	public String getInicidencia() {
		return this.inicidencia; 
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
	
	public void setIdgestor(
		Pmousuario var
	) {
		this.idgestor=var; 
	}
	
	public Pmousuario getIdgestor() {
		if(this.idgestor==null)this.idgestor=new org.suinsit.apps.pmo.Pmousuario();
		  return this.idgestor; 
	}
	
	public void setIdpmomtipoinc(
		Pmomtipoinc var
	) {
		this.idpmomtipoinc=var; 
	}
	
	public Pmomtipoinc getIdpmomtipoinc() {
		if(this.idpmomtipoinc==null)this.idpmomtipoinc=new org.suinsit.apps.pmo.Pmomtipoinc();
		  return this.idpmomtipoinc; 
	}
	
	public void setIdpmoestadoinc(
		Pmoestadoinc var
	) {
		this.idpmoestadoinc=var; 
	}
	
	public Pmoestadoinc getIdpmoestadoinc() {
		if(this.idpmoestadoinc==null)this.idpmoestadoinc=new org.suinsit.apps.pmo.Pmoestadoinc();
		  return this.idpmoestadoinc; 
	} 

}