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
	name = "RRHHESTADOEMP" 
)
@Entidad (
	type = "TABLE",
	pk = "idxrrhhestadoemp" 
)
public class Rrhhestadoemp implements Serializable { 

	private static final long serialVersionUID = 1L;
	@Id
	@Column (
		name = "IDXRRHHESTADOEMP",
		nullable = true 
	)
	private Long idxrrhhestadoemp;
	@Column (
		name = "ESTADO",
		nullable = false 
	)
	private String estado;
	private boolean updatable;
	private List<Rrhempleado> subrrhempleado; 

	public void setIdxrrhhestadoemp(
		Long var
	) {
		this.idxrrhhestadoemp=var; 
	}
	
	public Long getIdxrrhhestadoemp() {
		return this.idxrrhhestadoemp; 
	}
	
	public void setEstado(
		String var
	) {
		this.estado=var; 
	}
	
	public String getEstado() {
		return this.estado; 
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