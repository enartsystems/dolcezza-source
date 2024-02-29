package org.suinsit.apps.marketing;

import java.io.Serializable;
import java.lang.Integer;
import java.lang.Long;
import java.lang.Object;
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
import org.enartframework.nocode.annotacion.FieldType;
import org.enartframework.nocode.annotacion.Sequence;
import org.suinsit.apps.admin.Ssousuario;
import org.suinsit.apps.marketing.Mktmlistnews;
import org.suinsit.apps.marketing.Mktprovmail;

@Entity
@Table (
	name = "MKTMNEWSLETTER" 
)
@Entidad (
	type = "TABLE",
	pk = "idxmktmnewsletter" 
)
public class Mktmnewsletter implements Serializable { 

	private static final long serialVersionUID = 1L;
	@Column (
		name = "SPAM",
		nullable = true 
	)
	private Integer spam;
	@Column (
		name = "ABIERTOS",
		nullable = true 
	)
	private Integer abiertos;
	@Column (
		name = "ADJUNTO",
		nullable = true 
	)
	private Object adjunto;
	@Column (
		name = "ALTA",
		nullable = false 
	)
	private Date alta;
	@Column (
		name = "ASUNTO",
		nullable = false 
	)
	private String asunto;
	@Column (
		name = "CONTENIDO",
		nullable = false 
	)
	private String contenido;
	@Column (
		name = "CORREO",
		nullable = false 
	)
	@FieldType (
		type = FieldType.TYPEVALIDATOR.EMAIL 
	)
	private String correo;
	@Column (
		name = "ESTADO",
		nullable = true 
	)
	private String estado;
	@Column (
		name = "IDPROVEEDOR",
		nullable = true 
	)
	private String idproveedor;
	@Id
	@Column (
		name = "IDXMKTMNEWSLETTER",
		nullable = true 
	)
	private Long idxmktmnewsletter;
	@Column (
		name = "LEIDOS",
		nullable = true 
	)
	private Integer leidos;
	@Column (
		name = "MLMTEMPLATE",
		nullable = true 
	)
	private String mlmtemplate;
	@Column (
		name = "NOMBRE",
		nullable = false 
	)
	private String nombre;
	@Column (
		name = "PERIODICIDAD",
		nullable = true 
	)
	private String periodicidad;
	@Column (
		name = "PUBLICACION",
		nullable = true 
	)
	private Timestamp publicacion;
	@Column (
		name = "REBOTADOS",
		nullable = true 
	)
	private Integer rebotados;
	@Column (
		name = "REFERENCIA",
		nullable = false 
	)
	@Sequence (
		name = "MKTMNEWSLETTER_REFERENCIA",
		prefix = "",
		mask = "0000000000",
		addYear = true 
	)
	private String referencia;
	private boolean updatable;
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
	@ManyToOne (
		fetch = javax.persistence.FetchType.LAZY 
	)
	@JoinColumn (
		name = "IDMKTMLISTNEWS0",
		referencedColumnName = "IDXMKTMLISTNEWS",
		nullable = true,
		insertable = true,
		updatable = true 
	)
	private Mktmlistnews idmktmlistnews;
	@ManyToOne (
		fetch = javax.persistence.FetchType.LAZY 
	)
	@JoinColumn (
		name = "IDMKTPROVMAIL0",
		referencedColumnName = "IDXMKTPROVMAIL",
		nullable = true,
		insertable = true,
		updatable = true 
	)
	private Mktprovmail idmktprovmail; 

	public void setSpam(
		Integer var
	) {
		this.spam=var; 
	}
	
	public Integer getSpam() {
		return this.spam; 
	}
	
	public void setAbiertos(
		Integer var
	) {
		this.abiertos=var; 
	}
	
	public Integer getAbiertos() {
		return this.abiertos; 
	}
	
	public void setAdjunto(
		Object var
	) {
		this.adjunto=var; 
	}
	
	public Object getAdjunto() {
		return this.adjunto; 
	}
	
	public void setAlta(
		Date var
	) {
		this.alta=var; 
	}
	
	public Date getAlta() {
		return this.alta; 
	}
	
	public void setAsunto(
		String var
	) {
		this.asunto=var; 
	}
	
	public String getAsunto() {
		return this.asunto; 
	}
	
	public void setContenido(
		String var
	) {
		this.contenido=var; 
	}
	
	public String getContenido() {
		return this.contenido; 
	}
	
	public void setCorreo(
		String var
	) {
		this.correo=var; 
	}
	
	public String getCorreo() {
		return this.correo; 
	}
	
	public void setEstado(
		String var
	) {
		this.estado=var; 
	}
	
	public String getEstado() {
		return this.estado; 
	}
	
	public void setIdproveedor(
		String var
	) {
		this.idproveedor=var; 
	}
	
	public String getIdproveedor() {
		return this.idproveedor; 
	}
	
	public void setIdxmktmnewsletter(
		Long var
	) {
		this.idxmktmnewsletter=var; 
	}
	
	public Long getIdxmktmnewsletter() {
		return this.idxmktmnewsletter; 
	}
	
	public void setLeidos(
		Integer var
	) {
		this.leidos=var; 
	}
	
	public Integer getLeidos() {
		return this.leidos; 
	}
	
	public void setMlmtemplate(
		String var
	) {
		this.mlmtemplate=var; 
	}
	
	public String getMlmtemplate() {
		return this.mlmtemplate; 
	}
	
	public void setNombre(
		String var
	) {
		this.nombre=var; 
	}
	
	public String getNombre() {
		return this.nombre; 
	}
	
	public void setPeriodicidad(
		String var
	) {
		this.periodicidad=var; 
	}
	
	public String getPeriodicidad() {
		return this.periodicidad; 
	}
	
	public void setPublicacion(
		Timestamp var
	) {
		this.publicacion=var; 
	}
	
	public Timestamp getPublicacion() {
		return this.publicacion; 
	}
	
	public void setRebotados(
		Integer var
	) {
		this.rebotados=var; 
	}
	
	public Integer getRebotados() {
		return this.rebotados; 
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
	
	public void setIdssousuario(
		Ssousuario var
	) {
		this.idssousuario=var; 
	}
	
	public Ssousuario getIdssousuario() {
		if(this.idssousuario==null)this.idssousuario=new org.suinsit.apps.admin.Ssousuario();
		  return this.idssousuario; 
	}
	
	public void setIdmktmlistnews(
		Mktmlistnews var
	) {
		this.idmktmlistnews=var; 
	}
	
	public Mktmlistnews getIdmktmlistnews() {
		if(this.idmktmlistnews==null)this.idmktmlistnews=new org.suinsit.apps.marketing.Mktmlistnews();
		  return this.idmktmlistnews; 
	}
	
	public void setIdmktprovmail(
		Mktprovmail var
	) {
		this.idmktprovmail=var; 
	}
	
	public Mktprovmail getIdmktprovmail() {
		if(this.idmktprovmail==null)this.idmktprovmail=new org.suinsit.apps.marketing.Mktprovmail();
		  return this.idmktprovmail; 
	} 

}