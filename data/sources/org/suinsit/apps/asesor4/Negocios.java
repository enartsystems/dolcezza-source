package org.suinsit.apps.asesor4;

import java.io.Serializable;
import java.lang.Integer;
import java.lang.String;
import java.sql.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import org.enartframework.nocode.annotacion.Entidad;

@Entity
@Table (
	name = "NEGOCIOS" 
)
@Entidad (
	type = "TABLE",
	pk = "idxnegocios" 
)
public class Negocios implements Serializable { 

	private static final long serialVersionUID = 1L;
	@Id
	@Column (
		name = "IDXNEGOCIOS",
		nullable = true 
	)
	private Integer idxnegocios;
	@Column (
		name = "STATUS",
		nullable = true 
	)
	private String status;
	@Column (
		name = "POSITION",
		nullable = true 
	)
	private Integer position;
	@Column (
		name = "ARCHIVED",
		nullable = true 
	)
	private boolean archived;
	@Column (
		name = "FECSTART",
		nullable = true 
	)
	private Date fecstart;
	private boolean updatable; 

	public void setIdxnegocios(
		Integer var
	) {
		this.idxnegocios=var; 
	}
	
	public Integer getIdxnegocios() {
		return this.idxnegocios; 
	}
	
	public void setStatus(
		String var
	) {
		this.status=var; 
	}
	
	public String getStatus() {
		return this.status; 
	}
	
	public void setPosition(
		Integer var
	) {
		this.position=var; 
	}
	
	public Integer getPosition() {
		return this.position; 
	}
	
	public void setArchived(
		boolean var
	) {
		this.archived=var; 
	}
	
	public boolean isArchived() {
		return this.archived; 
	}
	
	public void setFecstart(
		Date var
	) {
		this.fecstart=var; 
	}
	
	public Date getFecstart() {
		return this.fecstart; 
	}
	
	public void setUpdatable(
		boolean var
	) {
		this.updatable=var; 
	}
	
	public boolean isUpdatable() {
		return this.updatable; 
	} 

}