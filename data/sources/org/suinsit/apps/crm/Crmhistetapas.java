package org.suinsit.apps.crm;

import java.io.Serializable;
import java.lang.Integer;
import java.lang.Long;
import java.math.BigDecimal;
import java.sql.Date;
import java.sql.Timestamp;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import org.enartframework.nocode.annotacion.Entidad;
import org.suinsit.apps.admin.Ssousuario;
import org.suinsit.apps.crm.Crmetapa;
import org.suinsit.apps.crm.Crmoportunidad;
import org.suinsit.apps.crm.Crmtarea;

@Entity
@Table (
	name = "CRMHISTETAPAS" 
)
@Entidad (
	type = "TABLE",
	pk = "idxcrmhistetapas" 
)
public class Crmhistetapas implements Serializable { 

	private static final long serialVersionUID = 1L;
	@Column (
		name = "ALTAHISTORICO",
		nullable = true 
	)
	private Date altahistorico;
	@Column (
		name = "BAJAHISTORICO",
		nullable = true 
	)
	private Date bajahistorico;
	@Column (
		name = "DIASETAPA",
		nullable = true 
	)
	private Integer diasetapa;
	@Id
	@Column (
		name = "IDXCRMHISTETAPAS",
		nullable = true 
	)
	private Long idxcrmhistetapas;
	@Column (
		name = "IMPORTEPREV",
		nullable = true 
	)
	private BigDecimal importeprev;
	@Column (
		name = "MODIFICACION",
		nullable = true 
	)
	private Timestamp modificacion;
	@Column (
		name = "PROBABILIDAD",
		nullable = true 
	)
	private BigDecimal probabilidad;
	private boolean updatable;
	@ManyToOne (
		fetch = javax.persistence.FetchType.LAZY 
	)
	@JoinColumn (
		name = "IDCRMOPORTUNIDAD0",
		referencedColumnName = "IDXOPORTUNIDAD",
		nullable = true,
		insertable = true,
		updatable = true 
	)
	private Crmoportunidad idcrmoportunidad;
	@ManyToOne (
		fetch = javax.persistence.FetchType.LAZY 
	)
	@JoinColumn (
		name = "IDCRMETAPA0",
		referencedColumnName = "IDXCRMETAPA",
		nullable = true,
		insertable = true,
		updatable = true 
	)
	private Crmetapa idcrmetapa;
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
	@ManyToOne (
		fetch = javax.persistence.FetchType.LAZY 
	)
	@JoinColumn (
		name = "IDCRMTAREA0",
		referencedColumnName = "IDXCRMTAREA",
		nullable = true,
		insertable = true,
		updatable = true 
	)
	private Crmtarea idcrmtarea; 

	public void setAltahistorico(
		Date var
	) {
		this.altahistorico=var; 
	}
	
	public Date getAltahistorico() {
		return this.altahistorico; 
	}
	
	public void setBajahistorico(
		Date var
	) {
		this.bajahistorico=var; 
	}
	
	public Date getBajahistorico() {
		return this.bajahistorico; 
	}
	
	public void setDiasetapa(
		Integer var
	) {
		this.diasetapa=var; 
	}
	
	public Integer getDiasetapa() {
		return this.diasetapa; 
	}
	
	public void setIdxcrmhistetapas(
		Long var
	) {
		this.idxcrmhistetapas=var; 
	}
	
	public Long getIdxcrmhistetapas() {
		return this.idxcrmhistetapas; 
	}
	
	public void setImporteprev(
		BigDecimal var
	) {
		this.importeprev=var; 
	}
	
	public BigDecimal getImporteprev() {
		return this.importeprev; 
	}
	
	public void setModificacion(
		Timestamp var
	) {
		this.modificacion=var; 
	}
	
	public Timestamp getModificacion() {
		return this.modificacion; 
	}
	
	public void setProbabilidad(
		BigDecimal var
	) {
		this.probabilidad=var; 
	}
	
	public BigDecimal getProbabilidad() {
		return this.probabilidad; 
	}
	
	public void setUpdatable(
		boolean var
	) {
		this.updatable=var; 
	}
	
	public boolean isUpdatable() {
		return this.updatable; 
	}
	
	public void setIdcrmoportunidad(
		Crmoportunidad var
	) {
		this.idcrmoportunidad=var; 
	}
	
	public Crmoportunidad getIdcrmoportunidad() {
		if(this.idcrmoportunidad==null)this.idcrmoportunidad=new org.suinsit.apps.crm.Crmoportunidad();
		  return this.idcrmoportunidad; 
	}
	
	public void setIdcrmetapa(
		Crmetapa var
	) {
		this.idcrmetapa=var; 
	}
	
	public Crmetapa getIdcrmetapa() {
		if(this.idcrmetapa==null)this.idcrmetapa=new org.suinsit.apps.crm.Crmetapa();
		  return this.idcrmetapa; 
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
	
	public void setIdcrmtarea(
		Crmtarea var
	) {
		this.idcrmtarea=var; 
	}
	
	public Crmtarea getIdcrmtarea() {
		if(this.idcrmtarea==null)this.idcrmtarea=new org.suinsit.apps.crm.Crmtarea();
		  return this.idcrmtarea; 
	} 

}