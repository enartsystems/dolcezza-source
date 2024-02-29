package org.suinsit.apps.crm;

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
	name = "CRMTIPOCITA" 
)
@Entidad (
	type = "TABLE",
	pk = "idxcrmtipocita" 
)
public class Crmtipocita implements Serializable { 

	private static final long serialVersionUID = 1L;
	@Column (
		name = "BAJA",
		nullable = true 
	)
	private boolean baja;
	@Id
	@Column (
		name = "IDXCRMTIPOCITA",
		nullable = true 
	)
	private Long idxcrmtipocita;
	@Column (
		name = "TIPOCITA",
		nullable = false 
	)
	private String tipocita;
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
	
	public void setIdxcrmtipocita(
		Long var
	) {
		this.idxcrmtipocita=var; 
	}
	
	public Long getIdxcrmtipocita() {
		return this.idxcrmtipocita; 
	}
	
	public void setTipocita(
		String var
	) {
		this.tipocita=var; 
	}
	
	public String getTipocita() {
		return this.tipocita; 
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