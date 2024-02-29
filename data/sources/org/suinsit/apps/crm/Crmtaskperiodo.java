package org.suinsit.apps.crm;

import java.io.Serializable;
import java.lang.Integer;
import java.lang.Long;
import java.lang.String;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import org.enartframework.nocode.annotacion.Entidad;
import org.suinsit.apps.crm.Crmtarea;

@Entity
@Table (
	name = "CRMTASKPERIODO" 
)
@Entidad (
	type = "TABLE",
	pk = "idxcrmtaskperiodo" 
)
public class Crmtaskperiodo implements Serializable { 

	private static final long serialVersionUID = 1L;
	@Column (
		name = "DESCRIPCION",
		nullable = true 
	)
	private String descripcion;
	@Id
	@Column (
		name = "IDXCRMTASKPERIODO",
		nullable = true 
	)
	private Long idxcrmtaskperiodo;
	@Column (
		name = "PERIODO",
		nullable = true 
	)
	private Integer periodo;
	private boolean updatable;
	private List<Crmtarea> subcrmtarea; 

	public void setDescripcion(
		String var
	) {
		this.descripcion=var; 
	}
	
	public String getDescripcion() {
		return this.descripcion; 
	}
	
	public void setIdxcrmtaskperiodo(
		Long var
	) {
		this.idxcrmtaskperiodo=var; 
	}
	
	public Long getIdxcrmtaskperiodo() {
		return this.idxcrmtaskperiodo; 
	}
	
	public void setPeriodo(
		Integer var
	) {
		this.periodo=var; 
	}
	
	public Integer getPeriodo() {
		return this.periodo; 
	}
	
	public void setUpdatable(
		boolean var
	) {
		this.updatable=var; 
	}
	
	public boolean isUpdatable() {
		return this.updatable; 
	}
	
	public void setSubcrmtarea(
		List<Crmtarea> var
	) {
		this.subcrmtarea=var; 
	}
	
	public List<Crmtarea> getSubcrmtarea() {
		if(this.subcrmtarea==null)this.subcrmtarea=new ArrayList<>(0);
		  return this.subcrmtarea; 
	} 

}