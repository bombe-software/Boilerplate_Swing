/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import vista.Prueba;

/**
 * Propósito: Es una plantilla de elementos gráficos que hereda de las librerías
 * Swing para hacer más fácil la creacion y configuración de elementos.
 * 
 * @author SAUL FERNANDO GONZÁLEZ DOMINGUEZ
 * @author CARLOS EDUARDO GONZÁLEZ ANGUIANO
 * @version 1.0.1
 * @since 02-09-2017
 */
public class main {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Prueba v = new Prueba();
        v.configFrame(25, 25, 25, 50);
        v.render();
    }
}
