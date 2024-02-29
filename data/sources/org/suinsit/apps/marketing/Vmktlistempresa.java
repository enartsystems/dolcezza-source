package org.suinsit.apps.marketing;

import java.io.Serializable;
import java.lang.Long;
import java.lang.String;
import javax.persistence.Column;
import org.enartframework.nocode.annotacion.Entidad;

@Entidad (
	type = "VIEW" 
)
public class Vmktlistempresa implements Serializable { 

	private static final long serialVersionUID = 1L;
	@Column (
		name = "CLAVEAPI",
		nullable = true 
	)
	private String claveapi;
	@Column (
		name = "SECRET",
		nullable = true 
	)
	private String secret;
	@Column (
		name = "IDPROVEEDOR",
		nullable = true 
	)
	private String idproveedor;
	@Column (
		name = "IDXMKTMLISTNEWS",
		nullable = true 
	)
	private Long idxmktmlistnews;
	@Column (
		name = "NOMBRE",
		nullable = true 
	)
	private String nombre;
	@Column (
		name = "IDCRMEMPRESA0",
		nullable = true 
	)
	private Long idcrmempresa0;
	@Column (
		name = "IDXMKTPROVMAIL",
		nullable = true 
	)
	private Long idxmktprovmail;
	private boolean updatable; 

	public void setClaveapi(
		String var
	) {
		this.claveapi=var; 
	}
	
	public String getClaveapi() {
		return this.claveapi; 
	}
	
	public void setSecret(
		String var
	) {
		this.secret=var; 
	}
	
	public String getSecret() {
		return this.secret; 
	}
	
	public void setIdproveedor(
		String var
	) {
		this.idproveedor=var; 
	}
	
	public String getIdproveedor() {
		return this.idproveedor; 
	}
	
	public void setIdxmktmlistnews(
		Long var
	) {
		this.idxmktmlistnews=var; 
	}
	
	public Long getIdxmktmlistnews() {
		return this.idxmktmlistnews; 
	}
	
	public void setNombre(
		String var
	) {
		this.nombre=var; 
	}
	
	public String getNombre() {
		return this.nombre; 
	}
	
	public void setIdcrmempresa0(
		Long var
	) {
		this.idcrmempresa0=var; 
	}
	
	public Long getIdcrmempresa0() {
		return this.idcrmempresa0; 
	}
	
	public void setIdxmktprovmail(
		Long var
	) {
		this.idxmktprovmail=var; 
	}
	
	public Long getIdxmktprovmail() {
		return this.idxmktprovmail; 
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