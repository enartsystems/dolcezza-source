package org.suinsit.apps.subvenciones;

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
import org.suinsit.apps.subvenciones.Subsubvencion;

@Entity
@Table (
	name = "SUBMTIPOSUB" 
)
@Entidad (
	type = "TABLE",
	pk = "idxsubmtiposub" 
)
public class Submtiposub implements Serializable { 

	private static final long serialVersionUID = 1L;
	@Id
	@Column (
		name = "IDXSUBMTIPOSUB",
		nullable = true 
	)
	private Long idxsubmtiposub;
	@Column (
		name = "TIPOSUBVENCIN",
		nullable = false 
	)
	private String tiposubvencin;
	private boolean updatable;
	private List<Subsubvencion> subsubsubvencion; 

	public void setIdxsubmtiposub(
		Long var
	) {
		this.idxsubmtiposub=var; 
	}
	
	public Long getIdxsubmtiposub() {
		return this.idxsubmtiposub; 
	}
	
	public void setTiposubvencin(
		String var
	) {
		this.tiposubvencin=var; 
	}
	
	public String getTiposubvencin() {
		return this.tiposubvencin; 
	}
	
	public void setUpdatable(
		boolean var
	) {
		this.updatable=var; 
	}
	
	public boolean isUpdatable() {
		return this.updatable; 
	}
	
	public void setSubsubsubvencion(
		List<Subsubvencion> var
	) {
		this.subsubsubvencion=var; 
	}
	
	public List<Subsubvencion> getSubsubsubvencion() {
		if(this.subsubsubvencion==null)this.subsubsubvencion=new ArrayList<>(0);
		  return this.subsubsubvencion; 
	} 

}