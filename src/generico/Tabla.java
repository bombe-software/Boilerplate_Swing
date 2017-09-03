/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package generico;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Point;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author SAUL FERNANDO GONZÁLEZ DOMINGUEZ
 * @author CARLOS EDUARDO GONZÁLEZ ANGUIANO
 * @version 1.0.1
 * @since 02-09-2017
 */
//Clase tabla generica, con pre-configuraciones y métodos
//Hereda de JTable


public class Tabla extends JTable{
    private DefaultTableModel modelo;
    private JScrollPane contenedor;
    
    /**
        * <h3>Tabla</h3>
        * 
        * Constructor que hereda de JTable para generar una tabla
        * personalizada
        * 
        * @param x locacion horizontal del elemento en pantalla en porcentaje
        * @param y locacion vertical del elemento en pantalla en porcentaje
        * @param alto altura del elemento en porcentaje
        * @param ancho ancho del elemento en porcentaje
        * @param nombreColumnas arreglo de objetos para nombrar las columnas
        * @param padre marco al que se está agregando el texto (this)
    */
    public Tabla(int x, int y, double alto, double ancho, Object[] nombreColumnas, Ventana padre){
        Dimension d =new Dimension();
        d.setSize(ancho, alto);
        
        //Creacion de un modelo para manejar los datos de una tabla
        this.modelo = new DefaultTableModel();

        //Modificar el modelo por defecto de la tabla por un nuevo modelo previamente creado.
        this.setModel(this.modelo);
        
        //Modifica cabezara o columnas de la tabla
        this.modelo.setColumnIdentifiers(nombreColumnas);
        
        this.setPreferredScrollableViewportSize(d);
        
        this.contenedor = new JScrollPane(this);
        
        this.contenedor.setVisible(true);
        this.contenedor.setLocation(new Point(x, y));
        
       
        this.contenedor.setSize(d);
        padre.add(this.contenedor);
    }
    
    /**
        * <h3>Tabla</h3>
        * 
        * Constructor que hereda de JTable para generar una tabla
        * personalizada sin la configuración de ubicación o tamaño
        * 
        * @param nombreColumnas arreglo de objetos para nombrar las columnas
        * @param padre marco al que se está agregando el texto (this)
    */
    public Tabla(Object[] nombreColumnas, Ventana padre){
        
        //Creacion de un modelo para manejar los datos de una tabla
        this.modelo = new DefaultTableModel();

        //Modificar el modelo por defecto de la tabla por un nuevo modelo previamente creado.
        this.setModel(this.modelo);
        
        //Modifica cabezara o columnas de la tabla
        this.modelo.setColumnIdentifiers(nombreColumnas);
        
       
        
        this.contenedor = new JScrollPane(this);
        
        this.setPreferredScrollableViewportSize(padre.getFrameSize());
        
        this.contenedor.setSize(padre.getSize());
        
        this.contenedor.setVisible(true);
        this.contenedor.setLocation(new Point(0, 0));
        
       
        padre.add(this.contenedor);
        padre.setLayout(new FlowLayout());
        padre.pack();
    }

    public DefaultTableModel getModelo() {
        return modelo;
    }

    public JScrollPane getContenedor() {
        return contenedor;
    }
  
    /**
        * <h3>agregarRegistro</h3>
        * 
        * Agrega un elemento a la tabla de registros
        * 
        * @param object objeto que se quiere agregar a la tabla
    */
    public void agregarRegistro(Object [] object){
        //Agrega una fila a la tabla      
        this.modelo.addRow(object);
    }
}
