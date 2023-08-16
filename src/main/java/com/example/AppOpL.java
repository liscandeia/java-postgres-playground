package com.example;

public class AppOpL {
    //teste para execut ou e e:
    
    boolean a (boolean valor){
        System.out.println("a");
        return valor;
    }
    boolean b (boolean valor){
        System.out.println("b");
        return valor;
    }
    boolean c (boolean valor){
        System.out.println("c");
        return valor;
    }

    AppOpL(){
        System.out.println(a(false) || b(true) && c(true));
    }//construtor sempre com o mesmo nome da classe

    public static void main(String[] args) {
        new AppOpL(); //sempre colocar o new no construtor
     //System.out.println(a(true) && b(false) && c(true)); não pode aqui pq não é estatico então faremos um metodo construtor
    }
    
}
