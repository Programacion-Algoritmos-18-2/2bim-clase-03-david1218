/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete1;

/**
 *
 * @author David Hernan S
 */
public class Estadio {
    String nombre;
    double capacidad;
    String tipo_deporte;
    
    public void agregar_nombre(String nom){
        nombre = nom;
    }
    public void agregar_capacidad(double cap){
        capacidad = cap;
    }
    public void agregar_tipo_deporte(String deport){
        tipo_deporte = deport;
    }
    public String obtener_nombre(){
        return nombre;
    }
    public double obtener_capacidad(){
        return capacidad;
    }
    public String obtener_tipo_deporte(){
        return tipo_deporte;
    }
    public String toString(){
        return String.format("%s %d % s",nombre,capacidad, tipo_deporte);
    }
}

