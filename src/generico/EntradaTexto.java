/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package generico;

import java.awt.Dimension;
import java.awt.Point;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JTextField;

/**
 *
 * @author SAUL
 */
public abstract class EntradaTexto extends JTextField{
    
    
    public EntradaTexto(double alto, double ancho, int x, int y, Ventana padre){
        this.addKeyListener(new KeyListener(){
            @Override
            public void keyTyped(KeyEvent e) {
                //Terminas la accion de presionar la tecla
                completado(e);
            }

            @Override
            public void keyPressed(KeyEvent e) {
                //Bajas el dedo
                abajo(e);
            }

            @Override
            public void keyReleased(KeyEvent e) {
                //Subes el dedo
                arriba(e);
            }
        
        });
        Dimension d = new Dimension();
        d.setSize(ancho, alto);
        this.setSize(d);
        this.setLocation(new Point(x, y));
        this.setVisible(true);
        padre.add(this);
    }
    
    public abstract void abajo(KeyEvent e);
    public abstract void arriba(KeyEvent e);
    public abstract void completado(KeyEvent e);
    
}
