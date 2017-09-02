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
 */
public class ComboAdapter extends Combo{

    //Configuración de contenido y locación del Combo, hereda de Combo
    public ComboAdapter(int x, int y, String[] string, Ventana padre) {
        super(x, y, string, padre);
    }

    @Override
    public void action() {
        
    }
    
}
