package org.suinsit.apps.asesor4;

import java.io.Serializable;
import java.lang.Long;
import java.lang.String;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import org.enartframework.nocode.annotacion.Entidad;

@Entity
@Table (
	name = "MKTPLANTILLA" 
)
@Entidad (
	type = "TABLE",
	pk = "idxplantilla" 
)
public class Mktplantilla implements Serializable { 

	private static final long serialVersionUID = 1L;
	@Column (
		name = "CONTENIDO",
		nullable = true 
	)
	private String contenido;
	@Column (
		name = "NOMBRE",
		nullable = false 
	)
	private String nombre;
	@Id
	@Column (
		name = "IDXPLANTILLA",
		nullable = true 
	)
	private Long idxplantilla;
	private boolean updatable; 

	public void setContenido(
		String var
	) {
		this.contenido=var; 
	}
	
	public String getContenido() {
		return this.contenido; 
	}
	
	public void setNombre(
		String var
	) {
		this.nombre=var; 
	}
	
	public String getNombre() {
		return this.nombre; 
	}
	
	public void setIdxplantilla(
		Long var
	) {
		this.idxplantilla=var; 
	}
	
	public Long getIdxplantilla() {
		return this.idxplantilla; 
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