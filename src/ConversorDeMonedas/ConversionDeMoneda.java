package ConversorDeMonedas;

import javax.swing.JOptionPane;

public class ConversionDeMoneda {

    //Conversión de pesos mexicanos a dólares
    public void ConversionPesoADolar (double valor){
        double monedaDolar = valor / 18.16;
        monedaDolar = (double) Math.round(monedaDolar * 100d)/100;
    JOptionPane.showMessageDialog(null, "Equivale a:  $ " + monedaDolar + "Dólares");
    }

    //Conversión de pesos mexicanos a euros
    public void ConversionPesoAEuro (double valor){
        double monedaEuro = valor / 19.82;
        monedaEuro = (double) Math.round(monedaEuro * 100d)/100;
    JOptionPane.showMessageDialog(null, "Equivale a:  $ " + monedaEuro + "Euros");
    }

    //Conversión de pesos mexicanos a libras esterlinas
    public void ConversionPesoALibra (double valor){
        double monedaLibra = valor / 22.57;
        monedaLibra = (double) Math.round(monedaLibra * 100d)/100;
    JOptionPane.showMessageDialog(null, "Equivale a:  $ " + monedaLibra + "Libras");
    }

    //Conversión de pesos mexicanos a yenes
    public void ConversionPesoAYen (double valor){
        double monedaYen = valor / 0.14;
        monedaYen = (double) Math.round(monedaYen * 100d)/100;
    JOptionPane.showMessageDialog(null, "Equivale a:  $ " + monedaYen + "Yenes");
    }

    //Conversión de pesos mexicanos a wones
    public void ConversionPesoAWon (double valor){
        double monedaWon = valor / .01;
        monedaWon = (double) Math.round(monedaWon * 100d)/100;
    JOptionPane.showMessageDialog(null, "Equivale a:  $ " + monedaWon + "Wones");
    }

}