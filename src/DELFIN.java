/**
 * Subclase delfín de Animal, con implementación de nadador.
 */
public class DELFIN extends ANIMAL implements NADADOR{
    /**
     *
     * @param especie Nombrel animal
     * @param grupo Grupo del animal
     */
    public DELFIN(String especie, int grupo) {
        super(especie, grupo);
    }

    /**
     * Función nadar, implementacion de nadador.
     */
    public void nadar(){
        System.out.println("Delfín nadando...");
    }
}