package org.suinsit.apps.crm;

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
import org.suinsit.apps.crm.Crmtarea;

@Entity
@Table (
	name = "CRMCOLATASK" 
)
@Entidad (
	type = "TABLE",
	pk = "idxcrmcolatask" 
)
public class Crmcolatask implements Serializable { 

	private static final long serialVersionUID = 1L;
	@Column (
		name = "COLA",
		nullable = true 
	)
	private String cola;
	@Id
	@Column (
		name = "IDXCRMCOLATASK",
		nullable = true 
	)
	private Long idxcrmcolatask;
	private boolean updatable;
	private List<Crmtarea> subcrmtarea; 

	public void setCola(
		String var
	) {
		this.cola=var; 
	}
	
	public String getCola() {
		return this.cola; 
	}
	
	public void setIdxcrmcolatask(
		Long var
	) {
		this.idxcrmcolatask=var; 
	}
	
	public Long getIdxcrmcolatask() {
		return this.idxcrmcolatask; 
	}
	
	public void setUpdatable(
		boolean var
	) {
		this.updatable=var; 
	}
	
	public boolean isUpdatable() {
		return this.updatable; 
	}
	
	public void setSubcrmtarea(
		List<Crmtarea> var
	) {
		this.subcrmtarea=var; 
	}
	
	public List<Crmtarea> getSubcrmtarea() {
		if(this.subcrmtarea==null)this.subcrmtarea=new ArrayList<>(0);
		  return this.subcrmtarea; 
	} 

}