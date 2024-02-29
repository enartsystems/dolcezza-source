package org.suinsit.apps.subscripciones;

import java.io.Serializable;
import java.lang.Long;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import org.enartframework.nocode.annotacion.Entidad;
import org.suinsit.apps.facturacin.Erpfactura;
import org.suinsit.apps.subscripciones.Subscripcion;

@Entity
@Table (
	name = "SUBRFACT" 
)
@Entidad (
	type = "TABLE",
	pk = "idxsubrfact" 
)
public class Subrfact implements Serializable { 

	private static final long serialVersionUID = 1L;
	@Id
	@Column (
		name = "IDXSUBRFACT",
		nullable = true 
	)
	private Long idxsubrfact;
	private boolean updatable;
	@ManyToOne (
		fetch = javax.persistence.FetchType.LAZY 
	)
	@JoinColumn (
		name = "IDERPFACTURA0",
		referencedColumnName = "IDXERPFACTURA",
		nullable = true,
		insertable = true,
		updatable = true 
	)
	private Erpfactura iderpfactura;
	@ManyToOne (
		fetch = javax.persistence.FetchType.LAZY 
	)
	@JoinColumn (
		name = "IDSUBSCRIPCION0",
		referencedColumnName = "IDXSUBSCRIPCION",
		nullable = true,
		insertable = true,
		updatable = true 
	)
	private Subscripcion idsubscripcion; 

	public void setIdxsubrfact(
		Long var
	) {
		this.idxsubrfact=var; 
	}
	
	public Long getIdxsubrfact() {
		return this.idxsubrfact; 
	}
	
	public void setUpdatable(
		boolean var
	) {
		this.updatable=var; 
	}
	
	public boolean isUpdatable() {
		return this.updatable; 
	}
	
	public void setIderpfactura(
		Erpfactura var
	) {
		this.iderpfactura=var; 
	}
	
	public Erpfactura getIderpfactura() {
		if(this.iderpfactura==null)this.iderpfactura=new org.suinsit.apps.facturacin.Erpfactura();
		  return this.iderpfactura; 
	}
	
	public void setIdsubscripcion(
		Subscripcion var
	) {
		this.idsubscripcion=var; 
	}
	
	public Subscripcion getIdsubscripcion() {
		if(this.idsubscripcion==null)this.idsubscripcion=new org.suinsit.apps.subscripciones.Subscripcion();
		  return this.idsubscripcion; 
	} 

}