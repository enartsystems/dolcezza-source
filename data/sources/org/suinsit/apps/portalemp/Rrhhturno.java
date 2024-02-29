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
import org.suinsit.apps.portalemp.Rhfichar;
import org.suinsit.apps.portalemp.Rrhhausencia;

@Entity
@Table (
	name = "RRHHTURNO" 
)
@Entidad (
	type = "TABLE",
	pk = "idxrrhhturno" 
)
public class Rrhhturno implements Serializable { 

	private static final long serialVersionUID = 1L;
	@Column (
		name = "DIASAPLICA",
		nullable = true 
	)
	private String diasaplica;
	@Column (
		name = "COLORBORDE",
		nullable = true 
	)
	private String colorborde;
	@Column (
		name = "COLORFONDO",
		nullable = true 
	)
	private String colorfondo;
	@Column (
		name = "TIPOTURNO",
		nullable = true 
	)
	private String tipoturno;
	@Column (
		name = "DESCRIPCION",
		nullable = true 
	)
	private String descripcion;
	@Column (
		name = "NOMBRE",
		nullable = true 
	)
	private String nombre;
	@Id
	@Column (
		name = "IDXRRHHTURNO",
		nullable = true 
	)
	private Long idxrrhhturno;
	private boolean updatable;
	private List<Rrhhausencia> subrrhhausencia;
	private List<Rhfichar> subrhfichar; 

	public void setDiasaplica(
		String var
	) {
		this.diasaplica=var; 
	}
	
	public String getDiasaplica() {
		return this.diasaplica; 
	}
	
	public void setColorborde(
		String var
	) {
		this.colorborde=var; 
	}
	
	public String getColorborde() {
		return this.colorborde; 
	}
	
	public void setColorfondo(
		String var
	) {
		this.colorfondo=var; 
	}
	
	public String getColorfondo() {
		return this.colorfondo; 
	}
	
	public void setTipoturno(
		String var
	) {
		this.tipoturno=var; 
	}
	
	public String getTipoturno() {
		return this.tipoturno; 
	}
	
	public void setDescripcion(
		String var
	) {
		this.descripcion=var; 
	}
	
	public String getDescripcion() {
		return this.descripcion; 
	}
	
	public void setNombre(
		String var
	) {
		this.nombre=var; 
	}
	
	public String getNombre() {
		return this.nombre; 
	}
	
	public void setIdxrrhhturno(
		Long var
	) {
		this.idxrrhhturno=var; 
	}
	
	public Long getIdxrrhhturno() {
		return this.idxrrhhturno; 
	}
	
	public void setUpdatable(
		boolean var
	) {
		this.updatable=var; 
	}
	
	public boolean isUpdatable() {
		return this.updatable; 
	}
	
	public void setSubrrhhausencia(
		List<Rrhhausencia> var
	) {
		this.subrrhhausencia=var; 
	}
	
	public List<Rrhhausencia> getSubrrhhausencia() {
		if(this.subrrhhausencia==null)this.subrrhhausencia=new ArrayList<>(0);
		  return this.subrrhhausencia; 
	}
	
	public void setSubrhfichar(
		List<Rhfichar> var
	) {
		this.subrhfichar=var; 
	}
	
	public List<Rhfichar> getSubrhfichar() {
		if(this.subrhfichar==null)this.subrhfichar=new ArrayList<>(0);
		  return this.subrhfichar; 
	} 

}