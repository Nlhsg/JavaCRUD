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
public class extEmpleado extends clsPersona implements Serializable{

    /**
     * @return the antiguedad
     */
    public Fecha getAntiguedad() {
        return antiguedad;
    }

    /**
     * @param antiguedad the antiguedad to set
     */
    public void setAntiguedad(Fecha antiguedad) {
        this.antiguedad = antiguedad;
    }

    /**
     * @return the categoria
     */
    public int getCategoria() {
        return categoria;
    }

    /**
     * @param categoria the categoria to set
     */
    public void setCategoria(int categoria) {
        this.categoria = categoria;
    }
        public extEmpleado(){
            super();
        }
    public extEmpleado(Fecha antiguedad, int categoria) {
        this.antiguedad = antiguedad;
        this.categoria = categoria;
    }

    public extEmpleado(Fecha antiguedad, int categoria, String cedula, String apellido,String nombre,String tipo) {
        super(cedula, apellido,nombre,tipo);
        this.antiguedad = antiguedad;
        this.categoria = categoria;
    }
    
     private Fecha antiguedad;
    private int categoria;
}
