package org.suinsit.apps.expedientes;

import java.io.Serializable;
import java.lang.Long;
import java.lang.String;
import java.sql.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import org.enartframework.nocode.annotacion.Entidad;
import org.enartframework.nocode.annotacion.Sequence;
import org.suinsit.apps.admin.Ssousuario;
import org.suinsit.apps.expedientes.Gexmepediente;
import org.suinsit.apps.expedientes.Gexmtiporeq;

@Entity
@Table (
	name = "GEXRREQEXP" 
)
@Entidad (
	type = "TABLE",
	pk = "idxgexrreqexp" 
)
public class Gexrreqexp implements Serializable { 

	private static final long serialVersionUID = 1L;
	@Column (
		name = "ALTA",
		nullable = false 
	)
	private Date alta;
	@Column (
		name = "COMENCLI",
		nullable = true 
	)
	private String comencli;
	@Column (
		name = "COMENTOFFICE",
		nullable = true 
	)
	private String comentoffice;
	@Column (
		name = "CUMPLIMENTADO",
		nullable = true 
	)
	private boolean cumplimentado;
	@Column (
		name = "DECLARACION",
		nullable = true 
	)
	private String declaracion;
	@Id
	@Column (
		name = "IDXGEXRREQEXP",
		nullable = true 
	)
	private Long idxgexrreqexp;
	@Column (
		name = "OBLIGATORIO",
		nullable = true 
	)
	private boolean obligatorio;
	@Column (
		name = "REQUISITO",
		nullable = true 
	)
	@Sequence (
		name = "GEXRREQEXP_REQUISITO",
		prefix = "",
		mask = "0000000000",
		addYear = false 
	)
	private String requisito;
	private boolean updatable;
	@ManyToOne (
		fetch = javax.persistence.FetchType.LAZY 
	)
	@JoinColumn (
		name = "IDGEXMTIPOREQ0",
		referencedColumnName = "IDXGEXMTIPOREQ",
		nullable = true,
		insertable = true,
		updatable = true 
	)
	private Gexmtiporeq idgexmtiporeq;
	@ManyToOne (
		fetch = javax.persistence.FetchType.LAZY 
	)
	@JoinColumn (
		name = "IDGEXMEPEDIENTE0",
		referencedColumnName = "IDXGEXMEPEDIENTE",
		nullable = true,
		insertable = true,
		updatable = true 
	)
	private Gexmepediente idgexmepediente;
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

	public void setAlta(
		Date var
	) {
		this.alta=var; 
	}
	
	public Date getAlta() {
		return this.alta; 
	}
	
	public void setComencli(
		String var
	) {
		this.comencli=var; 
	}
	
	public String getComencli() {
		return this.comencli; 
	}
	
	public void setComentoffice(
		String var
	) {
		this.comentoffice=var; 
	}
	
	public String getComentoffice() {
		return this.comentoffice; 
	}
	
	public void setCumplimentado(
		boolean var
	) {
		this.cumplimentado=var; 
	}
	
	public boolean isCumplimentado() {
		return this.cumplimentado; 
	}
	
	public void setDeclaracion(
		String var
	) {
		this.declaracion=var; 
	}
	
	public String getDeclaracion() {
		return this.declaracion; 
	}
	
	public void setIdxgexrreqexp(
		Long var
	) {
		this.idxgexrreqexp=var; 
	}
	
	public Long getIdxgexrreqexp() {
		return this.idxgexrreqexp; 
	}
	
	public void setObligatorio(
		boolean var
	) {
		this.obligatorio=var; 
	}
	
	public boolean isObligatorio() {
		return this.obligatorio; 
	}
	
	public void setRequisito(
		String var
	) {
		this.requisito=var; 
	}
	
	public String getRequisito() {
		return this.requisito; 
	}
	
	public void setUpdatable(
		boolean var
	) {
		this.updatable=var; 
	}
	
	public boolean isUpdatable() {
		return this.updatable; 
	}
	
	public void setIdgexmtiporeq(
		Gexmtiporeq var
	) {
		this.idgexmtiporeq=var; 
	}
	
	public Gexmtiporeq getIdgexmtiporeq() {
		if(this.idgexmtiporeq==null)this.idgexmtiporeq=new org.suinsit.apps.expedientes.Gexmtiporeq();
		  return this.idgexmtiporeq; 
	}
	
	public void setIdgexmepediente(
		Gexmepediente var
	) {
		this.idgexmepediente=var; 
	}
	
	public Gexmepediente getIdgexmepediente() {
		if(this.idgexmepediente==null)this.idgexmepediente=new org.suinsit.apps.expedientes.Gexmepediente();
		  return this.idgexmepediente; 
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