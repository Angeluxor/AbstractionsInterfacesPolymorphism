package spacecrafts;

import abstractclasses.Spacecraft;

import java.util.Scanner;

/**
 * Representa una nave espacial civil que tiene destino, tripulantes y pasajeros
 */

public class CivilianSpacecraft extends Spacecraft {

    /**
     * Crea una instancia de la clase CivilianSpacecraft
     *
     * @param name           Nombre de una nave espacial civil
     * @param nationality    Nacionalidad de una nave espacial civil
     * @param launchingDate  Fecha del primer lanzamiento de una nave espacial civil
     * @param endServiceDate Fecha del último lanzamiento de una nave espacial civil
     */

    public CivilianSpacecraft(String name, String nationality, int launchingDate, int endServiceDate) {
        super(name, nationality, launchingDate, endServiceDate);
    }

    /**
     * Representa el proceso de lanzamiento de una nave espacial y solicita la información requerida para ello
     */
    @Override
    public void launch() {
        Scanner newLaunching = new Scanner(System.in);
        System.out.println("Enter the ship's destination");
        this.setDestination(newLaunching.nextLine());
        System.out.println("Please enter the number of crew members");
        this.setCrewMembers(Integer.parseInt(newLaunching.nextLine()));
        System.out.println("Please enter the number of passengers");
        this.setPassengers(Integer.parseInt(newLaunching.nextLine()));
        System.out.println("Successful launch");
        newShip();

    }


    /**
     * Representa el proceso de abortar el lanzamiento de una nave espacial y reinicia los valores asignados durante el lanzamiento
     */
    @Override
    public void abort() {

        this.setDestination(null);
        this.setCrewMembers(0);
        this.setPassengers(0);

        System.out.println("Launch aborted. \n" + "Reset values ");

        newShip();

    }


}

