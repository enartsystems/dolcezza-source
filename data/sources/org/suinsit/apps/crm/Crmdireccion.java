package org.suinsit.apps.crm;

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
import org.enartframework.nocode.annotacion.FieldType;
import org.suinsit.apps.admin.Mpais;
import org.suinsit.apps.admin.Mprovincia;
import org.suinsit.apps.crm.Crmempresa;

@Entity
@Table (
	name = "CRMDIRECCION" 
)
@Entidad (
	type = "TABLE",
	pk = "idxcrmdireccion" 
)
public class Crmdireccion implements Serializable { 

	private static final long serialVersionUID = 1L;
	@Column (
		name = "CIUDAD",
		nullable = true 
	)
	private String ciudad;
	@Column (
		name = "CORREO",
		nullable = true 
	)
	@FieldType (
		type = FieldType.TYPEVALIDATOR.EMAIL 
	)
	private String correo;
	@Column (
		name = "DIRECCION",
		nullable = false 
	)
	private String direccion;
	@Column (
		name = "ESTADO",
		nullable = true 
	)
	private String estado;
	@Id
	@Column (
		name = "IDXCRMDIRECCION",
		nullable = true 
	)
	private Long idxcrmdireccion;
	@Column (
		name = "MOVIL",
		nullable = true 
	)
	private String movil;
	@Column (
		name = "TELEFONO",
		nullable = true 
	)
	private String telefono;
	@Column (
		name = "TIPO",
		nullable = false 
	)
	private String tipo;
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
		name = "IDMPROVINCIA0",
		referencedColumnName = "IDX",
		nullable = true,
		insertable = true,
		updatable = true 
	)
	private Mprovincia idmprovincia; 

	public void setCiudad(
		String var
	) {
		this.ciudad=var; 
	}
	
	public String getCiudad() {
		return this.ciudad; 
	}
	
	public void setCorreo(
		String var
	) {
		this.correo=var; 
	}
	
	public String getCorreo() {
		return this.correo; 
	}
	
	public void setDireccion(
		String var
	) {
		this.direccion=var; 
	}
	
	public String getDireccion() {
		return this.direccion; 
	}
	
	public void setEstado(
		String var
	) {
		this.estado=var; 
	}
	
	public String getEstado() {
		return this.estado; 
	}
	
	public void setIdxcrmdireccion(
		Long var
	) {
		this.idxcrmdireccion=var; 
	}
	
	public Long getIdxcrmdireccion() {
		return this.idxcrmdireccion; 
	}
	
	public void setMovil(
		String var
	) {
		this.movil=var; 
	}
	
	public String getMovil() {
		return this.movil; 
	}
	
	public void setTelefono(
		String var
	) {
		this.telefono=var; 
	}
	
	public String getTelefono() {
		return this.telefono; 
	}
	
	public void setTipo(
		String var
	) {
		this.tipo=var; 
	}
	
	public String getTipo() {
		return this.tipo; 
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
	
	public void setIdmpais(
		Mpais var
	) {
		this.idmpais=var; 
	}
	
	public Mpais getIdmpais() {
		if(this.idmpais==null)this.idmpais=new org.suinsit.apps.admin.Mpais();
		  return this.idmpais; 
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

}