package org.suinsit.apps.facturacin;

import java.io.Serializable;
import java.lang.Long;
import java.lang.String;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import org.enartframework.nocode.annotacion.Entidad;
import org.enartframework.nocode.annotacion.FieldType;
import org.suinsit.apps.facturacin.Erpempresa;

@Entity
@Table (
	name = "ERPMABNCO" 
)
@Entidad (
	type = "TABLE",
	pk = "idxerpmabnco" 
)
public class Erpmabnco implements Serializable { 

	private static final long serialVersionUID = 1L;
	@Column (
		name = "banco",
		nullable = true 
	)
	private String banco;
	@Column (
		name = "codiban",
		nullable = true 
	)
	@FieldType (
		type = FieldType.TYPEVALIDATOR.IBAN 
	)
	private String codiban;
	@Column (
		name = "codswift",
		nullable = true 
	)
	private String codswift;
	@Id
	@Column (
		name = "idxerpmabnco",
		nullable = true 
	)
	private Long idxerpmabnco;
	private boolean updatable;
	@ManyToOne (
		fetch = javax.persistence.FetchType.LAZY 
	)
	@JoinColumn (
		name = "IDERPEMPRESA0",
		referencedColumnName = "IDXERPEMPRESA",
		nullable = true,
		insertable = true,
		updatable = true 
	)
	private Erpempresa iderpempresa; 

	public void setBanco(
		String var
	) {
		this.banco=var; 
	}
	
	public String getBanco() {
		return this.banco; 
	}
	
	public void setCodiban(
		String var
	) {
		this.codiban=var; 
	}
	
	public String getCodiban() {
		return this.codiban; 
	}
	
	public void setCodswift(
		String var
	) {
		this.codswift=var; 
	}
	
	public String getCodswift() {
		return this.codswift; 
	}
	
	public void setIdxerpmabnco(
		Long var
	) {
		this.idxerpmabnco=var; 
	}
	
	public Long getIdxerpmabnco() {
		return this.idxerpmabnco; 
	}
	
	public void setUpdatable(
		boolean var
	) {
		this.updatable=var; 
	}
	
	public boolean isUpdatable() {
		return this.updatable; 
	}
	
	public void setIderpempresa(
		Erpempresa var
	) {
		this.iderpempresa=var; 
	}
	
	public Erpempresa getIderpempresa() {
		if(this.iderpempresa==null)this.iderpempresa=new org.suinsit.apps.facturacin.Erpempresa();
		  return this.iderpempresa; 
	} 

}