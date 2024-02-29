package org.suinsit.apps.facturacin;

import java.io.Serializable;
import java.lang.Long;
import java.lang.String;
import java.math.BigDecimal;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import org.enartframework.nocode.annotacion.Entidad;

@Entity
@Table (
	name = "ERPSERIES" 
)
@Entidad (
	type = "TABLE",
	pk = "idxerpseries" 
)
public class Erpseries implements Serializable { 

	private static final long serialVersionUID = 1L;
	@Column (
		name = "SEQUENCE",
		nullable = true 
	)
	private String sequence;
	@Column (
		name = "ADDYEAR",
		nullable = true 
	)
	private boolean addyear;
	@Id
	@Column (
		name = "IDXERPSERIES",
		nullable = true 
	)
	private Long idxerpseries;
	@Column (
		name = "LASTVALUE",
		nullable = true 
	)
	private BigDecimal lastvalue;
	@Column (
		name = "MASK",
		nullable = false 
	)
	private String mask;
	@Column (
		name = "PREFIX",
		nullable = false 
	)
	private String prefix;
	@Column (
		name = "RESETYEAR",
		nullable = true 
	)
	private boolean resetyear;
	private boolean updatable; 

	public void setSequence(
		String var
	) {
		this.sequence=var; 
	}
	
	public String getSequence() {
		return this.sequence; 
	}
	
	public void setAddyear(
		boolean var
	) {
		this.addyear=var; 
	}
	
	public boolean isAddyear() {
		return this.addyear; 
	}
	
	public void setIdxerpseries(
		Long var
	) {
		this.idxerpseries=var; 
	}
	
	public Long getIdxerpseries() {
		return this.idxerpseries; 
	}
	
	public void setLastvalue(
		BigDecimal var
	) {
		this.lastvalue=var; 
	}
	
	public BigDecimal getLastvalue() {
		return this.lastvalue; 
	}
	
	public void setMask(
		String var
	) {
		this.mask=var; 
	}
	
	public String getMask() {
		return this.mask; 
	}
	
	public void setPrefix(
		String var
	) {
		this.prefix=var; 
	}
	
	public String getPrefix() {
		return this.prefix; 
	}
	
	public void setResetyear(
		boolean var
	) {
		this.resetyear=var; 
	}
	
	public boolean isResetyear() {
		return this.resetyear; 
	}
	
	public void setUpdatable(
		boolean var
	) {
		this.updatable=var; 
	}
	
	public boolean isUpdatable() {
		return this.updatable; 
	} 

}