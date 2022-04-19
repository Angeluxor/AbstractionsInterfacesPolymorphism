package main;

import spacecrafts.CivilianSpacecraft;
import spacecrafts.MannedSpacecraft;
import spacecrafts.ShuttleVehicle;
import spacecrafts.UnmannedSpacecraft;

import java.util.Scanner;

/**
 * Crea cada tipo de nave según la información ingresada por el usuario, también permite el acceso a las funciones de estas como lanzar o abortar.
 *
 * @author Miguel Angel Molina agudelo
 */

public class SpacecraftCreation {

    /**
     * Método main, ejecuta el método encargado de la creación de naves
     *
     * @param args n
     */

    public static void main(String[] args) {

        new SpacecraftCreation().start();
    }

    /**
     * Solicita información al usuario a partir de la cual crea una instancia de alguna de las subclases de la clase Spacecraft
     */

    public void start() {

        String name = inputName();
        String nationality = inputNationality();
        int launchingDate = inputLaunchingDate();
        int endServiceDate = inputLastDate();
        int type = inputType();

        switch (type) {
            case 1 -> {
                ShuttleVehicle shuttleVehicle = new ShuttleVehicle(name, nationality, launchingDate, endServiceDate);
                shuttleVehicle.launchingQuestion();
            }
            case 2 -> {
                UnmannedSpacecraft unmannedSpacecraft = new UnmannedSpacecraft(name, nationality, launchingDate, endServiceDate);
                unmannedSpacecraft.launchingQuestion();
            }
            case 3 -> {
                MannedSpacecraft mannedSpacecraft = new MannedSpacecraft(name, nationality, launchingDate, endServiceDate);
                mannedSpacecraft.launchingQuestion();
            }
            case 4 -> {
                CivilianSpacecraft civilianSpacecraft = new CivilianSpacecraft(name, nationality, launchingDate, endServiceDate);
                civilianSpacecraft.launchingQuestion();
            }
            case 5 -> {
                System.out.println("Thank you");
                System.exit(0);
            }
            default -> System.out.println("Invalid option");
        }

    }

    /**
     * Solicita al usuario el nombre de la nave
     *
     * @return el nombre ingresado por el usuario
     */

    public String inputName() {

        String name;
        while (true) {
            try {
                Scanner newSpacecraft = new Scanner(System.in);
                System.out.println("""
                                        
                        \033[0;1mSpacecraft creation
                            
                            
                        Enter the name of the new spacecraft""");
                name = newSpacecraft.nextLine();
                if (!name.isEmpty()) {
                    return name;
                } else {
                    System.out.println("Invalid answer, this field can't be empty");
                }

            } catch (Exception e) {
                System.out.println("Invalid answer");
            }
        }
    }

    /**
     * Solicita al usuario la nacionalidad de la nave
     *
     * @return la nacionalidad ingresada por el usuario
     */


    public String inputNationality() {

        String nationality;
        while (true) {
            try {
                Scanner newNat = new Scanner(System.in);
                System.out.println("Enter the nationality of the ship");
                nationality = newNat.nextLine();
                if (!nationality.isEmpty()) {
                    return nationality;
                } else {
                    System.out.println("Invalid answer, this field can't be empty");
                }
            } catch (Exception e) {
                System.out.println("Invalid answer");
            }
        }


    }

    /**
     * Solicita al usuario el año del primer lanzamiento de la nave
     *
     * @return el año ingresado por el usuario
     */


    public int inputLaunchingDate() {

        int launchingDate;
        while (true) {
            try {
                Scanner newSpacecraft = new Scanner(System.in);
                System.out.println("Enter the year of the first launching");
                launchingDate = (Integer.parseInt(newSpacecraft.nextLine()));
                if (launchingDate > 0) {
                    return launchingDate;
                } else {
                    System.out.println("Invalid answer, the value must be positive");
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid answer, the value must be a number");
            }
        }

    }

    /**
     * Solicita al usuario el año del último lanzamiento de la nave
     *
     * @return el año ingresado por el usuario
     */


    public int inputLastDate() {

        int endServiceDate;
        while (true) {
            try {
                Scanner newSpacecraft = new Scanner(System.in);
                System.out.println("Enter the year of the last launching (type 0 if still active)");
                endServiceDate = (Integer.parseInt(newSpacecraft.nextLine()));
                if (endServiceDate > 0) {
                    return endServiceDate;
                } else {
                    System.out.println("Invalid answer, the value must be positive");
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid answer, the value must be a number");
            }
        }

    }

    /**
     * Solicita al usuario el tipo de la nave
     *
     * @return el tipo ingresado por el usuario
     */

    public int inputType() {

        int type;
        while (true) {
            try {
                Scanner newSpacecraft = new Scanner(System.in);
                System.out.println("Enter the type of spacecraft:\n\n1. Shuttle vehicle\n2. Unmanned spacecraft\n3. Manned spacecraft\n4. Civilian spacecraft\n5.Exit");
                type = (Integer.parseInt(newSpacecraft.nextLine()));
                if (type > 0 && type < 6) {
                    return type;
                } else {
                    System.out.println("Invalid answer");
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid answer, the value must be a number");
            }
        }

    }
}
