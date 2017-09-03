/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package generico;

import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JComboBox;

/**
 *
 * @author SAUL FERNANDO GONZÁLEZ DOMINGUEZ
 * @author CARLOS EDUARDO GONZÁLEZ ANGUIANO
 * @version 1.0.1
 * @since 02-09-2017
 */


public abstract class Combo extends JComboBox<String>{

    /**
        * <h3>EntradaTextoAdapter</h3>
        * 
        * Constructor que hereda de JTable para generar una tabla
        * personalizada
        * 
        * @param x altura del elemento en porcentaje
        * @param y ancho del elemento en porcentaje
        * @param string opciones del combo
        * @param padre marco al que se está agregando el texto (this)
    */
    public Combo(int x, int y, String[] string, Ventana padre) {
        super(string);
        this.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                action();
            } 
        });
        this.setLocation(new Point(x, y));
        this.setVisible(true);
        this.setSize(this.getPreferredSize());
        padre.add(this);
    }
    public abstract void action();
}
