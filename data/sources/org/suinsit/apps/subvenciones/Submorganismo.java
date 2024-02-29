package org.suinsit.apps.subvenciones;

import java.io.Serializable;
import java.lang.Long;
import java.lang.String;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import org.enartframework.nocode.annotacion.Entidad;
import org.suinsit.apps.admin.Mpais;
import org.suinsit.apps.admin.Mprovincia;
import org.suinsit.apps.expedientes.Gexmepediente;
import org.suinsit.apps.subvenciones.Submtipoorg;
import org.suinsit.apps.subvenciones.Subraorgcon;
import org.suinsit.apps.subvenciones.Subsubvencion;

@Entity
@Table (
	name = "SUBMORGANISMO" 
)
@Entidad (
	type = "TABLE",
	pk = "idxsubmorganismo" 
)
public class Submorganismo implements Serializable { 

	private static final long serialVersionUID = 1L;
	@Column (
		name = "ALTA",
		nullable = true 
	)
	private Date alta;
	@Column (
		name = "CIUDAD",
		nullable = true 
	)
	private String ciudad;
	@Column (
		name = "COMENTARIOS",
		nullable = true 
	)
	private String comentarios;
	@Column (
		name = "DIRECCION",
		nullable = true 
	)
	private String direccion;
	@Column (
		name = "ESTADO",
		nullable = true 
	)
	private String estado;
	@Id
	@Column (
		name = "IDXSUBMORGANISMO",
		nullable = true 
	)
	private Long idxsubmorganismo;
	@Column (
		name = "ORGANISMO",
		nullable = false 
	)
	private String organismo;
	@Column (
		name = "PUBLICO",
		nullable = true 
	)
	private boolean publico;
	@Column (
		name = "TELEFONO",
		nullable = true 
	)
	private String telefono;
	@Column (
		name = "WEB",
		nullable = true 
	)
	private String web;
	private boolean updatable;
	@ManyToOne (
		fetch = javax.persistence.FetchType.LAZY 
	)
	@JoinColumn (
		name = "IDSUBMTIPOORG0",
		referencedColumnName = "IDXSUBMTIPOORG",
		nullable = true,
		insertable = true,
		updatable = true 
	)
	private Submtipoorg idsubmtipoorg;
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
	private List<Subsubvencion> subsubsubvencion;
	private List<Subraorgcon> subsubraorgcon;
	private List<Gexmepediente> subgexmepediente; 

	public void setAlta(
		Date var
	) {
		this.alta=var; 
	}
	
	public Date getAlta() {
		return this.alta; 
	}
	
	public void setCiudad(
		String var
	) {
		this.ciudad=var; 
	}
	
	public String getCiudad() {
		return this.ciudad; 
	}
	
	public void setComentarios(
		String var
	) {
		this.comentarios=var; 
	}
	
	public String getComentarios() {
		return this.comentarios; 
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
	
	public void setIdxsubmorganismo(
		Long var
	) {
		this.idxsubmorganismo=var; 
	}
	
	public Long getIdxsubmorganismo() {
		return this.idxsubmorganismo; 
	}
	
	public void setOrganismo(
		String var
	) {
		this.organismo=var; 
	}
	
	public String getOrganismo() {
		return this.organismo; 
	}
	
	public void setPublico(
		boolean var
	) {
		this.publico=var; 
	}
	
	public boolean isPublico() {
		return this.publico; 
	}
	
	public void setTelefono(
		String var
	) {
		this.telefono=var; 
	}
	
	public String getTelefono() {
		return this.telefono; 
	}
	
	public void setWeb(
		String var
	) {
		this.web=var; 
	}
	
	public String getWeb() {
		return this.web; 
	}
	
	public void setUpdatable(
		boolean var
	) {
		this.updatable=var; 
	}
	
	public boolean isUpdatable() {
		return this.updatable; 
	}
	
	public void setIdsubmtipoorg(
		Submtipoorg var
	) {
		this.idsubmtipoorg=var; 
	}
	
	public Submtipoorg getIdsubmtipoorg() {
		if(this.idsubmtipoorg==null)this.idsubmtipoorg=new org.suinsit.apps.subvenciones.Submtipoorg();
		  return this.idsubmtipoorg; 
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
	
	public void setSubsubsubvencion(
		List<Subsubvencion> var
	) {
		this.subsubsubvencion=var; 
	}
	
	public List<Subsubvencion> getSubsubsubvencion() {
		if(this.subsubsubvencion==null)this.subsubsubvencion=new ArrayList<>(0);
		  return this.subsubsubvencion; 
	}
	
	public void setSubsubraorgcon(
		List<Subraorgcon> var
	) {
		this.subsubraorgcon=var; 
	}
	
	public List<Subraorgcon> getSubsubraorgcon() {
		if(this.subsubraorgcon==null)this.subsubraorgcon=new ArrayList<>(0);
		  return this.subsubraorgcon; 
	}
	
	public void setSubgexmepediente(
		List<Gexmepediente> var
	) {
		this.subgexmepediente=var; 
	}
	
	public List<Gexmepediente> getSubgexmepediente() {
		if(this.subgexmepediente==null)this.subgexmepediente=new ArrayList<>(0);
		  return this.subgexmepediente; 
	} 

}