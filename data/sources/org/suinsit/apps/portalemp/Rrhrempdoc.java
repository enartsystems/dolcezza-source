package org.suinsit.apps.portalemp;

import java.io.Serializable;
import java.lang.Long;
import java.lang.String;
import java.sql.Date;
import java.sql.Timestamp;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import org.enartframework.nocode.annotacion.Entidad;
import org.suinsit.apps.document.Docfichero;
import org.suinsit.apps.portalemp.Rrhempleado;

@Entity
@Table (
	name = "RRHREMPDOC" 
)
@Entidad (
	type = "TABLE",
	pk = "idxrrhrempdoc" 
)
public class Rrhrempdoc implements Serializable { 

	private static final long serialVersionUID = 1L;
	@Column (
		name = "NOTIFICADO",
		nullable = true 
	)
	private boolean notificado;
	@Column (
		name = "FECHADESCARGA",
		nullable = true 
	)
	private Date fechadescarga;
	@Column (
		name = "FECHALTA",
		nullable = false 
	)
	private Date fechalta;
	@Id
	@Column (
		name = "IDXRRHREMPDOC",
		nullable = true 
	)
	private Long idxrrhrempdoc;
	@Column (
		name = "COUSERALTA",
		nullable = true 
	)
	private String couseralta;
	@Column (
		name = "TMALTA",
		nullable = true 
	)
	private Timestamp tmalta;
	@Column (
		name = "COUSERMODIF",
		nullable = true 
	)
	private String cousermodif;
	@Column (
		name = "TMMODIF",
		nullable = true 
	)
	private Timestamp tmmodif;
	private boolean updatable;
	@ManyToOne (
		fetch = javax.persistence.FetchType.LAZY 
	)
	@JoinColumn (
		name = "IDRRHEMPLEADO0",
		referencedColumnName = "IDXRRHEMPLEADO",
		nullable = true,
		insertable = true,
		updatable = true 
	)
	private Rrhempleado idrrhempleado;
	@ManyToOne (
		fetch = javax.persistence.FetchType.LAZY 
	)
	@JoinColumn (
		name = "IDDOCFICHERO0",
		referencedColumnName = "IDXDOCFICHERO",
		nullable = true,
		insertable = true,
		updatable = true 
	)
	private Docfichero iddocfichero; 

	public void setNotificado(
		boolean var
	) {
		this.notificado=var; 
	}
	
	public boolean isNotificado() {
		return this.notificado; 
	}
	
	public void setFechadescarga(
		Date var
	) {
		this.fechadescarga=var; 
	}
	
	public Date getFechadescarga() {
		return this.fechadescarga; 
	}
	
	public void setFechalta(
		Date var
	) {
		this.fechalta=var; 
	}
	
	public Date getFechalta() {
		return this.fechalta; 
	}
	
	public void setIdxrrhrempdoc(
		Long var
	) {
		this.idxrrhrempdoc=var; 
	}
	
	public Long getIdxrrhrempdoc() {
		return this.idxrrhrempdoc; 
	}
	
	public void setCouseralta(
		String var
	) {
		this.couseralta=var; 
	}
	
	public String getCouseralta() {
		return this.couseralta; 
	}
	
	public void setTmalta(
		Timestamp var
	) {
		this.tmalta=var; 
	}
	
	public Timestamp getTmalta() {
		return this.tmalta; 
	}
	
	public void setCousermodif(
		String var
	) {
		this.cousermodif=var; 
	}
	
	public String getCousermodif() {
		return this.cousermodif; 
	}
	
	public void setTmmodif(
		Timestamp var
	) {
		this.tmmodif=var; 
	}
	
	public Timestamp getTmmodif() {
		return this.tmmodif; 
	}
	
	public void setUpdatable(
		boolean var
	) {
		this.updatable=var; 
	}
	
	public boolean isUpdatable() {
		return this.updatable; 
	}
	
	public void setIdrrhempleado(
		Rrhempleado var
	) {
		this.idrrhempleado=var; 
	}
	
	public Rrhempleado getIdrrhempleado() {
		if(this.idrrhempleado==null)this.idrrhempleado=new org.suinsit.apps.portalemp.Rrhempleado();
		  return this.idrrhempleado; 
	}
	
	public void setIddocfichero(
		Docfichero var
	) {
		this.iddocfichero=var; 
	}
	
	public Docfichero getIddocfichero() {
		if(this.iddocfichero==null)this.iddocfichero=new org.suinsit.apps.document.Docfichero();
		  return this.iddocfichero; 
	} 

}