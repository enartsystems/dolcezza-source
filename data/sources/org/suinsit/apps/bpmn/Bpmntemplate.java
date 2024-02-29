package org.suinsit.apps.bpmn;

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
import org.suinsit.apps.bpmn.Bpmmproces;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table (
	name = "BPMNTEMPLATE" 
)
@Entidad (
	namespace = "bpmn",
	type = "TABLE",
	name = "BPMNTEMPLATE",
	labelMonitor = "IDTASK",
	pk = "idxbpmntemplate" 
)
public class Bpmntemplate implements Serializable { 

	private static final long serialVersionUID = 1L;
	@Column (
		name = "nohtml",
		nullable = true 
	)
	@Field (
		criteria = true,
		auditar = false,
		filter = true,
		label = "",
		type = "CLOB" 
	)
	private String nohtml;
	@Column (
		name = "html",
		nullable = true 
	)
	@Field (
		criteria = true,
		auditar = false,
		filter = true,
		label = "",
		type = "CLOB" 
	)
	private String html;
	@Size (
		min = 0,
		max = 100 
	)
	@Column (
		name = "bcc",
		nullable = true 
	)
	@Field (
		criteria = true,
		auditar = false,
		filter = true,
		label = "",
		type = "VARCHAR" 
	)
	private String bcc;
	@Size (
		min = 0,
		max = 100 
	)
	@Column (
		name = "ccc",
		nullable = true 
	)
	@Field (
		criteria = true,
		auditar = false,
		filter = true,
		label = "",
		type = "VARCHAR" 
	)
	private String ccc;
	@Size (
		min = 0,
		max = 100 
	)
	@Column (
		name = "subject",
		nullable = true 
	)
	@Field (
		criteria = true,
		auditar = false,
		filter = true,
		label = "",
		type = "VARCHAR" 
	)
	private String subject;
	@Size (
		min = 0,
		max = 100 
	)
	@Column (
		name = "sendfrom",
		nullable = true 
	)
	@Field (
		criteria = true,
		auditar = false,
		filter = true,
		label = "",
		type = "VARCHAR" 
	)
	private String sendfrom;
	@Size (
		min = 0,
		max = 100 
	)
	@Column (
		name = "sendto",
		nullable = true 
	)
	@Field (
		criteria = true,
		auditar = false,
		filter = true,
		label = "",
		type = "VARCHAR" 
	)
	private String sendto;
	@Size (
		min = 0,
		max = 100 
	)
	@Column (
		name = "idtask",
		nullable = true 
	)
	@Field (
		criteria = true,
		auditar = false,
		filter = true,
		label = "",
		type = "VARCHAR" 
	)
	private String idtask;
	@Id
	@Column (
		name = "idxbpmntemplate",
		nullable = true 
	)
	@Field (
		criteria = false,
		auditar = false,
		filter = true,
		type = "LONG" 
	)
	private Long idxbpmntemplate;
	private boolean updatable;
	@ManyToOne (
		fetch = javax.persistence.FetchType.LAZY 
	)
	@JoinColumn (
		name = "IDBPMMPROCES0",
		referencedColumnName = "IDXBPMMPROCES",
		nullable = true,
		insertable = true,
		updatable = true 
	)
	private Bpmmproces idbpmmproces; 

	public Bpmmproces getIdbpmmproces() {
		if(this.idbpmmproces==null)this.idbpmmproces=new org.suinsit.apps.bpmn.Bpmmproces();
		  return this.idbpmmproces; 
	} 

}