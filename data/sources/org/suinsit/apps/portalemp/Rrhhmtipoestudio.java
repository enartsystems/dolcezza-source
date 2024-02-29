package org.suinsit.apps.portalemp;

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
import org.suinsit.apps.portalemp.Rrhhmacademic;

@Entity
@Table (
	name = "RRHHMTIPOESTUDIO" 
)
@Entidad (
	type = "TABLE",
	pk = "idxrrhhmtipoestudio" 
)
public class Rrhhmtipoestudio implements Serializable { 

	private static final long serialVersionUID = 1L;
	@Column (
		name = "TIPOESTUDIO",
		nullable = true 
	)
	private String tipoestudio;
	@Id
	@Column (
		name = "IDXRRHHMTIPOESTUDIO",
		nullable = true 
	)
	private Long idxrrhhmtipoestudio;
	private boolean updatable;
	private List<Rrhhmacademic> subrrhhmacademic; 

	public void setTipoestudio(
		String var
	) {
		this.tipoestudio=var; 
	}
	
	public String getTipoestudio() {
		return this.tipoestudio; 
	}
	
	public void setIdxrrhhmtipoestudio(
		Long var
	) {
		this.idxrrhhmtipoestudio=var; 
	}
	
	public Long getIdxrrhhmtipoestudio() {
		return this.idxrrhhmtipoestudio; 
	}
	
	public void setUpdatable(
		boolean var
	) {
		this.updatable=var; 
	}
	
	public boolean isUpdatable() {
		return this.updatable; 
	}
	
	public void setSubrrhhmacademic(
		List<Rrhhmacademic> var
	) {
		this.subrrhhmacademic=var; 
	}
	
	public List<Rrhhmacademic> getSubrrhhmacademic() {
		if(this.subrrhhmacademic==null)this.subrrhhmacademic=new ArrayList<>(0);
		  return this.subrrhhmacademic; 
	} 

}