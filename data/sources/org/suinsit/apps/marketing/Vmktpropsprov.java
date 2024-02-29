package org.suinsit.apps.marketing;

import java.io.Serializable;
import java.lang.Long;
import java.lang.String;
import javax.persistence.Column;
import org.enartframework.nocode.annotacion.Entidad;

@Entidad (
	type = "VIEW" 
)
public class Vmktpropsprov implements Serializable { 

	private static final long serialVersionUID = 1L;
	@Column (
		name = "MAPPEAR",
		nullable = false 
	)
	private String mappear;
	@Column (
		name = "NOMBRE",
		nullable = false 
	)
	private String nombre;
	@Column (
		name = "TIPO",
		nullable = false 
	)
	private String tipo;
	@Column (
		name = "IDMKTPROVMAIL0",
		nullable = true 
	)
	private Long idmktprovmail0;
	@Column (
		name = "IDPROVEEDOR",
		nullable = true 
	)
	private String idproveedor;
	@Column (
		name = "IDXMKTCONTACTPROP",
		nullable = true 
	)
	private Long idxmktcontactprop;
	private boolean updatable; 

	public void setMappear(
		String var
	) {
		this.mappear=var; 
	}
	
	public String getMappear() {
		return this.mappear; 
	}
	
	public void setNombre(
		String var
	) {
		this.nombre=var; 
	}
	
	public String getNombre() {
		return this.nombre; 
	}
	
	public void setTipo(
		String var
	) {
		this.tipo=var; 
	}
	
	public String getTipo() {
		return this.tipo; 
	}
	
	public void setIdmktprovmail0(
		Long var
	) {
		this.idmktprovmail0=var; 
	}
	
	public Long getIdmktprovmail0() {
		return this.idmktprovmail0; 
	}
	
	public void setIdproveedor(
		String var
	) {
		this.idproveedor=var; 
	}
	
	public String getIdproveedor() {
		return this.idproveedor; 
	}
	
	public void setIdxmktcontactprop(
		Long var
	) {
		this.idxmktcontactprop=var; 
	}
	
	public Long getIdxmktcontactprop() {
		return this.idxmktcontactprop; 
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