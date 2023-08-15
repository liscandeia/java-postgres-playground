package com.example;

public class AppMatriz {
    public static void main(String[] args) {
        int mat[][] = new int[3][4];
        
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
              mat[i][j] = (i* mat[i].length+(j+1))*100; 
              //System.out.println(mat[i][j] + " "); print só com espaçamento simples
              System.out.printf("%6d ", mat[i][j] ); // print com tamanho definido
              //System.out.printf("%6.1f ", mat[i][j] ); print para números com casas decimais 
            }
         System.out.println();
        }
     
    }
}
