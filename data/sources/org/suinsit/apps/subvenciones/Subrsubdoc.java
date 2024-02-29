package org.suinsit.apps.subvenciones;

import java.io.Serializable;
import java.lang.Long;
import java.lang.String;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import org.enartframework.nocode.annotacion.Entidad;
import org.suinsit.apps.document.Docfichero;
import org.suinsit.apps.subvenciones.Subsubvencion;

@Entity
@Table (
	name = "SUBRSUBDOC" 
)
@Entidad (
	type = "TABLE",
	pk = "idxsubrsubdoc" 
)
public class Subrsubdoc implements Serializable { 

	private static final long serialVersionUID = 1L;
	@Column (
		name = "COUSERALTA",
		nullable = true 
	)
	private String couseralta;
	@Column (
		name = "COUSERMODIF",
		nullable = true 
	)
	private String cousermodif;
	@Id
	@Column (
		name = "IDXSUBRSUBDOC",
		nullable = true 
	)
	private Long idxsubrsubdoc;
	@Column (
		name = "TMALTA",
		nullable = true 
	)
	private String tmalta;
	@Column (
		name = "TMMODIF",
		nullable = true 
	)
	private String tmmodif;
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
		name = "IDDOCFICHERO0",
		referencedColumnName = "IDXDOCFICHERO",
		nullable = true,
		insertable = true,
		updatable = true 
	)
	private Docfichero iddocfichero; 

	public void setCouseralta(
		String var
	) {
		this.couseralta=var; 
	}
	
	public String getCouseralta() {
		return this.couseralta; 
	}
	
	public void setCousermodif(
		String var
	) {
		this.cousermodif=var; 
	}
	
	public String getCousermodif() {
		return this.cousermodif; 
	}
	
	public void setIdxsubrsubdoc(
		Long var
	) {
		this.idxsubrsubdoc=var; 
	}
	
	public Long getIdxsubrsubdoc() {
		return this.idxsubrsubdoc; 
	}
	
	public void setTmalta(
		String var
	) {
		this.tmalta=var; 
	}
	
	public String getTmalta() {
		return this.tmalta; 
	}
	
	public void setTmmodif(
		String var
	) {
		this.tmmodif=var; 
	}
	
	public String getTmmodif() {
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
	
	public void setIdsubsubvencion(
		Subsubvencion var
	) {
		this.idsubsubvencion=var; 
	}
	
	public Subsubvencion getIdsubsubvencion() {
		if(this.idsubsubvencion==null)this.idsubsubvencion=new org.suinsit.apps.subvenciones.Subsubvencion();
		  return this.idsubsubvencion; 
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