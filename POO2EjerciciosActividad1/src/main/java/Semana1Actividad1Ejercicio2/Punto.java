/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Semana1Actividad1Ejercicio2;

/**
 *
 * @author JOSEPH
 */
public class Punto {
    private double x;
    private double y;

    public Punto() {
        this.x = 0;
        this.y = 0;
    }

    public Punto(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "El punto tiene las siguientes coordenadas: " + x + "," + y;
    }

    public double calcularDistancia(Punto punto) {
        double dx = punto.getX() - this.x;
        double dy = punto.getY() - this.y;
        return Math.sqrt(dx * dx + dy * dy);
    }

    
    public double calcularDistancia() {
        return this.calcularDistancia(new Punto(0, 0)); // Calcula la distancia al origen (0,0)<<<<<<<<<<<<
    }
    
    
}
