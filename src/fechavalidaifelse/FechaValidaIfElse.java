import java.util.Scanner;

public class FechaValidaIfElse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce el día (1-31): ");
        int dia = sc.nextInt();
        
        System.out.print("Introduce el mes (1-12): ");
        int mes = sc.nextInt();

        System.out.print("Introduce el año (1900-2023): ");
        int año = sc.nextInt();

        boolean esAñoBisiesto = ((año % 4 == 0) && (año % 100 != 0)) || (año % 400 == 0);
        int diasEnMes = 31;

        if (mes == 2) {
            if (esAñoBisiesto) {
                diasEnMes = 29;
            } else {
                diasEnMes = 28;
            }
        } else if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {
            diasEnMes = 30;
        }

        if (año >= 1900 && año <= 2023 && dia >= 1 && dia <= diasEnMes && mes >=1 && mes <= 12 ) {
            System.out.println("La fecha introducida es: " + dia + "/" + mes + "/" + año);
        } else {
            System.out.println("La fecha introducida es incorrecta.");
        }
        if (mes >=1 && mes <= 12) {
            System.out.println("La fecha introducida es: " + dia + "/" + mes + "/" + año);
        }
          if (esAñoBisiesto) {
            System.out.println("El año " + año + " es bisiesto.");
        } else {
            System.out.println("El año " + año + " no es bisiesto.");
        }
        sc.close();
    }
}