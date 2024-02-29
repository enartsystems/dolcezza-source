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
	name = "PMOAPROBACION" 
)
@Entidad (
	type = "TABLE",
	pk = "idxpmoaprobacion" 
)
public class Pmoaprobacion implements Serializable { 

	private static final long serialVersionUID = 1L;
	@Column (
		name = "APROBADO",
		nullable = true 
	)
	private boolean aprobado;
	@Column (
		name = "APROBACION",
		nullable = false 
	)
	private String aprobacion;
	@Id
	@Column (
		name = "IDXPMOAPROBACION",
		nullable = true 
	)
	private Long idxpmoaprobacion;
	private boolean updatable;
	private List<Pmotipoproyect> subpmotipoproyect; 

	public void setAprobado(
		boolean var
	) {
		this.aprobado=var; 
	}
	
	public boolean isAprobado() {
		return this.aprobado; 
	}
	
	public void setAprobacion(
		String var
	) {
		this.aprobacion=var; 
	}
	
	public String getAprobacion() {
		return this.aprobacion; 
	}
	
	public void setIdxpmoaprobacion(
		Long var
	) {
		this.idxpmoaprobacion=var; 
	}
	
	public Long getIdxpmoaprobacion() {
		return this.idxpmoaprobacion; 
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