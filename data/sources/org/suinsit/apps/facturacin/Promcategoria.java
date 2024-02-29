package org.suinsit.apps.facturacin;

import java.io.Serializable;
import java.lang.Long;
import java.lang.String;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import org.enartframework.nocode.annotacion.Entidad;
import org.suinsit.apps.facturacin.Promcategoria;
import org.suinsit.apps.facturacin.Promproducto;

@Entity
@Table (
	name = "PROMCATEGORIA" 
)
@Entidad (
	type = "TABLE",
	pk = "idxpromcategoria" 
)
public class Promcategoria implements Serializable { 

	private static final long serialVersionUID = 1L;
	@Id
	@Column (
		name = "IDXPROMCATEGORIA",
		nullable = true 
	)
	private Long idxpromcategoria;
	@Column (
		name = "CATEGORIA",
		nullable = false 
	)
	private String categoria;
	private boolean updatable;
	@ManyToOne (
		fetch = javax.persistence.FetchType.LAZY 
	)
	@JoinColumn (
		name = "IDPARENT0",
		referencedColumnName = "IDXPROMCATEGORIA",
		nullable = true,
		insertable = true,
		updatable = true 
	)
	private Promcategoria idparent;
	private List<Promproducto> subpromproducto; 

	public void setIdxpromcategoria(
		Long var
	) {
		this.idxpromcategoria=var; 
	}
	
	public Long getIdxpromcategoria() {
		return this.idxpromcategoria; 
	}
	
	public void setCategoria(
		String var
	) {
		this.categoria=var; 
	}
	
	public String getCategoria() {
		return this.categoria; 
	}
	
	public void setUpdatable(
		boolean var
	) {
		this.updatable=var; 
	}
	
	public boolean isUpdatable() {
		return this.updatable; 
	}
	
	public void setIdparent(
		Promcategoria var
	) {
		this.idparent=var; 
	}
	
	public Promcategoria getIdparent() {
		if(this.idparent==null)this.idparent=new org.suinsit.apps.facturacin.Promcategoria();
		  return this.idparent; 
	}
	
	public void setSubpromproducto(
		List<Promproducto> var
	) {
		this.subpromproducto=var; 
	}
	
	public List<Promproducto> getSubpromproducto() {
		if(this.subpromproducto==null)this.subpromproducto=new ArrayList<>(0);
		  return this.subpromproducto; 
	} 

}