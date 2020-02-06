/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabajoencargado1;

import java.text.DateFormat;
import java.text.DecimalFormat;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author 20162
 */
public class ejercicio31 {
    //Un censador recopila ciertos datos aplicando encuestas para el ultimo Censo Nacional de Población y Vivienda. 
    //Desea obtener de todas las personas que alcance a encuestar en un día, que porcentaje tiene estudios de primaria,
    //secundaria, carrera técnica, estudios profesionales y estudios de posgrado. 
    public static void main(String[] args) {
        Scanner sc  =  new Scanner (System.in);
        Date fecha = new Date ();
        DecimalFormat decimal = new DecimalFormat("###,##%");
        System.out.println("ingrese la cantidad total de personas encuestadas el  dia de hoy "+ fecha);
        int cantidad = sc.nextInt();
        int encuesta;
        float porcentaje1,porcentaje2, porcentaje3, porcentaje4, porcentaje5;
        int contadorprimaria = 0, contadorsecundaria = 0, contadortecnico=0, contadorprofesional=0, contadorpostgrado=0;
        for (int i = 1; i <=cantidad; i++) {
            encuesta = (int)(Math.random()*5+1);
            if (encuesta==1) {
                System.out.println("persona encuestada N°: "+i+ " tiene un grado  de estudio: PRIMARIA");
                contadorprimaria++;
            }else if(encuesta==2){
                System.out.println("persona encuestada N°: "+i+" tiene un grado de estudio: SECUNDARIA");
                contadorsecundaria++;
            }else if (encuesta==3){
                System.out.println("persona encuestada N°: "+i+ " tiene un grado  de estudio: CARRERA TECNICA");
                contadortecnico++;
            }else if(encuesta==4){
                System.out.println("persona encuestada N°:"+ i+ " tiene un grado de estudio: ESTUDIOS PROFESIONALES");
                contadorprofesional++;
            }else{
                System.out.println("persona encuestada N°: "+i+" tiene un grado  de estudio: ESTUDIOS DE POSTGRADO");
                contadorpostgrado++;
            }
        }
        
        System.out.println("el porcentaje de las personas encuestadas  que tienen estudios en PRIMARIA son: "+decimal.format((double)contadorprimaria/(double)cantidad));
        System.out.println("el porcentaje de las personas encuestadas  que tienen estudios en SECUNDARIA son: "+decimal.format((double)contadorsecundaria/(double)cantidad));
        System.out.println("el porcentaje de las personas encuestadas  que tienen estudios en CARRERA TECNICA son: "+decimal.format((double)contadortecnico/(double)cantidad));
        System.out.println("el porcentaje de las personas encuestadas  que tienen estudios PROFESINALES son: "+decimal.format((double)contadorprofesional/(double)cantidad));
        System.out.println("el porcentaje de las personas encuestadas  que tienen estudios en POSTGRADO son: "+decimal.format((double)contadorpostgrado/(double)cantidad));
    }
    
}
