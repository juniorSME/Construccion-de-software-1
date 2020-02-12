/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebateatro.Entidades.newpackage;

/**
 *
 * @author cliwfshowardfigueroavaleriano
 */
public class Pruebateatro {
    
     public static void main(String[] args) {
         
         Asistente asis = new Asistente("1","lucho","contreras","lucho@gmail.com","657821","malecon");
         Expositor expo = new Expositor("2","luis","ramirez","luchitoramirez@gmail.com");
         Eventoteatro evento = new Eventoteatro ("Las mil y una noche",5,expo,asis,"1:35","7:20","Alta",'P');
         
         System.out.println("Titulo Evento : "+ evento.getTitulo());
         System.out.println("Duracion de Evento : "+ evento.getDuracionEvento() + "Horas");
         System.out.println("Nombre y Apellido de Expositor : "+ evento.getExpositor().getNombrePersona()+ " "+evento.getExpositor().getApellidoPersona());
         System.out.println("Correo de Expositor : "+ evento.getExpositor().getCorreoPersona());
         System.out.println("DATOS DE ASISTENTE");
         System.out.println("------------------------------------------------------------");
         System.out.println("Nombres y Apellidos de Asistente : "+ evento.getAsistente().getNombrePersona()+ " " + evento.getAsistente().getApellidoPersona());
         System.out.println("Correo del Asistente : "+ evento.getAsistente().getCorreoPersona());
         System.out.println("Telefono del Asistente : "+ evento.getAsistente().getTelefonoAsistente());
         System.out.println("Direccion : "+ evento.getAsistente().getDireccionAsistente());
         System.out.println("==================================================================================== ");  
         System.out.println("Hora de inicio : "+ evento.getHoraIngreso());
         System.out.println("Hora de salida : "+ evento.getHoraSalida());
         System.out.println("Temporada : "+ evento.getTemporadaEvento());
         System.out.println("Ubicacion : "+ evento.getUbicacionEvento());
         evento.costoPorUbicacion();
         System.out.println("Costo : "+ evento.getCostoEntrada());
         System.out.println("Monto a pagar con IGV : " + evento.generarTotalConIGV());
          System.out.println("Monto por temporada : " + evento.descuentoPorTemporada());
    }

  

}
