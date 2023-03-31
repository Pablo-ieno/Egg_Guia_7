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
public class Juego {

    /*Crea una clase "Juego" que tenga un método "iniciar_juego" que permita a dos jugadores jugar 
  un juego de adivinanza de números. El primer jugador elige un número y el segundo jugador intenta adivinarlo. 
  El segundo jugador tiene un número limitado de intentos y recibe una pista de "más alto" o "más bajo" después 
  de cada intento. El juego termina cuando el segundo jugador adivina el número o se queda sin intentos. 
  Registra el número de intentos necesarios para adivinar el número y el número de veces que cada jugador ha ganado.*/
    private int numSecreto;

    public int getNumSecreto() {
        return numSecreto;
    }

    public void setNumSecreto(int numSecreto) {
        this.numSecreto = numSecreto;
    }

    public void iniciar_juego() {
        Scanner leer = new Scanner(System.in);
        int juegosGanados = 0;
        for (int i = 0; i < 5; i++) {

            setNumSecreto((int) (Math.random() * 100 + 1));
            System.out.println("Jugador 2 tiene 5 intentos para adivinar el número Secreto: ");
            boolean acierto = false;
            
            int intentos = 0;

            while (!acierto && intentos < 5) {
                System.out.println("Jugador 2 ingrese el número: ");
                int num = leer.nextInt();
                intentos++;

                if (num < getNumSecreto()) {
                    System.out.println("El número Secreto es mas alto");

                } else if (num > getNumSecreto()) {

                    System.out.println("El número Secreto es mas bajo");
                } else {
                    System.out.println("Adivinó el número en: " + intentos);
                    juegosGanados++;
                    acierto=true;

                }
            }
        }
        System.out.println("El juego ha terminado, los juegos ganados son: "+ juegosGanados);
    }
    
}


                
        
       

    


