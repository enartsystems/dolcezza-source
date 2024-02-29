package org.suinsit.apps.facturacin;

import java.io.Serializable;
import java.lang.Long;
import java.lang.String;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import org.enartframework.nocode.annotacion.Entidad;
import org.suinsit.apps.facturacin.Promproducto;

@Entity
@Table (
	name = "ERPPERIODICIDAD" 
)
@Entidad (
	type = "TABLE",
	pk = "idxerpperiodicidad" 
)
public class Erpperiodicidad implements Serializable { 

	private static final long serialVersionUID = 1L;
	@Column (
		name = "COEFICIENTE",
		nullable = true 
	)
	private BigDecimal coeficiente;
	@Id
	@Column (
		name = "IDXERPPERIODICIDAD",
		nullable = true 
	)
	private Long idxerpperiodicidad;
	@Column (
		name = "PERIODICIDAD",
		nullable = false 
	)
	private String periodicidad;
	private boolean updatable;
	private List<Promproducto> subpromproducto; 

	public void setCoeficiente(
		BigDecimal var
	) {
		this.coeficiente=var; 
	}
	
	public BigDecimal getCoeficiente() {
		return this.coeficiente; 
	}
	
	public void setIdxerpperiodicidad(
		Long var
	) {
		this.idxerpperiodicidad=var; 
	}
	
	public Long getIdxerpperiodicidad() {
		return this.idxerpperiodicidad; 
	}
	
	public void setPeriodicidad(
		String var
	) {
		this.periodicidad=var; 
	}
	
	public String getPeriodicidad() {
		return this.periodicidad; 
	}
	
	public void setUpdatable(
		boolean var
	) {
		this.updatable=var; 
	}
	
	public boolean isUpdatable() {
		return this.updatable; 
	}
	
	public void setSubpromproducto(
		List<Promproducto> var
	) {
		this.subpromproducto=var; 
	}
	
	public List<Promproducto> getSubpromproducto() {
		if(this.subpromproducto==null)this.subpromproducto=new ArrayList<>(0);
		  return this.subpromproducto; 
	} 

}