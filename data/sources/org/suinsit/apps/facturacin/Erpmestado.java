package org.suinsit.apps.facturacin;

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
	name = "ERPMESTADO" 
)
@Entidad (
	type = "TABLE",
	pk = "idxerpmestado" 
)
public class Erpmestado implements Serializable { 

	private static final long serialVersionUID = 1L;
	@Column (
		name = "bgcolor",
		nullable = true 
	)
	private String bgcolor;
	@Column (
		name = "estado",
		nullable = false 
	)
	private String estado;
	@Column (
		name = "factura",
		nullable = true 
	)
	private boolean factura;
	@Id
	@Column (
		name = "idxerpmestado",
		nullable = true 
	)
	private Long idxerpmestado;
	@Column (
		name = "pedido",
		nullable = true 
	)
	private boolean pedido;
	@Column (
		name = "presupuesto",
		nullable = true 
	)
	private boolean presupuesto;
	@Column (
		name = "whenaction",
		nullable = true 
	)
	private String whenaction;
	private boolean updatable; 

	public void setBgcolor(
		String var
	) {
		this.bgcolor=var; 
	}
	
	public String getBgcolor() {
		return this.bgcolor; 
	}
	
	public void setEstado(
		String var
	) {
		this.estado=var; 
	}
	
	public String getEstado() {
		return this.estado; 
	}
	
	public void setFactura(
		boolean var
	) {
		this.factura=var; 
	}
	
	public boolean isFactura() {
		return this.factura; 
	}
	
	public void setIdxerpmestado(
		Long var
	) {
		this.idxerpmestado=var; 
	}
	
	public Long getIdxerpmestado() {
		return this.idxerpmestado; 
	}
	
	public void setPedido(
		boolean var
	) {
		this.pedido=var; 
	}
	
	public boolean isPedido() {
		return this.pedido; 
	}
	
	public void setPresupuesto(
		boolean var
	) {
		this.presupuesto=var; 
	}
	
	public boolean isPresupuesto() {
		return this.presupuesto; 
	}
	
	public void setWhenaction(
		String var
	) {
		this.whenaction=var; 
	}
	
	public String getWhenaction() {
		return this.whenaction; 
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