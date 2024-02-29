package org.suinsit.apps.notificaciones;

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
import org.suinsit.apps.notificaciones.Notmnotificacion;

@Entity
@Table (
	name = "NOTMTIPO" 
)
@Entidad (
	type = "TABLE",
	pk = "idxnotmtipo" 
)
public class Notmtipo implements Serializable { 

	private static final long serialVersionUID = 1L;
	@Column (
		name = "PLANTILLA",
		nullable = true 
	)
	private String plantilla;
	@Column (
		name = "SENDEMAIL",
		nullable = true 
	)
	private boolean sendemail;
	@Id
	@Column (
		name = "IDXNOTMTIPO",
		nullable = true 
	)
	private Long idxnotmtipo;
	@Column (
		name = "TIPO",
		nullable = true 
	)
	private String tipo;
	private boolean updatable;
	private List<Notmnotificacion> subnotmnotificacion; 

	public void setPlantilla(
		String var
	) {
		this.plantilla=var; 
	}
	
	public String getPlantilla() {
		return this.plantilla; 
	}
	
	public void setSendemail(
		boolean var
	) {
		this.sendemail=var; 
	}
	
	public boolean isSendemail() {
		return this.sendemail; 
	}
	
	public void setIdxnotmtipo(
		Long var
	) {
		this.idxnotmtipo=var; 
	}
	
	public Long getIdxnotmtipo() {
		return this.idxnotmtipo; 
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
	
	public void setSubnotmnotificacion(
		List<Notmnotificacion> var
	) {
		this.subnotmnotificacion=var; 
	}
	
	public List<Notmnotificacion> getSubnotmnotificacion() {
		if(this.subnotmnotificacion==null)this.subnotmnotificacion=new ArrayList<>(0);
		  return this.subnotmnotificacion; 
	} 

}