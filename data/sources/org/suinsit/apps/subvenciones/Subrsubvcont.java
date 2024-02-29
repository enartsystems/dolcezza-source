package org.suinsit.apps.subvenciones;

import java.io.Serializable;
import java.lang.Long;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import org.enartframework.nocode.annotacion.Entidad;
import org.suinsit.apps.crm.Crmcontacto;
import org.suinsit.apps.subvenciones.Subsubvencion;

@Entity
@Table (
	name = "SUBRSUBVCONT" 
)
@Entidad (
	type = "TABLE",
	pk = "idxsubrsubvcont" 
)
public class Subrsubvcont implements Serializable { 

	private static final long serialVersionUID = 1L;
	@Id
	@Column (
		name = "IDXSUBRSUBVCONT",
		nullable = true 
	)
	private Long idxsubrsubvcont;
	private boolean updatable;
	@ManyToOne (
		fetch = javax.persistence.FetchType.LAZY 
	)
	@JoinColumn (
		name = "IDSUBSUBVENCION0",
		referencedColumnName = "IDXSUBSUBVENCION",
		nullable = true,
		insertable = true,
		updatable = true 
	)
	private Subsubvencion idsubsubvencion;
	@ManyToOne (
		fetch = javax.persistence.FetchType.LAZY 
	)
	@JoinColumn (
		name = "IDCRMCONTACTO0",
		referencedColumnName = "IDXCRMCONTACTO",
		nullable = true,
		insertable = true,
		updatable = true 
	)
	private Crmcontacto idcrmcontacto; 

	public void setIdxsubrsubvcont(
		Long var
	) {
		this.idxsubrsubvcont=var; 
	}
	
	public Long getIdxsubrsubvcont() {
		return this.idxsubrsubvcont; 
	}
	
	public void setUpdatable(
		boolean var
	) {
		this.updatable=var; 
	}
	
	public boolean isUpdatable() {
		return this.updatable; 
	}
	
	public void setIdsubsubvencion(
		Subsubvencion var
	) {
		this.idsubsubvencion=var; 
	}
	
	public Subsubvencion getIdsubsubvencion() {
		if(this.idsubsubvencion==null)this.idsubsubvencion=new org.suinsit.apps.subvenciones.Subsubvencion();
		  return this.idsubsubvencion; 
	}
	
	public void setIdcrmcontacto(
		Crmcontacto var
	) {
		this.idcrmcontacto=var; 
	}
	
	public Crmcontacto getIdcrmcontacto() {
		if(this.idcrmcontacto==null)this.idcrmcontacto=new org.suinsit.apps.crm.Crmcontacto();
		  return this.idcrmcontacto; 
	} 

}