package com.willi.conversores.monedas;

public class ConversorMonedas {
    private String moneda, simbolo;
    private double valor;
    private double unidad;
    private double conversion;

    public ConversorMonedas() {
    }
    
    public void setMoneda(String moneda) {
        this.moneda = moneda;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
    
    public double unidad() {
        
        switch (moneda) {
            case "Dolar":
                unidad = 0.00021;
                break;
            case "Euro":
                unidad = 0.00020;
                break;
            case "Libra Esterlina":
                unidad = 0.00018;
                break;
            case "Yen Japones":      
                unidad = 0.029;
                break;
            case "Won Sur-Coreano":
                unidad = 0.28;
                break;
            default:
                break;
        }
        return unidad;
    }
    
    public String enviaSimbolo() {
        
        switch (moneda) {
            case "Dolar":
                simbolo = "$ ";
                break;
            case "Euro":
                simbolo = "€ ";
                break;
            case "Libra Esterlina":
                simbolo = "£ ";
                break;
            case "Yen Japones":      
                simbolo = "¥ ";
                break;
            case "Won Sur-Coreano":
                simbolo = "W ";
                break;
            default:
                break;
        }
        return simbolo;
    }
  
    public double conversion(){
        conversion = valor * unidad();

        return conversion;
    }
   
}
