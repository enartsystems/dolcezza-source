package org.suinsit.apps.marketing;

import java.io.Serializable;
import java.lang.Integer;
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
import org.enartframework.nocode.annotacion.Sequence;
import org.suinsit.apps.marketing.Mktprovmail;

@Entity
@Table (
	name = "MKTMLISTNEWS" 
)
@Entidad (
	type = "TABLE",
	pk = "idxmktmlistnews" 
)
public class Mktmlistnews implements Serializable { 

	private static final long serialVersionUID = 1L;
	@Column (
		name = "SUBSCRIPTORES",
		nullable = true 
	)
	private Integer subscriptores;
	@Column (
		name = "IDPROVEEDOR",
		nullable = true 
	)
	private String idproveedor;
	@Column (
		name = "ACTIVA",
		nullable = true 
	)
	private boolean activa;
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
		name = "MKTMLISTNEWS_CODIGO",
		prefix = "",
		mask = "0000000000",
		addYear = false 
	)
	private String codigo;
	@Column (
		name = "DESCRIPCION",
		nullable = true 
	)
	private String descripcion;
	@Id
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

	public void setSubscriptores(
		Integer var
	) {
		this.subscriptores=var; 
	}
	
	public Integer getSubscriptores() {
		return this.subscriptores; 
	}
	
	public void setIdproveedor(
		String var
	) {
		this.idproveedor=var; 
	}
	
	public String getIdproveedor() {
		return this.idproveedor; 
	}
	
	public void setActiva(
		boolean var
	) {
		this.activa=var; 
	}
	
	public boolean isActiva() {
		return this.activa; 
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

}