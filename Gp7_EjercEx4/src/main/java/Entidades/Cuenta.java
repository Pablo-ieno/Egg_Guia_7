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
public class Cuenta {

    public double saldo;
    public String titular;

    public Cuenta() {
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public void retirarDinero() {
        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese nombre del titular de la cuenta: ");
        titular = leer.next();
        System.out.println("Cual es el saldo de su cuenta: ");
        saldo = leer.nextDouble();
        System.out.println("Cuánto desea retirar?: ");
        double retiro = leer.nextDouble();
        do {
            if (retiro > saldo) {
                System.out.println("Saldo insuficiente, ingrese otro monto:");
                retiro=leer.nextDouble();

            } else {
                System.out.println("Está retirando " + retiro + " pesos, le quedan " + (saldo - retiro));
                break;
            }
        } while (retiro < saldo);
        {

        }

    }
}
