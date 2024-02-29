package org.suinsit.apps.subscripciones;

import java.io.Serializable;
import java.lang.Integer;
import java.lang.Long;
import java.lang.String;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import org.enartframework.nocode.annotacion.Entidad;

@Entity
@Table (
	name = "PERIODICIDAD" 
)
@Entidad (
	type = "TABLE",
	pk = "idxperiodicidad" 
)
public class Periodicidad implements Serializable { 

	private static final long serialVersionUID = 1L;
	@Column (
		name = "NUMDIAS",
		nullable = true 
	)
	private Integer numdias;
	@Column (
		name = "PERIODICIDAD",
		nullable = true 
	)
	private String periodicidad;
	@Id
	@Column (
		name = "IDXPERIODICIDAD",
		nullable = true 
	)
	private Long idxperiodicidad;
	private boolean updatable; 

	public void setNumdias(
		Integer var
	) {
		this.numdias=var; 
	}
	
	public Integer getNumdias() {
		return this.numdias; 
	}
	
	public void setPeriodicidad(
		String var
	) {
		this.periodicidad=var; 
	}
	
	public String getPeriodicidad() {
		return this.periodicidad; 
	}
	
	public void setIdxperiodicidad(
		Long var
	) {
		this.idxperiodicidad=var; 
	}
	
	public Long getIdxperiodicidad() {
		return this.idxperiodicidad; 
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