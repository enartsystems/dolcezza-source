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
	name = "RRHHMOTALTA" 
)
@Entidad (
	type = "TABLE",
	pk = "idxrrhhmotalta" 
)
public class Rrhhmotalta implements Serializable { 

	private static final long serialVersionUID = 1L;
	@Column (
		name = "MOTIVOALTA",
		nullable = true 
	)
	private String motivoalta;
	@Id
	@Column (
		name = "IDXRRHHMOTALTA",
		nullable = true 
	)
	private Long idxrrhhmotalta;
	private boolean updatable;
	private List<Rrhempleado> subrrhempleado; 

	public void setMotivoalta(
		String var
	) {
		this.motivoalta=var; 
	}
	
	public String getMotivoalta() {
		return this.motivoalta; 
	}
	
	public void setIdxrrhhmotalta(
		Long var
	) {
		this.idxrrhhmotalta=var; 
	}
	
	public Long getIdxrrhhmotalta() {
		return this.idxrrhhmotalta; 
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