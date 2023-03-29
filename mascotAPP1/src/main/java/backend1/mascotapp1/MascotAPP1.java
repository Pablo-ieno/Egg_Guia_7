/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package backend1.mascotapp1;

import backend1.mascotapp1.Entidades.Mascota;
import java.util.Scanner;

/**
 *
 * @author iptal
 */
public class MascotAPP1 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        Mascota m1 = new Mascota("Fernando Chiquito", leer.next(), "Perro");

        
        System.out.println(m1.apodo+" "+m1.edad+" años "+m1.tipo+" "+m1.color);
        

    }
}
