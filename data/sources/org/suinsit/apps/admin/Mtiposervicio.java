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
	name = "MTIPOSERVICIO" 
)
@Entidad (
	type = "TABLE",
	pk = "idxmtiposervicio" 
)
public class Mtiposervicio implements Serializable { 

	private static final long serialVersionUID = 1L;
	@Column (
		name = "TIPOSERVICIO",
		nullable = true 
	)
	private String tiposervicio;
	@Id
	@Column (
		name = "IDXMTIPOSERVICIO",
		nullable = true 
	)
	private Long idxmtiposervicio;
	private boolean updatable; 

	public void setTiposervicio(
		String var
	) {
		this.tiposervicio=var; 
	}
	
	public String getTiposervicio() {
		return this.tiposervicio; 
	}
	
	public void setIdxmtiposervicio(
		Long var
	) {
		this.idxmtiposervicio=var; 
	}
	
	public Long getIdxmtiposervicio() {
		return this.idxmtiposervicio; 
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