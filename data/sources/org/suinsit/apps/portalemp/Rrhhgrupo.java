package org.suinsit.apps.portalemp;

import java.io.Serializable;
import java.lang.Long;
import java.lang.String;
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
import org.suinsit.apps.portalemp.Rrhhrempgrupo;

@Entity
@Table (
	name = "RRHHGRUPO" 
)
@Entidad (
	type = "TABLE",
	pk = "idxrrhhgrupo" 
)
public class Rrhhgrupo implements Serializable { 

	private static final long serialVersionUID = 1L;
	@Column (
		name = "COLOR",
		nullable = true 
	)
	private String color;
	@Id
	@Column (
		name = "IDXRRHHGRUPO",
		nullable = true 
	)
	private Long idxrrhhgrupo;
	@Column (
		name = "NOMBRE",
		nullable = false 
	)
	private String nombre;
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
	private List<Rrhhrempgrupo> subrrhhrempgrupo; 

	public void setColor(
		String var
	) {
		this.color=var; 
	}
	
	public String getColor() {
		return this.color; 
	}
	
	public void setIdxrrhhgrupo(
		Long var
	) {
		this.idxrrhhgrupo=var; 
	}
	
	public Long getIdxrrhhgrupo() {
		return this.idxrrhhgrupo; 
	}
	
	public void setNombre(
		String var
	) {
		this.nombre=var; 
	}
	
	public String getNombre() {
		return this.nombre; 
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
	
	public void setSubrrhhrempgrupo(
		List<Rrhhrempgrupo> var
	) {
		this.subrrhhrempgrupo=var; 
	}
	
	public List<Rrhhrempgrupo> getSubrrhhrempgrupo() {
		if(this.subrrhhrempgrupo==null)this.subrrhhrempgrupo=new ArrayList<>(0);
		  return this.subrrhhrempgrupo; 
	} 

}