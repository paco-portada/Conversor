package com.example.conversor;

/**
 * Created by paco on 28/09/17.
 */

public class Conversion {

    private double cambio;

    public Conversion () {
        this.cambio = 0.8420;
    }

    public Conversion (Double c) {
        this.cambio = c;
    }

    public String convertirADolares(String cantidad) throws NumberFormatException{
        double valor = Double.parseDouble(cantidad) / cambio;
        return Double.toString(valor);
        //return String.valueOf(valor);
    }

    public String convertirAEuros(String cantidad) throws NumberFormatException{
        double valor = Double.parseDouble(cantidad) * cambio;
        return String.format("%.2f", valor);
    }
}
