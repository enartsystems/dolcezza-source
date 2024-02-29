package org.suinsit.apps.facturacin;

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
	name = "ERPMGRUPOCTACTBLE" 
)
@Entidad (
	type = "TABLE",
	pk = "idxerpmgrupoctactble" 
)
public class Erpmgrupoctactble implements Serializable { 

	private static final long serialVersionUID = 1L;
	@Column (
		name = "DESCRIPCION",
		nullable = true 
	)
	private String descripcion;
	@Column (
		name = "GRUPO",
		nullable = true 
	)
	private Integer grupo;
	@Id
	@Column (
		name = "IDXERPMGRUPOCTACTBLE",
		nullable = true 
	)
	private Long idxerpmgrupoctactble;
	private boolean updatable; 

	public void setDescripcion(
		String var
	) {
		this.descripcion=var; 
	}
	
	public String getDescripcion() {
		return this.descripcion; 
	}
	
	public void setGrupo(
		Integer var
	) {
		this.grupo=var; 
	}
	
	public Integer getGrupo() {
		return this.grupo; 
	}
	
	public void setIdxerpmgrupoctactble(
		Long var
	) {
		this.idxerpmgrupoctactble=var; 
	}
	
	public Long getIdxerpmgrupoctactble() {
		return this.idxerpmgrupoctactble; 
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