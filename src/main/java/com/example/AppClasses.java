package com.example;

import java.util.Scanner;

public class AppClasses {
    public static void main(String[] args) {
       /* System.out.println("Criando classes");
        Cliente cliente1 = new Cliente();
        cliente1.renda = 10000;
        cliente1.sexo = 'F';
        cliente1.AnoNa = 2000;
        System.out.println("Renda: " + cliente1.renda);
        System.out.println("Sexo: " + cliente1.sexo);
        System.out.println("Ano de nascimento: " + cliente1.AnoNa);*/ //para atributos publicos
        Cliente cliente1 = new Cliente();
        cliente1.setRenda(10000);
        cliente1.setSexo('F');
        cliente1.setAnoNa(2000);
        System.out.println("Ano de nascimento: " + cliente1.getAnoNa()+ " Renda: "+cliente1.getRenda()+" Sexo: "+cliente1.getSexo() + " é especial? " + cliente1.isEspecial());
        Cliente cliente2 = new Cliente(10000,'F',2001,"Lis", "05505100000");
        System.out.println("Ano de nascimento: " + cliente2.getAnoNa()+ " Renda: "+cliente2.getRenda()+" Sexo: "+cliente2.getSexo() + " é especial? " + cliente2.isEspecial());
        
        //testando scanner para implementar

        Scanner scanner = new Scanner(System.in);
        Cliente cliente3 = new Cliente();
        System.out.println("Digite a data de nascimento");
        cliente3.setAnoNa(scanner.nextInt());
        scanner.nextLine();
        System.out.println("Digite seu nome");
        cliente3.setNome(scanner.nextLine());
        scanner.close();
        System.out.println(cliente3.getNome()); 


    }
}
