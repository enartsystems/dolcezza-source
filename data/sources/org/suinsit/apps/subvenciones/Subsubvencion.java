package org.suinsit.apps.subvenciones;

import java.io.Serializable;
import java.lang.Long;
import java.lang.String;
import java.math.BigDecimal;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import org.enartframework.nocode.annotacion.Entidad;
import org.suinsit.apps.subvenciones.Submorganismo;
import org.suinsit.apps.subvenciones.Submtiposub;
import org.suinsit.apps.subvenciones.Subrsubdoc;
import org.suinsit.apps.subvenciones.Subrsubvcont;
import org.suinsit.apps.subvenciones.Subsolictudes;

@Entity
@Table (
	name = "SUBSUBVENCION" 
)
@Entidad (
	type = "TABLE",
	pk = "idxsubsubvencion" 
)
public class Subsubvencion implements Serializable { 

	private static final long serialVersionUID = 1L;
	@Column (
		name = "COMUNICADO",
		nullable = true 
	)
	private String comunicado;
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
		name = "EMAILTRAMITE",
		nullable = true 
	)
	private String emailtramite;
	@Column (
		name = "FECHACIERRE",
		nullable = true 
	)
	private Date fechacierre;
	@Column (
		name = "FECHAINICIO",
		nullable = true 
	)
	private Date fechainicio;
	@Column (
		name = "FECPUBLICACION",
		nullable = true 
	)
	private Date fecpublicacion;
	@Id
	@Column (
		name = "IDXSUBSUBVENCION",
		nullable = true 
	)
	private Long idxsubsubvencion;
	@Column (
		name = "IMPORTEMAXIMO",
		nullable = true 
	)
	private BigDecimal importemaximo;
	@Column (
		name = "MAXSUBVENCION",
		nullable = true 
	)
	private BigDecimal maxsubvencion;
	@Column (
		name = "PERCENTINTERES",
		nullable = true 
	)
	private BigDecimal percentinteres;
	@Column (
		name = "PERCENTPRESTAMO",
		nullable = true 
	)
	private BigDecimal percentprestamo;
	@Column (
		name = "REQUISITOS",
		nullable = true 
	)
	private String requisitos;
	@Column (
		name = "RESUMEN",
		nullable = true 
	)
	private String resumen;
	@Column (
		name = "SUBVENCION",
		nullable = false 
	)
	private String subvencion;
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
	@Column (
		name = "VIGENTE",
		nullable = true 
	)
	private boolean vigente;
	@Column (
		name = "WEBPUBLICACION",
		nullable = true 
	)
	private String webpublicacion;
	@Column (
		name = "WEBTRAMITE",
		nullable = true 
	)
	private String webtramite;
	private boolean updatable;
	@ManyToOne (
		fetch = javax.persistence.FetchType.LAZY 
	)
	@JoinColumn (
		name = "IDSUBMORGANISMO0",
		referencedColumnName = "IDXSUBMORGANISMO",
		nullable = true,
		insertable = true,
		updatable = true 
	)
	private Submorganismo idsubmorganismo;
	@ManyToOne (
		fetch = javax.persistence.FetchType.LAZY 
	)
	@JoinColumn (
		name = "IDSUBMTIPOSUB0",
		referencedColumnName = "IDXSUBMTIPOSUB",
		nullable = true,
		insertable = true,
		updatable = true 
	)
	private Submtiposub idsubmtiposub;
	private List<Subsolictudes> subsubsolictudes;
	private List<Subrsubdoc> subsubrsubdoc;
	private List<Subrsubvcont> subsubrsubvcont; 

	public void setComunicado(
		String var
	) {
		this.comunicado=var; 
	}
	
	public String getComunicado() {
		return this.comunicado; 
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
	
	public void setEmailtramite(
		String var
	) {
		this.emailtramite=var; 
	}
	
	public String getEmailtramite() {
		return this.emailtramite; 
	}
	
	public void setFechacierre(
		Date var
	) {
		this.fechacierre=var; 
	}
	
	public Date getFechacierre() {
		return this.fechacierre; 
	}
	
	public void setFechainicio(
		Date var
	) {
		this.fechainicio=var; 
	}
	
	public Date getFechainicio() {
		return this.fechainicio; 
	}
	
	public void setFecpublicacion(
		Date var
	) {
		this.fecpublicacion=var; 
	}
	
	public Date getFecpublicacion() {
		return this.fecpublicacion; 
	}
	
	public void setIdxsubsubvencion(
		Long var
	) {
		this.idxsubsubvencion=var; 
	}
	
	public Long getIdxsubsubvencion() {
		return this.idxsubsubvencion; 
	}
	
	public void setImportemaximo(
		BigDecimal var
	) {
		this.importemaximo=var; 
	}
	
	public BigDecimal getImportemaximo() {
		return this.importemaximo; 
	}
	
	public void setMaxsubvencion(
		BigDecimal var
	) {
		this.maxsubvencion=var; 
	}
	
	public BigDecimal getMaxsubvencion() {
		return this.maxsubvencion; 
	}
	
	public void setPercentinteres(
		BigDecimal var
	) {
		this.percentinteres=var; 
	}
	
	public BigDecimal getPercentinteres() {
		return this.percentinteres; 
	}
	
	public void setPercentprestamo(
		BigDecimal var
	) {
		this.percentprestamo=var; 
	}
	
	public BigDecimal getPercentprestamo() {
		return this.percentprestamo; 
	}
	
	public void setRequisitos(
		String var
	) {
		this.requisitos=var; 
	}
	
	public String getRequisitos() {
		return this.requisitos; 
	}
	
	public void setResumen(
		String var
	) {
		this.resumen=var; 
	}
	
	public String getResumen() {
		return this.resumen; 
	}
	
	public void setSubvencion(
		String var
	) {
		this.subvencion=var; 
	}
	
	public String getSubvencion() {
		return this.subvencion; 
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
	
	public void setVigente(
		boolean var
	) {
		this.vigente=var; 
	}
	
	public boolean isVigente() {
		return this.vigente; 
	}
	
	public void setWebpublicacion(
		String var
	) {
		this.webpublicacion=var; 
	}
	
	public String getWebpublicacion() {
		return this.webpublicacion; 
	}
	
	public void setWebtramite(
		String var
	) {
		this.webtramite=var; 
	}
	
	public String getWebtramite() {
		return this.webtramite; 
	}
	
	public void setUpdatable(
		boolean var
	) {
		this.updatable=var; 
	}
	
	public boolean isUpdatable() {
		return this.updatable; 
	}
	
	public void setIdsubmorganismo(
		Submorganismo var
	) {
		this.idsubmorganismo=var; 
	}
	
	public Submorganismo getIdsubmorganismo() {
		if(this.idsubmorganismo==null)this.idsubmorganismo=new org.suinsit.apps.subvenciones.Submorganismo();
		  return this.idsubmorganismo; 
	}
	
	public void setIdsubmtiposub(
		Submtiposub var
	) {
		this.idsubmtiposub=var; 
	}
	
	public Submtiposub getIdsubmtiposub() {
		if(this.idsubmtiposub==null)this.idsubmtiposub=new org.suinsit.apps.subvenciones.Submtiposub();
		  return this.idsubmtiposub; 
	}
	
	public void setSubsubsolictudes(
		List<Subsolictudes> var
	) {
		this.subsubsolictudes=var; 
	}
	
	public List<Subsolictudes> getSubsubsolictudes() {
		if(this.subsubsolictudes==null)this.subsubsolictudes=new ArrayList<>(0);
		  return this.subsubsolictudes; 
	}
	
	public void setSubsubrsubdoc(
		List<Subrsubdoc> var
	) {
		this.subsubrsubdoc=var; 
	}
	
	public List<Subrsubdoc> getSubsubrsubdoc() {
		if(this.subsubrsubdoc==null)this.subsubrsubdoc=new ArrayList<>(0);
		  return this.subsubrsubdoc; 
	}
	
	public void setSubsubrsubvcont(
		List<Subrsubvcont> var
	) {
		this.subsubrsubvcont=var; 
	}
	
	public List<Subrsubvcont> getSubsubrsubvcont() {
		if(this.subsubrsubvcont==null)this.subsubrsubvcont=new ArrayList<>(0);
		  return this.subsubrsubvcont; 
	} 

}