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

class empres {
    int a, b;
    empleado em;
    public empres (empleado e){
        this.em=e;
    }
}
class empleado {
    int a,b;
    
}
public class agregacion {
    public static void main(String[] args) {
        empres emp = new empres(new empleado ());
    }
}
