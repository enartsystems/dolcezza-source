package org.suinsit.apps.bpmn;

import java.io.Serializable;
import java.lang.Long;
import java.lang.String;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import org.enartframework.nocode.annotacion.Entidad;
import org.suinsit.apps.bpmn.Bpmmproces;

@Entity
@Table (
	name = "BPMNEMAIL" 
)
@Entidad (
	type = "TABLE",
	pk = "idxbpmnemail" 
)
public class Bpmnemail implements Serializable { 

	private static final long serialVersionUID = 1L;
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
	@Id
	@Column (
		name = "IDXBPMNEMAIL",
		nullable = true 
	)
	private Long idxbpmnemail;
	private boolean updatable;
	@ManyToOne (
		fetch = javax.persistence.FetchType.LAZY 
	)
	@JoinColumn (
		name = "IDBPMMPROCES0",
		referencedColumnName = "IDXBPMMPROCES",
		nullable = true,
		insertable = true,
		updatable = true 
	)
	private Bpmmproces idbpmmproces; 

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
	
	public void setIdxbpmnemail(
		Long var
	) {
		this.idxbpmnemail=var; 
	}
	
	public Long getIdxbpmnemail() {
		return this.idxbpmnemail; 
	}
	
	public void setUpdatable(
		boolean var
	) {
		this.updatable=var; 
	}
	
	public boolean isUpdatable() {
		return this.updatable; 
	}
	
	public void setIdbpmmproces(
		Bpmmproces var
	) {
		this.idbpmmproces=var; 
	}
	
	public Bpmmproces getIdbpmmproces() {
		if(this.idbpmmproces==null)this.idbpmmproces=new org.suinsit.apps.bpmn.Bpmmproces();
		  return this.idbpmmproces; 
	} 

}