package org.suinsit.apps.marketing;

import java.io.Serializable;
import java.lang.Long;
import java.lang.String;
import java.sql.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import org.enartframework.nocode.annotacion.Entidad;
import org.suinsit.apps.crm.Crmcontacto;
import org.suinsit.apps.crm.Crmempresa;
import org.suinsit.apps.marketing.Mktmlistnews;

@Entity
@Table (
	name = "MKTRLISTCUSTOMER" 
)
@Entidad (
	type = "TABLE",
	pk = "idxmktrlistcustomer" 
)
public class Mktrlistcustomer implements Serializable { 

	private static final long serialVersionUID = 1L;
	@Column (
		name = "ACTUALIZACION",
		nullable = true 
	)
	private Date actualizacion;
	@Column (
		name = "EMAIL",
		nullable = true 
	)
	private String email;
	@Column (
		name = "EXCLUDE",
		nullable = true 
	)
	private boolean exclude;
	@Id
	@Column (
		name = "IDXMKTRLISTCUSTOMER",
		nullable = true 
	)
	private Long idxmktrlistcustomer;
	@Column (
		name = "LASTNAME",
		nullable = true 
	)
	private String lastname;
	@Column (
		name = "NAME",
		nullable = true 
	)
	private String name;
	private boolean updatable;
	@ManyToOne (
		fetch = javax.persistence.FetchType.LAZY 
	)
	@JoinColumn (
		name = "IDMKTMLISTNEWS0",
		referencedColumnName = "IDXMKTMLISTNEWS",
		nullable = true,
		insertable = true,
		updatable = true 
	)
	private Mktmlistnews idmktmlistnews;
	@ManyToOne (
		fetch = javax.persistence.FetchType.LAZY 
	)
	@JoinColumn (
		name = "IDCRMEMPRESA0",
		referencedColumnName = "IDXCRMEMPRESA",
		nullable = true,
		insertable = true,
		updatable = true 
	)
	private Crmempresa idcrmempresa;
	@ManyToOne (
		fetch = javax.persistence.FetchType.LAZY 
	)
	@JoinColumn (
		name = "IDCRMCONTACTO0",
		referencedColumnName = "IDXCRMCONTACTO",
		nullable = true,
		insertable = true,
		updatable = true 
	)
	private Crmcontacto idcrmcontacto; 

	public void setActualizacion(
		Date var
	) {
		this.actualizacion=var; 
	}
	
	public Date getActualizacion() {
		return this.actualizacion; 
	}
	
	public void setEmail(
		String var
	) {
		this.email=var; 
	}
	
	public String getEmail() {
		return this.email; 
	}
	
	public void setExclude(
		boolean var
	) {
		this.exclude=var; 
	}
	
	public boolean isExclude() {
		return this.exclude; 
	}
	
	public void setIdxmktrlistcustomer(
		Long var
	) {
		this.idxmktrlistcustomer=var; 
	}
	
	public Long getIdxmktrlistcustomer() {
		return this.idxmktrlistcustomer; 
	}
	
	public void setLastname(
		String var
	) {
		this.lastname=var; 
	}
	
	public String getLastname() {
		return this.lastname; 
	}
	
	public void setName(
		String var
	) {
		this.name=var; 
	}
	
	public String getName() {
		return this.name; 
	}
	
	public void setUpdatable(
		boolean var
	) {
		this.updatable=var; 
	}
	
	public boolean isUpdatable() {
		return this.updatable; 
	}
	
	public void setIdmktmlistnews(
		Mktmlistnews var
	) {
		this.idmktmlistnews=var; 
	}
	
	public Mktmlistnews getIdmktmlistnews() {
		if(this.idmktmlistnews==null)this.idmktmlistnews=new org.suinsit.apps.marketing.Mktmlistnews();
		  return this.idmktmlistnews; 
	}
	
	public void setIdcrmempresa(
		Crmempresa var
	) {
		this.idcrmempresa=var; 
	}
	
	public Crmempresa getIdcrmempresa() {
		if(this.idcrmempresa==null)this.idcrmempresa=new org.suinsit.apps.crm.Crmempresa();
		  return this.idcrmempresa; 
	}
	
	public void setIdcrmcontacto(
		Crmcontacto var
	) {
		this.idcrmcontacto=var; 
	}
	
	public Crmcontacto getIdcrmcontacto() {
		if(this.idcrmcontacto==null)this.idcrmcontacto=new org.suinsit.apps.crm.Crmcontacto();
		  return this.idcrmcontacto; 
	} 

}