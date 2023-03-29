/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package ip.gp7_ejerc1;

import Entidades.Libro;
import java.util.Scanner;

/**
 *
 * @author iptal
 */
public class Gp7_Ejerc1 {

    public static void main(String[] args) {
        /* Crear una clase llamada Libro que contenga los siguientes atributos: ISBN, Título,
 Autor, Número de páginas, y un constructor con todos los atributos pasados por parámetro 
 y un constructor vacío. Crear un método para cargar un libro pidiendo los datos al usuario 
 y luego informar mediante otro método el número de ISBN, el título, el autor del libro 
 y el número de páginas.*/
 
 
 Libro l1 = new Libro();
 Libro l2 = new Libro();
 
 
        
        System.out.println();
        
        //Llamado del Método para cargar los datos del libro.-
        l1.llenarLibro(ISBN, titulo, autor, numPaginas);
        
        //Llamado del Método para mostrar los datos cargados.-
        l1.mostrarLibro();      
 
         l2.llenarLibro(ISBN, titulo, autor, numPaginas);
        
       
        l2.mostrarLibro();      
 
    }
}
