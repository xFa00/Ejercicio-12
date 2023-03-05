/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio12;

import java.util.Scanner;

/**
 *
 * @author ACER
 */
public class Ejercicio12 {

    public static void main(String[] args) {
        double horas,valorH,salarioNeto,salarioBruto,retencion;
        Scanner leerporteclado = new Scanner (System.in);
        
        System.out.println("Digite las horas semanales trabajadas: ");
        horas= leerporteclado.nextDouble();
        
        System.out.println("Digite el valor de su hora: ");
        valorH= leerporteclado.nextDouble();
        
        salarioBruto= horas*valorH;
        retencion = salarioBruto*(12.5/100);
        salarioNeto= salarioBruto-retencion;
        
        System.out.println("Su salario bruto es: "+salarioBruto);
        System.out.println("Su salario neto es: "+salarioNeto);
        System.out.println("La retencion en la fuente es de: "+retencion);
        
    }
}
