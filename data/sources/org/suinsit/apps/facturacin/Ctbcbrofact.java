package org.suinsit.apps.facturacin;

import java.io.Serializable;
import java.lang.Long;
import java.lang.String;
import java.math.BigDecimal;
import java.sql.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import org.enartframework.nocode.annotacion.Entidad;
import org.suinsit.apps.facturacin.Erpfactura;
import org.suinsit.apps.facturacin.Erpmabnco;

@Entity
@Table (
	name = "CTBCBROFACT" 
)
@Entidad (
	type = "TABLE",
	pk = "idxctbcbrofact" 
)
public class Ctbcbrofact implements Serializable { 

	private static final long serialVersionUID = 1L;
	@Column (
		name = "CBOPARCIAL",
		nullable = true 
	)
	private boolean cboparcial;
	@Column (
		name = "FECHA",
		nullable = true 
	)
	private Date fecha;
	@Id
	@Column (
		name = "IDXCTBCBROFACT",
		nullable = true 
	)
	private Long idxctbcbrofact;
	@Column (
		name = "IMPORTE",
		nullable = true 
	)
	private BigDecimal importe;
	@Column (
		name = "NOTA",
		nullable = true 
	)
	private String nota;
	private boolean updatable;
	@ManyToOne (
		fetch = javax.persistence.FetchType.LAZY 
	)
	@JoinColumn (
		name = "IDERPFACTURA0",
		referencedColumnName = "IDXERPFACTURA",
		nullable = true,
		insertable = true,
		updatable = true 
	)
	private Erpfactura iderpfactura;
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

	public void setCboparcial(
		boolean var
	) {
		this.cboparcial=var; 
	}
	
	public boolean isCboparcial() {
		return this.cboparcial; 
	}
	
	public void setFecha(
		Date var
	) {
		this.fecha=var; 
	}
	
	public Date getFecha() {
		return this.fecha; 
	}
	
	public void setIdxctbcbrofact(
		Long var
	) {
		this.idxctbcbrofact=var; 
	}
	
	public Long getIdxctbcbrofact() {
		return this.idxctbcbrofact; 
	}
	
	public void setImporte(
		BigDecimal var
	) {
		this.importe=var; 
	}
	
	public BigDecimal getImporte() {
		return this.importe; 
	}
	
	public void setNota(
		String var
	) {
		this.nota=var; 
	}
	
	public String getNota() {
		return this.nota; 
	}
	
	public void setUpdatable(
		boolean var
	) {
		this.updatable=var; 
	}
	
	public boolean isUpdatable() {
		return this.updatable; 
	}
	
	public void setIderpfactura(
		Erpfactura var
	) {
		this.iderpfactura=var; 
	}
	
	public Erpfactura getIderpfactura() {
		if(this.iderpfactura==null)this.iderpfactura=new org.suinsit.apps.facturacin.Erpfactura();
		  return this.iderpfactura; 
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

}