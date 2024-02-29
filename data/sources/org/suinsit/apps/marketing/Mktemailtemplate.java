package org.suinsit.apps.marketing;

import java.io.Serializable;
import java.lang.Long;
import java.lang.String;
import java.sql.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import org.enartframework.nocode.annotacion.Entidad;
import org.suinsit.apps.marketing.Mktmlistnews;
import org.suinsit.apps.marketing.Mktprovmail;

@Entity
@Table (
	name = "MKTEMAILTEMPLATE" 
)
@Entidad (
	type = "TABLE",
	pk = "idxmktemailtemplate" 
)
public class Mktemailtemplate implements Serializable { 

	private static final long serialVersionUID = 1L;
	@Column (
		name = "ALTA",
		nullable = true 
	)
	private Date alta;
	@Column (
		name = "DESCRIPCIN",
		nullable = true 
	)
	private String descripcin;
	@Column (
		name = "TIPO",
		nullable = true 
	)
	private String tipo;
	@Column (
		name = "CONTENIDO",
		nullable = true 
	)
	private String contenido;
	@Column (
		name = "IDPROVEEDOR",
		nullable = true 
	)
	private String idproveedor;
	@Column (
		name = "NOMBRE",
		nullable = true 
	)
	private String nombre;
	@Id
	@Column (
		name = "IDXMKTEMAILTEMPLATE",
		nullable = true 
	)
	private Long idxmktemailtemplate;
	private boolean updatable;
	@ManyToOne (
		fetch = javax.persistence.FetchType.LAZY 
	)
	@JoinColumn (
		name = "IDMKTPROVMAIL0",
		referencedColumnName = "IDXMKTPROVMAIL",
		nullable = true,
		insertable = true,
		updatable = true 
	)
	private Mktprovmail idmktprovmail;
	@ManyToOne (
		fetch = javax.persistence.FetchType.LAZY 
	)
	@JoinColumn (
		name = "IDMKTMLISTNEWS0",
		referencedColumnName = "IDXMKTMLISTNEWS",
		nullable = true,
		insertable = true,
		updatable = true 
	)
	private Mktmlistnews idmktmlistnews; 

	public void setAlta(
		Date var
	) {
		this.alta=var; 
	}
	
	public Date getAlta() {
		return this.alta; 
	}
	
	public void setDescripcin(
		String var
	) {
		this.descripcin=var; 
	}
	
	public String getDescripcin() {
		return this.descripcin; 
	}
	
	public void setTipo(
		String var
	) {
		this.tipo=var; 
	}
	
	public String getTipo() {
		return this.tipo; 
	}
	
	public void setContenido(
		String var
	) {
		this.contenido=var; 
	}
	
	public String getContenido() {
		return this.contenido; 
	}
	
	public void setIdproveedor(
		String var
	) {
		this.idproveedor=var; 
	}
	
	public String getIdproveedor() {
		return this.idproveedor; 
	}
	
	public void setNombre(
		String var
	) {
		this.nombre=var; 
	}
	
	public String getNombre() {
		return this.nombre; 
	}
	
	public void setIdxmktemailtemplate(
		Long var
	) {
		this.idxmktemailtemplate=var; 
	}
	
	public Long getIdxmktemailtemplate() {
		return this.idxmktemailtemplate; 
	}
	
	public void setUpdatable(
		boolean var
	) {
		this.updatable=var; 
	}
	
	public boolean isUpdatable() {
		return this.updatable; 
	}
	
	public void setIdmktprovmail(
		Mktprovmail var
	) {
		this.idmktprovmail=var; 
	}
	
	public Mktprovmail getIdmktprovmail() {
		if(this.idmktprovmail==null)this.idmktprovmail=new org.suinsit.apps.marketing.Mktprovmail();
		  return this.idmktprovmail; 
	}
	
	public void setIdmktmlistnews(
		Mktmlistnews var
	) {
		this.idmktmlistnews=var; 
	}
	
	public Mktmlistnews getIdmktmlistnews() {
		if(this.idmktmlistnews==null)this.idmktmlistnews=new org.suinsit.apps.marketing.Mktmlistnews();
		  return this.idmktmlistnews; 
	} 

}