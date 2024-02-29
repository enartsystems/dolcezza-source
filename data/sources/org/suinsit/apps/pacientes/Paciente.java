package org.suinsit.apps.pacientes;

import java.io.Serializable;
import java.lang.Long;
import java.lang.Object;
import java.lang.String;
import java.sql.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import org.enartframework.nocode.annotacion.Entidad;
import org.enartframework.nocode.annotacion.Sequence;
import org.suinsit.apps.admin.Ssousuario;

@Entity
@Table (
	name = "PACIENTE" 
)
@Entidad (
	type = "TABLE",
	pk = "idxpaciente" 
)
public class Paciente implements Serializable { 

	private static final long serialVersionUID = 1L;
	@Column (
		name = "FOTO",
		nullable = true 
	)
	private Object foto;
	@Column (
		name = "ALTA",
		nullable = false 
	)
	private Date alta;
	@Column (
		name = "HISTORIAL",
		nullable = true 
	)
	@Sequence (
		name = "PACIENTE_HISTORIAL",
		prefix = "",
		mask = "0000000000",
		addYear = true 
	)
	private String historial;
	@Column (
		name = "NOMBRE",
		nullable = true 
	)
	private String nombre;
	@Id
	@Column (
		name = "IDXPACIENTE",
		nullable = true 
	)
	private Long idxpaciente;
	private boolean updatable;
	@ManyToOne (
		fetch = javax.persistence.FetchType.LAZY 
	)
	@JoinColumn (
		name = "IDSSOUSUARIO0",
		referencedColumnName = "IDXSSOUSUARIO",
		nullable = true,
		insertable = true,
		updatable = true 
	)
	private Ssousuario idssousuario; 

	public void setFoto(
		Object var
	) {
		this.foto=var; 
	}
	
	public Object getFoto() {
		return this.foto; 
	}
	
	public void setAlta(
		Date var
	) {
		this.alta=var; 
	}
	
	public Date getAlta() {
		return this.alta; 
	}
	
	public void setHistorial(
		String var
	) {
		this.historial=var; 
	}
	
	public String getHistorial() {
		return this.historial; 
	}
	
	public void setNombre(
		String var
	) {
		this.nombre=var; 
	}
	
	public String getNombre() {
		return this.nombre; 
	}
	
	public void setIdxpaciente(
		Long var
	) {
		this.idxpaciente=var; 
	}
	
	public Long getIdxpaciente() {
		return this.idxpaciente; 
	}
	
	public void setUpdatable(
		boolean var
	) {
		this.updatable=var; 
	}
	
	public boolean isUpdatable() {
		return this.updatable; 
	}
	
	public void setIdssousuario(
		Ssousuario var
	) {
		this.idssousuario=var; 
	}
	
	public Ssousuario getIdssousuario() {
		if(this.idssousuario==null)this.idssousuario=new org.suinsit.apps.admin.Ssousuario();
		  return this.idssousuario; 
	} 

}