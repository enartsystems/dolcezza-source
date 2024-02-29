package org.suinsit.apps.portalemp;

import java.io.Serializable;
import java.lang.Long;
import java.lang.String;
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
import org.suinsit.apps.document.Docfichero;
import org.suinsit.apps.portalemp.Rrhempleado;
import org.suinsit.apps.portalemp.Rrhmtipoconta;

@Entity
@Table (
	name = "RRHHREMPCONTRA" 
)
@Entidad (
	type = "TABLE",
	pk = "idxrrhhrempcontra" 
)
public class Rrhhrempcontra implements Serializable { 

	private static final long serialVersionUID = 1L;
	@Column (
		name = "SALARYDAY",
		nullable = true 
	)
	private BigDecimal salaryday;
	@Column (
		name = "SALARYMENSUAL",
		nullable = true 
	)
	private BigDecimal salarymensual;
	@Column (
		name = "SALARYANUAL",
		nullable = true 
	)
	private BigDecimal salaryanual;
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
	@Column (
		name = "FIN",
		nullable = true 
	)
	private Date fin;
	@Id
	@Column (
		name = "IDXRRHHREMPCONTRA",
		nullable = true 
	)
	private Long idxrrhhrempcontra;
	@Column (
		name = "INICIO",
		nullable = true 
	)
	private Date inicio;
	@Column (
		name = "TMALTA",
		nullable = true 
	)
	private Timestamp tmalta;
	@Column (
		name = "TMMODIF",
		nullable = true 
	)
	private Timestamp tmmodif;
	@Column (
		name = "VIGENTE",
		nullable = true 
	)
	private boolean vigente;
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
		name = "IDRRHMTIPOCONTA0",
		referencedColumnName = "IDXRRHMTIPOCONTA",
		nullable = true,
		insertable = true,
		updatable = true 
	)
	private Rrhmtipoconta idrrhmtipoconta;
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

	public void setSalaryday(
		BigDecimal var
	) {
		this.salaryday=var; 
	}
	
	public BigDecimal getSalaryday() {
		return this.salaryday; 
	}
	
	public void setSalarymensual(
		BigDecimal var
	) {
		this.salarymensual=var; 
	}
	
	public BigDecimal getSalarymensual() {
		return this.salarymensual; 
	}
	
	public void setSalaryanual(
		BigDecimal var
	) {
		this.salaryanual=var; 
	}
	
	public BigDecimal getSalaryanual() {
		return this.salaryanual; 
	}
	
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
	
	public void setFin(
		Date var
	) {
		this.fin=var; 
	}
	
	public Date getFin() {
		return this.fin; 
	}
	
	public void setIdxrrhhrempcontra(
		Long var
	) {
		this.idxrrhhrempcontra=var; 
	}
	
	public Long getIdxrrhhrempcontra() {
		return this.idxrrhhrempcontra; 
	}
	
	public void setInicio(
		Date var
	) {
		this.inicio=var; 
	}
	
	public Date getInicio() {
		return this.inicio; 
	}
	
	public void setTmalta(
		Timestamp var
	) {
		this.tmalta=var; 
	}
	
	public Timestamp getTmalta() {
		return this.tmalta; 
	}
	
	public void setTmmodif(
		Timestamp var
	) {
		this.tmmodif=var; 
	}
	
	public Timestamp getTmmodif() {
		return this.tmmodif; 
	}
	
	public void setVigente(
		boolean var
	) {
		this.vigente=var; 
	}
	
	public boolean isVigente() {
		return this.vigente; 
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
	
	public void setIdrrhmtipoconta(
		Rrhmtipoconta var
	) {
		this.idrrhmtipoconta=var; 
	}
	
	public Rrhmtipoconta getIdrrhmtipoconta() {
		if(this.idrrhmtipoconta==null)this.idrrhmtipoconta=new org.suinsit.apps.portalemp.Rrhmtipoconta();
		  return this.idrrhmtipoconta; 
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