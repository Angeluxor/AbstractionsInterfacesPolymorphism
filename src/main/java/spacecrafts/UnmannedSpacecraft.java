package spacecrafts;

import abstractclasses.Spacecraft;
import main.SpacecraftCreation;

import java.util.Scanner;

/**
 * Representa una nave espacial no tripulada que solo tiene destino
 */

public class UnmannedSpacecraft extends Spacecraft {

    /**
     * Crea una instancia de la clase UnmannedSpacecraft
     *
     * @param name           Nombre de una nave espacial no tripulada
     * @param nationality    Nacionalidad de una nave espacial no tripulada
     * @param launchingDate  Fecha del primer lanzamiento de una nave espacial no tripulada
     * @param endServiceDate Fecha del último lanzamiento de una nave espacial no tripulada
     */

    public UnmannedSpacecraft(String name, String nationality, int launchingDate, int endServiceDate) {
        super(name, nationality, launchingDate, endServiceDate);
        this.setManned(false);
    }


    /**
     * Representa el proceso de lanzamiento de una nave espacial y solicita la información requerida para ello
     */
    @Override
    public void launch() {
        Scanner newLaunching = new Scanner(System.in);
        System.out.println("Enter the ship's destination");
        this.setDestination(newLaunching.nextLine());
        System.out.println("Successful launch");
        new SpacecraftCreation().start();

    }

    /**
     * Representa el proceso de abortar el lanzamiento de una nave espacial y reinicia los valores asignados durante el lanzamiento
     */
    @Override
    public void abort() {

        this.setDestination(null);

        System.out.println("Launch aborted. \n" + "Reset values ");
        newShip();

    }
}
