package org.suinsit.apps.portalemp;

import java.io.Serializable;
import java.lang.Integer;
import java.lang.Long;
import java.lang.String;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import org.enartframework.nocode.annotacion.Entidad;
import org.suinsit.apps.portalemp.Rrhempleado;
import org.suinsit.apps.portalemp.Rrhhctescontrato;
import org.suinsit.apps.portalemp.Rrhhrempcontra;

@Entity
@Table (
	name = "RRHMTIPOCONTA" 
)
@Entidad (
	type = "TABLE",
	pk = "idxrrhmtipoconta" 
)
public class Rrhmtipoconta implements Serializable { 

	private static final long serialVersionUID = 1L;
	@Column (
		name = "HORASANUALES",
		nullable = true 
	)
	private Integer horasanuales;
	@Column (
		name = "BONIFICADO",
		nullable = true 
	)
	private boolean bonificado;
	@Column (
		name = "DESCRIPCION",
		nullable = true 
	)
	private String descripcion;
	@Column (
		name = "DIASSEMANA",
		nullable = true 
	)
	private BigDecimal diassemana;
	@Column (
		name = "DIASVACACIONES",
		nullable = true 
	)
	private Integer diasvacaciones;
	@Column (
		name = "DOMINGOHORA",
		nullable = true 
	)
	private BigDecimal domingohora;
	@Column (
		name = "FICHARMANUAL",
		nullable = true 
	)
	private boolean ficharmanual;
	@Column (
		name = "FICHARSINTURNO",
		nullable = true 
	)
	private boolean ficharsinturno;
	@Column (
		name = "HORASSEMANA",
		nullable = true 
	)
	private BigDecimal horassemana;
	@Id
	@Column (
		name = "IDXRRHMTIPOCONTA",
		nullable = true 
	)
	private Long idxrrhmtipoconta;
	@Column (
		name = "JUEVESHORA",
		nullable = true 
	)
	private BigDecimal jueveshora;
	@Column (
		name = "LUNESHORA",
		nullable = true 
	)
	private BigDecimal luneshora;
	@Column (
		name = "MARTESHORA",
		nullable = true 
	)
	private BigDecimal marteshora;
	@Column (
		name = "MIERCOLESHORA",
		nullable = true 
	)
	private BigDecimal miercoleshora;
	@Column (
		name = "NOSUMFESTIVO",
		nullable = true 
	)
	private boolean nosumfestivo;
	@Column (
		name = "NOSUMHORASVACAS",
		nullable = true 
	)
	private boolean nosumhorasvacas;
	@Column (
		name = "NOTIFICAREMAIL",
		nullable = true 
	)
	private boolean notificaremail;
	@Column (
		name = "PERCENTBONIF",
		nullable = true 
	)
	private BigDecimal percentbonif;
	@Column (
		name = "REDONDEOFICHAJE",
		nullable = true 
	)
	private boolean redondeofichaje;
	@Column (
		name = "REFGOBIERNO",
		nullable = true 
	)
	private String refgobierno;
	@Column (
		name = "SABADOHORA",
		nullable = true 
	)
	private BigDecimal sabadohora;
	@Column (
		name = "SOBRETURNOS",
		nullable = true 
	)
	private boolean sobreturnos;
	@Column (
		name = "TIPOCONTRATO",
		nullable = true 
	)
	private String tipocontrato;
	@Column (
		name = "TIPODIAS",
		nullable = true 
	)
	private String tipodias;
	@Column (
		name = "VIERNESHORA",
		nullable = true 
	)
	private BigDecimal vierneshora;
	private boolean updatable;
	private List<Rrhhrempcontra> subrrhhrempcontra;
	private List<Rrhhctescontrato> subrrhhctescontrato;
	private List<Rrhempleado> subrrhempleado; 

	public void setHorasanuales(
		Integer var
	) {
		this.horasanuales=var; 
	}
	
	public Integer getHorasanuales() {
		return this.horasanuales; 
	}
	
	public void setBonificado(
		boolean var
	) {
		this.bonificado=var; 
	}
	
	public boolean isBonificado() {
		return this.bonificado; 
	}
	
	public void setDescripcion(
		String var
	) {
		this.descripcion=var; 
	}
	
	public String getDescripcion() {
		return this.descripcion; 
	}
	
	public void setDiassemana(
		BigDecimal var
	) {
		this.diassemana=var; 
	}
	
	public BigDecimal getDiassemana() {
		return this.diassemana; 
	}
	
	public void setDiasvacaciones(
		Integer var
	) {
		this.diasvacaciones=var; 
	}
	
	public Integer getDiasvacaciones() {
		return this.diasvacaciones; 
	}
	
	public void setDomingohora(
		BigDecimal var
	) {
		this.domingohora=var; 
	}
	
	public BigDecimal getDomingohora() {
		return this.domingohora; 
	}
	
