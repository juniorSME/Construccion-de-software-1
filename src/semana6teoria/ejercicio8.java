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
class miPropioError extends Exception{
    public miPropioError(String text){
        super(text);
    }
}

public class ejercicio8 {
    public static void main(String[] args) {
        try {
            miPropioError er =  new miPropioError("error de semantica");
            throw er;
        } catch (Exception ed) {
            ed.getStackTrace();
        }
    }
}
