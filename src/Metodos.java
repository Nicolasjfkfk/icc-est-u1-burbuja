public class Metodos {

    public Metodos() {
        System.out.println("Se inició la clase Metodos *Se creó la clase Metodos *Este mensaje viene del constructor Metodos");
    }

    public int[] sortByBubble(int[] arreglo) {
        int tamanio = arreglo.length;

        for (int i = 0; i < tamanio; i++) {
            for (int j = i + 1; j < tamanio; j++) {
                if (arreglo[i] > arreglo[j]) {
                    int aux = arreglo[i];
                    arreglo[i] = arreglo[j];
                    arreglo[j] = aux;
                }
            }
        }
        return arreglo;
    }

    public void printArreglo(int[] arreglo) {
        System.out.println("Arreglo en orden ascendente:");
        for (int elemento : arreglo) {
            System.out.print(elemento + " ");
        }
        System.out.println();
    }

    public int[] sortByBubbleDe(int[] arreglo) {
        int tamanio = arreglo.length;

        for (int i = 0; i < tamanio; i++) {
            for (int j = i + 1; j < tamanio; j++) {
                if (arreglo[i] < arreglo[j]) {
                    int aux = arreglo[i];
                    arreglo[i] = arreglo[j];
                    arreglo[j] = aux;
                }
            }
        }
        return arreglo;
    }

    public void printArregloDe(int[] arreglo) {
        System.out.println("Arreglo en orden descendente:");
        for (int elemento : arreglo) {
            System.out.print(elemento + " ");
        }
        System.out.println();
    }

    public String[] sortByBubblePalabras(String[] palabras) {
        int tamanio = palabras.length;

        for (int i = 0; i < tamanio; i++) {
            for (int j = i + 1; j < tamanio; j++) {
                if (palabras[i].compareToIgnoreCase(palabras[j]) > 0) {
                    String aux = palabras[i];
                    palabras[i] = palabras[j];
                    palabras[j] = aux;
                }
            }
        }
        return palabras;
    }

    public void printArregloPalabras(String[] arreglo) {
        System.out.println("Arreglo de palabras ordenado alfabéticamente:");
        for (String elemento : arreglo) {
            System.out.print(elemento + " ");
        }
        System.out.println();
    }
}
