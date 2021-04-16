/**
 * Clase BASE animal
 */
public class ANIMAL {
    private String especie;
    private int grupo;

    /**
     *
     * @param especie Nombre de la especie
     * @param grupo Grupo del animal
     */
    public ANIMAL(String especie, int grupo) {
        especie = "---";
        grupo = 0;
    }

    public void cargar(String especie, int grupo) {
        this.especie = especie;
        this.grupo = grupo;
    }

    /**
     * Muestra datos.
     */
    public void ver(){
        System.out.println("Especie: " + especie);
        System.out.println("Grupo: " + grupo);
    }
}
