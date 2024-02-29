package org.suinsit.apps.compras;

import java.io.Serializable;
import java.lang.Long;
import java.lang.String;
import java.math.BigDecimal;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.Size;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.enartframework.nocode.annotacion.Entidad;
import org.enartframework.nocode.annotacion.Field;
import org.suinsit.apps.compras.Cmpfactura;
import org.suinsit.apps.compras.Cmppedido;
import org.suinsit.apps.compras.Cmptarprovprod;
import org.suinsit.apps.facturacin.Erpimpuestos;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table (
	name = "CMPRLINEAPED" 
)
@Entidad (
	namespace = "compras",
	type = "TABLE",
	name = "CMPRLINEAPED",
	labelMonitor = "",
	pk = "idxcmprlineaped" 
)
public class Cmprlineaped implements Serializable { 

	private static final long serialVersionUID = 1L;
	@Size (
		min = 0,
		max = 100 
	)
	@Column (
		name = "descripcion",
		nullable = true 
	)
	@Field (
		criteria = true,
		auditar = false,
		filter = true,
		label = "",
		type = "VARCHAR" 
	)
	private String descripcion;
	@Size (
		min = 0,
		max = 16 
	)
	@Column (
		name = "descuento",
		nullable = true 
	)
	@Field (
		criteria = true,
		auditar = false,
		filter = true,
		label = "",
		type = "DECIMAL" 
	)
	private BigDecimal descuento;
	@Id
	@Column (
		name = "idxcmprlineaped",
		nullable = true 
	)
	@Field (
		criteria = false,
		auditar = false,
		filter = true,
		type = "LONG" 
	)
	private Long idxcmprlineaped;
	@Size (
		min = 0,
		max = 16 
	)
	@Column (
		name = "impuesto",
		nullable = true 
	)
	@Field (
		criteria = true,
		auditar = false,
		filter = true,
		label = "",
		type = "DECIMAL" 
	)
	private BigDecimal impuesto;
	@Size (
		min = 0,
		max = 300 
	)
	@Column (
		name = "nota",
		nullable = true 
	)
	@Field (
		criteria = true,
		auditar = false,
		filter = true,
		label = "",
		type = "VARCHAR" 
	)
	private String nota;
	@Size (
		min = 0,
		max = 16 
	)
	@Column (
		name = "precio",
		nullable = true 
	)
	@Field (
		criteria = true,
		auditar = false,
		filter = true,
		label = "",
		type = "DECIMAL" 
	)
	private BigDecimal precio;
	@Size (
		min = 0,
		max = 300 
	)
	@Column (
		name = "seccion",
		nullable = true 
	)
	@Field (
		criteria = true,
		auditar = false,
		filter = true,
		label = "",
		type = "VARCHAR" 
	)
	private String seccion;
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
		name = "unidades",
		nullable = true 
	)
	@Field (
		criteria = true,
		auditar = false,
		filter = true,
		label = "",
		type = "DECIMAL" 
	)
	private BigDecimal unidades;
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
		name = "IDCMPTARPROVPROD0",
		referencedColumnName = "IDXCMPTARPROVPROD",
		nullable = true,
		insertable = true,
		updatable = true 
	)
	private Cmptarprovprod idcmptarprovprod;
	@ManyToOne (
		fetch = javax.persistence.FetchType.LAZY 
	)
	@JoinColumn (
		name = "IDCMPFACTURA0",
		referencedColumnName = "IDXCMPFACTURA",
		nullable = true,
		insertable = true,
		updatable = true 
	)
	private Cmpfactura idcmpfactura; 

	public Erpimpuestos getIderpimpuestos() {
		if(this.iderpimpuestos==null)this.iderpimpuestos=new org.suinsit.apps.facturacin.Erpimpuestos();
		  return this.iderpimpuestos; 
	}
	
	public Cmppedido getIdcmppedido() {
		if(this.idcmppedido==null)this.idcmppedido=new org.suinsit.apps.compras.Cmppedido();
		  return this.idcmppedido; 
	}
	
	public Cmptarprovprod getIdcmptarprovprod() {
		if(this.idcmptarprovprod==null)this.idcmptarprovprod=new org.suinsit.apps.compras.Cmptarprovprod();
		  return this.idcmptarprovprod; 
	}
	
	public Cmpfactura getIdcmpfactura() {
		if(this.idcmpfactura==null)this.idcmpfactura=new org.suinsit.apps.compras.Cmpfactura();
		  return this.idcmpfactura; 
	} 

}