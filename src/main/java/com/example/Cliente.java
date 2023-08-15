package com.example;

public class Cliente {
    private double renda;
    private char sexo;
    private int anoNa;
    private boolean especial;
    private String nome;
    private String cpf;

    public Cliente(){
        System.out.println("construtor sem parâmetro");
        double sorte = Math.random();
        if (sorte >= 0.5)
            especial = true;
        else
            especial = false;
    }


 public Cliente (int renda, char sexo, int anoNa, String nome, String cpf){
        this(); //para usar o outro método construtor
        System.out.println("com parâmetro");
        this.renda = renda;
        this.sexo = sexo;
        this.anoNa = anoNa;
        this.nome = nome;
    }

    public boolean isEspecial() {
        return especial;
    }

    public void setEspecial(boolean especial) {
        this.especial = especial;
    }

    public double getRenda() {
        return renda;
    }
    public void setRenda(double renda) {
        if (renda >= 0 )
            this.renda = renda;
        else 
            System.out.println("A renda tem que ser maior ou igual a 0");
    }
    public char getSexo() {
        return sexo;
    }
    public void setSexo(char sexo) {

            if (sexo == 'f' || sexo == 'm'|| sexo == 'F' || sexo == 'M')
                this.sexo = sexo;
            else 
            System.out.println("Sexo inválido");
    }
    public int getAnoNa() {
        return anoNa;
    }
    public void setAnoNa(int anoNa) {
        this.anoNa = anoNa;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    
   public String getCpf() {
        return cpf;
    }
   public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}