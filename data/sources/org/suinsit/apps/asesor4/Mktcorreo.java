package org.suinsit.apps.asesor4;

import java.io.Serializable;
import java.lang.Long;
import java.lang.String;
import java.sql.Timestamp;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import org.enartframework.nocode.annotacion.Entidad;
import org.suinsit.apps.admin.Ssousuario;
import org.suinsit.apps.crm.Crmcontacto;

@Entity
@Table (
	name = "MKTCORREO" 
)
@Entidad (
	type = "TABLE",
	pk = "idxmktcorreo" 
)
public class Mktcorreo implements Serializable { 

	private static final long serialVersionUID = 1L;
	@Column (
		name = "DESTINO",
		nullable = true 
	)
	private String destino;
	@Column (
		name = "ASUNTO",
		nullable = true 
	)
	private String asunto;
	@Column (
		name = "MENSAJE",
		nullable = true 
	)
	private String mensaje;
	@Column (
		name = "RECIBIDO",
		nullable = true 
	)
	private Timestamp recibido;
	@Column (
		name = "ENVIADO",
		nullable = true 
	)
	private Timestamp enviado;
	@Column (
		name = "ALTA",
		nullable = false 
	)
	private Timestamp alta;
	@Id
	@Column (
		name = "IDXMKTCORREO",
		nullable = true 
	)
	private Long idxmktcorreo;
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
		name = "IDCRMCONTACTO0",
		referencedColumnName = "IDXCRMCONTACTO",
		nullable = true,
		insertable = true,
		updatable = true 
	)
	private Crmcontacto idcrmcontacto; 

	public void setDestino(
		String var
	) {
		this.destino=var; 
	}
	
	public String getDestino() {
		return this.destino; 
	}
	
	public void setAsunto(
		String var
	) {
		this.asunto=var; 
	}
	
	public String getAsunto() {
		return this.asunto; 
	}
	
	public void setMensaje(
		String var
	) {
		this.mensaje=var; 
	}
	
	public String getMensaje() {
		return this.mensaje; 
	}
	
	public void setRecibido(
		Timestamp var
	) {
		this.recibido=var; 
	}
	
	public Timestamp getRecibido() {
		return this.recibido; 
	}
	
	public void setEnviado(
		Timestamp var
	) {
		this.enviado=var; 
	}
	
	public Timestamp getEnviado() {
		return this.enviado; 
	}
	
	public void setAlta(
		Timestamp var
	) {
		this.alta=var; 
	}
	
	public Timestamp getAlta() {
		return this.alta; 
	}
	
	public void setIdxmktcorreo(
		Long var
	) {
		this.idxmktcorreo=var; 
	}
	
	public Long getIdxmktcorreo() {
		return this.idxmktcorreo; 
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
	
	public void setIdcrmcontacto(
		Crmcontacto var
	) {
		this.idcrmcontacto=var; 
	}
	
	public Crmcontacto getIdcrmcontacto() {
		if(this.idcrmcontacto==null)this.idcrmcontacto=new org.suinsit.apps.crm.Crmcontacto();
		  return this.idcrmcontacto; 
	} 

}