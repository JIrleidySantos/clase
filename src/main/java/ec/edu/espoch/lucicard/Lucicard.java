/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package ec.edu.espoch.lucicard;

import ec.edu.espoch.lucicard.clases.Planetas;
import ec.edu.espoch.lucicard.enumeracion.TipoPlaneta;

/**
 *
 * @author mundo
 */
public class Lucicard {

    public static void main(String[] args) {
        
        Planetas objPlanetas=new Planetas("Saturno", 2,3.455,4.345,3.4757,4.757,TipoPlaneta.ENANO);
    
        
        objPlanetas.imprimir();
        
           double densidad=objPlanetas.calcularDensidadPlaneta();
           System.out.println("La densidad es: "+densidad);
        
        
    }
}
