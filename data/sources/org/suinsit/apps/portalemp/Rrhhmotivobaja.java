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
	name = "RRHHMOTIVOBAJA" 
)
@Entidad (
	type = "TABLE",
	pk = "idxrrhhmotivobaja" 
)
public class Rrhhmotivobaja implements Serializable { 

	private static final long serialVersionUID = 1L;
	@Column (
		name = "MOTIVOBAJA",
		nullable = true 
	)
	private String motivobaja;
	@Id
	@Column (
		name = "IDXRRHHMOTIVOBAJA",
		nullable = true 
	)
	private Long idxrrhhmotivobaja;
	private boolean updatable;
	private List<Rrhempleado> subrrhempleado; 

	public void setMotivobaja(
		String var
	) {
		this.motivobaja=var; 
	}
	
	public String getMotivobaja() {
		return this.motivobaja; 
	}
	
	public void setIdxrrhhmotivobaja(
		Long var
	) {
		this.idxrrhhmotivobaja=var; 
	}
	
	public Long getIdxrrhhmotivobaja() {
		return this.idxrrhhmotivobaja; 
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