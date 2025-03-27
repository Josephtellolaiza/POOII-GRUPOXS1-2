/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Semana1Actividad1Ejercicio1;

/**
 *
 * @author JOSEPH
 */
public class Circulo {
    private double radio = 12.5;
    private String color = "Azul";

    public Circulo() {
    }
    
    public Circulo(double radio){
        this.radio=radio;
    }
    
    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public String getColor(){
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    
    public double getArea(){
        double area = this.radio * this.radio * Math.PI;
        return area;
    }
    
    /* 
       No se puede ejecutar la clase Circulo, ya que no incluye el metodo main para hacer pruebas, lo que 
       nos da la clase circulo es lo necesario para poder hacer pruebas en otra clase del mismo paquete con el metodo main
       para hacer pruebas creando objetos de esta clase, para ejecutar los metodos en esta clase en base al objeto que 
       creemos
    
    */

    @Override
    public String toString() {
        return "Circulo{" + "radio=" + radio + ", color=" + color + '}';
    }
    
    
}
