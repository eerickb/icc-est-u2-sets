import java.util.Set;

import controllers.sets;

public class App {
    
    public static void main(String[] args) throws Exception {
        sets set = new sets();
        System.out.println("--Erick Bermeo--");
        System.out.println("--IMPRIMIMOS USANDO HASHSET--");
        runHashSet(set);
        System.out.println("--IMPRIMIMOS USANDO LINKEDHASHSET--");
        runLinkedHashSet(set);
        System.out.println("--IMPRIMIMOS USANDO TREESET(menos a mayor)--");
        runTreeSet(set);
        System.out.println("--IMPRIMIMOS USANDO TREESET EMPLEANDO UN COMPARADOR SEGUN LA LONGUITUD DE LA PALABRA DE MENOR A MAYOR--");
        runTreeSetConComparador(set);
        System.out.println("--IMPRIMIMOS USANDO TREESET EMPLEANDO UN COMPARADOR SEGUN LA LONGUITUD DE LA PALABRA DE MAYOR A MENOR--");
        runTreeSetConComparadorMayor(set);
    }

    public static void runHashSet(sets sets) {
        sets palabrasSet = new sets();
        Set<String> palabras = palabrasSet.construirHashSet();
        for (String palabrasImp : palabras) {
            System.out.println("-" + palabrasImp);
        }
    }
    public static void runLinkedHashSet(sets sets) {
        sets palabrasSet = new sets();
        Set<String> palabras = palabrasSet.construirLinkedHashSet();
        for (String palabrasImp : palabras) {
            System.out.println("-" + palabrasImp);
        }
    }
    public static void runTreeSet(sets sets) {
        sets palabrasSet = new sets();
        Set<String> palabras = palabrasSet.construirTreeSet();
        for (String palabrasImp : palabras) {
            System.out.println("-" + palabrasImp);
        }
    }
    public static void runTreeSetConComparador(sets sets) {
        sets palabrasSet = new sets();
        Set<String> palabras = palabrasSet.construirTreeSetConComparador();
        for (String palabrasImp : palabras) {
            System.out.println("-" + palabrasImp);
        }
    }
    public static void runTreeSetConComparadorMayor(sets sets) {
        sets palabrasSet = new sets();
        Set<String> palabras = palabrasSet.construirTreeSetConComparadorMayor();
        for (String palabrasImp : palabras) {
            System.out.println("-" + palabrasImp);
        }
    }
}