package paquete1;

// Fig. 14.12: PruebaLeerArchivoTexto.java
import lecturaArchivosClase.*;
// Fig. 14.12: PruebaLeerArchivoTexto.java

// Fig. 14.12: PruebaLeerArchivoTexto.java
// Este programa prueba la clase LeerArchivoTexto.
public class PruebaLeerArchivoTexto1 {

    public static void main(String args[]) {
        LeerArchivoTexto11 aplicacion = new LeerArchivoTexto11();

        aplicacion.abrirArchivo();
        OperacionData operacion = new OperacionData();
        operacion.agregarInformacion(aplicacion.leerRegistros());

        System.out.printf("promedio: %.2f", operacion.obtener_promedio());
        aplicacion.cerrarArchivo();
    } // fin de main
} // fin de la clase PruebaLeerArchivoTexto

/**************************************************************************
 * (C) Copyright 1992-2007 por Deitel & Associates, Inc. y                *
 * Pearson Education, Inc. Todos los derechos reservados.                 *
 *                                                                        *
 * RENUNCIA: Los autores y el editor de este libro han realizado su mejor *
 * esfuerzo para preparar este libro. Esto incluye el desarrollo, la      *
 * investigaci�n y prueba de las teor�as y programas para determinar su   *
 * efectividad. Los autores y el editor no hacen ninguna garant�a de      *
 * ning�n tipo, expresa o impl�cita, en relaci�n con estos programas o    *
 * con la documentaci�n contenida en estos libros. Los autores y el       *
 * editor no ser�n responsables en ning�n caso por los da�os consecuentes *
 * en conexi�n con, o que surjan de, el suministro, desempe�o o uso de    *
 * estos programas.                                                       *
 *************************************************************************/