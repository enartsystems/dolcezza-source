package org.suinsit.apps.subvenciones;

import java.io.Serializable;
import java.lang.Long;
import java.lang.String;
import java.math.BigDecimal;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import org.enartframework.nocode.annotacion.Entidad;

@Entity
@Table (
	name = "CATKITDIGITAL" 
)
@Entidad (
	type = "TABLE",
	pk = "idxcatkitdigital" 
)
public class Catkitdigital implements Serializable { 

	private static final long serialVersionUID = 1L;
	@Column (
		name = "URL",
		nullable = true 
	)
	private String url;
	@Column (
		name = "DESCRIPCION",
		nullable = true 
	)
	private String descripcion;
	@Column (
		name = "IMPORTECAT3",
		nullable = true 
	)
	private BigDecimal importecat3;
	@Column (
		name = "IMPORTECAT2",
		nullable = true 
	)
	private BigDecimal importecat2;
	@Column (
		name = "IMPORTECAT1",
		nullable = true 
	)
	private BigDecimal importecat1;
	@Column (
		name = "CATEGORIA",
		nullable = true 
	)
	private String categoria;
	@Id
	@Column (
		name = "IDXCATKITDIGITAL",
		nullable = true 
	)
	private Long idxcatkitdigital;
	private boolean updatable; 

	public void setUrl(
		String var
	) {
		this.url=var; 
	}
	
	public String getUrl() {
		return this.url; 
	}
	
	public void setDescripcion(
		String var
	) {
		this.descripcion=var; 
	}
	
	public String getDescripcion() {
		return this.descripcion; 
	}
	
	public void setImportecat3(
		BigDecimal var
	) {
		this.importecat3=var; 
	}
	
	public BigDecimal getImportecat3() {
		return this.importecat3; 
	}
	
	public void setImportecat2(
		BigDecimal var
	) {
		this.importecat2=var; 
	}
	
	public BigDecimal getImportecat2() {
		return this.importecat2; 
	}
	
	public void setImportecat1(
		BigDecimal var
	) {
		this.importecat1=var; 
	}
	
	public BigDecimal getImportecat1() {
		return this.importecat1; 
	}
	
	public void setCategoria(
		String var
	) {
		this.categoria=var; 
	}
	
	public String getCategoria() {
		return this.categoria; 
	}
	
	public void setIdxcatkitdigital(
		Long var
	) {
		this.idxcatkitdigital=var; 
	}
	
	public Long getIdxcatkitdigital() {
		return this.idxcatkitdigital; 
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