/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabajoencargadoInterfazGraficaCodigo;

/**
 *
 * @author 20162
 */
public class jugador {
    private String id;
    private String nombre;
    private String nacionalidad;
    private String sexo;

    public jugador(String id, String nombre, String nacionalidad, String sexo) {
        this.id = id;
        this.nombre = nombre;
        this.nacionalidad = nacionalidad;
        this.sexo = sexo;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    
    String DatosDelJugador(){
        return  this.id+"\t "+this.nombre+"\t"+this.nacionalidad+"\t\t"+this.sexo+"\n";
                
    }
}
