/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Semana1Actividad1Ejercicio2;

/**
 *
 * @author JOSEPH
 */
public class Triangulo extends FiguraGeometrica{
    
    private Punto punto1;
    private Punto punto2;
    private Punto punto3;


    public Triangulo() {
        this.punto1 = new Punto();
        this.punto2 = new Punto();
        this.punto3 = new Punto();
    }


    public Triangulo(Punto punto1, Punto punto2, Punto punto3) {
        this.punto1 = punto1;
        this.punto2 = punto2;
        this.punto3 = punto3;
    }


    public Punto getPunto1() {
        return punto1;
    }

    public void setPunto1(Punto punto1) {
        this.punto1 = punto1;
    }

    public Punto getPunto2() {
        return punto2;
    }

    public void setPunto2(Punto punto2) {
        this.punto2 = punto2;
    }

    public Punto getPunto3() {
        return punto3;
    }

    public void setPunto3(Punto punto3) {
        this.punto3 = punto3;
    }


    @Override
    public String toString() {
        return "Triangulo: " + getNombre() + " tiene 3 puntos: " + punto1.toString() + ", " + punto2.toString() + ", " + punto3.toString();
    }


    @Override
    public double calcularArea() {

        double a = punto1.calcularDistancia(punto2);
        double b = punto2.calcularDistancia(punto3);
        double c = punto3.calcularDistancia(punto1);
        double s = (a + b + c) / 2; // para el semi perimetro
        return Math.sqrt(s * (s - a) * (s - b) * (s - c)); 
    }

    // si es equilatero es regular, sino no no es regular
    @Override
    public boolean esRegular() {
        double a = punto1.calcularDistancia(punto2);
        double b = punto2.calcularDistancia(punto3);
        double c = punto3.calcularDistancia(punto1);
        return a == b && b == c; 
    }

    
    @Override
    public String getNombre() {
        return "Triangulo";
    }


}
