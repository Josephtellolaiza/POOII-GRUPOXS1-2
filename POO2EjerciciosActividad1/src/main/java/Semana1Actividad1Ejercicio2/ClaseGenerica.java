/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Semana1Actividad1Ejercicio2;

import java.util.*;



/**
 *
 * @author JOSEPH
 */
public class ClaseGenerica {

    public static void main(String[] args) {
        
        Punto p1 = new Punto(0, 0);
        Punto p2 = new Punto(3, 0);
        Punto p3 = new Punto(0, 4);
        
        
        Punto p4 = new Punto(0, 0);
        Punto p5 = new Punto(5, 0);
        Punto p6 = new Punto(0, 7);

        Triangulo triangulo = new Triangulo(p1, p2, p3);
        
        Triangulo triangulo2 = new Triangulo(p4, p5, p6);

        
        SuperficiePlana superficie = new SuperficiePlana();
        
        ArrayList<Triangulo> triangulos = new ArrayList<>();
        triangulos.add(triangulo);
        triangulos.add(triangulo2);

        for (Triangulo t : triangulos) {
            double area = superficie.CalcularAreaFigura(t);
            System.out.println("Area del triangulo: " + area);

            boolean esRegular = t.esRegular();
            System.out.println("El triangulo es regular? " + esRegular);

            System.out.println(t);
        }
        
    
        
    }
    
}
