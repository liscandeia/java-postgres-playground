package com.example; //do java pra tras não conta só coloca o caminho do diretorio com ponto

public class AppCond {
    public static void main(String[] args) {
       var cliente1 = new Cliente();
       var cliente2 = new Cliente();
        cliente1.setAnoNa(1980);
        cliente2.setAnoNa(2000);
        // clean code: sempre o if trás a ideia de igual, de verdadeiro
       if (cliente1.getAnoNa() == cliente2.getAnoNa()){
        System.out.println("Eles têm a mesma idade");
        System.out.println("Ambos nasceram no ano " + cliente1.getAnoNa());
       }
       else {System.out.println("Eles não tem a mesma idade");
            if (cliente1.getAnoNa()>cliente2.getAnoNa()) {
                System.out.println("o cliente 1 é mais velho");
            }
            else if(cliente1.getAnoNa()<cliente2.getAnoNa()){
                System.out.println("O cliente 2 é mais velho");
            }
       }
    }
}
