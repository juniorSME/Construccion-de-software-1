/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabajoencargado3;

import java.util.ArrayList;

/**
 *
 * @author 20162
 */
class Carta{
    int posicion;
    int num;
    String figura;
    
    public Carta(int posicion,int num,String figura){
        this.posicion=posicion;
        this.num=num;
        this.figura=figura;
    }
}

class Baraja{
    
    ArrayList<Carta>cartas=new ArrayList<>();
    int cont;
 
    void Inicializar(){
        cont=1;
        int contR=1,contT=1,contC=1,contE=1;
        String Rombo="Rombo",Trebol="Trebol",Corazon="Corazon",Espada="Espada";
        for(int i=0;i<52;i++){
            if(i<13){
                cartas.add(new Carta(i, contR, Rombo));
                contR++;
            }else if(i>=13&&i<26){
                cartas.add(new Carta(i, contT, Trebol));
                contT++;
            }else if(i>=26&&i<39){
                cartas.add(new Carta(i, contC, Corazon));
                contC++;
            }else if(i>=39&&i<52){
                cartas.add(new Carta(i, contE, Espada));
                contE++;
            }
        }  
    }
    
    void Barajar(){
        ArrayList<Integer>pos=new ArrayList<>();
        //52 son la cantidad de naipes que tiene una baraja
        while(pos.size()<52){
            int n=aleatorio(1,52);
            boolean encontrado=false;
            for(int i=0;i<pos.size();i++){
                if(pos.get(i)==n){
                    encontrado=true;
                    break;
                }         
            }
            if(!encontrado)
                pos.add(n);
        }
        int cantidad=0;
        for(Integer e: pos){
            cartas.get(cantidad).posicion=e;
            cantidad++;
        }
        Carta temp;
        for(int i=0;i<52;i++){
            if(cartas.indexOf(cartas.get(i))!=pos.get(i)-1){
                temp=cartas.get(i);
                cartas.set(i,cartas.get(pos.get(i)-1));
                cartas.set(pos.get(i)-1,temp);
            }
        }
    }

    int aleatorio(int min,int max){
        return (int)((max-min+1)*Math.random()+min);
    }
    
    void mostrar(){
        for(Carta e: cartas){
            System.out.println(e.num+" de "+e.figura);
        }
    }
    
    void getCarta(){
        System.out.println(cartas.get(cont).num+" de "+cartas.get(cont).figura);
        cont++;
        
    }
}

public class ejercicio9 {
    public static void main(String[] args) {
        Baraja b1=new Baraja();
        b1.Inicializar();
        b1.Barajar();
        b1.getCarta();
        b1.getCarta();
        b1.getCarta();
        b1.getCarta();
        b1.getCarta();
        
    }
}

