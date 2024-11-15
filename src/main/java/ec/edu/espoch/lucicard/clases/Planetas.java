/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espoch.lucicard.clases;

import ec.edu.espoch.lucicard.enumeracion.TipoPlaneta;

/**
 *
 * @author mundo
 */
public class Planetas {
    
    //atributos
    public String nombre;
    public int cantSatelites;
    public double volumen;
    public double masaKilogramo;
    public double diametroKilometro;
    public double distancia;
    public TipoPlaneta tipoPlaneta;
    public boolean exterior=false;
    
    // constructor 
    
    public Planetas(){
        
    }

    public Planetas(String nombre, int cantSatelites, double volumen, double masaKilogramo, double diametroKilometro, double distancia, TipoPlaneta tipoPlaneta) {
        this.nombre = nombre;
        this.cantSatelites = cantSatelites;
        this.volumen = volumen;
        this.masaKilogramo = masaKilogramo;
        this.diametroKilometro = diametroKilometro;
        this.distancia = distancia;
        this.tipoPlaneta = tipoPlaneta;
        this.exterior();
    }
  
    
    //constructor vacio 
  
    
    public void imprimir(){
        System.out.println("Nombre"+nombre);
        System.out.println("Cantidad de Satelites"+cantSatelites);
        System.out.println("Volumen"+volumen);
        System.out.println("Masa en Kilogramos"+masaKilogramo);
        System.out.println("Diametro en Kilogramos"+diametroKilometro);
        System.out.println("Distancia"+distancia);
        System.out.println("Tipo Planeta"+tipoPlaneta.GASEOSO);
    }
        public double calcularDensidadPlaneta(){
            return masaKilogramo/volumen;
        }
        public boolean exterior(){
            
                double maximo=3.4;
                double distan=149597870;
                double limite=maximo*distan;
                
                if (distancia>limite){
                    exterior=true;
                }
            return exterior;
        }
            
    
} 
