package org.suinsit.apps.pmo;

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
import org.suinsit.apps.pmo.Pmorsuserproy;

@Entity
@Table (
	name = "PMOMPERFIL" 
)
@Entidad (
	type = "TABLE",
	pk = "idxpmomperfil" 
)
public class Pmomperfil implements Serializable { 

	private static final long serialVersionUID = 1L;
	@Column (
		name = "EXTERNO",
		nullable = true 
	)
	private boolean externo;
	@Id
	@Column (
		name = "IDXPMOMPERFIL",
		nullable = true 
	)
	private Long idxpmomperfil;
	@Column (
		name = "INTERNO",
		nullable = true 
	)
	private boolean interno;
	@Column (
		name = "PERFIL",
		nullable = true 
	)
	private String perfil;
	private boolean updatable;
	private List<Pmorsuserproy> subpmorsuserproy; 

	public void setExterno(
		boolean var
	) {
		this.externo=var; 
	}
	
	public boolean isExterno() {
		return this.externo; 
	}
	
	public void setIdxpmomperfil(
		Long var
	) {
		this.idxpmomperfil=var; 
	}
	
	public Long getIdxpmomperfil() {
		return this.idxpmomperfil; 
	}
	
	public void setInterno(
		boolean var
	) {
		this.interno=var; 
	}
	
	public boolean isInterno() {
		return this.interno; 
	}
	
	public void setPerfil(
		String var
	) {
		this.perfil=var; 
	}
	
	public String getPerfil() {
		return this.perfil; 
	}
	
	public void setUpdatable(
		boolean var
	) {
		this.updatable=var; 
	}
	
	public boolean isUpdatable() {
		return this.updatable; 
	}
	
	public void setSubpmorsuserproy(
		List<Pmorsuserproy> var
	) {
		this.subpmorsuserproy=var; 
	}
	
	public List<Pmorsuserproy> getSubpmorsuserproy() {
		if(this.subpmorsuserproy==null)this.subpmorsuserproy=new ArrayList<>(0);
		  return this.subpmorsuserproy; 
	} 

}