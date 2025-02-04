

public class Calculadora {
  public double suma(double num1, double num2) {
    return num1 + num2;
  }

  public double resta(double num1, double num2) {
    return num1 - num2;
  }

  public double multiplicacion(double num1, double num2) {
    return num1 * num2;
  }

  public double division(double num1, double num2) {
    if (num2 != 0) {
      return num1 / num2;
    } else {
      throw new ArithmeticException("No se puede dividir por cero");
    }
  }

  public double modulo(double num1, double num2) {
   if (num2 !=0 ){
      return num1 % num2;
   } else {
     throw new ArithmeticException("No se puede calcular modulo por cero");
   }
  }
  
} 
