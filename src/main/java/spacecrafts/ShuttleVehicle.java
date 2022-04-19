package spacecrafts;

import abstractclasses.Spacecraft;
import main.SpacecraftCreation;

/**
 * Representa un vehículo lanzadera que carece destino, tripulación o pasajeros
 */

public class ShuttleVehicle extends Spacecraft {

    /**
     * Crea una instancia de la clase ShuttleVehicle
     *
     * @param name           Nombre de un vehículo lanzadera
     * @param nationality    Nacionalidad de un vehículo lanzadera
     * @param launchingDate  Fecha del primer lanzamiento de un vehículo lanzadera
     * @param endServiceDate Fecha del último lanzamiento de un vehículo lanzadera
     */

    public ShuttleVehicle(String name, String nationality, int launchingDate, int endServiceDate) {
        super(name, nationality, launchingDate, endServiceDate);
        this.setManned(false);
    }

    /**
     * Representa el proceso de lanzamiento de una nave espacial
     */
    @Override
    public void launch() {

        System.out.println("Successful launch");
        newShip();

    }

    /**
     * Representa el proceso de abortar el lanzamiento de una nave espacial
     */
    @Override
    public void abort() {

        System.out.println("Launch aborted");
        new SpacecraftCreation().start();

    }
}



