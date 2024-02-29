package org.suinsit.apps.admin;

import java.io.Serializable;
import java.lang.Integer;
import java.lang.Long;
import java.lang.String;
import java.sql.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import org.enartframework.nocode.annotacion.Entidad;

@Entity
@Table (
	name = "MPERIDICIDAD" 
)
@Entidad (
	type = "TABLE",
	pk = "idxmperidicidad" 
)
public class Mperidicidad implements Serializable { 

	private static final long serialVersionUID = 1L;
	@Column (
		name = "ALTA",
		nullable = false 
	)
	private Date alta;
	@Column (
		name = "ANONATURAL",
		nullable = true 
	)
	private boolean anonatural;
	@Column (
		name = "CODIGO",
		nullable = false 
	)
	private String codigo;
	@Column (
		name = "DIAVTO",
		nullable = true 
	)
	private Integer diavto;
	@Id
	@Column (
		name = "IDXMPERIDICIDAD",
		nullable = true 
	)
	private Long idxmperidicidad;
	@Column (
		name = "MESNATURAL",
		nullable = true 
	)
	private boolean mesnatural;
	@Column (
		name = "PERIDICIDAD",
		nullable = true 
	)
	private Integer peridicidad;
	@Column (
		name = "PERIODO",
		nullable = false 
	)
	private String periodo;
	@Column (
		name = "SEMESTRENATURAL",
		nullable = true 
	)
	private boolean semestrenatural;
	@Column (
		name = "TRIMESTRENATURAL",
		nullable = true 
	)
	private boolean trimestrenatural;
	private boolean updatable; 

	public void setAlta(
		Date var
	) {
		this.alta=var; 
	}
	
	public Date getAlta() {
		return this.alta; 
	}
	
	public void setAnonatural(
		boolean var
	) {
		this.anonatural=var; 
	}
	
	public boolean isAnonatural() {
		return this.anonatural; 
	}
	
	public void setCodigo(
		String var
	) {
		this.codigo=var; 
	}
	
	public String getCodigo() {
		return this.codigo; 
	}
	
	public void setDiavto(
		Integer var
	) {
		this.diavto=var; 
	}
	
	public Integer getDiavto() {
		return this.diavto; 
	}
	
	public void setIdxmperidicidad(
		Long var
	) {
		this.idxmperidicidad=var; 
	}
	
	public Long getIdxmperidicidad() {
		return this.idxmperidicidad; 
	}
	
	public void setMesnatural(
		boolean var
	) {
		this.mesnatural=var; 
	}
	
	public boolean isMesnatural() {
		return this.mesnatural; 
	}
	
	public void setPeridicidad(
		Integer var
	) {
		this.peridicidad=var; 
	}
	
	public Integer getPeridicidad() {
		return this.peridicidad; 
	}
	
	public void setPeriodo(
		String var
	) {
		this.periodo=var; 
	}
	
	public String getPeriodo() {
		return this.periodo; 
	}
	
	public void setSemestrenatural(
		boolean var
	) {
		this.semestrenatural=var; 
	}
	
	public boolean isSemestrenatural() {
		return this.semestrenatural; 
	}
	
	public void setTrimestrenatural(
		boolean var
	) {
		this.trimestrenatural=var; 
	}
	
	public boolean isTrimestrenatural() {
		return this.trimestrenatural; 
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