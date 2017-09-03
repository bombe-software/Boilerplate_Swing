/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package generico;

import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;

/**
 *
 * @author SAUL FERNANDO GONZÁLEZ DOMINGUEZ
 * @author CARLOS EDUARDO GONZÁLEZ ANGUIANO
 * @version 1.0.1
 * @since 02-09-2017
 */
public abstract class Boton extends JButton{
    
    /**
    * <h3>Boton</h3>
    * 
    * Constructor que hereda de JButton para generar un boton personalizado
    * 
    * @param text Contenido del texto
    * @param x ancho del elemento
    * @param y alto del elemento
    * @param padre marco al que se está agregando el texto (this)
    */
    public Boton(String text, int x, int y, Ventana padre){
        super();
        this.setText(text);
        
        this.setVisible(true);
        this.setSize(this.getPreferredSize());
        
        this.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                //Método abstracto para implementar acciones en Botones
                action();
            }
        });
        
        this.setLocation(new Point(x, y));
        
        //Agrega el elemento al objeto padre
        padre.add(this);
    }
   
    /**
    * <h3>action</h3>
    * 
    * Método abstracto para implementar una acción en el botón
    */
    public abstract void action();
}
