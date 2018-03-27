package br.com.s2it.entity;

import java.util.Random;

public class Matrix {

    public int diffDiagonal(int[][] mtrx, int n) {
        int somaDiagonalEsquerdaParaDireita = 0;
        int somaDiagonalDireitaParaEsquerda = 0;


        int soma = 0;
        int[][] matriz = preencheMatriz(mtrx, n);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n-1; j++) {
                if (j == i) {
                    somaDiagonalEsquerdaParaDireita += (int)matriz[i][j];
                }
            }
        }

        for (int x = n; x > 0; x--) {
            for (int z = n-1; z > 0; z--) {
                if (z == x) {
                    somaDiagonalDireitaParaEsquerda += (int)matriz[x][z];
                }
            }
        }

        soma = ((somaDiagonalEsquerdaParaDireita) - (somaDiagonalDireitaParaEsquerda));
        System.out.println("Total Soma: "+ soma);
        return soma;
    }

    private int[][] preencheMatriz(int[][] mtrx, int tamanho) {
        Random random = new Random();
        for (int i = 0; i < tamanho; i++) {
            for (int j = 0; j < tamanho; j++) {
                mtrx[i][j] = random.nextInt(100 + 1 + 100) - 100;
            }

        }
        return mtrx;
    }
}

