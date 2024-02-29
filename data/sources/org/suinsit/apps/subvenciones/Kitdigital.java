package org.suinsit.apps.subvenciones;

import java.io.Serializable;
import java.lang.Long;
import java.lang.String;
import java.sql.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import org.enartframework.nocode.annotacion.Entidad;
import org.suinsit.apps.subvenciones.Subsolictudes;

@Entity
@Table (
	name = "KITDIGITAL" 
)
@Entidad (
	type = "TABLE",
	pk = "idxkitdigital" 
)
public class Kitdigital implements Serializable { 

	private static final long serialVersionUID = 1L;
	@Column (
		name = "COMENTARIOS",
		nullable = true 
	)
	private String comentarios;
	@Column (
		name = "FINALIZACION",
		nullable = true 
	)
	private Date finalizacion;
	@Column (
		name = "CONCESION",
		nullable = true 
	)
	private Date concesion;
	@Column (
		name = "BONO",
		nullable = false 
	)
	private String bono;
	@Id
	@Column (
		name = "IDXKITDIGITAL",
		nullable = true 
	)
	private Long idxkitdigital;
	private boolean updatable;
	@ManyToOne (
		fetch = javax.persistence.FetchType.LAZY 
	)
	@JoinColumn (
		name = "IDSUBSOLICTUDES0",
		referencedColumnName = "IDXSUBSOLICTUDES",
		nullable = true,
		insertable = true,
		updatable = true 
	)
	private Subsolictudes idsubsolictudes; 

	public void setComentarios(
		String var
	) {
		this.comentarios=var; 
	}
	
	public String getComentarios() {
		return this.comentarios; 
	}
	
	public void setFinalizacion(
		Date var
	) {
		this.finalizacion=var; 
	}
	
	public Date getFinalizacion() {
		return this.finalizacion; 
	}
	
	public void setConcesion(
		Date var
	) {
		this.concesion=var; 
	}
	
	public Date getConcesion() {
		return this.concesion; 
	}
	
	public void setBono(
		String var
	) {
		this.bono=var; 
	}
	
	public String getBono() {
		return this.bono; 
	}
	
	public void setIdxkitdigital(
		Long var
	) {
		this.idxkitdigital=var; 
	}
	
	public Long getIdxkitdigital() {
		return this.idxkitdigital; 
	}
	
	public void setUpdatable(
		boolean var
	) {
		this.updatable=var; 
	}
	
	public boolean isUpdatable() {
		return this.updatable; 
	}
	
	public void setIdsubsolictudes(
		Subsolictudes var
	) {
		this.idsubsolictudes=var; 
	}
	
	public Subsolictudes getIdsubsolictudes() {
		if(this.idsubsolictudes==null)this.idsubsolictudes=new org.suinsit.apps.subvenciones.Subsolictudes();
		  return this.idsubsolictudes; 
	} 

}