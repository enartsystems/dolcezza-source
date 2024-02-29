package org.suinsit.apps.formularios;

import java.io.Serializable;
import java.lang.Long;
import java.lang.String;
import java.sql.Timestamp;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
import org.enartframework.nocode.annotacion.ValidEnum;
import org.suinsit.apps.admin.Ssousuario;
import org.suinsit.apps.crm.Crmempresa;
import org.suinsit.apps.crm.Crmetapa;
import org.suinsit.apps.crm.Crmoportunidad;
import org.suinsit.apps.crm.Crmpipeline;
import org.suinsit.apps.formularios.Forminterescontact;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table (
	name = "FORMCONTACTO" 
)
@Entidad (
	namespace = "formularios",
	type = "TABLE",
	name = "FORMCONTACTO",
	labelMonitor = "",
	pk = "idxformcontacto" 
)
public class Formcontacto implements Serializable { 

	private static final long serialVersionUID = 1L;
	@NotNull
	@NotBlank
	@Column (
		name = "comunicacion",
		nullable = false 
	)
	@Field (
		criteria = true,
		auditar = false,
		filter = true,
		label = "",
		type = "BOOLEAN" 
	)
	private boolean comunicacion;
	@NotNull
	@NotBlank
	@Column (
		name = "rgpd",
		nullable = false 
	)
	@Field (
		criteria = true,
		auditar = false,
		filter = true,
		label = "",
		type = "BOOLEAN" 
	)
	private boolean rgpd;
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
		name = "comentario",
		nullable = true 
	)
	@Field (
		criteria = true,
		auditar = false,
		filter = true,
		label = "",
		type = "CLOB" 
	)
	private String comentario;
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
		label = "",
		type = "VARCHAR" 
	)
	private String correo;
	@Size (
		min = 0,
		max = 100 
	)
	@Column (
		name = "empresa",
		nullable = true 
	)
	@Field (
		criteria = true,
		auditar = false,
		filter = true,
		label = "",
		type = "VARCHAR" 
	)
	private String empresa;
	@Id
	@Column (
		name = "idxformcontacto",
		nullable = true 
	)
	@Field (
		criteria = false,
		auditar = false,
		filter = true,
		type = "LONG" 
	)
	private Long idxformcontacto;
	@Size (
		min = 0,
		max = 100 
	)
	@Column (
		name = "nombre",
		nullable = true 
	)
	@Field (
		criteria = true,
		auditar = false,
		filter = true,
		label = "",
		type = "VARCHAR" 
	)
	private String nombre;
	@NotNull
	@NotBlank
	@Size (
		min = 0,
		max = 100 
	)
	@Column (
		name = "registro",
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
		name = "FORMCONTACTO_REGISTRO",
		prefix = "",
		mask = "0000000000",
		addYear = true 
	)
	private String registro;
	@Size (
		min = 0,
		max = 100 
	)
	@Column (
		name = "telefno",
		nullable = true 
	)
	@Field (
		criteria = true,
		auditar = false,
		filter = true,
		label = "",
		type = "VARCHAR" 
	)
	private String telefno;
	@Size (
		min = 0,
		max = 150 
	)
	@ValidEnum (
		enums = {
			",Empresa,Autonomo,Particular,Organismo Publico,Otro" 
		},
		message = "solamente admite lo valores: ,Empresa,Autonomo,Particular,Organismo Publico,Otro" 
	)
	@Column (
		name = "tipo",
		nullable = true 
	)
	@Field (
		criteria = true,
		auditar = false,
		filter = true,
		label = "",
		type = "ENUM_STRING" 
	)
	private String tipo;
	private boolean updatable;
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
		name = "IDCRMPIPELINE0",
		referencedColumnName = "IDXCRMPIPELINE",
		nullable = true,
		insertable = true,
		updatable = true 
	)
	private Crmpipeline idcrmpipeline;
	@ManyToOne (
		fetch = javax.persistence.FetchType.LAZY 
	)
	@JoinColumn (
		name = "IDCRMETAPA0",
		referencedColumnName = "IDXCRMETAPA",
		nullable = true,
		insertable = true,
		updatable = true 
	)
	private Crmetapa idcrmetapa;
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
	@ManyToOne (
		fetch = javax.persistence.FetchType.LAZY 
	)
	@JoinColumn (
		name = "IDFORMINTERESCONTACT0",
		referencedColumnName = "IDXFORMINTERESCONTACT",
		nullable = true,
		insertable = true,
		updatable = true 
	)
	private Forminterescontact idforminterescontact; 

	public Crmempresa getIdcrmempresa() {
		if(this.idcrmempresa==null)this.idcrmempresa=new org.suinsit.apps.crm.Crmempresa();
		  return this.idcrmempresa; 
	}
	
	public Crmoportunidad getIdcrmoportunidad() {
		if(this.idcrmoportunidad==null)this.idcrmoportunidad=new org.suinsit.apps.crm.Crmoportunidad();
		  return this.idcrmoportunidad; 
	}
	
	public Crmpipeline getIdcrmpipeline() {
		if(this.idcrmpipeline==null)this.idcrmpipeline=new org.suinsit.apps.crm.Crmpipeline();
		  return this.idcrmpipeline; 
	}
	
	public Crmetapa getIdcrmetapa() {
		if(this.idcrmetapa==null)this.idcrmetapa=new org.suinsit.apps.crm.Crmetapa();
		  return this.idcrmetapa; 
	}
	
	public Ssousuario getIdssousuario() {
		if(this.idssousuario==null)this.idssousuario=new org.suinsit.apps.admin.Ssousuario();
		  return this.idssousuario; 
	}
	
	public Forminterescontact getIdforminterescontact() {
		if(this.idforminterescontact==null)this.idforminterescontact=new org.suinsit.apps.formularios.Forminterescontact();
		  return this.idforminterescontact; 
	} 

}