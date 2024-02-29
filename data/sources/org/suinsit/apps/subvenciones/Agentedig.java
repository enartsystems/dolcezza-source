package org.suinsit.apps.subvenciones;

import java.io.Serializable;
import java.lang.Long;
import java.lang.String;
import java.math.BigDecimal;
import java.sql.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import org.enartframework.nocode.annotacion.Entidad;
import org.suinsit.apps.crm.Crmempresa;

@Entity
@Table (
	name = "AGENTEDIG" 
)
@Entidad (
	type = "TABLE",
	pk = "idxagentedig" 
)
public class Agentedig implements Serializable { 

	private static final long serialVersionUID = 1L;
	@Column (
		name = "COMENTARIOS",
		nullable = true 
	)
	private String comentarios;
	@Column (
		name = "ALTA",
		nullable = true 
	)
	private Date alta;
	@Column (
		name = "PERCENTCOMI",
		nullable = true 
	)
	private BigDecimal percentcomi;
	@Column (
		name = "AGENTE",
		nullable = true 
	)
	private String agente;
	@Id
	@Column (
		name = "IDXAGENTEDIG",
		nullable = true 
	)
	private Long idxagentedig;
	private boolean updatable;
	@ManyToOne (
		fetch = javax.persistence.FetchType.LAZY 
	)
	@JoinColumn (
		name = "IDCRMEMPRESA0",
		referencedColumnName = "IDXCRMEMPRESA",
		nullable = true,
		insertable = true,
		updatable = true 
	)
	private Crmempresa idcrmempresa; 

	public void setComentarios(
		String var
	) {
		this.comentarios=var; 
	}
	
	public String getComentarios() {
		return this.comentarios; 
	}
	
	public void setAlta(
		Date var
	) {
		this.alta=var; 
	}
	
	public Date getAlta() {
		return this.alta; 
	}
	
	public void setPercentcomi(
		BigDecimal var
	) {
		this.percentcomi=var; 
	}
	
	public BigDecimal getPercentcomi() {
		return this.percentcomi; 
	}
	
	public void setAgente(
		String var
	) {
		this.agente=var; 
	}
	
	public String getAgente() {
		return this.agente; 
	}
	
	public void setIdxagentedig(
		Long var
	) {
		this.idxagentedig=var; 
	}
	
	public Long getIdxagentedig() {
		return this.idxagentedig; 
	}
	
	public void setUpdatable(
		boolean var
	) {
		this.updatable=var; 
	}
	
	public boolean isUpdatable() {
		return this.updatable; 
	}
	
	public void setIdcrmempresa(
		Crmempresa var
	) {
		this.idcrmempresa=var; 
	}
	
	public Crmempresa getIdcrmempresa() {
		if(this.idcrmempresa==null)this.idcrmempresa=new org.suinsit.apps.crm.Crmempresa();
		  return this.idcrmempresa; 
	} 

}