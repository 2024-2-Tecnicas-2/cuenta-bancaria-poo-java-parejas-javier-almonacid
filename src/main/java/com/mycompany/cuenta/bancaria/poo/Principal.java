package com.mycompany.cuenta.bancaria.poo;

public class Principal {
    public static void main(String[] args) {
        // TODO: Adiciona aquí el código que deseas para la Cuenta Bancaria.
        CuentaBancaria cuenta = new CuentaBancaria("Juan Melo","506222062", 1850000.0);
        
        System.out.println("Prueba Titular: " + cuenta.getTitular().equals("Juan Melo"));
        
        cuenta.setTitular("Carmen Pulido");
        System.out.println("Prueba Titular: " + cuenta.getTitular().equals("Carmen Pulido"));
        
        System.out.println("Prueba Numero de Cuenta: " + cuenta.getNumeroCuenta().equals("506222062"));
        
        System.out.println("Prueba Saldo: "+ (cuenta.getSaldo() == 1850000.0));
        
        cuenta.ingresar(335000);
        System.out.println("Prueba ingresar: " + (cuenta.getSaldo() == 2185000.0));
        
        cuenta.ingresar(-200000);
        System.out.println("Prueba ingresar: " + (cuenta.getSaldo() == 2185000.0));
        
        cuenta.retirar(300000);
        System.out.println("Prueba retirar: " + (cuenta.getSaldo() == 1885000.0));
        
        cuenta.retirar(2000000);
        System.out.println("Prueba retirar: " + (cuenta.getSaldo() == 1885000.0));
        
        System.out.println("Calcular interes: " + (cuenta.calcularInteres() == 1913275.0));
        
        cuenta.setTipoInteres(5.0);
        System.out.println("Prueba interes: " + (cuenta.calcularInteres() == 1979250.0));
        
        cuenta.setTipoInteres(-2.0);
        System.out.println("Prueba interes: " + (cuenta.calcularInteres() == 1979250.0));
        
        cuenta.setTipoInteres(12.0);
        System.out.println("Prueba interes: " + (cuenta.calcularInteres() == 1979250));
    }
}
