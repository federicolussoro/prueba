/**
 * Clase BASE de atleta
 */
public class ATLETA {
    private String nombre;
    private int categoria;

    /**
     *
     * @param nombre Nombre del atleta
     * @param categoria Tipo de categoría
     */
    public ATLETA(String nombre, int categoria) {
        this.nombre = nombre;
        this.categoria = categoria;
    }

    /**
     * Función correr
     */
    public void correr(){
        System.out.println("Corriendo...");
    }

    /**
     * Función muestra datos.
     */
    public void VerDatos(){
        System.out.println("Nombre: " + nombre);
        System.out.println("Categoría: " + categoria);
    }
}