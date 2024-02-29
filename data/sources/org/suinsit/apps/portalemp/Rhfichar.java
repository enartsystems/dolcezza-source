package org.suinsit.apps.portalemp;

import java.io.Serializable;
import java.lang.Long;
import java.lang.String;
import java.math.BigDecimal;
import java.sql.Date;
import java.sql.Time;
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
	name = "RHFICHAR" 
)
@Entidad (
	type = "TABLE",
	pk = "idxrhfichar" 
)
public class Rhfichar implements Serializable { 

	private static final long serialVersionUID = 1L;
	@Column (
		name = "FESTIVO",
		nullable = true 
	)
	private boolean festivo;
	@Column (
		name = "APROBADA",
		nullable = true 
	)
	private boolean aprobada;
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
		name = "FECHA",
		nullable = true 
	)
	private Date fecha;
	@Id
	@Column (
		name = "IDXRHFICHAR",
		nullable = true 
	)
	private Long idxrhfichar;
	@Column (
		name = "TIPO",
		nullable = false 
	)
	private String tipo;
	@Column (
		name = "TMALTA",
		nullable = true 
	)
	private Timestamp tmalta;
	@Column (
		name = "TMFIN",
		nullable = true 
	)
	private Time tmfin;
	@Column (
		name = "TMINICIO",
		nullable = true 
	)
	private Time tminicio;
	@Column (
		name = "TMMODIF",
		nullable = true 
	)
	private Timestamp tmmodif;
	@Column (
		name = "TOTAL",
		nullable = true 
	)
	private BigDecimal total;
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

	public void setFestivo(
		boolean var
	) {
		this.festivo=var; 
	}
	
	public boolean isFestivo() {
		return this.festivo; 
	}
	
	public void setAprobada(
		boolean var
	) {
		this.aprobada=var; 
	}
	
	public boolean isAprobada() {
		return this.aprobada; 
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
	
	public void setFecha(
		Date var
	) {
		this.fecha=var; 
	}
	
	public Date getFecha() {
		return this.fecha; 
	}
	
	public void setIdxrhfichar(
		Long var
	) {
		this.idxrhfichar=var; 
	}
	
	public Long getIdxrhfichar() {
		return this.idxrhfichar; 
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
	
	public void setTmfin(
		Time var
	) {
		this.tmfin=var; 
	}
	
	public Time getTmfin() {
		return this.tmfin; 
	}
	
	public void setTminicio(
		Time var
	) {
		this.tminicio=var; 
	}
	
	public Time getTminicio() {
		return this.tminicio; 
	}
	
	public void setTmmodif(
		Timestamp var
	) {
		this.tmmodif=var; 
	}
	
	public Timestamp getTmmodif() {
		return this.tmmodif; 
	}
	
	public void setTotal(
		BigDecimal var
	) {
		this.total=var; 
	}
	
	public BigDecimal getTotal() {
		return this.total; 
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