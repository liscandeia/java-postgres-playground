package com.example;

import java.util.ArrayList;
import java.util.List;

public class AppLista {
    public static void main(String[] args) {
        var cliente1 = new Cliente();
        cliente1.setNome("Lis");
        cliente1.setSexo('F');
        var cliente2 = new Cliente();
        cliente2.setNome("Nic");
        cliente2.setSexo('F');
        var cliente3 = new Cliente();
        cliente3.setNome("Leo");
        cliente3.setSexo('M');

        //listas só atribuem clases não atrubui tipos primitivos
        List <Cliente> listaClientes = new ArrayList<Cliente>();//dentro do parenteses vai a qntd de elementos  
        // qnd não sabemos a qntd usamos new LinkedList<// não precisa colocar Cliente>();
        
        listaClientes.add(cliente1);
        listaClientes.add(cliente2);
        listaClientes.add(cliente2);
        listaClientes.add(cliente3);

        //listaClientes.remove(0); //para remover na posição da lista
       //listaClientes.remove(cliente2);// para remover a primeira aparição do elemento
       for (Cliente cliente : listaClientes) {
        System.err.println(cliente);
       }



    }
}
