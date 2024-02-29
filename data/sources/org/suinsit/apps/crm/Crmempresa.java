package org.suinsit.apps.crm;

import java.io.Serializable;
import java.lang.Integer;
import java.lang.Long;
import java.lang.Object;
import java.lang.String;
import java.math.BigDecimal;
import java.sql.Date;
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
import org.enartframework.nocode.annotacion.AutoGenerate;
import org.enartframework.nocode.annotacion.Entidad;
import org.enartframework.nocode.annotacion.Field;
import org.enartframework.nocode.annotacion.FieldType;
import org.enartframework.nocode.annotacion.ValidEnum;
import org.suinsit.apps.admin.Mactividad;
import org.suinsit.apps.admin.Mpais;
import org.suinsit.apps.admin.Mprovincia;
import org.suinsit.apps.admin.Mtipoempresa;
import org.suinsit.apps.admin.Ssousuario;
import org.suinsit.apps.compras.Cmpproveedor;
import org.suinsit.apps.contratos.Crtmcontrato;
import org.suinsit.apps.crm.Crmcontacto;
import org.suinsit.apps.crm.Crmdireccion;
import org.suinsit.apps.crm.Crmllamada;
import org.suinsit.apps.crm.Crmnota;
import org.suinsit.apps.crm.Crmoportunidad;
import org.suinsit.apps.crm.Crmrcontacempresa;
import org.suinsit.apps.crm.Crmrdocemp;
import org.suinsit.apps.crm.Crmrempuser;
import org.suinsit.apps.crm.Crmroporemp;
import org.suinsit.apps.crm.Crmtarea;
import org.suinsit.apps.document.Docfichero;
import org.suinsit.apps.facility.Ftsmcentros;
import org.suinsit.apps.facturacin.Erpfactura;
import org.suinsit.apps.facturacin.Erpfacturae;
import org.suinsit.apps.facturacin.Erppedido;
import org.suinsit.apps.facturacin.Erppresupuesto;
import org.suinsit.apps.facturacli.Clicliente;
import org.suinsit.apps.facturacli.Clifactura;
import org.suinsit.apps.facturacli.Cliproducto;
import org.suinsit.apps.formularios.Formcontacto;
import org.suinsit.apps.marketing.Mktmpost;
import org.suinsit.apps.marketing.Mktrlistcustomer;
import org.suinsit.apps.marketing.Mktrssagency;
import org.suinsit.apps.mrp.Mrpexpedicion;
import org.suinsit.apps.partners.Partner;
import org.suinsit.apps.portalemp.Rrhempleado;
import org.suinsit.apps.subscripciones.Subscripcion;
import org.suinsit.apps.subvenciones.Agentedig;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table (
	name = "CRMEMPRESA" 
)
@Entidad (
	namespace = "crm",
	type = "TABLE",
	name = "CRMEMPRESA",
	labelMonitor = "EMPRESA",
	pk = "idxcrmempresa" 
)
public class Crmempresa implements Serializable { 

