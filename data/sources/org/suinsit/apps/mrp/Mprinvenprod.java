package org.suinsit.apps.mrp;

import java.io.Serializable;
import java.lang.Long;
import java.math.BigDecimal;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import org.enartframework.nocode.annotacion.Entidad;
import org.suinsit.apps.crm.Crmproducto;
import org.suinsit.apps.mrp.Mrpminventario;

@Entity
@Table (
	name = "MPRINVENPROD" 
)
@Entidad (
	type = "TABLE",
	pk = "idxmprinvenprod" 
)
public class Mprinvenprod implements Serializable { 

	private static final long serialVersionUID = 1L;
	@Id
	@Column (
		name = "idxmprinvenprod",
		nullable = true 
	)
	private Long idxmprinvenprod;
	@Column (
		name = "unidades",
		nullable = true 
	)
	private BigDecimal unidades;
	private boolean updatable;
	@ManyToOne (
		fetch = javax.persistence.FetchType.LAZY 
	)
	@JoinColumn (
		name = "IDMRPMINVENTARIO0",
		referencedColumnName = "IDXMRPMINVENTARIO",
		nullable = true,
		insertable = true,
		updatable = true 
	)
	private Mrpminventario idmrpminventario;
	@ManyToOne (
		fetch = javax.persistence.FetchType.LAZY 
	)
	@JoinColumn (
		name = "IDCRMPRODUCTO0",
		referencedColumnName = "IDXCRMPRODUCTO",
		nullable = true,
		insertable = true,
		updatable = true 
	)
	private Crmproducto idcrmproducto; 

	public void setIdxmprinvenprod(
		Long var
	) {
		this.idxmprinvenprod=var; 
	}
	
	public Long getIdxmprinvenprod() {
		return this.idxmprinvenprod; 
	}
	
	public void setUnidades(
		BigDecimal var
	) {
		this.unidades=var; 
	}
	
	public BigDecimal getUnidades() {
		return this.unidades; 
	}
	
	public void setUpdatable(
		boolean var
	) {
		this.updatable=var; 
	}
	
	public boolean isUpdatable() {
		return this.updatable; 
	}
	
	public void setIdmrpminventario(
		Mrpminventario var
	) {
		this.idmrpminventario=var; 
	}
	
	public Mrpminventario getIdmrpminventario() {
		if(this.idmrpminventario==null)this.idmrpminventario=new org.suinsit.apps.mrp.Mrpminventario();
		  return this.idmrpminventario; 
	}
	
	public void setIdcrmproducto(
		Crmproducto var
	) {
		this.idcrmproducto=var; 
	}
	
	public Crmproducto getIdcrmproducto() {
		if(this.idcrmproducto==null)this.idcrmproducto=new org.suinsit.apps.crm.Crmproducto();
		  return this.idcrmproducto; 
	} 

}