package org.suinsit.apps.mrp;

import java.io.Serializable;
import java.lang.Integer;
import java.lang.Long;
import java.lang.String;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import org.enartframework.nocode.annotacion.Entidad;
import org.suinsit.apps.facturacin.Erpempresa;

@Entity
@Table (
	name = "MRPMSEQUENCE" 
)
@Entidad (
	type = "TABLE",
	pk = "idxmrpmsequence" 
)
public class Mrpmsequence implements Serializable { 

	private static final long serialVersionUID = 1L;
	@Column (
		name = "namesql",
		nullable = true 
	)
	private String namesql;
	@Column (
		name = "activo",
		nullable = true 
	)
	private boolean activo;
	@Id
	@Column (
		name = "idxmrpmsequence",
		nullable = true 
	)
	private Long idxmrpmsequence;
	@Column (
		name = "incremento",
		nullable = true 
	)
	private Integer incremento;
	@Column (
		name = "nextnumber",
		nullable = true 
	)
	private Integer nextnumber;
	@Column (
		name = "prefijo",
		nullable = true 
	)
	private String prefijo;
	@Column (
		name = "secuencianame",
		nullable = true 
	)
	private String secuencianame;
	@Column (
		name = "size",
		nullable = true 
	)
	private Integer size;
	@Column (
		name = "subsecuenciadate",
		nullable = true 
	)
	private boolean subsecuenciadate;
	@Column (
		name = "sufijo",
		nullable = true 
	)
	private String sufijo;
	private boolean updatable;
	@ManyToOne (
		fetch = javax.persistence.FetchType.LAZY 
	)
	@JoinColumn (
		name = "IDCOMPANY0",
		referencedColumnName = "IDXERPEMPRESA",
		nullable = true,
		insertable = true,
		updatable = true 
	)
	private Erpempresa idcompany; 

	public void setNamesql(
		String var
	) {
		this.namesql=var; 
	}
	
	public String getNamesql() {
		return this.namesql; 
	}
	
	public void setActivo(
		boolean var
	) {
		this.activo=var; 
	}
	
	public boolean isActivo() {
		return this.activo; 
	}
	
	public void setIdxmrpmsequence(
		Long var
	) {
		this.idxmrpmsequence=var; 
	}
	
	public Long getIdxmrpmsequence() {
		return this.idxmrpmsequence; 
	}
	
	public void setIncremento(
		Integer var
	) {
		this.incremento=var; 
	}
	
	public Integer getIncremento() {
		return this.incremento; 
	}
	
	public void setNextnumber(
		Integer var
	) {
		this.nextnumber=var; 
	}
	
	public Integer getNextnumber() {
		return this.nextnumber; 
	}
	
	public void setPrefijo(
		String var
	) {
		this.prefijo=var; 
	}
	
	public String getPrefijo() {
		return this.prefijo; 
	}
	
	public void setSecuencianame(
		String var
	) {
		this.secuencianame=var; 
	}
	
	public String getSecuencianame() {
		return this.secuencianame; 
	}
	
	public void setSize(
		Integer var
	) {
		this.size=var; 
	}
	
	public Integer getSize() {
		return this.size; 
	}
	
	public void setSubsecuenciadate(
		boolean var
	) {
		this.subsecuenciadate=var; 
	}
	
	public boolean isSubsecuenciadate() {
		return this.subsecuenciadate; 
	}
	
	public void setSufijo(
		String var
	) {
		this.sufijo=var; 
	}
	
	public String getSufijo() {
		return this.sufijo; 
	}
	
	public void setUpdatable(
		boolean var
	) {
		this.updatable=var; 
	}
	
	public boolean isUpdatable() {
		return this.updatable; 
	}
	
	public void setIdcompany(
		Erpempresa var
	) {
		this.idcompany=var; 
	}
	
	public Erpempresa getIdcompany() {
		if(this.idcompany==null)this.idcompany=new org.suinsit.apps.facturacin.Erpempresa();
		  return this.idcompany; 
	} 

}