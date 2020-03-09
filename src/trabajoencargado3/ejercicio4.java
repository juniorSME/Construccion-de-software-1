/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabajoencargado3;

/**
 *
 * @author 20162
 */
class WUR {
    String texto = null;
    String palabras[] = null;
    public WUR(String texto) {
        this.texto = texto;
        this.palabras = texto.split(" ");
    }
    public String getTexto() {
        return texto;
    }
    public void setTexto(String texto) {
        this.texto = texto;
    }
    public void conteoglobal() {
        //asi  se divide una cadena de texto en palabras
        String palabras[] = this.texto.split(" ");
        String palabrasB[] = this.texto.split(" ");
        int cantidad = palabras.length;
        String resultado = "";
        for (int i = 0; i < cantidad; i++) {
            int contador = 0;
            resultado += palabras[i];
            String palabra = palabras[i];
            for (int j = 0; j < cantidad; j++) {
                if (palabra.equalsIgnoreCase(palabrasB[j])) {
                    contador++;
                    palabras[j] = "";
                } 
            }
            if (contador > 0) {
                resultado += ": " + contador + "\n";
            }
        }
        System.out.print(resultado);
    }

    public int contar_palabrasRepetidas(String palabra) {
        int contador = 0;
        for (int i = 0; i < this.palabras.length; i++) {
            //Este método compara esta Cadena con otra Cadena, ignorando las consideraciones de caso. 
            //Dos cadenas se consideran mayúsculas y minúsculas, si son de la misma longitud, 
            //y los caracteres correspondientes en las dos cadenas son iguales a mayúsculas y minúsculas.
            if (this.palabras[i].equalsIgnoreCase(palabra)) {
                contador++;
            }
        }
        return contador;
    }
}

public class ejercicio4 {
    public static void main(String[] args) {
        WUR w = new WUR("El fracaso no es una opción. Todo el mundo tiene que triunfar");
        w.conteoglobal();
        System.out.println(w.contar_palabrasRepetidas("es"));
    }
}

