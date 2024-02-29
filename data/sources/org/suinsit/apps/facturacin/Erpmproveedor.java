package org.suinsit.apps.facturacin;

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
import org.suinsit.apps.admin.Mpais;
import org.suinsit.apps.crm.Crmcontacto;
import org.suinsit.apps.facturacin.Erpmabnco;
import org.suinsit.apps.facturacin.Erpmctactble;

@Entity
@Table (
	name = "ERPMPROVEEDOR" 
)
@Entidad (
	type = "TABLE",
	pk = "idxerpmproveedor" 
)
public class Erpmproveedor implements Serializable { 

	private static final long serialVersionUID = 1L;
	@Column (
		name = "DESCUENTO",
		nullable = true 
	)
	private BigDecimal descuento;
	@Column (
		name = "REFERENCIA",
		nullable = true 
	)
	private String referencia;
	@Column (
		name = "NOMBRECOMERCIAL",
		nullable = true 
	)
	private String nombrecomercial;
	@Column (
		name = "CORREO",
		nullable = true 
	)
	private String correo;
	@Column (
		name = "WEBSITE",
		nullable = true 
	)
	private String website;
	@Column (
		name = "TELEFONOS",
		nullable = true 
	)
	private String telefonos;
	@Column (
		name = "PROVINCIA",
		nullable = true 
	)
	private String provincia;
	@Column (
		name = "POBLACION",
		nullable = true 
	)
	private String poblacion;
	@Column (
		name = "DIRECCION",
		nullable = true 
	)
	private String direccion;
	@Column (
		name = "IDENTIFICADOR",
		nullable = false 
	)
	private String identificador;
	@Column (
		name = "ALTA",
		nullable = false 
	)
	private Date alta;
	@Column (
		name = "UID",
		nullable = false 
	)
	private String uid;
	@Column (
		name = "PROVEEDOR",
		nullable = false 
	)
	private String proveedor;
	@Id
	@Column (
		name = "IDXERPMPROVEEDOR",
		nullable = true 
	)
	private Long idxerpmproveedor;
	private boolean updatable;
	@ManyToOne (
		fetch = javax.persistence.FetchType.LAZY 
	)
	@JoinColumn (
		name = "IDCTAVENTAS0",
		referencedColumnName = "IDXERPMCTACTBLE",
		nullable = true,
		insertable = true,
		updatable = true 
	)
	private Erpmctactble idctaventas;
	@ManyToOne (
		fetch = javax.persistence.FetchType.LAZY 
	)
	@JoinColumn (
		name = "IDCRMCONTACTO0",
		referencedColumnName = "IDXCRMCONTACTO",
		nullable = true,
		insertable = true,
		updatable = true 
	)
	private Crmcontacto idcrmcontacto;
	@ManyToOne (
		fetch = javax.persistence.FetchType.LAZY 
	)
	@JoinColumn (
		name = "IDMPAIS0",
		referencedColumnName = "IDX",
		nullable = true,
		insertable = true,
		updatable = true 
	)
	private Mpais idmpais;
	@ManyToOne (
		fetch = javax.persistence.FetchType.LAZY 
	)
	@JoinColumn (
		name = "IDCUENTACOMPRAS0",
		referencedColumnName = "IDXERPMCTACTBLE",
		nullable = true,
		insertable = true,
		updatable = true 
	)
	private Erpmctactble idcuentacompras;
	@ManyToOne (
		fetch = javax.persistence.FetchType.LAZY 
	)
	@JoinColumn (
		name = "IDERPMABNCO0",
		referencedColumnName = "IDXERPMABNCO",
		nullable = true,
		insertable = true,
		updatable = true 
	)
	private Erpmabnco iderpmabnco; 

	public void setDescuento(
		BigDecimal var
	) {
		this.descuento=var; 
	}
	
	public BigDecimal getDescuento() {
		return this.descuento; 
	}
	
