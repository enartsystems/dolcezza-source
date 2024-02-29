package org.suinsit.apps.mrp;

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
import org.suinsit.apps.facturacin.Erpempresa;

@Entity
@Table (
	name = "ALMACEN" 
)
@Entidad (
	type = "TABLE",
	pk = "idxalmacen" 
)
public class Almacen implements Serializable { 

	private static final long serialVersionUID = 1L;
	@Column (
		name = "almacen",
		nullable = false 
	)
	private String almacen;
	@Column (
		name = "direccion",
		nullable = true 
	)
	private String direccion;
	@Id
	@Column (
		name = "idxalmacen",
		nullable = true 
	)
	private Long idxalmacen;
	@Column (
		name = "poblacion",
		nullable = true 
	)
	private String poblacion;
	private boolean updatable;
	@ManyToOne (
		fetch = javax.persistence.FetchType.LAZY 
	)
	@JoinColumn (
		name = "IDCOMPANY0",
		referencedColumnName = "IDXERPEMPRESA",
		nullable = true,
		insertable = true,
		updatable = true 
	)
	private Erpempresa idcompany;
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

	public void setAlmacen(
		String var
	) {
		this.almacen=var; 
	}
	
	public String getAlmacen() {
		return this.almacen; 
	}
	
	public void setDireccion(
		String var
	) {
		this.direccion=var; 
	}
	
	public String getDireccion() {
		return this.direccion; 
	}
	
	public void setIdxalmacen(
		Long var
	) {
		this.idxalmacen=var; 
	}
	
	public Long getIdxalmacen() {
		return this.idxalmacen; 
	}
	
	public void setPoblacion(
		String var
	) {
		this.poblacion=var; 
	}
	
	public String getPoblacion() {
		return this.poblacion; 
	}
	
	public void setUpdatable(
		boolean var
	) {
		this.updatable=var; 
	}
	
	public boolean isUpdatable() {
		return this.updatable; 
	}
	
	public void setIdcompany(
		Erpempresa var
	) {
		this.idcompany=var; 
	}
	
	public Erpempresa getIdcompany() {
		if(this.idcompany==null)this.idcompany=new org.suinsit.apps.facturacin.Erpempresa();
		  return this.idcompany; 
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