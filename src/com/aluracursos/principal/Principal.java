package com.aluracursos.principal;

import com.aluracursos.api.Conversor;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        Conversor conversor = new Conversor();

        String menu = """
                ------------------------------------------------------
                Bienvenido/a al Conversor de Moneda
                
                Elija una opción:
                1. Peso Chileno a Dolar USD
                2. Dolar USD a Peso Chileno
                3. Peso Argentino a Dolar USD
                4. Dolar USD a Peso Argentino
                5. Peso Colombiano a Dolar USD
                6. Dolar a Peso Colombiano
                7. Salir
                
                ------------------------------------------------------
                """;
        int opcion = 0;
        try{
            while(opcion != 7){
                System.out.println(menu);
                opcion = Integer.valueOf(lectura.nextLine());
                double valor = 0;
                double total = 0;
                switch(opcion){
                    case 1:
                        System.out.println("Ingrese el valor que desea convertir: ");
                        valor = Double.valueOf(lectura.nextLine());
                        total = conversor.convertir(valor,"CLP","USD").conversion_result();
                        System.out.println("El valor "+valor+" [CLP] corresponde al valor final de "+total+" [USD]\n");
                        break;
                    case 2:
                        System.out.println("Ingrese el valor que desea convertir: ");
                        valor = Double.valueOf(lectura.nextLine());
                        total = conversor.convertir(valor,"USD","CLP").conversion_result();
                        System.out.println("El valor "+valor+" [USD] corresponde al valor final de "+total+" [CLP]\n");
                        break;
                    case 3:
                        System.out.println("Ingrese el valor que desea convertir: ");
                        valor = Double.valueOf(lectura.nextLine());
                        total = conversor.convertir(valor,"ARS","USD").conversion_result();
                        System.out.println("El valor "+valor+" [ARS] corresponde al valor final de "+total+" [USD]\n");
                        break;
                    case 4:
                        System.out.println("Ingrese el valor que desea convertir: ");
                        valor = Double.valueOf(lectura.nextLine());
                        total=conversor.convertir(valor,"USD","ARS").conversion_result();
                        System.out.println("El valor "+valor+" [USD] corresponde al valor final de "+total+" [ARS]\n");
                        break;
                    case 5:
                        System.out.println("Ingrese el valor que desea convertir: ");
                        valor = Double.valueOf(lectura.nextLine());
                        total=conversor.convertir(valor,"COP","USD").conversion_result();
                        System.out.println("El valor "+valor+" [COP] corresponde al valor final de "+total+" [USD]\n");
                        break;
                    case 6:
                        System.out.println("Ingrese el valor que desea convertir: ");
                        valor = Double.valueOf(lectura.nextLine());
                        total=conversor.convertir(valor,"USD","COP").conversion_result();
                        System.out.println("El valor "+valor+" [USD] corresponde al valor final de "+total+" [COP]\n");
                        break;
                    case 7:
                        System.out.println("Gracias por usar nuestro servicio de conversión de monedas!!!");
                        break;
                    default:
                        System.out.println("Opción inválida, intentelo nuevamente...");
                }
            }
        } catch (NumberFormatException e) {
            System.out.println("Error, ingresar solo números");
            System.out.println("Finalizando el conversor");
        }
    }
}
