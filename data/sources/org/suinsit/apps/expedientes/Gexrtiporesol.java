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
	name = "GEXRTIPORESOL" 
)
@Entidad (
	type = "TABLE",
	pk = "idxgexrtiporesol" 
)
public class Gexrtiporesol implements Serializable { 

	private static final long serialVersionUID = 1L;
	@Column (
		name = "TIPORESOLUCION",
		nullable = true 
	)
	private String tiporesolucion;
	@Id
	@Column (
		name = "IDXGEXRTIPORESOL",
		nullable = true 
	)
	private Long idxgexrtiporesol;
	private boolean updatable; 

	public void setTiporesolucion(
		String var
	) {
		this.tiporesolucion=var; 
	}
	
	public String getTiporesolucion() {
		return this.tiporesolucion; 
	}
	
	public void setIdxgexrtiporesol(
		Long var
	) {
		this.idxgexrtiporesol=var; 
	}
	
	public Long getIdxgexrtiporesol() {
		return this.idxgexrtiporesol; 
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