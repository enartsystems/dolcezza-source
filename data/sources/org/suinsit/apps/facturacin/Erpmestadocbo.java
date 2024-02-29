package org.suinsit.apps.facturacin;

import java.io.Serializable;
import java.lang.Long;
import java.lang.String;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import org.enartframework.nocode.annotacion.Entidad;
import org.suinsit.apps.facturacin.Erpfactura;
import org.suinsit.apps.facturacin.Erpfactvenci;

@Entity
@Table (
	name = "ERPMESTADOCBO" 
)
@Entidad (
	type = "TABLE",
	pk = "idxerpmestadocbo" 
)
public class Erpmestadocbo implements Serializable { 

	private static final long serialVersionUID = 1L;
	@Column (
		name = "BGCOLOR",
		nullable = true 
	)
	private String bgcolor;
	@Column (
		name = "COBPARCIAL",
		nullable = true 
	)
	private boolean cobparcial;
	@Column (
		name = "ESTADO",
		nullable = false 
	)
	private String estado;
	@Id
	@Column (
		name = "IDXERPMESTADOCBO",
		nullable = true 
	)
	private Long idxerpmestadocbo;
	private boolean updatable;
	private List<Erpfactura> suberpfactura;
	private List<Erpfactvenci> suberpfactvenci; 

	public void setBgcolor(
		String var
	) {
		this.bgcolor=var; 
	}
	
	public String getBgcolor() {
		return this.bgcolor; 
	}
	
	public void setCobparcial(
		boolean var
	) {
		this.cobparcial=var; 
	}
	
	public boolean isCobparcial() {
		return this.cobparcial; 
	}
	
	public void setEstado(
		String var
	) {
		this.estado=var; 
	}
	
	public String getEstado() {
		return this.estado; 
	}
	
	public void setIdxerpmestadocbo(
		Long var
	) {
		this.idxerpmestadocbo=var; 
	}
	
	public Long getIdxerpmestadocbo() {
		return this.idxerpmestadocbo; 
	}
	
	public void setUpdatable(
		boolean var
	) {
		this.updatable=var; 
	}
	
	public boolean isUpdatable() {
		return this.updatable; 
	}
	
	public void setSuberpfactura(
		List<Erpfactura> var
	) {
		this.suberpfactura=var; 
	}
	
	public List<Erpfactura> getSuberpfactura() {
		if(this.suberpfactura==null)this.suberpfactura=new ArrayList<>(0);
		  return this.suberpfactura; 
	}
	
	public void setSuberpfactvenci(
		List<Erpfactvenci> var
	) {
		this.suberpfactvenci=var; 
	}
	
	public List<Erpfactvenci> getSuberpfactvenci() {
		if(this.suberpfactvenci==null)this.suberpfactvenci=new ArrayList<>(0);
		  return this.suberpfactvenci; 
	} 

}