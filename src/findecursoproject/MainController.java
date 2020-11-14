/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package findecursoproject;


import findecursoproject.GUI.frmPersona;
import java.util.ArrayList;

/**
 *
 * @author Nahuel
 */
public class MainController {
    public static  ArrayList<Object> persona = new ArrayList();
   public static dataController controller = new dataController();
   int id=0; 
   /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
                    
      ArrayList<Object> pers = controller.extraer("personas.dat");
         int indice =controller.extraer("personas.dat").size();
 
        
        for(int i=0;i < indice;i++){
            clsPersona obj = new clsPersona();
            obj = (clsPersona)pers.get(i);
        if(obj.getTipo().equals("Cliente")){
            extCliente cliente = new extCliente();
            cliente = (extCliente)pers.get(i);
             System.out.println("-------");
            System.out.println(cliente.getNombre());
            System.out.println(cliente.isPreferencial()); 
        }else if(obj.getTipo().equals("Empleado")){
             extEmpleado empleado = new extEmpleado();
            empleado = (extEmpleado)pers.get(i);
            System.out.println(empleado.getNombre()); 
            System.out.println(empleado.getAntiguedad()); 
            System.out.println(empleado.getCategoria()); 
        }
        }
     
       
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmPersona.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new frmPersona().setVisible(true);
            
        });
     
    }
      
    
    public static void addPersonaCliente(boolean preferencial, String cedula, String apellido,String nombre,String tipo){
        extCliente a= new extCliente(preferencial,cedula,apellido,nombre,tipo);
   
         persona.add(a);
         controller.insertar("personas.dat", persona);
         System.out.println("Cliente Añadido");
      
      }
       public static void addPersonaEmpleado(Fecha antiguedad, int categoria, String cedula, String apellido,String nombre,String tipo){
        extEmpleado a= new extEmpleado(antiguedad,categoria,cedula,apellido,nombre,tipo);
         persona.add(a);
          controller.insertar("personas.dat", persona);
          System.out.println("Empleado Añadido");
       
          
      } 
}
