package AbstractClasses;

import Main.SpacecraftCreation;

import java.util.Scanner;

/**
 * Representa el arquetipo de una nave espacial, sus características básicas y los métodos para asignarlas y obtenerlas
 *
 * @author Miguel Angel Molina
 */

public abstract class Spacecraft implements Ispacecraft {
    /**
     * Nombre de una nave espacial
     */
    private String name;
    /**
     * Estado de tripulación de una nave espacial
     */
    private boolean manned;
    /**
     * Estado de actividad de una nave espacial
     */
    private boolean active;
    /**
     * Nacionalidad de una nave espacial
     */
    private String nationality;
    /**
     * Año del primer lanzamiento de una nave espacial
     */
    private int launchingDate;
    /**
     * Año del último lanzamiento de una nave espacial
     */
    private int endServiceDate;
    /**
     * Destino de una nave espacial
     */
    private String destination;
    /**
     * Número de tripulantes de una nave espacial
     */
    private int crewMembers;
    /**
     * Número de pasajeros de una nave espacial
     */
    private int passengers;

    /**
     * Crea una instancia de la clase Spacecraft.
     *
     * @param name           Nombre de una nave espacial
     * @param nationality    Nacionalidad de una nave espacial
     * @param launchingDate  Año del primer lanzamiento de una nave espacial
     * @param endServiceDate Año del último lanzamiento de una nave espacial. Si es 0 la nave permanece en activo
     */

    public Spacecraft(String name, String nationality, int launchingDate, int endServiceDate) {

        this.name = name;
        this.nationality = nationality;
        this.launchingDate = launchingDate;
        this.endServiceDate = endServiceDate;

        if (this.endServiceDate != 0) {
            this.active = true;
        }
    }

    /**
     * Obtiene el nombre de una nave espacial almacenado en el atributo name
     *
     * @return El nombre de una nave espacial
     */

    public String getName() {
        return name;
    }

    /**
     * Asigna el nombre de una nave espacial almacenado en el atributo name
     *
     * @param name El nombre de una nave espacial
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * Obtiene el estado de tripulación una nave espacial almacenado en el atributo manned
     *
     * @return El estado de tripulación de una nave espacial
     */


    public boolean isManned() {
        return manned;
    }

    /**
     * Asigna el estado de tripulación de una nave espacial almacenado en el atributo manned
     *
     * @param manned El nombre de una nave espacial
     */

    public void setManned(boolean manned) {
        this.manned = manned;
    }

    /**
     * Obtiene el estado de actividad una nave espacial almacenado en el atributo active
     *
     * @return El estado de actividad de una nave espacial
     */


    public boolean isActive() {
        return active;
    }

    /**
     * Asigna el estado de actividad de una nave espacial almacenado en el atributo active
     *
     * @param active El estado de actividad de una nave espacial
     */

    public void setActive(boolean active) {
        this.active = active;
    }

    /**
     * Obtiene la nacionalidad una nave espacial almacenada en el atributo nationality
     *
     * @return La nacionalidad de una nave espacial
     */


    public String getNationality() {
        return nationality;
    }

    /**
     * Asigna la nacionalidad de una nave espacial almacenada en el atributo nationality
     *
     * @param nationality La nacionalidad de una nave espacial
     */

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    /**
     * Obtiene el año del primer lanzamiento de una nave espacial almacenado en el atributo launchingDate
     *
     * @return El año del primer lanzamiento de una nave espacial
     */


    public int getLaunchingDate() {
        return launchingDate;
    }

    /**
     * Asigna el año del primer lanzamiento de una nave espacial almacenado en el atributo launchingDate
     *
     * @param launchingDate El año del primer lanzamiento de una nave espacial
     */

    public void setLaunchingDate(int launchingDate) {
        this.launchingDate = launchingDate;
    }

    /**
     * Obtiene el año del último lanzamiento de una nave espacial almacenado en el atributo endServiceDate
     *
     * @return El año del último lanzamiento de una nave espacial
     */


    public int getEndServiceDate() {
        return endServiceDate;
    }

    /**
     * Asigna el año del último lanzamiento de una nave espacial almacenado en el atributo endServiceDate
     *
     * @param endServiceDate El año del último lanzamiento de una nave espacial
     */

    public void setEndServiceDate(int endServiceDate) {
        this.endServiceDate = endServiceDate;
    }

    /**
     * Obtiene el destino de una nave espacial almacenado en el atributo destination
     *
     * @return El destino de una nave espacial
     */


    public String getDestination() {
        return destination;
    }

    /**
     * Asigna el destino de una nave espacial almacenado en el atributo destination
     *
     * @param destination El destino de una nave espacial
     */

    public void setDestination(String destination) {
        this.destination = destination;
    }

    /**
     * Obtiene el número de tripulantes de una nave espacial almacenado en el atributo crewMembers
     *
     * @return El número de tripulantes de una nave espacial
     */


    public int getCrewMembers() {
        return crewMembers;
    }

    /**
     * Asigna el número de tripulantes de una nave espacial almacenado en el atributo crewMembers
     *
     * @param crewMembers El número de tripulantes de una nave espacial
     */

    public void setCrewMembers(int crewMembers) {
        this.crewMembers = crewMembers;
    }

    /**
     * Obtiene el número de pasajeros de una nave espacial almacenado en el atributo passengers
     *
     * @return El número de pasajeros de una nave espacial
     */


    public int getPassengers() {
        return passengers;
    }

    /**
     * Asigna el número de pasajeros de una nave espacial almacenado en el atributo passengers
     *
     * @param passengers El número de pasajeros de una nave espacial
     */

    public void setPassengers(int passengers) {
        this.passengers = passengers;
    }

    /**
     * Pregunta al usuario sí desea crear una nueva nave espacial después de lanzar o abortar el lanzamiento de la nave anterior, ejecutando de nuevo el método de creación de respuesta afirmativa o cerrando el aplicativo en caso de respuesta negativa
     */

    protected void newShip() {
        System.out.println("\n\nDo you want to create a new ship?\n1. Yes\n2. No");
        Scanner answer = new Scanner(System.in);
        int r = (Integer.parseInt(answer.nextLine()));
        while (r != 1 && r != 2) {
            System.out.println("Invalid option");
            System.out.println("\n\nDo you want to create a new ship?\n1. Yes\n2. No");
            answer = new Scanner(System.in);
            r = (Integer.parseInt(answer.nextLine()));
        }
        if (r == 1) {
            new SpacecraftCreation().start();
        } else {
            System.out.println("Thank you");
            System.exit(0);
        }
    }

    /**
     * Pregunta al usuario si desea lanzar o abortar el lanzamiento de la nave recién creada, ejecutando el método correspondiente a cada caso
     */

    public void launchingQuestion() {
        Scanner answer = new Scanner(System.in);
        System.out.println("Do you want to launch the ship?\n 1.Launch \n 2.Abort");
        int r = (Integer.parseInt(answer.nextLine()));
        while (r != 1 && r != 2) {
            System.out.println("Invalid option");
            answer = new Scanner(System.in);
            System.out.println("Do you want to launch the ship?\n 1.Launch \n 2.Abort");
            r = (Integer.parseInt(answer.nextLine()));
        }
        if (r == 1) {
            this.launch();
        } else {
            this.abort();
        }
    }
}
