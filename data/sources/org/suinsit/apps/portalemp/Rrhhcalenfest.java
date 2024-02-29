package org.suinsit.apps.portalemp;

import java.io.Serializable;
import java.lang.Long;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import org.enartframework.nocode.annotacion.Entidad;
import org.suinsit.apps.portalemp.Rrhhcalendario;
import org.suinsit.apps.portalemp.Rrhhfestivos;

@Entity
@Table (
	name = "RRHHCALENFEST" 
)
@Entidad (
	type = "TABLE",
	pk = "idxrrhhcalenfest" 
)
public class Rrhhcalenfest implements Serializable { 

	private static final long serialVersionUID = 1L;
	@Id
	@Column (
		name = "IDXRRHHCALENFEST",
		nullable = true 
	)
	private Long idxrrhhcalenfest;
	private boolean updatable;
	@ManyToOne (
		fetch = javax.persistence.FetchType.LAZY 
	)
	@JoinColumn (
		name = "IDRRHHCALENDARIO0",
		referencedColumnName = "IDXRRHHCALENDARIO",
		nullable = true,
		insertable = true,
		updatable = true 
	)
	private Rrhhcalendario idrrhhcalendario;
	@ManyToOne (
		fetch = javax.persistence.FetchType.LAZY 
	)
	@JoinColumn (
		name = "IDRRHHFESTIVOS0",
		referencedColumnName = "IDXRRHHFESTIVOS",
		nullable = true,
		insertable = true,
		updatable = true 
	)
	private Rrhhfestivos idrrhhfestivos; 

	public void setIdxrrhhcalenfest(
		Long var
	) {
		this.idxrrhhcalenfest=var; 
	}
	
	public Long getIdxrrhhcalenfest() {
		return this.idxrrhhcalenfest; 
	}
	
	public void setUpdatable(
		boolean var
	) {
		this.updatable=var; 
	}
	
	public boolean isUpdatable() {
		return this.updatable; 
	}
	
	public void setIdrrhhcalendario(
		Rrhhcalendario var
	) {
		this.idrrhhcalendario=var; 
	}
	
	public Rrhhcalendario getIdrrhhcalendario() {
		if(this.idrrhhcalendario==null)this.idrrhhcalendario=new org.suinsit.apps.portalemp.Rrhhcalendario();
		  return this.idrrhhcalendario; 
	}
	
	public void setIdrrhhfestivos(
		Rrhhfestivos var
	) {
		this.idrrhhfestivos=var; 
	}
	
	public Rrhhfestivos getIdrrhhfestivos() {
		if(this.idrrhhfestivos==null)this.idrrhhfestivos=new org.suinsit.apps.portalemp.Rrhhfestivos();
		  return this.idrrhhfestivos; 
	} 

}