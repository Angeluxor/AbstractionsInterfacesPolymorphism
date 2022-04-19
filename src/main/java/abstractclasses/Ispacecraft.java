package abstractclasses;

/**
 * Representa los comportamientos básicos de una nave espacial
 *
 * @author Miguel Angel Molina
 */

public interface Ispacecraft {

    /**
     * Representa el proceso de lanzamiento de una nave espacial
     */
    void launch();

    /**
     * Representa el proceso de abortar el lanzamiento de una nave espacial
     */
    void abort();
}
