package org.suinsit.apps.portalemp;

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
import org.suinsit.apps.portalemp.Rrhempleado;

@Entity
@Table (
	name = "RRHHMCATLAB" 
)
@Entidad (
	type = "TABLE",
	pk = "idxrrhhmcatlab" 
)
public class Rrhhmcatlab implements Serializable { 

	private static final long serialVersionUID = 1L;
	@Column (
		name = "CATEGORIA",
		nullable = true 
	)
	private String categoria;
	@Id
	@Column (
		name = "IDXRRHHMCATLAB",
		nullable = true 
	)
	private Long idxrrhhmcatlab;
	private boolean updatable;
	private List<Rrhempleado> subrrhempleado; 

	public void setCategoria(
		String var
	) {
		this.categoria=var; 
	}
	
	public String getCategoria() {
		return this.categoria; 
	}
	
	public void setIdxrrhhmcatlab(
		Long var
	) {
		this.idxrrhhmcatlab=var; 
	}
	
	public Long getIdxrrhhmcatlab() {
		return this.idxrrhhmcatlab; 
	}
	
	public void setUpdatable(
		boolean var
	) {
		this.updatable=var; 
	}
	
	public boolean isUpdatable() {
		return this.updatable; 
	}
	
	public void setSubrrhempleado(
		List<Rrhempleado> var
	) {
		this.subrrhempleado=var; 
	}
	
	public List<Rrhempleado> getSubrrhempleado() {
		if(this.subrrhempleado==null)this.subrrhempleado=new ArrayList<>(0);
		  return this.subrrhempleado; 
	} 

}