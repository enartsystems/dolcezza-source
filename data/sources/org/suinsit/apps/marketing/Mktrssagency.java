package org.suinsit.apps.marketing;

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
import org.enartframework.nocode.annotacion.Sequence;
import org.suinsit.apps.crm.Crmempresa;
import org.suinsit.apps.marketing.Mktmrrss;

@Entity
@Table (
	name = "MKTRSSAGENCY" 
)
@Entidad (
	type = "TABLE",
	pk = "idxmktrssagency" 
)
public class Mktrssagency implements Serializable { 

	private static final long serialVersionUID = 1L;
	@Column (
		name = "REFERENCIA",
		nullable = true 
	)
	@Sequence (
		name = "MKTRSSAGENCY_REFERENCIA",
		prefix = "",
		mask = "00000000",
		addYear = false 
	)
	private String referencia;
	@Column (
		name = "COMENTARIOS",
		nullable = true 
	)
	private String comentarios;
	@Column (
		name = "SECRET",
		nullable = true 
	)
	private String secret;
	@Column (
		name = "CLAVE",
		nullable = true 
	)
	private String clave;
	@Column (
		name = "EMAILCUSTOMER",
		nullable = true 
	)
	private String emailcustomer;
	@Column (
		name = "NOMBRE",
		nullable = true 
	)
	private String nombre;
	@Id
	@Column (
		name = "IDXMKTRSSAGENCY",
		nullable = true 
	)
	private Long idxmktrssagency;
	private boolean updatable;
	@ManyToOne (
		fetch = javax.persistence.FetchType.LAZY 
	)
	@JoinColumn (
		name = "IDMKTMRRSS0",
		referencedColumnName = "IDXMKTMRRSS",
		nullable = true,
		insertable = true,
		updatable = true 
	)
	private Mktmrrss idmktmrrss;
	@ManyToOne (
		fetch = javax.persistence.FetchType.LAZY 
	)
	@JoinColumn (
		name = "IDCRMEMPRESA0",
		referencedColumnName = "IDXCRMEMPRESA",
		nullable = true,
		insertable = true,
		updatable = true 
	)
	private Crmempresa idcrmempresa; 

	public void setReferencia(
		String var
	) {
		this.referencia=var; 
	}
	
	public String getReferencia() {
		return this.referencia; 
	}
	
	public void setComentarios(
		String var
	) {
		this.comentarios=var; 
	}
	
	public String getComentarios() {
		return this.comentarios; 
	}
	
	public void setSecret(
		String var
	) {
		this.secret=var; 
	}
	
	public String getSecret() {
		return this.secret; 
	}
	
	public void setClave(
		String var
	) {
		this.clave=var; 
	}
	
	public String getClave() {
		return this.clave; 
	}
	
	public void setEmailcustomer(
		String var
	) {
		this.emailcustomer=var; 
	}
	
	public String getEmailcustomer() {
		return this.emailcustomer; 
	}
	
	public void setNombre(
		String var
	) {
		this.nombre=var; 
	}
	
	public String getNombre() {
		return this.nombre; 
	}
	
	public void setIdxmktrssagency(
		Long var
	) {
		this.idxmktrssagency=var; 
	}
	
	public Long getIdxmktrssagency() {
		return this.idxmktrssagency; 
	}
	
	public void setUpdatable(
		boolean var
	) {
		this.updatable=var; 
	}
	
	public boolean isUpdatable() {
		return this.updatable; 
	}
	
	public void setIdmktmrrss(
		Mktmrrss var
	) {
		this.idmktmrrss=var; 
	}
	
	public Mktmrrss getIdmktmrrss() {
		if(this.idmktmrrss==null)this.idmktmrrss=new org.suinsit.apps.marketing.Mktmrrss();
		  return this.idmktmrrss; 
	}
	
	public void setIdcrmempresa(
		Crmempresa var
	) {
		this.idcrmempresa=var; 
	}
	
	public Crmempresa getIdcrmempresa() {
		if(this.idcrmempresa==null)this.idcrmempresa=new org.suinsit.apps.crm.Crmempresa();
		  return this.idcrmempresa; 
	} 

}