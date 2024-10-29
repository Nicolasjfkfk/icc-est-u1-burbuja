public class App {
    public static void main(String[] args) throws Exception {
        Metodos metodosOrdenamiento = new Metodos();

        int[] arreglo = {5, 7, 30, 12, 9};

        int[] arregloOrdenado = metodosOrdenamiento.sortByBubble(arreglo.clone());
        metodosOrdenamiento.printArreglo(arregloOrdenado);

        int[] arregloOrdenadoDe = metodosOrdenamiento.sortByBubbleDe(arreglo.clone());
        metodosOrdenamiento.printArregloDe(arregloOrdenadoDe);

        String cadena = "este es un ejemplo de texto para Ordenar";
        String[] palabras = cadena.split(" ");
        String[] palabrasOrdenada = metodosOrdenamiento.sortByBubblePalabras(palabras);
        metodosOrdenamiento.printArregloPalabras(palabrasOrdenada);
    }
}