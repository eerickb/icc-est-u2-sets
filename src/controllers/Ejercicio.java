package controllers;

import java.util.HashSet;
import java.util.Set;
import java.util.Arrays;

public class Ejercicio {

    public Ejercicio() {
        // -------------------------------
        System.out.println("Ejercicio 1");

        int[] arreglo1 = {1, 2, 3, 4, 5};
        int[] arreglo2 = {1, 2, 3, 4, 5, 4, 3, 2, 45};

        System.out.println("Arreglo 1: " + Arrays.toString(arreglo1));
        System.out.println("¿Tiene duplicados? " + tieneDuplicados(arreglo1));

        System.out.println("Arreglo 2: " + Arrays.toString(arreglo2));
        System.out.println("¿Tiene duplicados? " + tieneDuplicados(arreglo2));

        // -------------------------------
        System.out.println("\nEjercicio 2");

        String palabra1 = "murciélago";
        String palabra2 = "camaleón";

        System.out.println("Palabra 1: " + palabra1);
        System.out.println("¿Es isograma? " + esIsograma(palabra1));

        System.out.println("Palabra 2: " + palabra2);
        System.out.println("¿Es isograma? " + esIsograma(palabra2));

        // -------------------------------
        System.out.println("\nEjercicio 3");

        String textoLargo = """
            La inteligencia artificial (IA) está transformando el mundo a una velocidad sin precedentes. Desde asistentes virtuales que responden preguntas hasta vehículos autónomos que recorren las ciudades, la IA está presente en casi todos los aspectos de nuestra vida diaria. Sin embargo, este avance también plantea desafíos éticos, sociales y económicos que deben ser cuidadosamente analizados. ¿Estamos preparados para delegar decisiones importantes a sistemas que no poseen conciencia ni empatía?
            Por otro lado, la IA puede ser una herramienta poderosa en sectores como la salud, la educación y el medio ambiente. Con algoritmos bien entrenados, es posible detectar enfermedades de forma temprana, personalizar la enseñanza o monitorear los ecosistemas en tiempo real. No obstante, es fundamental garantizar que su implementación sea inclusiva, justa y transparente.
            En resumen, el desarrollo responsable de la inteligencia artificial no solo debe centrarse en la innovación, sino también en el impacto que genera en la humanidad y en el planeta. El futuro no está escrito, pero lo que decidamos hoy tendrá consecuencias duraderas.
            """;

        int totalUnicas = contarPalabrasUnicas(textoLargo);
        System.out.println("El texto tiene " + totalUnicas + " palabras únicas");

        // -------------------------------
        System.out.println("\nEjercicio 4");

        String texto1 = "¡Hola! La programación en Java es muy divertida, sobre todo cuando se entienden los conceptos.";
        String texto2 = "Java es divertido. Aprender programación puede ser un reto, pero también muy gratificante.";

        compararTextos(texto1, texto2);
    }

    // -------------------- MÉTODOS --------------------

    public boolean tieneDuplicados(int[] numeros) {
        Set<Integer> set = new HashSet<>();
        for (int num : numeros) {
            if (!set.add(num)) {
                return true;
            }
        }
        return false;
    }

    public boolean esIsograma(String palabra) {
        Set<Character> letras = new HashSet<>();
        palabra = palabra.toLowerCase();
        for (char c : palabra.toCharArray()) {
            if (letras.contains(c)) {
                return false;
            }
            letras.add(c);
        }
        return true;
    }

    public int contarPalabrasUnicas(String frase) {
        frase = frase.toLowerCase().replaceAll("[^a-záéíóúüñ\\s]", "");
        String[] palabras = frase.split("\\s+");

        Set<String> palabrasUnicas = new HashSet<>();
        for (String palabra : palabras) {
            if (!palabra.isBlank()) {
                palabrasUnicas.add(palabra);
            }
        }
        return palabrasUnicas.size();
    }

    public void compararTextos(String texto1, String texto2) {
        Set<String> palabras1 = obtenerPalabras(texto1);
        Set<String> palabras2 = obtenerPalabras(texto2);

        Set<String> comunes = new HashSet<>(palabras1);
        comunes.retainAll(palabras2);

        Set<String> soloEn1 = new HashSet<>(palabras1);
        soloEn1.removeAll(palabras2);

        Set<String> soloEn2 = new HashSet<>(palabras2);
        soloEn2.removeAll(palabras1);

        int total1 = palabras1.size();
        int total2 = palabras2.size();
        int totalComunes = comunes.size();

        double porcentaje = ((double) totalComunes * 100.0) / (total1 + total2);

        System.out.println("Texto 1: " + total1 + " palabras únicas");
        System.out.println("Texto 2: " + total2 + " palabras únicas");
        System.out.println("Cuantas Palabras comunes: " + totalComunes);
        System.out.printf("Coincidencia léxica: %.2f%%\n", porcentaje);
        System.out.println("Solo en texto 1: " + soloEn1);
        System.out.println("Solo en texto 2: " + soloEn2);
    }

    private Set<String> obtenerPalabras(String texto) {
        texto = texto.toLowerCase().replaceAll("[^a-záéíóúüñ\\s]", "");
        String[] palabras = texto.split("\\s+");

        Set<String> resultado = new HashSet<>();
        for (String palabra : palabras) {
            if (!palabra.isBlank()) {
                resultado.add(palabra);
            }
        }
        return resultado;
    }
}