/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classroom_ws_gi;

import co.edu.udea.exception.OrgSistemasSecurityException;
import java.util.List;

/**
 *
 * @author Laptop
 */
public class ClassRoom_WS_GI {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)    {
       Consumo consumo = new Consumo();
       String resultado = consumo.Login("", "");
       System.out.println("Resultado"+resultado);
    }
    
}
