package org.suinsit.apps.pmo;

import java.io.Serializable;
import java.lang.Long;
import java.lang.Object;
import java.lang.String;
import java.math.BigDecimal;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;
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
import org.suinsit.apps.pmo.Pmoaprobacion;
import org.suinsit.apps.pmo.Pmoctrocostes;
import org.suinsit.apps.pmo.Pmodepartament;
import org.suinsit.apps.pmo.Pmoestado;
import org.suinsit.apps.pmo.Pmomactivos;
import org.suinsit.apps.pmo.Pmoobjetivo;
import org.suinsit.apps.pmo.Pmopartidapre;
import org.suinsit.apps.pmo.Pmopatrocinador;
import org.suinsit.apps.pmo.Pmoprioridad;
import org.suinsit.apps.pmo.Pmorsuserproy;
import org.suinsit.apps.pmo.Pmotipoproyect;

@Entity
@Table (
	name = "PMOMPROJECT" 
)
@Entidad (
	type = "TABLE",
	pk = "idxpmomproject" 
)
public class Pmomproject implements Serializable { 

	private static final long serialVersionUID = 1L;
	@Column (
		name = "ACRONIMO",
		nullable = true 
	)
	private String acronimo;
	@Column (
		name = "ALTA",
		nullable = true 
	)
	private Date alta;
	@Column (
		name = "AVATAR",
		nullable = true 
	)
	private Object avatar;
	@Column (
		name = "BENEFICIOESPERA",
		nullable = true 
	)
	private BigDecimal beneficioespera;
	@Column (
		name = "CODPROYECTO",
		nullable = false 
	)
	@Sequence (
		name = "PMOMPROJECT_CODPROYECTO",
		prefix = "PR",
		mask = "000000",
		addYear = false 
	)
	private String codproyecto;
	@Column (
		name = "COUSERALTA",
		nullable = true 
	)
	private String couseralta;
	@Column (
		name = "COUSERMODIF",
		nullable = true 
	)
	private String cousermodif;
	@Column (
		name = "DESCRIPCIONOBJ",
		nullable = true 
	)
	private String descripcionobj;
	@Column (
		name = "FECHAFIN",
		nullable = true 
	)
	private Date fechafin;
	@Id
	@Column (
		name = "IDXPMOMPROJECT",
		nullable = true 
	)
	private Long idxpmomproject;
	@Column (
		name = "PROYECTO",
		nullable = false 
	)
	private String proyecto;
	@Column (
		name = "RESUMEN",
		nullable = true 
	)
	private String resumen;
	@Column (
		name = "TMALTA",
		nullable = true 
	)
	private String tmalta;
	@Column (
		name = "TMMODIF",
		nullable = true 
	)
	private String tmmodif;
	private boolean updatable;
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
		name = "IDPMOESTADO0",
		referencedColumnName = "IDXPMOESTADO",
		nullable = true,
		insertable = true,
		updatable = true 
	)
	private Pmoestado idpmoestado;
	@ManyToOne (
		fetch = javax.persistence.FetchType.LAZY 
	)
	@JoinColumn (
		name = "IDPMOPRIORIDAD0",
		referencedColumnName = "IDXPMOPRIORIDAD",
		nullable = true,
		insertable = true,
		updatable = true 
	)
	private Pmoprioridad idpmoprioridad;
	@ManyToOne (
		fetch = javax.persistence.FetchType.LAZY 
	)
	@JoinColumn (
		name = "IDPMOTIPOPROYECT0",
		referencedColumnName = "IDXPMOTIPOPROYECT",
		nullable = true,
		insertable = true,
		updatable = true 
	)
	private Pmotipoproyect idpmotipoproyect;
	@ManyToOne (
		fetch = javax.persistence.FetchType.LAZY 
	)
	@JoinColumn (
		name = "IDPMOAPROBACION0",
		referencedColumnName = "IDXPMOAPROBACION",
		nullable = true,
		insertable = true,
		updatable = true 
	)
	private Pmoaprobacion idpmoaprobacion;
	@ManyToOne (
		fetch = javax.persistence.FetchType.LAZY 
	)
	@JoinColumn (
		name = "IDPMODEPARTAMENT0",
		referencedColumnName = "IDXPMODEPARTAMENT",
		nullable = true,
		insertable = true,
		updatable = true 
	)
	private Pmodepartament idpmodepartament;
	@ManyToOne (
		fetch = javax.persistence.FetchType.LAZY 
	)
	@JoinColumn (
		name = "IDPMOOBJETIVO0",
		referencedColumnName = "IDXPMOOBJETIVO",
		nullable = true,
		insertable = true,
		updatable = true 
	)
	private Pmoobjetivo idpmoobjetivo;
	@ManyToOne (
		fetch = javax.persistence.FetchType.LAZY 
	)
	@JoinColumn (
		name = "IDPMOPATROCINADOR0",
		referencedColumnName = "IDXPMOPATROCINADOR",
		nullable = true,
		insertable = true,
		updatable = true 
	)
	private Pmopatrocinador idpmopatrocinador;
	@ManyToOne (
		fetch = javax.persistence.FetchType.LAZY 
	)
	@JoinColumn (
		name = "IDPMOCTROCOSTES0",
		referencedColumnName = "IDXPMOCTROCOSTES",
		nullable = true,
		insertable = true,
		updatable = true 
	)
	private Pmoctrocostes idpmoctrocostes;
	@ManyToOne (
		fetch = javax.persistence.FetchType.LAZY 
	)
	@JoinColumn (
		name = "IDPMOMACTIVOS0",
		referencedColumnName = "IDXPMOMACTIVOS",
		nullable = true,
		insertable = true,
		updatable = true 
	)
	private Pmomactivos idpmomactivos;
	@ManyToOne (
		fetch = javax.persistence.FetchType.LAZY 
	)
	@JoinColumn (
		name = "IDCLTEINTERNO0",
		referencedColumnName = "IDXCRMEMPRESA",
		nullable = true,
		insertable = true,
		updatable = true 
	)
	private Crmempresa idclteinterno;
	private List<Pmopartidapre> subpmopartidapre;
	private List<Pmorsuserproy> subpmorsuserproy; 

	public void setAcronimo(
		String var
	) {
		this.acronimo=var; 
	}
	
	public String getAcronimo() {
		return this.acronimo; 
	}
	
	public void setAlta(
		Date var
	) {
		this.alta=var; 
	}
	
	public Date getAlta() {
		return this.alta; 
	}
	
	public void setAvatar(
		Object var
	) {
		this.avatar=var; 
	}
	
	public Object getAvatar() {
		return this.avatar; 
	}
	
	public void setBeneficioespera(
		BigDecimal var
	) {
		this.beneficioespera=var; 
	}
	
	public BigDecimal getBeneficioespera() {
		return this.beneficioespera; 
	}
	
	public void setCodproyecto(
		String var
	) {
		this.codproyecto=var; 
	}
	
	public String getCodproyecto() {
		return this.codproyecto; 
	}
	
	public void setCouseralta(
		String var
	) {
		this.couseralta=var; 
	}
	
	public String getCouseralta() {
		return this.couseralta; 
	}
	
	public void setCousermodif(
		String var
	) {
		this.cousermodif=var; 
	}
	
	public String getCousermodif() {
		return this.cousermodif; 
	}
	
	public void setDescripcionobj(
		String var
	) {
		this.descripcionobj=var; 
	}
	
	public String getDescripcionobj() {
		return this.descripcionobj; 
	}
	
	public void setFechafin(
		Date var
	) {
		this.fechafin=var; 
	}
	
	public Date getFechafin() {
		return this.fechafin; 
	}
	
	public void setIdxpmomproject(
		Long var
	) {
		this.idxpmomproject=var; 
	}
	
	public Long getIdxpmomproject() {
		return this.idxpmomproject; 
	}
	
	public void setProyecto(
		String var
	) {
		this.proyecto=var; 
	}
	
	public String getProyecto() {
		return this.proyecto; 
	}
	
	public void setResumen(
		String var
	) {
		this.resumen=var; 
	}
	
	public String getResumen() {
		return this.resumen; 
	}
	
	public void setTmalta(
		String var
	) {
		this.tmalta=var; 
	}
	
	public String getTmalta() {
		return this.tmalta; 
	}
	
	public void setTmmodif(
		String var
	) {
		this.tmmodif=var; 
	}
	
	public String getTmmodif() {
		return this.tmmodif; 
	}
	
	public void setUpdatable(
		boolean var
	) {
		this.updatable=var; 
	}
	
	public boolean isUpdatable() {
		return this.updatable; 
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
	
	public void setIdssousuario(
		Ssousuario var
	) {
		this.idssousuario=var; 
	}
	
	public Ssousuario getIdssousuario() {
		if(this.idssousuario==null)this.idssousuario=new org.suinsit.apps.admin.Ssousuario();
		  return this.idssousuario; 
	}
	
	public void setIdpmoestado(
		Pmoestado var
	) {
		this.idpmoestado=var; 
	}
	
	public Pmoestado getIdpmoestado() {
		if(this.idpmoestado==null)this.idpmoestado=new org.suinsit.apps.pmo.Pmoestado();
		  return this.idpmoestado; 
	}
	
	public void setIdpmoprioridad(
		Pmoprioridad var
	) {
		this.idpmoprioridad=var; 
	}
	
	public Pmoprioridad getIdpmoprioridad() {
		if(this.idpmoprioridad==null)this.idpmoprioridad=new org.suinsit.apps.pmo.Pmoprioridad();
		  return this.idpmoprioridad; 
	}
	
	public void setIdpmotipoproyect(
		Pmotipoproyect var
	) {
		this.idpmotipoproyect=var; 
	}
	
	public Pmotipoproyect getIdpmotipoproyect() {
		if(this.idpmotipoproyect==null)this.idpmotipoproyect=new org.suinsit.apps.pmo.Pmotipoproyect();
		  return this.idpmotipoproyect; 
	}
	
	public void setIdpmoaprobacion(
		Pmoaprobacion var
	) {
		this.idpmoaprobacion=var; 
	}
	
	public Pmoaprobacion getIdpmoaprobacion() {
		if(this.idpmoaprobacion==null)this.idpmoaprobacion=new org.suinsit.apps.pmo.Pmoaprobacion();
		  return this.idpmoaprobacion; 
	}
	
	public void setIdpmodepartament(
		Pmodepartament var
	) {
		this.idpmodepartament=var; 
	}
	
	public Pmodepartament getIdpmodepartament() {
		if(this.idpmodepartament==null)this.idpmodepartament=new org.suinsit.apps.pmo.Pmodepartament();
		  return this.idpmodepartament; 
	}
	
	public void setIdpmoobjetivo(
		Pmoobjetivo var
	) {
		this.idpmoobjetivo=var; 
	}
	
	public Pmoobjetivo getIdpmoobjetivo() {
		if(this.idpmoobjetivo==null)this.idpmoobjetivo=new org.suinsit.apps.pmo.Pmoobjetivo();
		  return this.idpmoobjetivo; 
	}
	
	public void setIdpmopatrocinador(
		Pmopatrocinador var
	) {
		this.idpmopatrocinador=var; 
	}
	
	public Pmopatrocinador getIdpmopatrocinador() {
		if(this.idpmopatrocinador==null)this.idpmopatrocinador=new org.suinsit.apps.pmo.Pmopatrocinador();
		  return this.idpmopatrocinador; 
	}
	
	public void setIdpmoctrocostes(
		Pmoctrocostes var
	) {
		this.idpmoctrocostes=var; 
	}
	
	public Pmoctrocostes getIdpmoctrocostes() {
		if(this.idpmoctrocostes==null)this.idpmoctrocostes=new org.suinsit.apps.pmo.Pmoctrocostes();
		  return this.idpmoctrocostes; 
	}
	
	public void setIdpmomactivos(
		Pmomactivos var
	) {
		this.idpmomactivos=var; 
	}
	
	public Pmomactivos getIdpmomactivos() {
		if(this.idpmomactivos==null)this.idpmomactivos=new org.suinsit.apps.pmo.Pmomactivos();
		  return this.idpmomactivos; 
	}
	
	public void setIdclteinterno(
		Crmempresa var
	) {
		this.idclteinterno=var; 
	}
	
	public Crmempresa getIdclteinterno() {
		if(this.idclteinterno==null)this.idclteinterno=new org.suinsit.apps.crm.Crmempresa();
		  return this.idclteinterno; 
	}
	
	public void setSubpmopartidapre(
		List<Pmopartidapre> var
	) {
		this.subpmopartidapre=var; 
	}
	
	public List<Pmopartidapre> getSubpmopartidapre() {
		if(this.subpmopartidapre==null)this.subpmopartidapre=new ArrayList<>(0);
		  return this.subpmopartidapre; 
	}
	
	public void setSubpmorsuserproy(
		List<Pmorsuserproy> var
	) {
		this.subpmorsuserproy=var; 
	}
	
	public List<Pmorsuserproy> getSubpmorsuserproy() {
		if(this.subpmorsuserproy==null)this.subpmorsuserproy=new ArrayList<>(0);
		  return this.subpmorsuserproy; 
	} 

}