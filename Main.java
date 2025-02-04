import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    Calculadora calculadora = new Calculadora();

    System.out.println("Calculadora");
    System.out.println("-----------");
    System.out.println("1. Suma");
    System.out.println("2. Resta");
    System.out.println("3. Multiplicación");
    System.out.println("4. División");
    System.out.println("5. Módulo ");
    System.out.println("6. Salir");

    int opcion;
    do {
      System.out.print("Ingrese la opción: ");
      opcion = scanner.nextInt();

      switch (opcion) {
        case 1:
          System.out.print("Ingrese el primer número: ");
          double num1 = scanner.nextDouble();
          System.out.print("Ingrese el segundo número: ");
          double num2 = scanner.nextDouble();
          System.out.println("Resultado: " + calculadora.suma(num1, num2));
          break;
        case 2:
          System.out.print("Ingrese el primer número: ");
          num1 = scanner.nextDouble();
          System.out.print("Ingrese el segundo número: ");
          num2 = scanner.nextDouble();
          System.out.println("Resultado: " + calculadora.resta(num1, num2));
          break;
        case 3:
          System.out.print("Ingrese el primer número: ");
          num1 = scanner.nextDouble();
          System.out.print("Ingrese el segundo número: ");
          num2 = scanner.nextDouble();
          System.out.println("Resultado: " + calculadora.multiplicacion(num1, num2));
          break;
        case 4:
          System.out.print("Ingrese el primer número: ");
          num1 = scanner.nextDouble();
          System.out.print("Ingrese el segundo número: ");
          num2 = scanner.nextDouble();
          try {
            System.out.println("Resultado: " + calculadora.division(num1, num2));
          } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
          }
          break;

        case 5:
          System.out.print("Ingrese el primer numero: ");
          num1 = scanner.nextDouble();
          System.out.print("Ingrese el segundo numero: ");
          num2 = scanner.nextDouble();
            try{
          System.out.println("Resultado : "+ calculadora.modulo(num1,num2));
         } catch  (ArithmeticException e) { System.out.println(e.getMessage ());}
         break;
        
        case 6:
          System.out.println("Ya es todo adiós");
          break;
        default:
          System.out.println("Opción inválida");
      }
    } while (opcion != 6);
    scanner.close ();
  }

}
