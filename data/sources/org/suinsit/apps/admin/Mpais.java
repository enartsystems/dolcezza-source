package org.suinsit.apps.admin;

import java.io.Serializable;
import java.lang.Long;
import java.lang.String;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import org.enartframework.nocode.annotacion.Entidad;

@Entity
@Table (
	name = "MPAIS" 
)
@Entidad (
	type = "TABLE",
	pk = "idx" 
)
public class Mpais implements Serializable { 

	private static final long serialVersionUID = 1L;
	@Id
	@Column (
		name = "IDX",
		nullable = false 
	)
	private Long idx;
	@Column (
		name = "ISO2",
		nullable = true 
	)
	private String iso2;
	@Column (
		name = "ISO3",
		nullable = true 
	)
	private String iso3;
	@Column (
		name = "NAME",
		nullable = true 
	)
	private String name;
	@Column (
		name = "NOM",
		nullable = true 
	)
	private String nom;
	@Column (
		name = "NOMBRE",
		nullable = true 
	)
	private String nombre;
	@Column (
		name = "PHONECODE",
		nullable = true 
	)
	private String phonecode;
	private boolean updatable; 

	public void setIdx(
		Long var
	) {
		this.idx=var; 
	}
	
	public Long getIdx() {
		return this.idx; 
	}
	
	public void setIso2(
		String var
	) {
		this.iso2=var; 
	}
	
	public String getIso2() {
		return this.iso2; 
	}
	
	public void setIso3(
		String var
	) {
		this.iso3=var; 
	}
	
	public String getIso3() {
		return this.iso3; 
	}
	
	public void setName(
		String var
	) {
		this.name=var; 
	}
	
	public String getName() {
		return this.name; 
	}
	
	public void setNom(
		String var
	) {
		this.nom=var; 
	}
	
	public String getNom() {
		return this.nom; 
	}
	
	public void setNombre(
		String var
	) {
		this.nombre=var; 
	}
	
	public String getNombre() {
		return this.nombre; 
	}
	
	public void setPhonecode(
		String var
	) {
		this.phonecode=var; 
	}
	
	public String getPhonecode() {
		return this.phonecode; 
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