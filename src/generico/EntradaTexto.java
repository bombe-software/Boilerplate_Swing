/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package generico;

import java.awt.Dimension;
import java.awt.Point;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JTextField;

/**
 *
 * @author SAUL FERNANDO GONZÁLEZ DOMINGUEZ
 * @author CARLOS EDUARDO GONZÁLEZ ANGUIANO 
 */
public abstract class EntradaTexto extends JTextField{
    
    
    public EntradaTexto(int x, int y, double alto, double ancho, Ventana padre){
        this.addKeyListener(new KeyAdapter()
        {
            public void keyTyped(KeyEvent e) {                
                validar(e);
            }
        });
        Dimension d = new Dimension();
        d.setSize(ancho, alto);
        this.setSize(d);
        this.setLocation(new Point(x, y));
        this.setVisible(true);
        padre.add(this);
    }
    
    public abstract void validar(KeyEvent e);
    
}
