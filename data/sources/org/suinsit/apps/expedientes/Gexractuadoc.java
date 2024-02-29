package org.suinsit.apps.expedientes;

import java.io.Serializable;
import java.lang.Long;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import org.enartframework.nocode.annotacion.Entidad;
import org.suinsit.apps.document.Docfichero;
import org.suinsit.apps.expedientes.Gexmactuacion;

@Entity
@Table (
	name = "GEXRACTUADOC" 
)
@Entidad (
	type = "TABLE",
	pk = "idxgexractuadoc" 
)
public class Gexractuadoc implements Serializable { 

	private static final long serialVersionUID = 1L;
	@Id
	@Column (
		name = "IDXGEXRACTUADOC",
		nullable = true 
	)
	private Long idxgexractuadoc;
	private boolean updatable;
	@ManyToOne (
		fetch = javax.persistence.FetchType.LAZY 
	)
	@JoinColumn (
		name = "IDGEXMACTUACION0",
		referencedColumnName = "IDXGEXMACTUACION",
		nullable = true,
		insertable = true,
		updatable = true 
	)
	private Gexmactuacion idgexmactuacion;
	@ManyToOne (
		fetch = javax.persistence.FetchType.LAZY 
	)
	@JoinColumn (
		name = "IDDOCFICHERO0",
		referencedColumnName = "IDXDOCFICHERO",
		nullable = true,
		insertable = true,
		updatable = true 
	)
	private Docfichero iddocfichero; 

	public void setIdxgexractuadoc(
		Long var
	) {
		this.idxgexractuadoc=var; 
	}
	
	public Long getIdxgexractuadoc() {
		return this.idxgexractuadoc; 
	}
	
	public void setUpdatable(
		boolean var
	) {
		this.updatable=var; 
	}
	
	public boolean isUpdatable() {
		return this.updatable; 
	}
	
	public void setIdgexmactuacion(
		Gexmactuacion var
	) {
		this.idgexmactuacion=var; 
	}
	
	public Gexmactuacion getIdgexmactuacion() {
		if(this.idgexmactuacion==null)this.idgexmactuacion=new org.suinsit.apps.expedientes.Gexmactuacion();
		  return this.idgexmactuacion; 
	}
	
	public void setIddocfichero(
		Docfichero var
	) {
		this.iddocfichero=var; 
	}
	
	public Docfichero getIddocfichero() {
		if(this.iddocfichero==null)this.iddocfichero=new org.suinsit.apps.document.Docfichero();
		  return this.iddocfichero; 
	} 

}