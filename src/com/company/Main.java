package com.company;

public class Main {


    public static void main(String[] args) {



        int precio= 200;

        double valorIva= calculoIva(precio);
        System.out.println(valorIva);
    }
    static double calculoIva(int precio){
        double iva=5.77;
        return ((iva * precio)/100)+precio;
    }
}

