package org.suinsit.apps.portalemp;

import java.io.Serializable;
import java.lang.Integer;
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
import org.suinsit.apps.portalemp.Rrhempleado;
import org.suinsit.apps.portalemp.Rrhhturno;

@Entity
@Table (
	name = "RRHHAUSENCIA" 
)
@Entidad (
	type = "TABLE",
	pk = "idxrrhhausencia" 
)
public class Rrhhausencia implements Serializable { 

	private static final long serialVersionUID = 1L;
	@Column (
		name = "APROBADA",
		nullable = true 
	)
	private boolean aprobada;
	@Column (
		name = "COMENTARIOS",
		nullable = true 
	)
	private String comentarios;
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
		name = "DIAS",
		nullable = true 
	)
	private Integer dias;
	@Column (
		name = "FAPROVACION",
		nullable = true 
	)
	private Date faprovacion;
	@Column (
		name = "FIN",
		nullable = true 
	)
	private Date fin;
	@Id
	@Column (
		name = "IDXRRHHAUSENCIA",
		nullable = true 
	)
	private Long idxrrhhausencia;
	@Column (
		name = "INICIO",
		nullable = false 
	)
	private Date inicio;
	@Column (
		name = "INICIOHORA",
		nullable = true 
	)
	private Timestamp iniciohora;
	@Column (
		name = "NUMHORAS",
		nullable = true 
	)
	private Integer numhoras;
	@Column (
		name = "TIPO",
		nullable = true 
	)
	private String tipo;
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
		name = "IDRRHHTURNO0",
		referencedColumnName = "IDXRRHHTURNO",
		nullable = true,
		insertable = true,
		updatable = true 
	)
	private Rrhhturno idrrhhturno; 

	public void setAprobada(
		boolean var
	) {
		this.aprobada=var; 
	}
	
	public boolean isAprobada() {
		return this.aprobada; 
	}
	
	public void setComentarios(
		String var
	) {
		this.comentarios=var; 
	}
	
	public String getComentarios() {
		return this.comentarios; 
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
	
	public void setDias(
		Integer var
	) {
		this.dias=var; 
	}
	
	public Integer getDias() {
		return this.dias; 
	}
	
	public void setFaprovacion(
		Date var
	) {
		this.faprovacion=var; 
	}
	
	public Date getFaprovacion() {
		return this.faprovacion; 
	}
	
	public void setFin(
		Date var
	) {
		this.fin=var; 
	}
	
	public Date getFin() {
		return this.fin; 
	}
	
	public void setIdxrrhhausencia(
		Long var
	) {
		this.idxrrhhausencia=var; 
	}
	
	public Long getIdxrrhhausencia() {
		return this.idxrrhhausencia; 
	}
	
	public void setInicio(
		Date var
	) {
		this.inicio=var; 
	}
	
	public Date getInicio() {
		return this.inicio; 
	}
	
	public void setIniciohora(
		Timestamp var
	) {
		this.iniciohora=var; 
	}
	
	public Timestamp getIniciohora() {
		return this.iniciohora; 
	}
	
	public void setNumhoras(
		Integer var
	) {
		this.numhoras=var; 
	}
	
	public Integer getNumhoras() {
		return this.numhoras; 
	}
	
	public void setTipo(
		String var
	) {
		this.tipo=var; 
	}
	
	public String getTipo() {
		return this.tipo; 
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
	
	public void setIdrrhhturno(
		Rrhhturno var
	) {
		this.idrrhhturno=var; 
	}
	
	public Rrhhturno getIdrrhhturno() {
		if(this.idrrhhturno==null)this.idrrhhturno=new org.suinsit.apps.portalemp.Rrhhturno();
		  return this.idrrhhturno; 
	} 

}