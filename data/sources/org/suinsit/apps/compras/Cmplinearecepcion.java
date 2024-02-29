package org.suinsit.apps.compras;

import java.io.Serializable;
import java.lang.Long;
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
import org.suinsit.apps.compras.Cmppedido;
import org.suinsit.apps.compras.Cmprecepcion;
import org.suinsit.apps.compras.Cmptarprovprod;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table (
	name = "CMPLINEARECEPCION" 
)
@Entidad (
	namespace = "compras",
	type = "TABLE",
	name = "CMPLINEARECEPCION",
	labelMonitor = "",
	pk = "idxcmplinearecepcion" 
)
public class Cmplinearecepcion implements Serializable { 

	private static final long serialVersionUID = 1L;
	@Size (
		min = 0,
		max = 16 
	)
	@Column (
		name = "demandada",
		nullable = true 
	)
	@Field (
		criteria = true,
		auditar = false,
		filter = true,
		label = "",
		type = "DECIMAL" 
	)
	private BigDecimal demandada;
	@Id
	@Column (
		name = "idxcmplinearecepcion",
		nullable = true 
	)
	@Field (
		criteria = false,
		auditar = false,
		filter = true,
		type = "LONG" 
	)
	private Long idxcmplinearecepcion;
	@Size (
		min = 0,
		max = 16 
	)
	@Column (
		name = "recibida",
		nullable = true 
	)
	@Field (
		criteria = true,
		auditar = false,
		filter = true,
		label = "",
		type = "DECIMAL" 
	)
	private BigDecimal recibida;
	private boolean updatable;
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
		name = "IDCMPRECEPCION0",
		referencedColumnName = "IDXCMPRECEPCION",
		nullable = true,
		insertable = true,
		updatable = true 
	)
	private Cmprecepcion idcmprecepcion; 

	public Cmppedido getIdcmppedido() {
		if(this.idcmppedido==null)this.idcmppedido=new org.suinsit.apps.compras.Cmppedido();
		  return this.idcmppedido; 
	}
	
	public Cmptarprovprod getIdcmptarprovprod() {
		if(this.idcmptarprovprod==null)this.idcmptarprovprod=new org.suinsit.apps.compras.Cmptarprovprod();
		  return this.idcmptarprovprod; 
	}
	
	public Cmprecepcion getIdcmprecepcion() {
		if(this.idcmprecepcion==null)this.idcmprecepcion=new org.suinsit.apps.compras.Cmprecepcion();
		  return this.idcmprecepcion; 
	} 

}