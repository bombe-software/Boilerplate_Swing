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
 */
public class EntradaTextoAdapter extends EntradaTexto{

    //Configuración especial de locación, hereda de EntradaTexto
    public EntradaTextoAdapter(int x, int y, double alto, double ancho, Ventana padre) {
        super(x, y, alto, ancho, padre);
    }

    @Override
    public void validar(KeyEvent e) {
        
    }
    
}
