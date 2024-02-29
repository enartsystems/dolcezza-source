package org.suinsit.apps.pmo;

import java.io.Serializable;
import java.lang.Long;
import java.lang.String;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import org.enartframework.nocode.annotacion.Entidad;
import org.enartframework.nocode.annotacion.Sequence;

@Entity
@Table (
	name = "PMOOBJETIVO" 
)
@Entidad (
	type = "TABLE",
	pk = "idxpmoobjetivo" 
)
public class Pmoobjetivo implements Serializable { 

	private static final long serialVersionUID = 1L;
	@Column (
		name = "DESCRIPCION",
		nullable = true 
	)
	private String descripcion;
	@Column (
		name = "OBJETIVO",
		nullable = false 
	)
	private String objetivo;
	@Column (
		name = "CODOBJETIVO",
		nullable = false 
	)
	@Sequence (
		name = "PMOOBJETIVO_CODOBJETIVO",
		prefix = "",
		mask = "00000",
		addYear = false 
	)
	private String codobjetivo;
	@Id
	@Column (
		name = "IDXPMOOBJETIVO",
		nullable = true 
	)
	private Long idxpmoobjetivo;
	private boolean updatable; 

	public void setDescripcion(
		String var
	) {
		this.descripcion=var; 
	}
	
	public String getDescripcion() {
		return this.descripcion; 
	}
	
	public void setObjetivo(
		String var
	) {
		this.objetivo=var; 
	}
	
	public String getObjetivo() {
		return this.objetivo; 
	}
	
	public void setCodobjetivo(
		String var
	) {
		this.codobjetivo=var; 
	}
	
	public String getCodobjetivo() {
		return this.codobjetivo; 
	}
	
	public void setIdxpmoobjetivo(
		Long var
	) {
		this.idxpmoobjetivo=var; 
	}
	
	public Long getIdxpmoobjetivo() {
		return this.idxpmoobjetivo; 
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