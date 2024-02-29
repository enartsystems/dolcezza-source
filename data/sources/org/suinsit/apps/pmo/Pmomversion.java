package org.suinsit.apps.pmo;

import java.io.Serializable;
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
	name = "PMOMVERSION" 
)
@Entidad (
	type = "TABLE",
	pk = "idxpmomversion" 
)
public class Pmomversion implements Serializable { 

	private static final long serialVersionUID = 1L;
	@Column (
		name = "RESUMEN",
		nullable = true 
	)
	private String resumen;
	@Column (
		name = "FECHAPROD",
		nullable = true 
	)
	private Date fechaprod;
	@Column (
		name = "FECHAPREV",
		nullable = true 
	)
	private Date fechaprev;
	@Column (
		name = "VERSION",
		nullable = true 
	)
	private String version;
	@Id
	@Column (
		name = "IDXPMOMVERSION",
		nullable = true 
	)
	private Long idxpmomversion;
	private boolean updatable; 

	public void setResumen(
		String var
	) {
		this.resumen=var; 
	}
	
	public String getResumen() {
		return this.resumen; 
	}
	
	public void setFechaprod(
		Date var
	) {
		this.fechaprod=var; 
	}
	
	public Date getFechaprod() {
		return this.fechaprod; 
	}
	
	public void setFechaprev(
		Date var
	) {
		this.fechaprev=var; 
	}
	
	public Date getFechaprev() {
		return this.fechaprev; 
	}
	
	public void setVersion(
		String var
	) {
		this.version=var; 
	}
	
	public String getVersion() {
		return this.version; 
	}
	
	public void setIdxpmomversion(
		Long var
	) {
		this.idxpmomversion=var; 
	}
	
	public Long getIdxpmomversion() {
		return this.idxpmomversion; 
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