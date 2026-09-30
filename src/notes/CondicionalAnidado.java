package notes;
import java.util.Scanner;
public class CondicionalAnidado {
    static void main(String[] args) {
        //Condicional Anidado: Else-If

        // Ejercicio de calculo del IMC

        Scanner sc = new Scanner(System.in);

        System.out.printf("Ingrese su peso: ");
        float peso = sc.nextFloat();

        System.out.printf("Ingrese su estatura: ");
        float altura = sc.nextFloat();

        float imc = Math.round(peso / (altura*altura));
        System.out.println("Su IMC es de: " + imc);

        if (imc <= 18.5){
            System.out.printf("Usted tiene bajo peso");
        }else if (imc >18.5 && imc <= 24.9){
            System.out.printf("Usted tiene un peso normal");
        } else if (imc >24.9 && imc <=29.9){
            System.out.printf("Usted tiene sobrepeso");
        } else if (imc >29.9 && imc <=34.9){
            System.out.printf("Usted tiene obesidad tipo 1");
        } else if (imc >34.9 && imc <=39.5){
            System.out.printf("Usted tiene obesidad tipo 2");
        } else if (imc >40){
            System.out.printf("Usted tiene obesidad mordida");
        }else {
            System.out.printf("La informacion ingresada no es valida");
        }


    }
}
