package org.suinsit.apps.expedientes;

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
	name = "GEXMTIPOREQ" 
)
@Entidad (
	type = "TABLE",
	pk = "idxgexmtiporeq" 
)
public class Gexmtiporeq implements Serializable { 

	private static final long serialVersionUID = 1L;
	@Column (
		name = "PLANTILLAESCRITO",
		nullable = true 
	)
	private String plantillaescrito;
	@Column (
		name = "ADJUNTARDOC",
		nullable = true 
	)
	private boolean adjuntardoc;
	@Column (
		name = "DESCRIPCION",
		nullable = true 
	)
	private String descripcion;
	@Column (
		name = "TIPOREQUISITO",
		nullable = false 
	)
	private String tiporequisito;
	@Id
	@Column (
		name = "IDXGEXMTIPOREQ",
		nullable = true 
	)
	private Long idxgexmtiporeq;
	private boolean updatable; 

	public void setPlantillaescrito(
		String var
	) {
		this.plantillaescrito=var; 
	}
	
	public String getPlantillaescrito() {
		return this.plantillaescrito; 
	}
	
	public void setAdjuntardoc(
		boolean var
	) {
		this.adjuntardoc=var; 
	}
	
	public boolean isAdjuntardoc() {
		return this.adjuntardoc; 
	}
	
	public void setDescripcion(
		String var
	) {
		this.descripcion=var; 
	}
	
	public String getDescripcion() {
		return this.descripcion; 
	}
	
	public void setTiporequisito(
		String var
	) {
		this.tiporequisito=var; 
	}
	
	public String getTiporequisito() {
		return this.tiporequisito; 
	}
	
	public void setIdxgexmtiporeq(
		Long var
	) {
		this.idxgexmtiporeq=var; 
	}
	
	public Long getIdxgexmtiporeq() {
		return this.idxgexmtiporeq; 
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