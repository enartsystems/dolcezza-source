package org.suinsit.apps.portalemp;

import java.io.Serializable;
import java.lang.Long;
import java.lang.String;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import org.enartframework.nocode.annotacion.Entidad;
import org.suinsit.apps.portalemp.Rrhempleado;
import org.suinsit.apps.portalemp.Rrhhmtipoestudio;

@Entity
@Table (
	name = "RRHHMACADEMIC" 
)
@Entidad (
	type = "TABLE",
	pk = "idxrrhhmacademic" 
)
public class Rrhhmacademic implements Serializable { 

	private static final long serialVersionUID = 1L;
	@Id
	@Column (
		name = "IDXRRHHMACADEMIC",
		nullable = true 
	)
	private Long idxrrhhmacademic;
	@Column (
		name = "NIVELACADEMICO",
		nullable = true 
	)
	private String nivelacademico;
	private boolean updatable;
	@ManyToOne (
		fetch = javax.persistence.FetchType.LAZY 
	)
	@JoinColumn (
		name = "IDRRHHMTIPOESTUDIO0",
		referencedColumnName = "IDXRRHHMTIPOESTUDIO",
		nullable = true,
		insertable = true,
		updatable = true 
	)
	private Rrhhmtipoestudio idrrhhmtipoestudio;
	private List<Rrhempleado> subrrhempleado; 

	public void setIdxrrhhmacademic(
		Long var
	) {
		this.idxrrhhmacademic=var; 
	}
	
	public Long getIdxrrhhmacademic() {
		return this.idxrrhhmacademic; 
	}
	
	public void setNivelacademico(
		String var
	) {
		this.nivelacademico=var; 
	}
	
	public String getNivelacademico() {
		return this.nivelacademico; 
	}
	
	public void setUpdatable(
		boolean var
	) {
		this.updatable=var; 
	}
	
	public boolean isUpdatable() {
		return this.updatable; 
	}
	
	public void setIdrrhhmtipoestudio(
		Rrhhmtipoestudio var
	) {
		this.idrrhhmtipoestudio=var; 
	}
	
	public Rrhhmtipoestudio getIdrrhhmtipoestudio() {
		if(this.idrrhhmtipoestudio==null)this.idrrhhmtipoestudio=new org.suinsit.apps.portalemp.Rrhhmtipoestudio();
		  return this.idrrhhmtipoestudio; 
	}
	
	public void setSubrrhempleado(
		List<Rrhempleado> var
	) {
		this.subrrhempleado=var; 
	}
	
	public List<Rrhempleado> getSubrrhempleado() {
		if(this.subrrhempleado==null)this.subrrhempleado=new ArrayList<>(0);
		  return this.subrrhempleado; 
	} 

}