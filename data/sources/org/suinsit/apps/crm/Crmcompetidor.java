package org.suinsit.apps.crm;

import java.io.Serializable;
import java.lang.Long;
import java.lang.String;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import org.enartframework.nocode.annotacion.Entidad;
import org.suinsit.apps.crm.Crmroporcomp;

@Entity
@Table (
	name = "CRMCOMPETIDOR" 
)
@Entidad (
	type = "TABLE",
	pk = "idxcrmcompetidor" 
)
public class Crmcompetidor implements Serializable { 

	private static final long serialVersionUID = 1L;
	@Column (
		name = "ALTA",
		nullable = true 
	)
	private Date alta;
	@Column (
		name = "BAJA",
		nullable = true 
	)
	private boolean baja;
	@Column (
		name = "COMPETIDOR",
		nullable = true 
	)
	private String competidor;
	@Column (
		name = "DEBILIDADES",
		nullable = true 
	)
	private String debilidades;
	@Column (
		name = "FORTALEZAS",
		nullable = true 
	)
	private String fortalezas;
	@Id
	@Column (
		name = "IDXCRMCOMPETIDOR",
		nullable = true 
	)
	private Long idxcrmcompetidor;
	@Column (
		name = "WEB",
		nullable = true 
	)
	private String web;
	private boolean updatable;
	private List<Crmroporcomp> subcrmroporcomp; 

	public void setAlta(
		Date var
	) {
		this.alta=var; 
	}
	
	public Date getAlta() {
		return this.alta; 
	}
	
	public void setBaja(
		boolean var
	) {
		this.baja=var; 
	}
	
	public boolean isBaja() {
		return this.baja; 
	}
	
	public void setCompetidor(
		String var
	) {
		this.competidor=var; 
	}
	
	public String getCompetidor() {
		return this.competidor; 
	}
	
	public void setDebilidades(
		String var
	) {
		this.debilidades=var; 
	}
	
	public String getDebilidades() {
		return this.debilidades; 
	}
	
	public void setFortalezas(
		String var
	) {
		this.fortalezas=var; 
	}
	
	public String getFortalezas() {
		return this.fortalezas; 
	}
	
	public void setIdxcrmcompetidor(
		Long var
	) {
		this.idxcrmcompetidor=var; 
	}
	
	public Long getIdxcrmcompetidor() {
		return this.idxcrmcompetidor; 
	}
	
	public void setWeb(
		String var
	) {
		this.web=var; 
	}
	
	public String getWeb() {
		return this.web; 
	}
	
	public void setUpdatable(
		boolean var
	) {
		this.updatable=var; 
	}
	
	public boolean isUpdatable() {
		return this.updatable; 
	}
	
	public void setSubcrmroporcomp(
		List<Crmroporcomp> var
	) {
		this.subcrmroporcomp=var; 
	}
	
	public List<Crmroporcomp> getSubcrmroporcomp() {
		if(this.subcrmroporcomp==null)this.subcrmroporcomp=new ArrayList<>(0);
		  return this.subcrmroporcomp; 
	} 

}