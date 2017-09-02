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
 */

//Clase general para JLabels pre-configurados
public class Texto extends JLabel{
    public Texto(String text, int x, int y, Ventana padre){
        super();
        this.setText(text);
        
        this.setVisible(true);
        this.setSize(this.getPreferredSize());
        
        
        this.setLocation(new Point(x, y));
        padre.add(this);
    }
}
