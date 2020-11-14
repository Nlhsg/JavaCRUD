/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package findecursoproject;

import java.io.Serializable;

/**
 *
 * @author Nahuel
 */
public class extCliente extends clsPersona implements Serializable{

    /**
     * @return the preferencial
     */
    public boolean isPreferencial() {
        return preferencial;
    }

    /**
     * @param preferencial the preferencial to set
     */
    public void setPreferencial(boolean preferencial) {
        this.preferencial = preferencial;
    }

    public extCliente(){
        super();
    }
    
    public extCliente(boolean preferencial, String cedula, String apellido,String nombre,String tipo) {
        super(cedula, apellido,nombre,tipo);
        this.preferencial = preferencial;
    }
    
        private boolean preferencial;
}
