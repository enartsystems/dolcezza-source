package org.suinsit.apps.facturacin;

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
import org.suinsit.apps.admin.Mpais;
import org.suinsit.apps.admin.Mprovincia;

@Entity
@Table (
	name = "PROMALMACEN" 
)
@Entidad (
	type = "TABLE",
	pk = "idxpromalmacen" 
)
public class Promalmacen implements Serializable { 

	private static final long serialVersionUID = 1L;
	@Column (
		name = "TELFONOS",
		nullable = true 
	)
	private String telfonos;
	@Column (
		name = "ALMACEN",
		nullable = false 
	)
	private String almacen;
	@Column (
		name = "CIUDAD",
		nullable = true 
	)
	private String ciudad;
	@Column (
		name = "CORREO",
		nullable = true 
	)
	private String correo;
	@Column (
		name = "DIRECCION",
		nullable = true 
	)
	private String direccion;
	@Id
	@Column (
		name = "IDXPROMALMACEN",
		nullable = true 
	)
	private Long idxpromalmacen;
	private boolean updatable;
	@ManyToOne (
		fetch = javax.persistence.FetchType.LAZY 
	)
	@JoinColumn (
		name = "IDMPAIS0",
		referencedColumnName = "IDX",
		nullable = true,
		insertable = true,
		updatable = true 
	)
	private Mpais idmpais;
	@ManyToOne (
		fetch = javax.persistence.FetchType.LAZY 
	)
	@JoinColumn (
		name = "IDMPROVINCIA0",
		referencedColumnName = "IDX",
		nullable = true,
		insertable = true,
		updatable = true 
	)
	private Mprovincia idmprovincia; 

	public void setTelfonos(
		String var
	) {
		this.telfonos=var; 
	}
	
	public String getTelfonos() {
		return this.telfonos; 
	}
	
	public void setAlmacen(
		String var
	) {
		this.almacen=var; 
	}
	
	public String getAlmacen() {
		return this.almacen; 
	}
	
	public void setCiudad(
		String var
	) {
		this.ciudad=var; 
	}
	
	public String getCiudad() {
		return this.ciudad; 
	}
	
	public void setCorreo(
		String var
	) {
		this.correo=var; 
	}
	
	public String getCorreo() {
		return this.correo; 
	}
	
	public void setDireccion(
		String var
	) {
		this.direccion=var; 
	}
	
	public String getDireccion() {
		return this.direccion; 
	}
	
	public void setIdxpromalmacen(
		Long var
	) {
		this.idxpromalmacen=var; 
	}
	
	public Long getIdxpromalmacen() {
		return this.idxpromalmacen; 
	}
	
	public void setUpdatable(
		boolean var
	) {
		this.updatable=var; 
	}
	
	public boolean isUpdatable() {
		return this.updatable; 
	}
	
	public void setIdmpais(
		Mpais var
	) {
		this.idmpais=var; 
	}
	
	public Mpais getIdmpais() {
		if(this.idmpais==null)this.idmpais=new org.suinsit.apps.admin.Mpais();
		  return this.idmpais; 
	}
	
	public void setIdmprovincia(
		Mprovincia var
	) {
		this.idmprovincia=var; 
	}
	
	public Mprovincia getIdmprovincia() {
		if(this.idmprovincia==null)this.idmprovincia=new org.suinsit.apps.admin.Mprovincia();
		  return this.idmprovincia; 
	} 

}