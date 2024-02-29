package org.suinsit.apps.notificaciones;

import java.io.Serializable;
import java.lang.Long;
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
import org.enartframework.nocode.annotacion.Sequence;
import org.suinsit.apps.admin.Ssousuario;
import org.suinsit.apps.notificaciones.Notmprioridad;
import org.suinsit.apps.notificaciones.Notmtipo;
import org.suinsit.apps.notificaciones.Notrnotiusers;
import org.suinsit.apps.notificaciones.Notrnotroles;

@Entity
@Table (
	name = "NOTMNOTIFICACION" 
)
@Entidad (
	type = "TABLE",
	pk = "idxnotmnotificacion" 
)
public class Notmnotificacion implements Serializable { 

	private static final long serialVersionUID = 1L;
	@Column (
		name = "ASUNTO",
		nullable = false 
	)
	private String asunto;
	@Column (
		name = "AUTOMATICO",
		nullable = true 
	)
	private boolean automatico;
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
		name = "ENVIARTODOS",
		nullable = true 
	)
	private boolean enviartodos;
	@Column (
		name = "EXPRESIONCRON",
		nullable = true 
	)
	private String expresioncron;
	@Column (
		name = "FECHA",
		nullable = false 
	)
	private Timestamp fecha;
	@Id
	@Column (
		name = "IDXNOTMNOTIFICACION",
		nullable = true 
	)
	private Long idxnotmnotificacion;
	@Column (
		name = "MENSAJE",
		nullable = false 
	)
	private String mensaje;
	@Column (
		name = "MOSTRARAVISO",
		nullable = true 
	)
	private boolean mostraraviso;
	@Column (
		name = "REFERENCIA",
		nullable = false 
	)
	@Sequence (
		name = "NOTMNOTIFICACION_REFERENCIA",
		prefix = "NOT",
		mask = "00000000",
		addYear = true 
	)
	private String referencia;
	@Column (
		name = "SENDEMAIL",
		nullable = true 
	)
	private boolean sendemail;
	@Column (
		name = "SYSTEMS",
		nullable = true 
	)
	private boolean systems;
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
		name = "VALIDEZ",
		nullable = true 
	)
	private Date validez;
	private boolean updatable;
	@ManyToOne (
		fetch = javax.persistence.FetchType.LAZY 
	)
	@JoinColumn (
		name = "IDNOTMTIPO0",
		referencedColumnName = "IDXNOTMTIPO",
		nullable = true,
		insertable = true,
		updatable = true 
	)
	private Notmtipo idnotmtipo;
	@ManyToOne (
		fetch = javax.persistence.FetchType.LAZY 
	)
	@JoinColumn (
		name = "IDNOTMPRIORIDAD0",
		referencedColumnName = "IDXNOTMPRIORIDAD",
		nullable = true,
		insertable = true,
		updatable = true 
	)
	private Notmprioridad idnotmprioridad;
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
	private List<Notrnotroles> subnotrnotroles;
	private List<Notrnotiusers> subnotrnotiusers; 

	public void setAsunto(
		String var
	) {
		this.asunto=var; 
	}
	
	public String getAsunto() {
		return this.asunto; 
	}
	
	public void setAutomatico(
		boolean var
	) {
		this.automatico=var; 
	}
	
	public boolean isAutomatico() {
		return this.automatico; 
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
	
	public void setEnviartodos(
		boolean var
	) {
		this.enviartodos=var; 
	}
	
	public boolean isEnviartodos() {
		return this.enviartodos; 
	}
	
	public void setExpresioncron(
		String var
	) {
		this.expresioncron=var; 
	}
	
	public String getExpresioncron() {
		return this.expresioncron; 
	}
	
	public void setFecha(
		Timestamp var
	) {
		this.fecha=var; 
	}
	
	public Timestamp getFecha() {
		return this.fecha; 
	}
	
	public void setIdxnotmnotificacion(
		Long var
	) {
		this.idxnotmnotificacion=var; 
	}
	
	public Long getIdxnotmnotificacion() {
		return this.idxnotmnotificacion; 
	}
	
	public void setMensaje(
		String var
	) {
		this.mensaje=var; 
	}
	
	public String getMensaje() {
		return this.mensaje; 
	}
	
	public void setMostraraviso(
		boolean var
	) {
		this.mostraraviso=var; 
	}
	
	public boolean isMostraraviso() {
		return this.mostraraviso; 
	}
	
	public void setReferencia(
		String var
	) {
		this.referencia=var; 
	}
	
	public String getReferencia() {
		return this.referencia; 
	}
	
	public void setSendemail(
		boolean var
	) {
		this.sendemail=var; 
	}
	
	public boolean isSendemail() {
		return this.sendemail; 
	}
	
	public void setSystems(
		boolean var
	) {
		this.systems=var; 
	}
	
	public boolean isSystems() {
		return this.systems; 
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
	
	public void setValidez(
		Date var
	) {
		this.validez=var; 
	}
	
	public Date getValidez() {
		return this.validez; 
	}
	
	public void setUpdatable(
		boolean var
	) {
		this.updatable=var; 
	}
	
	public boolean isUpdatable() {
		return this.updatable; 
	}
	
	public void setIdnotmtipo(
		Notmtipo var
	) {
		this.idnotmtipo=var; 
	}
	
	public Notmtipo getIdnotmtipo() {
		if(this.idnotmtipo==null)this.idnotmtipo=new org.suinsit.apps.notificaciones.Notmtipo();
		  return this.idnotmtipo; 
	}
	
	public void setIdnotmprioridad(
		Notmprioridad var
	) {
		this.idnotmprioridad=var; 
	}
	
	public Notmprioridad getIdnotmprioridad() {
		if(this.idnotmprioridad==null)this.idnotmprioridad=new org.suinsit.apps.notificaciones.Notmprioridad();
		  return this.idnotmprioridad; 
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
	
	public void setSubnotrnotroles(
		List<Notrnotroles> var
	) {
		this.subnotrnotroles=var; 
	}
	
	public List<Notrnotroles> getSubnotrnotroles() {
		if(this.subnotrnotroles==null)this.subnotrnotroles=new ArrayList<>(0);
		  return this.subnotrnotroles; 
	}
	
	public void setSubnotrnotiusers(
		List<Notrnotiusers> var
	) {
		this.subnotrnotiusers=var; 
	}
	
	public List<Notrnotiusers> getSubnotrnotiusers() {
		if(this.subnotrnotiusers==null)this.subnotrnotiusers=new ArrayList<>(0);
		  return this.subnotrnotiusers; 
	} 

}