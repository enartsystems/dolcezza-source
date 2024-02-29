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
import org.suinsit.apps.crm.Crmropocontact;

@Entity
@Table (
	name = "MROLCARGO" 
)
@Entidad (
	type = "TABLE",
	pk = "idxmrolcargo" 
)
public class Mrolcargo implements Serializable { 

	private static final long serialVersionUID = 1L;
	@Column (
		name = "BAJA",
		nullable = true 
	)
	private boolean baja;
	@Column (
		name = "CARGO",
		nullable = true 
	)
	private String cargo;
	@Id
	@Column (
		name = "IDXMROLCARGO",
		nullable = true 
	)
	private Long idxmrolcargo;
	private boolean updatable;
	private List<Crmropocontact> subcrmropocontact; 

	public void setBaja(
		boolean var
	) {
		this.baja=var; 
	}
	
	public boolean isBaja() {
		return this.baja; 
	}
	
	public void setCargo(
		String var
	) {
		this.cargo=var; 
	}
	
	public String getCargo() {
		return this.cargo; 
	}
	
	public void setIdxmrolcargo(
		Long var
	) {
		this.idxmrolcargo=var; 
	}
	
	public Long getIdxmrolcargo() {
		return this.idxmrolcargo; 
	}
	
	public void setUpdatable(
		boolean var
	) {
		this.updatable=var; 
	}
	
	public boolean isUpdatable() {
		return this.updatable; 
	}
	
	public void setSubcrmropocontact(
		List<Crmropocontact> var
	) {
		this.subcrmropocontact=var; 
	}
	
	public List<Crmropocontact> getSubcrmropocontact() {
		if(this.subcrmropocontact==null)this.subcrmropocontact=new ArrayList<>(0);
		  return this.subcrmropocontact; 
	} 

}