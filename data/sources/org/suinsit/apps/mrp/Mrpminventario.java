package org.suinsit.apps.mrp;

import java.io.Serializable;
import java.lang.Long;
import java.lang.String;
import java.sql.Timestamp;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import org.enartframework.nocode.annotacion.Entidad;
import org.enartframework.nocode.annotacion.Sequence;
import org.suinsit.apps.crm.Crmempresa;
import org.suinsit.apps.portalemp.Rrhempleado;

@Entity
@Table (
	name = "MRPMINVENTARIO" 
)
@Entidad (
	type = "TABLE",
	pk = "idxmrpminventario" 
)
public class Mrpminventario implements Serializable { 

	private static final long serialVersionUID = 1L;
	@Column (
		name = "documento",
		nullable = true 
	)
	private String documento;
	@Id
	@Column (
		name = "idxmrpminventario",
		nullable = true 
	)
	private Long idxmrpminventario;
	@Column (
		name = "notas",
		nullable = true 
	)
	private String notas;
	@Column (
		name = "prevista",
		nullable = true 
	)
	private Timestamp prevista;
	@Column (
		name = "referencia",
		nullable = true 
	)
	@Sequence (
		name = "MRPMINVENTARIO_REFERENCIA",
		prefix = "MRPI",
		mask = "0000000000",
		addYear = true 
	)
	private String referencia;
	private boolean updatable;
	@ManyToOne (
		fetch = javax.persistence.FetchType.LAZY 
	)
	@JoinColumn (
		name = "IDENVIADODE0",
		referencedColumnName = "IDXCRMEMPRESA",
		nullable = true,
		insertable = true,
		updatable = true 
	)
	private Crmempresa idenviadode;
	@ManyToOne (
		fetch = javax.persistence.FetchType.LAZY 
	)
	@JoinColumn (
		name = "IDRESPONSABLE0",
		referencedColumnName = "IDXRRHEMPLEADO",
		nullable = true,
		insertable = true,
		updatable = true 
	)
	private Rrhempleado idresponsable; 

	public void setDocumento(
		String var
	) {
		this.documento=var; 
	}
	
	public String getDocumento() {
		return this.documento; 
	}
	
	public void setIdxmrpminventario(
		Long var
	) {
		this.idxmrpminventario=var; 
	}
	
	public Long getIdxmrpminventario() {
		return this.idxmrpminventario; 
	}
	
	public void setNotas(
		String var
	) {
		this.notas=var; 
	}
	
	public String getNotas() {
		return this.notas; 
	}
	
	public void setPrevista(
		Timestamp var
	) {
		this.prevista=var; 
	}
	
	public Timestamp getPrevista() {
		return this.prevista; 
	}
	
	public void setReferencia(
		String var
	) {
		this.referencia=var; 
	}
	
	public String getReferencia() {
		return this.referencia; 
	}
	
	public void setUpdatable(
		boolean var
	) {
		this.updatable=var; 
	}
	
	public boolean isUpdatable() {
		return this.updatable; 
	}
	
	public void setIdenviadode(
		Crmempresa var
	) {
		this.idenviadode=var; 
	}
	
	public Crmempresa getIdenviadode() {
		if(this.idenviadode==null)this.idenviadode=new org.suinsit.apps.crm.Crmempresa();
		  return this.idenviadode; 
	}
	
	public void setIdresponsable(
		Rrhempleado var
	) {
		this.idresponsable=var; 
	}
	
	public Rrhempleado getIdresponsable() {
		if(this.idresponsable==null)this.idresponsable=new org.suinsit.apps.portalemp.Rrhempleado();
		  return this.idresponsable; 
	} 

}