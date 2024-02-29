package org.suinsit.apps.notificaciones;

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
	name = "NOTMPRIORIDAD" 
)
@Entidad (
	type = "TABLE",
	pk = "idxnotmprioridad" 
)
public class Notmprioridad implements Serializable { 

	private static final long serialVersionUID = 1L;
	@Column (
		name = "COLOR",
		nullable = true 
	)
	private String color;
	@Id
	@Column (
		name = "IDXNOTMPRIORIDAD",
		nullable = true 
	)
	private Long idxnotmprioridad;
	@Column (
		name = "PRIORIDAD",
		nullable = true 
	)
	private String prioridad;
	private boolean updatable; 

	public void setColor(
		String var
	) {
		this.color=var; 
	}
	
	public String getColor() {
		return this.color; 
	}
	
	public void setIdxnotmprioridad(
		Long var
	) {
		this.idxnotmprioridad=var; 
	}
	
	public Long getIdxnotmprioridad() {
		return this.idxnotmprioridad; 
	}
	
	public void setPrioridad(
		String var
	) {
		this.prioridad=var; 
	}
	
	public String getPrioridad() {
		return this.prioridad; 
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