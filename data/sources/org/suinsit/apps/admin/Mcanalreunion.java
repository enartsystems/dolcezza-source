package org.suinsit.apps.admin;

import java.io.Serializable;
import java.lang.Long;
import java.lang.String;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import org.enartframework.nocode.annotacion.Entidad;
import org.suinsit.apps.citaprev.Citmagenda;

@Entity
@Table (
	name = "MCANALREUNION" 
)
@Entidad (
	type = "TABLE",
	pk = "idxmcanalreunion" 
)
public class Mcanalreunion implements Serializable { 

	private static final long serialVersionUID = 1L;
	@Column (
		name = "BAJA",
		nullable = true 
	)
	private boolean baja;
	@Column (
		name = "CANAL",
		nullable = true 
	)
	private String canal;
	@Id
	@Column (
		name = "IDXMCANALREUNION",
		nullable = true 
	)
	private Long idxmcanalreunion;
	private boolean updatable;
	private List<Citmagenda> subcrmagenda; 

	public void setBaja(
		boolean var
	) {
		this.baja=var; 
	}
	
	public boolean isBaja() {
		return this.baja; 
	}
	
	public void setCanal(
		String var
	) {
		this.canal=var; 
	}
	
	public String getCanal() {
		return this.canal; 
	}
	
	public void setIdxmcanalreunion(
		Long var
	) {
		this.idxmcanalreunion=var; 
	}
	
	public Long getIdxmcanalreunion() {
		return this.idxmcanalreunion; 
	}
	
	public void setUpdatable(
		boolean var
	) {
		this.updatable=var; 
	}
	
	public boolean isUpdatable() {
		return this.updatable; 
	}
	
	public void setSubcrmagenda(
		List<Citmagenda> var
	) {
		this.subcrmagenda=var; 
	}
	
	public List<Citmagenda> getSubcrmagenda() {
		if(this.subcrmagenda==null)this.subcrmagenda=new ArrayList<>(0);
		  return this.subcrmagenda; 
	} 

}