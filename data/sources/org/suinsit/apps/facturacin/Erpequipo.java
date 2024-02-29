package org.suinsit.apps.facturacin;

import java.io.Serializable;
import java.lang.Long;
import java.lang.String;
import java.math.BigDecimal;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import org.enartframework.nocode.annotacion.Entidad;
import org.suinsit.apps.facturacin.Erpcomercial;

@Entity
@Table (
	name = "ERPEQUIPO" 
)
@Entidad (
	type = "TABLE",
	pk = "idxerpequipo" 
)
public class Erpequipo implements Serializable { 

	private static final long serialVersionUID = 1L;
	@Column (
		name = "DESCRIPCION",
		nullable = true 
	)
	private String descripcion;
	@Column (
		name = "EQUIPO",
		nullable = true 
	)
	private String equipo;
	@Id
	@Column (
		name = "IDXERPEQUIPO",
		nullable = true 
	)
	private Long idxerpequipo;
	@Column (
		name = "OBJETIVO",
		nullable = true 
	)
	private BigDecimal objetivo;
	private boolean updatable;
	@ManyToOne (
		fetch = javax.persistence.FetchType.LAZY 
	)
	@JoinColumn (
		name = "IDLIDER0",
		referencedColumnName = "IDXERPCOMERCIAL",
		nullable = true,
		insertable = true,
		updatable = true 
	)
	private Erpcomercial idlider; 

	public void setDescripcion(
		String var
	) {
		this.descripcion=var; 
	}
	
	public String getDescripcion() {
		return this.descripcion; 
	}
	
	public void setEquipo(
		String var
	) {
		this.equipo=var; 
	}
	
	public String getEquipo() {
		return this.equipo; 
	}
	
	public void setIdxerpequipo(
		Long var
	) {
		this.idxerpequipo=var; 
	}
	
	public Long getIdxerpequipo() {
		return this.idxerpequipo; 
	}
	
	public void setObjetivo(
		BigDecimal var
	) {
		this.objetivo=var; 
	}
	
	public BigDecimal getObjetivo() {
		return this.objetivo; 
	}
	
	public void setUpdatable(
		boolean var
	) {
		this.updatable=var; 
	}
	
	public boolean isUpdatable() {
		return this.updatable; 
	}
	
	public void setIdlider(
		Erpcomercial var
	) {
		this.idlider=var; 
	}
	
	public Erpcomercial getIdlider() {
		if(this.idlider==null)this.idlider=new org.suinsit.apps.facturacin.Erpcomercial();
		  return this.idlider; 
	} 

}