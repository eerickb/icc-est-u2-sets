import controllers.ContactoControler;
import controllers.Ejercicio;
import controllers.Sets;
import java.util.Set;

public class App {

    public static void main(String[] args) throws Exception {
        /**
        ContactoControler contact = new ContactoControler();
        Sets set = new Sets();
        System.out.println("--Erick Bermeo--");

        // --- Sets ---
        System.out.println("--IMPRIMIMOS USANDO HASHSET--");
        runHashSet(set);

        System.out.println("--IMPRIMIMOS USANDO LINKEDHASHSET--");
        runLinkedHashSet(set);

        System.out.println("--IMPRIMIMOS USANDO TREESET (menor a mayor)--");
        runTreeSet(set);

        System.out.println("--IMPRIMIMOS USANDO TREESET CON COMPARADOR (longitud menor a mayor)--");
        runTreeSetConComparador(set);

        System.out.println("--IMPRIMIMOS USANDO TREESET CON COMPARADOR (longitud mayor a menor)--");
        runTreeSetConComparadorMayor(set);
        public static void runHashSet(Sets sets) {
        Set<String> palabras = sets.construirHashSet();
        for (String palabra : palabras) {
            System.out.println("-" + palabra);
        }
    }

    public static void runLinkedHashSet(Sets sets) {
        Set<String> palabras = sets.construirLinkedHashSet();
        for (String palabra : palabras) {
            System.out.println("-" + palabra);
        }
    }

    public static void runTreeSet(Sets sets) {
        Set<String> palabras = sets.construirTreeSet();
        for (String palabra : palabras) {
            System.out.println("-" + palabra);
        }
    }

    public static void runTreeSetConComparador(Sets sets) {
        Set<String> palabras = sets.construirTreeSetConComparador();
        for (String palabra : palabras) {
            System.out.println("-" + palabra);
        }
    }

    public static void runTreeSetConComparadorMayor(Sets sets) {
        Set<String> palabras = sets.construirTreeSetConComparadorMayor();
        for (String palabra : palabras) {
            System.out.println("-" + palabra);
        }
    }*/
    new Ejercicio();
    }
}