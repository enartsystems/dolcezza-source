package org.suinsit.apps.partners;

import java.io.Serializable;
import java.lang.Long;
import java.lang.String;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import org.enartframework.nocode.annotacion.Entidad;
import org.suinsit.apps.partners.Nivel;

@Entity
@Table (
	name = "TIPOPARTNER" 
)
@Entidad (
	type = "TABLE",
	pk = "idxtipopartner" 
)
public class Tipopartner implements Serializable { 

	private static final long serialVersionUID = 1L;
	@Column (
		name = "DESCRIPCION",
		nullable = true 
	)
	private String descripcion;
	@Id
	@Column (
		name = "IDXTIPOPARTNER",
		nullable = true 
	)
	private Long idxtipopartner;
	@Column (
		name = "PRESCRIPTOR",
		nullable = true 
	)
	private boolean prescriptor;
	@Column (
		name = "TIPOPARTNER",
		nullable = true 
	)
	private String tipopartner;
	private boolean updatable;
	@ManyToOne (
		fetch = javax.persistence.FetchType.LAZY 
	)
	@JoinColumn (
		name = "IDNIVEL0",
		referencedColumnName = "IDXNIVEL",
		nullable = true,
		insertable = true,
		updatable = true 
	)
	private Nivel idnivel; 

	public void setDescripcion(
		String var
	) {
		this.descripcion=var; 
	}
	
	public String getDescripcion() {
		return this.descripcion; 
	}
	
	public void setIdxtipopartner(
		Long var
	) {
		this.idxtipopartner=var; 
	}
	
	public Long getIdxtipopartner() {
		return this.idxtipopartner; 
	}
	
	public void setPrescriptor(
		boolean var
	) {
		this.prescriptor=var; 
	}
	
	public boolean isPrescriptor() {
		return this.prescriptor; 
	}
	
	public void setTipopartner(
		String var
	) {
		this.tipopartner=var; 
	}
	
	public String getTipopartner() {
		return this.tipopartner; 
	}
	
	public void setUpdatable(
		boolean var
	) {
		this.updatable=var; 
	}
	
	public boolean isUpdatable() {
		return this.updatable; 
	}
	
	public void setIdnivel(
		Nivel var
	) {
		this.idnivel=var; 
	}
	
	public Nivel getIdnivel() {
		if(this.idnivel==null)this.idnivel=new org.suinsit.apps.partners.Nivel();
		  return this.idnivel; 
	} 

}