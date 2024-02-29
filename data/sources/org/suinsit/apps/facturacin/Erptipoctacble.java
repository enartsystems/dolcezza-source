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
import org.suinsit.apps.facturacin.Erpmgrupoctactble;

@Entity
@Table (
	name = "ERPTIPOCTACBLE" 
)
@Entidad (
	type = "TABLE",
	pk = "idxerptipoctacble" 
)
public class Erptipoctacble implements Serializable { 

	private static final long serialVersionUID = 1L;
	@Column (
		name = "CUENTA",
		nullable = true 
	)
	private BigDecimal cuenta;
	@Column (
		name = "DESCRIPCION",
		nullable = true 
	)
	private String descripcion;
	@Id
	@Column (
		name = "IDXERPTIPOCTACBLE",
		nullable = true 
	)
	private Long idxerptipoctacble;
	private boolean updatable;
	@ManyToOne (
		fetch = javax.persistence.FetchType.LAZY 
	)
	@JoinColumn (
		name = "IDERPMGRUPOCTACTBLE0",
		referencedColumnName = "IDXERPMGRUPOCTACTBLE",
		nullable = true,
		insertable = true,
		updatable = true 
	)
	private Erpmgrupoctactble iderpmgrupoctactble; 

	public void setCuenta(
		BigDecimal var
	) {
		this.cuenta=var; 
	}
	
	public BigDecimal getCuenta() {
		return this.cuenta; 
	}
	
	public void setDescripcion(
		String var
	) {
		this.descripcion=var; 
	}
	
	public String getDescripcion() {
		return this.descripcion; 
	}
	
	public void setIdxerptipoctacble(
		Long var
	) {
		this.idxerptipoctacble=var; 
	}
	
	public Long getIdxerptipoctacble() {
		return this.idxerptipoctacble; 
	}
	
	public void setUpdatable(
		boolean var
	) {
		this.updatable=var; 
	}
	
	public boolean isUpdatable() {
		return this.updatable; 
	}
	
	public void setIderpmgrupoctactble(
		Erpmgrupoctactble var
	) {
		this.iderpmgrupoctactble=var; 
	}
	
	public Erpmgrupoctactble getIderpmgrupoctactble() {
		if(this.iderpmgrupoctactble==null)this.iderpmgrupoctactble=new org.suinsit.apps.facturacin.Erpmgrupoctactble();
		  return this.iderpmgrupoctactble; 
	} 

}