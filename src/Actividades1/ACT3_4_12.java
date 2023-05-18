package Actividades1;

import java.util.Scanner;

public class ACT3_4_12 {
    static Scanner s = new Scanner(System.in);
    public static void main(String[] args){

        double precioConIVA = 0;
        double ivaMas = 0;
        double promMenos = 0;
        double total = 0;

        System.out.print("Introduce la base imponible del producto: ");
        double baseImponible = s.nextDouble();

        System.out.print("Introduce el tipo de IVA (general, reducido o superreducido): ");
        String tipoIVA = s.next();

        System.out.print("Introduce el código promocional (nopro, mitad, menos5, porc5): ");
        String tipoDescuento = s.next();

        switch (tipoIVA){
            case "general":
                ivaMas = baseImponible * 0.21;
                precioConIVA = baseImponible * 1.21;
                break;

            case "reducido":
                ivaMas = baseImponible * 0.10;
                precioConIVA = baseImponible * 1.10;
                break;

            case "superreducido":
                ivaMas = baseImponible * 0.04;
                precioConIVA = baseImponible * 1.04;
                break;
        }

        switch (tipoDescuento){
            case "nopro":
                promMenos = 0;
                total = precioConIVA;
                break;

            case "mitad":
                promMenos = precioConIVA / 2;
                total = precioConIVA - promMenos;
                break;

            case "menos5":
                promMenos = -5;
                total = precioConIVA - promMenos;
                break;

            case "porc5":
                promMenos = precioConIVA * 0.05;
                total = precioConIVA - promMenos;
                break;
        }


        System.out.println("Base imponible            " + (float)baseImponible);
        System.out.println("IVA                       " + (float)ivaMas);
        System.out.println("Precio con IVA            " + (float)precioConIVA);
        System.out.println("Cod. promo.              -" + (float)promMenos);
        System.out.println("TOTAL                     " + (float)total);

    }
}
