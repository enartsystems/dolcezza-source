package org.suinsit.apps.admin;

import java.io.Serializable;
import java.lang.Long;
import java.lang.String;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import org.enartframework.nocode.annotacion.Entidad;
import org.suinsit.apps.admin.Mpais;

@Entity
@Table (
	name = "MPROVINCIA" 
)
@Entidad (
	type = "TABLE",
	pk = "idx" 
)
public class Mprovincia implements Serializable { 

	private static final long serialVersionUID = 1L;
	@Column (
		name = "CCAA",
		nullable = true 
	)
	private String ccaa;
	@Column (
		name = "CODCCAA",
		nullable = true 
	)
	private String codccaa;
	@Column (
		name = "CODIGO",
		nullable = true 
	)
	private String codigo;
	@Id
	@Column (
		name = "IDX",
		nullable = false 
	)
	private Long idx;
	@Column (
		name = "PROVINCIA",
		nullable = true 
	)
	private String provincia;
	private boolean updatable;
	@ManyToOne (
		fetch = javax.persistence.FetchType.LAZY 
	)
	@JoinColumn (
		name = "IDMPAIS0",
		referencedColumnName = "IDX",
		nullable = true,
		insertable = true,
		updatable = true 
	)
	private Mpais idmpais; 

	public void setCcaa(
		String var
	) {
		this.ccaa=var; 
	}
	
	public String getCcaa() {
		return this.ccaa; 
	}
	
	public void setCodccaa(
		String var
	) {
		this.codccaa=var; 
	}
	
	public String getCodccaa() {
		return this.codccaa; 
	}
	
	public void setCodigo(
		String var
	) {
		this.codigo=var; 
	}
	
	public String getCodigo() {
		return this.codigo; 
	}
	
	public void setIdx(
		Long var
	) {
		this.idx=var; 
	}
	
	public Long getIdx() {
		return this.idx; 
	}
	
	public void setProvincia(
		String var
	) {
		this.provincia=var; 
	}
	
	public String getProvincia() {
		return this.provincia; 
	}
	
	public void setUpdatable(
		boolean var
	) {
		this.updatable=var; 
	}
	
	public boolean isUpdatable() {
		return this.updatable; 
	}
	
	public void setIdmpais(
		Mpais var
	) {
		this.idmpais=var; 
	}
	
	public Mpais getIdmpais() {
		if(this.idmpais==null)this.idmpais=new org.suinsit.apps.admin.Mpais();
		  return this.idmpais; 
	} 

}