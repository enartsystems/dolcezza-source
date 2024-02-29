package org.suinsit.apps.citaprev;

import java.io.Serializable;
import java.lang.Integer;
import java.lang.Long;
import java.lang.String;
import java.sql.Date;
import java.sql.Time;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import org.enartframework.nocode.annotacion.Entidad;
import org.suinsit.apps.admin.Ssousuario;
import org.suinsit.apps.citaprev.Citmemploy;

@Entity
@Table (
	name = "CITRUSUHORARIO" 
)
@Entidad (
	type = "TABLE",
	pk = "idxcrmrusuhorario" 
)
public class Citrusuhorario implements Serializable { 

	private static final long serialVersionUID = 1L;
	@Column (
		name = "BAJA",
		nullable = true 
	)
	private boolean baja;
	@Column (
		name = "DESDE",
		nullable = true 
	)
	private Date desde;
	@Column (
		name = "DESDEHORA",
		nullable = false 
	)
	private Time desdehora;
	@Column (
		name = "DIAS",
		nullable = false 
	)
	private String dias;
	@Column (
		name = "HASTA",
		nullable = false 
	)
	private Date hasta;
	@Column (
		name = "HASTAHORA",
		nullable = true 
	)
	private Time hastahora;
	@Id
	@Column (
		name = "IDXCRMRUSUHORARIO",
		nullable = true 
	)
	private Long idxcrmrusuhorario;
	@Column (
		name = "MAXCITAPARALELL",
		nullable = true 
	)
	private Integer maxcitaparalell;
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
		name = "IDCITMEMPLOY0",
		referencedColumnName = "IDXCITMEMPLOY",
		nullable = true,
		insertable = true,
		updatable = true 
	)
	private Citmemploy idcitmemploy; 

	public void setBaja(
		boolean var
	) {
		this.baja=var; 
	}
	
	public boolean isBaja() {
		return this.baja; 
	}
	
	public void setDesde(
		Date var
	) {
		this.desde=var; 
	}
	
	public Date getDesde() {
		return this.desde; 
	}
	
	public void setDesdehora(
		Time var
	) {
		this.desdehora=var; 
	}
	
	public Time getDesdehora() {
		return this.desdehora; 
	}
	
	public void setDias(
		String var
	) {
		this.dias=var; 
	}
	
	public String getDias() {
		return this.dias; 
	}
	
	public void setHasta(
		Date var
	) {
		this.hasta=var; 
	}
	
	public Date getHasta() {
		return this.hasta; 
	}
	
	public void setHastahora(
		Time var
	) {
		this.hastahora=var; 
	}
	
	public Time getHastahora() {
		return this.hastahora; 
	}
	
	public void setIdxcrmrusuhorario(
		Long var
	) {
		this.idxcrmrusuhorario=var; 
	}
	
	public Long getIdxcrmrusuhorario() {
		return this.idxcrmrusuhorario; 
	}
	
	public void setMaxcitaparalell(
		Integer var
	) {
		this.maxcitaparalell=var; 
	}
	
	public Integer getMaxcitaparalell() {
		return this.maxcitaparalell; 
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
	
	public void setIdcitmemploy(
		Citmemploy var
	) {
		this.idcitmemploy=var; 
	}
	
	public Citmemploy getIdcitmemploy() {
		if(this.idcitmemploy==null)this.idcitmemploy=new org.suinsit.apps.citaprev.Citmemploy();
		  return this.idcitmemploy; 
	} 

}