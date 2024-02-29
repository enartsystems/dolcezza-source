package org.suinsit.apps.compras;

import java.io.Serializable;
import java.lang.Long;
import java.lang.String;
import java.math.BigDecimal;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.enartframework.nocode.annotacion.Entidad;
import org.enartframework.nocode.annotacion.Field;
import org.suinsit.apps.compras.Cmpestadofact;
import org.suinsit.apps.compras.Cmppedido;
import org.suinsit.apps.compras.Cmpproveedor;
import org.suinsit.apps.compras.Cmprlineaped;
import org.suinsit.apps.facturacin.Erpempresa;
import org.suinsit.apps.facturacin.Erpformapago;
import org.suinsit.apps.facturacin.Erpmabnco;
import org.suinsit.apps.mrp.Mrpincoterms;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table (
	name = "CMPFACTURA" 
)
@Entidad (
	namespace = "compras",
	type = "TABLE",
	name = "CMPFACTURA",
	labelMonitor = "FACTURA",
	pk = "idxcmpfactura" 
)
public class Cmpfactura implements Serializable { 

	private static final long serialVersionUID = 1L;
	@NotNull
	@NotBlank
	@Size (
		min = 0,
		max = 100 
	)
	@Column (
		name = "factura",
		nullable = false 
	)
	@Field (
		criteria = true,
		auditar = false,
		filter = true,
		label = "",
		type = "VARCHAR" 
	)
	private String factura;
	@Column (
		name = "feccontable",
		nullable = true 
	)
	@Field (
		criteria = true,
		auditar = false,
		filter = true,
		label = "",
		type = "DATE" 
	)
	private Date feccontable;
	@NotNull
	@NotBlank
	@Column (
		name = "fecfactura",
		nullable = false 
	)
	@Field (
		criteria = true,
		auditar = false,
		filter = true,
		label = "",
		type = "DATE" 
	)
	private Date fecfactura;
	@Column (
		name = "fecvto",
		nullable = true 
	)
	@Field (
		criteria = true,
		auditar = false,
		filter = true,
		label = "",
		type = "DATE" 
	)
	private Date fecvto;
	@Id
	@Column (
		name = "idxcmpfactura",
		nullable = true 
	)
	@Field (
		criteria = false,
		auditar = false,
		filter = true,
		type = "LONG" 
	)
	private Long idxcmpfactura;
	@Size (
		min = 0,
		max = 16 
	)
	@Column (
		name = "importrecargo",
		nullable = true 
	)
	@Field (
		criteria = true,
		auditar = false,
		filter = true,
		label = "",
		type = "DECIMAL" 
	)
	private BigDecimal importrecargo;
	@Size (
		min = 0,
		max = 16 
	)
	@Column (
		name = "importreten",
		nullable = true 
	)
	@Field (
		criteria = true,
		auditar = false,
		filter = true,
		label = "",
		type = "DECIMAL" 
	)
	private BigDecimal importreten;
	@Size (
		min = 0,
		max = 16 
	)
	@Column (
		name = "impuestos",
		nullable = true 
	)
	@Field (
		criteria = true,
		auditar = false,
		filter = true,
		label = "",
		type = "DECIMAL" 
	)
	private BigDecimal impuestos;
	@Column (
		name = "notas",
		nullable = true 
	)
	@Field (
		criteria = true,
		auditar = false,
		filter = true,
		label = "",
		type = "CLOB" 
	)
	private String notas;
	@Size (
		min = 0,
		max = 16 
	)
	@Column (
		name = "percentrecargo",
		nullable = true 
	)
	@Field (
		criteria = true,
		auditar = false,
		filter = true,
		label = "",
		type = "DECIMAL" 
	)
	private BigDecimal percentrecargo;
	@Size (
		min = 0,
		max = 16 
	)
	@Column (
		name = "percentreten",
		nullable = true 
	)
	@Field (
		criteria = true,
		auditar = false,
		filter = true,
		label = "",
		type = "DECIMAL" 
	)
	private BigDecimal percentreten;
	@Size (
		min = 0,
		max = 100 
	)
	@Column (
		name = "reffactura",
		nullable = true 
	)
	@Field (
		criteria = true,
		auditar = false,
		filter = true,
		label = "",
		type = "VARCHAR" 
	)
	private String reffactura;
	@Size (
		min = 0,
		max = 100 
	)
	@Column (
		name = "refpago",
		nullable = true 
	)
	@Field (
		criteria = true,
		auditar = false,
		filter = true,
		label = "",
		type = "VARCHAR" 
	)
	private String refpago;
	@Column (
		name = "revisar",
		nullable = true 
	)
	@Field (
		criteria = true,
		auditar = false,
		filter = true,
		label = "",
		type = "BOOLEAN" 
	)
	private boolean revisar;
	@Size (
		min = 0,
		max = 16 
	)
	@Column (
		name = "subtotal",
		nullable = true 
	)
	@Field (
		criteria = true,
		auditar = false,
		filter = true,
		label = "",
		type = "DECIMAL" 
	)
	private BigDecimal subtotal;
	@Size (
		min = 0,
		max = 16 
	)
	@Column (
		name = "total",
		nullable = true 
	)
	@Field (
		criteria = true,
		auditar = false,
		filter = true,
		label = "",
		type = "DECIMAL" 
	)
	private BigDecimal total;
	@Size (
		min = 0,
		max = 16 
	)
	@Column (
		name = "vatpercent",
		nullable = true 
	)
	@Field (
		criteria = true,
		auditar = false,
		filter = true,
		label = "",
		type = "DECIMAL" 
	)
	private BigDecimal vatpercent;
	private boolean updatable;
	@ManyToOne (
		fetch = javax.persistence.FetchType.LAZY 
	)
	@JoinColumn (
		name = "IDCMPPROVEEDOR0",
		referencedColumnName = "IDXCMPPROVEEDOR",
		nullable = true,
		insertable = true,
		updatable = true 
	)
	private Cmpproveedor idcmpproveedor;
	@ManyToOne (
		fetch = javax.persistence.FetchType.LAZY 
	)
	@JoinColumn (
		name = "IDCMPPEDIDO0",
		referencedColumnName = "IDXCMPPEDIDO",
		nullable = true,
		insertable = true,
		updatable = true 
	)
	private Cmppedido idcmppedido;
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
	@ManyToOne (
		fetch = javax.persistence.FetchType.LAZY 
	)
	@JoinColumn (
		name = "IDERPFORMAPAGO0",
		referencedColumnName = "IDXERPFORMAPAGO",
		nullable = true,
		insertable = true,
		updatable = true 
	)
	private Erpformapago iderpformapago;
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
		name = "IDCMPESTADOFACT0",
		referencedColumnName = "IDXCMPESTADOFACT",
		nullable = true,
		insertable = true,
		updatable = true 
	)
	private Cmpestadofact idcmpestadofact;
	@ManyToOne (
		fetch = javax.persistence.FetchType.LAZY 
	)
	@JoinColumn (
		name = "IDMRPINCOTERMS0",
		referencedColumnName = "IDXMRPINCOTERMS",
		nullable = true,
		insertable = true,
		updatable = true 
	)
	private Mrpincoterms idmrpincoterms;
	@OneToMany (
		cascade = javax.persistence.CascadeType.ALL,
		mappedBy = "idcmpfactura" 
	)
	private List<Cmprlineaped> subcmprlineaped; 

	public Cmpproveedor getIdcmpproveedor() {
		if(this.idcmpproveedor==null)this.idcmpproveedor=new org.suinsit.apps.compras.Cmpproveedor();
		  return this.idcmpproveedor; 
	}
	
	public Cmppedido getIdcmppedido() {
		if(this.idcmppedido==null)this.idcmppedido=new org.suinsit.apps.compras.Cmppedido();
		  return this.idcmppedido; 
	}
	
	public Erpempresa getIderpempresa() {
		if(this.iderpempresa==null)this.iderpempresa=new org.suinsit.apps.facturacin.Erpempresa();
		  return this.iderpempresa; 
	}
	
	public Erpformapago getIderpformapago() {
		if(this.iderpformapago==null)this.iderpformapago=new org.suinsit.apps.facturacin.Erpformapago();
		  return this.iderpformapago; 
	}
	
	public Erpmabnco getIderpmabnco() {
		if(this.iderpmabnco==null)this.iderpmabnco=new org.suinsit.apps.facturacin.Erpmabnco();
		  return this.iderpmabnco; 
	}
	
	public Cmpestadofact getIdcmpestadofact() {
		if(this.idcmpestadofact==null)this.idcmpestadofact=new org.suinsit.apps.compras.Cmpestadofact();
		  return this.idcmpestadofact; 
	}
	
	public Mrpincoterms getIdmrpincoterms() {
		if(this.idmrpincoterms==null)this.idmrpincoterms=new org.suinsit.apps.mrp.Mrpincoterms();
		  return this.idmrpincoterms; 
	}
	
	public List<Cmprlineaped> getSubcmprlineaped() {
		if(this.subcmprlineaped==null)this.subcmprlineaped=new ArrayList<>(0);
		  return this.subcmprlineaped; 
	} 

}