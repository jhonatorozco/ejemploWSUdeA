package classroom_ws_gi;

import co.edu.udea.exception.OrgSistemasSecurityException;
import co.edu.udea.wsClient.OrgSistemasWebServiceClient;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Clase principal de conexion con el API de gestion informatica.
 *
 * @author Ruben Dario Fernandez C. <rdario45@gmail.com>
 * @version 1.1 17/07/2013
 */
public class Consumo {
    //token de acceso asignado al servidor hakuna.udea.edu.co
    private String TOKEN = "5facbdd992ecd3e667df2b544e22a80a8274fd59";
    //clave publica requerida cuando los metodos invocados requieren cifrado
    private String CLAVE = "251860937072417361372773";

    //nombre del metodo para consultar los semestres cursados por un estudiante
    private static final String HISTORIA = "consultainformacionacademicamares";
    //nombre del metodo para consultar las materias cursadas en un semestre
    private static final String MATERIAS = "consultamateriasestudiantemares";
    //nombre del metodo para consultar las notas de las actividades de una materia
    private static final String NOTAS = "consultarnotaparcialestudiantemares";
    //nombre del metodo para verificar si un estudiante puede ver las notas de un curso;
    private static final String VERNOTAS = "estudiantepuedevernotascursomares";
    //nombre del metodo para validar usuarios contra MARES
    private static final String VALIDACION = "validarusuariooidxcn";

    private volatile OrgSistemasWebServiceClient wsCliente;
    private final Object serviceLock = new Object();

    /**
     * Constructor para invocar los servicios de SIKUANI desde pruebas y con
     * cifrado.
     *
     * @param requiereCifrado, true si el metodo invocado requiere los
     * parametros cifrados.
     */
    public Consumo() {
        try {
            /**
             * Clave publica del servidor 
             * true si es prueba y false si es produccion
             */
             wsCliente = new OrgSistemasWebServiceClient(CLAVE, true);
        } catch (OrgSistemasSecurityException ex) {
            Logger.getLogger(Consumo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public String Login(String usuario, String clave) {
        wsCliente.addParam("usuario", usuario);
        wsCliente.addParam("clave", clave);
        String respuesta = null;
        try {
            respuesta = wsCliente.obtenerString(VALIDACION, TOKEN);
        } catch (OrgSistemasSecurityException ex) {
            Logger.getLogger(Consumo.class.getName()).log(Level.SEVERE, null, ex);
        }
        return respuesta;
    }

    /**
     * Obtiene un listado de los semestres cursados por un estudiante.
     *
     * @param cedula Cedula del estudiante al cual se le consultan los
     * semestres.
     * @return Lista de semestres.
     */
    public List<Semestre> obtenerSemestres(String cedula) throws OrgSistemasSecurityException {
        wsCliente.addParam("cedula", cedula);

        List<Semestre> semestres = null;
        semestres = wsCliente.obtenerBean(HISTORIA, TOKEN, Semestre.class);

        return semestres;
    }
}