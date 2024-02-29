package org.suinsit.apps.compras;

import java.io.Serializable;
import java.lang.Long;
import java.lang.String;
import java.math.BigDecimal;
import java.sql.Timestamp;
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
import org.enartframework.nocode.annotacion.Sequence;
import org.suinsit.apps.compras.Cmpfactura;
import org.suinsit.apps.compras.Cmplinearecepcion;
import org.suinsit.apps.compras.Cmpproveedor;
import org.suinsit.apps.compras.Cmprecepcion;
import org.suinsit.apps.compras.Cmprlineaped;
import org.suinsit.apps.facturacin.Erpempresa;
import org.suinsit.apps.facturacin.Erpformapago;
import org.suinsit.apps.facturacin.Erpimpuestos;
import org.suinsit.apps.mrp.Mrpincoterms;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table (
	name = "CMPPEDIDO" 
)
@Entidad (
	namespace = "compras",
	type = "TABLE",
	name = "CMPPEDIDO",
	labelMonitor = "PEDIDO",
	pk = "idxcmppedido" 
)
public class Cmppedido implements Serializable { 

	private static final long serialVersionUID = 1L;
	@Size (
		min = 0,
		max = 100 
	)
	@Column (
		name = "docorigen",
		nullable = true 
	)
	@Field (
		criteria = true,
		auditar = false,
		filter = true,
		label = "",
		type = "VARCHAR" 
	)
	private String docorigen;
	@Column (
		name = "fecconfirm",
		nullable = true 
	)
	@Field (
		criteria = true,
		auditar = false,
		filter = true,
		label = "",
		type = "TIMESTAMP" 
	)
	private Timestamp fecconfirm;
	@Column (
		name = "fecentrega",
		nullable = true 
	)
	@Field (
		criteria = true,
		auditar = false,
		filter = true,
		label = "",
		type = "TIMESTAMP" 
	)
	private Timestamp fecentrega;
	@Column (
		name = "fecrecepcion",
		nullable = true 
	)
	@Field (
		criteria = true,
		auditar = false,
		filter = true,
		label = "",
		type = "TIMESTAMP" 
	)
	private Timestamp fecrecepcion;
	@Id
	@Column (
		name = "idxcmppedido",
		nullable = true 
	)
	@Field (
		criteria = false,
		auditar = false,
		filter = true,
		type = "LONG" 
	)
	private Long idxcmppedido;
	@Size (
		min = 0,
		max = 16 
	)
	@Column (
		name = "importerecargo",
		nullable = true 
	)
	@Field (
		criteria = true,
		auditar = false,
		filter = true,
		label = "",
		type = "DECIMAL" 
	)
	private BigDecimal importerecargo;
	@Size (
		min = 0,
		max = 16 
	)
	@Column (
		name = "importereten",
		nullable = true 
	)
	@Field (
		criteria = true,
		auditar = false,
		filter = true,
		label = "",
		type = "DECIMAL" 
	)
	private BigDecimal importereten;
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
	@NotNull
	@NotBlank
	@Size (
		min = 0,
		max = 100 
	)
	@Column (
		name = "pedido",
		nullable = false 
	)
	@Field (
		criteria = true,
		auditar = false,
		filter = true,
		label = "",
		type = "SEQUENCE_PREFIX" 
	)
	@Sequence (
		name = "CMPPEDIDO_PEDIDO",
		prefix = "",
		mask = "000000",
		addYear = true 
	)
	private String pedido;
	@Column (
		name = "pedirconfirm",
		nullable = true 
	)
	@Field (
		criteria = true,
		auditar = false,
		filter = true,
		label = "",
		type = "BOOLEAN" 
	)
	private boolean pedirconfirm;
	@Size (
		min = 0,
		max = 100 
	)
	@Column (
		name = "refproveedor",
		nullable = true 
	)
	@Field (
		criteria = true,
		auditar = false,
		filter = true,
		label = "",
		type = "VARCHAR" 
	)
	private String refproveedor;
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
		max = 100 
	)
	@Column (
		name = "ubincoterm",
		nullable = true 
	)
	@Field (
		criteria = true,
		auditar = false,
		filter = true,
		label = "",
		type = "VARCHAR" 
	)
	private String ubincoterm;
	private boolean updatable;
	@ManyToOne (
		fetch = javax.persistence.FetchType.LAZY 
	)
	@JoinColumn (
		name = "IDERPIMPUESTOS0",
		referencedColumnName = "IDXERPIMPUESTOS",
		nullable = true,
		insertable = true,
		updatable = true 
	)
	private Erpimpuestos iderpimpuestos;
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
		name = "IDMRPINCOTERMS0",
		referencedColumnName = "IDXMRPINCOTERMS",
		nullable = true,
		insertable = true,
		updatable = true 
	)
	private Mrpincoterms idmrpincoterms;
	@OneToMany (
		cascade = javax.persistence.CascadeType.ALL,
		mappedBy = "idcmppedido" 
	)
	private List<Cmprecepcion> subcmprecepcion;
	@OneToMany (
		cascade = javax.persistence.CascadeType.ALL,
		mappedBy = "idcmppedido" 
	)
	private List<Cmpfactura> subcmpfactura;
	@OneToMany (
		cascade = javax.persistence.CascadeType.ALL,
		mappedBy = "idcmppedido" 
	)
	private List<Cmprlineaped> subcmprlineaped;
	@OneToMany (
		cascade = javax.persistence.CascadeType.ALL,
		mappedBy = "idcmppedido" 
	)
	private List<Cmplinearecepcion> subcmplinearecepcion; 

	public Erpimpuestos getIderpimpuestos() {
		if(this.iderpimpuestos==null)this.iderpimpuestos=new org.suinsit.apps.facturacin.Erpimpuestos();
		  return this.iderpimpuestos; 
	}
	
	public Erpformapago getIderpformapago() {
		if(this.iderpformapago==null)this.iderpformapago=new org.suinsit.apps.facturacin.Erpformapago();
		  return this.iderpformapago; 
	}
	
	public Erpempresa getIderpempresa() {
		if(this.iderpempresa==null)this.iderpempresa=new org.suinsit.apps.facturacin.Erpempresa();
		  return this.iderpempresa; 
	}
	
	public Cmpproveedor getIdcmpproveedor() {
		if(this.idcmpproveedor==null)this.idcmpproveedor=new org.suinsit.apps.compras.Cmpproveedor();
		  return this.idcmpproveedor; 
	}
	
	public Mrpincoterms getIdmrpincoterms() {
		if(this.idmrpincoterms==null)this.idmrpincoterms=new org.suinsit.apps.mrp.Mrpincoterms();
		  return this.idmrpincoterms; 
	}
	
	public List<Cmprecepcion> getSubcmprecepcion() {
		if(this.subcmprecepcion==null)this.subcmprecepcion=new ArrayList<>(0);
		  return this.subcmprecepcion; 
	}
	
	public List<Cmpfactura> getSubcmpfactura() {
		if(this.subcmpfactura==null)this.subcmpfactura=new ArrayList<>(0);
		  return this.subcmpfactura; 
	}
	
	public List<Cmprlineaped> getSubcmprlineaped() {
		if(this.subcmprlineaped==null)this.subcmprlineaped=new ArrayList<>(0);
		  return this.subcmprlineaped; 
	}
	
	public List<Cmplinearecepcion> getSubcmplinearecepcion() {
		if(this.subcmplinearecepcion==null)this.subcmplinearecepcion=new ArrayList<>(0);
		  return this.subcmplinearecepcion; 
	} 

}