package taller1;

import java.util.Scanner;

public class Taller1 {
    public static void main(String[] args) {
        Scanner entry = new Scanner(System.in);
        int edad;
        float nota1, nota2, promedio;
        double auxilio = 0;
        String nombre;
        int nEstudiantes;
        boolean continuar = true;

        int contadorEstudiantes = 1;
        while (continuar) {
            System.out.println("Ingrese los datos del estudiante " + contadorEstudiantes + ":");
            System.out.println("Ingresa el nombre:");
            nombre = entry.next();
            System.out.println("Ingresa la edad:");
            edad = entry.nextInt();
            System.out.println("Ingresa la primera nota:");
            nota1 = entry.nextFloat();
            System.out.println("ingresa la segunda nota:");
            nota2 = entry.nextFloat();

            promedio = (nota1 + nota2) / 2;

            System.out.println(edad + " " + nombre.toUpperCase());
            System.out.println("El promedio de " + nombre + " es: " + promedio);

            if (promedio > 4.5) {
                auxilio = edad * 5000;
            } else {
                if (promedio >= 3.8 && promedio <= 4.5) {
                    auxilio = edad * 2000;
                } else {
                    auxilio = 0;
                }
            }

            System.out.println("El auxilio es: " + auxilio);

            System.out.println("Desea continuar? S/N");
            String SN = entry.next().toUpperCase();

            if (SN.equalsIgnoreCase("N")) {
                continuar = false;
            }
            contadorEstudiantes++;
        }

    }
}
