package org.suinsit.apps.marketing;

import java.io.Serializable;
import java.lang.Integer;
import java.lang.Long;
import java.lang.String;
import java.sql.Timestamp;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import org.enartframework.nocode.annotacion.Entidad;
import org.suinsit.apps.marketing.Mktrpostagency;

@Entity
@Table (
	name = "MKTRPUBLISHPOST" 
)
@Entidad (
	type = "TABLE",
	pk = "idxmktrpublishpost" 
)
public class Mktrpublishpost implements Serializable { 

	private static final long serialVersionUID = 1L;
	@Column (
		name = "ACTIVO",
		nullable = true 
	)
	private boolean activo;
	@Id
	@Column (
		name = "IDXMKTRPUBLISHPOST",
		nullable = true 
	)
	private Long idxmktrpublishpost;
	@Column (
		name = "LIKES",
		nullable = true 
	)
	private Integer likes;
	@Column (
		name = "PUBLICACION",
		nullable = true 
	)
	private Timestamp publicacion;
	@Column (
		name = "REENVIO",
		nullable = true 
	)
	private Integer reenvio;
	@Column (
		name = "REFPUBLICACION",
		nullable = true 
	)
	private String refpublicacion;
	@Column (
		name = "VISITORS",
		nullable = true 
	)
	private Integer visitors;
	private boolean updatable;
	@ManyToOne (
		fetch = javax.persistence.FetchType.LAZY 
	)
	@JoinColumn (
		name = "IDMKTRPOSTAGENCY0",
		referencedColumnName = "IDXMKTRPOSTAGENCY",
		nullable = true,
		insertable = true,
		updatable = true 
	)
	private Mktrpostagency idmktrpostagency; 

	public void setActivo(
		boolean var
	) {
		this.activo=var; 
	}
	
	public boolean isActivo() {
		return this.activo; 
	}
	
	public void setIdxmktrpublishpost(
		Long var
	) {
		this.idxmktrpublishpost=var; 
	}
	
	public Long getIdxmktrpublishpost() {
		return this.idxmktrpublishpost; 
	}
	
	public void setLikes(
		Integer var
	) {
		this.likes=var; 
	}
	
	public Integer getLikes() {
		return this.likes; 
	}
	
	public void setPublicacion(
		Timestamp var
	) {
		this.publicacion=var; 
	}
	
	public Timestamp getPublicacion() {
		return this.publicacion; 
	}
	
	public void setReenvio(
		Integer var
	) {
		this.reenvio=var; 
	}
	
	public Integer getReenvio() {
		return this.reenvio; 
	}
	
	public void setRefpublicacion(
		String var
	) {
		this.refpublicacion=var; 
	}
	
	public String getRefpublicacion() {
		return this.refpublicacion; 
	}
	
	public void setVisitors(
		Integer var
	) {
		this.visitors=var; 
	}
	
	public Integer getVisitors() {
		return this.visitors; 
	}
	
	public void setUpdatable(
		boolean var
	) {
		this.updatable=var; 
	}
	
	public boolean isUpdatable() {
		return this.updatable; 
	}
	
	public void setIdmktrpostagency(
		Mktrpostagency var
	) {
		this.idmktrpostagency=var; 
	}
	
	public Mktrpostagency getIdmktrpostagency() {
		if(this.idmktrpostagency==null)this.idmktrpostagency=new org.suinsit.apps.marketing.Mktrpostagency();
		  return this.idmktrpostagency; 
	} 

}