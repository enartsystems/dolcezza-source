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
	name = "PMOESTADO" 
)
@Entidad (
	type = "TABLE",
	pk = "idxpmoestado" 
)
public class Pmoestado implements Serializable { 

	private static final long serialVersionUID = 1L;
	@Column (
		name = "ESTADO",
		nullable = true 
	)
	private String estado;
	@Id
	@Column (
		name = "IDXPMOESTADO",
		nullable = true 
	)
	private Long idxpmoestado;
	private boolean updatable;
	private List<Pmotipoproyect> subpmotipoproyect; 

	public void setEstado(
		String var
	) {
		this.estado=var; 
	}
	
	public String getEstado() {
		return this.estado; 
	}
	
	public void setIdxpmoestado(
		Long var
	) {
		this.idxpmoestado=var; 
	}
	
	public Long getIdxpmoestado() {
		return this.idxpmoestado; 
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