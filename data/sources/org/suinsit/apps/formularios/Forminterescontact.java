package org.suinsit.apps.formularios;

import java.io.Serializable;
import java.lang.Long;
import java.lang.String;
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
import org.suinsit.apps.crm.Crmetapa;
import org.suinsit.apps.crm.Crmpipeline;
import org.suinsit.apps.facturacin.Promcategoria;
import org.suinsit.apps.facturacin.Promproducto;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table (
	name = "FORMINTERESCONTACT" 
)
@Entidad (
	namespace = "formularios",
	type = "TABLE",
	name = "FORMINTERESCONTACT",
	labelMonitor = "",
	pk = "idxforminterescontact" 
)
public class Forminterescontact implements Serializable { 

	private static final long serialVersionUID = 1L;
	@Column (
		name = "desactivado",
		nullable = true 
	)
	@Field (
		criteria = true,
		auditar = false,
		filter = true,
		label = "",
		type = "BOOLEAN" 
	)
	private boolean desactivado;
	@Column (
		name = "infopublica",
		nullable = true 
	)
	@Field (
		criteria = true,
		auditar = false,
		filter = true,
		label = "",
		type = "CLOB" 
	)
	private String infopublica;
	@Size (
		min = 0,
		max = 100 
	)
	@Column (
		name = "producto",
		nullable = true 
	)
	@Field (
		criteria = true,
		auditar = false,
		filter = true,
		label = "",
		type = "VARCHAR" 
	)
	private String producto;
	@Id
	@Column (
		name = "idxforminterescontact",
		nullable = true 
	)
	@Field (
		criteria = false,
		auditar = false,
		filter = true,
		type = "LONG" 
	)
	private Long idxforminterescontact;
	private boolean updatable;
	@ManyToOne (
		fetch = javax.persistence.FetchType.LAZY 
	)
	@JoinColumn (
		name = "IDPROMCATEGORIA0",
		referencedColumnName = "IDXPROMCATEGORIA",
		nullable = true,
		insertable = true,
		updatable = true 
	)
	private Promcategoria idpromcategoria;
	@ManyToOne (
		fetch = javax.persistence.FetchType.LAZY 
	)
	@JoinColumn (
		name = "IDPROMPRODUCTO0",
		referencedColumnName = "IDXPROMPRODUCTO",
		nullable = true,
		insertable = true,
		updatable = true 
	)
	private Promproducto idpromproducto;
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

	public Promcategoria getIdpromcategoria() {
		if(this.idpromcategoria==null)this.idpromcategoria=new org.suinsit.apps.facturacin.Promcategoria();
		  return this.idpromcategoria; 
	}
	
	public Promproducto getIdpromproducto() {
		if(this.idpromproducto==null)this.idpromproducto=new org.suinsit.apps.facturacin.Promproducto();
		  return this.idpromproducto; 
	}
	
	public Crmpipeline getIdcrmpipeline() {
		if(this.idcrmpipeline==null)this.idcrmpipeline=new org.suinsit.apps.crm.Crmpipeline();
		  return this.idcrmpipeline; 
	}
	
	public Crmetapa getIdcrmetapa() {
		if(this.idcrmetapa==null)this.idcrmetapa=new org.suinsit.apps.crm.Crmetapa();
		  return this.idcrmetapa; 
	} 

}