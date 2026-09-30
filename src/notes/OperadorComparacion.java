package notes;

public class OperadorComparacion {


    public static void main(String[] args){

        // Comparadors de comparacion <, >, >=, <=, ==, !=, etc.

        int num3 = 500;
        int num4 = 380;
        int num5 = 500;
        String num6 = "dos";
        String num7 = "dos";

        // Los Operadores de comparacion siempre se dan en booleano, se debe guardar siempre en una variable booleana.
        boolean resultado = num3 <= num4;
        System.out.println("Resultado: " + resultado);

        // Operador Igual Igual
        boolean esIgual = num3 == num4;
        System.out.println("Resultado: " + esIgual);

        // Operador Equal: Se usa para compara texto, a la hora de comparar texto no usar IguaIgual
        boolean esEqual = num6.equals(num7);
        System.out.println("Resultado: " + esEqual);



    }
}
