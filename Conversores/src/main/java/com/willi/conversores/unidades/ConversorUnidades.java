package com.willi.conversores.unidades;

public class ConversorUnidades {
    
    private double valor1, valor2;
    private String datos1, datos2, simbolo;
    private double unidad1;
    private int unidad2;
    private double conversion;

    public ConversorUnidades() {
    }
    
    public void setDatos1(String datos1) {
        this.datos1 = datos1;
    }

    public void setDatos2(String datos2) {
        this.datos2 = datos2;
    }
    
    public void setvalor1(double valor1) {
        this.valor1 = valor1;
    }


    public int unidad2() {
        
        switch (this.datos2) {
            case "Bit":
                this.unidad2 = 1;
                break;
            case "Byte":
                this.unidad2 = 2;
                break;
            case "Kilobyte":
                this.unidad2 = 3;
                break;
            case "Megabyte":      
                this.unidad2 = 4;
                break;
            case "Gigabyte":
                this.unidad2 = 5;
                break;
            case "Terabyte":
                this.unidad2 = 6;
                break;
            default:
                break;
        }
        return this.unidad2;
    }
    
    public String enviaSimbolo() {
        
        switch (this.datos2) {
            case "Bit":
                simbolo = " Bi ";
                break;
            case "Byte":
                simbolo = " B ";
                break;
            case "Kilobyte":
                simbolo = " KB ";
                break;
            case "Megabyte":      
                simbolo = " MB ";
                break;
            case "Gigabyte":
                simbolo = " GB ";
                break;
            case "Terabyte":
                simbolo = " TB ";
                break;
            default:
                break;
        }
        return simbolo;
    }
    
    public double bit(){
        switch (unidad2()) {
            case 1:
                this.conversion = this.valor1;
                break;
            case 2:
                this.conversion = this.valor1 / 8;
                break;
            case 3:
                this.conversion = this.valor1 / 8000;
                break;
            case 4:
                this.conversion = this.valor1 / 8e+6;
                break;
            case 5:
                this.conversion = this.valor1 / 8.59e+9;
                break;
            case 6:
                this.conversion = this.valor1 / 8e+12;
                break;
            default:
                break;
        }
        return this.conversion;
    }
    
    public double Byte(){
        switch (unidad2()) {
            case 1:
                this.conversion = this.valor1 * 8;
                break;
            case 2:
                this.conversion = this.valor1;
                break;
            case 3:
                this.conversion = this.valor1 / 1000;
                break;
            case 4:
                this.conversion = this.valor1 / 1e+6;
                break;
            case 5:
                this.conversion = this.valor1 / 1e+9;
                break;
            case 6:
                this.conversion = this.valor1 / 1e+12;
                break;
            default:
                break;
        }
        return this.conversion;
    }
  
    public double Kilobyte(){
        switch (unidad2()) {
            case 1:
                this.conversion = this.valor1 * 8000;
                break;
            case 2:
                this.conversion = this.valor1 * 1000;
                break;
            case 3:
                this.conversion = this.valor1;
                break;
            case 4:
                this.conversion = this.valor1 / 1000;
                break;
            case 5:
                this.conversion = this.valor1 / 1e+6;
                break;
            case 6:
                this.conversion = this.valor1 / 1e+9;
                break;
            default:
                break;
        }
        return this.conversion;
    }
    
    public double Megabyte(){
        switch (unidad2()) {
            case 1:
                this.conversion = this.valor1 * 8e+6;
                break;
            case 2:
                this.conversion = this.valor1 * 1e+6;
                break;
            case 3:
                this.conversion = this.valor1 * 1000;
                break;
            case 4:
                this.conversion = this.valor1;
                break;
            case 5:
                this.conversion = this.valor1 / 1000;
                break;
            case 6:
                this.conversion = this.valor1 / 1e+6;
                break;
            default:
                break;
        }
        return this.conversion;
    }
    
    public double Gigabyte(){
        switch (unidad2()) {
            case 1:
                this.conversion = this.valor1 * 8e+9;
                break;
            case 2:
                this.conversion = this.valor1 * 1e+9;
                break;
            case 3:
                this.conversion = this.valor1 * 1e+6;
                break;
            case 4:
                this.conversion = this.valor1 * 1000;
                break;
            case 5:
                this.conversion = this.valor1;
                break;
            case 6:
                this.conversion = this.valor1 / 1000;
                break;
            default:
                break;
        }
        return this.conversion;
    }
    
    public double Terabyte(){
        switch (unidad2()) {
            case 1:
                this.conversion = this.valor1 * 8e+12;
                break;
            case 2:
                this.conversion = this.valor1 * 1e+12;
                break;
            case 3:
                this.conversion = this.valor1 * 1e+9;
                break;
            case 4:
                this.conversion = this.valor1 * 1e+6;
                break;
            case 5:
                this.conversion = this.valor1 * 1000;
                break;
            case 6:
                this.conversion = this.valor1;
                break;
            default:
                break;
        }
        return this.conversion;
    }
    
    public double unidad1() {
        
        switch (this.datos1) {
            case "Bit":
                return bit();

            case "Byte":
                return Byte();

            case "Kilobyte":
                return Kilobyte();

            case "Megabyte":      
                return Megabyte();
                
            case "Gigabyte":
                return Gigabyte();

            case "Terabyte":
                return Terabyte();

            default:
                return 2;
        }
    }
}
