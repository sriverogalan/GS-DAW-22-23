package org.example.texte;

public class Texte {
    public static void menuBaseDeDades() {
        System.out.println("Elige una opcion:");
        System.out.println("1. MySQL");
        System.out.println("2. PostgreSQL");
    }

    public static void menuOpcions() {
        System.out.println("Introdueix el numero que vols que faci el programa :");
        System.out.println("1. Llistat de pelicules");
        System.out.println("2. Crear pelicula");
        System.out.println("3. Cercar pelicula per id");
        System.out.println("4. Canvis a una pelicula");
        System.out.println("5. Borrar una pelicula");
        System.out.println("6. Reiniciar el cataleg");
        System.out.println("7. Sortir");
    }

    public static void separtacio() {
        System.out.println();
        System.out.println("--------------------------------------------------");
        System.out.println();
    }
}