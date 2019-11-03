package com.example.combustivel;

public class Combustivel {
    public double kmAlcool;
    public double kmGasolina;
    public double valorAlcool;
    public double valorGasolina;
    public double km;

    public double getKm() {
        return km;
    }

    public void setKm(double km) {
        this.km = km;
    }

    public void setKm(String km) {
        double n1 = Double.valueOf(km);
        this.km = n1;
    }

    public Combustivel() {
        this.kmAlcool = kmAlcool;
        this.kmGasolina = kmGasolina;
        this.valorAlcool = valorAlcool;
        this.valorGasolina = valorGasolina;
    }

    public double getkmAlcool() {
        return kmAlcool;
    }

    public void setkmAlcool(double kmAlcool) {
        this.kmAlcool = kmAlcool;
    }

    public void setkmAlcool(String kmAlcool) {
        double n1 = Double.valueOf(kmAlcool);
        this.kmAlcool = n1;
    }


    public double getKmGasolina() {
        return kmGasolina;
    }

    public void setKmGasolina(double kmGasolina) {
        this.kmGasolina = kmGasolina;
    }

    public void setKmGasolina(String kmGasolina) {
        double n2 = Double.valueOf(kmGasolina);
        this.kmGasolina = n2;
    }

    public double getvalorAlcool() {
        return valorAlcool;
    }

    public void setvalorAlcool(double valorAlcool) {
        this.valorAlcool = valorAlcool;
    }

    public void setvalorAlcool(String valorAlcool) {
        double n3 = Double.valueOf(valorAlcool);
        this.valorAlcool = n3;
    }

    public double getvalorGasolina() {
        return valorGasolina;
    }

    public void setvalorGasolina(double valorGasolina) {
        this.valorGasolina = valorGasolina;
    }

    public void setvalorGasolina(String valorGasolina) {
        double n3 = Double.valueOf(valorGasolina);
        this.valorGasolina = n3;
    }

    public String melhor() {
        if (((kmAlcool * km) / valorAlcool) < ((kmGasolina * km) / valorGasolina)) {
            return "vai de gasolina";
        } else {
            return "vai de alcool";
        }
    }
}
