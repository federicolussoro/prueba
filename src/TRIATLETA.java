/**
 * Sub clase TRIATLETA de ATLETA, con implementaciones de nadador y ciclista
 */
public class TRIATLETA extends ATLETA implements NADADOR, CICLISTA{
    /**
     *
     * @param nombre Nombre del atleta
     * @param categoria Categoria del atleta
     */
    public TRIATLETA(String nombre, int categoria) {
        super(nombre, categoria);
    }

    /**
     * Funcion nadar (implementación de nadador)
     */
    public void nadar (){
        System.out.println("Triatleta nadando...");
    }

    /**
     * Funcion andar (implementacion de ciclista)
     */
    public void andar(){
        System.out.println("Triatleta andando...");
    }
}
