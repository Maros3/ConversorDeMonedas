package ConversorDeMonedas;

import javax.swing.JOptionPane;

public class function {
    
    ConversionDeMoneda monedas = new ConversionDeMoneda();
    ConversionDeMonedaAPeso pesos = new ConversionDeMonedaAPeso();

    public void ConversionDeMoneda(double Minput) {
        String opcion = (JOptionPane.showInputDialog(null, 
    			"Elige la moneda a la que deseas convertir tu dinero ", "Monedas", 
    			JOptionPane.PLAIN_MESSAGE, null, new Object[] 
    			{"De Pesos a Dólar", "De Pesos a Euro", "De Pesos a Libras","De Pesos a Yen","De Pesos a Won Coreano",
                "De Dólar a Pesos", "De Euro a Pesos", "De Libras a Pesos","De Yen a Pesos","De Won Coreano a Pesos"}, 
    			"Seleccion")).toString();

        switch(opcion) {
        case "De Pesos a Dólar":
        	monedas.ConversionPesoADolar(Minput);
        	break;
        case "De Pesos a Euro":
        	monedas.ConversionPesoAEuro(Minput);
        	break;
        case "De Pesos a Libras":
        	monedas.ConversionPesoALibra(Minput);
        	break;
        case "De Pesos a Yen":
        	monedas.ConversionPesoAYen(Minput);
        	break;
        case "De Pesos a Won Coreano":
        	monedas.ConversionPesoAWon(Minput);
        	break;    	    	                          
        case "De Dólar a Pesos":
        	pesos.ConversionDolarAPeso(Minput);
        	break;
        case "De Euro a Pesos":
        	pesos.ConversionEuroAPeso(Minput);
        	break;
        case "De Libras a Pesos":
        	pesos.ConversionLibraAPeso(Minput);
        	break;
        case "De Yen a Pesos":
        	pesos.ConversionYenAPeso(Minput);
        	break;
        case "De Won Coreano a Pesos":
            pesos.ConversionWonAPeso(Minput);
            break;
        }      
    }
}
