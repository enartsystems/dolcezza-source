package org.suinsit.apps.compras;

import java.io.Serializable;
import java.lang.Long;
import java.lang.String;
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
import org.suinsit.apps.admin.Ssousuario;
import org.suinsit.apps.compras.Cmplinearecepcion;
import org.suinsit.apps.compras.Cmppedido;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table (
	name = "CMPRECEPCION" 
)
@Entidad (
	namespace = "compras",
	type = "TABLE",
	name = "CMPRECEPCION",
	labelMonitor = "CODIGO",
	pk = "idxcmprecepcion" 
)
public class Cmprecepcion implements Serializable { 

	private static final long serialVersionUID = 1L;
	@NotNull
	@NotBlank
	@Size (
		min = 0,
		max = 100 
	)
	@Column (
		name = "codigo",
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
		name = "CMPRECEPCION_CODIGO",
		prefix = "IN",
		mask = "00000000",
		addYear = true 
	)
	private String codigo;
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
		name = "feclimite",
		nullable = true 
	)
	@Field (
		criteria = true,
		auditar = false,
		filter = true,
		label = "",
		type = "TIMESTAMP" 
	)
	private Timestamp feclimite;
	@Column (
		name = "fecprevista",
		nullable = true 
	)
	@Field (
		criteria = true,
		auditar = false,
		filter = true,
		label = "",
		type = "TIMESTAMP" 
	)
	private Timestamp fecprevista;
	@Id
	@Column (
		name = "idxcmprecepcion",
		nullable = true 
	)
	@Field (
		criteria = false,
		auditar = false,
		filter = true,
		type = "LONG" 
	)
	private Long idxcmprecepcion;
	@Column (
		name = "nota",
		nullable = true 
	)
	@Field (
		criteria = true,
		auditar = false,
		filter = true,
		label = "",
		type = "CLOB" 
	)
	private String nota;
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
		name = "IDSSOUSUARIO0",
		referencedColumnName = "IDXSSOUSUARIO",
		nullable = true,
		insertable = true,
		updatable = true 
	)
	private Ssousuario idssousuario;
	@OneToMany (
		cascade = javax.persistence.CascadeType.ALL,
		mappedBy = "idcmprecepcion" 
	)
	private List<Cmplinearecepcion> subcmplinearecepcion; 

	public Cmppedido getIdcmppedido() {
		if(this.idcmppedido==null)this.idcmppedido=new org.suinsit.apps.compras.Cmppedido();
		  return this.idcmppedido; 
	}
	
	public Ssousuario getIdssousuario() {
		if(this.idssousuario==null)this.idssousuario=new org.suinsit.apps.admin.Ssousuario();
		  return this.idssousuario; 
	}
	
	public List<Cmplinearecepcion> getSubcmplinearecepcion() {
		if(this.subcmplinearecepcion==null)this.subcmplinearecepcion=new ArrayList<>(0);
		  return this.subcmplinearecepcion; 
	} 

}