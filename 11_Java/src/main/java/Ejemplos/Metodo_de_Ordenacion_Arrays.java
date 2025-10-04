package Ejemplos;

public class Metodo_de_Ordenacion_Arrays {
    public static void main(String[] args) {
        int[] valores = { 5, 20, 2, 40, 15 }; // Array que queremos ordenar
        int posMin; // Posición donde está el menor elemento del array a 
       // partir de la posición donde estemos.
        int aux; // Variable auxiliar
        // Recorremos el array desde el inicio hasta el final
        for (int i = 0; i < valores.length - 1; i++) {
        // Buscamos el valor más pequeño del array entre el elemento i
        // y el final.
        posMin = i;
        for (int j = i + 1; j < valores.length; j++) {
        if (valores[j] < valores[posMin]) {
        posMin = j;
        }
        }
        // Ahora ya sabemos que el menor elemento en el subarray desde
        // la posición i hasta el final está en la posición posMin. 
       // Por tanto, intercambiamos los valores en i y en posMin.
        aux = valores[i];
        valores[i] = valores[posMin];
        valores[posMin] = aux;
        // Con fines didácticos, mostramos cómo va quedando en cada 
       // pasada del bucle.
        for (int k = 0; k < valores.length; k++) {
        System.out.print(valores[k] + " ");
        }
        System.out.println();
        }
        }
}
