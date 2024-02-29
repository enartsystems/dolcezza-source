package org.suinsit.apps.admin;

import java.io.Serializable;
import java.lang.Long;
import java.lang.String;
import java.sql.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import org.enartframework.nocode.annotacion.Entidad;

@Entity
@Table (
	name = "MTIPOOPORTUNIDAD" 
)
@Entidad (
	type = "TABLE",
	pk = "idxtipooportunidad" 
)
public class Mtipooportunidad implements Serializable { 

	private static final long serialVersionUID = 1L;
	@Column (
		name = "BAJA",
		nullable = true 
	)
	private Date baja;
	@Id
	@Column (
		name = "IDXTIPOOPORTUNIDAD",
		nullable = true 
	)
	private Long idxtipooportunidad;
	@Column (
		name = "TIPOOPORTUNIDAD",
		nullable = false 
	)
	private String tipooportunidad;
	private boolean updatable; 

	public void setBaja(
		Date var
	) {
		this.baja=var; 
	}
	
	public Date getBaja() {
		return this.baja; 
	}
	
	public void setIdxtipooportunidad(
		Long var
	) {
		this.idxtipooportunidad=var; 
	}
	
	public Long getIdxtipooportunidad() {
		return this.idxtipooportunidad; 
	}
	
	public void setTipooportunidad(
		String var
	) {
		this.tipooportunidad=var; 
	}
	
	public String getTipooportunidad() {
		return this.tipooportunidad; 
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