	private static final long serialVersionUID = 1L;
	@Column (
		name = "alta",
		nullable = true 
	)
	@Field (
		criteria = true,
		auditar = false,
		filter = false,
		label = "alta",
		type = "DATE" 
	)
	private Date alta;
	@Size (
		min = 0,
		max = 100 
	)
	@Column (
		name = "apellidos",
		nullable = true 
	)
	@Field (
		criteria = true,
		auditar = false,
		filter = true,
		label = "",
		type = "VARCHAR" 
	)
	private String apellidos;
	@Column (
		name = "avatar",
		nullable = true 
	)
	@Field (
		criteria = true,
		auditar = false,
		filter = true,
		type = "BLOB" 
	)
	private Object avatar;
	@Column (
		name = "baja",
		nullable = true 
	)
	@Field (
		criteria = true,
		auditar = false,
		filter = false,
		label = "Última Modificación",
		type = "DATE" 
	)
	private Date baja;
	@Size (
		min = 0,
		max = 100 
	)
	@Column (
		name = "cifnif",
		nullable = true 
	)
	@Field (
		criteria = true,
		auditar = false,
		filter = true,
		label = "NIF",
		type = "VARCHAR" 
	)
	private String cifnif;
	@Size (
		min = 0,
		max = 100 
	)
	@Column (
		name = "ciudad",
		nullable = true 
	)
	@Field (
		criteria = true,
		auditar = false,
		filter = true,
		label = "ciudad",
		type = "VARCHAR" 
	)
	private String ciudad;
	@Size (
		min = 0,
		max = 100 
	)
	@Column (
		name = "codeuuid",
		nullable = true 
	)
	@Field (
		criteria = true,
		auditar = false,
		filter = true,
		label = "",
		type = "VARCHAR" 
	)
	@AutoGenerate (
		uuid = true 
	)
	private String codeuuid;
	@Size (
		min = 0,
		max = 100 
	)
	@Column (
		name = "codpostal",
		nullable = true 
	)
	@Field (
		criteria = true,
		auditar = false,
		filter = true,
		label = "",
		type = "VARCHAR" 
	)
	private String codpostal;
	@Size (
		min = 0,
		max = 100 
	)
	@Column (
		name = "correo",
		nullable = true 
	)
	@Field (
		criteria = true,
		auditar = false,
		filter = true,
		label = "Correo / Notificaciones",
		type = "VARCHAR" 
	)
	@FieldType (
		type = FieldType.TYPEVALIDATOR.EMAIL 
	)
	private String correo;
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
		label = "Correo",
		type = "VARCHAR" 
	)
	@FieldType (
		type = FieldType.TYPEVALIDATOR.EMAIL 
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
		label = "Correo",
		type = "VARCHAR" 
	)
	@FieldType (
		type = FieldType.TYPEVALIDATOR.EMAIL 
	)
	private String cousermodif;
	@Size (
		min = 0,
		max = 100 
	)
	@Column (
		name = "direccion",
		nullable = true 
	)
	@Field (
		criteria = true,
		auditar = false,
		filter = true,
		label = "Dirección",
		type = "VARCHAR" 
	)
	private String direccion;
	@Column (
		name = "emplados",
		nullable = true 
	)
	@Field (
		criteria = true,
		auditar = false,
		filter = true,
		label = "emplados",
		type = "INTEGER" 
	)
	private Integer emplados;
	@NotNull
	@NotBlank
	@Size (
		min = 0,
		max = 100 
	)
	@Column (
		name = "empresa",
		nullable = false 
	)
	@Field (
		criteria = true,
		auditar = false,
		filter = true,
		label = "Empresa/Nombre",
		type = "VARCHAR" 
	)
	private String empresa;
	@Size (
		min = 0,
		max = 100 
	)
	@Column (
		name = "estado",
		nullable = true 
	)
	@Field (
		criteria = true,
		auditar = false,
		filter = true,
		label = "estado",
		type = "VARCHAR" 
	)
	private String estado;
	@Column (
		name = "excludecampaing",
		nullable = true 
	)
	@Field (
		criteria = true,
		auditar = false,
		filter = true,
		label = "nocampaing",
		type = "BOOLEAN" 
	)
	private boolean excludecampaing;
	@Size (
		min = 0,
		max = 16 
	)
	@Column (
		name = "facturacion",
		nullable = true 
	)
	@Field (
		criteria = true,
		auditar = false,
		filter = true,
		label = "facturación",
		type = "DECIMAL" 
	)
	private BigDecimal facturacion;
	@Size (
		min = 0,
		max = 100 
	)
	@Column (
		name = "folio",
		nullable = true 
	)
	@Field (
		criteria = true,
		auditar = false,
		filter = true,
		label = "",
		type = "VARCHAR" 
	)
	private String folio;
	@Size (
		min = 0,
		max = 100 
	)
	@Column (
		name = "idmaillist",
		nullable = true 
	)
	@Field (
		criteria = true,
		auditar = false,
		filter = true,
		label = "",
		type = "VARCHAR" 
	)
	private String idmaillist;
	@Id
	@Column (
		name = "idxcrmempresa",
		nullable = true 
	)
	@Field (
		criteria = false,
		auditar = false,
		filter = false,
		label = "emplados",
		type = "LONG" 
	)
	private Long idxcrmempresa;
	@Size (
		min = 0,
		max = 100 
	)
	@Column (
		name = "industria",
		nullable = true 
	)
	@Field (
		criteria = true,
		auditar = false,
		filter = true,
		label = "Industria",
		type = "VARCHAR" 
	)
	private String industria;
	@Size (
		min = 0,
		max = 16 
	)
	@Column (
		name = "iva",
		nullable = true 
	)
	@Field (
		criteria = true,
		auditar = false,
		filter = true,
		label = "",
		type = "DECIMAL" 
	)
	private BigDecimal iva;
	@Column (
		name = "lastactiviti",
		nullable = true 
	)
	@Field (
		criteria = true,
		auditar = false,
		filter = true,
		label = "Última Actividad",
		type = "TIMESTAMP" 
	)
	private Timestamp lastactiviti;
	@Size (
		min = 0,
		max = 150 
	)
	@ValidEnum (
		enums = {
			",WEB,RED SOCIAL,IMPORTACION,REFERENCIA,OTRO" 
		},
		message = "solamente admite lo valores: ,WEB,RED SOCIAL,IMPORTACION,REFERENCIA,OTRO" 
	)
	@Column (
		name = "origen",
		nullable = true 
	)
	@Field (
		criteria = true,
		auditar = false,
		filter = true,
		label = "",
		type = "ENUM_STRING" 
	)
	private String origen;
	@Column (
		name = "proveedor",
		nullable = true 
	)
	@Field (
		criteria = true,
		auditar = false,
		filter = true,
		label = "",
		type = "BOOLEAN" 
	)
	private boolean proveedor;
	@Size (
		min = 0,
		max = 16 
	)
	@Column (
		name = "recargoeq",
		nullable = true 
	)
	@Field (
		criteria = true,
		auditar = false,
		filter = true,
		label = "",
		type = "DECIMAL" 
	)
	private BigDecimal recargoeq;
	@Size (
		min = 0,
		max = 100 
	)
	@Column (
		name = "refidexterna",
		nullable = true 
	)
	@Field (
		criteria = true,
		auditar = false,
		filter = false,
		label = "refexterna",
		type = "VARCHAR" 
	)
	private String refidexterna;
	@Size (
		min = 0,
		max = 100 
	)
	@Column (
		name = "registro",
		nullable = true 
	)
	@Field (
		criteria = true,
		auditar = false,
		filter = true,
		label = "",
		type = "VARCHAR" 
	)
	private String registro;
	@Size (
		min = 0,
		max = 150 
	)
	@ValidEnum (
		enums = {
			",Residente,Residente UE,Extranjero" 
		},
		message = "solamente admite lo valores: ,Residente,Residente UE,Extranjero" 
	)
	@Column (
		name = "residente",
		nullable = true 
	)
	@Field (
		criteria = true,
		auditar = false,
		filter = true,
		label = "",
		type = "ENUM_STRING" 
	)
	private String residente;
	@Column (
		name = "sendemails",
		nullable = true 
	)
	@Field (
		criteria = true,
		auditar = false,
		filter = true,
		label = "Enviar emails",
		type = "BOOLEAN" 
	)
	private boolean sendemails;
	@Size (
		min = 0,
		max = 100 
	)
	@Column (
		name = "sheet",
		nullable = true 
	)
	@Field (
		criteria = true,
		auditar = false,
		filter = true,
		label = "",
		type = "VARCHAR" 
	)
	private String sheet;
	@Size (
		min = 0,
		max = 100 
	)
	@Column (
		name = "telefono",
		nullable = true 
	)
	@Field (
		criteria = true,
		auditar = false,
		filter = true,
		label = "Telefono",
		type = "VARCHAR" 
	)
	private String telefono;
	@Size (
		min = 0,
		max = 150 
	)
	@ValidEnum (
		enums = {
			",VAL01,VAL11,VAL21" 
		},
		message = "solamente admite lo valores: ,VAL01,VAL11,VAL21" 
	)
	@Column (
		name = "tipoemp",
		nullable = true 
	)
	@Field (
		criteria = true,
		auditar = false,
		filter = true,
		label = "tipoemp",
		type = "ENUM_STRING" 
	)
	private String tipoemp;
	@Size (
		min = 0,
		max = 150 
	)
	@ValidEnum (
		enums = {
			",Cliente Potencial,Socio,Partner" 
		},
		message = "solamente admite lo valores: ,Cliente Potencial,Socio,Partner" 
	)
	@Column (
		name = "tipoempre",
		nullable = true 
	)
	@Field (
		criteria = true,
		auditar = false,
		filter = true,
		label = "Tipo empresa",
		type = "ENUM_STRING" 
	)
	private String tipoempre;
	@Column (
		name = "tmalta",
		nullable = true 
	)
	@Field (
		criteria = false,
		auditar = false,
		filter = true,
		label = "Última Modificación",
		type = "DATE_TIME" 
	)
	private Date tmalta;
	@Column (
		name = "tmmodif",
		nullable = true 
	)
	@Field (
		criteria = false,
		auditar = false,
		filter = true,
		label = "Última Modificación",
		type = "DATE_TIME" 
	)
	private Date tmmodif;
	@Size (
		min = 0,
		max = 100 
	)
	@Column (
		name = "volumen",
		nullable = true 
	)
	@Field (
		criteria = true,
		auditar = false,
		filter = true,
		label = "",
		type = "VARCHAR" 
	)
	private String volumen;
	private boolean updatable;
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
		name = "IDMTIPOEMPRESA0",
		referencedColumnName = "IDXMTIPOEMPRESA",
		nullable = true,
		insertable = true,
		updatable = true 
	)
	private Mtipoempresa idmtipoempresa;
	@ManyToOne (
		fetch = javax.persistence.FetchType.LAZY 
	)
	@JoinColumn (
		name = "IDMACTIVIDAD0",
		referencedColumnName = "IDXACTIVIDAD",
		nullable = true,
		insertable = true,
		updatable = true 
	)
	private Mactividad idmactividad;
	@ManyToOne (
		fetch = javax.persistence.FetchType.LAZY 
	)
	@JoinColumn (
		name = "IDMPROVINCIA0",
		referencedColumnName = "IDX",
		nullable = true,
		insertable = true,
		updatable = true 
	)
	private Mprovincia idmprovincia;
	@ManyToOne (
		fetch = javax.persistence.FetchType.LAZY 
	)
	@JoinColumn (
		name = "IDMPAIS0",
		referencedColumnName = "IDX",
		nullable = true,
		insertable = true,
		updatable = true 
	)
	private Mpais idmpais;
	@OneToMany (
		cascade = javax.persistence.CascadeType.ALL,
		mappedBy = "idcrmempresa" 
	)
	private List<Rrhempleado> subrrhempleado;
	@OneToMany (
		cascade = javax.persistence.CascadeType.ALL,
		mappedBy = "idcrmempresa" 
	)
	private List<Docfichero> subdocfichero;
	@OneToMany (
		cascade = javax.persistence.CascadeType.ALL,
		mappedBy = "idcrmempresa" 
	)
	private List<Crmcontacto> subcrmcontacto;
	@OneToMany (
		cascade = javax.persistence.CascadeType.ALL,
		mappedBy = "idcrmempresa" 
	)
	private List<Crmdireccion> subcrmdireccion;
	@OneToMany (
		cascade = javax.persistence.CascadeType.ALL,
		mappedBy = "idcrmempresa" 
	)
	private List<Crmllamada> subcrmllamada;
	@OneToMany (
		cascade = javax.persistence.CascadeType.ALL,
		mappedBy = "idcrmempresa" 
	)
	private List<Crmnota> subcrmnota;
	@OneToMany (
		cascade = javax.persistence.CascadeType.ALL,
		mappedBy = "idcrmempresa" 
	)
	private List<Crmoportunidad> subcrmoportunidad;
	@OneToMany (
		cascade = javax.persistence.CascadeType.ALL,
		mappedBy = "idcrmempresa" 
	)
	private List<Crmrcontacempresa> subcrmrcontacempresa;
	@OneToMany (
		cascade = javax.persistence.CascadeType.ALL,
		mappedBy = "idcrmempresa" 
	)
	private List<Crmrdocemp> subcrmrdocemp;
	@OneToMany (
		cascade = javax.persistence.CascadeType.ALL,
		mappedBy = "idcrmempresa" 
	)
	private List<Crmroporemp> subcrmroporemp;
	@OneToMany (
		cascade = javax.persistence.CascadeType.ALL,
		mappedBy = "idcrmempresa" 
	)
	private List<Crmtarea> subcrmtarea;
	@OneToMany (
		cascade = javax.persistence.CascadeType.ALL,
		mappedBy = "idcliente" 
	)
	private List<Erppresupuesto> suberppresupuesto;
	@OneToMany (
		cascade = javax.persistence.CascadeType.ALL,
		mappedBy = "idcrmempresa" 
	)
	private List<Erpfactura> suberpfactura;
	@OneToMany (
		cascade = javax.persistence.CascadeType.ALL,
		mappedBy = "idcrmempresa" 
	)
	private List<Crmrempuser> subcrmrempuser;
	@OneToMany (
		cascade = javax.persistence.CascadeType.ALL,
		mappedBy = "idcustomer" 
	)
	private List<Crtmcontrato> subcrtmcontrato;
	@OneToMany (
		cascade = javax.persistence.CascadeType.ALL,
		mappedBy = "idcrmempresa" 
	)
	private List<Mktrssagency> submktrssagency;
	@OneToMany (
		cascade = javax.persistence.CascadeType.ALL,
		mappedBy = "idcrmempresa" 
	)
	private List<Mktrlistcustomer> submktrlistcustomer;
	@OneToMany (
		cascade = javax.persistence.CascadeType.ALL,
		mappedBy = "idcrmempresa" 
	)
	private List<Mktmpost> submktmpost;
	@OneToMany (
		cascade = javax.persistence.CascadeType.ALL,
		mappedBy = "idcrmempresa" 
	)
	private List<Agentedig> subagentedig;
	@OneToMany (
		cascade = javax.persistence.CascadeType.ALL,
		mappedBy = "idcrmempresa" 
	)
	private List<Partner> subpartner;
	@OneToMany (
		cascade = javax.persistence.CascadeType.ALL,
		mappedBy = "idcrmempresa" 
	)
	private List<Subscripcion> subsubscripcion;
	@OneToMany (
		cascade = javax.persistence.CascadeType.ALL,
		mappedBy = "idcrmempresa" 
	)
	private List<Clifactura> subclifactura;
	@OneToMany (
		cascade = javax.persistence.CascadeType.ALL,
		mappedBy = "idcrmempresa" 
	)
	private List<Clicliente> subclicliente;
	@OneToMany (
		cascade = javax.persistence.CascadeType.ALL,
		mappedBy = "idcrmempresa" 
	)
	private List<Cliproducto> subcliproducto;
	@OneToMany (
		cascade = javax.persistence.CascadeType.ALL,
		mappedBy = "idcrmempresa" 
	)
	private List<Erppedido> suberppedido;
	@OneToMany (
		cascade = javax.persistence.CascadeType.ALL,
		mappedBy = "idclientrega" 
	)
	private List<Mrpexpedicion> submrpexpedicion;
	@OneToMany (
		cascade = javax.persistence.CascadeType.ALL,
		mappedBy = "idcrmempresa" 
	)
	private List<Erpfacturae> suberpfacturae;
	@OneToMany (
		cascade = javax.persistence.CascadeType.ALL,
		mappedBy = "idcrmempresa" 
	)
	private List<Formcontacto> subformcontacto;
	@OneToMany (
		cascade = javax.persistence.CascadeType.ALL,
		mappedBy = "idcrmempresa" 
	)
	private List<Ftsmcentros> subftsmcentros;
	@OneToMany (
		cascade = javax.persistence.CascadeType.ALL,
		mappedBy = "idcrmempresa" 
	)
	private List<Cmpproveedor> subcmpproveedor; 

	public Ssousuario getIdpropietario() {
		if(this.idpropietario==null)this.idpropietario=new org.suinsit.apps.admin.Ssousuario();
		  return this.idpropietario; 
	}
	
	public Mtipoempresa getIdmtipoempresa() {
		if(this.idmtipoempresa==null)this.idmtipoempresa=new org.suinsit.apps.admin.Mtipoempresa();
		  return this.idmtipoempresa; 
	}
	
	public Mactividad getIdmactividad() {
		if(this.idmactividad==null)this.idmactividad=new org.suinsit.apps.admin.Mactividad();
		  return this.idmactividad; 
	}
	
	public Mprovincia getIdmprovincia() {
		if(this.idmprovincia==null)this.idmprovincia=new org.suinsit.apps.admin.Mprovincia();
		  return this.idmprovincia; 
	}
	
	public Mpais getIdmpais() {
		if(this.idmpais==null)this.idmpais=new org.suinsit.apps.admin.Mpais();
		  return this.idmpais; 
	}
	
	public List<Rrhempleado> getSubrrhempleado() {
		if(this.subrrhempleado==null)this.subrrhempleado=new ArrayList<>(0);
		  return this.subrrhempleado; 
	}
	
	public List<Docfichero> getSubdocfichero() {
		if(this.subdocfichero==null)this.subdocfichero=new ArrayList<>(0);
		  return this.subdocfichero; 
	}
	
	public List<Crmcontacto> getSubcrmcontacto() {
		if(this.subcrmcontacto==null)this.subcrmcontacto=new ArrayList<>(0);
		  return this.subcrmcontacto; 
	}
	
	public List<Crmdireccion> getSubcrmdireccion() {
		if(this.subcrmdireccion==null)this.subcrmdireccion=new ArrayList<>(0);
		  return this.subcrmdireccion; 
	}
	
	public List<Crmllamada> getSubcrmllamada() {
		if(this.subcrmllamada==null)this.subcrmllamada=new ArrayList<>(0);
		  return this.subcrmllamada; 
	}
	
	public List<Crmnota> getSubcrmnota() {
		if(this.subcrmnota==null)this.subcrmnota=new ArrayList<>(0);
		  return this.subcrmnota; 
	}
	
	public List<Crmoportunidad> getSubcrmoportunidad() {
		if(this.subcrmoportunidad==null)this.subcrmoportunidad=new ArrayList<>(0);
		  return this.subcrmoportunidad; 
	}
	
	public List<Crmrcontacempresa> getSubcrmrcontacempresa() {
		if(this.subcrmrcontacempresa==null)this.subcrmrcontacempresa=new ArrayList<>(0);
		  return this.subcrmrcontacempresa; 
	}
	
	public List<Crmrdocemp> getSubcrmrdocemp() {
		if(this.subcrmrdocemp==null)this.subcrmrdocemp=new ArrayList<>(0);
		  return this.subcrmrdocemp; 
	}
	
	public List<Crmroporemp> getSubcrmroporemp() {
		if(this.subcrmroporemp==null)this.subcrmroporemp=new ArrayList<>(0);
		  return this.subcrmroporemp; 
	}
	
	public List<Crmtarea> getSubcrmtarea() {
		if(this.subcrmtarea==null)this.subcrmtarea=new ArrayList<>(0);
		  return this.subcrmtarea; 
	}
	
	public List<Erppresupuesto> getSuberppresupuesto() {
		if(this.suberppresupuesto==null)this.suberppresupuesto=new ArrayList<>(0);
		  return this.suberppresupuesto; 
	}
	
	public List<Erpfactura> getSuberpfactura() {
		if(this.suberpfactura==null)this.suberpfactura=new ArrayList<>(0);
		  return this.suberpfactura; 
	}
	
	public List<Crmrempuser> getSubcrmrempuser() {
		if(this.subcrmrempuser==null)this.subcrmrempuser=new ArrayList<>(0);
		  return this.subcrmrempuser; 
	}
	
	public List<Crtmcontrato> getSubcrtmcontrato() {
		if(this.subcrtmcontrato==null)this.subcrtmcontrato=new ArrayList<>(0);
		  return this.subcrtmcontrato; 
	}
	
	public List<Mktrssagency> getSubmktrssagency() {
		if(this.submktrssagency==null)this.submktrssagency=new ArrayList<>(0);
		  return this.submktrssagency; 
	}
	
	public List<Mktrlistcustomer> getSubmktrlistcustomer() {
		if(this.submktrlistcustomer==null)this.submktrlistcustomer=new ArrayList<>(0);
		  return this.submktrlistcustomer; 
	}
	
	public List<Mktmpost> getSubmktmpost() {
		if(this.submktmpost==null)this.submktmpost=new ArrayList<>(0);
		  return this.submktmpost; 
	}
	
	public List<Agentedig> getSubagentedig() {
		if(this.subagentedig==null)this.subagentedig=new ArrayList<>(0);
		  return this.subagentedig; 
	}
	
	public List<Partner> getSubpartner() {
		if(this.subpartner==null)this.subpartner=new ArrayList<>(0);
		  return this.subpartner; 
	}
	
	public List<Subscripcion> getSubsubscripcion() {
		if(this.subsubscripcion==null)this.subsubscripcion=new ArrayList<>(0);
		  return this.subsubscripcion; 
	}
	
	public List<Clifactura> getSubclifactura() {
		if(this.subclifactura==null)this.subclifactura=new ArrayList<>(0);
		  return this.subclifactura; 
	}
	
	public List<Clicliente> getSubclicliente() {
		if(this.subclicliente==null)this.subclicliente=new ArrayList<>(0);
		  return this.subclicliente; 
	}
	
	public List<Cliproducto> getSubcliproducto() {
		if(this.subcliproducto==null)this.subcliproducto=new ArrayList<>(0);
		  return this.subcliproducto; 
	}
	
	public List<Erppedido> getSuberppedido() {
		if(this.suberppedido==null)this.suberppedido=new ArrayList<>(0);
		  return this.suberppedido; 
	}
	
	public List<Mrpexpedicion> getSubmrpexpedicion() {
		if(this.submrpexpedicion==null)this.submrpexpedicion=new ArrayList<>(0);
		  return this.submrpexpedicion; 
	}
	
	public List<Erpfacturae> getSuberpfacturae() {
		if(this.suberpfacturae==null)this.suberpfacturae=new ArrayList<>(0);
		  return this.suberpfacturae; 
	}
	
	public List<Formcontacto> getSubformcontacto() {
		if(this.subformcontacto==null)this.subformcontacto=new ArrayList<>(0);
		  return this.subformcontacto; 
	}
	
	public List<Ftsmcentros> getSubftsmcentros() {
		if(this.subftsmcentros==null)this.subftsmcentros=new ArrayList<>(0);
		  return this.subftsmcentros; 
	}
	
	public List<Cmpproveedor> getSubcmpproveedor() {
		if(this.subcmpproveedor==null)this.subcmpproveedor=new ArrayList<>(0);
		  return this.subcmpproveedor; 
	} 

}