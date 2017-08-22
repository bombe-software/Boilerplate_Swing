/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import vista.Prueba;

/**
 *
 * @author SAUL
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
