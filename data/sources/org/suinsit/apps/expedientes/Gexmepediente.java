package org.suinsit.apps.expedientes;

import java.io.Serializable;
import java.lang.Long;
import java.lang.Object;
import java.lang.String;
import java.sql.Date;
import java.sql.Timestamp;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import org.enartframework.nocode.annotacion.Entidad;
import org.enartframework.nocode.annotacion.Sequence;
import org.suinsit.apps.admin.Ssousuario;
import org.suinsit.apps.crm.Crmempresa;
import org.suinsit.apps.expedientes.Gexmestado;
import org.suinsit.apps.expedientes.Gexmtipo;
import org.suinsit.apps.expedientes.Gexrtiporesol;
import org.suinsit.apps.subvenciones.Submorganismo;

@Entity
@Table (
	name = "GEXMEPEDIENTE" 
)
@Entidad (
	type = "TABLE",
	pk = "idxgexmepediente" 
)
public class Gexmepediente implements Serializable { 

	private static final long serialVersionUID = 1L;
	@Column (
		name = "ALTA",
		nullable = false 
	)
	private Timestamp alta;
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
		name = "DESCREOLUCION",
		nullable = true 
	)
	private String descreolucion;
	@Column (
		name = "DESCRIPCION",
		nullable = true 
	)
	private String descripcion;
	@Column (
		name = "DOCPENDIENTE",
		nullable = true 
	)
	private String docpendiente;
	@Column (
		name = "EXPEDIENTE",
		nullable = false 
	)
	@Sequence (
		name = "GEXMEPEDIENTE_EXPEDIENTE",
		prefix = "GEX",
		mask = "000000",
		addYear = true 
	)
	private String expediente;
	@Column (
		name = "FECRESOLUCION",
		nullable = true 
	)
	private Timestamp fecresolucion;
	@Column (
		name = "FECTRAMITE",
		nullable = true 
	)
	private Date fectramite;
	@Column (
		name = "FECVTO",
		nullable = true 
	)
	private Date fecvto;
	@Id
	@Column (
		name = "IDXGEXMEPEDIENTE",
		nullable = true 
	)
	private Long idxgexmepediente;
	@Column (
		name = "REFADMINISTRATIVA",
		nullable = true 
	)
	private String refadministrativa;
	@Column (
		name = "REQUERIMIENTO",
		nullable = true 
	)
	private Object requerimiento;
	@Column (
		name = "TMALTA",
		nullable = true 
	)
	private Timestamp tmalta;
	@Column (
		name = "TMMODIF",
		nullable = true 
	)
	private Timestamp tmmodif;
	private boolean updatable;
	@ManyToOne (
		fetch = javax.persistence.FetchType.LAZY 
	)
	@JoinColumn (
		name = "IDGEXMTIPO0",
		referencedColumnName = "IDXGEXMTIPO",
		nullable = true,
		insertable = true,
		updatable = true 
	)
	private Gexmtipo idgexmtipo;
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
		name = "IDSUBMORGANISMO0",
		referencedColumnName = "IDXSUBMORGANISMO",
		nullable = true,
		insertable = true,
		updatable = true 
	)
	private Submorganismo idsubmorganismo;
	@ManyToOne (
		fetch = javax.persistence.FetchType.LAZY 
	)
	@JoinColumn (
		name = "IDGEXMESTADO0",
		referencedColumnName = "IDXGEXMESTADO",
		nullable = true,
		insertable = true,
		updatable = true 
	)
	private Gexmestado idgexmestado;
	@ManyToOne (
		fetch = javax.persistence.FetchType.LAZY 
	)
	@JoinColumn (
		name = "IDGEXRTIPORESOL0",
		referencedColumnName = "IDXGEXRTIPORESOL",
		nullable = true,
		insertable = true,
		updatable = true 
	)
	private Gexrtiporesol idgexrtiporesol; 

	public void setAlta(
		Timestamp var
	) {
		this.alta=var; 
	}
	
	public Timestamp getAlta() {
		return this.alta; 
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
	
	public void setDescreolucion(
		String var
	) {
		this.descreolucion=var; 
	}
	
	public String getDescreolucion() {
		return this.descreolucion; 
	}
	
	public void setDescripcion(
		String var
	) {
		this.descripcion=var; 
	}
	
	public String getDescripcion() {
		return this.descripcion; 
	}
	
	public void setDocpendiente(
		String var
	) {
		this.docpendiente=var; 
	}
	
	public String getDocpendiente() {
		return this.docpendiente; 
	}
	
	public void setExpediente(
		String var
	) {
		this.expediente=var; 
	}
	
	public String getExpediente() {
		return this.expediente; 
	}
	
	public void setFecresolucion(
		Timestamp var
	) {
		this.fecresolucion=var; 
	}
	
	public Timestamp getFecresolucion() {
		return this.fecresolucion; 
	}
	
	public void setFectramite(
		Date var
	) {
		this.fectramite=var; 
	}
	
	public Date getFectramite() {
		return this.fectramite; 
	}
	
	public void setFecvto(
		Date var
	) {
		this.fecvto=var; 
	}
	
	public Date getFecvto() {
		return this.fecvto; 
	}
	
	public void setIdxgexmepediente(
		Long var
	) {
		this.idxgexmepediente=var; 
	}
	
	public Long getIdxgexmepediente() {
		return this.idxgexmepediente; 
	}
	
	public void setRefadministrativa(
		String var
	) {
		this.refadministrativa=var; 
	}
	
	public String getRefadministrativa() {
		return this.refadministrativa; 
	}
	
	public void setRequerimiento(
		Object var
	) {
		this.requerimiento=var; 
	}
	
	public Object getRequerimiento() {
		return this.requerimiento; 
	}
	
	public void setTmalta(
		Timestamp var
	) {
		this.tmalta=var; 
	}
	
	public Timestamp getTmalta() {
		return this.tmalta; 
	}
	
	public void setTmmodif(
		Timestamp var
	) {
		this.tmmodif=var; 
	}
	
	public Timestamp getTmmodif() {
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
	
	public void setIdgexmtipo(
		Gexmtipo var
	) {
		this.idgexmtipo=var; 
	}
	
	public Gexmtipo getIdgexmtipo() {
		if(this.idgexmtipo==null)this.idgexmtipo=new org.suinsit.apps.expedientes.Gexmtipo();
		  return this.idgexmtipo; 
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
	
	public void setIdssousuario(
		Ssousuario var
	) {
		this.idssousuario=var; 
	}
	
	public Ssousuario getIdssousuario() {
		if(this.idssousuario==null)this.idssousuario=new org.suinsit.apps.admin.Ssousuario();
		  return this.idssousuario; 
	}
	
	public void setIdsubmorganismo(
		Submorganismo var
	) {
		this.idsubmorganismo=var; 
	}
	
	public Submorganismo getIdsubmorganismo() {
		if(this.idsubmorganismo==null)this.idsubmorganismo=new org.suinsit.apps.subvenciones.Submorganismo();
		  return this.idsubmorganismo; 
	}
	
	public void setIdgexmestado(
		Gexmestado var
	) {
		this.idgexmestado=var; 
	}
	
	public Gexmestado getIdgexmestado() {
		if(this.idgexmestado==null)this.idgexmestado=new org.suinsit.apps.expedientes.Gexmestado();
		  return this.idgexmestado; 
	}
	
	public void setIdgexrtiporesol(
		Gexrtiporesol var
	) {
		this.idgexrtiporesol=var; 
	}
	
	public Gexrtiporesol getIdgexrtiporesol() {
		if(this.idgexrtiporesol==null)this.idgexrtiporesol=new org.suinsit.apps.expedientes.Gexrtiporesol();
		  return this.idgexrtiporesol; 
	} 

}