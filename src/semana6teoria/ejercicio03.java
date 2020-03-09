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
interface Ipadre {
    abstract void c();
}
abstract class padre implements Ipadre{
    abstract void a();
    abstract  void b();
}
class hija implements Ipadre{
    public void c(){
        System.out.println("Exito!!");
    }
}
public class ejercicio03 {
    
}
