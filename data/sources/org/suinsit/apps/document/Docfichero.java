package org.suinsit.apps.document;

import java.io.Serializable;
import java.lang.Integer;
import java.lang.Long;
import java.lang.Object;
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
import org.suinsit.apps.admin.Ssousuario;
import org.suinsit.apps.asesor4.Notificacion;
import org.suinsit.apps.asesor4.Sacticket;
import org.suinsit.apps.contratos.Crtmcontrato;
import org.suinsit.apps.crm.Crmempresa;
import org.suinsit.apps.crm.Crmoportunidad;
import org.suinsit.apps.crm.Crmrdocemp;
import org.suinsit.apps.crm.Crmropodocs;
import org.suinsit.apps.document.Doccatalogo;
import org.suinsit.apps.document.Docrlinks;
import org.suinsit.apps.document.Doctipodocum;
import org.suinsit.apps.expedientes.Gexractuadoc;
import org.suinsit.apps.portalcli.Pclirdocemp;
import org.suinsit.apps.portalemp.Rrhempleado;
import org.suinsit.apps.portalemp.Rrhhrempcontra;
import org.suinsit.apps.portalemp.Rrhrempdoc;
import org.suinsit.apps.subvenciones.Subrnotidoc;
import org.suinsit.apps.subvenciones.Subrsoldoc;
import org.suinsit.apps.subvenciones.Subrsubdoc;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table (
	name = "DOCFICHERO" 
)
@Entidad (
	namespace = "document",
	type = "TABLE",
	name = "DOCFICHERO",
	labelMonitor = "NAMEFILE",
	pk = "idxdocfichero" 
)
public class Docfichero implements Serializable { 

