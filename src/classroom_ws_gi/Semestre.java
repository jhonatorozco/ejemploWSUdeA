package classroom_ws_gi;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Andres Felipe Arrubla Z.
 */
@XmlRootElement
public class Semestre {

    private Long semestre;
    private Long programa;
    private String nombrePrograma;
    private String inicioSemestre;
    private String finSemestre;
    private String promedioSemestre;
    private Double promedioPrograma;
    private Double promedioUniversidad;
    private String tercioProgramaNivel;
    private Integer creditosAcumulados;
    private Integer creditosfaltantes;
    private Integer numeroAprobadas;
    private Integer numeroPerdidas;
    private Integer numeroCanceladas;
    private String tipoHomologacion;

    @XmlTransient
    public Integer getCreditosAcumulados() {
        return creditosAcumulados;
    }

    public void setCreditosAcumulados(Integer creditosAcumulados) {
        this.creditosAcumulados = creditosAcumulados;
    }

    @XmlTransient
     public Integer getCreditosfaltantes() {
        return creditosfaltantes;
    }

    public void setCreditosfaltantes(Integer creditosfaltantes) {
        this.creditosfaltantes = creditosfaltantes;
    }

    @XmlTransient
    public String getNombrePrograma() {
        return nombrePrograma;
    }

    public void setNombrePrograma(String nombrePrograma) {
        this.nombrePrograma = nombrePrograma;
    }

    @XmlTransient
    public String getFinSemestre() {
        return finSemestre;
    }

    public void setFinSemestre(String finSemestre) {
        this.finSemestre = finSemestre;
    }

    @XmlTransient
    public String getInicioSemestre() {
        return inicioSemestre;
    }

    public void setInicioSemestre(String inicioSemestre) {
        this.inicioSemestre = inicioSemestre;
    }

    @XmlTransient
    public Integer getNumeroAprobadas() {
        return numeroAprobadas;
    }

    public void setNumeroAprobadas(Integer numeroAprobadas) {
        this.numeroAprobadas = numeroAprobadas;
    }

    @XmlTransient
    public Integer getNumeroCanceladas() {
        return numeroCanceladas;
    }

    public void setNumeroCanceladas(Integer numeroCanceladas) {
        this.numeroCanceladas = numeroCanceladas;
    }

    @XmlTransient
    public Integer getNumeroPerdidas() {
        return numeroPerdidas;
    }

    public void setNumeroPerdidas(Integer numeroPerdidas) {
        this.numeroPerdidas = numeroPerdidas;
    }

    @XmlTransient
    public Long getPrograma() {
        return programa;
    }

    public void setPrograma(Long programa) {
        this.programa = programa;
    }

    @XmlTransient
    public Double getPromedioPrograma() {
        return promedioPrograma;
    }

    public void setPromedioPrograma(Double promedioPrograma) {
        this.promedioPrograma = promedioPrograma;
    }

    public String getPromedioSemestre() {
        return promedioSemestre;
    }

    public void setPromedioSemestre(String promedioSemestre) {
        this.promedioSemestre = promedioSemestre;
    }

    @XmlTransient
    public Double getPromedioUniversidad() {
        return promedioUniversidad;
    }

    public void setPromedioUniversidad(Double promedioUniversidad) {
        this.promedioUniversidad = promedioUniversidad;
    }

    public Long getSemestre() {
        return semestre;
    }

    public void setSemestre(Long semestre) {
        this.semestre = semestre;
    }

    @XmlTransient
    public String getTercioProgramaNivel() {
        return tercioProgramaNivel;
    }

    public void setTercioProgramaNivel(String tercioProgramaNivel) {
        this.tercioProgramaNivel = tercioProgramaNivel;
    }

    @XmlTransient
    public String getTipoHomologacion() {
        return tipoHomologacion;
    }

    public void setTipoHomologacion(String tipoHomologacion) {
        this.tipoHomologacion = tipoHomologacion;
    }
}
