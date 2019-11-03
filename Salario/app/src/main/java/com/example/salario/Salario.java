package com.example.salario;

public class Salario {
    public double valor ;
    public   int horasGasta ;
    public int horas;

    public Salario() {
        this.valor = valor;
        this.horasGasta = horasGasta;
        this.horas = horas;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public void setValor(String valor) {
        double a = Double.valueOf(valor);
        this.valor = a;
    }

    public int getHorasGasta() {
        return horasGasta;
    }

    public void setHorasGasta(int horasGasta) {
        this.horasGasta = horasGasta;
    }

    public void setHorasGasta(String valor) {
        int a1 = Integer.valueOf(valor);
        this.horasGasta = a1;
    }

    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }

    public void setHoras(String valor) {
        int a2 = Integer.valueOf(valor);
        this.horas = a2;
    }


   public String valorporHora(){
       return String.format("%.2f",((valor/(horas*30))*horasGasta)/60);
   }
}
