package classroom_ws_gi;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Ruben Dario Fernandez C. <rdario45@gmail.com>}
 * @version 1.0 16/07/2013
 */
@XmlRootElement
public class Actividad {

    private String tipoNota;
    private Integer numeroEvaluacion;
    private String descripcionEvaluacion;
    private BigDecimal porcentaje;
    private String nota;

    public String getDescripcionEvaluacion() {
        return descripcionEvaluacion;
    }

    public void setDescripcionEvaluacion(String descripcionEvaluacion) {
        this.descripcionEvaluacion = descripcionEvaluacion;
    }

    public String getNota() {
        return nota;
    }

    public void setNota(String nota) {
        this.nota = nota;
    }

    public Integer getNumeroEvaluacion() {
        return numeroEvaluacion;
    }

    public void setNumeroEvaluacion(Integer numeroEvaluacion) {
        this.numeroEvaluacion = numeroEvaluacion;
    }

    public BigDecimal getPorcentaje() {
        return porcentaje;
    }

    public void setPorcentaje(BigDecimal porcentaje) {
        this.porcentaje = porcentaje;
    }

    public String getTipoNota() {
        return tipoNota;
    }

    public void setTipoNota(String tipoNota) {
        this.tipoNota = tipoNota;
    }

    


}
