package org.suinsit.apps.bpmn;

import java.io.Serializable;
import java.lang.Long;
import java.lang.String;
import javax.persistence.Column;
import org.enartframework.nocode.annotacion.Entidad;

@Entidad (
	type = "VIEW" 
)
public class Bpmnvprocessemails implements Serializable { 

	private static final long serialVersionUID = 1L;
	@Column (
		name = "KEYPROCESS",
		nullable = false 
	)
	private String keyprocess;
	@Column (
		name = "PROCESO",
		nullable = false 
	)
	private String proceso;
	@Column (
		name = "VERSION",
		nullable = true 
	)
	private String version;
	@Column (
		name = "EMAILSBCC",
		nullable = true 
	)
	private String emailsbcc;
	@Column (
		name = "EMAILSCC",
		nullable = true 
	)
	private String emailscc;
	@Column (
		name = "DESCRIPCION",
		nullable = true 
	)
	private String descripcion;
	@Column (
		name = "EMAILS",
		nullable = true 
	)
	private String emails;
	@Column (
		name = "GRUPO",
		nullable = true 
	)
	private String grupo;
	@Column (
		name = "IDBPMMPROCES0",
		nullable = true 
	)
	private Long idbpmmproces0;
	private boolean updatable; 

	public void setKeyprocess(
		String var
	) {
		this.keyprocess=var; 
	}
	
	public String getKeyprocess() {
		return this.keyprocess; 
	}
	
	public void setProceso(
		String var
	) {
		this.proceso=var; 
	}
	
	public String getProceso() {
		return this.proceso; 
	}
	
	public void setVersion(
		String var
	) {
		this.version=var; 
	}
	
	public String getVersion() {
		return this.version; 
	}
	
	public void setEmailsbcc(
		String var
	) {
		this.emailsbcc=var; 
	}
	
	public String getEmailsbcc() {
		return this.emailsbcc; 
	}
	
	public void setEmailscc(
		String var
	) {
		this.emailscc=var; 
	}
	
	public String getEmailscc() {
		return this.emailscc; 
	}
	
	public void setDescripcion(
		String var
	) {
		this.descripcion=var; 
	}
	
	public String getDescripcion() {
		return this.descripcion; 
	}
	
	public void setEmails(
		String var
	) {
		this.emails=var; 
	}
	
	public String getEmails() {
		return this.emails; 
	}
	
	public void setGrupo(
		String var
	) {
		this.grupo=var; 
	}
	
	public String getGrupo() {
		return this.grupo; 
	}
	
	public void setIdbpmmproces0(
		Long var
	) {
		this.idbpmmproces0=var; 
	}
	
	public Long getIdbpmmproces0() {
		return this.idbpmmproces0; 
	}
	
	public void setUpdatable(
		boolean var
	) {
		this.updatable=var; 
	}
	
	public boolean isUpdatable() {
		return this.updatable; 
	} 

}