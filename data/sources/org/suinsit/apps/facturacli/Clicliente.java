package org.suinsit.apps.facturacli;

import java.io.Serializable;
import java.lang.Long;
import java.lang.String;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import org.enartframework.nocode.annotacion.Entidad;
import org.suinsit.apps.admin.Mpais;
import org.suinsit.apps.admin.Mprovincia;
import org.suinsit.apps.admin.Ssousuario;
import org.suinsit.apps.crm.Crmempresa;
import org.suinsit.apps.facturacin.Erpimpuestos;
import org.suinsit.apps.facturacli.Clicliente;

@Entity
@Table (
	name = "CLICLIENTE" 
)
@Entidad (
	type = "TABLE",
	pk = "idxclicliente" 
)
public class Clicliente implements Serializable { 

	private static final long serialVersionUID = 1L;
	@Column (
		name = "apellidos",
		nullable = true 
	)
	private String apellidos;
	@Column (
		name = "codpostal",
		nullable = true 
	)
	private String codpostal;
	@Column (
		name = "direccion",
		nullable = true 
	)
	private String direccion;
	@Column (
		name = "email",
		nullable = true 
	)
	private String email;
	@Column (
		name = "iban",
		nullable = true 
	)
	private String iban;
	@Id
	@Column (
		name = "idxclicliente",
		nullable = true 
	)
	private Long idxclicliente;
	@Column (
		name = "nombre",
		nullable = true 
	)
	private String nombre;
	@Column (
		name = "nomcomercial",
		nullable = true 
	)
	private String nomcomercial;
	@Column (
		name = "tipo",
		nullable = true 
	)
	private String tipo;
	@Column (
		name = "vatid",
		nullable = true 
	)
	private String vatid;
	private boolean updatable;
	@ManyToOne (
		fetch = javax.persistence.FetchType.LAZY 
	)
	@JoinColumn (
		name = "IDCRMEMPRESA0",
		referencedColumnName = "IDXCRMEMPRESA",
		nullable = true,
		insertable = true,
		updatable = true 
	)
	private Crmempresa idcrmempresa;
	@ManyToOne (
		fetch = javax.persistence.FetchType.LAZY 
	)
	@JoinColumn (
		name = "IDMPROVINCIA0",
		referencedColumnName = "IDX",
		nullable = true,
		insertable = true,
		updatable = true 
	)
	private Mprovincia idmprovincia;
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
		name = "IDSSOUSUARIO0",
		referencedColumnName = "IDXSSOUSUARIO",
		nullable = true,
		insertable = true,
		updatable = true 
	)
	private Ssousuario idssousuario;
	@ManyToOne (
		fetch = javax.persistence.FetchType.LAZY 
	)
	@JoinColumn (
		name = "IDCLICLIENTE0",
		referencedColumnName = "IDXCLICLIENTE",
		nullable = true,
		insertable = true,
		updatable = true 
	)
	private Clicliente idclicliente;
	@ManyToOne (
		fetch = javax.persistence.FetchType.LAZY 
	)
	@JoinColumn (
		name = "IDERPIMPUESTOS0",
		referencedColumnName = "IDXERPIMPUESTOS",
		nullable = true,
		insertable = true,
		updatable = true 
	)
	private Erpimpuestos iderpimpuestos; 

	public void setApellidos(
		String var
	) {
		this.apellidos=var; 
	}
	
	public String getApellidos() {
		return this.apellidos; 
	}
	
	public void setCodpostal(
		String var
	) {
		this.codpostal=var; 
	}
	
	public String getCodpostal() {
		return this.codpostal; 
	}
	
	public void setDireccion(
		String var
	) {
		this.direccion=var; 
	}
	
	public String getDireccion() {
		return this.direccion; 
	}
	
	public void setEmail(
		String var
	) {
		this.email=var; 
	}
	
	public String getEmail() {
		return this.email; 
	}
	
	public void setIban(
		String var
	) {
		this.iban=var; 
	}
	
	public String getIban() {
		return this.iban; 
	}
	
	public void setIdxclicliente(
		Long var
	) {
		this.idxclicliente=var; 
	}
	
	public Long getIdxclicliente() {
		return this.idxclicliente; 
	}
	
	public void setNombre(
		String var
	) {
		this.nombre=var; 
	}
	
	public String getNombre() {
		return this.nombre; 
	}
	
	public void setNomcomercial(
		String var
	) {
		this.nomcomercial=var; 
	}
	
	public String getNomcomercial() {
		return this.nomcomercial; 
	}
	
	public void setTipo(
		String var
	) {
		this.tipo=var; 
	}
	
	public String getTipo() {
		return this.tipo; 
	}
	
	public void setVatid(
		String var
	) {
		this.vatid=var; 
	}
	
	public String getVatid() {
		return this.vatid; 
	}
	
	public void setUpdatable(
		boolean var
	) {
		this.updatable=var; 
	}
	
	public boolean isUpdatable() {
		return this.updatable; 
	}
	
	public void setIdcrmempresa(
		Crmempresa var
	) {
		this.idcrmempresa=var; 
	}
	
	public Crmempresa getIdcrmempresa() {
		if(this.idcrmempresa==null)this.idcrmempresa=new org.suinsit.apps.crm.Crmempresa();
		  return this.idcrmempresa; 
	}
	
	public void setIdmprovincia(
		Mprovincia var
	) {
		this.idmprovincia=var; 
	}
	
	public Mprovincia getIdmprovincia() {
		if(this.idmprovincia==null)this.idmprovincia=new org.suinsit.apps.admin.Mprovincia();
		  return this.idmprovincia; 
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
	
	public void setIdssousuario(
		Ssousuario var
	) {
		this.idssousuario=var; 
	}
	
	public Ssousuario getIdssousuario() {
		if(this.idssousuario==null)this.idssousuario=new org.suinsit.apps.admin.Ssousuario();
		  return this.idssousuario; 
	}
	
	public void setIdclicliente(
		Clicliente var
	) {
		this.idclicliente=var; 
	}
	
	public Clicliente getIdclicliente() {
		if(this.idclicliente==null)this.idclicliente=new org.suinsit.apps.facturacli.Clicliente();
		  return this.idclicliente; 
	}
	
	public void setIderpimpuestos(
		Erpimpuestos var
	) {
		this.iderpimpuestos=var; 
	}
	
	public Erpimpuestos getIderpimpuestos() {
		if(this.iderpimpuestos==null)this.iderpimpuestos=new org.suinsit.apps.facturacin.Erpimpuestos();
		  return this.iderpimpuestos; 
	} 

}