/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gt.umg.viaje.logs;

import org.slf4j.MDC;

/**
 *
 * @author Steven
 */
public class ConfiguracionLogs {

    public static String Llave = "aplicacion";

    public static String Discriminador() {
        return "megapaca/testApp/1.0.0.0";
    }
    
    public static void agregarLlave() {
        MDC.put(Llave, Discriminador());
    }
    
    public static void removerLlave() {
        MDC.remove(Llave);
    }

}
