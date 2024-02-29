package org.suinsit.apps.admin;

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
import org.enartframework.nocode.annotacion.Sequence;
import org.suinsit.apps.admin.Mtiposervicio;

@Entity
@Table (
	name = "MSERVICIO" 
)
@Entidad (
	type = "TABLE",
	pk = "idxmservicio" 
)
public class Mservicio implements Serializable { 

	private static final long serialVersionUID = 1L;
	@Column (
		name = "APPKEY",
		nullable = true 
	)
	private String appkey;
	@Column (
		name = "CLASEJAVA",
		nullable = true 
	)
	private String clasejava;
	@Column (
		name = "DESCRIPCION",
		nullable = true 
	)
	private String descripcion;
	@Column (
		name = "FUNCIONAL",
		nullable = true 
	)
	private String funcional;
	@Id
	@Column (
		name = "IDXMSERVICIO",
		nullable = true 
	)
	private Long idxmservicio;
	@Column (
		name = "LOGOTIPO",
		nullable = true 
	)
	private Object logotipo;
	@Column (
		name = "NOMBRE",
		nullable = false 
	)
	private String nombre;
	@Column (
		name = "REFERENCIA",
		nullable = false 
	)
	@Sequence (
		name = "MSERVICIO_REFERENCIA",
		prefix = "",
		mask = "00000",
		addYear = false 
	)
	private String referencia;
	@Column (
		name = "SECRET",
		nullable = true 
	)
	private String secret;
	@Column (
		name = "SERVICIOEXT",
		nullable = true 
	)
	private String servicioext;
	@Column (
		name = "TOKEN",
		nullable = true 
	)
	private String token;
	private boolean updatable;
	@ManyToOne (
		fetch = javax.persistence.FetchType.LAZY 
	)
	@JoinColumn (
		name = "IDMTIPOSERVICIO0",
		referencedColumnName = "IDXMTIPOSERVICIO",
		nullable = true,
		insertable = true,
		updatable = true 
	)
	private Mtiposervicio idmtiposervicio; 

	public void setAppkey(
		String var
	) {
		this.appkey=var; 
	}
	
	public String getAppkey() {
		return this.appkey; 
	}
	
	public void setClasejava(
		String var
	) {
		this.clasejava=var; 
	}
	
	public String getClasejava() {
		return this.clasejava; 
	}
	
	public void setDescripcion(
		String var
	) {
		this.descripcion=var; 
	}
	
	public String getDescripcion() {
		return this.descripcion; 
	}
	
	public void setFuncional(
		String var
	) {
		this.funcional=var; 
	}
	
	public String getFuncional() {
		return this.funcional; 
	}
	
	public void setIdxmservicio(
		Long var
	) {
		this.idxmservicio=var; 
	}
	
	public Long getIdxmservicio() {
		return this.idxmservicio; 
	}
	
	public void setLogotipo(
		Object var
	) {
		this.logotipo=var; 
	}
	
	public Object getLogotipo() {
		return this.logotipo; 
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
	
	public void setServicioext(
		String var
	) {
		this.servicioext=var; 
	}
	
	public String getServicioext() {
		return this.servicioext; 
	}
	
	public void setToken(
		String var
	) {
		this.token=var; 
	}
	
	public String getToken() {
		return this.token; 
	}
	
	public void setUpdatable(
		boolean var
	) {
		this.updatable=var; 
	}
	
	public boolean isUpdatable() {
		return this.updatable; 
	}
	
	public void setIdmtiposervicio(
		Mtiposervicio var
	) {
		this.idmtiposervicio=var; 
	}
	
	public Mtiposervicio getIdmtiposervicio() {
		if(this.idmtiposervicio==null)this.idmtiposervicio=new org.suinsit.apps.admin.Mtiposervicio();
		  return this.idmtiposervicio; 
	} 

}