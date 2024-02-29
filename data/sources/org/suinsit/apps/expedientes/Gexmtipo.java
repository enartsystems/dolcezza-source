package org.suinsit.apps.expedientes;

import java.io.Serializable;
import java.lang.Integer;
import java.lang.Long;
import java.lang.String;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import org.enartframework.nocode.annotacion.Entidad;
import org.suinsit.apps.subvenciones.Submorganismo;

@Entity
@Table (
	name = "GEXMTIPO" 
)
@Entidad (
	type = "TABLE",
	pk = "idxgexmtipo" 
)
public class Gexmtipo implements Serializable { 

	private static final long serialVersionUID = 1L;
	@Column (
		name = "DURACION",
		nullable = true 
	)
	private Integer duracion;
	@Column (
		name = "DESCRIPCION",
		nullable = true 
	)
	private String descripcion;
	@Id
	@Column (
		name = "IDXGEXMTIPO",
		nullable = true 
	)
	private Long idxgexmtipo;
	@Column (
		name = "TIPO",
		nullable = false 
	)
	private String tipo;
	private boolean updatable;
	@ManyToOne (
		fetch = javax.persistence.FetchType.LAZY 
	)
	@JoinColumn (
		name = "IDSUBMORGANISMO0",
		referencedColumnName = "IDXSUBMORGANISMO",
		nullable = true,
		insertable = true,
		updatable = true 
	)
	private Submorganismo idsubmorganismo; 

	public void setDuracion(
		Integer var
	) {
		this.duracion=var; 
	}
	
	public Integer getDuracion() {
		return this.duracion; 
	}
	
	public void setDescripcion(
		String var
	) {
		this.descripcion=var; 
	}
	
	public String getDescripcion() {
		return this.descripcion; 
	}
	
	public void setIdxgexmtipo(
		Long var
	) {
		this.idxgexmtipo=var; 
	}
	
	public Long getIdxgexmtipo() {
		return this.idxgexmtipo; 
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
	
	public void setIdsubmorganismo(
		Submorganismo var
	) {
		this.idsubmorganismo=var; 
	}
	
	public Submorganismo getIdsubmorganismo() {
		if(this.idsubmorganismo==null)this.idsubmorganismo=new org.suinsit.apps.subvenciones.Submorganismo();
		  return this.idsubmorganismo; 
	} 

}