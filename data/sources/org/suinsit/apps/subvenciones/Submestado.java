package org.suinsit.apps.subvenciones;

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
import org.suinsit.apps.subvenciones.Subsolictudes;

@Entity
@Table (
	name = "SUBMESTADO" 
)
@Entidad (
	type = "TABLE",
	pk = "idxsubmestado" 
)
public class Submestado implements Serializable { 

	private static final long serialVersionUID = 1L;
	@Column (
		name = "ESTADO",
		nullable = true 
	)
	private String estado;
	@Id
	@Column (
		name = "IDXSUBMESTADO",
		nullable = true 
	)
	private Long idxsubmestado;
	private boolean updatable;
	private List<Subsolictudes> subsubsolictudes; 

	public void setEstado(
		String var
	) {
		this.estado=var; 
	}
	
	public String getEstado() {
		return this.estado; 
	}
	
	public void setIdxsubmestado(
		Long var
	) {
		this.idxsubmestado=var; 
	}
	
	public Long getIdxsubmestado() {
		return this.idxsubmestado; 
	}
	
	public void setUpdatable(
		boolean var
	) {
		this.updatable=var; 
	}
	
	public boolean isUpdatable() {
		return this.updatable; 
	}
	
	public void setSubsubsolictudes(
		List<Subsolictudes> var
	) {
		this.subsubsolictudes=var; 
	}
	
	public List<Subsolictudes> getSubsubsolictudes() {
		if(this.subsubsolictudes==null)this.subsubsolictudes=new ArrayList<>(0);
		  return this.subsubsolictudes; 
	} 

}