package br.com.s2it.core;

import br.com.s2it.entity.Matrix;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Matrix matrix = new Matrix();
        Scanner s = new Scanner(System.in);
        System.out.println("Infome o tamanho da matriz: ");
        int tamanho = s.nextInt();

        int[][] mtrx = new int[tamanho][tamanho];
        matrix.diffDiagonal(mtrx,tamanho);


    }
}
