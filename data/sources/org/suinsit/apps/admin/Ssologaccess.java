package org.suinsit.apps.admin;

import java.io.Serializable;
import java.lang.Long;
import java.lang.String;
import java.sql.Timestamp;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import org.enartframework.nocode.annotacion.Entidad;

@Entity
@Table (
	name = "SSOLOGACCESS" 
)
@Entidad (
	type = "TABLE",
	pk = "idxssologaccess" 
)
public class Ssologaccess implements Serializable { 

	private static final long serialVersionUID = 1L;
	@Column (
		name = "LOGOUT",
		nullable = true 
	)
	private Timestamp logout;
	@Column (
		name = "LOGIN",
		nullable = true 
	)
	private Timestamp login;
	@Column (
		name = "ACCESO",
		nullable = true 
	)
	private Timestamp acceso;
	@Column (
		name = "APLICACION",
		nullable = true 
	)
	private String aplicacion;
	@Column (
		name = "DIRIP",
		nullable = true 
	)
	private String dirip;
	@Column (
		name = "DISPOSITIVO",
		nullable = true 
	)
	private String dispositivo;
	@Column (
		name = "EMAIL",
		nullable = true 
	)
	private String email;
	@Column (
		name = "ERROR",
		nullable = true 
	)
	private boolean error;
	@Column (
		name = "HEADERS",
		nullable = true 
	)
	private String headers;
	@Id
	@Column (
		name = "IDXSSOLOGACCESS",
		nullable = true 
	)
	private Long idxssologaccess;
	@Column (
		name = "MENSAJE",
		nullable = true 
	)
	private String mensaje;
	@Column (
		name = "NAME",
		nullable = true 
	)
	private String name;
	@Column (
		name = "TIPOERROR",
		nullable = true 
	)
	private String tipoerror;
	@Column (
		name = "UBICACION",
		nullable = true 
	)
	private String ubicacion;
	@Column (
		name = "USERNAME",
		nullable = true 
	)
	private String username;
	private boolean updatable; 

	public void setLogout(
		Timestamp var
	) {
		this.logout=var; 
	}
	
	public Timestamp getLogout() {
		return this.logout; 
	}
	
	public void setLogin(
		Timestamp var
	) {
		this.login=var; 
	}
	
	public Timestamp getLogin() {
		return this.login; 
	}
	
	public void setAcceso(
		Timestamp var
	) {
		this.acceso=var; 
	}
	
	public Timestamp getAcceso() {
		return this.acceso; 
	}
	
	public void setAplicacion(
		String var
	) {
		this.aplicacion=var; 
	}
	
	public String getAplicacion() {
		return this.aplicacion; 
	}
	
	public void setDirip(
		String var
	) {
		this.dirip=var; 
	}
	
	public String getDirip() {
		return this.dirip; 
	}
	
	public void setDispositivo(
		String var
	) {
		this.dispositivo=var; 
	}
	
	public String getDispositivo() {
		return this.dispositivo; 
	}
	
	public void setEmail(
		String var
	) {
		this.email=var; 
	}
	
	public String getEmail() {
		return this.email; 
	}
	
	public void setError(
		boolean var
	) {
		this.error=var; 
	}
	
	public boolean isError() {
		return this.error; 
	}
	
	public void setHeaders(
		String var
	) {
		this.headers=var; 
	}
	
	public String getHeaders() {
		return this.headers; 
	}
	
	public void setIdxssologaccess(
		Long var
	) {
		this.idxssologaccess=var; 
	}
	
	public Long getIdxssologaccess() {
		return this.idxssologaccess; 
	}
	
	public void setMensaje(
		String var
	) {
		this.mensaje=var; 
	}
	
	public String getMensaje() {
		return this.mensaje; 
	}
	
	public void setName(
		String var
	) {
		this.name=var; 
	}
	
	public String getName() {
		return this.name; 
	}
	
	public void setTipoerror(
		String var
	) {
		this.tipoerror=var; 
	}
	
	public String getTipoerror() {
		return this.tipoerror; 
	}
	
	public void setUbicacion(
		String var
	) {
		this.ubicacion=var; 
	}
	
	public String getUbicacion() {
		return this.ubicacion; 
	}
	
	public void setUsername(
		String var
	) {
		this.username=var; 
	}
	
	public String getUsername() {
		return this.username; 
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