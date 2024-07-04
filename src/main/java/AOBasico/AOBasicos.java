/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AOBasico;

/**
 *
 * @author sebas
 */
public class AOBasicos {

//Ordenación por método shell
    public static void intercambiar(double[] a, int i, int j) {

        double aux = a[i];
        a[i] = a[j];
        a[j] = aux;
    }

    public static void ordenacionShell(double a[]) {
        int intervalo, i, j, k;
        int n = a.length;
        intervalo = n / 2;
        while (intervalo > 0) {
            for (i = intervalo; i < n; i++) {
                j = i - intervalo;
                while (j >= 0) {
                    k = j + intervalo;
                    if (a[j] <= a[k]) {
                        j = -1;
                    } else {
                        intercambiar(a, j, j + 1);
                        j -= intervalo;
                    }
                }
            }
            intervalo = intervalo / 2;
        }
    }

    public static void main(String[] args) {
        double[] a = {24, 12, 18, 6, 32, 14, 20, 8, 22, 26, 10, 36, 28, 30, 4};
        System.out.println("La lista inicial es: ");
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
        ordenacionShell(a);
        System.out.println("La lista ordenada resultante es: ");
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }

    }
}