	private static final long serialVersionUID = 1L;
	@NotNull
	@NotBlank
	@Column (
		name = "alta",
		nullable = false 
	)
	@Field (
		criteria = true,
		auditar = false,
		filter = true,
		label = "",
		type = "TIMESTAMP" 
	)
	private Timestamp alta;
	@Column (
		name = "baja",
		nullable = true 
	)
	@Field (
		criteria = true,
		auditar = false,
		filter = true,
		label = "",
		type = "BOOLEAN" 
	)
	private boolean baja;
	@Size (
		min = 0,
		max = 100 
	)
	@Column (
		name = "couseralta",
		nullable = true 
	)
	@Field (
		criteria = false,
		auditar = false,
		filter = true,
		type = "VARCHAR" 
	)
	private String couseralta;
	@Size (
		min = 0,
		max = 100 
	)
	@Column (
		name = "cousermodif",
		nullable = true 
	)
	@Field (
		criteria = false,
		auditar = false,
		filter = true,
		type = "VARCHAR" 
	)
	private String cousermodif;
	@Size (
		min = 0,
		max = 300 
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
		max = 100 
	)
	@Column (
		name = "documento",
		nullable = true 
	)
	@Field (
		criteria = true,
		auditar = false,
		filter = true,
		label = "",
		type = "VARCHAR" 
	)
	private String documento;
	@Column (
		name = "file",
		nullable = true 
	)
	@Field (
		criteria = true,
		auditar = false,
		filter = true,
		label = "",
		type = "BLOB" 
	)
	private Object file;
	@Size (
		min = 0,
		max = 16 
	)
	@Column (
		name = "idtupla",
		nullable = true 
	)
	@Field (
		criteria = true,
		auditar = false,
		filter = true,
		label = "",
		type = "DECIMAL" 
	)
	private BigDecimal idtupla;
	@Id
	@Column (
		name = "idxdocfichero",
		nullable = true 
	)
	@Field (
		criteria = false,
		auditar = false,
		filter = true,
		type = "LONG" 
	)
	private Long idxdocfichero;
	@Column (
		name = "lectura",
		nullable = true 
	)
	@Field (
		criteria = true,
		auditar = false,
		filter = true,
		label = "",
		type = "TIMESTAMP" 
	)
	private Timestamp lectura;
	@Column (
		name = "locked",
		nullable = true 
	)
	@Field (
		criteria = true,
		auditar = false,
		filter = true,
		label = "",
		type = "BOOLEAN" 
	)
	private boolean locked;
	@Size (
		min = 0,
		max = 100 
	)
	@Column (
		name = "mes",
		nullable = true 
	)
	@Field (
		criteria = true,
		auditar = false,
		filter = true,
		label = "",
		type = "VARCHAR" 
	)
	private String mes;
	@Column (
		name = "modificado",
		nullable = true 
	)
	@Field (
		criteria = true,
		auditar = false,
		filter = true,
		label = "",
		type = "TIMESTAMP" 
	)
	private Timestamp modificado;
	@Size (
		min = 0,
		max = 100 
	)
	@Column (
		name = "modulo",
		nullable = true 
	)
	@Field (
		criteria = true,
		auditar = false,
		filter = true,
		label = "",
		type = "VARCHAR" 
	)
	private String modulo;
	@Column (
		name = "mostrarportal",
		nullable = true 
	)
	@Field (
		criteria = true,
		auditar = false,
		filter = true,
		label = "",
		type = "BOOLEAN" 
	)
	private boolean mostrarportal;
	@Size (
		min = 0,
		max = 300 
	)
	@Column (
		name = "namefile",
		nullable = true 
	)
	@Field (
		criteria = true,
		auditar = false,
		filter = true,
		label = "",
		type = "VARCHAR" 
	)
	private String namefile;
	@Size (
		min = 0,
		max = 500 
	)
	@Column (
		name = "path",
		nullable = true 
	)
	@Field (
		criteria = true,
		auditar = false,
		filter = true,
		label = "",
		type = "VARCHAR" 
	)
	private String path;
	@Size (
		min = 0,
		max = 100 
	)
	@Column (
		name = "periodo",
		nullable = true 
	)
	@Field (
		criteria = true,
		auditar = false,
		filter = true,
		label = "",
		type = "VARCHAR" 
	)
	private String periodo;
	@Column (
		name = "privado",
		nullable = true 
	)
	@Field (
		criteria = true,
		auditar = false,
		filter = true,
		label = "",
		type = "BOOLEAN" 
	)
	private boolean privado;
	@Column (
		name = "size",
		nullable = true 
	)
	@Field (
		criteria = true,
		auditar = false,
		filter = true,
		label = "",
		type = "INTEGER" 
	)
	private Integer size;
	@Size (
		min = 0,
		max = 100 
	)
	@Column (
		name = "tipomime",
		nullable = true 
	)
	@Field (
		criteria = true,
		auditar = false,
		filter = true,
		label = "",
		type = "VARCHAR" 
	)
	private String tipomime;
	@Column (
		name = "tmalta",
		nullable = true 
	)
	@Field (
		criteria = false,
		auditar = false,
		filter = true,
		type = "VARCHAR" 
	)
	private String tmalta;
	@Column (
		name = "tmmodif",
		nullable = true 
	)
	@Field (
		criteria = false,
		auditar = false,
		filter = true,
		type = "VARCHAR" 
	)
	private String tmmodif;
	@Column (
		name = "year",
		nullable = true 
	)
	@Field (
		criteria = true,
		auditar = false,
		filter = true,
		label = "",
		type = "INTEGER" 
	)
	private Integer year;
	private boolean updatable;
	@ManyToOne (
		fetch = javax.persistence.FetchType.LAZY 
	)
	@JoinColumn (
		name = "IDDOCTIPODOCUM0",
		referencedColumnName = "IDXDOCTIPODOCUM",
		nullable = true,
		insertable = true,
		updatable = true 
	)
	private Doctipodocum iddoctipodocum;
	@ManyToOne (
		fetch = javax.persistence.FetchType.LAZY 
	)
	@JoinColumn (
		name = "IDPROPIETARIO0",
		referencedColumnName = "IDXSSOUSUARIO",
		nullable = true,
		insertable = true,
		updatable = true 
	)
	private Ssousuario idpropietario;
	@ManyToOne (
		fetch = javax.persistence.FetchType.LAZY 
	)
	@JoinColumn (
		name = "IDUSUARIOBLOCK0",
		referencedColumnName = "IDXSSOUSUARIO",
		nullable = true,
		insertable = true,
		updatable = true 
	)
	private Ssousuario idusuarioblock;
	@ManyToOne (
		fetch = javax.persistence.FetchType.LAZY 
	)
	@JoinColumn (
		name = "IDDOCCATALOGO0",
		referencedColumnName = "IDXDOCCATALOGO",
		nullable = true,
		insertable = true,
		updatable = true 
	)
	private Doccatalogo iddoccatalogo;
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
		name = "IDCRMOPORTUNIDAD0",
		referencedColumnName = "IDXOPORTUNIDAD",
		nullable = true,
		insertable = true,
		updatable = true 
	)
	private Crmoportunidad idcrmoportunidad;
	@ManyToOne (
		fetch = javax.persistence.FetchType.LAZY 
	)
	@JoinColumn (
		name = "IDSACTICKET0",
		referencedColumnName = "IDXTICKET",
		nullable = true,
		insertable = true,
		updatable = true 
	)
	private Sacticket idsacticket;
	@ManyToOne (
		fetch = javax.persistence.FetchType.LAZY 
	)
	@JoinColumn (
		name = "IDRRHEMPLEADO0",
		referencedColumnName = "IDXRRHEMPLEADO",
		nullable = true,
		insertable = true,
		updatable = true 
	)
	private Rrhempleado idrrhempleado;
	@ManyToOne (
		fetch = javax.persistence.FetchType.LAZY 
	)
	@JoinColumn (
		name = "IDNOTNOTIFICACION0",
		referencedColumnName = "IDXNOTIFICACION",
		nullable = true,
		insertable = true,
		updatable = true 
	)
	private Notificacion idnotnotificacion;
	@ManyToOne (
		fetch = javax.persistence.FetchType.LAZY 
	)
	@JoinColumn (
		name = "IDCRTMCONTRATO0",
		referencedColumnName = "IDXCRTMCONTRATO",
		nullable = true,
		insertable = true,
		updatable = true 
	)
	private Crtmcontrato idcrtmcontrato;
	@OneToMany (
		cascade = javax.persistence.CascadeType.ALL,
		mappedBy = "iddocfichero" 
	)
	private List<Crmropodocs> subcrmropodocs;
	@OneToMany (
		cascade = javax.persistence.CascadeType.ALL,
		mappedBy = "iddocfichero" 
	)
	private List<Crmrdocemp> subcrmrdocemp;
	@OneToMany (
		cascade = javax.persistence.CascadeType.ALL,
		mappedBy = "iddocfichero" 
	)
	private List<Pclirdocemp> subrrhhrdocemp;
	@OneToMany (
		cascade = javax.persistence.CascadeType.ALL,
		mappedBy = "iddocfichero" 
	)
	private List<Subrsoldoc> subsubrsoldoc;
	@OneToMany (
		cascade = javax.persistence.CascadeType.ALL,
		mappedBy = "iddocfichero" 
	)
	private List<Subrnotidoc> subsubrnotidoc;
	@OneToMany (
		cascade = javax.persistence.CascadeType.ALL,
		mappedBy = "iddocfichero" 
	)
	private List<Subrsubdoc> subsubrsubdoc;
	@OneToMany (
		cascade = javax.persistence.CascadeType.ALL,
		mappedBy = "iddocfichero" 
	)
	private List<Rrhhrempcontra> subrrhhrempcontra;
	@OneToMany (
		cascade = javax.persistence.CascadeType.ALL,
		mappedBy = "iddocfichero" 
	)
	private List<Rrhrempdoc> subrrhrempdoc;
	@OneToMany (
		cascade = javax.persistence.CascadeType.ALL,
		mappedBy = "iddocfichero" 
	)
	private List<Docrlinks> subdocrlinks;
	@OneToMany (
		cascade = javax.persistence.CascadeType.ALL,
		mappedBy = "iddocfichero" 
	)
	private List<Gexractuadoc> subgexractuadoc; 

	public Doctipodocum getIddoctipodocum() {
		if(this.iddoctipodocum==null)this.iddoctipodocum=new org.suinsit.apps.document.Doctipodocum();
		  return this.iddoctipodocum; 
	}
	
	public Ssousuario getIdpropietario() {
		if(this.idpropietario==null)this.idpropietario=new org.suinsit.apps.admin.Ssousuario();
		  return this.idpropietario; 
	}
	
	public Ssousuario getIdusuarioblock() {
		if(this.idusuarioblock==null)this.idusuarioblock=new org.suinsit.apps.admin.Ssousuario();
		  return this.idusuarioblock; 
	}
	
	public Doccatalogo getIddoccatalogo() {
		if(this.iddoccatalogo==null)this.iddoccatalogo=new org.suinsit.apps.document.Doccatalogo();
		  return this.iddoccatalogo; 
	}
	
	public Crmempresa getIdcrmempresa() {
		if(this.idcrmempresa==null)this.idcrmempresa=new org.suinsit.apps.crm.Crmempresa();
		  return this.idcrmempresa; 
	}
	
	public Crmoportunidad getIdcrmoportunidad() {
		if(this.idcrmoportunidad==null)this.idcrmoportunidad=new org.suinsit.apps.crm.Crmoportunidad();
		  return this.idcrmoportunidad; 
	}
	
	public Sacticket getIdsacticket() {
		if(this.idsacticket==null)this.idsacticket=new org.suinsit.apps.asesor4.Sacticket();
		  return this.idsacticket; 
	}
	
	public Rrhempleado getIdrrhempleado() {
		if(this.idrrhempleado==null)this.idrrhempleado=new org.suinsit.apps.portalemp.Rrhempleado();
		  return this.idrrhempleado; 
	}
	
	public Notificacion getIdnotnotificacion() {
		if(this.idnotnotificacion==null)this.idnotnotificacion=new org.suinsit.apps.asesor4.Notificacion();
		  return this.idnotnotificacion; 
	}
	
	public Crtmcontrato getIdcrtmcontrato() {
		if(this.idcrtmcontrato==null)this.idcrtmcontrato=new org.suinsit.apps.contratos.Crtmcontrato();
		  return this.idcrtmcontrato; 
	}
	
	public List<Crmropodocs> getSubcrmropodocs() {
		if(this.subcrmropodocs==null)this.subcrmropodocs=new ArrayList<>(0);
		  return this.subcrmropodocs; 
	}
	
	public List<Crmrdocemp> getSubcrmrdocemp() {
		if(this.subcrmrdocemp==null)this.subcrmrdocemp=new ArrayList<>(0);
		  return this.subcrmrdocemp; 
	}
	
	public List<Pclirdocemp> getSubrrhhrdocemp() {
		if(this.subrrhhrdocemp==null)this.subrrhhrdocemp=new ArrayList<>(0);
		  return this.subrrhhrdocemp; 
	}
	
	public List<Subrsoldoc> getSubsubrsoldoc() {
		if(this.subsubrsoldoc==null)this.subsubrsoldoc=new ArrayList<>(0);
		  return this.subsubrsoldoc; 
	}
	
	public List<Subrnotidoc> getSubsubrnotidoc() {
		if(this.subsubrnotidoc==null)this.subsubrnotidoc=new ArrayList<>(0);
		  return this.subsubrnotidoc; 
	}
	
	public List<Subrsubdoc> getSubsubrsubdoc() {
		if(this.subsubrsubdoc==null)this.subsubrsubdoc=new ArrayList<>(0);
		  return this.subsubrsubdoc; 
	}
	
	public List<Rrhhrempcontra> getSubrrhhrempcontra() {
		if(this.subrrhhrempcontra==null)this.subrrhhrempcontra=new ArrayList<>(0);
		  return this.subrrhhrempcontra; 
	}
	
	public List<Rrhrempdoc> getSubrrhrempdoc() {
		if(this.subrrhrempdoc==null)this.subrrhrempdoc=new ArrayList<>(0);
		  return this.subrrhrempdoc; 
	}
	
	public List<Docrlinks> getSubdocrlinks() {
		if(this.subdocrlinks==null)this.subdocrlinks=new ArrayList<>(0);
		  return this.subdocrlinks; 
	}
	
	public List<Gexractuadoc> getSubgexractuadoc() {
		if(this.subgexractuadoc==null)this.subgexractuadoc=new ArrayList<>(0);
		  return this.subgexractuadoc; 
	} 

}