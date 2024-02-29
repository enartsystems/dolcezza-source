package org.suinsit.apps.contratos;

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
import org.suinsit.apps.admin.Mperidicidad;

@Entity
@Table (
	name = "CRTMTIPO" 
)
@Entidad (
	type = "TABLE",
	pk = "idxcrtmtipo" 
)
public class Crtmtipo implements Serializable { 

	private static final long serialVersionUID = 1L;
	@Column (
		name = "PRECIO",
		nullable = true 
	)
	private BigDecimal precio;
	@Column (
		name = "ACTIVO",
		nullable = true 
	)
	private boolean activo;
	@Column (
		name = "DESCRIPCION",
		nullable = true 
	)
	private String descripcion;
	@Id
	@Column (
		name = "IDXCRTMTIPO",
		nullable = true 
	)
	private Long idxcrtmtipo;
	@Column (
		name = "TIPOCONTRATO",
		nullable = true 
	)
	private String tipocontrato;
	private boolean updatable;
	@ManyToOne (
		fetch = javax.persistence.FetchType.LAZY 
	)
	@JoinColumn (
		name = "IDMPERIDICIDAD0",
		referencedColumnName = "IDXMPERIDICIDAD",
		nullable = true,
		insertable = true,
		updatable = true 
	)
	private Mperidicidad idmperidicidad; 

	public void setPrecio(
		BigDecimal var
	) {
		this.precio=var; 
	}
	
	public BigDecimal getPrecio() {
		return this.precio; 
	}
	
	public void setActivo(
		boolean var
	) {
		this.activo=var; 
	}
	
	public boolean isActivo() {
		return this.activo; 
	}
	
	public void setDescripcion(
		String var
	) {
		this.descripcion=var; 
	}
	
	public String getDescripcion() {
		return this.descripcion; 
	}
	
	public void setIdxcrtmtipo(
		Long var
	) {
		this.idxcrtmtipo=var; 
	}
	
	public Long getIdxcrtmtipo() {
		return this.idxcrtmtipo; 
	}
	
	public void setTipocontrato(
		String var
	) {
		this.tipocontrato=var; 
	}
	
	public String getTipocontrato() {
		return this.tipocontrato; 
	}
	
	public void setUpdatable(
		boolean var
	) {
		this.updatable=var; 
	}
	
	public boolean isUpdatable() {
		return this.updatable; 
	}
	
	public void setIdmperidicidad(
		Mperidicidad var
	) {
		this.idmperidicidad=var; 
	}
	
	public Mperidicidad getIdmperidicidad() {
		if(this.idmperidicidad==null)this.idmperidicidad=new org.suinsit.apps.admin.Mperidicidad();
		  return this.idmperidicidad; 
	} 

}