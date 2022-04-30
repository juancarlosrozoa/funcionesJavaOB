package com.company;

public class Main {


    public static void main(String[] args) {

        double iva=5.77;
        int precio= 200;

        double valorIva= calculoIva(iva,precio);
        System.out.println(valorIva);
    }
    static double calculoIva(double iva, int precio){
        return ((iva * precio)/100)+precio;
    }
}

