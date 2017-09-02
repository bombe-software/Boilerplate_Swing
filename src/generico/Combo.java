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
 */
public abstract class Combo extends JComboBox<String>{

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
