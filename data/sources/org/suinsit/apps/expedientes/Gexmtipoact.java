package org.suinsit.apps.expedientes;

import java.io.Serializable;
import java.lang.Long;
import java.lang.String;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import org.enartframework.nocode.annotacion.Entidad;
import org.suinsit.apps.expedientes.Gexmactuacion;

@Entity
@Table (
	name = "GEXMTIPOACT" 
)
@Entidad (
	type = "TABLE",
	pk = "idxgexmtipoact" 
)
public class Gexmtipoact implements Serializable { 

	private static final long serialVersionUID = 1L;
	@Column (
		name = "ACTIVO",
		nullable = true 
	)
	private boolean activo;
	@Column (
		name = "ALTA",
		nullable = true 
	)
	private Date alta;
	@Id
	@Column (
		name = "IDXGEXMTIPOACT",
		nullable = true 
	)
	private Long idxgexmtipoact;
	@Column (
		name = "TIPOACTUACION",
		nullable = false 
	)
	private String tipoactuacion;
	private boolean updatable;
	private List<Gexmactuacion> subgexmactuacion; 

	public void setActivo(
		boolean var
	) {
		this.activo=var; 
	}
	
	public boolean isActivo() {
		return this.activo; 
	}
	
	public void setAlta(
		Date var
	) {
		this.alta=var; 
	}
	
	public Date getAlta() {
		return this.alta; 
	}
	
	public void setIdxgexmtipoact(
		Long var
	) {
		this.idxgexmtipoact=var; 
	}
	
	public Long getIdxgexmtipoact() {
		return this.idxgexmtipoact; 
	}
	
	public void setTipoactuacion(
		String var
	) {
		this.tipoactuacion=var; 
	}
	
	public String getTipoactuacion() {
		return this.tipoactuacion; 
	}
	
	public void setUpdatable(
		boolean var
	) {
		this.updatable=var; 
	}
	
	public boolean isUpdatable() {
		return this.updatable; 
	}
	
	public void setSubgexmactuacion(
		List<Gexmactuacion> var
	) {
		this.subgexmactuacion=var; 
	}
	
	public List<Gexmactuacion> getSubgexmactuacion() {
		if(this.subgexmactuacion==null)this.subgexmactuacion=new ArrayList<>(0);
		  return this.subgexmactuacion; 
	} 

}