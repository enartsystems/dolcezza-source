package org.suinsit.apps.portalemp;

import java.io.Serializable;
import java.lang.Long;
import java.sql.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import org.enartframework.nocode.annotacion.Entidad;
import org.suinsit.apps.portalemp.Rrhempleado;
import org.suinsit.apps.portalemp.Rrhhgrupo;

@Entity
@Table (
	name = "RRHHREMPGRUPO" 
)
@Entidad (
	type = "TABLE",
	pk = "idxrrhhrempgrupo" 
)
public class Rrhhrempgrupo implements Serializable { 

	private static final long serialVersionUID = 1L;
	@Column (
		name = "INICIO",
		nullable = false 
	)
	private Date inicio;
	@Id
	@Column (
		name = "IDXRRHHREMPGRUPO",
		nullable = true 
	)
	private Long idxrrhhrempgrupo;
	private boolean updatable;
	@ManyToOne (
		fetch = javax.persistence.FetchType.LAZY 
	)
	@JoinColumn (
		name = "IDRRHEMPLEADO0",
		referencedColumnName = "IDXRRHEMPLEADO",
		nullable = true,
		insertable = true,
		updatable = true 
	)
	private Rrhempleado idrrhempleado;
	@ManyToOne (
		fetch = javax.persistence.FetchType.LAZY 
	)
	@JoinColumn (
		name = "IDRRHHGRUPO0",
		referencedColumnName = "IDXRRHHGRUPO",
		nullable = true,
		insertable = true,
		updatable = true 
	)
	private Rrhhgrupo idrrhhgrupo; 

	public void setInicio(
		Date var
	) {
		this.inicio=var; 
	}
	
	public Date getInicio() {
		return this.inicio; 
	}
	
	public void setIdxrrhhrempgrupo(
		Long var
	) {
		this.idxrrhhrempgrupo=var; 
	}
	
	public Long getIdxrrhhrempgrupo() {
		return this.idxrrhhrempgrupo; 
	}
	
	public void setUpdatable(
		boolean var
	) {
		this.updatable=var; 
	}
	
	public boolean isUpdatable() {
		return this.updatable; 
	}
	
	public void setIdrrhempleado(
		Rrhempleado var
	) {
		this.idrrhempleado=var; 
	}
	
	public Rrhempleado getIdrrhempleado() {
		if(this.idrrhempleado==null)this.idrrhempleado=new org.suinsit.apps.portalemp.Rrhempleado();
		  return this.idrrhempleado; 
	}
	
	public void setIdrrhhgrupo(
		Rrhhgrupo var
	) {
		this.idrrhhgrupo=var; 
	}
	
	public Rrhhgrupo getIdrrhhgrupo() {
		if(this.idrrhhgrupo==null)this.idrrhhgrupo=new org.suinsit.apps.portalemp.Rrhhgrupo();
		  return this.idrrhhgrupo; 
	} 

}