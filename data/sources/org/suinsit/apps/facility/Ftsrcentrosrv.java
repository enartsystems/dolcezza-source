package org.suinsit.apps.facility;

import java.io.Serializable;
import java.lang.Long;
import java.lang.String;
import java.math.BigDecimal;
import java.sql.Date;
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
import org.suinsit.apps.facility.Ftsmcentros;
import org.suinsit.apps.facility.Ftsmservicio;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table (
	name = "FTSRCENTROSRV" 
)
@Entidad (
	namespace = "facility",
	type = "TABLE",
	name = "FTSRCENTROSRV",
	labelMonitor = "",
	pk = "idxftsrcentrosrv" 
)
public class Ftsrcentrosrv implements Serializable { 

	private static final long serialVersionUID = 1L;
	@Column (
		name = "comentarios",
		nullable = true 
	)
	@Field (
		criteria = true,
		auditar = false,
		filter = true,
		label = "",
		type = "CLOB" 
	)
	private String comentarios;
	@Column (
		name = "desde",
		nullable = true 
	)
	@Field (
		criteria = true,
		auditar = false,
		filter = true,
		label = "",
		type = "DATE" 
	)
	private Date desde;
	@Column (
		name = "hasta",
		nullable = true 
	)
	@Field (
		criteria = true,
		auditar = false,
		filter = true,
		label = "",
		type = "DATE" 
	)
	private Date hasta;
	@Id
	@Column (
		name = "idxftsrcentrosrv",
		nullable = true 
	)
	@Field (
		criteria = false,
		auditar = false,
		filter = true,
		type = "LONG" 
	)
	private Long idxftsrcentrosrv;
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
	private boolean updatable;
	@ManyToOne (
		fetch = javax.persistence.FetchType.LAZY 
	)
	@JoinColumn (
		name = "IDFTSMSERVICIO0",
		referencedColumnName = "IDXFTSMSERVICIO",
		nullable = true,
		insertable = true,
		updatable = true 
	)
	private Ftsmservicio idftsmservicio;
	@ManyToOne (
		fetch = javax.persistence.FetchType.LAZY 
	)
	@JoinColumn (
		name = "IDFTSMCENTROS0",
		referencedColumnName = "IDXFTSMCENTROS",
		nullable = true,
		insertable = true,
		updatable = true 
	)
	private Ftsmcentros idftsmcentros; 

	public Ftsmservicio getIdftsmservicio() {
		if(this.idftsmservicio==null)this.idftsmservicio=new org.suinsit.apps.facility.Ftsmservicio();
		  return this.idftsmservicio; 
	}
	
	public Ftsmcentros getIdftsmcentros() {
		if(this.idftsmcentros==null)this.idftsmcentros=new org.suinsit.apps.facility.Ftsmcentros();
		  return this.idftsmcentros; 
	} 

}