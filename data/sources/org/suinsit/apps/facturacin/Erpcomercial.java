package org.suinsit.apps.facturacin;

import java.io.Serializable;
import java.lang.Long;
import java.lang.Object;
import java.lang.String;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import org.enartframework.nocode.annotacion.Entidad;
import org.suinsit.apps.admin.Ssousuario;
import org.suinsit.apps.contratos.Crtmcontrato;
import org.suinsit.apps.facturacin.Erpempresa;
import org.suinsit.apps.facturacin.Erpequipo;
import org.suinsit.apps.facturacin.Erpfactura;
import org.suinsit.apps.facturacin.Erppresupuesto;

@Entity
@Table (
	name = "ERPCOMERCIAL" 
)
@Entidad (
	type = "TABLE",
	pk = "idxerpcomercial" 
)
public class Erpcomercial implements Serializable { 

	private static final long serialVersionUID = 1L;
	@Column (
		name = "AVATAR",
		nullable = true 
	)
	private Object avatar;
	@Column (
		name = "EMAIL",
		nullable = true 
	)
	private String email;
	@Id
	@Column (
		name = "IDXERPCOMERCIAL",
		nullable = true 
	)
	private Long idxerpcomercial;
	@Column (
		name = "MOVIL",
		nullable = true 
	)
	private String movil;
	@Column (
		name = "NOMBRE",
		nullable = true 
	)
	private String nombre;
	@Column (
		name = "OBJETIVO",
		nullable = true 
	)
	private BigDecimal objetivo;
	@Column (
		name = "TELEFONO",
		nullable = true 
	)
	private String telefono;
	private boolean updatable;
	@ManyToOne (
		fetch = javax.persistence.FetchType.LAZY 
	)
	@JoinColumn (
		name = "IDERPEMPRESA0",
		referencedColumnName = "IDXERPEMPRESA",
		nullable = true,
		insertable = true,
		updatable = true 
	)
	private Erpempresa iderpempresa;
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
		name = "IDERPEQUIPO0",
		referencedColumnName = "IDXERPEQUIPO",
		nullable = true,
		insertable = true,
		updatable = true 
	)
	private Erpequipo iderpequipo;
	private List<Erpequipo> suberpequipo;
	private List<Erppresupuesto> suberppresupuesto;
	private List<Erpfactura> suberpfactura;
	private List<Crtmcontrato> subcrtmcontrato; 

	public void setAvatar(
		Object var
	) {
		this.avatar=var; 
	}
	
	public Object getAvatar() {
		return this.avatar; 
	}
	
	public void setEmail(
		String var
	) {
		this.email=var; 
	}
	
	public String getEmail() {
		return this.email; 
	}
	
	public void setIdxerpcomercial(
		Long var
	) {
		this.idxerpcomercial=var; 
	}
	
	public Long getIdxerpcomercial() {
		return this.idxerpcomercial; 
	}
	
	public void setMovil(
		String var
	) {
		this.movil=var; 
	}
	
	public String getMovil() {
		return this.movil; 
	}
	
	public void setNombre(
		String var
	) {
		this.nombre=var; 
	}
	
	public String getNombre() {
		return this.nombre; 
	}
	
	public void setObjetivo(
		BigDecimal var
	) {
		this.objetivo=var; 
	}
	
	public BigDecimal getObjetivo() {
		return this.objetivo; 
	}
	
	public void setTelefono(
		String var
	) {
		this.telefono=var; 
	}
	
	public String getTelefono() {
		return this.telefono; 
	}
	
	public void setUpdatable(
		boolean var
	) {
		this.updatable=var; 
	}
	
	public boolean isUpdatable() {
		return this.updatable; 
	}
	
	public void setIderpempresa(
		Erpempresa var
	) {
		this.iderpempresa=var; 
	}
	
	public Erpempresa getIderpempresa() {
		if(this.iderpempresa==null)this.iderpempresa=new org.suinsit.apps.facturacin.Erpempresa();
		  return this.iderpempresa; 
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
	
	public void setIderpequipo(
		Erpequipo var
	) {
		this.iderpequipo=var; 
	}
	
	public Erpequipo getIderpequipo() {
		if(this.iderpequipo==null)this.iderpequipo=new org.suinsit.apps.facturacin.Erpequipo();
		  return this.iderpequipo; 
	}
	
	public void setSuberpequipo(
		List<Erpequipo> var
	) {
		this.suberpequipo=var; 
	}
	
	public List<Erpequipo> getSuberpequipo() {
		if(this.suberpequipo==null)this.suberpequipo=new ArrayList<>(0);
		  return this.suberpequipo; 
	}
	
	public void setSuberppresupuesto(
		List<Erppresupuesto> var
	) {
		this.suberppresupuesto=var; 
	}
	
	public List<Erppresupuesto> getSuberppresupuesto() {
		if(this.suberppresupuesto==null)this.suberppresupuesto=new ArrayList<>(0);
		  return this.suberppresupuesto; 
	}
	
	public void setSuberpfactura(
		List<Erpfactura> var
	) {
		this.suberpfactura=var; 
	}
	
	public List<Erpfactura> getSuberpfactura() {
		if(this.suberpfactura==null)this.suberpfactura=new ArrayList<>(0);
		  return this.suberpfactura; 
	}
	
	public void setSubcrtmcontrato(
		List<Crtmcontrato> var
	) {
		this.subcrtmcontrato=var; 
	}
	
	public List<Crtmcontrato> getSubcrtmcontrato() {
		if(this.subcrtmcontrato==null)this.subcrtmcontrato=new ArrayList<>(0);
		  return this.subcrtmcontrato; 
	} 

}