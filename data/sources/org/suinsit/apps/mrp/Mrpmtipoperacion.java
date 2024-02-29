package org.suinsit.apps.mrp;

import java.io.Serializable;
import java.lang.Long;
import java.lang.String;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import org.enartframework.nocode.annotacion.Entidad;
import org.suinsit.apps.facturacin.Erpempresa;
import org.suinsit.apps.mrp.Mrpmsequence;
import org.suinsit.apps.mrp.Mrpmtipoopera;
import org.suinsit.apps.mrp.Mrpmtipoperacion;

@Entity
@Table (
	name = "MRPMTIPOPERACION" 
)
@Entidad (
	type = "TABLE",
	pk = "idxmrpmtipoperacion" 
)
public class Mrpmtipoperacion implements Serializable { 

	private static final long serialVersionUID = 1L;
	@Column (
		name = "creaordenreparar",
		nullable = true 
	)
	private boolean creaordenreparar;
	@Column (
		name = "crearlote",
		nullable = true 
	)
	private boolean crearlote;
	@Column (
		name = "detallaroperacion",
		nullable = true 
	)
	private boolean detallaroperacion;
	@Column (
		name = "entregaparcial",
		nullable = true 
	)
	private boolean entregaparcial;
	@Id
	@Column (
		name = "idxmrpmtipoperacion",
		nullable = true 
	)
	private Long idxmrpmtipoperacion;
	@Column (
		name = "prefijo",
		nullable = true 
	)
	private String prefijo;
	@Column (
		name = "reservar",
		nullable = true 
	)
	private String reservar;
	@Column (
		name = "tipooperacion",
		nullable = false 
	)
	private String tipooperacion;
	@Column (
		name = "uselote",
		nullable = true 
	)
	private boolean uselote;
	private boolean updatable;
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
		name = "IDMRPRETORNO0",
		referencedColumnName = "IDXMRPMTIPOPERACION",
		nullable = true,
		insertable = true,
		updatable = true 
	)
	private Mrpmtipoperacion idmrpretorno;
	@ManyToOne (
		fetch = javax.persistence.FetchType.LAZY 
	)
	@JoinColumn (
		name = "IDMRPMTIPOOPERA0",
		referencedColumnName = "IDXMRPMTIPOOPERA",
		nullable = true,
		insertable = true,
		updatable = true 
	)
	private Mrpmtipoopera idmrpmtipoopera; 

	public void setCreaordenreparar(
		boolean var
	) {
		this.creaordenreparar=var; 
	}
	
	public boolean isCreaordenreparar() {
		return this.creaordenreparar; 
	}
	
	public void setCrearlote(
		boolean var
	) {
		this.crearlote=var; 
	}
	
	public boolean isCrearlote() {
		return this.crearlote; 
	}
	
	public void setDetallaroperacion(
		boolean var
	) {
		this.detallaroperacion=var; 
	}
	
	public boolean isDetallaroperacion() {
		return this.detallaroperacion; 
	}
	
	public void setEntregaparcial(
		boolean var
	) {
		this.entregaparcial=var; 
	}
	
	public boolean isEntregaparcial() {
		return this.entregaparcial; 
	}
	
	public void setIdxmrpmtipoperacion(
		Long var
	) {
		this.idxmrpmtipoperacion=var; 
	}
	
	public Long getIdxmrpmtipoperacion() {
		return this.idxmrpmtipoperacion; 
	}
	
	public void setPrefijo(
		String var
	) {
		this.prefijo=var; 
	}
	
	public String getPrefijo() {
		return this.prefijo; 
	}
	
	public void setReservar(
		String var
	) {
		this.reservar=var; 
	}
	
	public String getReservar() {
		return this.reservar; 
	}
	
	public void setTipooperacion(
		String var
	) {
		this.tipooperacion=var; 
	}
	
	public String getTipooperacion() {
		return this.tipooperacion; 
	}
	
	public void setUselote(
		boolean var
	) {
		this.uselote=var; 
	}
	
	public boolean isUselote() {
		return this.uselote; 
	}
	
	public void setUpdatable(
		boolean var
	) {
		this.updatable=var; 
	}
	
	public boolean isUpdatable() {
		return this.updatable; 
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
	
	public void setIdmrpmsequence(
		Mrpmsequence var
	) {
		this.idmrpmsequence=var; 
	}
	
	public Mrpmsequence getIdmrpmsequence() {
		if(this.idmrpmsequence==null)this.idmrpmsequence=new org.suinsit.apps.mrp.Mrpmsequence();
		  return this.idmrpmsequence; 
	}
	
	public void setIdmrpretorno(
		Mrpmtipoperacion var
	) {
		this.idmrpretorno=var; 
	}
	
	public Mrpmtipoperacion getIdmrpretorno() {
		if(this.idmrpretorno==null)this.idmrpretorno=new org.suinsit.apps.mrp.Mrpmtipoperacion();
		  return this.idmrpretorno; 
	}
	
	public void setIdmrpmtipoopera(
		Mrpmtipoopera var
	) {
		this.idmrpmtipoopera=var; 
	}
	
	public Mrpmtipoopera getIdmrpmtipoopera() {
		if(this.idmrpmtipoopera==null)this.idmrpmtipoopera=new org.suinsit.apps.mrp.Mrpmtipoopera();
		  return this.idmrpmtipoopera; 
	} 

}