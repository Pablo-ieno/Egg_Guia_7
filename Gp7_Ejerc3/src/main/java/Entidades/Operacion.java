/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

import java.util.Scanner;

/**
 *
 * @author iptal
 */
/*Crear una clase llamada Operacion que tenga como atributos privados numero1 y numero2. 
A continuación, se deben crear los siguientes métodos:
a)Método constructor con todos los atributos pasados por parámetro.
b)Método constructor sin los atributos pasados por parámetro.
c)Métodos get y set.
d)Método para crearOperacion(): que le pide al usuario los dos números y los guarda en los atributos del objeto.
e)Método sumar(): calcular la suma de los números y devolver el resultado al main.
Método restar(): calcular la resta de los números y devolver el resultado al main
Método multiplicar(): primero valida que no se haga una multiplicación por cero, si fuera a multiplicar por cero,
el método devuelve 0 y se le informa al usuario el error. Si no, se hace la multiplicación 
y se devuelve el resultado al main
Método dividir(): primero valida que no se haga una división por cero, si fuera a pasar una división por cero, 
el método devuelve 0 y se le informa al usuario el error se le informa al usuario. Si no, se hace la división 
y se devuelve el resultado al main.
 */
public class Operacion {

    private int num1;
    private int num2;

//    a)Método constructor con todos los atributos pasados por parámetro.
//b)Método constructor sin los atributos pasados por parámetro.
    public Operacion(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    //c)Métodos get y set.
    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    /*d)Método para crearOperacion(): que le pide al usuario los dos números y los guarda 
en los atributos del objeto.*/
    public void crearOperacion() {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el numero 1");
        this.num1 = leer.nextInt();
        System.out.println("Ingrese el numero 2");
        this.num2 = leer.nextInt();

    }

// e)Método sumar(): calcular la suma de los números y devolver el resultado al main.
    public int sumar() {
        int sumar = this.num1 + this.num2;
        return sumar;
    }

// f) Método restar(): calcular la resta de los números y devolver el resultado al main
    public int restar() {
        int restar = this.num1 + this.num2;
        return restar;
    }

    /* g)Método multiplicar(): primero valida que no se haga una multiplicación por cero, 
    si fuera a multiplicar por cero, el método devuelve 0 y se le informa al usuario el error. 
    Si no, se hace la multiplicación  */
    public int multiplicar() {
        int multip = 0;
        if ((this.num1 == 0 || this.num2 == 0)) {
            System.out.println("ERROR: El resultado da cero");
        } else { multip = this.num1*this.num2; }
        return multip;
    }
    
    /* h)Método dividir(): primero valida que no se haga una división por cero, si fuera a pasar 
    una división por cero, el método devuelve 0 y se le informa al usuario el error. 
    Si no, se hace la división y se devuelve el resultado al main.*/
    public double dividir() {
        int divid = 0;
        if ((this.num1 == 0 || this.num2 == 0)) {
            System.out.println("ERROR: El resultado da cero");
        } else { divid = this.num1*this.num2; }
        return divid;
    }
    
    
    

        }
