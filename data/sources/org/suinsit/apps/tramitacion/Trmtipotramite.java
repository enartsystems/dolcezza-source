package org.suinsit.apps.tramitacion;

import java.io.Serializable;
import java.lang.Long;
import java.lang.String;
import java.math.BigDecimal;
import java.sql.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import org.enartframework.nocode.annotacion.Entidad;
import org.suinsit.apps.facturacin.Promproducto;

@Entity
@Table (
	name = "TRMTIPOTRAMITE" 
)
@Entidad (
	type = "TABLE",
	pk = "idxtrmtipotramite" 
)
public class Trmtipotramite implements Serializable { 

	private static final long serialVersionUID = 1L;
	@Column (
		name = "ALTA",
		nullable = false 
	)
	private Date alta;
	@Id
	@Column (
		name = "IDXTRMTIPOTRAMITE",
		nullable = true 
	)
	private Long idxtrmtipotramite;
	@Column (
		name = "INFOWEB",
		nullable = true 
	)
	private String infoweb;
	@Column (
		name = "PFONDOS",
		nullable = true 
	)
	private BigDecimal pfondos;
	@Column (
		name = "PRECIO",
		nullable = true 
	)
	private BigDecimal precio;
	@Column (
		name = "REQUISITOS",
		nullable = true 
	)
	private String requisitos;
	@Column (
		name = "RESUMEN",
		nullable = true 
	)
	private String resumen;
	@Column (
		name = "TRAMITE",
		nullable = false 
	)
	private String tramite;
	private boolean updatable;
	@ManyToOne (
		fetch = javax.persistence.FetchType.LAZY 
	)
	@JoinColumn (
		name = "IDPROMPRODUCTO0",
		referencedColumnName = "IDXPROMPRODUCTO",
		nullable = true,
		insertable = true,
		updatable = true 
	)
	private Promproducto idpromproducto; 

	public void setAlta(
		Date var
	) {
		this.alta=var; 
	}
	
	public Date getAlta() {
		return this.alta; 
	}
	
	public void setIdxtrmtipotramite(
		Long var
	) {
		this.idxtrmtipotramite=var; 
	}
	
	public Long getIdxtrmtipotramite() {
		return this.idxtrmtipotramite; 
	}
	
	public void setInfoweb(
		String var
	) {
		this.infoweb=var; 
	}
	
	public String getInfoweb() {
		return this.infoweb; 
	}
	
	public void setPfondos(
		BigDecimal var
	) {
		this.pfondos=var; 
	}
	
	public BigDecimal getPfondos() {
		return this.pfondos; 
	}
	
	public void setPrecio(
		BigDecimal var
	) {
		this.precio=var; 
	}
	
	public BigDecimal getPrecio() {
		return this.precio; 
	}
	
	public void setRequisitos(
		String var
	) {
		this.requisitos=var; 
	}
	
	public String getRequisitos() {
		return this.requisitos; 
	}
	
	public void setResumen(
		String var
	) {
		this.resumen=var; 
	}
	
	public String getResumen() {
		return this.resumen; 
	}
	
	public void setTramite(
		String var
	) {
		this.tramite=var; 
	}
	
	public String getTramite() {
		return this.tramite; 
	}
	
	public void setUpdatable(
		boolean var
	) {
		this.updatable=var; 
	}
	
	public boolean isUpdatable() {
		return this.updatable; 
	}
	
	public void setIdpromproducto(
		Promproducto var
	) {
		this.idpromproducto=var; 
	}
	
	public Promproducto getIdpromproducto() {
		if(this.idpromproducto==null)this.idpromproducto=new org.suinsit.apps.facturacin.Promproducto();
		  return this.idpromproducto; 
	} 

}