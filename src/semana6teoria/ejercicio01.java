package semana6teoria;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 20162
 */
interface Ianimal {
    
}
class animal implements Ianimal {
    void correr (){
        
    }
}
class tortuga implements Ianimal{
    void correr () {
        throw new RuntimeException("la tortuga no puede correr");
    }
}
public class ejercicio01 {
    public static void main(String[] args) {
        Ianimal a =  new animal();
        Ianimal t = new tortuga();
        
    }
}
