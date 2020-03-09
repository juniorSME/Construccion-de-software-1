/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semana4Practico;

import java.util.Scanner;

/**
 *
 * @author 20162
 */
class multimedia {

    Scanner sc = new Scanner(System.in);
    private String titulo;
    private String autor;

    public multimedia() {
        this.titulo = "";
        this.autor = "";
    }

    public multimedia(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void llenar() {
        System.out.println("Titulo del disco : ");
        setTitulo(sc.next());
        System.out.println("Autor del disco: ");
        setAutor(sc.next());
    }

    public String toStringd() {
        return "titulo=" + getTitulo() + "\nautor=" + getAutor();
    }

}

public class disco {

    public static void main(String[] args) {
        Scanner sc  =  new Scanner (System.in);
        valores v1 = new valores();
        valores listaMultimedia[] = new valores[2];
//        for (int i = 0; i < listaMultimedia.length; i++) {
//            System.out.println("disco: "+(i+1));
//            v1.llenarv();
//            listaMultimedia[i]=v1;
//            System.out.println("-----------------------------------------------");
//        }
        valores v2 = new valores("juan", "lucho", null, null, 0);
        valores v3 = new valores("ramirez", "pool", null, null, 0);
        for (valores listaMultimedia1 : listaMultimedia) {
            //System.out.println(listaMultimedia1.mostrar());
            System.out.println(v3.mostrar());
            System.out.println("-------------------------------------------------");
        }
    }
}
