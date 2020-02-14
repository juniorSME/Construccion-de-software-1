/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semana3teorio;

/**
 *
 * @author 20162
 */
interface padre {
    //constantes las variables
    int CAD=14;
    //metodo son abstractos
    //las variables MAYUSCULAS nos da a conocer que es una constante
    void dormir();
    int comer ();
    int comer (int a, float p);
}
abstract class canino {
    abstract void comer ();
}
//se crea clases abstractas para comportarse como una clase padre (super clase)
class perro extends canino {

    @Override
    void comer() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
public class ejemplo01 {
    public static void main(String[] args) {
        
    }
}
