package org.suinsit.apps.marketing;

import java.io.Serializable;
import java.lang.Long;
import java.lang.Object;
import java.lang.String;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import org.enartframework.nocode.annotacion.Entidad;
import org.enartframework.nocode.annotacion.FieldType;
import org.suinsit.apps.admin.Mservicio;

@Entity
@Table (
	name = "MKTMRRSS" 
)
@Entidad (
	type = "TABLE",
	pk = "idxmktmrrss" 
)
public class Mktmrrss implements Serializable { 

	private static final long serialVersionUID = 1L;
	@Column (
		name = "AVATAR",
		nullable = true 
	)
	private Object avatar;
	@Column (
		name = "CLAVE",
		nullable = true 
	)
	private String clave;
	@Column (
		name = "CORREO",
		nullable = true 
	)
	@FieldType (
		type = FieldType.TYPEVALIDATOR.EMAIL 
	)
	private String correo;
	@Column (
		name = "DESCRIPCION",
		nullable = true 
	)
	private String descripcion;
	@Id
	@Column (
		name = "IDXMKTMRRSS",
		nullable = true 
	)
	private Long idxmktmrrss;
	@Column (
		name = "NOMBRE",
		nullable = false 
	)
	private String nombre;
	@Column (
		name = "REFERENCIA",
		nullable = true 
	)
	private String referencia;
	@Column (
		name = "SECRET",
		nullable = true 
	)
	private String secret;
	@Column (
		name = "URLAPI",
		nullable = true 
	)
	private String urlapi;
	private boolean updatable;
	@ManyToOne (
		fetch = javax.persistence.FetchType.LAZY 
	)
	@JoinColumn (
		name = "IDMSERVICIO0",
		referencedColumnName = "IDXMSERVICIO",
		nullable = true,
		insertable = true,
		updatable = true 
	)
	private Mservicio idmservicio; 

	public void setAvatar(
		Object var
	) {
		this.avatar=var; 
	}
	
	public Object getAvatar() {
		return this.avatar; 
	}
	
	public void setClave(
		String var
	) {
		this.clave=var; 
	}
	
	public String getClave() {
		return this.clave; 
	}
	
	public void setCorreo(
		String var
	) {
		this.correo=var; 
	}
	
	public String getCorreo() {
		return this.correo; 
	}
	
	public void setDescripcion(
		String var
	) {
		this.descripcion=var; 
	}
	
	public String getDescripcion() {
		return this.descripcion; 
	}
	
	public void setIdxmktmrrss(
		Long var
	) {
		this.idxmktmrrss=var; 
	}
	
	public Long getIdxmktmrrss() {
		return this.idxmktmrrss; 
	}
	
	public void setNombre(
		String var
	) {
		this.nombre=var; 
	}
	
	public String getNombre() {
		return this.nombre; 
	}
	
	public void setReferencia(
		String var
	) {
		this.referencia=var; 
	}
	
	public String getReferencia() {
		return this.referencia; 
	}
	
	public void setSecret(
		String var
	) {
		this.secret=var; 
	}
	
	public String getSecret() {
		return this.secret; 
	}
	
	public void setUrlapi(
		String var
	) {
		this.urlapi=var; 
	}
	
	public String getUrlapi() {
		return this.urlapi; 
	}
	
	public void setUpdatable(
		boolean var
	) {
		this.updatable=var; 
	}
	
	public boolean isUpdatable() {
		return this.updatable; 
	}
	
	public void setIdmservicio(
		Mservicio var
	) {
		this.idmservicio=var; 
	}
	
	public Mservicio getIdmservicio() {
		if(this.idmservicio==null)this.idmservicio=new org.suinsit.apps.admin.Mservicio();
		  return this.idmservicio; 
	} 

}