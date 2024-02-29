package org.suinsit.apps.pmo;

import java.io.Serializable;
import java.lang.Long;
import java.lang.String;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import org.enartframework.nocode.annotacion.Entidad;
import org.suinsit.apps.pmo.Pmotipoproyect;

@Entity
@Table (
	name = "PMODEPARTAMENT" 
)
@Entidad (
	type = "TABLE",
	pk = "idxpmodepartament" 
)
public class Pmodepartament implements Serializable { 

	private static final long serialVersionUID = 1L;
	@Column (
		name = "DEPARTAMENTO",
		nullable = false 
	)
	private String departamento;
	@Id
	@Column (
		name = "IDXPMODEPARTAMENT",
		nullable = true 
	)
	private Long idxpmodepartament;
	@Column (
		name = "COUSERALTA",
		nullable = true 
	)
	private String couseralta;
	@Column (
		name = "TMALTA",
		nullable = true 
	)
	private String tmalta;
	@Column (
		name = "COUSERMODIF",
		nullable = true 
	)
	private String cousermodif;
	@Column (
		name = "TMMODIF",
		nullable = true 
	)
	private String tmmodif;
	private boolean updatable;
	private List<Pmotipoproyect> subpmotipoproyect; 

	public void setDepartamento(
		String var
	) {
		this.departamento=var; 
	}
	
	public String getDepartamento() {
		return this.departamento; 
	}
	
	public void setIdxpmodepartament(
		Long var
	) {
		this.idxpmodepartament=var; 
	}
	
	public Long getIdxpmodepartament() {
		return this.idxpmodepartament; 
	}
	
	public void setCouseralta(
		String var
	) {
		this.couseralta=var; 
	}
	
	public String getCouseralta() {
		return this.couseralta; 
	}
	
	public void setTmalta(
		String var
	) {
		this.tmalta=var; 
	}
	
	public String getTmalta() {
		return this.tmalta; 
	}
	
	public void setCousermodif(
		String var
	) {
		this.cousermodif=var; 
	}
	
	public String getCousermodif() {
		return this.cousermodif; 
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
	
	public void setSubpmotipoproyect(
		List<Pmotipoproyect> var
	) {
		this.subpmotipoproyect=var; 
	}
	
	public List<Pmotipoproyect> getSubpmotipoproyect() {
		if(this.subpmotipoproyect==null)this.subpmotipoproyect=new ArrayList<>(0);
		  return this.subpmotipoproyect; 
	} 

}