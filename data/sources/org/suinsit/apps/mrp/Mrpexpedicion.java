package org.suinsit.apps.mrp;

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
import org.enartframework.nocode.annotacion.Entidad;
import org.enartframework.nocode.annotacion.SequenceYear;
import org.suinsit.apps.crm.Crmempresa;
import org.suinsit.apps.facturacin.Erpempresa;
import org.suinsit.apps.mrp.Mrpestado;
import org.suinsit.apps.mrp.Mrpmsequence;
import org.suinsit.apps.mrp.Mrpmtipoperacion;
import org.suinsit.apps.portalemp.Rrhempleado;

@Entity
@Table (
	name = "MRPEXPEDICION" 
)
@Entidad (
	type = "TABLE",
	pk = "idxmrpexpedicion" 
)
public class Mrpexpedicion implements Serializable { 

	private static final long serialVersionUID = 1L;
	@Column (
		name = "documentoref",
		nullable = true 
	)
	private String documentoref;
	@Column (
		name = "entregarcuando",
		nullable = true 
	)
	private String entregarcuando;
	@Id
	@Column (
		name = "idxmrpexpedicion",
		nullable = true 
	)
	private Long idxmrpexpedicion;
	@Column (
		name = "nota",
		nullable = true 
	)
	private String nota;
	@Column (
		name = "prevista",
		nullable = true 
	)
	private Timestamp prevista;
	@Column (
		name = "referencia",
		nullable = true 
	)
	@SequenceYear (
		autoCreateFromYear = false,
		autoResetYear = false,
		createManual = false,
		createFromFieldValue = "",
		fieldPrefix = "",
		foreing = true,
		fkTable = "false",
		fkAlias = "idmrpmsequence.sql",
		name = "MRPEXPEDICION_REFERENCIA",
		prefix = "",
		mask = "00000",
		addYear = false 
	)
	private String referencia;
	private boolean updatable;
	@ManyToOne (
		fetch = javax.persistence.FetchType.LAZY 
	)
	@JoinColumn (
		name = "IDMRPMSEQUENCE0",
		referencedColumnName = "IDXMRPMSEQUENCE",
		nullable = true,
		insertable = true,
		updatable = true 
	)
	private Mrpmsequence idmrpmsequence;
	@ManyToOne (
		fetch = javax.persistence.FetchType.LAZY 
	)
	@JoinColumn (
		name = "IDMRPMTIPOPERACION0",
		referencedColumnName = "IDXMRPMTIPOPERACION",
		nullable = true,
		insertable = true,
		updatable = true 
	)
	private Mrpmtipoperacion idmrpmtipoperacion;
	@ManyToOne (
		fetch = javax.persistence.FetchType.LAZY 
	)
	@JoinColumn (
		name = "IDCLIENTREGA0",
		referencedColumnName = "IDXCRMEMPRESA",
		nullable = true,
		insertable = true,
		updatable = true 
	)
	private Crmempresa idclientrega;
	@ManyToOne (
		fetch = javax.persistence.FetchType.LAZY 
	)
	@JoinColumn (
		name = "IDCOMPANY0",
		referencedColumnName = "IDXERPEMPRESA",
		nullable = true,
		insertable = true,
		updatable = true 
	)
	private Erpempresa idcompany;
	@ManyToOne (
		fetch = javax.persistence.FetchType.LAZY 
	)
	@JoinColumn (
		name = "IDRESPONSABLE0",
		referencedColumnName = "IDXRRHEMPLEADO",
		nullable = true,
		insertable = true,
		updatable = true 
	)
	private Rrhempleado idresponsable;
	@ManyToOne (
		fetch = javax.persistence.FetchType.LAZY 
	)
	@JoinColumn (
		name = "IDMRPESTADO0",
		referencedColumnName = "IDXMRPESTADO",
		nullable = true,
		insertable = true,
		updatable = true 
	)
	private Mrpestado idmrpestado; 

	public void setDocumentoref(
		String var
	) {
		this.documentoref=var; 
	}
	
	public String getDocumentoref() {
		return this.documentoref; 
	}
	
	public void setEntregarcuando(
		String var
	) {
		this.entregarcuando=var; 
	}
	
	public String getEntregarcuando() {
		return this.entregarcuando; 
	}
	
	public void setIdxmrpexpedicion(
		Long var
	) {
		this.idxmrpexpedicion=var; 
	}
	
	public Long getIdxmrpexpedicion() {
		return this.idxmrpexpedicion; 
	}
	
	public void setNota(
		String var
	) {
		this.nota=var; 
	}
	
	public String getNota() {
		return this.nota; 
	}
	
	public void setPrevista(
		Timestamp var
	) {
		this.prevista=var; 
	}
	
	public Timestamp getPrevista() {
		return this.prevista; 
	}
	
	public void setReferencia(
		String var
	) {
		this.referencia=var; 
	}
	
	public String getReferencia() {
		return this.referencia; 
	}
	
	public void setUpdatable(
		boolean var
	) {
		this.updatable=var; 
	}
	
	public boolean isUpdatable() {
		return this.updatable; 
	}
	
	public void setIdmrpmsequence(
		Mrpmsequence var
	) {
		this.idmrpmsequence=var; 
	}
	
	public Mrpmsequence getIdmrpmsequence() {
		if(this.idmrpmsequence==null)this.idmrpmsequence=new org.suinsit.apps.mrp.Mrpmsequence();
		  return this.idmrpmsequence; 
	}
	
	public void setIdmrpmtipoperacion(
		Mrpmtipoperacion var
	) {
		this.idmrpmtipoperacion=var; 
	}
	
	public Mrpmtipoperacion getIdmrpmtipoperacion() {
		if(this.idmrpmtipoperacion==null)this.idmrpmtipoperacion=new org.suinsit.apps.mrp.Mrpmtipoperacion();
		  return this.idmrpmtipoperacion; 
	}
	
	public void setIdclientrega(
		Crmempresa var
	) {
		this.idclientrega=var; 
	}
	
	public Crmempresa getIdclientrega() {
		if(this.idclientrega==null)this.idclientrega=new org.suinsit.apps.crm.Crmempresa();
		  return this.idclientrega; 
	}
	
	public void setIdcompany(
		Erpempresa var
	) {
		this.idcompany=var; 
	}
	
	public Erpempresa getIdcompany() {
		if(this.idcompany==null)this.idcompany=new org.suinsit.apps.facturacin.Erpempresa();
		  return this.idcompany; 
	}
	
	public void setIdresponsable(
		Rrhempleado var
	) {
		this.idresponsable=var; 
	}
	
	public Rrhempleado getIdresponsable() {
		if(this.idresponsable==null)this.idresponsable=new org.suinsit.apps.portalemp.Rrhempleado();
		  return this.idresponsable; 
	}
	
	public void setIdmrpestado(
		Mrpestado var
	) {
		this.idmrpestado=var; 
	}
	
	public Mrpestado getIdmrpestado() {
		if(this.idmrpestado==null)this.idmrpestado=new org.suinsit.apps.mrp.Mrpestado();
		  return this.idmrpestado; 
	} 

}