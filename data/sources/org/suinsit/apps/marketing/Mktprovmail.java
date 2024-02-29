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
import org.suinsit.apps.admin.Mservicio;

@Entity
@Table (
	name = "MKTPROVMAIL" 
)
@Entidad (
	type = "TABLE",
	pk = "idxmktprovmail" 
)
public class Mktprovmail implements Serializable { 

	private static final long serialVersionUID = 1L;
	@Column (
		name = "CLASEJAVA",
		nullable = true 
	)
	private String clasejava;
	@Column (
		name = "CLAVEAPI",
		nullable = true 
	)
	private String claveapi;
	@Column (
		name = "COMENTARIOS",
		nullable = true 
	)
	private String comentarios;
	@Column (
		name = "CORREO",
		nullable = true 
	)
	private String correo;
	@Id
	@Column (
		name = "IDXMKTPROVMAIL",
		nullable = true 
	)
	private Long idxmktprovmail;
	@Column (
		name = "NOMBRE",
		nullable = false 
	)
	private String nombre;
	@Column (
		name = "PASSWORD",
		nullable = true 
	)
	private String password;
	@Column (
		name = "SECRET",
		nullable = true 
	)
	private String secret;
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

	public void setClasejava(
		String var
	) {
		this.clasejava=var; 
	}
	
	public String getClasejava() {
		return this.clasejava; 
	}
	
	public void setClaveapi(
		String var
	) {
		this.claveapi=var; 
	}
	
	public String getClaveapi() {
		return this.claveapi; 
	}
	
	public void setComentarios(
		String var
	) {
		this.comentarios=var; 
	}
	
	public String getComentarios() {
		return this.comentarios; 
	}
	
	public void setCorreo(
		String var
	) {
		this.correo=var; 
	}
	
	public String getCorreo() {
		return this.correo; 
	}
	
	public void setIdxmktprovmail(
		Long var
	) {
		this.idxmktprovmail=var; 
	}
	
	public Long getIdxmktprovmail() {
		return this.idxmktprovmail; 
	}
	
	public void setNombre(
		String var
	) {
		this.nombre=var; 
	}
	
	public String getNombre() {
		return this.nombre; 
	}
	
	public void setPassword(
		String var
	) {
		this.password=var; 
	}
	
	public String getPassword() {
		return this.password; 
	}
	
	public void setSecret(
		String var
	) {
		this.secret=var; 
	}
	
	public String getSecret() {
		return this.secret; 
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