package org.suinsit.apps.mrp;

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
	name = "MRPMTIPOOPERA" 
)
@Entidad (
	type = "TABLE",
	pk = "idxmrpmtipoopera" 
)
public class Mrpmtipoopera implements Serializable { 

	private static final long serialVersionUID = 1L;
	@Id
	@Column (
		name = "idxmrpmtipoopera",
		nullable = true 
	)
	private Long idxmrpmtipoopera;
	@Column (
		name = "tipoopera",
		nullable = true 
	)
	private String tipoopera;
	private boolean updatable; 

	public void setIdxmrpmtipoopera(
		Long var
	) {
		this.idxmrpmtipoopera=var; 
	}
	
	public Long getIdxmrpmtipoopera() {
		return this.idxmrpmtipoopera; 
	}
	
	public void setTipoopera(
		String var
	) {
		this.tipoopera=var; 
	}
	
	public String getTipoopera() {
		return this.tipoopera; 
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