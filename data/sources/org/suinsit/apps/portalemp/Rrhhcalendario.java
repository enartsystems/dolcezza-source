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
import org.suinsit.apps.portalemp.Rrhhcalenfest;
import org.suinsit.apps.portalemp.Rrhhfestivos;
import org.suinsit.apps.portalemp.Rrhhgrupo;

@Entity
@Table (
	name = "RRHHCALENDARIO" 
)
@Entidad (
	type = "TABLE",
	pk = "idxrrhhcalendario" 
)
public class Rrhhcalendario implements Serializable { 

	private static final long serialVersionUID = 1L;
	@Column (
		name = "FESTIVOS",
		nullable = true 
	)
	private boolean festivos;
	@Column (
		name = "DEFECTO",
		nullable = true 
	)
	private boolean defecto;
	@Column (
		name = "DESCRIPCION",
		nullable = true 
	)
	private String descripcion;
	@Column (
		name = "DOMINGO",
		nullable = true 
	)
	private String domingo;
	@Id
	@Column (
		name = "IDXRRHHCALENDARIO",
		nullable = true 
	)
	private Long idxrrhhcalendario;
	@Column (
		name = "JUEVES",
		nullable = true 
	)
	private String jueves;
	@Column (
		name = "LUNES",
		nullable = true 
	)
	private String lunes;
	@Column (
		name = "MARTES",
		nullable = true 
	)
	private String martes;
	@Column (
		name = "MIERCOLES",
		nullable = true 
	)
	private String miercoles;
	@Column (
		name = "NOMBRE",
		nullable = true 
	)
	private String nombre;
	@Column (
		name = "SABADO",
		nullable = true 
	)
	private String sabado;
	@Column (
		name = "VIERNES",
		nullable = true 
	)
	private String viernes;
	private boolean updatable;
	private List<Rrhhcalenfest> subrrhhcalenfest;
	private List<Rrhhgrupo> subrrhhgrupo;
	private List<Rrhhfestivos> subrrhhfestivos; 

	public void setFestivos(
		boolean var
	) {
		this.festivos=var; 
	}
	
	public boolean isFestivos() {
		return this.festivos; 
	}
	
	public void setDefecto(
		boolean var
	) {
		this.defecto=var; 
	}
	
	public boolean isDefecto() {
		return this.defecto; 
	}
	
	public void setDescripcion(
		String var
	) {
		this.descripcion=var; 
	}
	
	public String getDescripcion() {
		return this.descripcion; 
	}
	
	public void setDomingo(
		String var
	) {
		this.domingo=var; 
	}
	
	public String getDomingo() {
		return this.domingo; 
	}
	
	public void setIdxrrhhcalendario(
		Long var
	) {
		this.idxrrhhcalendario=var; 
	}
	
	public Long getIdxrrhhcalendario() {
		return this.idxrrhhcalendario; 
	}
	
	public void setJueves(
		String var
	) {
		this.jueves=var; 
	}
	
	public String getJueves() {
		return this.jueves; 
	}
	
	public void setLunes(
		String var
	) {
		this.lunes=var; 
	}
	
	public String getLunes() {
		return this.lunes; 
	}
	
	public void setMartes(
		String var
	) {
		this.martes=var; 
	}
	
	public String getMartes() {
		return this.martes; 
	}
	
	public void setMiercoles(
		String var
	) {
		this.miercoles=var; 
	}
	
	public String getMiercoles() {
		return this.miercoles; 
	}
	
	public void setNombre(
		String var
	) {
		this.nombre=var; 
	}
	
	public String getNombre() {
		return this.nombre; 
	}
	
	public void setSabado(
		String var
	) {
		this.sabado=var; 
	}
	
	public String getSabado() {
		return this.sabado; 
	}
	
	public void setViernes(
		String var
	) {
		this.viernes=var; 
	}
	
	public String getViernes() {
		return this.viernes; 
	}
	
	public void setUpdatable(
		boolean var
	) {
		this.updatable=var; 
	}
	
	public boolean isUpdatable() {
		return this.updatable; 
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
	
	public void setSubrrhhgrupo(
		List<Rrhhgrupo> var
	) {
		this.subrrhhgrupo=var; 
	}
	
	public List<Rrhhgrupo> getSubrrhhgrupo() {
		if(this.subrrhhgrupo==null)this.subrrhhgrupo=new ArrayList<>(0);
		  return this.subrrhhgrupo; 
	}
	
	public void setSubrrhhfestivos(
		List<Rrhhfestivos> var
	) {
		this.subrrhhfestivos=var; 
	}
	
	public List<Rrhhfestivos> getSubrrhhfestivos() {
		if(this.subrrhhfestivos==null)this.subrrhhfestivos=new ArrayList<>(0);
		  return this.subrrhhfestivos; 
	} 

}