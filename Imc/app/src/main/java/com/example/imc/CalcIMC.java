package com.example.imc;

public class CalcIMC {
    private double altura;
    private double peso;

    public CalcIMC() {
        this.altura = altura;
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void setAltura(String altura) {
        double a = Double.valueOf(altura);
        this.altura = a;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setPeso(String peso) {
        double p = Double.valueOf(peso);
        this.peso = p;
    }

    private double imc(){
        return peso / (altura*altura);
    }

    public String seuIMC(){
        if (imc()< 17){
            return "Muito abaixo do peso";
        }
        else if (imc() < 18.5) {
            return "Abaixo do peso";
        }
        else if (imc() < 25) {
            return "Peso normal";
        }
        else if (imc() < 30) {
            return "Acima do peso";
        }
        else if (imc() < 35) {
            return "Obesidade I";
        }
        else if (imc() < 40) {
            return "Obesidade II (severa)";
        }
        else {
            return "Obesidade III (mórbida)";
        }
    }
}
