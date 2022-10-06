package org.example.presentacio;

import org.example.domini.Pelicula;
import org.example.negoci.CatalegPelicules;
import org.example.negoci.ICatalegPelicules;

import java.util.*;

public class Projecte1 {
    private final ICatalegPelicules catalegPelicules = new CatalegPelicules();

    public void menu() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introdueix el numero que vols que faci el programa :");
        System.out.println("1. Llistar pelicules");
        System.out.println("2. Afegir pelicula");
        System.out.println("3. Iniciar Cataleg Pelicules");
        System.out.println("4. Cercar pelicula");
        switch (sc.nextInt()) {
            case 1:
                System.out.println("Has elegit llistar pelicules");
                catalegPelicules.llistarPelicules();
                break;
            case 2:
                System.out.println("Has elegit afegir pelicula");
                catalegPelicules.afegirPelicula(indicarPelicula());
                break;
            case 3:
                System.out.println("Has elegit iniciar Cataleg Pelicules");
                catalegPelicules.iniciarCataleg();
                break;
            case 4:
                System.out.println("Has elegit cercar pelicula ");
                catalegPelicules.cercarPelicula(indicarTitol());
                break;

            default:
                System.out.println("Has elegit una opcio incorrecta");
                break;
        }
    }
    public Pelicula indicarPelicula(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Introdueix el titol de la pelicula");
        String titol = sc.nextLine();
        System.out.println("Introdueix el director de la pelicula");
        String director = sc.nextLine();
        System.out.println("Introdueix el genero de la pelicula");
        String genero = sc.nextLine();
        System.out.println("Introdueix el any de la pelicula");
        int any = sc.nextInt();
        System.out.println("Introdueix la duracio de la pelicula");
        int duracio = sc.nextInt();
        return new Pelicula(titol, director, any, genero, duracio);
    }

    public String indicarTitol(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Introdueix el titol de la pelicula");
        return sc.nextLine();
    }

}
