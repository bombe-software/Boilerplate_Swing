/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package generico;

import java.awt.event.KeyEvent;

/**
 *
 * @author SAUL FERNANDO GONZÁLEZ DOMINGUEZ
 * @author CARLOS EDUARDO GONZÁLEZ ANGUIANO
 * @version 1.0.1
 * @since 02-09-2017
 */
public class EntradaTextoAdapter extends EntradaTexto{

    /**
        * <h3>EntradaTextoAdapter</h3>
        * 
        * Constructor que hereda de JTable para generar una tabla
        * personalizada
        * 
        * @param x locacion horizontal del elemento en pantalla en porcentaje
        * @param y locacion vertical del elemento en pantalla en porcentaje
        * @param alto altura del elemento en porcentaje
        * @param ancho ancho del elemento en porcentaje
        * @param padre marco al que se está agregando el texto (this)
    */
    public EntradaTextoAdapter(int x, int y, double alto, double ancho, Ventana padre) {
        super(x, y, alto, ancho, padre);
    }
    
    /**
     * <h3>validar</h3>
     * 
     * Método abstracto, permite reaccionar a un evento en la EntradaTextoAdapter
     * 
     * @param e Evento dentro del elemento de texto
    */
    @Override
    public void validar(KeyEvent e) {
        
    }
    
}
