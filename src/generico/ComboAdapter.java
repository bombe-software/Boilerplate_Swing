/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package generico;

/**
 *
 * @author SAUL FERNANDO GONZÁLEZ DOMINGUEZ
 * @author CARLOS EDUARDO GONZÁLEZ ANGUIANO
 * @version 1.0.1
 * @since 02-09-2017
 */
public class ComboAdapter extends Combo{

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
    public ComboAdapter(int x, int y, String[] string, Ventana padre) {
        super(x, y, string, padre);
    }

    /**
     * <h3>action</h3>
     * 
     * Método abstracto, permite reaccionar a un evento en el ComboAdapter
    */
    @Override
    public void action() {
        
    }
    
}
