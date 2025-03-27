/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Semana1Actividad1Ejercicio1;

/**
 *
 * @author JOSEPH
 */
public class CirculoTest {
    
    
    public static void main(String[] args) {
        
        Circulo c1 = new Circulo();
        
        System.out.println("El radio del circulo es: "+ c1.getRadio());
        System.out.println("El area del circulo es: "+c1.getArea());
        
        
        Circulo c2 = new Circulo(6.55);
        
        System.out.println("El radio del circulo es: "+ c2.getRadio());
        System.out.println("El area del circulo es: "+c2.getArea());
        
        
        
        /* El paso en comun para hallar ambos resultados es que los metodos son los mismo, lo que lo hace mas 
           sencillo de hallar ambos resultados, con la diferencia que un objeto su atributo radio es el que esta 
           por defecto en la clase Circulo, y el otro fue modificado para obtener el otro resultado.
        
        */
        
        
        
        
        /*
        
        // este error ocurre porque el radio es un atributo privado, y solo se puede acerder a el con los getters y setters
        System.out.println(c1.radio);
        
        // aqui es el mismo caso, para modificar el valor de un atributo se usa el metodo setRadio, ya que radio es un 
           atributo privado  
        c1.radio=42.0; 

        */
        
        Circulo c3 = new Circulo(5.2);
        
        System.out.println("Este es el nuevo valor del radio: "+c3.getRadio());
        
    }
    
}
