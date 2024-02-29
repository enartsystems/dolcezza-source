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
	name = "FISMFPAGO" 
)
@Entidad (
	type = "TABLE",
	pk = "idxfismfpago" 
)
public class Fismfpago implements Serializable { 

	private static final long serialVersionUID = 1L;
	@Column (
		name = "CTACTBLE",
		nullable = true 
	)
	private String ctactble;
	@Column (
		name = "FORMADEPAGO",
		nullable = true 
	)
	private String formadepago;
	@Id
	@Column (
		name = "IDXFISMFPAGO",
		nullable = true 
	)
	private Long idxfismfpago;
	private boolean updatable; 

	public void setCtactble(
		String var
	) {
		this.ctactble=var; 
	}
	
	public String getCtactble() {
		return this.ctactble; 
	}
	
	public void setFormadepago(
		String var
	) {
		this.formadepago=var; 
	}
	
	public String getFormadepago() {
		return this.formadepago; 
	}
	
	public void setIdxfismfpago(
		Long var
	) {
		this.idxfismfpago=var; 
	}
	
	public Long getIdxfismfpago() {
		return this.idxfismfpago; 
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