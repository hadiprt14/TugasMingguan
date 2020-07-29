/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan10;

import javax.swing.JOptionPane;

/**
 *
 * @author LENOVO 330
 */
public class ArrayMultiDimensi {

    public static void main(String[] args) {

        int matriksA[][] = {{7, 9, 5},
        {1, 5, 0},
        {4, 1, 2}};
        int matriksB[][] = {{5, 7, 3},
        {0, 4, 6},
        {3, 4, 5}};

        System.out.println("Matriks A");
        for (int h = 0; h < matriksA.length; h++) {
            for (int a = 0; a < matriksA[h].length; a++) {
                System.out.println(matriksA[h][a] + " ");
            }
            System.out.println();
        }
        System.out.println("");
        System.out.println("Matriks B");
        for (int d = 0; d < matriksA.length; d++) {
            for (int i = 0; i < matriksA[0].length; i++) {
                System.out.println(matriksA[d][i] + " ");
            }
            System.out.println();
        }
        int matriksC[][] = new int[matriksA.length][matriksA[0].length];
        System.out.println();
        System.out.println("Hasil Pengurangan");
        System.out.println();
        for (int j = 0; j < matriksC.length; j++) {
            for (int y = 0; y < matriksC[0].length; y++) {
                matriksC[j][y] = matriksA[j][y] - matriksB[j][y];
                System.out.print(matriksC[j][y] + "\t");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("Hasil penjumlahan");
        System.out.println();
        for (int j = 0; j < matriksC.length; j++) {
            for (int y = 0; y < matriksC[0].length; y++) {
                matriksC[j][y] = matriksA[j][y] + matriksB[j][y];
                System.out.print(matriksC[j][y] + "\t");
            }
            System.out.println();

        }
        System.out.println();
        System.out.println("Hasil perkalian");
        System.out.println();
        for (int j = 0; j < matriksC.length; j++) {
            for (int y = 0; y < matriksC[0].length; y++) {
                matriksC[j][y] = matriksA[j][y] * matriksB[j][y];
                System.out.print(matriksC[j][y] + "\t");
            }
            System.out.println();
        }
    }
}
