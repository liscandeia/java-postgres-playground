package com.example;

import java.util.Arrays;

public class Ex {

public static void main (String[] args)
  {
    System.out.println("Hello, word");
    int idade = 23;
    var peso = 51.3;
    String nome = "Lis";
    char sexo = 'F';
    var pcd = false;

    System.out.println("A idade da " + nome + " é " + idade + " , peso é " + peso + " e o sexo é " + sexo );
    
    System.out.println(" necessidades? " + pcd );
  // pra atribuir um vetor só se eles tiverem o mesmo tipo != dos tipos primitivos 
    int array[] = {1,2,3,4,5};
    //arrays.tostrig é para ler como vetor
    System.out.println(Arrays.toString(array));
    //concatenando com strings para mostrar o valor de um espaço no vetor se não tiver ele soma os valores  
    System.out.println("O valor 1 é " + array[1] + " valor 4 é "+array[4]);

  //criando apenas o tamanho do vetor pra depois popular
  int tam[] = new int[5];
  tam[0] = 10;
  tam[1] = 20;
  tam[2] = 300;
  tam[3] = 45;
  tam[4] = 58;
  System.out.println(Arrays.toString(tam));

  int matriz[][] = {{10,11,12}, {13,14,15}};

  //System.out.println(Arrays.toString(matriz)); não lê por ser mais de um vetor então:
  System.out.println(Arrays.toString(matriz[0]));
  System.out.println(Arrays.toString(matriz[1]));
  //para alterar valores primero col = qual dos vetores?, segundo col = qual dos itens? :
  matriz[0][2] = 1;
  System.out.println(Arrays.toString(matriz[0]));
  // para alterar todo o vetor utilizamos o new então podemos mudar o tamanho:
  matriz[1] = new int[]{15,20,3,9,58,35,41};
  System.out.println(Arrays.toString(matriz[1]));

}

}
