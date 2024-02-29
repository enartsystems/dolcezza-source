package org.suinsit.apps.pmo;

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
import org.suinsit.apps.pmo.Pmomactividad;

@Entity
@Table (
	name = "PMOPROCESO" 
)
@Entidad (
	type = "TABLE",
	pk = "idxpmoproceso" 
)
public class Pmoproceso implements Serializable { 

	private static final long serialVersionUID = 1L;
	@Column (
		name = "DESCRIPCION",
		nullable = true 
	)
	private String descripcion;
	@Id
	@Column (
		name = "IDXPMOPROCESO",
		nullable = true 
	)
	private Long idxpmoproceso;
	@Column (
		name = "PROCESO",
		nullable = true 
	)
	private String proceso;
	private boolean updatable;
	@ManyToOne (
		fetch = javax.persistence.FetchType.LAZY 
	)
	@JoinColumn (
		name = "IDPMOMACTIVIDAD0",
		referencedColumnName = "IDXPMOMACTIVIDAD",
		nullable = true,
		insertable = true,
		updatable = true 
	)
	private Pmomactividad idpmomactividad; 

	public void setDescripcion(
		String var
	) {
		this.descripcion=var; 
	}
	
	public String getDescripcion() {
		return this.descripcion; 
	}
	
	public void setIdxpmoproceso(
		Long var
	) {
		this.idxpmoproceso=var; 
	}
	
	public Long getIdxpmoproceso() {
		return this.idxpmoproceso; 
	}
	
	public void setProceso(
		String var
	) {
		this.proceso=var; 
	}
	
	public String getProceso() {
		return this.proceso; 
	}
	
	public void setUpdatable(
		boolean var
	) {
		this.updatable=var; 
	}
	
	public boolean isUpdatable() {
		return this.updatable; 
	}
	
	public void setIdpmomactividad(
		Pmomactividad var
	) {
		this.idpmomactividad=var; 
	}
	
	public Pmomactividad getIdpmomactividad() {
		if(this.idpmomactividad==null)this.idpmomactividad=new org.suinsit.apps.pmo.Pmomactividad();
		  return this.idpmomactividad; 
	} 

}