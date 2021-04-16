import java.util.ArrayList;
import java.util.Scanner;
/**
 * @author Federico N. Lussoro
 * Funcion principal (MAIN)
 */
public class PRUEBADEPORTES {
    public static void main(String[] args) {
        ArrayList<ATLETA> ListAtletas = new ArrayList<>();
        ArrayList<NADADOR> ListaNadadores = new ArrayList<>();
        Scanner leer = new Scanner(System.in);
        String especie, nombre;
        int categoria, grupo, i;
        char tipo;

        System.out.println("---ATLETAS---");
        for (i = 0; i < 3; i++){
            System.out.print("Ingrese el nombre: ");
            nombre = leer.next();
            System.out.print("Ingrese categoría: ");
            categoria = leer.nextInt();
            ATLETA atleta = new ATLETA(nombre, categoria);
            ListAtletas.add(atleta);
        }
        System.out.println("---NADADORES---");
        for (i = 0; i < 3; i++){
            System.out.print("Ingrese (D)elfín o (T)riatleta: ");
            tipo = leer.next().charAt(0);
            if (tipo == 'D'){
                System.out.print("Ingrese el nombre de la especie: ");
                especie = leer.next();
                System.out.print("Ingrese grupo: ");
                grupo = leer.nextInt();
                DELFIN delfin = new DELFIN (especie, grupo);
                ListaNadadores.add(delfin);
            }
            else{
                System.out.print("Ingrese el nombre: ");
                nombre = leer.next();
                System.out.println("Ingrese la categoría: ");
                categoria = leer.nextInt();
                TRIATLETA triatleta = new TRIATLETA(nombre, categoria);
                ListaNadadores.add(triatleta);
            }
        }
        System.out.println();
        System.out.println();
        System.out.println("-----Datos de atletas-----");
        for (i = 0; i < 3; i++)
            ListAtletas.get(i).VerDatos();
        System.out.println();
        System.out.println();
        System.out.println("-----Datos de nadadores-----");
        for (i = 0; i < 3; i++)
            ListaNadadores.get(i).nadar();
    }
}
