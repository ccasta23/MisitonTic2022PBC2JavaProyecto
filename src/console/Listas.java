/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package console;

import classes.clsCarro;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

/**
 *
 * @author CARLOS CASTAÑEDA
 */
public class Listas {
    
    public static void main(String[] args) {
        
//        LinkedList<Integer> numeros = new LinkedList<>();
//        
//        numeros.add(10); //Agregar un elemento a la lista
//        numeros.add(15);
//        numeros.add(23);
//        numeros.add(12);
//        numeros.add(29);
//        numeros.add(35);
//        
//        numeros.set(1, 38); //Modificar un elemento de la lista
//        
//        numeros.get(2); //Obtener el elemento del índice 2
//        
//        numeros.remove(4); //Eliminar el elemento en la posición 4
//        
//        for (Integer numero : numeros) {
//            System.out.println("Numero: " + numero);
//        }

        LinkedList<clsCarro> carros = new LinkedList<>();
        
        Scanner in = new Scanner(System.in);
        
        String codigo = in.next();
        
        
        clsCarro carro_usuario = new clsCarro(1,true,1, codigo, "", 4, "123", 25);
        
        carros.add(carro_usuario);
        
        carros.add( new clsCarro(2,true, 2,"001", "Chevrolet", 4, "Azul", 20) );
        carros.add( new clsCarro(3,false, 3,"002", "Mazda", 8, "Verde", 40) );
        carros.add( new clsCarro(4,false, 4,"003", "Hyundai", 4, "Amarillo", 25) );
        
        System.out.println(carros);
        
        //Mayor cantidad de caballos de fuerza
        int caballosFuerzaMayor = 0;
        for (clsCarro carro : carros) { //Recorrer toda la lista, elemento por elemento
            if( carro.getCaballosDeFuerza()>caballosFuerzaMayor ){
                caballosFuerzaMayor = carro.getCaballosDeFuerza();
            }
            System.out.println(carro);
            
            if( carro.getCodigo().equals("002") ){
                carros.remove(carro);
            }
            
        }
        System.out.println("La cantidad mayor de caballos de fuerza es: " + caballosFuerzaMayor);
        System.out.println(carros);
        
    }
    
}
