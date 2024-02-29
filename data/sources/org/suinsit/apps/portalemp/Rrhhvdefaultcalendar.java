package org.suinsit.apps.portalemp;

import java.io.Serializable;
import java.lang.Long;
import java.lang.String;
import java.sql.Date;
import javax.persistence.Column;
import org.enartframework.nocode.annotacion.Entidad;

@Entidad (
	type = "VIEW" 
)
public class Rrhhvdefaultcalendar implements Serializable { 

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
		name = "SABADO",
		nullable = true 
	)
	private String sabado;
	@Column (
		name = "NOMBRE",
		nullable = true 
	)
	private String nombre;
	@Column (
		name = "VIERNES",
		nullable = true 
	)
	private String viernes;
	@Column (
		name = "TIPO",
		nullable = false 
	)
	private String tipo;
	@Column (
		name = "FECHA",
		nullable = false 
	)
	private Date fecha;
	@Column (
		name = "DESCRIPCIN",
		nullable = false 
	)
	private String descripcin;
	@Column (
		name = "IDXRRHHFESTIVOS",
		nullable = true 
	)
	private Long idxrrhhfestivos;
	@Column (
		name = "IDRRHHCALENDARIO0",
		nullable = true 
	)
	private Long idrrhhcalendario0;
	private boolean updatable; 

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
	
	public void setSabado(
		String var
	) {
		this.sabado=var; 
	}
	
	public String getSabado() {
		return this.sabado; 
	}
	
	public void setNombre(
		String var
	) {
		this.nombre=var; 
	}
	
	public String getNombre() {
		return this.nombre; 
	}
	
	public void setViernes(
		String var
	) {
		this.viernes=var; 
	}
	
	public String getViernes() {
		return this.viernes; 
	}
	
	public void setTipo(
		String var
	) {
		this.tipo=var; 
	}
	
	public String getTipo() {
		return this.tipo; 
	}
	
	public void setFecha(
		Date var
	) {
		this.fecha=var; 
	}
	
	public Date getFecha() {
		return this.fecha; 
	}
	
	public void setDescripcin(
		String var
	) {
		this.descripcin=var; 
	}
	
	public String getDescripcin() {
		return this.descripcin; 
	}
	
	public void setIdxrrhhfestivos(
		Long var
	) {
		this.idxrrhhfestivos=var; 
	}
	
	public Long getIdxrrhhfestivos() {
		return this.idxrrhhfestivos; 
	}
	
	public void setIdrrhhcalendario0(
		Long var
	) {
		this.idrrhhcalendario0=var; 
	}
	
	public Long getIdrrhhcalendario0() {
		return this.idrrhhcalendario0; 
	}
	
	public void setUpdatable(
		boolean var
	) {
		this.updatable=var; 
	}
	
	public boolean isUpdatable() {
		return this.updatable; 
	} 

}