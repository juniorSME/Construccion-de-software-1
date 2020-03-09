/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semana6teoria;

/**
 *
 * @author 20162
 */
interface Irectangulo {
     public int CalcularArea();
}
class rectangulo {
    private int x;
    private int y;
    
    public rectangulo (int a,int b){
        this.x=a;
        this.y=b;
    }
    public int CalcularArea(){
        return  x*y;
    }
}
class cuadrado implements Irectangulo {
    int x;
    public cuadrado (int a){
        this.x=a;
    }

    @Override
    public int CalcularArea() {
        return x*x;
    }
    
}
public class ejercicio02 {
    public static void main(String[] args) {
        
    }
}
