/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semana8.practica;

import java.util.Calendar;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author 20162
 */
public class PanelReloj  extends JPanel{
    public PanelReloj(){
        String tiempoActual =  getTiempo();
        JLabel tiempo =  new JLabel("Fecha: ");
        JLabel actual = new JLabel(tiempoActual);
        add(tiempo);
        add(actual);
    }
    String getTiempo(){
        String tiempo;
        //obtener fecha y hora actual
        Calendar ahora =  Calendar.getInstance();
        int hora  =  ahora.get(Calendar.HOUR_OF_DAY);
        int minuto =  ahora.get(Calendar.MINUTE);
        int mes = ahora.get(Calendar.MONTH);
        int dia = ahora.get(Calendar.DAY_OF_MONTH);
        int year =  ahora.get(Calendar.YEAR);
        String nombremes="";
        switch(mes){
            case 1:
                nombremes = "enero";
                break;
            case 2:
                nombremes =  "febrero";
                break;
            case 3:
                nombremes = "marzo";
                break;
            case 4:
                nombremes= "abril";
                break;
                
            case 5:
                nombremes = "mayo";
                break;
            case 6:
                nombremes =  "junio";
                break;
            case 7: 
                nombremes= "julio";
                break;
            case 8:
                nombremes= "agosto";
                break;
                
            case 9:
                nombremes = "setiembre";
                break;
            case 10:
                nombremes = "octubre";
                break;
            case 11:
                nombremes = "noviembre";
                break;
            case 12:
                nombremes = "diciembre";
                break;
        }
        tiempo = dia+" de "+ nombremes+ " de "+ year +". "+ " hora: "+ hora+ ": "+ minuto;
        return tiempo;
    }
}
