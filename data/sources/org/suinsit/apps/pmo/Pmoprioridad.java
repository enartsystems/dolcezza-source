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
	name = "PMOPRIORIDAD" 
)
@Entidad (
	type = "TABLE",
	pk = "idxpmoprioridad" 
)
public class Pmoprioridad implements Serializable { 

	private static final long serialVersionUID = 1L;
	@Column (
		name = "PRIORIDAD",
		nullable = false 
	)
	private String prioridad;
	@Id
	@Column (
		name = "IDXPMOPRIORIDAD",
		nullable = true 
	)
	private Long idxpmoprioridad;
	private boolean updatable;
	private List<Pmotipoproyect> subpmotipoproyect; 

	public void setPrioridad(
		String var
	) {
		this.prioridad=var; 
	}
	
	public String getPrioridad() {
		return this.prioridad; 
	}
	
	public void setIdxpmoprioridad(
		Long var
	) {
		this.idxpmoprioridad=var; 
	}
	
	public Long getIdxpmoprioridad() {
		return this.idxpmoprioridad; 
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