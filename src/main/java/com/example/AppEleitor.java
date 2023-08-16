package com.example;

import java.time.LocalDate;

public class AppEleitor {
    public static void main(String[] args) {
        var cidadao1 = new Cidadao();
        cidadao1.setDataNas(LocalDate.of(2008,05,01));
        System.out.println("A idade da pessoa é: " + cidadao1.idade() + " e ela é um " + cidadao1.eleitor());
    }
}
