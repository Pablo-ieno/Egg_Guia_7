/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ip.main.Entidades;

import java.util.Scanner;

/**
 *
 * @author iptal
 */
public class Empleado {
    
    public String nombre;
    public int edad;
    public double salario;

    public Empleado() {
    }
    
    public void calcularAumento(){
        
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese su Nombre: ");
        nombre=leer.nextLine();
        System.out.println("Ingrese su edad ");
        edad= leer.nextInt();
        System.out.println("Ingrese su salario actual: ");
        salario=leer.nextDouble();
        
        double aumento;
        
        if (edad>30) {
            aumento=salario*0.1;
            System.out.println(nombre + " su aumento es de $" + aumento + " y el salario total es de: $"+(salario+aumento));
            
            
        }else{
            aumento=salario*0.05;
            System.out.println(nombre + " su aumento es de $" + aumento + " y el salario total es de: $"+(salario+aumento));
        }
     
    }
    
    
}
