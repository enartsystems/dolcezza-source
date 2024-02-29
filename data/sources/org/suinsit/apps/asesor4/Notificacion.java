package org.suinsit.apps.asesor4;

import java.io.Serializable;
import java.lang.Long;
import java.lang.String;
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
import org.suinsit.apps.admin.Ssousuario;
import org.suinsit.apps.document.Docfichero;

@Entity
@Table (
	name = "NOTNOTIFICACION" 
)
@Entidad (
	type = "TABLE",
	pk = "idxnotificacion" 
)
public class Notificacion implements Serializable { 

	private static final long serialVersionUID = 1L;
	@Column (
		name = "ESTILOCSS",
		nullable = true 
	)
	private String estilocss;
	@Column (
		name = "LEIDO",
		nullable = true 
	)
	private Timestamp leido;
	@Column (
		name = "ENVIADO",
		nullable = true 
	)
	private Timestamp enviado;
	@Column (
		name = "BAJA",
		nullable = true 
	)
	private boolean baja;
	@Column (
		name = "MENSAJE",
		nullable = true 
	)
	private String mensaje;
	@Column (
		name = "ASUNTO",
		nullable = false 
	)
	private String asunto;
	@Id
	@Column (
		name = "IDXNOTIFICACION",
		nullable = true 
	)
	private Long idxnotificacion;
	private boolean updatable;
	@ManyToOne (
		fetch = javax.persistence.FetchType.LAZY 
	)
	@JoinColumn (
		name = "IDUSUENVIA0",
		referencedColumnName = "IDXSSOUSUARIO",
		nullable = true,
		insertable = true,
		updatable = true 
	)
	private Ssousuario idusuenvia;
	@ManyToOne (
		fetch = javax.persistence.FetchType.LAZY 
	)
	@JoinColumn (
		name = "IDUSUDESTINO0",
		referencedColumnName = "IDXSSOUSUARIO",
		nullable = true,
		insertable = true,
		updatable = true 
	)
	private Ssousuario idusudestino;
	private List<Docfichero> subdocfichero; 

	public void setEstilocss(
		String var
	) {
		this.estilocss=var; 
	}
	
	public String getEstilocss() {
		return this.estilocss; 
	}
	
	public void setLeido(
		Timestamp var
	) {
		this.leido=var; 
	}
	
	public Timestamp getLeido() {
		return this.leido; 
	}
	
	public void setEnviado(
		Timestamp var
	) {
		this.enviado=var; 
	}
	
	public Timestamp getEnviado() {
		return this.enviado; 
	}
	
	public void setBaja(
		boolean var
	) {
		this.baja=var; 
	}
	
	public boolean isBaja() {
		return this.baja; 
	}
	
	public void setMensaje(
		String var
	) {
		this.mensaje=var; 
	}
	
	public String getMensaje() {
		return this.mensaje; 
	}
	
	public void setAsunto(
		String var
	) {
		this.asunto=var; 
	}
	
	public String getAsunto() {
		return this.asunto; 
	}
	
	public void setIdxnotificacion(
		Long var
	) {
		this.idxnotificacion=var; 
	}
	
	public Long getIdxnotificacion() {
		return this.idxnotificacion; 
	}
	
	public void setUpdatable(
		boolean var
	) {
		this.updatable=var; 
	}
	
	public boolean isUpdatable() {
		return this.updatable; 
	}
	
	public void setIdusuenvia(
		Ssousuario var
	) {
		this.idusuenvia=var; 
	}
	
	public Ssousuario getIdusuenvia() {
		if(this.idusuenvia==null)this.idusuenvia=new org.suinsit.apps.admin.Ssousuario();
		  return this.idusuenvia; 
	}
	
	public void setIdusudestino(
		Ssousuario var
	) {
		this.idusudestino=var; 
	}
	
	public Ssousuario getIdusudestino() {
		if(this.idusudestino==null)this.idusudestino=new org.suinsit.apps.admin.Ssousuario();
		  return this.idusudestino; 
	}
	
	public void setSubdocfichero(
		List<Docfichero> var
	) {
		this.subdocfichero=var; 
	}
	
	public List<Docfichero> getSubdocfichero() {
		if(this.subdocfichero==null)this.subdocfichero=new ArrayList<>(0);
		  return this.subdocfichero; 
	} 

}