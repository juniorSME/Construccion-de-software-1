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
interface data{
    
}
class mysql implements data{
    String cadena;
}
class conect extends mysql{
    
}
class rescusql extends  mysql{
    
}
class oracle implements data{
    String cadena;
}
class conectOracle extends mysql{
    
}
class rescuqlOracle extends  mysql{
    
}
class save {
    public save (){
        data con = new conect();
        data re= new rescusql();
    }
}
public class ejercicio5 {
    
}
