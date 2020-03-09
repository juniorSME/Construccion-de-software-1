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
interface Ipersistem {

    public void save(Object o);
}

class person {

    private String nombre;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

}

class DataMysql implements Ipersistem {

    @Override
    public void save(Object o) {
        if (o instanceof person) {
            System.out.println("la persona fue registrada!!!!");
        }
    }
}

class ServicePerson {

    private Ipersistem persis;

    public void setPersis(Ipersistem persis) {
        this.persis = persis;
    }

    public void savePerson(person p) {
        persis.save(p);
    }
}

class DataOracle implements Ipersistem {

    @Override
    public void save(Object o) {
        System.out.println("la persona fue registrada!!");
    }
}

public class ejercicio6 {

    public static void main(String[] args) {
        ServicePerson se = new ServicePerson();
        se.setPersis(new DataMysql());
        se.savePerson(new person());

    }
}
