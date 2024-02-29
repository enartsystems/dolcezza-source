package org.suinsit.apps.pmo;

import java.io.Serializable;
import java.lang.Long;
import java.lang.String;
import java.math.BigDecimal;
import java.sql.Date;
import java.sql.Timestamp;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import org.enartframework.nocode.annotacion.Entidad;
import org.suinsit.apps.admin.Ssousuario;
import org.suinsit.apps.pmo.Pmomproject;

@Entity
@Table (
	name = "PMOLINEABASE" 
)
@Entidad (
	type = "TABLE",
	pk = "idxpmolineabase" 
)
public class Pmolineabase implements Serializable { 

	private static final long serialVersionUID = 1L;
	@Column (
		name = "DURACION",
		nullable = true 
	)
	private BigDecimal duracion;
	@Column (
		name = "ALTA",
		nullable = true 
	)
	private Timestamp alta;
	@Column (
		name = "FIN",
		nullable = true 
	)
	private Date fin;
	@Id
	@Column (
		name = "IDXPMOLINEABASE",
		nullable = true 
	)
	private Long idxpmolineabase;
	@Column (
		name = "INICIO",
		nullable = true 
	)
	private Date inicio;
	@Column (
		name = "NOMBRE",
		nullable = false 
	)
	private String nombre;
	private boolean updatable;
	@ManyToOne (
		fetch = javax.persistence.FetchType.LAZY 
	)
	@JoinColumn (
		name = "IDPMOMPROJECT0",
		referencedColumnName = "IDXPMOMPROJECT",
		nullable = true,
		insertable = true,
		updatable = true 
	)
	private Pmomproject idpmomproject;
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

	public void setDuracion(
		BigDecimal var
	) {
		this.duracion=var; 
	}
	
	public BigDecimal getDuracion() {
		return this.duracion; 
	}
	
	public void setAlta(
		Timestamp var
	) {
		this.alta=var; 
	}
	
	public Timestamp getAlta() {
		return this.alta; 
	}
	
	public void setFin(
		Date var
	) {
		this.fin=var; 
	}
	
	public Date getFin() {
		return this.fin; 
	}
	
	public void setIdxpmolineabase(
		Long var
	) {
		this.idxpmolineabase=var; 
	}
	
	public Long getIdxpmolineabase() {
		return this.idxpmolineabase; 
	}
	
	public void setInicio(
		Date var
	) {
		this.inicio=var; 
	}
	
	public Date getInicio() {
		return this.inicio; 
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
	
	public void setIdpmomproject(
		Pmomproject var
	) {
		this.idpmomproject=var; 
	}
	
	public Pmomproject getIdpmomproject() {
		if(this.idpmomproject==null)this.idpmomproject=new org.suinsit.apps.pmo.Pmomproject();
		  return this.idpmomproject; 
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

}