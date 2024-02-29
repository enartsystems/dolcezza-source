package org.suinsit.apps.admin;

import java.io.Serializable;
import java.lang.Integer;
import java.lang.Long;
import java.lang.String;
import java.sql.Timestamp;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import org.enartframework.nocode.annotacion.Entidad;

@Entity
@Table (
	name = "SSORACTIVIDAD" 
)
@Entidad (
	type = "TABLE",
	pk = "idxssoractividad" 
)
public class Ssoractividad implements Serializable { 

	private static final long serialVersionUID = 1L;
	@Column (
		name = "REGISTRO",
		nullable = true 
	)
	private String registro;
	@Column (
		name = "ACCION",
		nullable = true 
	)
	private String accion;
	@Column (
		name = "ALTA",
		nullable = true 
	)
	private Timestamp alta;
	@Column (
		name = "APLICACION",
		nullable = true 
	)
	private String aplicacion;
	@Column (
		name = "DIRIP",
		nullable = true 
	)
	private String dirip;
	@Column (
		name = "IDTUPLA",
		nullable = true 
	)
	private Integer idtupla;
	@Id
	@Column (
		name = "IDXSSORACTIVIDAD",
		nullable = true 
	)
	private Long idxssoractividad;
	@Column (
		name = "MODULO",
		nullable = true 
	)
	private String modulo;
	@Column (
		name = "PROCESS",
		nullable = true 
	)
	private String process;
	@Column (
		name = "TASK",
		nullable = true 
	)
	private String task;
	@Column (
		name = "TASKSCREEN",
		nullable = true 
	)
	private String taskscreen;
	@Column (
		name = "USERNAME",
		nullable = true 
	)
	private String username;
	@Column (
		name = "VALUETUPLA",
		nullable = true 
	)
	private String valuetupla;
	private boolean updatable; 

	public void setRegistro(
		String var
	) {
		this.registro=var; 
	}
	
	public String getRegistro() {
		return this.registro; 
	}
	
	public void setAccion(
		String var
	) {
		this.accion=var; 
	}
	
	public String getAccion() {
		return this.accion; 
	}
	
	public void setAlta(
		Timestamp var
	) {
		this.alta=var; 
	}
	
	public Timestamp getAlta() {
		return this.alta; 
	}
	
	public void setAplicacion(
		String var
	) {
		this.aplicacion=var; 
	}
	
	public String getAplicacion() {
		return this.aplicacion; 
	}
	
	public void setDirip(
		String var
	) {
		this.dirip=var; 
	}
	
	public String getDirip() {
		return this.dirip; 
	}
	
	public void setIdtupla(
		Integer var
	) {
		this.idtupla=var; 
	}
	
	public Integer getIdtupla() {
		return this.idtupla; 
	}
	
	public void setIdxssoractividad(
		Long var
	) {
		this.idxssoractividad=var; 
	}
	
	public Long getIdxssoractividad() {
		return this.idxssoractividad; 
	}
	
	public void setModulo(
		String var
	) {
		this.modulo=var; 
	}
	
	public String getModulo() {
		return this.modulo; 
	}
	
	public void setProcess(
		String var
	) {
		this.process=var; 
	}
	
	public String getProcess() {
		return this.process; 
	}
	
	public void setTask(
		String var
	) {
		this.task=var; 
	}
	
	public String getTask() {
		return this.task; 
	}
	
	public void setTaskscreen(
		String var
	) {
		this.taskscreen=var; 
	}
	
	public String getTaskscreen() {
		return this.taskscreen; 
	}
	
	public void setUsername(
		String var
	) {
		this.username=var; 
	}
	
	public String getUsername() {
		return this.username; 
	}
	
	public void setValuetupla(
		String var
	) {
		this.valuetupla=var; 
	}
	
	public String getValuetupla() {
		return this.valuetupla; 
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