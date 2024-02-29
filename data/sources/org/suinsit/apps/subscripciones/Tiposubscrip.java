package org.suinsit.apps.subscripciones;

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
	name = "TIPOSUBSCRIP" 
)
@Entidad (
	type = "TABLE",
	pk = "idxtiposubscrip" 
)
public class Tiposubscrip implements Serializable { 

	private static final long serialVersionUID = 1L;
	@Column (
		name = "DESCRIPCION",
		nullable = true 
	)
	private String descripcion;
	@Column (
		name = "ALTA",
		nullable = true 
	)
	private Date alta;
	@Column (
		name = "TIPO",
		nullable = true 
	)
	private String tipo;
	@Id
	@Column (
		name = "IDXTIPOSUBSCRIP",
		nullable = true 
	)
	private Long idxtiposubscrip;
	private boolean updatable; 

	public void setDescripcion(
		String var
	) {
		this.descripcion=var; 
	}
	
	public String getDescripcion() {
		return this.descripcion; 
	}
	
	public void setAlta(
		Date var
	) {
		this.alta=var; 
	}
	
	public Date getAlta() {
		return this.alta; 
	}
	
	public void setTipo(
		String var
	) {
		this.tipo=var; 
	}
	
	public String getTipo() {
		return this.tipo; 
	}
	
	public void setIdxtiposubscrip(
		Long var
	) {
		this.idxtiposubscrip=var; 
	}
	
	public Long getIdxtiposubscrip() {
		return this.idxtiposubscrip; 
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