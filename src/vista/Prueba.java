/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import generico.Boton;
import generico.EntradaTexto;
import generico.Ventana;
import java.awt.event.KeyEvent;

/**
 *
 * @author SAUL
 */
public class Prueba extends Ventana{
    private Boton btn;
    private EntradaTexto inputTxt;
    
    public Prueba(){
        
        btn = new Boton("some", 100, 100, this){
            @Override
            public void action() {
                
            }
        };
        
        inputTxt = new EntradaTexto(20, 100, 10, 10, this){
            @Override
            public void abajo(KeyEvent e) {
                
            }

            @Override
            public void arriba(KeyEvent e) {
                
            }

            @Override
            public void completado(KeyEvent e) {
               
            }
        };
        
    }
    
    @Override
    public void loopAction() {
        
    }
    
}
