/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package findecursoproject;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/**
 *
 * @author Nahuel
 */
public class dataController {
    
   public void crear(String fichero){
        ObjectOutputStream oos;
        try {
            oos = new ObjectOutputStream(new FileOutputStream(fichero));
            oos.close();
         
        } catch (FileNotFoundException ex) {
            System.out.println(ex.getMessage());
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
    
    
    public void insertar(String fichero, ArrayList<Object> elementos){
        //ClsProperties propiedad = new ClsProperties();
        //int registro = (int)propiedad.leer(property);
        //System.out.println(registro);
        
        try
        {
            ObjectOutputStream oos;
            oos = new ObjectOutputStream(new FileOutputStream(fichero));
            for (int i = 0; i <elementos.size(); i++)
            {
                // ojo, se hace un new por cada Persona. El new dentro
                // del bucle.
                Object elemento = new Object();
                elemento = elementos.get(i);
                //System.out.println(p.ToString()); 
                oos.writeObject(elemento);
            }
            oos.close();
        } catch (Exception e)
        {
            System.out.println(e.getMessage());
            //e.printStackTrace();
        }
    
    }
    
    
    public ArrayList<Object>  extraer (String fichero)
    {
        ArrayList<Object> objetos = new ArrayList<Object>();
        try
        {
            // Se crea un ObjectInputStream
            ObjectInputStream ois = new ObjectInputStream(
                    new FileInputStream(fichero));
            
            // Se lee el primer objeto
            Object aux = ois.readObject();
            // Mientras haya objetos
            while (aux!=null)
            {
                
                //if (aux instanceof ClsPersona)
                objetos.add(aux);
                    //System.out.println(aux.toString());
                aux = ois.readObject();
            }
            ois.close();
            
        }
        catch (FileNotFoundException ex) {

            crear(fichero);
        } 
        catch (EOFException e1)
        {
            //System.out.println ("Fin de fichero");
        }
        catch (Exception e2)
        {
            e2.printStackTrace();
        }
        return objetos;
    }
    
}
