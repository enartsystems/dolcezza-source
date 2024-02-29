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
import org.suinsit.apps.facturacin.Erptipoctacble;

@Entity
@Table (
	name = "ERPMCTACTBLE" 
)
@Entidad (
	type = "TABLE",
	pk = "idxerpmctactble" 
)
public class Erpmctactble implements Serializable { 

	private static final long serialVersionUID = 1L;
	@Column (
		name = "COLOR",
		nullable = true 
	)
	private String color;
	@Id
	@Column (
		name = "IDXERPMCTACTBLE",
		nullable = true 
	)
	private Long idxerpmctactble;
	@Column (
		name = "NOMBRE",
		nullable = false 
	)
	private String nombre;
	@Column (
		name = "NUMERO",
		nullable = false 
	)
	private BigDecimal numero;
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
	@ManyToOne (
		fetch = javax.persistence.FetchType.LAZY 
	)
	@JoinColumn (
		name = "IDERPTIPOCTACBLE0",
		referencedColumnName = "IDXERPTIPOCTACBLE",
		nullable = true,
		insertable = true,
		updatable = true 
	)
	private Erptipoctacble iderptipoctacble; 

	public void setColor(
		String var
	) {
		this.color=var; 
	}
	
	public String getColor() {
		return this.color; 
	}
	
	public void setIdxerpmctactble(
		Long var
	) {
		this.idxerpmctactble=var; 
	}
	
	public Long getIdxerpmctactble() {
		return this.idxerpmctactble; 
	}
	
	public void setNombre(
		String var
	) {
		this.nombre=var; 
	}
	
	public String getNombre() {
		return this.nombre; 
	}
	
	public void setNumero(
		BigDecimal var
	) {
		this.numero=var; 
	}
	
	public BigDecimal getNumero() {
		return this.numero; 
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
	
	public void setIderptipoctacble(
		Erptipoctacble var
	) {
		this.iderptipoctacble=var; 
	}
	
	public Erptipoctacble getIderptipoctacble() {
		if(this.iderptipoctacble==null)this.iderptipoctacble=new org.suinsit.apps.facturacin.Erptipoctacble();
		  return this.iderptipoctacble; 
	} 

}