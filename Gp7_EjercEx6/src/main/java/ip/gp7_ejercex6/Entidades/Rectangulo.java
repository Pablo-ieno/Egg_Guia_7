/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ip.gp7_ejercex6.Entidades;

import java.util.Scanner;

/**
 *
 * @author iptal
 */
/*Crea una clase "Rectángulo" que tenga atributos "lado1" y "lado2" y un método "calcular_area" 
que calcule y devuelva el área del rectángulo. Luego crea un objeto "rectangulo1" de la clase "Rectángulo" 
con lados de 4 y 6 y imprime el área del rectángulo.*/


public class Rectangulo {
    Scanner leer = new Scanner(System.in);
    private int lado1;
    private int lado2;

    public Rectangulo() {
    }

    public Rectangulo(int lado1, int lado2) {
        this.lado1 = lado1;
        this.lado2 = lado2;
    }
    
    
//    public void crearRectangulo(){
//        System.out.println("Ingrese el valor del lado 1:");
//        lado1=leer.nextInt();
//        System.out.println("Ingrese el valor del lado 2");
//        lado2=leer.nextInt();
//        
//        int area = lado1*lado2;
//        System.out.println("El area del Rectángulo es: "+area);
         
        public void crearRectangulo(int lado1, int lado2){
            int area=lado1*lado2;
            System.out.println("El area del Rectángulo es: "+area);
        
        
    }
    
    
    
    
}
