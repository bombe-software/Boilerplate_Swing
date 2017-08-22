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
 * @author SAUL
 */
public abstract class Boton extends JButton{
    
    public Boton(String text, int x, int y, Ventana padre){
        super();
        this.setText(text);
        
        this.setVisible(true);
        this.setSize(this.getPreferredSize());
        this.setVisible(false);
        this.setVisible(true);
        
        this.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                action();
            }
        });
        
        this.setLocation(new Point(x, y));
        
        padre.add(this);
    }
   
    public abstract void action();
}
