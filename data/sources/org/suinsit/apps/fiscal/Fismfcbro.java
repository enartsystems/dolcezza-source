package org.suinsit.apps.fiscal;

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
	name = "FISMFCBRO" 
)
@Entidad (
	type = "TABLE",
	pk = "idxfismfcbro" 
)
public class Fismfcbro implements Serializable { 

	private static final long serialVersionUID = 1L;
	@Column (
		name = "CTACTBLE",
		nullable = true 
	)
	private String ctactble;
	@Column (
		name = "FORMACBRO",
		nullable = true 
	)
	private String formacbro;
	@Id
	@Column (
		name = "IDXFISMFCBRO",
		nullable = true 
	)
	private Long idxfismfcbro;
	private boolean updatable; 

	public void setCtactble(
		String var
	) {
		this.ctactble=var; 
	}
	
	public String getCtactble() {
		return this.ctactble; 
	}
	
	public void setFormacbro(
		String var
	) {
		this.formacbro=var; 
	}
	
	public String getFormacbro() {
		return this.formacbro; 
	}
	
	public void setIdxfismfcbro(
		Long var
	) {
		this.idxfismfcbro=var; 
	}
	
	public Long getIdxfismfcbro() {
		return this.idxfismfcbro; 
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