package org.suinsit.apps.marketing;

import java.io.Serializable;
import java.lang.Long;
import java.lang.Object;
import java.lang.String;
import java.sql.Date;
import java.sql.Timestamp;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import org.enartframework.nocode.annotacion.Entidad;
import org.enartframework.nocode.annotacion.Sequence;
import org.suinsit.apps.admin.Ssousuario;
import org.suinsit.apps.crm.Crmempresa;

@Entity
@Table (
	name = "MKTMPOST" 
)
@Entidad (
	type = "TABLE",
	pk = "idxmktmpost" 
)
public class Mktmpost implements Serializable { 

	private static final long serialVersionUID = 1L;
	@Column (
		name = "ALTA",
		nullable = false 
	)
	private Date alta;
	@Column (
		name = "DOCUMENT",
		nullable = true 
	)
	private Object document;
	@Column (
		name = "HASHTAGS",
		nullable = true 
	)
	private String hashtags;
	@Id
	@Column (
		name = "IDXMKTMPOST",
		nullable = true 
	)
	private Long idxmktmpost;
	@Column (
		name = "IMAGE",
		nullable = true 
	)
	private Object image;
	@Column (
		name = "NOMBRE",
		nullable = true 
	)
	private String nombre;
	@Column (
		name = "POST",
		nullable = true 
	)
	private String post;
	@Column (
		name = "PUBLICAR",
		nullable = true 
	)
	private Timestamp publicar;
	@Column (
		name = "REFERENCIA",
		nullable = false 
	)
	@Sequence (
		name = "MKTMPOST_REFERENCIA",
		prefix = "",
		mask = "0000000000",
		addYear = false 
	)
	private String referencia;
	@Column (
		name = "TITULO",
		nullable = false 
	)
	private String titulo;
	@Column (
		name = "VIDEO",
		nullable = true 
	)
	private Object video;
	private boolean updatable;
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
		name = "IDCRMEMPRESA0",
		referencedColumnName = "IDXCRMEMPRESA",
		nullable = true,
		insertable = true,
		updatable = true 
	)
	private Crmempresa idcrmempresa; 

	public void setAlta(
		Date var
	) {
		this.alta=var; 
	}
	
	public Date getAlta() {
		return this.alta; 
	}
	
	public void setDocument(
		Object var
	) {
		this.document=var; 
	}
	
	public Object getDocument() {
		return this.document; 
	}
	
	public void setHashtags(
		String var
	) {
		this.hashtags=var; 
	}
	
	public String getHashtags() {
		return this.hashtags; 
	}
	
	public void setIdxmktmpost(
		Long var
	) {
		this.idxmktmpost=var; 
	}
	
	public Long getIdxmktmpost() {
		return this.idxmktmpost; 
	}
	
	public void setImage(
		Object var
	) {
		this.image=var; 
	}
	
	public Object getImage() {
		return this.image; 
	}
	
	public void setNombre(
		String var
	) {
		this.nombre=var; 
	}
	
	public String getNombre() {
		return this.nombre; 
	}
	
	public void setPost(
		String var
	) {
		this.post=var; 
	}
	
	public String getPost() {
		return this.post; 
	}
	
	public void setPublicar(
		Timestamp var
	) {
		this.publicar=var; 
	}
	
	public Timestamp getPublicar() {
		return this.publicar; 
	}
	
	public void setReferencia(
		String var
	) {
		this.referencia=var; 
	}
	
	public String getReferencia() {
		return this.referencia; 
	}
	
	public void setTitulo(
		String var
	) {
		this.titulo=var; 
	}
	
	public String getTitulo() {
		return this.titulo; 
	}
	
	public void setVideo(
		Object var
	) {
		this.video=var; 
	}
	
	public Object getVideo() {
		return this.video; 
	}
	
	public void setUpdatable(
		boolean var
	) {
		this.updatable=var; 
	}
	
	public boolean isUpdatable() {
		return this.updatable; 
	}
	
	public void setIdssousuario(
		Ssousuario var
	) {
		this.idssousuario=var; 
	}
	
	public Ssousuario getIdssousuario() {
		if(this.idssousuario==null)this.idssousuario=new org.suinsit.apps.admin.Ssousuario();
		  return this.idssousuario; 
	}
	
	public void setIdcrmempresa(
		Crmempresa var
	) {
		this.idcrmempresa=var; 
	}
	
	public Crmempresa getIdcrmempresa() {
		if(this.idcrmempresa==null)this.idcrmempresa=new org.suinsit.apps.crm.Crmempresa();
		  return this.idcrmempresa; 
	} 

}