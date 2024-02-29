package org.suinsit.apps.marketing;

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
import org.suinsit.apps.marketing.Mktprovmail;

@Entity
@Table (
	name = "MKTCONTACTPROP" 
)
@Entidad (
	type = "TABLE",
	pk = "idxmktcontactprop" 
)
public class Mktcontactprop implements Serializable { 

	private static final long serialVersionUID = 1L;
	@Column (
		name = "IDPROVEEDOR",
		nullable = true 
	)
	private String idproveedor;
	@Id
	@Column (
		name = "IDXMKTCONTACTPROP",
		nullable = true 
	)
	private Long idxmktcontactprop;
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
	private boolean updatable;
	@ManyToOne (
		fetch = javax.persistence.FetchType.LAZY 
	)
	@JoinColumn (
		name = "IDMKTPROVMAIL0",
		referencedColumnName = "IDXMKTPROVMAIL",
		nullable = true,
		insertable = true,
		updatable = true 
	)
	private Mktprovmail idmktprovmail; 

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
	
	public void setUpdatable(
		boolean var
	) {
		this.updatable=var; 
	}
	
	public boolean isUpdatable() {
		return this.updatable; 
	}
	
	public void setIdmktprovmail(
		Mktprovmail var
	) {
		this.idmktprovmail=var; 
	}
	
	public Mktprovmail getIdmktprovmail() {
		if(this.idmktprovmail==null)this.idmktprovmail=new org.suinsit.apps.marketing.Mktprovmail();
		  return this.idmktprovmail; 
	} 

}