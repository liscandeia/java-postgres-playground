package com.example;

import java.time.LocalDate;


public class Cidadao {
    private LocalDate dataNas;

    public LocalDate getDataNas() {
        return dataNas;
    }

    public void setDataNas(LocalDate dataNas) {
        this.dataNas = dataNas;
    }

    public int idade(){
        return LocalDate.now().getYear() - dataNas.getYear();   
    }

    public String eleitor(){
        int idade = idade();
        //Se retornamos valores dentro do if não precisamos escrever o else
        if (idade<= 15)
            return "Não eleitor";
        if (idade >= 16 && idade <= 17 || idade >= 70)
            return "Eleitor facultativo";
        return "Eleitor obrigatório!";
    }
}
