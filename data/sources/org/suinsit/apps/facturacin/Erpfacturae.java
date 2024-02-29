package org.suinsit.apps.facturacin;

import java.io.Serializable;
import java.lang.Long;
import java.lang.Object;
import java.lang.String;
import java.sql.Date;
import java.sql.Timestamp;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import org.enartframework.nocode.annotacion.Entidad;
import org.suinsit.apps.admin.Ssousuario;
import org.suinsit.apps.crm.Crmempresa;
import org.suinsit.apps.facturacin.Erpempresa;
import org.suinsit.apps.facturacin.Erpmabnco;

@Entity
@Table (
	name = "ERPFACTURAE" 
)
@Entidad (
	type = "TABLE",
	pk = "idxerpfacturae" 
)
public class Erpfacturae implements Serializable { 

	private static final long serialVersionUID = 1L;
	@Column (
		name = "aditionalinformation",
		nullable = true 
	)
	private String aditionalinformation;
	@Column (
		name = "bic",
		nullable = true 
	)
	private String bic;
	@Column (
		name = "enddate",
		nullable = true 
	)
	private Date enddate;
	@Column (
		name = "fecsigned",
		nullable = true 
	)
	private Timestamp fecsigned;
	@Column (
		name = "iban",
		nullable = true 
	)
	private String iban;
	@Id
	@Column (
		name = "idxerpfacturae",
		nullable = true 
	)
	private Long idxerpfacturae;
	@Column (
		name = "signed",
		nullable = true 
	)
	private boolean signed;
	@Column (
		name = "startdate",
		nullable = true 
	)
	private Date startdate;
	@Column (
		name = "xmlsigned",
		nullable = true 
	)
	private Object xmlsigned;
	private boolean updatable;
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
		name = "IDCOMPANY0",
		referencedColumnName = "IDXERPEMPRESA",
		nullable = true,
		insertable = true,
		updatable = true 
	)
	private Erpempresa idcompany;
	@ManyToOne (
		fetch = javax.persistence.FetchType.LAZY 
	)
	@JoinColumn (
		name = "IDERPMABNCO0",
		referencedColumnName = "IDXERPMABNCO",
		nullable = true,
		insertable = true,
		updatable = true 
	)
	private Erpmabnco iderpmabnco;
	@ManyToOne (
		fetch = javax.persistence.FetchType.LAZY 
	)
	@JoinColumn (
		name = "IDUSERSIGNED0",
		referencedColumnName = "IDXSSOUSUARIO",
		nullable = true,
		insertable = true,
		updatable = true 
	)
	private Ssousuario idusersigned; 

	public void setAditionalinformation(
		String var
	) {
		this.aditionalinformation=var; 
	}
	
	public String getAditionalinformation() {
		return this.aditionalinformation; 
	}
	
	public void setBic(
		String var
	) {
		this.bic=var; 
	}
	
	public String getBic() {
		return this.bic; 
	}
	
	public void setEnddate(
		Date var
	) {
		this.enddate=var; 
	}
	
	public Date getEnddate() {
		return this.enddate; 
	}
	
	public void setFecsigned(
		Timestamp var
	) {
		this.fecsigned=var; 
	}
	
	public Timestamp getFecsigned() {
		return this.fecsigned; 
	}
	
	public void setIban(
		String var
	) {
		this.iban=var; 
	}
	
	public String getIban() {
		return this.iban; 
	}
	
	public void setIdxerpfacturae(
		Long var
	) {
		this.idxerpfacturae=var; 
	}
	
	public Long getIdxerpfacturae() {
		return this.idxerpfacturae; 
	}
	
	public void setSigned(
		boolean var
	) {
		this.signed=var; 
	}
	
	public boolean isSigned() {
		return this.signed; 
	}
	
	public void setStartdate(
		Date var
	) {
		this.startdate=var; 
	}
	
	public Date getStartdate() {
		return this.startdate; 
	}
	
	public void setXmlsigned(
		Object var
	) {
		this.xmlsigned=var; 
	}
	
	public Object getXmlsigned() {
		return this.xmlsigned; 
	}
	
	public void setUpdatable(
		boolean var
	) {
		this.updatable=var; 
	}
	
	public boolean isUpdatable() {
		return this.updatable; 
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
	
	public void setIdcompany(
		Erpempresa var
	) {
		this.idcompany=var; 
	}
	
	public Erpempresa getIdcompany() {
		if(this.idcompany==null)this.idcompany=new org.suinsit.apps.facturacin.Erpempresa();
		  return this.idcompany; 
	}
	
	public void setIderpmabnco(
		Erpmabnco var
	) {
		this.iderpmabnco=var; 
	}
	
	public Erpmabnco getIderpmabnco() {
		if(this.iderpmabnco==null)this.iderpmabnco=new org.suinsit.apps.facturacin.Erpmabnco();
		  return this.iderpmabnco; 
	}
	
	public void setIdusersigned(
		Ssousuario var
	) {
		this.idusersigned=var; 
	}
	
	public Ssousuario getIdusersigned() {
		if(this.idusersigned==null)this.idusersigned=new org.suinsit.apps.admin.Ssousuario();
		  return this.idusersigned; 
	} 

}