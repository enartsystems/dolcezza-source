package org.suinsit.apps.admin;

import java.io.Serializable;
import java.lang.Long;
import java.lang.Object;
import java.lang.String;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
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
import org.suinsit.apps.admin.Ssoruserapp;
import org.suinsit.apps.admin.Ssoruserol;
import org.suinsit.apps.asesor4.Notificacion;
import org.suinsit.apps.asesor4.Sacticket;
import org.suinsit.apps.citaprev.Citmagenda;
import org.suinsit.apps.contratos.Crtrfirmascto;
import org.suinsit.apps.crm.Crmcontacto;
import org.suinsit.apps.crm.Crmempresa;
import org.suinsit.apps.document.Docfichero;
import org.suinsit.apps.expedientes.Gexrreqexp;
import org.suinsit.apps.facturacin.Erpfacturae;
import org.suinsit.apps.formularios.Formcontacto;
import org.suinsit.apps.mrp.Mrpmrecepcion;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table (
	name = "SSOUSUARIO" 
)
@Entidad (
	namespace = "admin",
	type = "TABLE",
	name = "SSOUSUARIO",
	labelMonitor = "Usuario",
	pk = "idxssousuario" 
)
public class Ssousuario implements Serializable { 

	private static final long serialVersionUID = 1L;
	@Column (
		name = "alta",
		nullable = true 
	)
	@Field (
		criteria = true,
		auditar = false,
		filter = true,
		label = "Fecha Alta",
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
		label = "apellidos",
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
		filter = true,
		label = "Fecha Baja",
		type = "DATE" 
	)
	private Date baja;
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
		filter = false,
		label = "apellidos",
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
		filter = false,
		label = "apellidos",
		type = "VARCHAR" 
	)
	private String cousermodif;
	@NotNull
	@NotBlank
	@Size (
		min = 0,
		max = 100 
	)
	@Column (
		name = "email",
		nullable = false 
	)
	@Field (
		criteria = true,
		auditar = false,
		filter = true,
		label = "email",
		type = "VARCHAR" 
	)
	private String email;
	@Id
	@Column (
		name = "idxssousuario",
		nullable = true 
	)
	@Field (
		criteria = false,
		auditar = false,
		filter = false,
		type = "LONG" 
	)
	private Long idxssousuario;
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
	@NotNull
	@NotBlank
	@Size (
		min = 0,
		max = 100 
	)
	@Column (
		name = "nombre",
		nullable = false 
	)
	@Field (
		criteria = true,
		auditar = false,
		filter = true,
		label = "nombre",
		type = "VARCHAR" 
	)
	private String nombre;
	@NotNull
	@NotBlank
	@Size (
		min = 0,
		max = 1000 
	)
	@Column (
		name = "password",
		nullable = false 
	)
	@Field (
		criteria = true,
		auditar = false,
		filter = false,
		label = "Password",
		type = "VARCHAR",
		password = true 
	)
	@FieldType (
		type = FieldType.TYPEVALIDATOR.PASSWORD 
	)
	private String password;
	@Column (
		name = "sendacceslog",
		nullable = true 
	)
	@Field (
		criteria = true,
		auditar = false,
		filter = true,
		label = "",
		type = "BOOLEAN" 
	)
	private boolean sendacceslog;
	@Column (
		name = "showdesktop",
		nullable = true 
	)
	@Field (
		criteria = true,
		auditar = false,
		filter = true,
		label = "",
		type = "BOOLEAN" 
	)
	private boolean showdesktop;
	@Size (
		min = 0,
		max = 150 
	)
	@ValidEnum (
		enums = {
			",Aplicacion,Portales,Sistema,Portal empleado" 
		},
		message = "solamente admite lo valores: ,Aplicacion,Portales,Sistema,Portal empleado" 
	)
	@Column (
		name = "tipousuario",
		nullable = true 
	)
	@Field (
		criteria = true,
		auditar = false,
		filter = true,
		label = "Tipo de Usuario",
		type = "ENUM_STRING" 
	)
	private String tipousuario;
	@Column (
		name = "tmalta",
		nullable = true 
	)
	@Field (
		criteria = false,
		auditar = false,
		filter = false,
		label = "Baja",
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
		filter = false,
		label = "Baja",
		type = "VARCHAR" 
	)
	private String tmmodif;
	@Column (
		name = "twofactor",
		nullable = true 
	)
	@Field (
		criteria = true,
		auditar = false,
		filter = true,
		label = "",
		type = "BOOLEAN" 
	)
	private boolean twofactor;
	@NotNull
	@NotBlank
	@Size (
		min = 0,
		max = 100 
	)
	@Column (
		name = "usuario",
		nullable = false 
	)
	@Field (
		criteria = true,
		auditar = false,
		filter = true,
		label = "usuario",
		type = "VARCHAR" 
	)
	private String usuario;
	@Size (
		min = 0,
		max = 100 
	)
	@Column (
		name = "uuidcode",
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
	private String uuidcode;
	private boolean updatable;
	@OneToMany (
		cascade = javax.persistence.CascadeType.ALL,
		mappedBy = "idasignado" 
	)
	private List<Sacticket> subsacticket;
	@OneToMany (
		cascade = javax.persistence.CascadeType.ALL,
		mappedBy = "idusuarioblock" 
	)
	private List<Docfichero> subdocfichero;
	@OneToMany (
		cascade = javax.persistence.CascadeType.ALL,
		mappedBy = "idusuenvia" 
	)
	private List<Notificacion> subnotnotificacion;
	@OneToMany (
		cascade = javax.persistence.CascadeType.ALL,
		mappedBy = "idpropietario" 
	)
	private List<Crmcontacto> subcrmcontacto;
	@OneToMany (
		cascade = javax.persistence.CascadeType.ALL,
		mappedBy = "idpropietario" 
	)
	private List<Crmempresa> subcrmempresa;
	@OneToMany (
		cascade = javax.persistence.CascadeType.ALL,
		mappedBy = "idusuariofirma" 
	)
	private List<Crtrfirmascto> subcrtrfirmascto;
	@OneToMany (
		cascade = javax.persistence.CascadeType.ALL,
		mappedBy = "idssousuario" 
	)
	private List<Ssoruserapp> subssoruserapp;
	@OneToMany (
		cascade = javax.persistence.CascadeType.ALL,
		mappedBy = "idssousuario" 
	)
	private List<Ssoruserol> subssoruserol;
	@OneToMany (
		cascade = javax.persistence.CascadeType.ALL,
		mappedBy = "idssousuario" 
	)
	private List<Gexrreqexp> subgexrreqexp;
	@OneToMany (
		cascade = javax.persistence.CascadeType.ALL,
		mappedBy = "idssousuario" 
	)
	private List<Mrpmrecepcion> submrpmrecepcion;
	@OneToMany (
		cascade = javax.persistence.CascadeType.ALL,
		mappedBy = "idusersigned" 
	)
	private List<Erpfacturae> suberpfacturae;
	@OneToMany (
		cascade = javax.persistence.CascadeType.ALL,
		mappedBy = "idssousuario" 
	)
	private List<Citmagenda> subcitmagenda;
	@OneToMany (
		cascade = javax.persistence.CascadeType.ALL,
		mappedBy = "idssousuario" 
	)
	private List<Formcontacto> subformcontacto; 

	public List<Sacticket> getSubsacticket() {
		if(this.subsacticket==null)this.subsacticket=new ArrayList<>(0);
		  return this.subsacticket; 
	}
	
	public List<Docfichero> getSubdocfichero() {
		if(this.subdocfichero==null)this.subdocfichero=new ArrayList<>(0);
		  return this.subdocfichero; 
	}
	
	public List<Notificacion> getSubnotnotificacion() {
		if(this.subnotnotificacion==null)this.subnotnotificacion=new ArrayList<>(0);
		  return this.subnotnotificacion; 
	}
	
	public List<Crmcontacto> getSubcrmcontacto() {
		if(this.subcrmcontacto==null)this.subcrmcontacto=new ArrayList<>(0);
		  return this.subcrmcontacto; 
	}
	
	public List<Crmempresa> getSubcrmempresa() {
		if(this.subcrmempresa==null)this.subcrmempresa=new ArrayList<>(0);
		  return this.subcrmempresa; 
	}
	
	public List<Crtrfirmascto> getSubcrtrfirmascto() {
		if(this.subcrtrfirmascto==null)this.subcrtrfirmascto=new ArrayList<>(0);
		  return this.subcrtrfirmascto; 
	}
	
	public List<Ssoruserapp> getSubssoruserapp() {
		if(this.subssoruserapp==null)this.subssoruserapp=new ArrayList<>(0);
		  return this.subssoruserapp; 
	}
	
	public List<Ssoruserol> getSubssoruserol() {
		if(this.subssoruserol==null)this.subssoruserol=new ArrayList<>(0);
		  return this.subssoruserol; 
	}
	
	public List<Gexrreqexp> getSubgexrreqexp() {
		if(this.subgexrreqexp==null)this.subgexrreqexp=new ArrayList<>(0);
		  return this.subgexrreqexp; 
	}
	
	public List<Mrpmrecepcion> getSubmrpmrecepcion() {
		if(this.submrpmrecepcion==null)this.submrpmrecepcion=new ArrayList<>(0);
		  return this.submrpmrecepcion; 
	}
	
	public List<Erpfacturae> getSuberpfacturae() {
		if(this.suberpfacturae==null)this.suberpfacturae=new ArrayList<>(0);
		  return this.suberpfacturae; 
	}
	
	public List<Citmagenda> getSubcitmagenda() {
		if(this.subcitmagenda==null)this.subcitmagenda=new ArrayList<>(0);
		  return this.subcitmagenda; 
	}
	
	public List<Formcontacto> getSubformcontacto() {
		if(this.subformcontacto==null)this.subformcontacto=new ArrayList<>(0);
		  return this.subformcontacto; 
	} 

}