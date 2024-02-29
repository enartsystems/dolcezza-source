package org.suinsit.apps.subvenciones;

import java.io.Serializable;
import java.lang.Long;
import java.lang.Object;
import java.lang.String;
import java.sql.Date;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import org.enartframework.nocode.annotacion.Entidad;
import org.suinsit.apps.subvenciones.Subrnotidoc;
import org.suinsit.apps.subvenciones.Subsolictudes;

@Entity
@Table (
	name = "SUBNOTIFICACION" 
)
@Entidad (
	type = "TABLE",
	pk = "idxsubnotificacion" 
)
public class Subnotificacion implements Serializable { 

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
	@Column (
		name = "FECHA",
		nullable = true 
	)
	private Date fecha;
	@Column (
		name = "FECHAENVIODOC",
		nullable = true 
	)
	private Timestamp fechaenviodoc;
	@Id
	@Column (
		name = "IDXSUBNOTIFICACION",
		nullable = true 
	)
	private Long idxsubnotificacion;
	@Column (
		name = "NOTIFICACION",
		nullable = true 
	)
	private Object notificacion;
	@Column (
		name = "RESUMEN",
		nullable = false 
	)
	private String resumen;
	@Column (
		name = "SUBSANADA",
		nullable = true 
	)
	private boolean subsanada;
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
		name = "IDSUBSOLICTUDES0",
		referencedColumnName = "IDXSUBSOLICTUDES",
		nullable = true,
		insertable = true,
		updatable = true 
	)
	private Subsolictudes idsubsolictudes;
	private List<Subrnotidoc> subsubrnotidoc; 

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
	
	public void setFechaenviodoc(
		Timestamp var
	) {
		this.fechaenviodoc=var; 
	}
	
	public Timestamp getFechaenviodoc() {
		return this.fechaenviodoc; 
	}
	
	public void setIdxsubnotificacion(
		Long var
	) {
		this.idxsubnotificacion=var; 
	}
	
	public Long getIdxsubnotificacion() {
		return this.idxsubnotificacion; 
	}
	
	public void setNotificacion(
		Object var
	) {
		this.notificacion=var; 
	}
	
	public Object getNotificacion() {
		return this.notificacion; 
	}
	
	public void setResumen(
		String var
	) {
		this.resumen=var; 
	}
	
	public String getResumen() {
		return this.resumen; 
	}
	
	public void setSubsanada(
		boolean var
	) {
		this.subsanada=var; 
	}
	
	public boolean isSubsanada() {
		return this.subsanada; 
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
	
	public void setIdsubsolictudes(
		Subsolictudes var
	) {
		this.idsubsolictudes=var; 
	}
	
	public Subsolictudes getIdsubsolictudes() {
		if(this.idsubsolictudes==null)this.idsubsolictudes=new org.suinsit.apps.subvenciones.Subsolictudes();
		  return this.idsubsolictudes; 
	}
	
	public void setSubsubrnotidoc(
		List<Subrnotidoc> var
	) {
		this.subsubrnotidoc=var; 
	}
	
	public List<Subrnotidoc> getSubsubrnotidoc() {
		if(this.subsubrnotidoc==null)this.subsubrnotidoc=new ArrayList<>(0);
		  return this.subsubrnotidoc; 
	} 

}