package org.suinsit.apps.expedientes;

import java.io.Serializable;
import java.lang.Long;
import java.lang.Object;
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
import org.suinsit.apps.expedientes.Gexmepediente;

@Entity
@Table (
	name = "GEXRFIIRMAS" 
)
@Entidad (
	type = "TABLE",
	pk = "idxgexrfiirmas" 
)
public class Gexrfiirmas implements Serializable { 

	private static final long serialVersionUID = 1L;
	@Column (
		name = "FIRMA",
		nullable = true 
	)
	private Object firma;
	@Column (
		name = "FECHAFIRMA",
		nullable = true 
	)
	private Timestamp fechafirma;
	@Column (
		name = "OTPCODE",
		nullable = false 
	)
	private String otpcode;
	@Id
	@Column (
		name = "IDXGEXRFIIRMAS",
		nullable = true 
	)
	private Long idxgexrfiirmas;
	private boolean updatable;
	@ManyToOne (
		fetch = javax.persistence.FetchType.LAZY 
	)
	@JoinColumn (
		name = "IDGEXMEPEDIENTE0",
		referencedColumnName = "IDXGEXMEPEDIENTE",
		nullable = true,
		insertable = true,
		updatable = true 
	)
	private Gexmepediente idgexmepediente;
	@ManyToOne (
		fetch = javax.persistence.FetchType.LAZY 
	)
	@JoinColumn (
		name = "IDUSUARIOFIRMA0",
		referencedColumnName = "IDXSSOUSUARIO",
		nullable = true,
		insertable = true,
		updatable = true 
	)
	private Ssousuario idusuariofirma; 

	public void setFirma(
		Object var
	) {
		this.firma=var; 
	}
	
	public Object getFirma() {
		return this.firma; 
	}
	
	public void setFechafirma(
		Timestamp var
	) {
		this.fechafirma=var; 
	}
	
	public Timestamp getFechafirma() {
		return this.fechafirma; 
	}
	
	public void setOtpcode(
		String var
	) {
		this.otpcode=var; 
	}
	
	public String getOtpcode() {
		return this.otpcode; 
	}
	
	public void setIdxgexrfiirmas(
		Long var
	) {
		this.idxgexrfiirmas=var; 
	}
	
	public Long getIdxgexrfiirmas() {
		return this.idxgexrfiirmas; 
	}
	
	public void setUpdatable(
		boolean var
	) {
		this.updatable=var; 
	}
	
	public boolean isUpdatable() {
		return this.updatable; 
	}
	
	public void setIdgexmepediente(
		Gexmepediente var
	) {
		this.idgexmepediente=var; 
	}
	
	public Gexmepediente getIdgexmepediente() {
		if(this.idgexmepediente==null)this.idgexmepediente=new org.suinsit.apps.expedientes.Gexmepediente();
		  return this.idgexmepediente; 
	}
	
	public void setIdusuariofirma(
		Ssousuario var
	) {
		this.idusuariofirma=var; 
	}
	
	public Ssousuario getIdusuariofirma() {
		if(this.idusuariofirma==null)this.idusuariofirma=new org.suinsit.apps.admin.Ssousuario();
		  return this.idusuariofirma; 
	} 

}