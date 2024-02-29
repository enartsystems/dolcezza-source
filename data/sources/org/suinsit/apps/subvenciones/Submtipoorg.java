package org.suinsit.apps.subvenciones;

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
import org.suinsit.apps.subvenciones.Submorganismo;

@Entity
@Table (
	name = "SUBMTIPOORG" 
)
@Entidad (
	type = "TABLE",
	pk = "idxsubmtipoorg" 
)
public class Submtipoorg implements Serializable { 

	private static final long serialVersionUID = 1L;
	@Column (
		name = "ALTA",
		nullable = true 
	)
	private Date alta;
	@Id
	@Column (
		name = "IDXSUBMTIPOORG",
		nullable = true 
	)
	private Long idxsubmtipoorg;
	@Column (
		name = "TIPO",
		nullable = false 
	)
	private String tipo;
	private boolean updatable;
	private List<Submorganismo> subsubmorganismo; 

	public void setAlta(
		Date var
	) {
		this.alta=var; 
	}
	
	public Date getAlta() {
		return this.alta; 
	}
	
	public void setIdxsubmtipoorg(
		Long var
	) {
		this.idxsubmtipoorg=var; 
	}
	
	public Long getIdxsubmtipoorg() {
		return this.idxsubmtipoorg; 
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
	
	public void setSubsubmorganismo(
		List<Submorganismo> var
	) {
		this.subsubmorganismo=var; 
	}
	
	public List<Submorganismo> getSubsubmorganismo() {
		if(this.subsubmorganismo==null)this.subsubmorganismo=new ArrayList<>(0);
		  return this.subsubmorganismo; 
	} 

}