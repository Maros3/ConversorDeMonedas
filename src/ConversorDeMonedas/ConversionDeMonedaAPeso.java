package ConversorDeMonedas;

import javax.swing.JOptionPane;

public class ConversionDeMonedaAPeso {

    //Conversión de dólares a pesos mexicanos 
    public void ConversionDolarAPeso(double valor) {
        double monedaDolar = valor * 18.16;
        monedaDolar = (double) Math.round(monedaDolar * 100d)/100;
    JOptionPane.showMessageDialog(null, "Equivale a:  $" + monedaDolar + "Pesos mexicanos");
    }
    
    //Conversión de euros a pesos mexicanos
    public void ConversionEuroAPeso(double valor) {
        double monedaEuro = valor * 19.83;
        monedaEuro = (double) Math.round(monedaEuro * 100d)/100;
    JOptionPane.showMessageDialog(null, "Equivale a:  $" + monedaEuro + "Pesos mexicanos");
    }

    //Conversión de libras esterlinas a pesos mexicanos
    public void ConversionLibraAPeso(double valor) {
        double monedaLibra = valor * 22.57;
        monedaLibra = (double) Math.round(monedaLibra * 100d)/100;
    JOptionPane.showMessageDialog(null, "Equivale a:  $" + monedaLibra + "Pesos mexicanos");
    }

    //Conversión de yenes a pesos mexicanos
    public void ConversionYenAPeso(double valor) {
        double monedaYen = valor * 0.14;
        monedaYen = (double) Math.round(monedaYen * 100d)/100;
    JOptionPane.showMessageDialog(null, "Equivale a:  $" + monedaYen + "Pesos mexicanos");
    }

    //Conversión de wones a pesos mexicanos
    public void ConversionWonAPeso(double valor) {
        double monedaWon = valor * 0.01;
        monedaWon = (double) Math.round(monedaWon * 100d)/100;
    JOptionPane.showMessageDialog(null, "Equivale a:  $" + monedaWon + "Pesos mexicanos");
    }
}
