package org.suinsit.apps.marketing;

import java.io.Serializable;
import java.lang.Long;
import java.lang.String;
import javax.persistence.Column;
import org.enartframework.nocode.annotacion.Entidad;

@Entidad (
	type = "VIEW" 
)
public class Vmktlistcontacto implements Serializable { 

	private static final long serialVersionUID = 1L;
	@Column (
		name = "IDPROVEEDOR",
		nullable = true 
	)
	private String idproveedor;
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
		name = "IDCRMCONTACTO0",
		nullable = true 
	)
	private Long idcrmcontacto0;
	@Column (
		name = "IDXMKTPROVMAIL",
		nullable = true 
	)
	private Long idxmktprovmail;
	@Column (
		name = "NOMBRE",
		nullable = true 
	)
	private String nombre;
	@Column (
		name = "IDMKTMLISTNEWS0",
		nullable = true 
	)
	private Long idmktmlistnews0;
	private boolean updatable; 

	public void setIdproveedor(
		String var
	) {
		this.idproveedor=var; 
	}
	
	public String getIdproveedor() {
		return this.idproveedor; 
	}
	
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
	
	public void setIdcrmcontacto0(
		Long var
	) {
		this.idcrmcontacto0=var; 
	}
	
	public Long getIdcrmcontacto0() {
		return this.idcrmcontacto0; 
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
	
	public void setIdmktmlistnews0(
		Long var
	) {
		this.idmktmlistnews0=var; 
	}
	
	public Long getIdmktmlistnews0() {
		return this.idmktmlistnews0; 
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