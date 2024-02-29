package org.suinsit.apps.pmo;

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
import org.suinsit.apps.admin.Ssousuario;

@Entity
@Table (
	name = "PMOUSUARIO" 
)
@Entidad (
	type = "TABLE",
	pk = "idxpmousuario" 
)
public class Pmousuario implements Serializable { 

	private static final long serialVersionUID = 1L;
	@Column (
		name = "EXTERNO",
		nullable = true 
	)
	private boolean externo;
	@Column (
		name = "FACTHORA",
		nullable = true 
	)
	private BigDecimal facthora;
	@Column (
		name = "COSTEHORA",
		nullable = true 
	)
	private BigDecimal costehora;
	@Id
	@Column (
		name = "IDXPMOUSUARIO",
		nullable = true 
	)
	private Long idxpmousuario;
	private boolean updatable;
	@ManyToOne (
		fetch = javax.persistence.FetchType.LAZY 
	)
	@JoinColumn (
		name = "IDSSOUSUARIO0",
		referencedColumnName = "IDXSSOUSUARIO",
		nullable = true,
		insertable = true,
		updatable = true 
	)
	private Ssousuario idssousuario; 

	public void setExterno(
		boolean var
	) {
		this.externo=var; 
	}
	
	public boolean isExterno() {
		return this.externo; 
	}
	
	public void setFacthora(
		BigDecimal var
	) {
		this.facthora=var; 
	}
	
	public BigDecimal getFacthora() {
		return this.facthora; 
	}
	
	public void setCostehora(
		BigDecimal var
	) {
		this.costehora=var; 
	}
	
	public BigDecimal getCostehora() {
		return this.costehora; 
	}
	
	public void setIdxpmousuario(
		Long var
	) {
		this.idxpmousuario=var; 
	}
	
	public Long getIdxpmousuario() {
		return this.idxpmousuario; 
	}
	
	public void setUpdatable(
		boolean var
	) {
		this.updatable=var; 
	}
	
	public boolean isUpdatable() {
		return this.updatable; 
	}
	
	public void setIdssousuario(
		Ssousuario var
	) {
		this.idssousuario=var; 
	}
	
	public Ssousuario getIdssousuario() {
		if(this.idssousuario==null)this.idssousuario=new org.suinsit.apps.admin.Ssousuario();
		  return this.idssousuario; 
	} 

}