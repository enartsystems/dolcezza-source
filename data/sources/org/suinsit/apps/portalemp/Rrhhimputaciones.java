package org.suinsit.apps.portalemp;

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
import org.enartframework.nocode.annotacion.Sequence;
import org.suinsit.apps.admin.Ssousuario;
import org.suinsit.apps.contratos.Crtmcontrato;
import org.suinsit.apps.expedientes.Gexmepediente;
import org.suinsit.apps.subvenciones.Subsolictudes;

@Entity
@Table (
	name = "RRHHIMPUTACIONES" 
)
@Entidad (
	type = "TABLE",
	pk = "idxrrhhimputaciones" 
)
public class Rrhhimputaciones implements Serializable { 

	private static final long serialVersionUID = 1L;
	@Column (
		name = "DESCRIPCION",
		nullable = true 
	)
	private String descripcion;
	@Column (
		name = "CODIGO",
		nullable = false 
	)
	@Sequence (
		name = "RRHHIMPUTACIONES_CODIGO",
		prefix = "",
		mask = "00000000",
		addYear = false 
	)
	private String codigo;
	@Column (
		name = "FECFACTURA",
		nullable = true 
	)
	private Date fecfactura;
	@Column (
		name = "FECHA",
		nullable = false 
	)
	private Date fecha;
	@Column (
		name = "FECVALIDACION",
		nullable = true 
	)
	private Date fecvalidacion;
	@Id
	@Column (
		name = "IDXRRHHIMPUTACIONES",
		nullable = true 
	)
	private Long idxrrhhimputaciones;
	@Column (
		name = "TIEMPO",
		nullable = false 
	)
	private BigDecimal tiempo;
	@Column (
		name = "VALIDADO",
		nullable = true 
	)
	private boolean validado;
	private boolean updatable;
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
		name = "IDCRTMCONTRATO0",
		referencedColumnName = "IDXCRTMCONTRATO",
		nullable = true,
		insertable = true,
		updatable = true 
	)
	private Crtmcontrato idcrtmcontrato;
	@ManyToOne (
		fetch = javax.persistence.FetchType.LAZY 
	)
	@JoinColumn (
		name = "IDGEXMEPEDIENTE0",
		referencedColumnName = "IDXGEXMEPEDIENTE",
		nullable = true,
		insertable = true,
		updatable = true 
	)
	private Gexmepediente idgexmepediente;
	@ManyToOne (
		fetch = javax.persistence.FetchType.LAZY 
	)
	@JoinColumn (
		name = "IDSUBSOLICTUDES0",
		referencedColumnName = "IDXSUBSOLICTUDES",
		nullable = true,
		insertable = true,
		updatable = true 
	)
	private Subsolictudes idsubsolictudes; 

	public void setDescripcion(
		String var
	) {
		this.descripcion=var; 
	}
	
	public String getDescripcion() {
		return this.descripcion; 
	}
	
	public void setCodigo(
		String var
	) {
		this.codigo=var; 
	}
	
	public String getCodigo() {
		return this.codigo; 
	}
	
	public void setFecfactura(
		Date var
	) {
		this.fecfactura=var; 
	}
	
	public Date getFecfactura() {
		return this.fecfactura; 
	}
	
	public void setFecha(
		Date var
	) {
		this.fecha=var; 
	}
	
	public Date getFecha() {
		return this.fecha; 
	}
	
	public void setFecvalidacion(
		Date var
	) {
		this.fecvalidacion=var; 
	}
	
	public Date getFecvalidacion() {
		return this.fecvalidacion; 
	}
	
	public void setIdxrrhhimputaciones(
		Long var
	) {
		this.idxrrhhimputaciones=var; 
	}
	
	public Long getIdxrrhhimputaciones() {
		return this.idxrrhhimputaciones; 
	}
	
	public void setTiempo(
		BigDecimal var
	) {
		this.tiempo=var; 
	}
	
	public BigDecimal getTiempo() {
		return this.tiempo; 
	}
	
	public void setValidado(
		boolean var
	) {
		this.validado=var; 
	}
	
	public boolean isValidado() {
		return this.validado; 
	}
	
	public void setUpdatable(
		boolean var
	) {
		this.updatable=var; 
	}
	
	public boolean isUpdatable() {
		return this.updatable; 
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
	
	public void setIdcrtmcontrato(
		Crtmcontrato var
	) {
		this.idcrtmcontrato=var; 
	}
	
	public Crtmcontrato getIdcrtmcontrato() {
		if(this.idcrtmcontrato==null)this.idcrtmcontrato=new org.suinsit.apps.contratos.Crtmcontrato();
		  return this.idcrtmcontrato; 
	}
	
	public void setIdgexmepediente(
		Gexmepediente var
	) {
		this.idgexmepediente=var; 
	}
	
	public Gexmepediente getIdgexmepediente() {
		if(this.idgexmepediente==null)this.idgexmepediente=new org.suinsit.apps.expedientes.Gexmepediente();
		  return this.idgexmepediente; 
	}
	
	public void setIdsubsolictudes(
		Subsolictudes var
	) {
		this.idsubsolictudes=var; 
	}
	
	public Subsolictudes getIdsubsolictudes() {
		if(this.idsubsolictudes==null)this.idsubsolictudes=new org.suinsit.apps.subvenciones.Subsolictudes();
		  return this.idsubsolictudes; 
	} 

}