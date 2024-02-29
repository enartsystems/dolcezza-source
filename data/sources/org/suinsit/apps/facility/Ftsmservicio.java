package org.suinsit.apps.facility;

import java.io.Serializable;
import java.lang.Long;
import java.lang.String;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.Size;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.enartframework.nocode.annotacion.Entidad;
import org.enartframework.nocode.annotacion.Field;
import org.enartframework.nocode.annotacion.ValidEnum;
import org.suinsit.apps.facility.Ftsrcentrosrv;
import org.suinsit.apps.facturacin.Promcategoria;
import org.suinsit.apps.facturacin.Promproducto;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table (
	name = "FTSMSERVICIO" 
)
@Entidad (
	namespace = "facility",
	type = "TABLE",
	name = "FTSMSERVICIO",
	labelMonitor = "SERVICIO",
	pk = "idxftsmservicio" 
)
public class Ftsmservicio implements Serializable { 

	private static final long serialVersionUID = 1L;
	@Column (
		name = "descripcion",
		nullable = true 
	)
	@Field (
		criteria = true,
		auditar = false,
		filter = true,
		label = "",
		type = "CLOB" 
	)
	private String descripcion;
	@Size (
		min = 0,
		max = 150 
	)
	@ValidEnum (
		enums = {
			",Diaria,Semana,Mensual" 
		},
		message = "solamente admite lo valores: ,Diaria,Semana,Mensual" 
	)
	@Column (
		name = "frecuencia",
		nullable = true 
	)
	@Field (
		criteria = true,
		auditar = false,
		filter = true,
		label = "",
		type = "ENUM_STRING" 
	)
	private String frecuencia;
	@Id
	@Column (
		name = "idxftsmservicio",
		nullable = true 
	)
	@Field (
		criteria = false,
		auditar = false,
		filter = true,
		type = "LONG" 
	)
	private Long idxftsmservicio;
	@Size (
		min = 0,
		max = 16 
	)
	@Column (
		name = "preciounit",
		nullable = true 
	)
	@Field (
		criteria = true,
		auditar = false,
		filter = true,
		label = "",
		type = "DECIMAL" 
	)
	private BigDecimal preciounit;
	@Size (
		min = 0,
		max = 100 
	)
	@Column (
		name = "servicio",
		nullable = true 
	)
	@Field (
		criteria = true,
		auditar = false,
		filter = true,
		label = "",
		type = "VARCHAR" 
	)
	private String servicio;
	@Size (
		min = 0,
		max = 150 
	)
	@ValidEnum (
		enums = {
			",MENSUAL,HORA,DIA" 
		},
		message = "solamente admite lo valores: ,MENSUAL,HORA,DIA" 
	)
	@Column (
		name = "tipocargo",
		nullable = true 
	)
	@Field (
		criteria = true,
		auditar = false,
		filter = true,
		label = "",
		type = "ENUM_STRING" 
	)
	private String tipocargo;
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
	@OneToMany (
		cascade = javax.persistence.CascadeType.ALL,
		mappedBy = "idftsmservicio" 
	)
	private List<Ftsrcentrosrv> subftsrcentrosrv; 

	public Promcategoria getIdpromcategoria() {
		if(this.idpromcategoria==null)this.idpromcategoria=new org.suinsit.apps.facturacin.Promcategoria();
		  return this.idpromcategoria; 
	}
	
	public Promproducto getIdpromproducto() {
		if(this.idpromproducto==null)this.idpromproducto=new org.suinsit.apps.facturacin.Promproducto();
		  return this.idpromproducto; 
	}
	
	public List<Ftsrcentrosrv> getSubftsrcentrosrv() {
		if(this.subftsrcentrosrv==null)this.subftsrcentrosrv=new ArrayList<>(0);
		  return this.subftsrcentrosrv; 
	} 

}