	public void setReferencia(
		String var
	) {
		this.referencia=var; 
	}
	
	public String getReferencia() {
		return this.referencia; 
	}
	
	public void setNombrecomercial(
		String var
	) {
		this.nombrecomercial=var; 
	}
	
	public String getNombrecomercial() {
		return this.nombrecomercial; 
	}
	
	public void setCorreo(
		String var
	) {
		this.correo=var; 
	}
	
	public String getCorreo() {
		return this.correo; 
	}
	
	public void setWebsite(
		String var
	) {
		this.website=var; 
	}
	
	public String getWebsite() {
		return this.website; 
	}
	
	public void setTelefonos(
		String var
	) {
		this.telefonos=var; 
	}
	
	public String getTelefonos() {
		return this.telefonos; 
	}
	
	public void setProvincia(
		String var
	) {
		this.provincia=var; 
	}
	
	public String getProvincia() {
		return this.provincia; 
	}
	
	public void setPoblacion(
		String var
	) {
		this.poblacion=var; 
	}
	
	public String getPoblacion() {
		return this.poblacion; 
	}
	
	public void setDireccion(
		String var
	) {
		this.direccion=var; 
	}
	
	public String getDireccion() {
		return this.direccion; 
	}
	
	public void setIdentificador(
		String var
	) {
		this.identificador=var; 
	}
	
	public String getIdentificador() {
		return this.identificador; 
	}
	
	public void setAlta(
		Date var
	) {
		this.alta=var; 
	}
	
	public Date getAlta() {
		return this.alta; 
	}
	
	public void setUid(
		String var
	) {
		this.uid=var; 
	}
	
	public String getUid() {
		return this.uid; 
	}
	
	public void setProveedor(
		String var
	) {
		this.proveedor=var; 
	}
	
	public String getProveedor() {
		return this.proveedor; 
	}
	
	public void setIdxerpmproveedor(
		Long var
	) {
		this.idxerpmproveedor=var; 
	}
	
	public Long getIdxerpmproveedor() {
		return this.idxerpmproveedor; 
	}
	
	public void setUpdatable(
		boolean var
	) {
		this.updatable=var; 
	}
	
	public boolean isUpdatable() {
		return this.updatable; 
	}
	
	public void setIdctaventas(
		Erpmctactble var
	) {
		this.idctaventas=var; 
	}
	
	public Erpmctactble getIdctaventas() {
		if(this.idctaventas==null)this.idctaventas=new org.suinsit.apps.facturacin.Erpmctactble();
		  return this.idctaventas; 
	}
	
	public void setIdcrmcontacto(
		Crmcontacto var
	) {
		this.idcrmcontacto=var; 
	}
	
	public Crmcontacto getIdcrmcontacto() {
		if(this.idcrmcontacto==null)this.idcrmcontacto=new org.suinsit.apps.crm.Crmcontacto();
		  return this.idcrmcontacto; 
	}
	
	public void setIdmpais(
		Mpais var
	) {
		this.idmpais=var; 
	}
	
	public Mpais getIdmpais() {
		if(this.idmpais==null)this.idmpais=new org.suinsit.apps.admin.Mpais();
		  return this.idmpais; 
	}
	
	public void setIdcuentacompras(
		Erpmctactble var
	) {
		this.idcuentacompras=var; 
	}
	
	public Erpmctactble getIdcuentacompras() {
		if(this.idcuentacompras==null)this.idcuentacompras=new org.suinsit.apps.facturacin.Erpmctactble();
		  return this.idcuentacompras; 
	}
	
	public void setIderpmabnco(
		Erpmabnco var
	) {
		this.iderpmabnco=var; 
	}
	
	public Erpmabnco getIderpmabnco() {
		if(this.iderpmabnco==null)this.iderpmabnco=new org.suinsit.apps.facturacin.Erpmabnco();
		  return this.iderpmabnco; 
	} 

}