	public void setFicharmanual(
		boolean var
	) {
		this.ficharmanual=var; 
	}
	
	public boolean isFicharmanual() {
		return this.ficharmanual; 
	}
	
	public void setFicharsinturno(
		boolean var
	) {
		this.ficharsinturno=var; 
	}
	
	public boolean isFicharsinturno() {
		return this.ficharsinturno; 
	}
	
	public void setHorassemana(
		BigDecimal var
	) {
		this.horassemana=var; 
	}
	
	public BigDecimal getHorassemana() {
		return this.horassemana; 
	}
	
	public void setIdxrrhmtipoconta(
		Long var
	) {
		this.idxrrhmtipoconta=var; 
	}
	
	public Long getIdxrrhmtipoconta() {
		return this.idxrrhmtipoconta; 
	}
	
	public void setJueveshora(
		BigDecimal var
	) {
		this.jueveshora=var; 
	}
	
	public BigDecimal getJueveshora() {
		return this.jueveshora; 
	}
	
	public void setLuneshora(
		BigDecimal var
	) {
		this.luneshora=var; 
	}
	
	public BigDecimal getLuneshora() {
		return this.luneshora; 
	}
	
	public void setMarteshora(
		BigDecimal var
	) {
		this.marteshora=var; 
	}
	
	public BigDecimal getMarteshora() {
		return this.marteshora; 
	}
	
	public void setMiercoleshora(
		BigDecimal var
	) {
		this.miercoleshora=var; 
	}
	
	public BigDecimal getMiercoleshora() {
		return this.miercoleshora; 
	}
	
	public void setNosumfestivo(
		boolean var
	) {
		this.nosumfestivo=var; 
	}
	
	public boolean isNosumfestivo() {
		return this.nosumfestivo; 
	}
	
	public void setNosumhorasvacas(
		boolean var
	) {
		this.nosumhorasvacas=var; 
	}
	
	public boolean isNosumhorasvacas() {
		return this.nosumhorasvacas; 
	}
	
	public void setNotificaremail(
		boolean var
	) {
		this.notificaremail=var; 
	}
	
	public boolean isNotificaremail() {
		return this.notificaremail; 
	}
	
	public void setPercentbonif(
		BigDecimal var
	) {
		this.percentbonif=var; 
	}
	
	public BigDecimal getPercentbonif() {
		return this.percentbonif; 
	}
	
	public void setRedondeofichaje(
		boolean var
	) {
		this.redondeofichaje=var; 
	}
	
	public boolean isRedondeofichaje() {
		return this.redondeofichaje; 
	}
	
	public void setRefgobierno(
		String var
	) {
		this.refgobierno=var; 
	}
	
	public String getRefgobierno() {
		return this.refgobierno; 
	}
	
	public void setSabadohora(
		BigDecimal var
	) {
		this.sabadohora=var; 
	}
	
	public BigDecimal getSabadohora() {
		return this.sabadohora; 
	}
	
	public void setSobreturnos(
		boolean var
	) {
		this.sobreturnos=var; 
	}
	
	public boolean isSobreturnos() {
		return this.sobreturnos; 
	}
	
	public void setTipocontrato(
		String var
	) {
		this.tipocontrato=var; 
	}
	
	public String getTipocontrato() {
		return this.tipocontrato; 
	}
	
	public void setTipodias(
		String var
	) {
		this.tipodias=var; 
	}
	
	public String getTipodias() {
		return this.tipodias; 
	}
	
	public void setVierneshora(
		BigDecimal var
	) {
		this.vierneshora=var; 
	}
	
	public BigDecimal getVierneshora() {
		return this.vierneshora; 
	}
	
	public void setUpdatable(
		boolean var
	) {
		this.updatable=var; 
	}
	
	public boolean isUpdatable() {
		return this.updatable; 
	}
	
	public void setSubrrhhrempcontra(
		List<Rrhhrempcontra> var
	) {
		this.subrrhhrempcontra=var; 
	}
	
	public List<Rrhhrempcontra> getSubrrhhrempcontra() {
		if(this.subrrhhrempcontra==null)this.subrrhhrempcontra=new ArrayList<>(0);
		  return this.subrrhhrempcontra; 
	}
	
	public void setSubrrhhctescontrato(
		List<Rrhhctescontrato> var
	) {
		this.subrrhhctescontrato=var; 
	}
	
	public List<Rrhhctescontrato> getSubrrhhctescontrato() {
		if(this.subrrhhctescontrato==null)this.subrrhhctescontrato=new ArrayList<>(0);
		  return this.subrrhhctescontrato; 
	}
	
	public void setSubrrhempleado(
		List<Rrhempleado> var
	) {
		this.subrrhempleado=var; 
	}
	
	public List<Rrhempleado> getSubrrhempleado() {
		if(this.subrrhempleado==null)this.subrrhempleado=new ArrayList<>(0);
		  return this.subrrhempleado; 
	} 

}