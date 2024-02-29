package org.suinsit.apps.admin;

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
	name = "MTIPOTASK" 
)
@Entidad (
	type = "TABLE",
	pk = "idxtipotask" 
)
public class Mtipotask implements Serializable { 

	private static final long serialVersionUID = 1L;
	@Column (
		name = "COLOR",
		nullable = true 
	)
	private String color;
	@Id
	@Column (
		name = "IDXTIPOTASK",
		nullable = true 
	)
	private Long idxtipotask;
	@Column (
		name = "TIPOTAREA",
		nullable = false 
	)
	private String tipotarea;
	private boolean updatable; 

	public void setColor(
		String var
	) {
		this.color=var; 
	}
	
	public String getColor() {
		return this.color; 
	}
	
	public void setIdxtipotask(
		Long var
	) {
		this.idxtipotask=var; 
	}
	
	public Long getIdxtipotask() {
		return this.idxtipotask; 
	}
	
	public void setTipotarea(
		String var
	) {
		this.tipotarea=var; 
	}
	
	public String getTipotarea() {
		return this.tipotarea; 
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