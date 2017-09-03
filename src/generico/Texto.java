/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package generico;

import java.awt.Point;
import javax.swing.JLabel;

/**
 *
 * @author SAUL FERNANDO GONZÁLEZ DOMINGUEZ
 * @author CARLOS EDUARDO GONZÁLEZ ANGUIANO
 * @version 1.0.1
 * @since 02-09-2017
 */

//Clase general para JLabels pre-configurados
public class Texto extends JLabel{
    /**
    * <h3>Texto</h3>
    * 
    * Constructor que hereda de JLabel para generar una etiqueta
    * personalizada de texto
    * 
    * @param text Contenido del texto
    * @param x ancho del elemento
    * @param y alto del elemento
    * @param padre marco al que se está agregando el texto (this)
    */
    public Texto(String text, int x, int y, Ventana padre){
        super();
        this.setText(text);
        
        this.setVisible(true);
        this.setSize(this.getPreferredSize());
        
        
        this.setLocation(new Point(x, y));
        padre.add(this);
    }
}
