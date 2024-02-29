package org.suinsit.apps.facturacin;

import java.io.Serializable;
import java.lang.Long;
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
import org.suinsit.apps.facturacin.Erpmestadocbo;

@Entity
@Table (
	name = "ERPFACTVENCI" 
)
@Entidad (
	type = "TABLE",
	pk = "idxerpfactvenci" 
)
public class Erpfactvenci implements Serializable { 

	private static final long serialVersionUID = 1L;
	@Column (
		name = "ONLINE",
		nullable = true 
	)
	private boolean online;
	@Column (
		name = "IMPORTE",
		nullable = true 
	)
	private BigDecimal importe;
	@Column (
		name = "FECHA",
		nullable = true 
	)
	private Date fecha;
	@Id
	@Column (
		name = "IDXERPFACTVENCI",
		nullable = true 
	)
	private Long idxerpfactvenci;
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
		name = "IDERPMESTADOCBO0",
		referencedColumnName = "IDXERPMESTADOCBO",
		nullable = true,
		insertable = true,
		updatable = true 
	)
	private Erpmestadocbo iderpmestadocbo;
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

	public void setOnline(
		boolean var
	) {
		this.online=var; 
	}
	
	public boolean isOnline() {
		return this.online; 
	}
	
	public void setImporte(
		BigDecimal var
	) {
		this.importe=var; 
	}
	
	public BigDecimal getImporte() {
		return this.importe; 
	}
	
	public void setFecha(
		Date var
	) {
		this.fecha=var; 
	}
	
	public Date getFecha() {
		return this.fecha; 
	}
	
	public void setIdxerpfactvenci(
		Long var
	) {
		this.idxerpfactvenci=var; 
	}
	
	public Long getIdxerpfactvenci() {
		return this.idxerpfactvenci; 
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
	
	public void setIderpmestadocbo(
		Erpmestadocbo var
	) {
		this.iderpmestadocbo=var; 
	}
	
	public Erpmestadocbo getIderpmestadocbo() {
		if(this.iderpmestadocbo==null)this.iderpmestadocbo=new org.suinsit.apps.facturacin.Erpmestadocbo();
		  return this.iderpmestadocbo; 
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