package org.suinsit.apps.admin;

import java.io.Serializable;
import java.lang.Long;
import java.lang.String;
import java.sql.Date;
import java.sql.Timestamp;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import org.enartframework.nocode.annotacion.Entidad;
import org.enartframework.nocode.annotacion.Sequence;

@Entity
@Table (
	name = "SSOAPIKEY" 
)
@Entidad (
	type = "TABLE",
	pk = "idxssoapikey" 
)
public class Ssoapikey implements Serializable { 

	private static final long serialVersionUID = 1L;
	@Column (
		name = "ACCESKEY",
		nullable = false 
	)
	private String acceskey;
	@Column (
		name = "ACTIVE",
		nullable = true 
	)
	private boolean active;
	@Column (
		name = "ALIAS",
		nullable = false 
	)
	private String alias;
	@Column (
		name = "ALTA",
		nullable = false 
	)
	private Date alta;
	@Column (
		name = "CODIGO",
		nullable = true 
	)
	@Sequence (
		name = "SSOAPIKEY_CODIGO",
		prefix = "",
		mask = "000000",
		addYear = false 
	)
	private String codigo;
	@Column (
		name = "DESCRIPCION",
		nullable = true 
	)
	private String descripcion;
	@Column (
		name = "EXPIRED",
		nullable = true 
	)
	private Timestamp expired;
	@Id
	@Column (
		name = "IDXSSOAPIKEY",
		nullable = true 
	)
	private Long idxssoapikey;
	@Column (
		name = "READONLY",
		nullable = true 
	)
	private boolean readonly;
	@Column (
		name = "SECRETKEY",
		nullable = false 
	)
	private String secretkey;
	private boolean updatable; 

	public void setAcceskey(
		String var
	) {
		this.acceskey=var; 
	}
	
	public String getAcceskey() {
		return this.acceskey; 
	}
	
	public void setActive(
		boolean var
	) {
		this.active=var; 
	}
	
	public boolean isActive() {
		return this.active; 
	}
	
	public void setAlias(
		String var
	) {
		this.alias=var; 
	}
	
	public String getAlias() {
		return this.alias; 
	}
	
	public void setAlta(
		Date var
	) {
		this.alta=var; 
	}
	
	public Date getAlta() {
		return this.alta; 
	}
	
	public void setCodigo(
		String var
	) {
		this.codigo=var; 
	}
	
	public String getCodigo() {
		return this.codigo; 
	}
	
	public void setDescripcion(
		String var
	) {
		this.descripcion=var; 
	}
	
	public String getDescripcion() {
		return this.descripcion; 
	}
	
	public void setExpired(
		Timestamp var
	) {
		this.expired=var; 
	}
	
	public Timestamp getExpired() {
		return this.expired; 
	}
	
	public void setIdxssoapikey(
		Long var
	) {
		this.idxssoapikey=var; 
	}
	
	public Long getIdxssoapikey() {
		return this.idxssoapikey; 
	}
	
	public void setReadonly(
		boolean var
	) {
		this.readonly=var; 
	}
	
	public boolean isReadonly() {
		return this.readonly; 
	}
	
	public void setSecretkey(
		String var
	) {
		this.secretkey=var; 
	}
	
	public String getSecretkey() {
		return this.secretkey; 
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