package org.suinsit.apps.crm;

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
import org.enartframework.nocode.annotacion.AutoGenerate;
import org.enartframework.nocode.annotacion.Entidad;
import org.suinsit.apps.admin.Ssousuario;
import org.suinsit.apps.facturacin.Promproducto;

@Entity
@Table (
	name = "CRMPRODUCTO" 
)
@Entidad (
	type = "TABLE",
	pk = "idxcrmproducto" 
)
public class Crmproducto implements Serializable { 

	private static final long serialVersionUID = 1L;
	@Column (
		name = "ACTIVO",
		nullable = false 
	)
	private boolean activo;
	@Column (
		name = "ALTA",
		nullable = false 
	)
	private Date alta;
	@Column (
		name = "BAJA",
		nullable = true 
	)
	private boolean baja;
	@Column (
		name = "CODIGO",
		nullable = false 
	)
	private String codigo;
	@Column (
		name = "CODUUID",
		nullable = true 
	)
	@AutoGenerate (
		uuid = true 
	)
	private String coduuid;
	@Column (
		name = "COMISION",
		nullable = true 
	)
	private BigDecimal comision;
	@Column (
		name = "COUSERALTA",
		nullable = true 
	)
	private String couseralta;
	@Column (
		name = "COUSERMODIF",
		nullable = true 
	)
	private String cousermodif;
	@Column (
		name = "DESCRIPCION",
		nullable = true 
	)
	private String descripcion;
	@Column (
		name = "EXISTENCIAS",
		nullable = true 
	)
	private BigDecimal existencias;
	@Column (
		name = "FFINVENTAS",
		nullable = true 
	)
	private Date ffinventas;
	@Column (
		name = "FINICIOVENTAS",
		nullable = true 
	)
	private Date finicioventas;
	@Id
	@Column (
		name = "IDXCRMPRODUCTO",
		nullable = true 
	)
	private Long idxcrmproducto;
	@Column (
		name = "PRECIO",
		nullable = true 
	)
	private BigDecimal precio;
	@Column (
		name = "PRODUCTO",
		nullable = false 
	)
	private String producto;
	@Column (
		name = "TMALTA",
		nullable = true 
	)
	private String tmalta;
	@Column (
		name = "TMMODIF",
		nullable = true 
	)
	private String tmmodif;
	private boolean updatable;
	@ManyToOne (
		fetch = javax.persistence.FetchType.LAZY 
	)
	@JoinColumn (
		name = "IDRESPONSABLE0",
		referencedColumnName = "IDXSSOUSUARIO",
		nullable = true,
		insertable = true,
		updatable = true 
	)
	private Ssousuario idresponsable;
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

	public void setActivo(
		boolean var
	) {
		this.activo=var; 
	}
	
	public boolean isActivo() {
		return this.activo; 
	}
	
	public void setAlta(
		Date var
	) {
		this.alta=var; 
	}
	
	public Date getAlta() {
		return this.alta; 
	}
	
	public void setBaja(
		boolean var
	) {
		this.baja=var; 
	}
	
	public boolean isBaja() {
		return this.baja; 
	}
	
	public void setCodigo(
		String var
	) {
		this.codigo=var; 
	}
	
	public String getCodigo() {
		return this.codigo; 
	}
	
	public void setCoduuid(
		String var
	) {
		this.coduuid=var; 
	}
	
	public String getCoduuid() {
		return this.coduuid; 
	}
	
	public void setComision(
		BigDecimal var
	) {
		this.comision=var; 
	}
	
	public BigDecimal getComision() {
		return this.comision; 
	}
	
	public void setCouseralta(
		String var
	) {
		this.couseralta=var; 
	}
	
	public String getCouseralta() {
		return this.couseralta; 
	}
	
	public void setCousermodif(
		String var
	) {
		this.cousermodif=var; 
	}
	
	public String getCousermodif() {
		return this.cousermodif; 
	}
	
	public void setDescripcion(
		String var
	) {
		this.descripcion=var; 
	}
	
	public String getDescripcion() {
		return this.descripcion; 
	}
	
	public void setExistencias(
		BigDecimal var
	) {
		this.existencias=var; 
	}
	
	public BigDecimal getExistencias() {
		return this.existencias; 
	}
	
	public void setFfinventas(
		Date var
	) {
		this.ffinventas=var; 
	}
	
	public Date getFfinventas() {
		return this.ffinventas; 
	}
	
	public void setFinicioventas(
		Date var
	) {
		this.finicioventas=var; 
	}
	
	public Date getFinicioventas() {
		return this.finicioventas; 
	}
	
	public void setIdxcrmproducto(
		Long var
	) {
		this.idxcrmproducto=var; 
	}
	
	public Long getIdxcrmproducto() {
		return this.idxcrmproducto; 
	}
	
	public void setPrecio(
		BigDecimal var
	) {
		this.precio=var; 
	}
	
	public BigDecimal getPrecio() {
		return this.precio; 
	}
	
	public void setProducto(
		String var
	) {
		this.producto=var; 
	}
	
	public String getProducto() {
		return this.producto; 
	}
	
	public void setTmalta(
		String var
	) {
		this.tmalta=var; 
	}
	
	public String getTmalta() {
		return this.tmalta; 
	}
	
	public void setTmmodif(
		String var
	) {
		this.tmmodif=var; 
	}
	
	public String getTmmodif() {
		return this.tmmodif; 
	}
	
	public void setUpdatable(
		boolean var
	) {
		this.updatable=var; 
	}
	
	public boolean isUpdatable() {
		return this.updatable; 
	}
	
	public void setIdresponsable(
		Ssousuario var
	) {
		this.idresponsable=var; 
	}
	
	public Ssousuario getIdresponsable() {
		if(this.idresponsable==null)this.idresponsable=new org.suinsit.apps.admin.Ssousuario();
		  return this.idresponsable; 
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