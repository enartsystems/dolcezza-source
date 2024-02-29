package org.suinsit.apps.portalemp;

import java.io.Serializable;
import java.lang.Long;
import java.lang.String;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import org.enartframework.nocode.annotacion.Entidad;
import org.suinsit.apps.portalemp.Rrhhcalendario;
import org.suinsit.apps.portalemp.Rrhhcalenfest;

@Entity
@Table (
	name = "RRHHFESTIVOS" 
)
@Entidad (
	type = "TABLE",
	pk = "idxrrhhfestivos" 
)
public class Rrhhfestivos implements Serializable { 

	private static final long serialVersionUID = 1L;
	@Column (
		name = "DESCRIPCIN",
		nullable = false 
	)
	private String descripcin;
	@Column (
		name = "FECHA",
		nullable = false 
	)
	private Date fecha;
	@Id
	@Column (
		name = "IDXRRHHFESTIVOS",
		nullable = true 
	)
	private Long idxrrhhfestivos;
	@Column (
		name = "TIPO",
		nullable = false 
	)
	private String tipo;
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
	private List<Rrhhcalenfest> subrrhhcalenfest; 

	public void setDescripcin(
		String var
	) {
		this.descripcin=var; 
	}
	
	public String getDescripcin() {
		return this.descripcin; 
	}
	
	public void setFecha(
		Date var
	) {
		this.fecha=var; 
	}
	
	public Date getFecha() {
		return this.fecha; 
	}
	
	public void setIdxrrhhfestivos(
		Long var
	) {
		this.idxrrhhfestivos=var; 
	}
	
	public Long getIdxrrhhfestivos() {
		return this.idxrrhhfestivos; 
	}
	
	public void setTipo(
		String var
	) {
		this.tipo=var; 
	}
	
	public String getTipo() {
		return this.tipo; 
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
	
	public void setSubrrhhcalenfest(
		List<Rrhhcalenfest> var
	) {
		this.subrrhhcalenfest=var; 
	}
	
	public List<Rrhhcalenfest> getSubrrhhcalenfest() {
		if(this.subrrhhcalenfest==null)this.subrrhhcalenfest=new ArrayList<>(0);
		  return this.subrrhhcalenfest; 
	} 

}