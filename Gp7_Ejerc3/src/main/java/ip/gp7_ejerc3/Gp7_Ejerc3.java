/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package ip.gp7_ejerc3;

import Entidades.Operacion;

/**
 *
 * @author iptal
 */
public class Gp7_Ejerc3 {

    public static void main(String[] args) {

        Operacion op1 = new Operacion();

        op1.crearOperacion();
        System.out.println("El resultado de la suma es: " + op1.sumar());
        System.out.println("El resultado de la resta es: " + op1.restar());
        System.out.println("El resultado de la multiplicación es: " + op1.multiplicar());
        System.out.println("El resultado de la división es: " + op1.dividir());

    }
}
