/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semana2Teoria;

/**
 *
 * @author 20162
 */
class  operaciones {
    public double potencia (double a, double b){
        return Math.pow(a, b);
    }
    public double factorial (double x){
        double fact=1;
        for (double i =1; i <=x; i++) {
            fact*=i;
        }
        return fact;
    }
    public double raiz (double y){
        return Math.sqrt(y);
    }
}
public class Testoperaciones {
    public static void main(String[] args) {
        operaciones op =  new operaciones();
        
        
        
        System.out.println(op.factorial(4));
        System.out.println(op.potencia(2, 2));
        System.out.println(op.raiz(64));
    }
}
