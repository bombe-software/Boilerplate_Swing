/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package generico;

import java.awt.Dimension;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.Timer;

/**
 *
 * @author SAUL FERNANDO GONZÁLEZ DOMINGUEZ
 * @author CARLOS EDUARDO GONZÁLEZ ANGUIANO
 * @version 1.0.1
 * @since 02-09-2017
 */
public abstract class Ventana extends JFrame{
    private Dimension screenSize;
    private Dimension frameSize;
    private Point frameLocation;
    
    /**
    * <h3>Ventana</h3>
    * 
    * Crea una ventana heredando propiedades de la clase padre
    */
    public Ventana(){
        super();
        
        //Configuración de una ventana genérica
        this.screenSize = new Dimension();
        this.frameSize = new Dimension();
        this.frameLocation = new Point();
        
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLayout(null);
        
        this.setVisible(true);
        this.screenSize.setSize(this.getHeight(), this.getWidth());
        this.frameSize.setSize(this.getHeight(), this.getWidth());
        this.frameLocation.setLocation(this.getLocation().x, this.getLocation().y);
        this.setVisible(false);
        
        //Quitar esto para programas posteriores
        this.setResizable(false);
    }
    
    public Dimension getScreenSize() {
        return screenSize;
    }

    public Dimension getFrameSize() {
        return frameSize;
    }

    public Point getFrameLocation() {
        return frameLocation;
    }
    
    public void setHeight(int porcentaje){
        this.frameSize.height = ((this.screenSize.height * porcentaje)/100);
    }
    
    public void setWidth(int porcentaje){
        this.frameSize.width = ((this.screenSize.height * porcentaje)/100);
    }
    
    public void setX(int porcentaje){
        this.frameLocation.x = ((this.screenSize.height * porcentaje)/100);
    }
    
    public void setY(int porcentaje){
        this.frameLocation.y = ((this.screenSize.width * porcentaje)/100);
    }
    
    //Crea la ventana en una locación en pantalla específica
    public void configFrame(int porcentaje_x, int porcentaje_y, int porcentaje_height, int porcentaje_width){
        this.setY(porcentaje_y);
        this.setX(porcentaje_x);
        this.setHeight(porcentaje_height);
        this.setWidth(porcentaje_width);
        this.render();
    }
    
    //Renderiza y carga los elementos de la ventana
    public void render(){
        this.setVisible(false);
        this.setLocation(this.frameLocation);
        this.setSize(this.frameSize);
        this.setVisible(true);
    }
    
    public void loop(int miliseconds){
        Timer timer = new Timer(miliseconds, new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                loopAction();
            }
        }); 
        timer.start();
    }
    
    public abstract void loopAction();
    
}
