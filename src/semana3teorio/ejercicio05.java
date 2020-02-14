/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semana3teorio;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author 20162
 */
class worker {

    private String codigo;
    private String nombre;
    private String arealaboral;
    private double sueldo;
    private int horasextras;
    private String afiliacion;

    public worker() {
        this.codigo = null;
        this.nombre = null;
        this.arealaboral = null;
        this.sueldo = 0.0;
        this.horasextras = 0;
        this.afiliacion = null;
    }

    public worker(String codigo, String nombre, String arealaboral, double sueldo, int horasextras, String afiliacion) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.arealaboral = arealaboral;
        this.sueldo = sueldo;
        this.horasextras = horasextras;
        this.afiliacion = afiliacion;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getArealaboral() {
        return arealaboral;
    }

    public void setArealaboral(String arealaboral) {
        this.arealaboral = arealaboral;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public int getHorasextras() {
        return horasextras;
    }

    public void setHorasextras(int horasextras) {
        this.horasextras = horasextras;
    }

    public String getAfiliacion() {
        return afiliacion;
    }

    public void setAfiliacion(String afiliacion) {
        this.afiliacion = afiliacion;
    }

    double montohoraextra() {
        return (this.sueldo * this.horasextras) / 240;
    }

    double montoSeguro() {
        if (this.afiliacion.equals("AFP")) {
            return this.sueldo * 0.17;
        } else {
            return this.sueldo * 0.05;
        }
    }

    double montoessalud() {
        return this.sueldo * 0.03;
    }

    double montoDescuento() {
        return this.montoSeguro() + this.montoessalud();
    }

    double montoSueldoBruto() {
        return this.sueldo + this.montohoraextra();
    }

    double montoSueldoNeto() {
        return this.montoSueldoBruto() - this.montoDescuento();
    }

    @Override
    public String toString() {
        return "worker{" + "codigo=" + codigo + ", nombre=" + nombre + ", arealaboral=" + arealaboral + ", sueldo=" + sueldo + ", horasextras=" + horasextras + ", afiliacion=" + afiliacion
                + "\n EXTRA: " + this.montohoraextra() + "\n MONTO DE SEGURO: " + this.montoSeguro() + " \n MONTO DESCUENTO ESSALUD: " + this.montoessalud()
                + "\n DESCUENTO: " + this.montoDescuento() + " \n SUELDO BRUTO: " + this.montoSueldoBruto() + " \n SUELDO NETO: " + this.montoSueldoNeto() + "\n";
    }

}

class person implements Iterable<worker> {

    ArrayList<worker> people = new ArrayList<>();

    public person() {
    }

    void add(worker p1) {
        people.add(p1);
    }

    String nameEmpleadoSueldo() {
        String cad = "";
        double sueldotemp = 0.0;
        for (worker peo : people) {
            if (peo.montoSueldoNeto() >= sueldotemp) {
                sueldotemp = peo.montoSueldoNeto();
                cad = peo.getNombre();
            }
        }
//        for (worker peo : people) {
//            if (peo.montoSueldoNeto() == sueldotemp) {
//                cad += peo.getNombre() + " ";
//            }
//        }
        return cad;
    }

    double sueldonetoAreas(String area) {
        double sumaaux = 0.0 ;
        for (worker peo: people) {
            if (peo.getArealaboral()==area) {
                sumaaux+=peo.montoSueldoNeto();
            }
        }
        return sumaaux;
    }

    @Override
    public Iterator<worker> iterator() {
        return people.iterator();
    }

}

public class ejercicio05 {

    public static void main(String[] args) {
        String laboral[] = {"sistemas", "administracion", "marketing"};
        String afi[] = {"AFP", "SPN"};
        worker wor = new worker("1", "jose", laboral[aleatorio(0, 2)], 1200, 5, afi[aleatorio(0, 2)]);
        worker wor1 = new worker("2", "lucho", laboral[aleatorio(0, 2)], 2500, 8, afi[aleatorio(0, 2)]);
        worker wor2 = new worker("3", "Juan", laboral[aleatorio(0, 2)], 3500, 4, afi[aleatorio(0, 2)]);
        worker wor4 = new worker("4", "junior ", laboral[aleatorio(0, 2)], 6500, 6, afi[aleatorio(0, 2)]);

        //-----------------------------------------------
        person per = new person();
        per.add(wor1);
        per.add(wor);
        per.add(wor2);
        per.add(wor4);
        for (worker ob : per) {
            System.out.println("--------------------------");
            System.out.println(ob.toString());
        }
        System.out.println("--------------------------------------------------------");
        System.out.println("1:el empleado  que tiene mayor sueldo neto  es: " + per.nameEmpleadoSueldo());
        System.out.println("2: el sueldo neto de marketing es de: "+ per.sueldonetoAreas("sistemas"));
        
    }

    static int aleatorio(int min, int max) {
        return (int) ((Math.random() * (max - min)) + min);
    }
}
