package org.suinsit.apps.facturacin;

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
import javax.persistence.Table;
import org.enartframework.nocode.annotacion.Entidad;
import org.suinsit.apps.facturacin.Erpempresa;
import org.suinsit.apps.facturacin.Erpfactura;
import org.suinsit.apps.facturacin.Erplineafactprov;
import org.suinsit.apps.facturacin.Erplineafactura;
import org.suinsit.apps.facturacin.Erprlineapedido;
import org.suinsit.apps.facturacin.Promproducto;

@Entity
@Table (
	name = "ERPIMPUESTOS" 
)
@Entidad (
	type = "TABLE",
	pk = "idxerpimpuestos" 
)
public class Erpimpuestos implements Serializable { 

	private static final long serialVersionUID = 1L;
	@Column (
		name = "RETENCION",
		nullable = true 
	)
	private boolean retencion;
	@Column (
		name = "ACTIVADO",
		nullable = true 
	)
	private boolean activado;
	@Column (
		name = "AMBITO",
		nullable = true 
	)
	private String ambito;
	@Id
	@Column (
		name = "IDXERPIMPUESTOS",
		nullable = true 
	)
	private Long idxerpimpuestos;
	@Column (
		name = "IMPUESTO",
		nullable = false 
	)
	private String impuesto;
	@Column (
		name = "INCLUIDOPRECIO",
		nullable = true 
	)
	private boolean incluidoprecio;
	@Column (
		name = "IVA",
		nullable = true 
	)
	private BigDecimal iva;
	@Column (
		name = "TIPOIMPUESTO",
		nullable = true 
	)
	private String tipoimpuesto;
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
	private List<Promproducto> subpromproducto;
	private List<Erprlineapedido> suberprlineapedido;
	private List<Erplineafactprov> suberplineafactprov;
	private List<Erplineafactura> suberplineafactura;
	private List<Erpfactura> suberpfactura; 

	public void setRetencion(
		boolean var
	) {
		this.retencion=var; 
	}
	
	public boolean isRetencion() {
		return this.retencion; 
	}
	
	public void setActivado(
		boolean var
	) {
		this.activado=var; 
	}
	
	public boolean isActivado() {
		return this.activado; 
	}
	
	public void setAmbito(
		String var
	) {
		this.ambito=var; 
	}
	
	public String getAmbito() {
		return this.ambito; 
	}
	
	public void setIdxerpimpuestos(
		Long var
	) {
		this.idxerpimpuestos=var; 
	}
	
	public Long getIdxerpimpuestos() {
		return this.idxerpimpuestos; 
	}
	
	public void setImpuesto(
		String var
	) {
		this.impuesto=var; 
	}
	
	public String getImpuesto() {
		return this.impuesto; 
	}
	
	public void setIncluidoprecio(
		boolean var
	) {
		this.incluidoprecio=var; 
	}
	
	public boolean isIncluidoprecio() {
		return this.incluidoprecio; 
	}
	
	public void setIva(
		BigDecimal var
	) {
		this.iva=var; 
	}
	
	public BigDecimal getIva() {
		return this.iva; 
	}
	
	public void setTipoimpuesto(
		String var
	) {
		this.tipoimpuesto=var; 
	}
	
	public String getTipoimpuesto() {
		return this.tipoimpuesto; 
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
	
	public void setSubpromproducto(
		List<Promproducto> var
	) {
		this.subpromproducto=var; 
	}
	
	public List<Promproducto> getSubpromproducto() {
		if(this.subpromproducto==null)this.subpromproducto=new ArrayList<>(0);
		  return this.subpromproducto; 
	}
	
	public void setSuberprlineapedido(
		List<Erprlineapedido> var
	) {
		this.suberprlineapedido=var; 
	}
	
	public List<Erprlineapedido> getSuberprlineapedido() {
		if(this.suberprlineapedido==null)this.suberprlineapedido=new ArrayList<>(0);
		  return this.suberprlineapedido; 
	}
	
	public void setSuberplineafactprov(
		List<Erplineafactprov> var
	) {
		this.suberplineafactprov=var; 
	}
	
	public List<Erplineafactprov> getSuberplineafactprov() {
		if(this.suberplineafactprov==null)this.suberplineafactprov=new ArrayList<>(0);
		  return this.suberplineafactprov; 
	}
	
	public void setSuberplineafactura(
		List<Erplineafactura> var
	) {
		this.suberplineafactura=var; 
	}
	
	public List<Erplineafactura> getSuberplineafactura() {
		if(this.suberplineafactura==null)this.suberplineafactura=new ArrayList<>(0);
		  return this.suberplineafactura; 
	}
	
	public void setSuberpfactura(
		List<Erpfactura> var
	) {
		this.suberpfactura=var; 
	}
	
	public List<Erpfactura> getSuberpfactura() {
		if(this.suberpfactura==null)this.suberpfactura=new ArrayList<>(0);
		  return this.suberpfactura; 
	} 

}