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
	name = "RRHHCARGOLAB" 
)
@Entidad (
	type = "TABLE",
	pk = "idxrrhhcargolab" 
)
public class Rrhhcargolab implements Serializable { 

	private static final long serialVersionUID = 1L;
	@Column (
		name = "MANDOINTER",
		nullable = true 
	)
	private boolean mandointer;
	@Column (
		name = "DIRECTIVO",
		nullable = true 
	)
	private boolean directivo;
	@Column (
		name = "CARGO",
		nullable = true 
	)
	private String cargo;
	@Id
	@Column (
		name = "IDXRRHHCARGOLAB",
		nullable = true 
	)
	private Long idxrrhhcargolab;
	private boolean updatable;
	private List<Rrhempleado> subrrhempleado; 

	public void setMandointer(
		boolean var
	) {
		this.mandointer=var; 
	}
	
	public boolean isMandointer() {
		return this.mandointer; 
	}
	
	public void setDirectivo(
		boolean var
	) {
		this.directivo=var; 
	}
	
	public boolean isDirectivo() {
		return this.directivo; 
	}
	
	public void setCargo(
		String var
	) {
		this.cargo=var; 
	}
	
	public String getCargo() {
		return this.cargo; 
	}
	
	public void setIdxrrhhcargolab(
		Long var
	) {
		this.idxrrhhcargolab=var; 
	}
	
	public Long getIdxrrhhcargolab() {
		return this.idxrrhhcargolab; 
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