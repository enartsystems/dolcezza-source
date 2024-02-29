package org.suinsit.apps.mrp;

import java.io.Serializable;
import java.lang.Long;
import java.math.BigDecimal;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import org.enartframework.nocode.annotacion.Entidad;
import org.suinsit.apps.mrp.Mrpexpedicion;
import org.suinsit.apps.mrp.Mrpmrecepcion;

@Entity
@Table (
	name = "MRPRPRODUCTOS" 
)
@Entidad (
	type = "TABLE",
	pk = "idxmrprproductos" 
)
public class Mrprproductos implements Serializable { 

	private static final long serialVersionUID = 1L;
	@Column (
		name = "realizado",
		nullable = true 
	)
	private BigDecimal realizado;
	@Column (
		name = "unidades",
		nullable = true 
	)
	private BigDecimal unidades;
	@Id
	@Column (
		name = "idxmrprproductos",
		nullable = true 
	)
	private Long idxmrprproductos;
	private boolean updatable;
	@ManyToOne (
		fetch = javax.persistence.FetchType.LAZY 
	)
	@JoinColumn (
		name = "IDMRPMRECEPCION0",
		referencedColumnName = "IDXMRPMINVENTARIO",
		nullable = true,
		insertable = true,
		updatable = true 
	)
	private Mrpmrecepcion idmrpmrecepcion;
	@ManyToOne (
		fetch = javax.persistence.FetchType.LAZY 
	)
	@JoinColumn (
		name = "IDMRPEXPEDICION0",
		referencedColumnName = "IDXMRPEXPEDICION",
		nullable = true,
		insertable = true,
		updatable = true 
	)
	private Mrpexpedicion idmrpexpedicion; 

	public void setRealizado(
		BigDecimal var
	) {
		this.realizado=var; 
	}
	
	public BigDecimal getRealizado() {
		return this.realizado; 
	}
	
	public void setUnidades(
		BigDecimal var
	) {
		this.unidades=var; 
	}
	
	public BigDecimal getUnidades() {
		return this.unidades; 
	}
	
	public void setIdxmrprproductos(
		Long var
	) {
		this.idxmrprproductos=var; 
	}
	
	public Long getIdxmrprproductos() {
		return this.idxmrprproductos; 
	}
	
	public void setUpdatable(
		boolean var
	) {
		this.updatable=var; 
	}
	
	public boolean isUpdatable() {
		return this.updatable; 
	}
	
	public void setIdmrpmrecepcion(
		Mrpmrecepcion var
	) {
		this.idmrpmrecepcion=var; 
	}
	
	public Mrpmrecepcion getIdmrpmrecepcion() {
		if(this.idmrpmrecepcion==null)this.idmrpmrecepcion=new org.suinsit.apps.mrp.Mrpmrecepcion();
		  return this.idmrpmrecepcion; 
	}
	
	public void setIdmrpexpedicion(
		Mrpexpedicion var
	) {
		this.idmrpexpedicion=var; 
	}
	
	public Mrpexpedicion getIdmrpexpedicion() {
		if(this.idmrpexpedicion==null)this.idmrpexpedicion=new org.suinsit.apps.mrp.Mrpexpedicion();
		  return this.idmrpexpedicion; 
	} 

}